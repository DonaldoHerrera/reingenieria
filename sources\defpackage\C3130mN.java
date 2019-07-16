package defpackage;

/* renamed from: mN reason: default package and case insensitive filesystem */
/* compiled from: ApiMobileCrashReporter.kt */
public class C3130mN {
    private VPa a = C4881Eua.b();
    private final IPa<efa> b;
    private final C3216qN c;

    public C3130mN(IPa<efa> iPa, C3216qN qNVar) {
        C7471uYa.b(iPa, "lazyApiClient");
        C7471uYa.b(qNVar, "crashReporter");
        this.b = iPa;
        this.c = qNVar;
    }

    /* access modifiers changed from: private */
    public hfa b() {
        hfa b2 = hfa.c(C2226PO.CRASH.a()).c().b();
        C7471uYa.a((Object) b2, "ApiRequest.post(ApiEndpo…pi()\n            .build()");
        return b2;
    }

    public void a() {
        _Ua _ua = _Ua.a;
        APa a2 = this.c.a();
        APa j = this.b.j();
        C7471uYa.a((Object) j, "lazyApiClient.toObservable()");
        C6979nPa b2 = APa.a((EPa<? extends T1>) a2, (EPa<? extends T2>) j, (C6504gQa<? super T1, ? super T2, ? extends R>) new C3092kN<Object,Object,Object>()).g().b((C7118pQa<? super T, ? extends C7255rPa>) new C3111lN<Object,Object>(this));
        C4943Gua gua = new C4943Gua();
        b2.c(gua);
        C7471uYa.a((Object) gua, "Observables.combineLates…ultCompletableObserver())");
        this.a = gua;
    }
}
