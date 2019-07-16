package defpackage;

import android.webkit.WebView;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: nH reason: default package and case insensitive filesystem */
public abstract class C3143nH {
    private C3124mH a = new C3124mH(null);
    private C2046GG b;
    private C2313UG c;
    private a d;
    private double e;

    /* renamed from: nH$a */
    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_HIDDEN
    }

    public C3143nH() {
        i();
    }

    public void a() {
    }

    public void a(float f) {
        C2423_G.a().a(h(), f);
    }

    public void a(C2046GG gg) {
        this.b = gg;
    }

    public void a(C2085IG ig) {
        C2423_G.a().a(h(), ig.c());
    }

    public void a(C2142LG lg, String str) {
        C2423_G.a().a(h(), lg, str);
    }

    public void a(C2218PG pg, C2104JG jg) {
        String b2 = pg.b();
        JSONObject jSONObject = new JSONObject();
        String str = "app";
        C3010gH.a(jSONObject, "environment", str);
        C3010gH.a(jSONObject, "adSessionType", jg.a());
        C3010gH.a(jSONObject, "deviceInfo", C2991fH.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C3010gH.a(jSONObject, "supports", jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        C3010gH.a(jSONObject2, "partnerName", jg.d().a());
        C3010gH.a(jSONObject2, "partnerVersion", jg.d().b());
        C3010gH.a(jSONObject, "omidNativeInfo", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C3010gH.a(jSONObject3, "libraryVersion", "1.2.8-Soundcloud");
        C3010gH.a(jSONObject3, "appId", C2385YG.a().b().getApplicationContext().getPackageName());
        C3010gH.a(jSONObject, str, jSONObject3);
        if (jg.b() != null) {
            C3010gH.a(jSONObject, "customReferenceData", jg.b());
        }
        JSONObject jSONObject4 = new JSONObject();
        for (C2199OG og : jg.e()) {
            C3010gH.a(jSONObject4, og.b(), og.c());
        }
        C2423_G.a().a(h(), b2, jSONObject, jSONObject4);
    }

    public void a(C2313UG ug) {
        this.c = ug;
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView) {
        this.a = new C3124mH(webView);
    }

    public void a(String str) {
        C2423_G.a().a(h(), str, (JSONObject) null);
    }

    public void a(String str, double d2) {
        if (d2 > this.e) {
            this.d = a.AD_STATE_VISIBLE;
            C2423_G.a().c(h(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        C2423_G.a().a(h(), str, jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            C2423_G.a().d(h(), z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.a.clear();
    }

    public void b(String str, double d2) {
        if (d2 > this.e) {
            a aVar = this.d;
            a aVar2 = a.AD_STATE_HIDDEN;
            if (aVar != aVar2) {
                this.d = aVar2;
                C2423_G.a().c(h(), str);
            }
        }
    }

    public C2046GG c() {
        return this.b;
    }

    public C2313UG d() {
        return this.c;
    }

    public boolean e() {
        return this.a.get() != null;
    }

    public void f() {
        C2423_G.a().a(h());
    }

    public void g() {
        C2423_G.a().b(h());
    }

    public WebView h() {
        return (WebView) this.a.get();
    }

    public void i() {
        this.e = C3048iH.a();
        this.d = a.AD_STATE_IDLE;
    }
}
