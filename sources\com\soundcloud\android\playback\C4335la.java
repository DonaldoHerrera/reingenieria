package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.la reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionStateProvider.kt */
final class C4335la<T> implements C7733yKa<C4519wc> {
    final /* synthetic */ C4350oa a;
    final /* synthetic */ C3508cda b;

    C4335la(C4350oa oaVar, C3508cda cda) {
        this.a = oaVar;
        this.b = cda;
    }

    /* renamed from: a */
    public final void accept(C4519wc wcVar) {
        C5327TLa a2 = this.a.g;
        C5443XLa<C4519wc> xLa = C3876taa.c;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_PROGRESS");
        C7471uYa.a((Object) wcVar, "playbackProgress");
        C4519wc wcVar2 = new C4519wc(0, wcVar.c(), this.b);
        a2.c(xLa, wcVar2);
    }
}
