package defpackage;

import bo.app.bg;
import bo.app.bo;
import bo.app.bx;
import bo.app.du;
import bo.app.fb;
import bo.app.fd;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kg reason: default package and case insensitive filesystem */
public abstract class C1448kg extends C1325gg implements C1263eg {
    protected Sf j;
    private String k;
    private int l;
    private int m;
    private List<C1541ng> n;
    private Integer o;
    private Wf p;
    private boolean q;
    private String r;

    protected C1448kg() {
        this.l = 0;
        this.m = 0;
        this.j = Sf.TOP;
        this.o = null;
        this.p = Wf.CENTER;
        this.r = null;
    }

    public void a(List<C1541ng> list) {
        this.n = list;
    }

    public int b() {
        return this.m;
    }

    public Integer c() {
        return this.o;
    }

    public String d() {
        return this.k;
    }

    public Wf e() {
        return this.p;
    }

    public int f() {
        return this.l;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.putOpt("header", this.k);
            forJsonPut.put("header_text_color", this.l);
            forJsonPut.put("close_btn_color", this.m);
            forJsonPut.putOpt("image_style", this.j.toString());
            forJsonPut.putOpt("text_align_header", this.p.toString());
            if (this.o != null) {
                forJsonPut.put("frame_color", this.o.intValue());
            }
            if (this.n != null) {
                JSONArray jSONArray = new JSONArray();
                for (C1541ng forJsonPut2 : this.n) {
                    jSONArray.put(forJsonPut2.forJsonPut());
                }
                forJsonPut.put("btns", jSONArray);
            }
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void onAfterClosed() {
        super.onAfterClosed();
        if (this.q && !Ng.d(this.d) && !Ng.d(this.r)) {
            this.i.a((fb) new fd(this.d, this.r));
        }
    }

    public Sf u() {
        return this.j;
    }

    public List<C1541ng> v() {
        return this.n;
    }

    public boolean a(C1541ng ngVar) {
        if (Ng.d(this.b) && Ng.d(this.c) && Ng.d(this.d)) {
            Hg.a(C1325gg.a, "Campaign, trigger, and card Ids not found. Not logging button click.");
            return false;
        } else if (ngVar == null) {
            Hg.e(C1325gg.a, "Message button was null. Ignoring button click.");
            return false;
        } else if (this.q) {
            Hg.c(C1325gg.a, "Button click already logged for this message. Ignoring.");
            return false;
        } else if (this.i == null) {
            Hg.b(C1325gg.a, "Cannot log a button click because the AppboyManager is null.");
            return false;
        } else {
            try {
                bx a = bx.a(this.b, this.c, this.d, ngVar);
                this.r = bx.a(ngVar);
                this.i.a((bo) a);
                this.q = true;
                return true;
            } catch (JSONException e) {
                this.i.a((Throwable) e);
                return false;
            }
        }
    }

    public C1448kg(JSONObject jSONObject, bg bgVar) {
        JSONObject jSONObject2 = jSONObject;
        bg bgVar2 = bgVar;
        this(jSONObject2, bgVar2, jSONObject.optString("header"), jSONObject.optInt("header_text_color"), jSONObject.optInt("close_btn_color"), (Sf) du.a(jSONObject, "image_style", Sf.class, Sf.TOP), (Wf) du.a(jSONObject, "text_align_header", Wf.class, Wf.CENTER), (Wf) du.a(jSONObject, "text_align_message", Wf.class, Wf.CENTER));
        String str = "btns";
        if (jSONObject.optJSONArray(str) != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C1541ng(optJSONArray.optJSONObject(i)));
            }
            a((List<C1541ng>) arrayList);
        }
    }

    private C1448kg(JSONObject jSONObject, bg bgVar, String str, int i, int i2, Sf sf, Wf wf, Wf wf2) {
        super(jSONObject, bgVar);
        this.l = 0;
        this.m = 0;
        this.j = Sf.TOP;
        this.o = null;
        this.p = Wf.CENTER;
        this.r = null;
        this.k = str;
        this.l = i;
        this.m = i2;
        String str2 = "frame_color";
        if (jSONObject.has(str2)) {
            this.o = Integer.valueOf(jSONObject.optInt(str2));
        }
        this.j = sf;
        this.p = wf;
        this.f = wf2;
    }
}
