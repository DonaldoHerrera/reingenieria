package defpackage;

import java.util.concurrent.Callable;

/* renamed from: pJ reason: default package and case insensitive filesystem */
/* compiled from: OMStorage.kt */
public class C3193pJ {
    private final IPa<String> a;
    /* access modifiers changed from: private */
    public final C6494gGa b;

    public C3193pJ(C6494gGa gga) {
        C7471uYa.b(gga, "fileHelper");
        this.b = gga;
        IPa<String> p = APa.c((Callable<? extends T>) new C3174oJ<Object>(this)).c().p();
        C7471uYa.a((Object) p, "Observable.fromCallable …\n        .singleOrError()");
        this.a = p;
    }

    public IPa<String> a() {
        return this.a;
    }
}
