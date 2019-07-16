package defpackage;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.soundcloud.android.playback.core.d;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/playback/mediaplayer/PlaybackCompletionListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "mediaPlayerAdapter", "Lcom/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "(Lcom/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter;Lcom/soundcloud/android/playback/core/Logger;)V", "getTargetStopPosition", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "mediaPlayerHasReset", "", "mp", "onCompletion", "", "shouldAutoRetry", "lastPosition", "duration", "Companion", "mediaplayer_release"}, mv = {1, 1, 15})
/* renamed from: Ama reason: default package */
/* compiled from: PlaybackCompletionListener.kt */
public final class Ama implements OnCompletionListener {
    private static final long a = a;
    public static final a b = new a(null);
    private final C4685uma c;
    private final d d;

    /* renamed from: Ama$a */
    /* compiled from: PlaybackCompletionListener.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Ama(C4685uma uma, d dVar) {
        C7471uYa.b(uma, "mediaPlayerAdapter");
        this.c = uma;
        this.d = dVar;
    }

    private final boolean a(long j, long j2) {
        return this.c.m() && j2 - j > a;
    }

    private final boolean b(MediaPlayer mediaPlayer) {
        return mediaPlayer.getCurrentPosition() <= 0 && this.c.l();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C7471uYa.b(mediaPlayer, "mediaPlayer");
        long a2 = a(mediaPlayer);
        long duration = (long) mediaPlayer.getDuration();
        if (a(a2, duration)) {
            this.c.a(mediaPlayer, a2);
            d dVar = this.d;
            if (dVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("premature end of track [lastPosition = ");
                sb.append(a2);
                sb.append(", duration = ");
                sb.append(duration);
                sb.append(", diff = ");
                sb.append(duration - a2);
                sb.append(']');
                dVar.b("PlaybackCompletionListener", sb.toString());
            }
        } else if (this.c.k()) {
            this.c.a(mediaPlayer);
        } else {
            this.c.o();
        }
    }

    private final long a(MediaPlayer mediaPlayer) {
        String str = "PlaybackCompletionListener";
        if (this.c.j()) {
            long i = this.c.i();
            d dVar = this.d;
            if (dVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Calculating end pos from seek position ");
                sb.append(i);
                dVar.a(str, sb.toString());
            }
            return i;
        } else if (this.c.n()) {
            long h = this.c.h();
            d dVar2 = this.d;
            if (dVar2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Calculating end pos from resume position ");
                sb2.append(h);
                dVar2.a(str, sb2.toString());
            }
            return h;
        } else if (b(mediaPlayer)) {
            long duration = (long) mediaPlayer.getDuration();
            d dVar3 = this.d;
            if (dVar3 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Calculating end pos from completion position ");
                sb3.append(duration);
                dVar3.a(str, sb3.toString());
            }
            return duration;
        } else {
            int currentPosition = mediaPlayer.getCurrentPosition();
            d dVar4 = this.d;
            if (dVar4 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Calculating end pos from current position ");
                sb4.append(currentPosition);
                dVar4.a(str, sb4.toString());
            }
            return (long) currentPosition;
        }
    }
}
