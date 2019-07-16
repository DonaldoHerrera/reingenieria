package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import bo.app.bg;
import bo.app.bo;
import bo.app.bx;
import bo.app.du;
import bo.app.fb;
import bo.app.fd;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gg reason: default package and case insensitive filesystem */
public abstract class C1325gg implements C0522cg {
    public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
    public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
    public static final String TYPE = "type";
    protected static final String a = Hg.a(C1325gg.class);
    private boolean A;
    private boolean B;
    private String C;
    private long D;
    protected String b;
    protected String c;
    protected String d;
    protected Qf e;
    protected Wf f;
    protected boolean g;
    protected JSONObject h;
    protected bg i;
    private String j;
    private Map<String, String> k;
    private boolean l;
    private boolean m;
    private Pf n;
    private Uri o;
    private Rf p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private String v;
    private String w;
    private Uf x;
    private Bitmap y;
    private boolean z;

    protected C1325gg() {
        this.l = true;
        this.m = true;
        this.n = Pf.NONE;
        this.p = Rf.AUTO_DISMISS;
        this.q = 5000;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.x = Uf.ANY;
        this.z = false;
        this.e = Qf.FIT_CENTER;
        this.f = Wf.CENTER;
        this.g = false;
        this.A = false;
        this.B = false;
        this.D = -1;
    }

    public boolean getAnimateIn() {
        return this.l;
    }

    public boolean getAnimateOut() {
        return this.m;
    }

    public int getBackgroundColor() {
        return this.r;
    }

    public Bitmap getBitmap() {
        return this.y;
    }

    public Pf getClickAction() {
        return this.n;
    }

    public Qf getCropType() {
        return this.e;
    }

    public Rf getDismissType() {
        return this.p;
    }

    public int getDurationInMilliseconds() {
        return this.q;
    }

    public long getExpirationTimestamp() {
        return this.D;
    }

    public Map<String, String> getExtras() {
        return this.k;
    }

    public String getIcon() {
        return this.v;
    }

    public int getIconBackgroundColor() {
        return this.u;
    }

    public int getIconColor() {
        return this.t;
    }

    public boolean getImageDownloadSuccessful() {
        return this.z;
    }

    public String getImageUrl() {
        return getRemoteImageUrl();
    }

    public String getLocalImageUrl() {
        return this.C;
    }

    public String getMessage() {
        return this.j;
    }

    public Wf getMessageTextAlign() {
        return this.f;
    }

    public int getMessageTextColor() {
        return this.s;
    }

    public boolean getOpenUriInWebView() {
        return this.g;
    }

    public Uf getOrientation() {
        return this.x;
    }

    public String getRemoteAssetPathForPrefetch() {
        return getRemoteImageUrl();
    }

    public String getRemoteImageUrl() {
        return this.w;
    }

    public Uri getUri() {
        return this.o;
    }

