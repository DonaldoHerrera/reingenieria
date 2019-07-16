package com.soundcloud.android.offline;

import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.sync.SyncJobResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: OfflineContentController */
public class Mc {
    private final Yd a;
    private final C4197yd b;
    private final C5327TLa c;
    private final APa<Boolean> d;
    private final C3989m e;
    private final Qb f;
    private final UPa g = new UPa();

    Mc(C5327TLa tLa, C4088fe feVar, Yd yd, C4197yd ydVar, C3989m mVar, Qb qb) {
        this.a = yd;
        this.c = tLa;
        this.b = ydVar;
        this.d = feVar.f();
        this.e = mVar;
        this.f = qb;
    }

    private APa<Object> i() {
        return APa.a((EPa<? extends T>) j(), (EPa<? extends T>) k(), (EPa<? extends T>) g(), (EPa<? extends T>) r()).b((EPa<? extends T>) h());
    }

    private APa<Object> j() {
        return APa.b((EPa<? extends T>) p().d((C6776kQa<? super T>) new C4132na<Object>(this)), (EPa<? extends T>) m().d((C6776kQa<? super T>) new M<Object>(this)));
    }

    private APa<Boolean> k() {
        return this.e.g().c(1).g(new V(this)).a((C7256rQa<? super T>) C4090ga.a).d((C6776kQa<? super T>) new C4060ba<Object>(this));
    }

    private APa<Object> l() {
        return this.c.a(C3876taa.o).a((C7256rQa<? super T>) new C4138oa<Object>(this)).a((C7256rQa<? super T>) C4055ab.a).h(Y.a).g(new Z(this)).a(Object.class);
    }

    private APa<Object> m() {
        return this.c.a(C3876taa.q).h(Jaa.a).g(new P(this)).a((C7256rQa<? super T>) C4108ja.a).a(Object.class);
    }

    private APa<Object> n() {
        return this.e.c().c(1).a((C7256rQa<? super T>) new U<Object>(this)).h(C4113k.a).g(new C4084fa(this)).a(Object.class);
    }

    private APa<Object> o() {
        return this.c.a(C3876taa.o).a((C7256rQa<? super T>) J.a).h(L.a).g(new W(this)).a(Object.class);
    }

    private APa<Object> p() {
        APa h = this.c.a(C3876taa.n).a(SyncJobResult.a).h(C4121lb.a);
        C4197yd ydVar = this.b;
        ydVar.getClass();
        return h.g(new C4101i(ydVar)).a((C7256rQa<? super T>) C4054aa.a).a(Object.class);
    }

    private APa<Object> q() {
        return this.e.h().h(C4113k.a).g(new C4102ia(this)).a(Object.class);
    }

    private APa<Naa> r() {
        return this.c.a(C3876taa.v);
    }

    public void a() {
        this.g.b();
    }

    public /* synthetic */ void d(Boolean bool) throws Exception {
        this.f.a("Offline Likes changed");
    }

    public void f() {
        UPa uPa = this.g;
        APa f2 = i().f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C4114ka<Object,Object>(this));
        Yd yd = this.a;
        yd.getClass();
        uPa.b((VPa) f2.b((C6368eQa) new C4065c(yd)).c(this.a.b()));
    }

    public /* synthetic */ void g(Object obj) throws Exception {
        this.f.a("Offline Playlist Changed");
    }

    public /* synthetic */ C7669xPa h(Object obj) throws Exception {
        return this.b.i().a((C7256rQa<? super T>) X.a);
    }

    static /* synthetic */ boolean b(C6902mGa mga) throws Exception {
        return mga != C6902mGa.OFFLINE;
    }

    private APa<Object> g() {
        return APa.b((EPa<? extends T>) this.c.a(C3876taa.l).a((C7256rQa<? super T>) T.a).a((C7256rQa<? super T>) C4096ha.a).d().c(1).a(Object.class).d((C6776kQa<? super T>) new S<Object>(this)), (EPa<? extends T>) this.d.d((C6776kQa<? super T>) new C4066ca<Object>(this)));
    }

    private APa<Object> h() {
        return APa.a((EPa<? extends T>) l().d((C6776kQa<? super T>) new C4078ea<Object>(this)), (EPa<? extends T>) o().d((C6776kQa<? super T>) new C4126ma<Object>(this)), (EPa<? extends T>) n().d((C6776kQa<? super T>) new C4072da<Object>(this)), (EPa<? extends T>) q().d((C6776kQa<? super T>) new O<Object>(this)));
    }

    public /* synthetic */ MPa a(Set set) throws Exception {
        APa a2 = APa.a((Iterable<? extends T>) set);
        C4197yd ydVar = this.b;
        ydVar.getClass();
        return a2.g(new C4101i(ydVar)).r();
    }

    public /* synthetic */ void c(Object obj) throws Exception {
        this.f.a("Playlist removed from offline collection");
    }

    public /* synthetic */ void d(Object obj) throws Exception {
        this.f.a("Playlist liked while entire collection synced");
    }

    public /* synthetic */ void e(Object obj) throws Exception {
        this.f.a("Playlist un-liked while entire collection synced");
    }

    public /* synthetic */ void b(Object obj) throws Exception {
        this.f.a("Playlist added to offline collection");
    }

    public /* synthetic */ MPa a(Map map) throws Exception {
        return this.b.k();
    }

    public /* synthetic */ MPa c(ArrayList arrayList) throws Exception {
        return this.b.b((List<C3508cda>) arrayList).b((Callable<? extends T>) C4120la.a);
    }

    public /* synthetic */ MPa d(ArrayList arrayList) throws Exception {
        return this.b.b((List<C3508cda>) arrayList).b((Callable<? extends T>) N.a);
    }

    static /* synthetic */ boolean a(C6902mGa mga) throws Exception {
        return mga != C6902mGa.UNKNOWN;
    }

    public /* synthetic */ void a(Object obj) throws Exception {
        this.f.a("Network connection changed");
    }

    public /* synthetic */ boolean b(Set set) throws Exception {
        return this.b.j();
    }

    public /* synthetic */ void a(Boolean bool) throws Exception {
        this.f.a("Downloadable Network state changed");
    }

    public /* synthetic */ MPa b(ArrayList arrayList) throws Exception {
        return this.b.c((List<C3508cda>) arrayList).b((Callable<? extends T>) Q.a);
    }

    public /* synthetic */ void f(Object obj) throws Exception {
        this.f.a("Offline Playlist Synced");
    }

    public /* synthetic */ boolean a(C3490aba aba) throws Exception {
        return this.b.j();
    }

    public /* synthetic */ MPa a(ArrayList arrayList) throws Exception {
        return this.b.c((List<C3508cda>) arrayList).b((Callable<? extends T>) K.a);
    }
}
