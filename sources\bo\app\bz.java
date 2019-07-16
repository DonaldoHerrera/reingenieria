package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class bz implements bq {
    private static final String a = Hg.a(bz.class);
    private final double b;
    private final double c;
    private final Double d;
    private final Double e;

    public bz(double d2, double d3, Double d4, Double d5) {
        if (d2 > 90.0d || d2 < -90.0d || d3 > 180.0d || d3 < -180.0d) {
            throw new IllegalArgumentException("Unable to create Location. Latitude and longitude values are bounded by ±90 and ±180 respectively");
        }
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
    }

    public double a() {
        return this.b;
    }

    public double b() {
        return this.c;
    }

    public Double c() {
        return this.d;
    }

    public Double d() {
        return this.e;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean f() {
        return this.e != null;
    }

    /* renamed from: g */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", this.b);
            jSONObject.put("longitude", this.c);
            if (e()) {
                jSONObject.put("altitude", this.d);
            }
            if (f()) {
                jSONObject.put("ll_accuracy", this.e);
            }
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating location Json.", e2);
        }
        return jSONObject;
    }
}
