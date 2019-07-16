package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.ja reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionStateProvider.kt */
final /* synthetic */ class C4325ja extends C7402tYa implements _Xa<C4513vb, RVa> {
    C4325ja(C4350oa oaVar) {
        super(1, oaVar);
    }

    public final void a(C4513vb vbVar) {
        C7471uYa.b(vbVar, "p1");
        ((C4350oa) this.c).b(vbVar);
    }

    public final String getName() {
        return "saveAndEmitNewPlayState";
    }

    public final C7610wZa h() {
        return HYa.a(C4350oa.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C4513vb) obj);
        return RVa.a;
    }

    public final String j() {
        return "saveAndEmitNewPlayState(Lcom/soundcloud/android/playback/PlayStateCompatWrapper;)V";
    }
}
