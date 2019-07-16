package defpackage;

import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.Db;

/* renamed from: WIa reason: default package and case insensitive filesystem */
/* compiled from: MixedItemClickListener_Factory_Factory */
public final class C5411WIa implements C4961HMa<a> {
    private final C7054oVa<Db> a;
    private final C7054oVa<C4425ta> b;
    private final C7054oVa<C4655rja> c;

    public C5411WIa(C7054oVa<Db> ova, C7054oVa<C4425ta> ova2, C7054oVa<C4655rja> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5411WIa a(C7054oVa<Db> ova, C7054oVa<C4425ta> ova2, C7054oVa<C4655rja> ova3) {
        return new C5411WIa(ova, ova2, ova3);
    }

    public a get() {
        return new a((Db) this.a.get(), (C4425ta) this.b.get(), (C4655rja) this.c.get());
    }
}
