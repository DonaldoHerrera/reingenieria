package defpackage;

import org.json.JSONObject;

/* renamed from: UG reason: default package and case insensitive filesystem */
public final class C2313UG {
    private final C2218PG a;

    private C2313UG(C2218PG pg) {
        this.a = pg;
    }

    public static C2313UG a(C2066HG hg) {
        C2218PG pg = (C2218PG) hg;
        C3067jH.a((Object) hg, "AdSession is null");
        C3067jH.g(pg);
        C3067jH.a(pg);
        C3067jH.b(pg);
        C3067jH.e(pg);
        C2313UG ug = new C2313UG(pg);
        pg.k().a(ug);
        return ug;
    }

    private void a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Video duration");
        }
    }

    private void b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Video volume");
        }
    }

    public void a() {
        C3067jH.c(this.a);
        this.a.k().a("complete");
    }

    public void a(float f, float f2) {
        a(f);
        b(f2);
        C3067jH.c(this.a);
        JSONObject jSONObject = new JSONObject();
        C3010gH.a(jSONObject, "duration", Float.valueOf(f));
        C3010gH.a(jSONObject, "videoPlayerVolume", Float.valueOf(f2));
        C3010gH.a(jSONObject, "deviceVolume", Float.valueOf(C2442aH.a().d()));
        this.a.k().a("start", jSONObject);
    }

    public void a(C2237QG qg) {
        C3067jH.a((Object) qg, "InteractionType is null");
        C3067jH.c(this.a);
        JSONObject jSONObject = new JSONObject();
        C3010gH.a(jSONObject, "interactionType", qg);
        this.a.k().a("adUserInteraction", jSONObject);
    }

    public void a(C2256RG rg) {
        C3067jH.a((Object) rg, "PlayerState is null");
        C3067jH.c(this.a);
        JSONObject jSONObject = new JSONObject();
        C3010gH.a(jSONObject, "state", rg);
        this.a.k().a("playerStateChange", jSONObject);
    }

    public void a(C2294TG tg) {
        C3067jH.a((Object) tg, "VastProperties is null");
        C3067jH.b(this.a);
        this.a.k().a("loaded", tg.a());
    }

    public void b() {
        C3067jH.c(this.a);
        this.a.k().a("firstQuartile");
    }

    public void c() {
        C3067jH.c(this.a);
        this.a.k().a("midpoint");
    }

    public void d() {
        C3067jH.c(this.a);
        this.a.k().a("pause");
    }

    public void e() {
        C3067jH.c(this.a);
        this.a.k().a("resume");
    }

    public void f() {
        C3067jH.c(this.a);
        this.a.k().a("skipped");
    }

    public void g() {
        C3067jH.c(this.a);
        this.a.k().a("thirdQuartile");
    }
}
