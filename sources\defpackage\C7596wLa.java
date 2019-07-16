package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wLa reason: default package and case insensitive filesystem */
/* compiled from: PropellerRx */
class C7596wLa implements Callable<EPa<? extends C5631bLa>> {
    final /* synthetic */ C6975nLa a;
    final /* synthetic */ C4898FLa b;

    C7596wLa(C4898FLa fLa, C6975nLa nla) {
        this.b = fLa;
        this.a = nla;
    }

    public APa<C5631bLa> call() {
        return APa.c(this.b.a.a(this.a));
    }
}
