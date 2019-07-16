package defpackage;

import android.media.MediaPlayer;
import com.soundcloud.android.playback.core.d;

/* renamed from: yma reason: default package and case insensitive filesystem */
/* compiled from: MediaPlayerManager.kt */
public class C4721yma {
    /* access modifiers changed from: private */
    public final d a;

    public C4721yma(d dVar) {
        C7471uYa.b(dVar, "logger");
        this.a = dVar;
    }

    public MediaPlayer a() {
        return new MediaPlayer();
    }

    public void a(MediaPlayer mediaPlayer) {
        C7471uYa.b(mediaPlayer, "mediaPlayer");
        new C4712xma(this, mediaPlayer).start();
    }
}
