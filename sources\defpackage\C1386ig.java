package defpackage;

import bo.app.bg;
import bo.app.bo;
import bo.app.bx;
import bo.app.fb;
import bo.app.fd;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ig reason: default package and case insensitive filesystem */
public abstract class C1386ig extends C1325gg implements C1233dg {
    private String j;
    private String k;
    private boolean l;
    private String m;

    protected C1386ig() {
        this.l = false;
        this.m = null;
        this.g = true;
    }

    public void a(String str) {
        this.k = str;
    }

    public String b() {
        return this.j;
    }

    public String c() {
        return this.k;
    }

    public String getRemoteAssetPathForPrefetch() {
        return b();
    }

    public void onAfterClosed() {
        super.onAfterClosed();
        if (this.l && !Ng.d(this.d) && !Ng.d(this.m)) {
            this.i.a((fb) new fd(this.d, this.m));
        }
    }

    public void setLocalAssetPathForPrefetch(String str) {
        a(str);
    }

    public boolean b(String str) {
        if (Ng.e(this.b) && Ng.e(this.c) && Ng.e(this.d)) {
            Hg.a(C1325gg.a, "Campaign, card, and trigger Ids not found. Not logging html in-app message click.");
            return false;
        } else if (Ng.d(str)) {
            Hg.c(C1325gg.a, "Button Id was null or blank for this html in-app message. Ignoring.");
            return false;
        } else if (this.l) {
            Hg.c(C1325gg.a, "Button click already logged for this html in-app message. Ignoring.");
            return false;
        } else if (this.i == null) {
            Hg.b(C1325gg.a, "Cannot log an html in-app message button click because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.i.a((bo) bx.a(this.b, this.c, this.d, str));
                this.m = str;
                this.l = true;
                return true;
            } catch (JSONException e) {
                this.i.a((Throwable) e);
                return false;
            }
        }
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.putOpt("zipped_assets_url", this.j);
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C1386ig(JSONObject jSONObject, bg bgVar) {
        super(jSONObject, bgVar);
        this.l = false;
        this.m = null;
        String str = "zipped_assets_url";
        if (!Ng.d(jSONObject.optString(str))) {
            this.j = jSONObject.optString(str);
        }
        this.g = jSONObject.optBoolean("use_webview", true);
    }
}
