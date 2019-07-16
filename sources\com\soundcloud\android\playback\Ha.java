package com.soundcloud.android.playback;

import android.os.Build.VERSION;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import com.soundcloud.android.properties.j;
import java.util.List;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/playback/MediaControllerCallback;", "Landroid/support/v4/media/session/MediaControllerCompat$Callback;", "playSessionStateProvider", "Lcom/soundcloud/android/playback/DefaultPlaySessionStateProvider;", "playQueueAdvancer", "Lcom/soundcloud/android/playback/PlayQueueAdvancer;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "(Lcom/soundcloud/android/playback/DefaultPlaySessionStateProvider;Lcom/soundcloud/android/playback/PlayQueueAdvancer;Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "onPlaybackStateChanged", "", "stateCompat", "Landroid/support/v4/media/session/PlaybackStateCompat;", "onQueueChanged", "queue", "", "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: MediaControllerCallback.kt */
public final class Ha extends Callback {
    public static final a a = new a(null);
    private final C4350oa b;
    private final Wa c;
    private final C3469VY d;

    /* compiled from: MediaControllerCallback.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Ha(C4350oa oaVar, Wa wa, C3469VY vy) {
        C7471uYa.b(oaVar, "playSessionStateProvider");
        C7471uYa.b(wa, "playQueueAdvancer");
        C7471uYa.b(vy, "errorReporter");
        this.b = oaVar;
        this.c = wa;
        this.d = vy;
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        String str = "MediaControllerCallback";
        b a2 = SDb.a(str);
        StringBuilder sb = new StringBuilder();
        sb.append("onPlaybackStateChanged() called with: state = [");
        sb.append(playbackStateCompat);
        sb.append(']');
        a2.a(sb.toString(), new Object[0]);
        if (playbackStateCompat != null) {
            C4513vb vbVar = new C4513vb(playbackStateCompat);
            this.b.a(vbVar);
            this.c.a(vbVar);
            return;
        }
        SDb.a(str).d("Ignored the playback state update since it is null", new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Received unexpected null PlaybackStateCompat instance on API ");
        sb2.append(VERSION.SDK_INT);
        sb2.append('.');
        Ma ma = new Ma(sb2.toString());
        if (!j.e()) {
            defpackage.C3469VY.a.a(this.d, ma, null, 2, null);
            return;
        }
        throw ma;
    }

    public void onQueueChanged(List<QueueItem> list) {
        C7471uYa.b(list, "queue");
        b a2 = SDb.a("MediaController");
        StringBuilder sb = new StringBuilder();
        sb.append("onQueueChanged() called with size = ");
        sb.append(list.size());
        a2.a(sb.toString(), new Object[0]);
    }
}
