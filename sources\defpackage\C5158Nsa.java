package defpackage;

import com.soundcloud.android.offline.Gd;

/* renamed from: Nsa reason: default package and case insensitive filesystem */
/* compiled from: RemovePlaylistCommand_Factory */
public final class C5158Nsa implements C4961HMa<C5128Msa> {
    private final C7054oVa<C5218Psa> a;
    private final C7054oVa<Gd> b;

    public C5158Nsa(C7054oVa<C5218Psa> ova, C7054oVa<Gd> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5158Nsa a(C7054oVa<C5218Psa> ova, C7054oVa<Gd> ova2) {
        return new C5158Nsa(ova, ova2);
    }

    public C5128Msa get() {
        return new C5128Msa((C5218Psa) this.a.get(), (Gd) this.b.get());
    }
}
