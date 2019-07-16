package defpackage;

import com.soundcloud.android.activities.C2542g;
import com.soundcloud.android.collection.playhistory.C2794w;
import com.soundcloud.android.collection.recentlyplayed.C2828q;
import com.soundcloud.android.likes.C3973c;
import com.soundcloud.android.offline.Ic;
import com.soundcloud.android.profile.C5854u;
import com.soundcloud.android.stations.Xb;
import com.soundcloud.android.stream.C;

/* renamed from: Gya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideCleanupHelpersFactory */
public final class C4947Gya implements C4961HMa<C5612aya> {
    private final C7054oVa<C3973c> a;
    private final C7054oVa<C2542g> b;
    private final C7054oVa<C5854u> c;
    private final C7054oVa<C3845pba> d;
    private final C7054oVa<Ic> e;
    private final C7054oVa<C3507cca> f;
    private final C7054oVa<Xb> g;
    private final C7054oVa<C> h;
    private final C7054oVa<C2828q> i;
    private final C7054oVa<C2794w> j;
    private final C7054oVa<C6826lBa> k;

    public C4947Gya(C7054oVa<C3973c> ova, C7054oVa<C2542g> ova2, C7054oVa<C5854u> ova3, C7054oVa<C3845pba> ova4, C7054oVa<Ic> ova5, C7054oVa<C3507cca> ova6, C7054oVa<Xb> ova7, C7054oVa<C> ova8, C7054oVa<C2828q> ova9, C7054oVa<C2794w> ova10, C7054oVa<C6826lBa> ova11) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
        this.j = ova10;
        this.k = ova11;
    }

    public static C4947Gya a(C7054oVa<C3973c> ova, C7054oVa<C2542g> ova2, C7054oVa<C5854u> ova3, C7054oVa<C3845pba> ova4, C7054oVa<Ic> ova5, C7054oVa<C3507cca> ova6, C7054oVa<Xb> ova7, C7054oVa<C> ova8, C7054oVa<C2828q> ova9, C7054oVa<C2794w> ova10, C7054oVa<C6826lBa> ova11) {
        C4947Gya gya = new C4947Gya(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11);
        return gya;
    }

    public static C5612aya a(C3973c cVar, C2542g gVar, C5854u uVar, C3845pba pba, Ic ic, C3507cca cca, Xb xb, C c2, C2828q qVar, C2794w wVar, C6826lBa lba) {
        C5612aya a2 = C7853zya.a(cVar, gVar, uVar, pba, ic, cca, xb, c2, qVar, wVar, lba);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C5612aya get() {
        return a((C3973c) this.a.get(), (C2542g) this.b.get(), (C5854u) this.c.get(), (C3845pba) this.d.get(), (Ic) this.e.get(), (C3507cca) this.f.get(), (Xb) this.g.get(), (C) this.h.get(), (C2828q) this.i.get(), (C2794w) this.j.get(), (C6826lBa) this.k.get());
    }
}
