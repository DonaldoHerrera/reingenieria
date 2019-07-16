package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: HI reason: default package and case insensitive filesystem */
/* compiled from: OMAdSessionWrapper.kt */
public class C2068HI {
    private final C7181qKa a;

    public C2068HI(C7181qKa qka) {
        C7471uYa.b(qka, "appConfig");
        this.a = qka;
    }

    public C2066HG a(C2048GI gi) throws IllegalStateException {
        C7471uYa.b(gi, "omAdSessionParams");
        C2066HG a2 = C2066HG.a(C2085IG.a(C2161MG.NATIVE, gi.e(), false), C2104JG.a(C2180NG.a("Soundcloud", this.a.g()), gi.c(), gi.d(), ""));
        a2.b(gi.b());
        List<View> a3 = gi.a();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a3, 10));
        for (View a4 : a3) {
            a2.a(a4);
            arrayList.add(RVa.a);
        }
        C7471uYa.a((Object) a2, "session");
        return a2;
    }

    public void b(C2066HG hg) {
        C7471uYa.b(hg, "adSession");
        hg.c();
    }

    public void c(C2066HG hg) {
        C7471uYa.b(hg, "adSession");
        hg.a();
    }

    public void d(C1948BI bi) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().c();
    }

    public void e(C1948BI bi) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().d();
    }

    public void f(C1948BI bi) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().e();
    }

    public void g(C1948BI bi) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().f();
    }

    public void h(C1948BI bi) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().g();
    }

    public void b(C1948BI bi) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().a();
    }

    public void c(C1948BI bi) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().b();
    }

    public void d(C2066HG hg) throws IllegalStateException {
        C7471uYa.b(hg, "session");
        hg.a(C2142LG.VIDEO, "Failed to load the video ad");
    }

    public C1948BI a(C2066HG hg) throws IllegalStateException {
        C7471uYa.b(hg, "adSession");
        C2046GG a2 = C2046GG.a(hg);
        C2313UG a3 = C2313UG.a(hg);
        C7471uYa.a((Object) a2, "adEvents");
        C7471uYa.a((Object) a3, "videoEvents");
        return new C1948BI(hg, a2, a3);
    }

    public void a(C2066HG hg, View view) {
        C7471uYa.b(hg, "adSession");
        C7471uYa.b(view, "adView");
        hg.b(view);
    }

    public void a(C1948BI bi, float f, float f2) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().a(f, f2);
    }

    public void a(C1948BI bi, C2256RG rg) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        C7471uYa.b(rg, "playerState");
        bi.c().a(rg);
    }

    public void a(C1948BI bi, float f, boolean z) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().a(C2294TG.a(f, z, C2275SG.PREROLL));
    }

    public void a(C1948BI bi, boolean z) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().a(C2294TG.a(z, C2275SG.PREROLL));
    }

    public void a(C2046GG gg) throws IllegalStateException {
        C7471uYa.b(gg, "adEvents");
        gg.a();
    }

    public void a(C1948BI bi) throws IllegalStateException {
        C7471uYa.b(bi, "adSessionData");
        bi.c().a(C2237QG.CLICK);
    }
}
