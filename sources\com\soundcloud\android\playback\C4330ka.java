package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.ka reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionStateProvider.kt */
final /* synthetic */ class C4330ka extends C7402tYa implements _Xa<C4519wc, RVa> {
    C4330ka(C4350oa oaVar) {
        super(1, oaVar);
    }

    public final void a(C4519wc wcVar) {
        C7471uYa.b(wcVar, "p1");
        ((C4350oa) this.c).a(wcVar);
    }

    public final String getName() {
        return "saveAndEmitNewProgress";
    }

    public final C7610wZa h() {
        return HYa.a(C4350oa.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C4519wc) obj);
        return RVa.a;
    }

    public final String j() {
        return "saveAndEmitNewProgress(Lcom/soundcloud/android/playback/PlaybackProgress;)V";
    }
}
