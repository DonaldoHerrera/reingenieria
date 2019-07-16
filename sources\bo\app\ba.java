package bo.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import com.appboy.services.AppboyLocationService;

@SuppressLint({"MissingPermission"})
public final class ba implements bj {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(ba.class);
    private final Context b;
    private final String c;
    private final LocationManager d;
    private final bg e;
    private final boolean f;
    private final boolean g;
    private boolean h = false;
    private long i = 3600000;
    private float j = 50.0f;
    private String k;

    public ba(Context context, bg bgVar, Bf bf, dj djVar) {
        this.b = context;
        this.c = context.getPackageName();
        this.e = bgVar;
        this.d = (LocationManager) context.getSystemService("location");
        this.f = a(bf);
        this.h = b(bf, djVar);
        this.g = e();
        a(bf, djVar);
        AnonymousClass1 r3 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    Hg.b(ba.a, "Location broadcast receiver received null intent.");
                    return;
                }
                String action = intent.getAction();
                if (action.endsWith(".SINGLE_APPBOY_LOCATION_UPDATE")) {
                    ba.this.a(intent);
                } else if (action.endsWith(".REQUEST_INIT_APPBOY_LOCATION_SERVICE")) {
                    ba.this.b();
                }
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(".SINGLE_APPBOY_LOCATION_UPDATE");
        IntentFilter intentFilter = new IntentFilter(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(".REQUEST_INIT_APPBOY_LOCATION_SERVICE");
        intentFilter.addAction(sb2.toString());
        this.b.registerReceiver(r3, intentFilter);
        if (!Mg.a(this.b, "android.permission.ACCESS_FINE_LOCATION")) {
            d();
        }
    }

    private void d() {
        if (!this.g) {
            Hg.c(a, "Did not attempt to stop service. Appboy Location service is not available.");
            return;
        }
        Hg.c(a, "Stopping Appboy location service if currently running.");
        this.b.stopService(new Intent().setClass(this.b, AppboyLocationService.class));
    }

    private boolean e() {
        if (dy.a(this.b, AppboyLocationService.class)) {
            return true;
        }
        Hg.c(a, "Appboy location service is not available. Declare <service android:name=\"com.appboy.services.AppboyLocationService\"/> in your AndroidManifest.xml to enable Appboy location service.");
        return false;
    }

    private String f() {
        String str = this.k;
        if (str != null) {
            return str;
        }
        Criteria criteria = new Criteria();
        criteria.setAccuracy(2);
        criteria.setPowerRequirement(1);
        this.k = this.d.getBestProvider(criteria, true);
        return this.k;
    }

    public boolean b() {
        if (!this.f) {
            Hg.c(a, "Did not request background location updates. Location collection is disabled.");
            return false;
        } else if (!this.h) {
            Hg.c(a, "Did not request background location updates. Background location collection is disabled.");
            return false;
        } else if (!Mg.a(this.b, "android.permission.ACCESS_FINE_LOCATION")) {
            Hg.c(a, "Did not request background location updates. Fine grained location permissions not found.");
            return false;
        } else {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.c);
                sb.append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES");
                a(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.c);
                sb2.append(".REQUEST_APPBOY_LOCATION_UPDATES");
                return a(sb2.toString());
            } catch (Exception e2) {
                Hg.d(a, "Could not request location updates due to exception.", e2);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(Intent intent) {
        try {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Single location update received from ");
            sb.append(intent.getStringExtra("origin"));
            sb.append(": ");
            sb.append(intent.getAction());
            Hg.c(str, sb.toString());
            Location location = (Location) intent.getExtras().get("location");
            if (location != null) {
                bz bzVar = new bz(location.getLatitude(), location.getLongitude(), Double.valueOf(location.getAltitude()), Double.valueOf((double) location.getAccuracy()));
                a((bq) bzVar);
                return;
            }
            Hg.e(a, "Failed to process location update. Received location was null.");
        } catch (Exception e2) {
            Hg.b(a, "Failed to process location update.", e2);
        }
    }

    private boolean a(String str) {
        if (!this.g) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Appboy Location service is not available. Did not send intent to service: ");
            sb.append(str);
            Hg.c(str2, sb.toString());
            return false;
        }
        Intent intent = new Intent(str).setClass(this.b, AppboyLocationService.class);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(".REQUEST_APPBOY_LOCATION_UPDATES");
        if (str.equals(sb2.toString())) {
            intent.putExtra("distance", this.j);
            intent.putExtra("time", this.i);
        }
        this.b.startService(intent);
        return true;
    }

