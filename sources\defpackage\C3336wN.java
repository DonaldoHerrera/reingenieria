package defpackage;

import android.content.Context;

/* renamed from: wN reason: default package and case insensitive filesystem */
/* compiled from: FabricProvider_Factory */
public final class C3336wN implements C4961HMa<C3296uN> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3236rN> b;

    public C3336wN(C7054oVa<Context> ova, C7054oVa<C3236rN> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3336wN a(C7054oVa<Context> ova, C7054oVa<C3236rN> ova2) {
        return new C3336wN(ova, ova2);
    }

    public C3296uN get() {
        return new C3296uN((Context) this.a.get(), (C3236rN) this.b.get());
    }
}
