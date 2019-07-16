package defpackage;

import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.ImagesContract;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.j;
import java.util.concurrent.TimeUnit;

/* renamed from: gO reason: default package and case insensitive filesystem */
/* compiled from: MobilePlaySessionAnalyticsProvider.kt */
public class C3017gO implements C3131mO {
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa a = new UPa();
    private final C6781kVa<C2320UN> b;
    /* access modifiers changed from: private */
    public final C3074jO c;
    /* access modifiers changed from: private */
    public final efa d;
    private final HPa e;
    private final HPa f;
    private final a g;

    public C3017gO(C3074jO jOVar, efa efa, HPa hPa, HPa hPa2, a aVar) {
        C7471uYa.b(jOVar, "mobilePlayBuilder");
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(hPa2, "timeoutScheduler");
        C7471uYa.b(aVar, "appFeatures");
        this.c = jOVar;
        this.d = efa;
        this.e = hPa;
        this.f = hPa2;
        this.g = aVar;
        C6781kVa<C2320UN> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.b = s;
        this.c.a((C3131mO) this);
        if (this.g.a((a) j.a)) {
            c();
        }
    }

    private void c() {
        UPa a2 = a();
        GPa c2 = d().a(this.e).h(C2338VN.a).h(C2356WN.a).g(new C2374XN(this)).d((C6776kQa<? super T>) C2392YN.a).h(C2411ZN.a).j(C2430_N.a).c(new C2449aO());
        C7471uYa.a((Object) c2, "playSessionEvents()\n    …faultObserver<Unit>() {})");
        XUa.a(a2, (VPa) c2);
    }

    private APa<C2320UN> d() {
        APa<C2320UN> b2 = APa.b((EPa<? extends T>) b(), (EPa<? extends T>) e());
        C7471uYa.a((Object) b2, "Observable.merge<MobileP…Sessions, runtimeFlush())");
        return b2;
    }

    private APa<C2320UN> e() {
        APa<C2320UN> h = APa.b(60, TimeUnit.SECONDS, this.f).d((C6776kQa<? super T>) C2468bO.a).a((C7256rQa<? super T>) new C2487cO<Object>(this)).d((C6776kQa<? super T>) C2960dO.a).d((C6776kQa<? super T>) new C2979eO<Object>(this)).h(new C2998fO(this));
        C7471uYa.a((Object) h, "Observable.interval(INTE…der.getCurrentSession() }");
        return h;
    }

    public UPa a() {
        return this.a;
    }

    public C6781kVa<C2320UN> b() {
        return this.b;
    }

    public void a(C2320UN un) {
        C7471uYa.b(un, "mobilePlay");
        b().a(un);
    }

    public void b(C4431ub ubVar) {
        C7471uYa.b(ubVar, ImagesContract.LOCAL);
        if (this.g.a((a) j.a)) {
            SDb.a("MobilePlay").d("Incoming Play", new Object[0]);
            this.c.b(ubVar);
        }
    }

    public void a(C4431ub ubVar) {
        C7471uYa.b(ubVar, "playState");
        if (this.g.a((a) j.a)) {
            SDb.a("MobilePlay").d("Incoming Checkpoint", new Object[0]);
            this.c.a(ubVar);
        }
    }

    public void c(C4431ub ubVar) {
        C7471uYa.b(ubVar, "playState");
        if (this.g.a((a) j.a)) {
            SDb.a("MobilePlay").d("Incoming Stop", new Object[0]);
            this.c.c(ubVar);
        }
    }
}