    private boolean b(Bf bf, dj djVar) {
        if (djVar.d()) {
            if (djVar.e()) {
                Hg.c(a, "Background location collection enabled via server configuration.");
                return true;
            }
            Hg.c(a, "Background location collection disabled via server configuration.");
            return false;
        } else if (bf.A()) {
            Hg.c(a, "Background location collection enabled via appboy.xml configuration.");
            return true;
        } else {
            Hg.c(a, "Background location collection disabled via appboy.xml configuration.");
            return false;
        }
    }

    public boolean a(bq bqVar) {
        try {
            this.e.a((bo) bx.a(bqVar));
            return true;
        } catch (Exception e2) {
            Hg.d(a, "Failed to log location recorded event.", e2);
            return false;
        }
    }

    public boolean a() {
        String str;
        if (!this.f) {
            Hg.c(a, "Did not request single location update. Location collection is disabled.");
            return false;
        }
        String str2 = "android.permission.ACCESS_FINE_LOCATION";
        if (Mg.a(this.b, str2) || Mg.a(this.b, "android.permission.ACCESS_COARSE_LOCATION")) {
            if (Mg.a(this.b, str2)) {
                str = "passive";
            } else {
                str = f();
            }
            if (Ng.d(str)) {
                Hg.a(a, "Could not request single location update. Android location provider not found.");
                return false;
            }
            try {
                Hg.a(a, "Requesting single location update.");
                StringBuilder sb = new StringBuilder();
                sb.append(this.c);
                sb.append(".SINGLE_APPBOY_LOCATION_UPDATE");
                Intent intent = new Intent(sb.toString());
                intent.putExtra("origin", "Appboy location manager");
                this.d.requestSingleUpdate(str, PendingIntent.getBroadcast(this.b, 0, intent, 134217728));
                return true;
            } catch (SecurityException e2) {
                Hg.d(a, "Failed to request single location update due to security exception from insufficient permissions.", e2);
                return false;
            } catch (Exception e3) {
                Hg.d(a, "Failed to request single location update due to exception.", e3);
                return false;
            }
        } else {
            Hg.c(a, "Did not request single location update. Fine grained location permissions not found.");
            return false;
        }
    }

    public void a(bu buVar) {
        if (buVar == null) {
            Hg.e(a, "Could not reset background location collection interval. Server config was null.");
            return;
        }
        if (buVar.i() >= 0) {
            this.i = buVar.i();
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Time interval override reset via server configuration for background location collection: ");
            sb.append(this.i / 1000);
            sb.append("s.");
            Hg.c(str, sb.toString());
        }
        if (buVar.j() >= 0.0f) {
            this.j = buVar.j();
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Distance threshold override reset via server configuration for background location collection: ");
            sb2.append(this.j);
            sb2.append("m.");
            Hg.c(str2, sb2.toString());
        }
        if (buVar.h()) {
            if (buVar.g()) {
                this.h = true;
                Hg.c(a, "Background location collection enabled via server configuration. Requesting location updates.");
                b();
            } else {
                this.h = false;
                Hg.c(a, "Background location collection disabled via server configuration. Stopping any active Appboy location service.");
                d();
            }
        }
    }

    private void a(Bf bf, dj djVar) {
        String str = "s.";
        if (djVar.i() >= 0) {
            this.i = djVar.i();
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Time interval override set via server configuration for background location collection: ");
            sb.append(this.i / 1000);
            sb.append(str);
            Hg.c(str2, sb.toString());
        } else if (bf.s() > 300000) {
            this.i = bf.s();
            String str3 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Time interval override set via appboy configuration for background location collection: ");
            sb2.append(this.i / 1000);
            sb2.append(str);
            Hg.c(str3, sb2.toString());
        } else {
            this.i = 3600000;
            String str4 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Time interval override set to default for background location collection: ");
            sb3.append(this.i / 1000);
            sb3.append(str);
            Hg.c(str4, sb3.toString());
        }
        String str5 = "m.";
        if (djVar.k() >= 0.0f) {
            this.j = djVar.k();
            String str6 = a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Distance threshold override set via server configuration for background location collection: ");
            sb4.append(this.j);
            sb4.append(str5);
            Hg.c(str6, sb4.toString());
        } else if (bf.r() > 50.0f) {
            this.j = bf.r();
            String str7 = a;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Distance threshold override set via appboy configuration for background location collection: ");
            sb5.append(this.j);
            sb5.append(str5);
            Hg.c(str7, sb5.toString());
        } else {
            this.j = 50.0f;
            String str8 = a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Distance threshold override set to default for background location collection: ");
            sb6.append(this.j);
            sb6.append(str5);
            Hg.c(str8, sb6.toString());
        }
    }

    public static boolean a(Bf bf) {
        if (bf.C()) {
            Hg.c(a, "Location collection enabled via appboy.xml configuration.");
            return true;
        }
        Hg.c(a, "Location collection disabled via appboy.xml configuration.");
        return false;
    }
}
