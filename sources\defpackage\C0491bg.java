package defpackage;

import bo.app.hw;
import bo.app.hy;
import com.comscore.util.log.LogLevel;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.Geofence.Builder;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bg reason: default package and case insensitive filesystem */
public class C0491bg implements C1294fg<JSONObject>, Comparable<C0491bg> {
    private final JSONObject a;
    private final String b;
    private final double c;
    private final double d;
    final int e;
    private final int f;
    private final int g;
    private final boolean h;
    private final boolean i;
    final boolean j;
    final boolean k;
    final int l;
    double m;

    public C0491bg(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this(jSONObject2, jSONObject2.getString("id"), jSONObject2.getDouble("latitude"), jSONObject2.getDouble("longitude"), jSONObject2.getInt("radius"), jSONObject2.getInt("cooldown_enter"), jSONObject2.getInt("cooldown_exit"), jSONObject2.getBoolean("analytics_enabled_enter"), jSONObject2.getBoolean("analytics_enabled_exit"), jSONObject2.optBoolean("enter_events", true), jSONObject2.optBoolean("exit_events", true), jSONObject2.optInt("notification_responsiveness", LogLevel.NONE));
    }

    public int J() {
        return this.g;
    }

    public double K() {
        return this.m;
    }

    public double L() {
        return this.c;
    }

    public double M() {
        return this.d;
    }

    public Geofence N() {
        Builder builder = new Builder();
        builder.setRequestId(this.b).setCircularRegion(this.c, this.d, (float) this.e).setNotificationResponsiveness(this.l).setExpirationDuration(-1);
        int i2 = this.j ? 1 : 0;
        if (this.k) {
            i2 |= 2;
        }
        builder.setTransitionTypes(i2);
        return builder.build();
    }

    public void a(double d2) {
        this.m = d2;
    }

    public boolean b(C0491bg bgVar) {
        try {
            hw.a(bgVar.forJsonPut(), this.a, hy.LENIENT);
            return true;
        } catch (AssertionError | JSONException unused) {
            return false;
        }
    }

    public String getId() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppboyGeofence{");
        sb.append("id=");
        sb.append(this.b);
        sb.append(", latitude='");
        sb.append(this.c);
        sb.append(", longitude=");
        sb.append(this.d);
        sb.append(", radiusMeters=");
        sb.append(this.e);
        sb.append(", cooldownEnterSeconds=");
        sb.append(this.f);
        sb.append(", cooldownExitSeconds=");
        sb.append(this.g);
        sb.append(", analyticsEnabledEnter=");
        sb.append(this.i);
        sb.append(", analyticsEnabledExit=");
        sb.append(this.h);
        sb.append(", enterEvents=");
        sb.append(this.j);
        sb.append(", exitEvents=");
        sb.append(this.k);
        sb.append(", notificationResponsivenessMs=");
        sb.append(this.l);
        sb.append(", distanceFromGeofenceRefresh=");
        sb.append(this.m);
        sb.append('}');
        return sb.toString();
    }

    public boolean w() {
        return this.i;
    }

    public boolean x() {
        return this.h;
    }

    public int y() {
        return this.f;
    }

    /* renamed from: a */
    public int compareTo(C0491bg bgVar) {
        double d2 = this.m;
        int i2 = 1;
        if (d2 == -1.0d) {
            return 1;
        }
        if (d2 < bgVar.K()) {
            i2 = -1;
        }
        return i2;
    }

    public JSONObject forJsonPut() {
        return this.a;
    }

    C0491bg(JSONObject jSONObject, String str, double d2, double d3, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5) {
        this.m = -1.0d;
        this.a = jSONObject;
        this.b = str;
        this.c = d2;
        this.d = d3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.i = z;
        this.h = z2;
        this.j = z3;
        this.k = z4;
        this.l = i5;
    }
}
