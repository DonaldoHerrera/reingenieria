package bo.app;

import android.content.Context;
import com.appboy.h;
import org.json.JSONException;
import org.json.JSONObject;

public final class ec extends ee implements eb {
    private static final String a = Hg.a(ec.class);
    private C0522cg b;
    private bg c;
    private String d;

    public ec(JSONObject jSONObject, bg bgVar) {
        super(jSONObject);
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Parsing in-app message triggered action with JSON: ");
        sb.append(jSONObject.toString(2));
        Hg.a(str, sb.toString());
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            this.c = bgVar;
            if (jSONObject2.optBoolean("is_control", false)) {
                Hg.a(a, "Control triggered action found. Parsing in-app message.");
                this.b = new br(jSONObject2, this.c);
                return;
            }
            Hg.a(a, "Non-control triggered action found. Parsing in-app message.");
            this.b = dt.a(jSONObject2, this.c);
            return;
        }
        Hg.e(a, "InAppMessageTriggeredAction Json did not contain in-app message.");
    }

    public void a(String str) {
        this.d = str;
    }

    public fr d() {
        if (Ng.d(this.b.getRemoteAssetPathForPrefetch())) {
            return null;
        }
        C0522cg cgVar = this.b;
        if (cgVar instanceof C1233dg) {
            return new fr(ez.ZIP, cgVar.getRemoteAssetPathForPrefetch());
        }
        return new fr(ez.IMAGE, cgVar.getRemoteAssetPathForPrefetch());
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject e = super.forJsonPut();
            e.put("data", this.b.forJsonPut());
            e.put(C1325gg.TYPE, "inapp");
            return e;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void a(Context context, ab abVar, fb fbVar, long j) {
        try {
            JSONObject jSONObject = (JSONObject) this.b.forJsonPut();
            if (this.b instanceof br) {
                Hg.a(a, "Attempting to log control impression in place of publishing in-app message.");
                new br(jSONObject, this.c).a();
                return;
            }
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to publish in-app message after delay of ");
            sb.append(c().d());
            sb.append(" seconds.");
            Hg.a(str, sb.toString());
            C0522cg a2 = dt.a(jSONObject, this.c);
            if (!Ng.d(this.d)) {
                a2.setLocalAssetPathForPrefetch(this.d);
            }
            a2.setExpirationTimestamp(j);
            abVar.a(new Zf(a2, h.a(context).c().a()), Zf.class);
        } catch (JSONException e) {
            Hg.d(a, "Caught JSON exception while performing triggered action.", e);
        } catch (Exception e2) {
            Hg.d(a, "Caught exception while performing triggered action.", e2);
        }
    }
}
