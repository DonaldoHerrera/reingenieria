package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.b;
import java.util.Calendar;

/* compiled from: TwilightManager */
class H {
    private static H a;
    private final Context b;
    private final LocationManager c;
    private final a d = new a();

    /* compiled from: TwilightManager */
    private static class a {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    H(Context context, LocationManager locationManager) {
        this.b = context;
        this.c = locationManager;
    }

    static H a(Context context) {
        if (a == null) {
            Context applicationContext = context.getApplicationContext();
            a = new H(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return a;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location a2 = b.b(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        if (b.b(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = a("gps");
        }
        if (location == null || a2 == null) {
            if (location != null) {
                a2 = location;
            }
            return a2;
        }
        if (location.getTime() > a2.getTime()) {
            a2 = location;
        }
        return a2;
    }

    private boolean c() {
        return this.d.f > System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        a aVar = this.d;
        if (c()) {
            return aVar.a;
        }
        Location b2 = b();
        if (b2 != null) {
            a(b2);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private Location a(String str) {
        try {
            if (this.c.isProviderEnabled(str)) {
                return this.c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    private void a(Location location) {
        long j;
        a aVar = this.d;
        long currentTimeMillis = System.currentTimeMillis();
        G a2 = G.a();
        G g = a2;
        g.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a2.b;
        g.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.d == 1;
        long j3 = a2.c;
        long j4 = j2;
        long j5 = a2.b;
        long j6 = j3;
        boolean z2 = z;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a2.c;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + 60000;
        }
        aVar.a = z2;
        aVar.b = j4;
        aVar.c = j6;
        aVar.d = j5;
        aVar.e = j7;
        aVar.f = j;
    }
}
