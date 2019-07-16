package com.soundcloud.android.collection.playhistory;

/* compiled from: PlayHistoryController.kt */
final /* synthetic */ class B extends C7402tYa implements _Xa<Eaa, Boolean> {
    B(G g) {
        super(1, g);
    }

    public final boolean a(Eaa eaa) {
        C7471uYa.b(eaa, "p1");
        return ((G) this.c).a(eaa);
    }

    public final String getName() {
        return "isEligibleForHistory";
    }

    public final C7610wZa h() {
        return HYa.a(G.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Eaa) obj));
    }

    public final String j() {
        return "isEligibleForHistory(Lcom/soundcloud/android/events/PlayQueueItemStateChangedEvent;)Z";
    }
}
