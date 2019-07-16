package defpackage;

import com.soundcloud.android.image.C3734o;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: UT reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationOperations */
public class C2325UT {
    static final long a = TimeUnit.MINUTES.toMillis(30);
    private final efa b;
    private final dfa c;
    private final C2137KU d;
    private final C2436_U e;
    private final C3223qU f;
    private final C3041hU g;
    private final C3184oU h;
    private final C2343VT i;
    private final C3734o j;
    private final C3129mM k;
    private final C5439XHa<C2212OT> l;
    private final HPa m;

    public C2325UT(dfa dfa, efa efa, C2137KU ku, C2436_U _u, C3184oU oUVar, C2343VT vt, a aVar, HPa hPa, C3223qU qUVar, C3041hU hUVar, C3734o oVar, C3129mM mMVar) {
        this(dfa, efa, ku, _u, qUVar, hUVar, oUVar, vt, oVar, mMVar, aVar.a(), hPa);
    }

    private Callable<C2212OT> b(hfa hfa) {
        return new C2039FT(this, hfa);
    }

    private IPa<C2212OT> c(hfa hfa) {
        return IPa.a((LPa<T>) new C1959BT<T>(this, hfa));
    }

    private b g() {
        return hfa.b(C2226PO.CONFIGURATION.a()).a("experiment_layers", (Object[]) this.d.b()).c();
    }

    private static C7531vPa<C2212OT> h() {
        return C7531vPa.c();
    }

    public /* synthetic */ void a(hfa hfa, JPa jPa) throws Exception {
        try {
            jPa.onSuccess((C2212OT) this.l.a(b(hfa)));
        } catch (Exception e2) {
            if (!jPa.b(e2)) {
                C7316sHa.b((Throwable) e2, C2325UT.class);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public APa<C2212OT> d() {
        return c(g().b()).b(this.m).j();
    }

    /* access modifiers changed from: 0000 */
    public APa<C2212OT> e() {
        if (this.i.e() < System.currentTimeMillis() - a) {
            return d();
        }
        SDb.a("Configuration").a("Skipping fetch; recently updated.", new Object[0]);
        return APa.e();
    }

    public C6979nPa f() {
        return this.b.a(g().b(), C2212OT.class).b(this.m).c((C6776kQa<? super T>) new C2117JT<Object>(this)).h();
    }

    /* access modifiers changed from: 0000 */
    public C7531vPa<C2212OT> b(C2455aV aVVar) {
        return APa.a(2, 2, TimeUnit.SECONDS, this.m).d(10).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C1999DT<Object,Object>(this)).a((C7256rQa<? super T>) new C2019ET<Object>(aVVar)).f().b((C6776kQa<? super T>) new C2117JT<Object>(this));
    }

    public C6979nPa c() {
        return this.b.b(hfa.a(C2226PO.DEVICE_REGISTRATION.a()).c().b()).c((C6776kQa<? super T>) C2059GT.a).a((C6776kQa<? super Throwable>) C1979CT.a).a(Object.class).h().f();
    }

    C2325UT(dfa dfa, efa efa, C2137KU ku, C2436_U _u, C3223qU qUVar, C3041hU hUVar, C3184oU oUVar, C2343VT vt, C3734o oVar, C3129mM mMVar, C5439XHa<C2212OT> xHa, HPa hPa) {
        this.c = dfa;
        this.b = efa;
        this.f = qUVar;
        this.g = hUVar;
        this.j = oVar;
        this.d = ku;
        this.e = _u;
        this.h = oUVar;
        this.i = vt;
        this.k = mMVar;
        this.l = xHa;
        this.m = hPa;
    }

    public /* synthetic */ C2212OT a(hfa hfa) throws Exception {
        return (C2212OT) this.c.a(hfa, C2212OT.class);
    }

    /* access modifiers changed from: 0000 */
    public C7531vPa<C2212OT> a(C2455aV aVVar) {
        return b(aVVar);
    }

    /* access modifiers changed from: 0000 */
    public C7531vPa<C2212OT> a() {
        if (this.h.e()) {
            return b(this.h.b());
        }
        return h();
    }

    public C2492cU b(C2358WP wp) throws ifa, IOException, Lea {
        SDb.a("Configuration").a("Registering device", new Object[0]);
        C2212OT ot = (C2212OT) this.c.a(g().b("Authorization", C2322UP.a(wp)).b(), C2212OT.class);
        b(ot);
        return ot.b();
    }

    public /* synthetic */ EPa a(Long l2) throws Exception {
        return c(g().b()).j();
    }

    public C2492cU a(C2358WP wp) throws ifa, IOException, Lea {
        SDb.a("Configuration").a("Forcing device registration", new Object[0]);
        C2212OT ot = (C2212OT) this.c.a(hfa.c(C2226PO.CONFIGURATION.a()).b("Authorization", C2322UP.a(wp)).c().b(), C2212OT.class);
        b(ot);
        return ot.b();
    }

    private void b(C2212OT ot) {
        if (!ot.b().b()) {
            a(ot);
        }
    }

    public void b() {
        this.i.a();
    }

    public void a(C2212OT ot) {
        SDb.a("Configuration").a("Saving new configuration...", new Object[0]);
        this.i.a(System.currentTimeMillis());
        this.g.a(ot);
        this.d.a(ot.a());
        this.j.a(ot.d());
        this.e.a(ot.c());
        this.f.a(ot.f().a());
        this.e.a(ot.f());
        a(ot.e());
    }

    private void a(C2155LT lt) {
        this.k.a(lt);
    }
}
