package bo.app;

import android.net.Uri;
import bo.app.cc.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class cn extends cl {
    private static final String b = Hg.a(cn.class);
    private final cc c;

    public cn(String str) {
        this(str, new a().d());
    }

    public w a() {
        return w.POST;
    }

    public void a(ab abVar, bm bmVar) {
    }

    public JSONObject h() {
        JSONObject h = super.h();
        if (h == null) {
            return null;
        }
        try {
            if (!this.c.b()) {
                h.put("respond_with", this.c.forJsonPut());
            }
            return h;
        } catch (JSONException e) {
            Hg.d(b, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    public boolean i() {
        return this.c.b() && super.i();
    }

    public cn(String str, cc ccVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("data");
        super(Uri.parse(sb.toString()), null);
        this.c = ccVar;
        a(ccVar);
    }
}
