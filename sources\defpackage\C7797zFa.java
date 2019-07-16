package defpackage;

import com.soundcloud.android.sync.T;

/* renamed from: zFa reason: default package and case insensitive filesystem */
/* compiled from: DefaultUserRepository_Factory */
public final class C7797zFa implements C4961HMa<C7728yFa> {
    private final C7054oVa<C1472lW> a;
    private final C7054oVa<T> b;
    private final C7054oVa<HPa> c;
    private final C7054oVa<C2034FO> d;

    public C7797zFa(C7054oVa<C1472lW> ova, C7054oVa<T> ova2, C7054oVa<HPa> ova3, C7054oVa<C2034FO> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C7797zFa a(C7054oVa<C1472lW> ova, C7054oVa<T> ova2, C7054oVa<HPa> ova3, C7054oVa<C2034FO> ova4) {
        return new C7797zFa(ova, ova2, ova3, ova4);
    }

    public C7728yFa get() {
        return new C7728yFa((C1472lW) this.a.get(), (T) this.b.get(), (HPa) this.c.get(), (C2034FO) this.d.get());
    }
}
