package com.soundcloud.android.collection;

/* compiled from: ClearHistoryObserver.kt */
public final class r extends C5068Kua<Boolean> {
    private final int d;
    private final C5327TLa e;
    private final C5052KJa f;

    public r(int i, C5327TLa tLa, C5052KJa kJa) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(kJa, "feedbackController");
        this.d = i;
        this.e = tLa;
        this.f = kJa;
    }

    public void a(boolean z) {
        if (z) {
            C5327TLa tLa = this.e;
            C5443XLa<Daa> xLa = C3876taa.w;
            C7471uYa.a((Object) xLa, "EventQueue.PLAY_HISTORY");
            tLa.c(xLa, Daa.b());
        } else {
            C5052KJa kJa = this.f;
            Fca fca = new Fca(this.d, 1, 0, null, null, null, 60, null);
            kJa.a(fca);
        }
        super.onSuccess(Boolean.valueOf(z));
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        a(((Boolean) obj).booleanValue());
    }
}
