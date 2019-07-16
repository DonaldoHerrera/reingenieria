package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.ia reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionStateProvider.kt */
final /* synthetic */ class C4320ia extends C7402tYa implements C6308dYa<C4513vb, C4513vb, Boolean> {
    C4320ia(C4350oa oaVar) {
        super(2, oaVar);
    }

    public final boolean a(C4513vb vbVar, C4513vb vbVar2) {
        C7471uYa.b(vbVar, "p1");
        C7471uYa.b(vbVar2, "p2");
        return ((C4350oa) this.c).a(vbVar, vbVar2);
    }

    public final String getName() {
        return "urnAndStateUnchanged";
    }

    public final C7610wZa h() {
        return HYa.a(C4350oa.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((C4513vb) obj, (C4513vb) obj2));
    }

    public final String j() {
        return "urnAndStateUnchanged(Lcom/soundcloud/android/playback/PlayStateCompatWrapper;Lcom/soundcloud/android/playback/PlayStateCompatWrapper;)Z";
    }
}
