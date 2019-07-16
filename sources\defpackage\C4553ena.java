package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.soundcloud.android.playback.players.l;

/* renamed from: ena reason: default package and case insensitive filesystem */
/* compiled from: PlaybackManager.kt */
final class C4553ena<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ C3968cna a;

    C4553ena(C3968cna cna) {
        this.a = cna;
    }

    /* renamed from: a */
    public final C7531vPa<PlaybackStateCompat> apply(C4633ona ona) {
        C7471uYa.b(ona, "it");
        if (ona instanceof c) {
            c cVar = (c) ona;
            return C7531vPa.c(l.a(this.a.j, 0, cVar.a().g(), cVar.a().a(), null, null, null, cVar.a().b(), 56, null));
        } else if (ona instanceof a) {
            this.a.g.b("PlaybackManager", "loadInitialPlaybackState failed to load the playback item. Is the queue empty?");
            return C7531vPa.c();
        } else {
            throw new FVa();
        }
    }
}
