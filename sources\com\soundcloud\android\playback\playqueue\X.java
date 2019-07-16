package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.playback.C4519wc;

/* compiled from: ArtworkPresenter.kt */
final class X extends C7540vYa implements _Xa<Long, Kna> {
    final /* synthetic */ C4519wc a;

    X(C4519wc wcVar) {
        this.a = wcVar;
        super(1);
    }

    public final Kna a(long j) {
        C4519wc wcVar = this.a;
        String str = "progress";
        C7471uYa.a((Object) wcVar, str);
        long d = wcVar.d();
        C4519wc wcVar2 = this.a;
        C7471uYa.a((Object) wcVar2, str);
        long c = wcVar2.c();
        C4519wc wcVar3 = this.a;
        C7471uYa.a((Object) wcVar3, str);
        Kna kna = new Kna(d, c, j, wcVar3.b());
        return kna;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
