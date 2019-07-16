package bo.app;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bm {
    private static final String a = Hg.a(bm.class);
    private final JSONArray b;
    private final List<C0522cg> c;
    private final C0522cg d;
    private final List<eb> e;
    private final bu f;
    private final List<C0491bg> g;
    private final C1572og h;

    public bm(JSONObject jSONObject, bg bgVar) {
        bu buVar = null;
        String optString = jSONObject.optString("error", null);
        if (optString != null) {
            this.h = new C1572og(optString);
        } else {
            this.h = null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("feed");
        if (optJSONArray != null) {
            this.b = optJSONArray;
        } else {
            this.b = null;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("in_app_message");
        if (optJSONArray2 != null) {
            this.c = new ArrayList();
            for (int i = 0; i < optJSONArray2.length(); i++) {
                try {
                    this.c.add(dt.a(optJSONArray2.getJSONObject(i), bgVar));
                } catch (JSONException unused) {
                    String str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to parse original in app message with json body: ");
                    sb.append(optJSONArray2.opt(i));
                    Hg.e(str, sb.toString());
                }
            }
        } else {
            this.c = null;
        }
        this.e = fs.a(jSONObject.optJSONArray("triggers"), bgVar);
        JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            try {
                buVar = new bu(optJSONObject);
            } catch (JSONException e2) {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered JSONException processing server config: ");
                sb2.append(optJSONObject.toString());
                Hg.d(str2, sb2.toString(), e2);
            } catch (Exception e3) {
                String str3 = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Encountered Exception processing server config: ");
                sb3.append(optJSONObject.toString());
                Hg.d(str3, sb3.toString(), e3);
            }
        }
        this.f = buVar;
        this.d = fs.a(jSONObject.optJSONObject("templated_message"), bgVar);
        this.g = Cdo.a(jSONObject.optJSONArray("geofences"));
    }

    public boolean a() {
        return this.b != null;
    }

    public boolean b() {
        return this.c != null;
    }

    public boolean c() {
        return this.d != null;
    }

    public boolean d() {
        return this.f != null;
    }

    public boolean e() {
        return this.e != null;
    }

    public boolean f() {
        return this.h != null;
    }

    public boolean g() {
        return this.g != null;
    }

    public JSONArray h() {
        return this.b;
    }

    public List<C0522cg> i() {
        return this.c;
    }

    public C0522cg j() {
        return this.d;
    }

    public bu k() {
        return this.f;
    }

    public List<eb> l() {
        return this.e;
    }

    public List<C0491bg> m() {
        return this.g;
    }

    public C1572og n() {
        return this.h;
    }
}
