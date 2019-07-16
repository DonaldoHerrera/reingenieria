package com.appboy.services;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import com.appboy.h;

@SuppressLint({"MissingPermission"})
public class AppboyLocationService extends Service {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(AppboyLocationService.class);
    private LocationListener b;
    /* access modifiers changed from: private */
    public LocationManager c;

    private void c(Intent intent) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Removing current location updates: ");
        sb.append(intent.getAction());
        Hg.a(str, sb.toString());
        b();
    }

    private void d(Intent intent) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown intent received: ");
        sb.append(intent.getAction());
        Hg.e(str, sb.toString());
    }

    public static void requestInitialization(Context context) {
        Hg.a(a, "Location permissions were granted. Requesting initialization of location and geofence services.");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".REQUEST_INIT_APPBOY_LOCATION_SERVICE");
        context.sendBroadcast(new Intent(sb.toString()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append(".REQUEST_APPBOY_GEOFENCE_REGISTRATION");
        context.sendBroadcast(new Intent(sb2.toString()));
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        b();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            Hg.c(a, "Null intent received. Initializing Appboy.");
            h.a(getApplicationContext());
            return 1;
        }
        String action = intent.getAction();
        if (action == null) {
            a(intent);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(getPackageName());
            sb.append(".REQUEST_APPBOY_LOCATION_UPDATES");
            if (action.equals(sb.toString())) {
                b(intent);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getPackageName());
                sb2.append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES");
                if (action.contains(sb2.toString())) {
                    c(intent);
                } else {
                    d(intent);
                }
            }
        }
        return 1;
    }

    private void b(Intent intent) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Requesting background location updates: ");
        sb.append(intent.getAction());
        Hg.a(str, sb.toString());
        if (this.c == null) {
            this.c = (LocationManager) getApplicationContext().getSystemService("location");
        }
        if (this.b == null) {
            this.b = c();
        }
        float floatExtra = intent.getFloatExtra("distance", 50.0f);
        long longExtra = intent.getLongExtra("time", 3600000);
        LocationListener locationListener = this.b;
        if (locationListener != null) {
            try {
                this.c.requestLocationUpdates("passive", longExtra, floatExtra, locationListener);
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Collecting locations using passive provider with time interval ");
                sb2.append(longExtra / 1000);
                sb2.append("s and update distance ");
                sb2.append(floatExtra);
                sb2.append("m.");
                Hg.c(str2, sb2.toString());
            } catch (SecurityException e) {
                Hg.d(a, "Could not request background location updates. Security exception from insufficient permissions", e);
            }
        } else {
            Hg.e(a, "Could not request background location updates. Appboy location listener was null.");
        }
    }

    private void a(Intent intent) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Null intent action received in Appboy location service: ");
        sb.append(intent.getDataString());
        Hg.e(str, sb.toString());
    }

    private LocationListener c() {
        return new LocationListener() {
            public void onLocationChanged(Location location) {
                if (location != null) {
                    Hg.a(AppboyLocationService.a, "Requesting single location update.");
                    StringBuilder sb = new StringBuilder();
                    sb.append(AppboyLocationService.this.getApplicationContext().getPackageName());
                    sb.append(".SINGLE_APPBOY_LOCATION_UPDATE");
                    Intent intent = new Intent(sb.toString());
                    intent.putExtra("location", location);
                    intent.putExtra("origin", "Appboy location service");
                    try {
                        AppboyLocationService.this.c.requestSingleUpdate("passive", PendingIntent.getBroadcast(AppboyLocationService.this.getApplicationContext(), 0, intent, 134217728));
                    } catch (SecurityException e) {
                        Hg.d(AppboyLocationService.a, "Could not request single location update. Security exception from insufficient permissions", e);
                    }
                }
            }

            public void onProviderDisabled(String str) {
                if (str != null && str.equals("passive")) {
                    AppboyLocationService.this.b();
                }
            }

            public void onProviderEnabled(String str) {
            }

            public void onStatusChanged(String str, int i, Bundle bundle) {
            }
        };
    }

    /* access modifiers changed from: private */
    public void b() {
        LocationListener locationListener = this.b;
        if (locationListener != null) {
            try {
                this.c.removeUpdates(locationListener);
            } catch (SecurityException e) {
                Hg.d(a, "Could not remove background location updates. Security exception from insufficient permissions", e);
            }
        }
    }
}
