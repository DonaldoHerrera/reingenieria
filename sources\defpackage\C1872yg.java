package defpackage;

import bo.app.by;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yg reason: default package and case insensitive filesystem */
public final class C1872yg implements C1294fg<JSONObject> {
    private static final String a = Hg.a(C1872yg.class);
    private final String b;
    private final String c;
    private final boolean d;
    private final by e;
    private final String f;

    public C1872yg(String str, String str2, boolean z, by byVar, String str3) {
        if (!Ng.d(str)) {
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = byVar;
            this.f = str3;
            return;
        }
        throw new IllegalArgumentException("Message cannot be null or blank");
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        String str = "message";
        try {
            String str2 = this.b;
            Ng.a(str2);
            jSONObject.put(str, str2);
            jSONObject.put("reply_to", this.c);
            jSONObject.put("is_bug", this.d);
            if (this.e != null) {
                jSONObject.put("device", this.e.forJsonPut());
            }
            if (!Ng.e(this.f)) {
                jSONObject.put("user_id", this.f);
            }
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating feedback Json.", e2);
        }
        return jSONObject;
    }
}
