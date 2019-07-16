package defpackage;

import android.content.Context;

/* renamed from: NU reason: default package and case insensitive filesystem */
/* compiled from: ExperimentStorage_Factory */
public final class C2194NU implements C4961HMa<C2156LU> {
    private final C7054oVa<Context> a;
    private final C7054oVa<a> b;

    public C2194NU(C7054oVa<Context> ova, C7054oVa<a> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2194NU a(C7054oVa<Context> ova, C7054oVa<a> ova2) {
        return new C2194NU(ova, ova2);
    }

    public C2156LU get() {
        return new C2156LU((Context) this.a.get(), (a) this.b.get());
    }
}
