package defpackage;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lv reason: default package and case insensitive filesystem */
public final class C1494lv {
    private JSONObject a;
    private Date b;
    private JSONArray c;

    private C1494lv() {
        this.a = new JSONObject();
        this.b = C1432jv.a;
        this.c = new JSONArray();
    }

    public final C1494lv a(Map<String, String> map) {
        this.a = new JSONObject(map);
        return this;
    }

    public final C1494lv a(Date date) {
        this.b = date;
        return this;
    }

    public final C1494lv a(List<C1916zu> list) {
        JSONArray jSONArray = new JSONArray();
        for (C1916zu jSONObject : list) {
            jSONArray.put(new JSONObject(jSONObject));
        }
        this.c = jSONArray;
        return this;
    }

    public final C1432jv a() throws JSONException {
        return new C1432jv(this.a, this.b, this.c);
    }
}
