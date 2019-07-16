package defpackage;

import com.google.android.gms.common.Scopes;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xg reason: default package and case insensitive filesystem */
public class C1842xg implements C1294fg<JSONObject> {
    private static final String a = Hg.a(C1842xg.class);
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Jf h;
    private final Integer i;
    private final Collection<String> j;
    private final String k;

    private JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        for (String str : this.j) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!Ng.d(this.b)) {
                jSONObject.put("id", this.b);
            }
            if (!Ng.d(this.c)) {
                jSONObject.put("first_name", this.c);
            }
            if (!Ng.d(this.d)) {
                jSONObject.put("last_name", this.d);
            }
            if (!Ng.d(this.e)) {
                jSONObject.put(Scopes.EMAIL, this.e);
            }
            if (!Ng.d(this.f)) {
                jSONObject.put("bio", this.f);
            }
            if (!Ng.d(this.k)) {
                jSONObject.put("birthday", this.k);
            }
            if (!Ng.d(this.g)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", this.g);
                jSONObject.put("location", jSONObject2);
            }
            if (this.h != null) {
                jSONObject.put("gender", this.h.forJsonPut());
            }
            jSONObject.put("num_friends", this.i);
            if (this.j != null && !this.j.isEmpty()) {
                jSONObject.put("likes", a());
            }
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating facebook user Json.", e2);
        }
        return jSONObject;
    }
}
