package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.events.I;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0012J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010\r\u001a\u00020\b*\u00020\u0003H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/playback/PlayQueueAdvancer;", "", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "(Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;)V", "isUnrecoverableErrorDuringAutoPlay", "", "playStateCompatWrapper", "Lcom/soundcloud/android/playback/PlayStateCompatWrapper;", "onPlaybackStateChanged", "", "isInAutoPlay", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayQueueAdvancer.kt */
public class Wa {
    public static final a a = new a(null);
    private final C3814lca b;
    private final C6834lGa c;

    /* compiled from: PlayQueueAdvancer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Wa(C3814lca lca, C6834lGa lga) {
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(lga, "connectionHelper");
        this.b = lca;
        this.c = lga;
    }

    private boolean b(C4513vb vbVar) {
        return vbVar.o() && a(this.b) && this.c.d();
    }

    public void a(C4513vb vbVar) {
        C7471uYa.b(vbVar, "playStateCompatWrapper");
        if (b(vbVar)) {
            SDb.a("PlayQueueAdvancer").d("Playback transitioned to an unrecoverable error! Let's skip this item in the queue.", new Object[0]);
            this.b.c();
        }
    }

    private boolean a(C3814lca lca) {
        I l = lca.l();
        return !(l != null ? l.u() : false);
    }
}
