package defpackage;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* renamed from: eI reason: default package and case insensitive filesystem */
public class C2973eI {
    private static final String a = "eI";
    public String b;
    public String c;
    public Location d;

    public C2973eI(Context context, boolean z) {
        if ((context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) && z) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            this.d = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, true));
            Location location = this.d;
            if (location != null) {
                this.b = String.valueOf(location.getLongitude());
                this.c = String.valueOf(this.d.getLatitude());
                String str = a;
                StringBuilder sb = new StringBuilder("Krux SDK: longitude ");
                sb.append(this.b);
                Log.d(str, sb.toString());
                String str2 = a;
                StringBuilder sb2 = new StringBuilder("Krux SDK: latitude ");
                sb2.append(this.c);
                Log.d(str2, sb2.toString());
            }
        }
    }
}
