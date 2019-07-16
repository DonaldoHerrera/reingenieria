package bo.app;

import android.net.Uri;
import com.appboy.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class cl extends cw implements bp, cr {
    private static final String b = Hg.a(cl.class);
    private Long c;
    private String d;
    private String e;
    private String f;
    private by g;
    private String h;
    private Of i;
    private cd j;
    private cc k;
    private bn l;

    protected cl(Uri uri, Map<String, String> map) {
        super(uri, map);
    }

    public void a(String str) {
        this.d = str;
    }

    public void b(String str) {
        this.e = str;
    }

    public Uri c() {
        return h.a(this.a);
    }

    public by d() {
        return this.g;
    }

    public cd e() {
        return this.j;
    }

    public cc f() {
        return this.k;
    }

    public bn g() {
        return this.l;
    }

    public JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.h != null) {
                jSONObject.put("app_version", this.h);
            }
            if (this.d != null) {
                jSONObject.put("device_id", this.d);
            }
            if (this.c != null) {
                jSONObject.put("time", this.c);
            }
            if (this.e != null) {
                jSONObject.put("api_key", this.e);
            }
            if (this.f != null) {
                jSONObject.put("sdk_version", this.f);
            }
            if (this.g != null && !this.g.b()) {
                jSONObject.put("device", this.g.forJsonPut());
            }
            if (this.j != null && !this.j.b()) {
                jSONObject.put("attributes", this.j.forJsonPut());
            }
            if (this.l != null && !this.l.b()) {
                jSONObject.put("events", du.a((Collection<? extends C1294fg<T>>) this.l.a()));
            }
            if (this.i != null) {
                jSONObject.put("sdk_flavor", this.i.forJsonPut());
            }
            return jSONObject;
        } catch (JSONException e2) {
            Hg.d(b, "Experienced JSONException while retrieving parameters. Returning null.", e2);
            return null;
        }
    }

    public boolean i() {
        return b();
    }

    public void a(by byVar) {
        this.g = byVar;
    }

    public boolean b() {
        ArrayList<bp> arrayList = new ArrayList<>();
        arrayList.add(this.g);
        arrayList.add(this.j);
        arrayList.add(this.l);
        for (bp bpVar : arrayList) {
            if (bpVar != null && !bpVar.b()) {
                return false;
            }
        }
        return true;
    }

    public void c(String str) {
        this.f = str;
    }

    public void d(String str) {
        this.h = str;
    }

    public void a(long j2) {
        this.c = Long.valueOf(j2);
    }

    public void a(Of of) {
        this.i = of;
    }

    public void a(cd cdVar) {
        this.j = cdVar;
    }

    public void a(cc ccVar) {
        this.k = ccVar;
    }

    public void a(bn bnVar) {
        this.l = bnVar;
    }

    public void a(ab abVar, C1572og ogVar) {
        String str = b;
        StringBuilder sb = new StringBuilder();
        sb.append("Error occurred while executing Appboy request: ");
        sb.append(ogVar.a());
        Hg.b(str, sb.toString());
    }

    public void a(ab abVar) {
        cd cdVar = this.j;
        if (cdVar != null) {
            abVar.a(new ah(cdVar), ah.class);
        }
        by byVar = this.g;
        if (byVar != null) {
            abVar.a(new ae(byVar), ae.class);
        }
    }
}
