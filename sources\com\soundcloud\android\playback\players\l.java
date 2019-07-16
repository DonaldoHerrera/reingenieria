package com.soundcloud.android.playback.players;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat.Builder;
import com.soundcloud.android.playback.core.Stream;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J8\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;", "", "skipActionsProvider", "Lcom/soundcloud/android/playback/players/SkipActionsProvider;", "(Lcom/soundcloud/android/playback/players/SkipActionsProvider;)V", "create", "Landroid/support/v4/media/session/PlaybackStateCompat;", "state", "", "position", "", "duration", "reason", "Lcom/soundcloud/android/playback/core/state/PlayStateReason;", "playerType", "", "stream", "Lcom/soundcloud/android/playback/core/Stream;", "otherExtras", "Landroid/os/Bundle;", "createExtrasBundle", "getAvailableActions", "isBufferingOrPlaying", "", "Companion", "players_release"}, mv = {1, 1, 15})
/* compiled from: PlaybackStateCompatFactory.kt */
public final class l {
    public static final a a = new a(null);
    private final q b;

    /* compiled from: PlaybackStateCompatFactory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public l(q qVar) {
        C7471uYa.b(qVar, "skipActionsProvider");
        this.b = qVar;
    }

    public static /* synthetic */ PlaybackStateCompat a(l lVar, int i, long j, long j2, Jla jla, String str, Stream stream, Bundle bundle, int i2, Object obj) {
        return lVar.a(i, j, j2, (i2 & 8) != 0 ? null : jla, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : stream, (i2 & 64) != 0 ? null : bundle);
    }

    public final PlaybackStateCompat a(int i, long j, long j2, Jla jla, String str, Stream stream, Bundle bundle) {
        int i2 = i;
        long j3 = j;
        PlaybackStateCompat build = new Builder().setActions(a(i2 == 6 || i2 == 3)).setState(i, j, 1.0f).setExtras(a(jla, j2, str, stream, bundle)).build();
        C7471uYa.a((Object) build, "PlaybackStateCompat.Buil…ras)\n            .build()");
        return build;
    }

    private final long a(boolean z) {
        long j;
        long j2;
        if (z) {
            j2 = 1536 | this.b.a();
            j = 2;
        } else {
            j2 = 1536 | this.b.a();
            j = 4;
        }
        return j2 | j;
    }

    private final Bundle a(Jla jla, long j, String str, Stream stream, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (jla != null) {
            bundle2.putSerializable("reason", jla);
        }
        if (stream != null) {
            bundle2.putParcelable("stream", stream);
        }
        if (str != null) {
            bundle2.putString("playerType", str);
        }
        bundle2.putLong("duration", j);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }
}
