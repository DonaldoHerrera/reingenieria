package defpackage;

import com.soundcloud.android.activities.w;
import com.soundcloud.android.stream.lb;

/* renamed from: Qsa reason: default package and case insensitive filesystem */
/* compiled from: RemovePlaylistFromDatabaseCommand_Factory */
public final class C5248Qsa implements C4961HMa<C5218Psa> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C4942Gta> b;
    private final C7054oVa<C6332dsa> c;
    private final C7054oVa<lb> d;
    private final C7054oVa<w> e;

    public C5248Qsa(C7054oVa<C5500ZKa> ova, C7054oVa<C4942Gta> ova2, C7054oVa<C6332dsa> ova3, C7054oVa<lb> ova4, C7054oVa<w> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C5248Qsa a(C7054oVa<C5500ZKa> ova, C7054oVa<C4942Gta> ova2, C7054oVa<C6332dsa> ova3, C7054oVa<lb> ova4, C7054oVa<w> ova5) {
        C5248Qsa qsa = new C5248Qsa(ova, ova2, ova3, ova4, ova5);
        return qsa;
    }

    public C5218Psa get() {
        C5218Psa psa = new C5218Psa((C5500ZKa) this.a.get(), (C4942Gta) this.b.get(), (C6332dsa) this.c.get(), (lb) this.d.get(), (w) this.e.get());
        return psa;
    }
}
