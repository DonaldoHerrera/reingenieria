package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.soundcloud.android.playback.core.d;

/* renamed from: fna reason: default package and case insensitive filesystem */
/* compiled from: PlaybackManager.kt */
final class C4561fna<T> implements C6776kQa<PlaybackStateCompat> {
    final /* synthetic */ C3968cna a;
    final /* synthetic */ _Xa b;

    C4561fna(C3968cna cna, _Xa _xa) {
        this.a = cna;
        this.b = _xa;
    }

    /* renamed from: a */
    public final void accept(PlaybackStateCompat playbackStateCompat) {
        d a2 = this.a.g;
        StringBuilder sb = new StringBuilder();
        sb.append("loadInitialPlaybackState [");
        sb.append(playbackStateCompat);
        sb.append(']');
        a2.b("PlaybackManager", sb.toString());
        _Xa _xa = this.b;
        C7471uYa.a((Object) playbackStateCompat, "playbackState");
        _xa.invoke(playbackStateCompat);
    }
}
