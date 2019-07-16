package com.soundcloud.android.tracks;

import java.util.List;

/* renamed from: com.soundcloud.android.tracks.l reason: case insensitive filesystem */
/* compiled from: DefaultFullTrackRepository.kt */
final class C6181l<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3508cda a;

    C6181l(C3508cda cda) {
        this.a = cda;
    }

    /* renamed from: a */
    public final Pda<C3493aea> apply(Wfa<C3508cda, List<C3493aea>> wfa) {
        Kda kda;
        C7471uYa.b(wfa, "result");
        if (wfa instanceof Yfa) {
            return b.a.a(C7676xWa.f((List) ((Yfa) wfa).a()));
        }
        if (wfa instanceof Vfa) {
            return c.a.a(this.a, null);
        }
        if (wfa instanceof Rfa) {
            Rfa rfa = (Rfa) wfa;
            C4538dga a2 = rfa.a();
            if (a2 instanceof a) {
                kda = new Jda(rfa.a());
            } else if (a2 instanceof b) {
                kda = new Oda(rfa.a());
            } else {
                throw new FVa();
            }
            return c.a.a(this.a, kda);
        }
        throw new FVa();
    }
}
