package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public class cc implements bp, C1294fg<JSONObject> {
    private final String a;
    private final Boolean b;
    private final Boolean c;
    private final ca d;
    private final cb e;

    public static class a {
        private String a;
        private Boolean b;
        private Boolean c;
        private ca d;
        private cb e;

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a b() {
            this.c = Boolean.valueOf(true);
            return this;
        }

        public a c() {
            this.e = new cb();
            return this;
        }

        public cc d() {
            cc ccVar = new cc(this.a, this.b, this.c, this.d, this.e);
            return ccVar;
        }

        public a a() {
            this.b = Boolean.valueOf(true);
            return this;
        }

        public a a(ca caVar) {
            this.d = caVar;
            return this;
        }
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!Ng.e(this.a)) {
                jSONObject.put("user_id", this.a);
            }
            if (this.b != null) {
                jSONObject.put("feed", this.b);
            }
            if (this.c != null) {
                jSONObject.put("triggers", this.c);
            }
            if (this.d != null) {
                jSONObject.put("config", this.d.forJsonPut());
            }
            if (this.e != null) {
                jSONObject.put("in_app_message", this.e.forJsonPut());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean b() {
        JSONObject a2 = forJsonPut();
        if (a2.length() == 0) {
            return true;
        }
        if (a2.length() == 1) {
            return a2.has("user_id");
        }
        return false;
    }

    public boolean c() {
        return this.d != null;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.b != null;
    }

    private cc(String str, Boolean bool, Boolean bool2, ca caVar, cb cbVar) {
        this.a = str;
        this.b = bool;
        this.c = bool2;
        this.d = caVar;
        this.e = cbVar;
    }
}
