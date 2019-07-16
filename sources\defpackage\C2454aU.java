package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.O;
import com.soundcloud.android.properties.j;
import java.util.List;

/* renamed from: aU reason: default package and case insensitive filesystem */
/* compiled from: DefaultFeatureOperations.kt */
public class C2454aU implements C2436_U {
    private final C2380XU a;
    private final C1960BU b;
    private final j c;
    private final C3700b d;

    public C2454aU(C2380XU xu, C1960BU bu, j jVar, C3700b bVar) {
        C7471uYa.b(xu, "featureStorage");
        C7471uYa.b(bu, "planStorage");
        C7471uYa.b(jVar, "applicationProperties");
        C7471uYa.b(bVar, "analytics");
        this.a = xu;
        this.b = bu;
        this.c = jVar;
        this.d = bVar;
    }

    public boolean a() {
        String str = "no_audio_ads";
        return !this.a.a(str, false) && b(str);
    }

    public boolean b() {
        return !l() && b("offline_sync");
    }

    public APa<Boolean> c() {
        return a("no_audio_ads");
    }

    public boolean d() {
        return this.a.a("hq_audio", false);
    }

    public APa<Boolean> e() {
        return a("development_menu");
    }

    public APa<Boolean> f() {
        return a("offline_sync");
    }

    public int g() {
        return this.b.b();
    }

    public boolean h() {
        return this.b.d().contains(C2455aV.HIGH_TIER) && this.b.d().contains(C2455aV.MID_TIER);
    }

    public void i() {
        this.d.a(O.SUBSCRIPTION_STATUS, C2455aV.UNDEFINED.a());
        this.b.a();
    }

    public boolean j() {
        return !this.a.a("no_audio_ads", false);
    }

    public boolean k() {
        return this.b.b() != 0;
    }

    public boolean l() {
        return this.a.a("offline_sync", false);
    }

    public boolean m() {
        return this.a.a("internal_qa", false);
    }

    public boolean n() {
        return this.b.f();
    }

    public boolean o() {
        return this.a.a("development_menu", this.c.k());
    }

    public boolean p() {
        return this.a.a("force_ad_testing", false);
    }

    public C2455aV q() {
        C2455aV c2 = this.b.c();
        C7471uYa.a((Object) c2, "planStorage.plan");
        return c2;
    }

    public boolean r() {
        return this.a.a("ads_krux", false);
    }

    public boolean s() {
        return this.b.d().contains(C2455aV.HIGH_TIER);
    }

    public boolean t() {
        return !d() && b("hq_audio");
    }

    public boolean u() {
        return C7471uYa.a((Object) "apple", (Object) this.b.e());
    }

    private final boolean b(String str) {
        return a(str, C2455aV.HIGH_TIER) && s();
    }

    public void a(List<C2417ZU> list) {
        C7471uYa.b(list, "features");
        this.a.a(list);
    }

    public void a(C2966dV dVVar) {
        C7471uYa.b(dVVar, "userPlan");
        this.b.a(dVVar.a());
        this.b.a(dVVar.b());
        this.b.a(C4928GKa.b(dVVar.d()));
        this.b.a(dVVar.c());
        this.d.a(O.SUBSCRIPTION_STATUS, dVVar.a().a());
    }

    private final boolean a(String str, C2455aV aVVar) {
        return this.a.a(str).contains(aVVar);
    }

    private final APa<Boolean> a(String str) {
        APa<Boolean> b2 = this.a.b(str);
        C7471uYa.a((Object) b2, "featureStorage.getUpdates(name)");
        return b2;
    }
}
