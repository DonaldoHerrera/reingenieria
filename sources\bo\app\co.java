package bo.app;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class co extends cl {
    private static final String b = Hg.a(co.class);
    private final C1872yg c;

    public co(String str, C1872yg ygVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("data");
        super(Uri.parse(sb.toString()), null);
        this.c = ygVar;
    }

    public w a() {
        return w.POST;
    }

    public JSONObject h() {
        JSONObject h = super.h();
        if (h == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.c.forJsonPut());
            h.put("feedback", jSONArray);
            return h;
        } catch (JSONException e) {
            Hg.d(b, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    public boolean i() {
        return false;
    }

    public void a(ab abVar, bm bmVar) {
        abVar.a(new C0306ag(this.c), C0306ag.class);
    }

    public void a(ab abVar, C1572og ogVar) {
        super.a(abVar, ogVar);
        abVar.a(new _f(this.c, ogVar), _f.class);
    }
}
