package defpackage;

import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.la;

/* renamed from: yR reason: default package and case insensitive filesystem */
/* compiled from: FollowingStateProvider_Factory */
public final class C3380yR implements C4961HMa<C3360xR> {
    private final C7054oVa<Cba> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<HPa> c;
    private final C7054oVa<la> d;
    private final C7054oVa<T> e;

    public C3380yR(C7054oVa<Cba> ova, C7054oVa<C5327TLa> ova2, C7054oVa<HPa> ova3, C7054oVa<la> ova4, C7054oVa<T> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C3380yR a(C7054oVa<Cba> ova, C7054oVa<C5327TLa> ova2, C7054oVa<HPa> ova3, C7054oVa<la> ova4, C7054oVa<T> ova5) {
        C3380yR yRVar = new C3380yR(ova, ova2, ova3, ova4, ova5);
        return yRVar;
    }

    public C3360xR get() {
        C3360xR xRVar = new C3360xR((Cba) this.a.get(), (C5327TLa) this.b.get(), (HPa) this.c.get(), (la) this.d.get(), (T) this.e.get());
        return xRVar;
    }
}
