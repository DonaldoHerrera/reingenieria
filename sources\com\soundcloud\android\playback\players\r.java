package com.soundcloud.android.playback.players;

import com.soundcloud.android.playback.core.c;
import com.soundcloud.android.playback.core.g;
import com.soundcloud.android.playback.core.h;
import com.soundcloud.android.playback.players.playback.local.d;
import com.soundcloud.android.playback.players.playback.local.e;

@EVa(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/playback/players/SoundCloudPlayer;", "", "kits", "Lcom/soundcloud/android/playback/core/Kits;", "playerPicker", "Lcom/soundcloud/android/playback/players/PlayerPicker;", "mediaProvider", "Lcom/soundcloud/android/playback/players/queue/MediaProvider;", "localPlaybackAnalytics", "Lcom/soundcloud/android/playback/players/playback/local/LocalPlaybackAnalytics;", "mediaMetadataProvider", "Lcom/soundcloud/android/playback/players/mediasession/MediaNotificationProvider;", "castPlayback", "Lcom/soundcloud/android/playback/players/playback/Playback;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "(Lcom/soundcloud/android/playback/core/Kits;Lcom/soundcloud/android/playback/players/PlayerPicker;Lcom/soundcloud/android/playback/players/queue/MediaProvider;Lcom/soundcloud/android/playback/players/playback/local/LocalPlaybackAnalytics;Lcom/soundcloud/android/playback/players/mediasession/MediaNotificationProvider;Lcom/soundcloud/android/playback/players/playback/Playback;Lcom/soundcloud/android/playback/core/Logger;)V", "getLogger", "()Lcom/soundcloud/android/playback/core/Logger;", "addPerformanceListener", "", "playbackListener", "Lcom/soundcloud/android/playback/players/PerformanceListener;", "Builder", "Companion", "players_release"}, mv = {1, 1, 15})
/* compiled from: SoundCloudPlayer.kt */
public class r {
    public static final b a = new b(null);
    /* access modifiers changed from: private */
    public final c b;
    /* access modifiers changed from: private */
    public final o c;
    /* access modifiers changed from: private */
    public final C4609lna d;
    /* access modifiers changed from: private */
    public final d e;
    /* access modifiers changed from: private */
    public final Wma f;
    /* access modifiers changed from: private */
    public final C3952ana g;
    private final com.soundcloud.android.playback.core.d h;

    /* compiled from: SoundCloudPlayer.kt */
    public static final class a {
        private com.soundcloud.android.playback.core.d a = h.a;
        private c b = g.a;
        private d c = e.a;
        private C3952ana d = _ma.a;
        private o e = b.a;
        private final C4609lna f;
        private final Wma g;

        public a(C4609lna lna, Wma wma) {
            C7471uYa.b(lna, "mediaProvider");
            C7471uYa.b(wma, "mediaMetadataProvider");
            this.f = lna;
            this.g = wma;
        }

        public final a a(com.soundcloud.android.playback.core.d dVar) {
            C7471uYa.b(dVar, "logger");
            this.a = dVar;
            return this;
        }

        public final a a(c cVar) {
            C7471uYa.b(cVar, "kits");
            this.b = cVar;
            return this;
        }

        public final a a(d dVar) {
            C7471uYa.b(dVar, "localPlaybackAnalytics");
            this.c = dVar;
            return this;
        }

        public final a a(C3952ana ana) {
            C7471uYa.b(ana, "castPlayback");
            this.d = ana;
            return this;
        }

        public final a a(o oVar) {
            C7471uYa.b(oVar, "playerPicker");
            this.e = oVar;
            return this;
        }

        public final r a() {
            r rVar = new r(this.b, this.e, this.f, this.c, this.g, this.d, this.a, null);
            s.a = rVar;
            return rVar;
        }
    }

    /* compiled from: SoundCloudPlayer.kt */
    public static final class b {
        private b() {
        }

        @NXa
        public final C3952ana a() {
            if (s.b) {
                return _ma.a;
            }
            return s.a().g;
        }

        @NXa
        public final c b() {
            if (s.b) {
                return g.a;
            }
            return s.a().b;
        }

        @NXa
        public final c c() {
            return c.b;
        }

        @NXa
        public final d d() {
            if (s.b) {
                return e.a;
            }
            return s.a().e;
        }

        @NXa
        public final com.soundcloud.android.playback.core.d e() {
            if (s.b) {
                return h.a;
            }
            return s.a().a();
        }

        @NXa
        public final Wma f() {
            if (s.b) {
                return Zma.a;
            }
            return s.a().f;
        }

        @NXa
        public final C4609lna g() {
            C4609lna e = s.a().d;
            if (e != null) {
                return e;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @NXa
        public final o h() {
            if (s.b) {
                return b.a;
            }
            return s.a().c;
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }

        @NXa
        public final a a(C4609lna lna, Wma wma) {
            C7471uYa.b(lna, "mediaProvider");
            C7471uYa.b(wma, "mediaMetadataProvider");
            return new a(lna, wma);
        }
    }

    public /* synthetic */ r(c cVar, o oVar, C4609lna lna, d dVar, Wma wma, C3952ana ana, com.soundcloud.android.playback.core.d dVar2, C7264rYa rya) {
        this(cVar, oVar, lna, dVar, wma, ana, dVar2);
    }

    @NXa
    public static final a a(C4609lna lna, Wma wma) {
        return a.a(lna, wma);
    }

    private r(c cVar, o oVar, C4609lna lna, d dVar, Wma wma, C3952ana ana, com.soundcloud.android.playback.core.d dVar2) {
        this.b = cVar;
        this.c = oVar;
        this.d = lna;
        this.e = dVar;
        this.f = wma;
        this.g = ana;
        this.h = dVar2;
    }

    public com.soundcloud.android.playback.core.d a() {
        return this.h;
    }

    public void a(k kVar) {
        C7471uYa.b(kVar, "playbackListener");
        a.c().a(kVar);
    }
}
