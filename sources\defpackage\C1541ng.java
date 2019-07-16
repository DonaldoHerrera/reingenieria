package defpackage;

import android.net.Uri;
import bo.app.du;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ng reason: default package and case insensitive filesystem */
public class C1541ng implements C1294fg<JSONObject> {
    private static final String a = Hg.a(C1541ng.class);
    private JSONObject b;
    private int c;
    private Pf d;
    private Uri e;
    private String f;
    private int g;
    private int h;
    private boolean i;

    public C1541ng() {
        this.c = -1;
        this.d = Pf.NONE;
        this.g = 0;
        this.h = 0;
    }

    public int getBackgroundColor() {
        return this.g;
    }

    public Pf getClickAction() {
        return this.d;
    }

    public Uri getUri() {
        return this.e;
    }

    public int h() {
        return this.c;
    }

    public boolean i() {
        return this.i;
    }

    public String j() {
        return this.f;
    }

    public int k() {
        return this.h;
    }

    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.c);
            jSONObject.put("click_action", this.d.toString());
            if (this.e != null) {
                jSONObject.put("uri", this.e.toString());
            }
            jSONObject.putOpt("text", this.f);
            jSONObject.put("bg_color", this.g);
            jSONObject.put("text_color", this.h);
            jSONObject.put("use_webview", this.i);
            return jSONObject;
        } catch (JSONException unused) {
            return this.b;
        }
    }

    public C1541ng(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this(jSONObject2, jSONObject.optInt("id", -1), (Pf) du.a(jSONObject, "click_action", Pf.class, Pf.NEWS_FEED), jSONObject.optString("uri"), jSONObject.optString("text"), jSONObject.optInt("bg_color"), jSONObject.optInt("text_color"), jSONObject.optBoolean("use_webview", false));
    }

    private C1541ng(JSONObject jSONObject, int i2, Pf pf, String str, String str2, int i3, int i4, boolean z) {
        this.c = -1;
        this.d = Pf.NONE;
        this.g = 0;
        this.h = 0;
        this.b = jSONObject;
        this.c = i2;
        this.d = pf;
        if (this.d == Pf.URI && !Ng.d(str)) {
            this.e = Uri.parse(str);
        }
        this.f = str2;
        this.g = i3;
        this.h = i4;
        this.i = z;
    }
}
