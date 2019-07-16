package com.appboy.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import bo.app.bq;
import bo.app.bz;
import bo.app.v;
import com.appboy.i;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationResult;
import java.util.List;

public class AppboyGeofenceService extends IntentService {
    private static final String a = Hg.a(AppboyGeofenceService.class);

    public AppboyGeofenceService() {
        super(AppboyGeofenceService.class.getName());
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Intent intent, Context context) {
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".APPBOY_GEOFENCE_LOCATION_UPDATE");
        if (!action.equals(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getPackageName());
            sb2.append(".APPBOY_GEOFENCE_UPDATE");
            if (action.equals(sb2.toString())) {
                String str = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("AppboyGeofenceService received intent with geofence transition: ");
                sb3.append(action);
                Hg.a(str, sb3.toString());
                return a(b(intent));
            }
            String str2 = a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown intent received in AppboyGeofenceService with action: ");
            sb4.append(action);
            Hg.e(str2, sb4.toString());
        } else if (a(intent)) {
            String str3 = a;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("AppboyGeofenceService received intent with location result: ");
            sb5.append(action);
            Hg.a(str3, sb5.toString());
            return a(LocationResult.extractResult(intent));
        } else {
            String str4 = a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("AppboyGeofenceService received intent without location result: ");
            sb6.append(action);
            Hg.e(str4, sb6.toString());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public GeofencingEvent b(Intent intent) {
        return GeofencingEvent.fromIntent(intent);
    }

    public void onCreate() {
        super.onCreate();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        a(intent, getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public boolean a(LocationResult locationResult) {
        try {
            Location lastLocation = locationResult.getLastLocation();
            bz bzVar = new bz(lastLocation.getLatitude(), lastLocation.getLongitude(), Double.valueOf(lastLocation.getAltitude()), Double.valueOf((double) lastLocation.getAccuracy()));
            i.a(getApplicationContext(), (bq) bzVar);
            return true;
        } catch (Exception e) {
            Hg.b(a, "Exception while processing location result", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(Intent intent) {
        return LocationResult.hasResult(intent);
    }

    /* access modifiers changed from: protected */
    public boolean a(GeofencingEvent geofencingEvent) {
        if (geofencingEvent.hasError()) {
            int errorCode = geofencingEvent.getErrorCode();
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Location Services error: ");
            sb.append(errorCode);
            Hg.b(str, sb.toString());
            return false;
        }
        int geofenceTransition = geofencingEvent.getGeofenceTransition();
        List<Geofence> triggeringGeofences = geofencingEvent.getTriggeringGeofences();
        if (1 == geofenceTransition) {
            for (Geofence requestId : triggeringGeofences) {
                i.a(getApplicationContext(), requestId.getRequestId(), v.ENTER);
            }
            return true;
        } else if (2 == geofenceTransition) {
            for (Geofence requestId2 : triggeringGeofences) {
                i.a(getApplicationContext(), requestId2.getRequestId(), v.EXIT);
            }
            return true;
        } else {
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported transition type received: ");
            sb2.append(geofenceTransition);
            Hg.e(str2, sb2.toString());
            return false;
        }
    }
}
