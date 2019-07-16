package defpackage;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jv reason: default package and case insensitive filesystem */
public final class C1432jv {
    /* access modifiers changed from: private */
    public static final Date a = new Date(0);
    private JSONObject b;
    private JSONObject c;
    private Date d;
    private JSONArray e;

    private C1432jv(JSONObject jSONObject, Date date, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.c = jSONObject;
        this.d = date;
        this.e = jSONArray;
        this.b = jSONObject2;
    }

    static C1432jv a(JSONObject jSONObject) throws JSONException {
        return new C1432jv(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
    }

    public static C1494lv d() {
        return new C1494lv();
    }

    public final Date b() {
        return this.d;
    }

    public final JSONArray c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1432jv)) {
            return false;
        }
        return this.b.toString().equals(((C1432jv) obj).toString());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final JSONObject a() {
        return this.c;
    }
}
