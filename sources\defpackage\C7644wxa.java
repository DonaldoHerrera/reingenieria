package defpackage;

import android.content.Context;

/* renamed from: wxa reason: default package and case insensitive filesystem */
/* compiled from: TrackArtworkProvider_Factory */
public final class C7644wxa implements C4961HMa<C7575vxa> {
    private final C7054oVa<C7440tyb> a;
    private final C7054oVa<C6494gGa> b;
    private final C7054oVa<Context> c;

    public C7644wxa(C7054oVa<C7440tyb> ova, C7054oVa<C6494gGa> ova2, C7054oVa<Context> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C7644wxa a(C7054oVa<C7440tyb> ova, C7054oVa<C6494gGa> ova2, C7054oVa<Context> ova3) {
        return new C7644wxa(ova, ova2, ova3);
    }

    public C7575vxa get() {
        return new C7575vxa(C4930GMa.a(this.a), (C6494gGa) this.b.get(), (Context) this.c.get());
    }
}
