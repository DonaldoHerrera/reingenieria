package defpackage;

import android.media.MediaPlayer;
import com.soundcloud.android.playback.core.d.a;

/* renamed from: xma reason: default package and case insensitive filesystem */
/* compiled from: MediaPlayerManager.kt */
public final class C4712xma extends Thread {
    final /* synthetic */ C4721yma a;
    final /* synthetic */ MediaPlayer b;

    C4712xma(C4721yma yma, MediaPlayer mediaPlayer) {
        this.a = yma;
        this.b = mediaPlayer;
    }

    public void run() {
        try {
            this.b.reset();
            this.b.release();
        } catch (IllegalStateException e) {
            a.a(this.a.a, new C4667sma("Not able to reset and release MediaPlayer instance asynchronously", e), null, 2, null);
        }
    }
}
