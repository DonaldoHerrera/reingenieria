package defpackage;

import android.content.Context;

/* renamed from: sxa reason: default package and case insensitive filesystem */
/* compiled from: SharingStickerUriProvider_Factory */
public final class C7368sxa implements C4961HMa<C7230qxa> {
    private final C7054oVa<C6494gGa> a;
    private final C7054oVa<Context> b;

    public C7368sxa(C7054oVa<C6494gGa> ova, C7054oVa<Context> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C7368sxa a(C7054oVa<C6494gGa> ova, C7054oVa<Context> ova2) {
        return new C7368sxa(ova, ova2);
    }

    public C7230qxa get() {
        return new C7230qxa((C6494gGa) this.a.get(), (Context) this.b.get());
    }
}