    public boolean logClick() {
        if (Ng.d(this.b) && Ng.d(this.c) && Ng.d(this.d)) {
            Hg.a(a, "Campaign, card, and trigger Ids not found. Not logging in-app message click.");
            return false;
        } else if (this.B) {
            Hg.c(a, "Click already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.i == null) {
            Hg.b(a, "Cannot log an in-app message click because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.i.a((bo) bx.c(this.b, this.c, this.d));
                this.B = true;
                return true;
            } catch (JSONException e2) {
                this.i.a((Throwable) e2);
                return false;
            }
        }
    }

    public boolean logImpression() {
        if (Ng.e(this.b) && Ng.e(this.c) && Ng.e(this.d)) {
            Hg.a(a, "Campaign, card, and trigger Ids not found. Not logging in-app message impression.");
            return false;
        } else if (this.A) {
            Hg.c(a, "Impression already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.i == null) {
            Hg.b(a, "Cannot log an in-app message impression because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.i.a((bo) bx.b(this.b, this.c, this.d));
                this.A = true;
                return true;
            } catch (JSONException e2) {
                this.i.a((Throwable) e2);
                return false;
            }
        }
    }

    public void onAfterClosed() {
        if (this.B && !Ng.e(this.d)) {
            this.i.a((fb) new fd(this.d));
        }
    }

    public void setAnimateIn(boolean z2) {
        this.l = z2;
    }

    public void setAnimateOut(boolean z2) {
        this.m = z2;
    }

    public void setBackgroundColor(int i2) {
        this.r = i2;
    }

    public void setBitmap(Bitmap bitmap) {
        this.y = bitmap;
    }

    public boolean setClickAction(Pf pf) {
        if (pf != Pf.URI) {
            this.n = pf;
            this.o = null;
            return true;
        }
        Hg.b(a, "A non-null URI is required in order to set the message ClickAction to URI.");
        return false;
    }

    public void setCropType(Qf qf) {
        this.e = qf;
    }

    public void setDismissType(Rf rf) {
        this.p = rf;
    }

    public void setDurationInMilliseconds(int i2) {
        String str = " milliseconds.";
        if (i2 < 999) {
            this.q = 5000;
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Requested in-app message duration ");
            sb.append(i2);
            sb.append(" is lower than the minimum of ");
            sb.append(INAPP_MESSAGE_DURATION_MIN_MILLIS);
            sb.append(". Defaulting to ");
            sb.append(this.q);
            sb.append(str);
            Hg.e(str2, sb.toString());
            return;
        }
        this.q = i2;
        String str3 = a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Set in-app message duration to ");
        sb2.append(this.q);
        sb2.append(str);
        Hg.a(str3, sb2.toString());
    }

    public void setExpirationTimestamp(long j2) {
        this.D = j2;
    }

    public void setIcon(String str) {
        this.v = str;
    }

    public void setIconBackgroundColor(int i2) {
        this.u = i2;
    }

    public void setIconColor(int i2) {
        this.t = i2;
    }

    public void setImageDownloadSuccessful(boolean z2) {
        this.z = z2;
    }

    public void setImageUrl(String str) {
        setRemoteImageUrl(str);
    }

    public void setLocalAssetPathForPrefetch(String str) {
        setLocalImageUrl(str);
    }

    public void setLocalImageUrl(String str) {
        this.C = str;
    }

    public void setMessage(String str) {
        this.j = str;
    }

    public void setMessageTextAlign(Wf wf) {
        this.f = wf;
    }

    public void setMessageTextColor(int i2) {
        this.s = i2;
    }

    public void setOpenUriInWebView(boolean z2) {
        this.g = z2;
    }

    public void setOrientation(Uf uf) {
        this.x = uf;
    }

    public void setRemoteImageUrl(String str) {
        this.w = str;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("message", this.j);
            jSONObject2.put("duration", this.q);
            jSONObject2.putOpt("campaign_id", this.b);
            jSONObject2.putOpt("card_id", this.c);
            jSONObject2.putOpt("trigger_id", this.d);
            jSONObject2.putOpt("click_action", this.n.toString());
            jSONObject2.putOpt("message_close", this.p.toString());
            if (this.o != null) {
                jSONObject2.put("uri", this.o.toString());
            }
            jSONObject2.put("use_webview", this.g);
            jSONObject2.put("animate_in", this.l);
            jSONObject2.put("animate_out", this.m);
            jSONObject2.put("bg_color", this.r);
            jSONObject2.put("text_color", this.s);
            jSONObject2.put("icon_color", this.t);
            jSONObject2.put("icon_bg_color", this.u);
            jSONObject2.putOpt("icon", this.v);
            jSONObject2.putOpt("image_url", this.w);
            jSONObject2.putOpt("crop_type", this.e.toString());
            jSONObject2.putOpt("orientation", this.x.toString());
            jSONObject2.putOpt("text_align_message", this.f.toString());
            if (this.k != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (String str : this.k.keySet()) {
                    jSONObject3.put(str, this.k.get(str));
                }
                jSONObject2.put("extras", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean setClickAction(Pf pf, Uri uri) {
        if (uri == null && pf == Pf.URI) {
            Hg.b(a, "A non-null URI is required in order to set the message ClickAction to URI.");
            return false;
        } else if (uri == null || pf != Pf.URI) {
            return setClickAction(pf);
        } else {
            this.n = pf;
            this.o = uri;
            return true;
        }
    }

    public C1325gg(JSONObject jSONObject, bg bgVar) {
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = jSONObject;
        bg bgVar2 = bgVar;
        String optString = jSONObject2.optString("message");
        Map a2 = du.a(jSONObject2.optJSONObject("extras"), (Map<String, String>) new HashMap<String,String>());
        boolean optBoolean = jSONObject2.optBoolean("animate_in", true);
        String str = optString;
        JSONObject jSONObject4 = jSONObject2;
        Map map = a2;
        boolean z2 = optBoolean;
        this(str, map, z2, jSONObject2.optBoolean("animate_out", true), (Pf) du.a(jSONObject2, "click_action", Pf.class, Pf.NONE), jSONObject2.optString("uri"), jSONObject2.optInt("bg_color"), jSONObject2.optInt("icon_color"), jSONObject2.optInt("icon_bg_color"), jSONObject2.optInt("text_color"), jSONObject2.optString("icon"), jSONObject2.optString("image_url"), (Rf) du.a(jSONObject2, "message_close", Rf.class, Rf.AUTO_DISMISS), jSONObject2.optInt("duration"), jSONObject2.optString("campaign_id"), jSONObject4.optString("card_id"), jSONObject4.optString("trigger_id"), false, false, (Uf) du.a(jSONObject4, "orientation", Uf.class, Uf.ANY), jSONObject4.optBoolean("use_webview", false), jSONObject3, bgVar2);
    }

    private C1325gg(String str, Map<String, String> map, boolean z2, boolean z3, Pf pf, String str2, int i2, int i3, int i4, int i5, String str3, String str4, Rf rf, int i6, String str5, String str6, String str7, boolean z4, boolean z5, Uf uf, boolean z6, JSONObject jSONObject, bg bgVar) {
        Rf rf2 = rf;
        this.l = true;
        this.m = true;
        this.n = Pf.NONE;
        this.p = Rf.AUTO_DISMISS;
        this.q = 5000;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.x = Uf.ANY;
        this.z = false;
        this.e = Qf.FIT_CENTER;
        this.f = Wf.CENTER;
        this.g = false;
        this.A = false;
        this.B = false;
        this.D = -1;
        this.j = str;
        this.k = map;
        this.l = z2;
        this.m = z3;
        this.n = pf;
        if (this.n == Pf.URI && !Ng.d(str2)) {
            this.o = Uri.parse(str2);
        }
        if (rf2 == Rf.SWIPE) {
            this.p = Rf.MANUAL;
        } else {
            this.p = rf2;
        }
        setDurationInMilliseconds(i6);
        this.r = i2;
        this.t = i3;
        this.u = i4;
        this.s = i5;
        this.v = str3;
        this.w = str4;
        this.x = uf;
        this.b = str5;
        this.c = str6;
        this.d = str7;
        this.A = z4;
        this.B = z5;
        this.g = z6;
        this.h = jSONObject;
        this.i = bgVar;
    }
}
