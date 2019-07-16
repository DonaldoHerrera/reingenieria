package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public class bt implements C1294fg<JSONObject> {
    private static final String a = Hg.a(bt.class);
    private final bv b;
    private final double c;
    private volatile Double d;
    private volatile boolean e;

    public bt(bv bvVar, double d2) {
        this(bvVar, d2, null, false);
    }

    public bv a() {
        return this.b;
    }

    public Double b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }

    public void d() {
        this.e = true;
        a(Double.valueOf(dn.b()));
    }

    public long e() {
        if (this.d == null) {
            return -1;
        }
        long doubleValue = (long) (this.d.doubleValue() - this.c);
        if (doubleValue < 0) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("End time '");
            sb.append(this.d);
            sb.append("' for session is less than the start time '");
            sb.append(this.c);
            sb.append("' for this session.");
            Hg.e(str, sb.toString());
        }
        return doubleValue;
    }

    /* renamed from: f */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.b);
            jSONObject.put("start_time", this.c);
            jSONObject.put("is_sealed", this.e);
            if (this.d != null) {
                jSONObject.put("end_time", this.d);
            }
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating Session Json.", e2);
        }
        return jSONObject;
    }

    public bt(bv bvVar, double d2, Double d3, boolean z) {
        this.e = false;
        this.b = bvVar;
        this.c = d2;
        this.e = z;
        this.d = d3;
    }

    public void a(Double d2) {
        this.d = d2;
    }

    public bt(JSONObject jSONObject) {
        this.e = false;
        this.b = bv.a(jSONObject.getString("session_id"));
        this.c = jSONObject.getDouble("start_time");
        this.e = jSONObject.getBoolean("is_sealed");
        String str = "end_time";
        if (jSONObject.has(str)) {
            this.d = Double.valueOf(jSONObject.getDouble(str));
        }
    }
}
