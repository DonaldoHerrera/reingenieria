package defpackage;

import com.soundcloud.android.playback.players.q;

/* renamed from: Dma reason: default package */
/* compiled from: DefaultSkipActionsProvider.kt */
public final class Dma implements q {
    private final C3814lca a;

    public Dma(C3814lca lca) {
        C7471uYa.b(lca, "playQueueManager");
        this.a = lca;
    }

    public long a() {
        long j = 0;
        long j2 = this.a.u() ? 16 : 0;
        if (this.a.t()) {
            j = 32;
        }
        return j2 | j;
    }
}
