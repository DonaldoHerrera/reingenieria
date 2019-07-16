package defpackage;

import bo.app.bg;
import bo.app.bo;
import bo.app.bx;
import bo.app.df;
import bo.app.dn;
import bo.app.du;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: rg reason: default package and case insensitive filesystem */
public class C1662rg extends Observable implements C1294fg<JSONObject> {
    private static final String a = Hg.a(C1662rg.class);
    protected final JSONObject b;
    protected final Map<String, String> c;
    protected final String d;
    protected boolean e;
    protected boolean f;
    protected final long g;
    protected final long h;
    protected final long i;
    protected boolean j = false;
    protected final EnumSet<Gf> k;
    private final bg l;
    private final df m;

    public C1662rg(JSONObject jSONObject, bg bgVar, df dfVar) {
        this.b = jSONObject;
        this.c = du.a(jSONObject.optJSONObject("extras"), (Map<String, String>) new HashMap<String,String>());
        this.l = bgVar;
        this.m = dfVar;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.getBoolean("viewed");
        this.f = this.e;
        this.g = jSONObject.getLong("created");
        this.h = jSONObject.getLong("updated");
        this.i = jSONObject.optLong("expires_at", -1);
        this.j = jSONObject.optBoolean("use_webview", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("categories");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            this.k = EnumSet.of(Gf.NO_CATEGORY);
            return;
        }
        this.k = EnumSet.noneOf(Gf.class);
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            Gf a2 = Gf.a(optJSONArray.getString(i2));
            if (a2 != null) {
                this.k.add(a2);
            }
        }
    }

    public boolean a(C1662rg rgVar) {
        return this.d.equals(rgVar.i()) && this.h == rgVar.j() && this.l == rgVar.l;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public Map<String, String> getExtras() {
        return this.c;
    }

    public boolean getOpenUriInWebView() {
        return this.j;
    }

    public long h() {
        return this.i;
    }

    public String i() {
        return this.d;
    }

    public long j() {
        return this.h;
    }

    public String k() {
        return null;
    }

    public boolean l() {
        return this.e;
    }

    public boolean logClick() {
        try {
            if (this.l != null && a()) {
                this.l.a((bo) bx.d(this.d));
                return true;
            }
        } catch (Exception e2) {
            Hg.d(a, "Failed to log feed card clicked.", e2);
        }
        return false;
    }

    public boolean logImpression() {
        try {
            if (!(this.l == null || this.m == null || !a())) {
                this.l.a((bo) bx.c(this.d));
                this.m.a(this.d);
                return true;
            }
        } catch (Exception e2) {
            Hg.d(a, "Failed to log feed card impression.", e2);
        }
        return false;
    }

    public boolean m() {
        return h() != -1 && h() <= dn.a();
    }

    public boolean n() {
        return this.f;
    }

    public void a(boolean z) {
        this.f = z;
        setChanged();
        notifyObservers();
        if (z) {
            try {
                this.m.b(this.d);
            } catch (Exception e2) {
                Hg.a(a, "Failed to mark card as read.", e2);
            }
        }
    }

    public JSONObject forJsonPut() {
        return this.b;
    }

    public boolean a(EnumSet<Gf> enumSet) {
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            if (this.k.contains((Gf) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        if (!Ng.d(this.d)) {
            return true;
        }
        Hg.b(a, "Card ID cannot be null");
        return false;
    }
}
