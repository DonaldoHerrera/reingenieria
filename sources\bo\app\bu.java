package bo.app;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bu {
    private static final String a = Hg.a(bu.class);
    private long b;
    private Set<String> c;
    private Set<String> d;
    private Set<String> e;
    private boolean f = false;
    private boolean g = false;
    private long h = -1;
    private float i = -1.0f;
    private boolean j = false;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private boolean n = false;
    private boolean o = false;
    private long p = -1;

    public bu() {
    }

    public boolean a() {
        return this.j;
    }

    public long b() {
        return this.b;
    }

    public Set<String> c() {
        return this.c;
    }

    public Set<String> d() {
        return this.d;
    }

    public Set<String> e() {
        return this.e;
    }

    public long f() {
        return this.p;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.f;
    }

    public long i() {
        return this.h;
    }

    public float j() {
        return this.i;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.l;
    }

    public int m() {
        return this.m;
    }

    public boolean n() {
        return this.o;
    }

    public boolean o() {
        return this.n;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void b(Set<String> set) {
        this.d = set;
    }

    public void c(Set<String> set) {
        this.e = set;
    }

    public void d(boolean z) {
        this.o = z;
    }

    public void e(boolean z) {
        this.n = z;
    }

    public void a(long j2) {
        this.b = j2;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public void a(Set<String> set) {
        this.c = set;
    }

    public void b(long j2) {
        this.h = j2;
    }

    public void c(long j2) {
        this.p = j2;
    }

    public void a(float f2) {
        this.i = f2;
    }

    public void b(int i2) {
        this.l = i2;
    }

    public void c(int i2) {
        this.m = i2;
    }

    public void a(int i2) {
        this.k = i2;
    }

    private Set<String> a(JSONObject jSONObject, String str) {
        if (jSONObject.optJSONArray(str) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            hashSet.add(optJSONArray.getString(i2));
        }
        return hashSet;
    }

    public bu(JSONObject jSONObject) {
        this.c = a(jSONObject, "events_blacklist");
        this.d = a(jSONObject, "attributes_blacklist");
        this.e = a(jSONObject, "purchases_blacklist");
        String str = "time";
        this.b = jSONObject.optLong(str, 0);
        this.p = jSONObject.optLong("messaging_session_timeout", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("location");
        String str2 = "enabled";
        if (optJSONObject != null) {
            try {
                this.g = optJSONObject.getBoolean(str2);
                this.f = true;
            } catch (JSONException unused) {
                Hg.b(a, "Required location collection fields were null. Using defaults.");
                this.f = false;
            }
            long optLong = optJSONObject.optLong(str, -1);
            if (optLong >= 0) {
                this.h = optLong * 1000;
            }
            this.i = (float) optJSONObject.optDouble("distance", -1.0d);
            this.j = optJSONObject.optBoolean("piq_enabled", false);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("geofences");
        if (optJSONObject2 != null) {
            try {
                this.k = optJSONObject2.getInt("min_time_since_last_request");
                this.l = optJSONObject2.getInt("min_time_since_last_report");
                this.o = optJSONObject2.getBoolean(str2);
                this.n = true;
                this.m = optJSONObject2.optInt("max_num_to_register", 20);
            } catch (JSONException unused2) {
                Hg.b(a, "Required geofence fields were null. Using defaults.");
                this.k = -1;
                this.l = -1;
                this.m = -1;
                this.o = false;
                this.n = false;
            }
        }
    }
}
