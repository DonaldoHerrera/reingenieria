package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vLa reason: default package and case insensitive filesystem */
/* compiled from: PropellerRx */
class C7527vLa implements Callable<EPa<? extends C6431fLa>> {
    final /* synthetic */ a a;
    final /* synthetic */ C4898FLa b;

    C7527vLa(C4898FLa fLa, a aVar) {
        this.b = fLa;
        this.a = aVar;
    }

    public APa<C6431fLa> call() {
        return C4898FLa.a(this.b.a.a(this.a));
    }
}
