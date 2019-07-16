package defpackage;

import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.collections.data.K;

/* renamed from: LS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations_Factory */
public final class C2154LS implements C4961HMa<C1938AS> {
    private final C7054oVa<Aa> a;
    private final C7054oVa<K> b;
    private final C7054oVa<C4942Gta> c;
    private final C7054oVa<C4785Bra> d;
    private final C7054oVa<HPa> e;

    public C2154LS(C7054oVa<Aa> ova, C7054oVa<K> ova2, C7054oVa<C4942Gta> ova3, C7054oVa<C4785Bra> ova4, C7054oVa<HPa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C2154LS a(C7054oVa<Aa> ova, C7054oVa<K> ova2, C7054oVa<C4942Gta> ova3, C7054oVa<C4785Bra> ova4, C7054oVa<HPa> ova5) {
        C2154LS ls = new C2154LS(ova, ova2, ova3, ova4, ova5);
        return ls;
    }

    public C1938AS get() {
        C1938AS as = new C1938AS((Aa) this.a.get(), (K) this.b.get(), (C4942Gta) this.c.get(), (C4785Bra) this.d.get(), (HPa) this.e.get());
        return as;
    }
}
