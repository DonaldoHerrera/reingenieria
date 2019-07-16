package com.soundcloud.android.tracks;

/* renamed from: com.soundcloud.android.tracks.w reason: case insensitive filesystem */
/* compiled from: DefaultTrackRepository.kt */
final class C6204w<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ D a;
    final /* synthetic */ C3508cda b;

    C6204w(D d, C3508cda cda) {
        this.a = d;
        this.b = cda;
    }

    /* renamed from: a */
    public final APa<Pda<C3509cea>> apply(MV mv) {
        C7471uYa.b(mv, "networkResult");
        return QV.a(this.a.c(this.b), this.b, mv);
    }
}
