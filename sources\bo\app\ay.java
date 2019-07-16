package bo.app;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.appboy.services.AppboyGeofenceService;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationServices;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ay {
    /* access modifiers changed from: private */
    public static final String m = Hg.a(ay.class);
    final bg a;
    final SharedPreferences b;
    final List<C0491bg> c;
    final PendingIntent d;
    final PendingIntent e;
    az f;
    boolean g;
    boolean h;
    GoogleApiClient i;
    bq j;
    boolean k;
    int l;
    /* access modifiers changed from: private */
    public final Context n;
    private final Bf o;
    /* access modifiers changed from: private */
    public final dj p;
    /* access modifiers changed from: private */
    public final Object q = new Object();

    class a implements ConnectionCallbacks {
        private a() {
        }

        public void onConnected(Bundle bundle) {
            Hg.a(ay.m, "Successfully connected to Google Play Services.");
            synchronized (ay.this.q) {
                if (ay.this.h) {
                    ay.this.a(ay.this.i, ay.this.c, ay.this.d);
                    ay.this.h = false;
                }
            }
            if (ay.this.g) {
                Hg.a(ay.m, "Pending single location request was found. Requesting single location update");
                ay ayVar = ay.this;
                ayVar.b(ayVar.i, ayVar.e);
                ay.this.g = false;
            }
        }

        public void onConnectionSuspended(int i) {
            Hg.a(ay.m, "Google Play Services connection was suspended.");
        }
    }

    class b implements OnConnectionFailedListener {
        private b() {
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            int errorCode = connectionResult.getErrorCode();
            String a2 = ay.m;
            StringBuilder sb = new StringBuilder();
            sb.append("Connection to Google Play Services failed with error code: ");
            sb.append(errorCode);
            Hg.b(a2, sb.toString());
        }
    }

    public ay(Context context, String str, bg bgVar, Bf bf, dj djVar) {
        boolean z = false;
        this.g = false;
        this.h = false;
        this.k = false;
        this.n = context.getApplicationContext();
        this.a = bgVar;
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.managers.geofences.storage.");
        sb.append(str);
        this.b = context.getSharedPreferences(sb.toString(), 0);
        this.o = bf;
        this.p = djVar;
        if (dp.a(this.p) && a(context)) {
            z = true;
        }
        this.k = z;
        this.l = dp.b(this.p);
        this.c = dp.a(this.b);
        this.d = dp.a(context);
        this.e = dp.b(context);
        this.f = new az(context, str, djVar);
        AnonymousClass1 r4 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    Hg.b(ay.m, "Geofence broadcast receiver received null intent.");
                    return;
                }
                if (intent.getAction().endsWith(".REQUEST_APPBOY_GEOFENCE_REGISTRATION")) {
                    Hg.a(ay.m, "Request to set up geofences received.");
                    ay ayVar = ay.this;
                    ayVar.k = dp.a(ayVar.p) && ay.this.a(context);
                    ay ayVar2 = ay.this;
                    ayVar2.a(ayVar2.n, false);
                    ay.this.a(true);
                }
            }
        };
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append(".REQUEST_APPBOY_GEOFENCE_REGISTRATION");
        this.n.registerReceiver(r4, new IntentFilter(sb2.toString()));
        a(this.n, true);
    }

    public void b(String str, v vVar) {
        if (!this.k) {
            Hg.e(m, "Appboy geofences not enabled. Not posting geofence report.");
            return;
        }
        try {
            bx c2 = bx.c(str, vVar.toString().toLowerCase(Locale.US));
            if (a(str, vVar)) {
                this.a.a((bo) c2);
            }
            if (this.f.a(dn.a(), a(str), vVar)) {
                this.a.b(c2);
            }
        } catch (Exception e2) {
            Hg.d(m, "Failed to record geofence transition.", e2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(Context context) {
        if (!ba.a(this.o)) {
            Hg.a(m, "Location collection not available. Geofences not enabled.");
            return false;
        } else if (!Mg.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            Hg.c(m, "Fine grained location permissions not found. Geofences not enabled.");
            return false;
        } else if (!dy.a(context, AppboyGeofenceService.class)) {
            Hg.a(m, "Geofencing service not available. Geofences not enabled.");
            return false;
        } else if (!dr.a(context)) {
            Hg.a(m, "Google Play Services not available. Geofences not enabled.");
            return false;
        } else {
            try {
                if (Class.forName("com.google.android.gms.location.LocationServices", false, ay.class.getClassLoader()) != null) {
                    return true;
                }
                throw new RuntimeException("com.google.android.gms.location.LocationServices not found.");
            } catch (Exception unused) {
                Hg.a(m, "Google Play Services Location API not found. Geofences not enabled.");
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return dq.a(googleApiClient, pendingIntent);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, boolean z) {
        if (!this.k) {
            Hg.a(m, "Appboy geofences not enabled. Geofences not set up.");
            return;
        }
        Hg.a(m, "Geofencing service, location permissions, and Google Play Services available. Location collection and Geofencing enabled via config.");
        if (this.i == null) {
            Hg.a(m, "Creating Google Play Services location API client.");
            this.i = new Builder(context).addApi(LocationServices.API).addConnectionCallbacks(new a()).addOnConnectionFailedListener(new b()).build();
        }
        if (!this.i.isConnected()) {
            if (z) {
                this.h = true;
            }
            Hg.a(m, "Connecting to Google Play Services location API client.");
            this.i.connect();
        } else if (z) {
            synchronized (this.q) {
                a(this.i, this.c, this.d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        if (googleApiClient == null) {
            Hg.a(m, "Google Play Services location API client was null. Not tearing down geofences.");
            return;
        }
        Hg.a(m, "Tearing down geofences.");
        if (pendingIntent != null) {
            Hg.a(m, "Unregistering any Appboy geofences from Google Play Services.");
            LocationServices.GeofencingApi.removeGeofences(googleApiClient, pendingIntent);
        }
        if (googleApiClient.isConnected()) {
            Hg.a(m, "Disconnecting Google Play Services location API client.");
            googleApiClient.disconnect();
        }
        synchronized (this.q) {
            Hg.a(m, "Deleting locally stored geofences.");
            Editor edit = this.b.edit();
            edit.clear();
            this.c.clear();
            edit.apply();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str, v vVar) {
        synchronized (this.q) {
            C0491bg a2 = a(str);
            if (a2 != null) {
                if (vVar.equals(v.ENTER)) {
                    boolean w = a2.w();
                    return w;
                } else if (vVar.equals(v.EXIT)) {
                    boolean x = a2.x();
                    return x;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public C0491bg a(String str) {
        synchronized (this.q) {
            for (C0491bg bgVar : this.c) {
                if (bgVar.getId().equals(str)) {
                    return bgVar;
                }
            }
            return null;
        }
    }

    public void a(bq bqVar) {
        if (!this.k) {
            Hg.a(m, "Appboy geofences not enabled. Not requesting geofences.");
            return;
        }
        if (bqVar != null) {
            bz bzVar = new bz(bqVar.a(), bqVar.b(), bqVar.c(), bqVar.d());
            this.j = bzVar;
            this.a.a(this.j);
        }
    }

    public void a(boolean z) {
        if (!this.k) {
            Hg.a(m, "Appboy geofences not enabled. Not requesting geofences.");
            return;
        }
        if (this.f.a(z, dn.a())) {
            this.g = !b(this.i, this.e);
        }
    }

    public void a(bu buVar) {
        if (buVar == null) {
            Hg.e(m, "Could not configure geofence manager from server config. Server config was null.");
            return;
        }
        boolean n2 = buVar.n();
        String str = m;
        StringBuilder sb = new StringBuilder();
        sb.append("Geofences enabled server config value ");
        sb.append(n2);
        sb.append(" received.");
        Hg.a(str, sb.toString());
        boolean z = n2 && a(this.n);
        if (z != this.k) {
            this.k = z;
            String str2 = m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Geofences enabled status newly set to ");
            sb2.append(this.k);
            sb2.append(" during server config update.");
            Hg.c(str2, sb2.toString());
            if (this.k) {
                a(this.n, false);
                a(true);
            } else {
                a(this.i, this.d);
            }
        } else {
            String str3 = m;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Geofences enabled status ");
            sb3.append(this.k);
            sb3.append(" unchanged during server config update.");
            Hg.a(str3, sb3.toString());
        }
        int m2 = buVar.m();
        if (m2 >= 0) {
            this.l = m2;
            String str4 = m;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Max number to register newly set to ");
            sb4.append(this.l);
            sb4.append(" via server config.");
            Hg.c(str4, sb4.toString());
        }
        this.f.a(buVar);
    }

    public void a(List<C0491bg> list) {
        if (list == null) {
            Hg.e(m, "Appboy geofence list was null. Not adding new geofences to local storage.");
        } else if (!this.k) {
            Hg.e(m, "Appboy geofences not enabled. Not adding new geofences to local storage.");
        } else {
            if (this.j != null) {
                for (C0491bg bgVar : list) {
                    bgVar.a(dv.a(this.j.a(), this.j.b(), bgVar.L(), bgVar.M()));
                }
                Collections.sort(list);
            }
            synchronized (this.q) {
                String str = m;
                StringBuilder sb = new StringBuilder();
                sb.append("Received new geofence list of size: ");
                sb.append(list.size());
                Hg.a(str, sb.toString());
                Editor edit = this.b.edit();
                edit.clear();
                this.c.clear();
                int i2 = 0;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0491bg bgVar2 = (C0491bg) it.next();
                    if (i2 == this.l) {
                        String str2 = m;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reached maximum number of new geofences: ");
                        sb2.append(this.l);
                        Hg.a(str2, sb2.toString());
                        break;
                    }
                    this.c.add(bgVar2);
                    String str3 = m;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Adding new geofence to local storage: ");
                    sb3.append(bgVar2.toString());
                    Hg.a(str3, sb3.toString());
                    edit.putString(bgVar2.getId(), bgVar2.forJsonPut().toString());
                    i2++;
                }
                edit.apply();
                String str4 = m;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Added ");
                sb4.append(this.c.size());
                sb4.append(" new geofences to local storage.");
                Hg.a(str4, sb4.toString());
            }
            this.f.a(list);
            a(this.n, true);
        }
    }

    /* access modifiers changed from: protected */
    public void a(GoogleApiClient googleApiClient, List<C0491bg> list, PendingIntent pendingIntent) {
        dq.a(this.n, googleApiClient, list, pendingIntent);
    }
}
