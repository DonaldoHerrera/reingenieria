package bo.app;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

public final class cy extends cl {
    private static final String b = Hg.a(cy.class);
    private final String c;
    private final long d;
    private final String e;
    private final fb f;

    public cy(String str, ed edVar, fb fbVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("template");
        super(Uri.parse(sb.toString()), null);
        this.c = edVar.g();
        this.d = edVar.f();
        this.e = edVar.h();
        this.f = fbVar;
    }

    public w a() {
        return w.POST;
    }

    public JSONObject h() {
        JSONObject h = super.h();
        if (h == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_id", this.c);
            jSONObject.put("trigger_event_type", this.f.b());
            if (this.f.e() != null) {
                jSONObject.put("data", this.f.e().forJsonPut());
            }
            h.put("template", jSONObject);
            return h;
        } catch (JSONException e2) {
            Hg.d(b, "Experienced JSONException while retrieving parameters. Returning null.", e2);
            return null;
        }
    }

    public boolean i() {
        return false;
    }

    public long k() {
        return this.d;
    }

    public void a(ab abVar, bm bmVar) {
        if (bmVar != null && bmVar.c() && !Ng.d(this.e)) {
            bmVar.j().setLocalAssetPathForPrefetch(this.e);
        }
    }
}
