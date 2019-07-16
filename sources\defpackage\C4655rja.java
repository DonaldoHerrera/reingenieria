package defpackage;

/* renamed from: rja reason: default package and case insensitive filesystem */
/* compiled from: Navigator.kt */
public class C4655rja {
    private final C6713jVa<C4621nja> a;
    /* access modifiers changed from: private */
    public C4621nja b;
    private final C4806CMa<C4597kja> c;

    public C4655rja(C4806CMa<C4597kja> cMa) {
        C7471uYa.b(cMa, "navigationResolver");
        this.c = cMa;
        C6713jVa<C4621nja> s = C6713jVa.s();
        C7471uYa.a((Object) s, "BehaviorSubject.create<NavigationTarget>()");
        this.a = s;
    }

    /* access modifiers changed from: private */
    public IPa<C4605lja> b(C4621nja nja) {
        this.b = nja;
        return ((C4597kja) this.c.get()).a(nja);
    }

    public void a(C4621nja nja) {
        C7471uYa.b(nja, "navigationTarget");
        this.a.a(nja);
    }

    public APa<C4605lja> a() {
        APa<C4605lja> g = this.a.a((C7256rQa<? super T>) new C4629oja<Object>(this)).g(new C4646qja(new C4637pja(this)));
        C7471uYa.a((Object) g, "subject.filter { current…(this::performNavigation)");
        return g;
    }
}
