package defpackage;

import com.soundcloud.android.accounts.C2526g;

/* renamed from: VP reason: default package and case insensitive filesystem */
/* compiled from: OAuth_Factory */
public final class C2340VP implements C4961HMa<C2322UP> {
    private final C7054oVa<C2526g> a;
    private final C7054oVa<C2041FV> b;

    public C2340VP(C7054oVa<C2526g> ova, C7054oVa<C2041FV> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2340VP a(C7054oVa<C2526g> ova, C7054oVa<C2041FV> ova2) {
        return new C2340VP(ova, ova2);
    }

    public C2322UP get() {
        return new C2322UP((C2526g) this.a.get(), (C2041FV) this.b.get());
    }
}
