package com.soundcloud.android.tracks;

/* renamed from: com.soundcloud.android.tracks.ua reason: case insensitive filesystem */
/* compiled from: TrackItemRepository.kt */
final class C6201ua<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Ca a;

    C6201ua(Ca ca) {
        this.a = ca;
    }

    /* renamed from: a */
    public final APa<C6185ma> apply(Pda<C3493aea> pda) {
        C7471uYa.b(pda, "response");
        if (pda instanceof b) {
            return APa.c(this.a.c.a((C3493aea) ((b) pda).a()));
        }
        if (pda instanceof a) {
            return APa.e();
        }
        if (pda instanceof c) {
            return APa.b((Throwable) ((c) pda).a());
        }
        throw new FVa();
    }
}
