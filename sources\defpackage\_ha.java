package defpackage;

import com.soundcloud.android.main.M;
import com.soundcloud.android.main.Z;

/* renamed from: _ha reason: default package */
/* compiled from: MainNavController_Factory */
public final class _ha implements C4961HMa<Zha> {
    private final C7054oVa<Z> a;
    private final C7054oVa<Wha> b;
    private final C7054oVa<M> c;

    public _ha(C7054oVa<Z> ova, C7054oVa<Wha> ova2, C7054oVa<M> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static _ha a(C7054oVa<Z> ova, C7054oVa<Wha> ova2, C7054oVa<M> ova3) {
        return new _ha(ova, ova2, ova3);
    }

    public Zha get() {
        return new Zha((Z) this.a.get(), (Wha) this.b.get(), (M) this.c.get());
    }
}
