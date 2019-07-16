package com.soundcloud.android.playback;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.m;
import com.soundcloud.android.playback.players.o;
import com.soundcloud.android.properties.m.n;
import java.util.List;

@EVa(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001 B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\f\u0010\u001f\u001a\u00020\u001b*\u00020\u0005H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/soundcloud/android/playback/PlaybackPlayerPicker;", "Lcom/soundcloud/android/playback/players/PlayerPicker;", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "deviceHelper", "Lcom/soundcloud/android/utils/DeviceHelper;", "(Lcom/soundcloud/android/properties/AppFeatures;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lcom/soundcloud/android/utils/DeviceHelper;)V", "getAppFeatures", "()Lcom/soundcloud/android/properties/AppFeatures;", "getDeviceHelper", "()Lcom/soundcloud/android/utils/DeviceHelper;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "adPlayers", "", "Lcom/soundcloud/android/exoplayer/ExoPlayer;", "audioPlayers", "Lcom/soundcloud/android/playback/core/PlayerType;", "getPlaybackItemForFallback", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "playbackItem", "progressWhenErrorOccurred", "", "getPlayersForItem", "isFallbackToFallbackPlayerAllowed", "", "offlinePlayers", "Lcom/soundcloud/android/playback/flipper/Flipper;", "shouldNotUseFlipper", "isFlipperBlacklisted", "NoSuchFallbackException", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.playback.uc reason: case insensitive filesystem */
/* compiled from: PlaybackPlayerPicker.kt */
public final class C4432uc implements o {
    private final com.soundcloud.android.properties.a a;
    private final FirebaseRemoteConfig b;
    private final C6699jHa c;

    /* renamed from: com.soundcloud.android.playback.uc$a */
    /* compiled from: PlaybackPlayerPicker.kt */
    private static final class a extends RuntimeException {
        public a(PlaybackItem playbackItem) {
            C7471uYa.b(playbackItem, "playbackItem");
            StringBuilder sb = new StringBuilder();
            sb.append("A playback fallback is not supported for playback item ");
            sb.append(playbackItem);
            super(sb.toString());
        }
    }

    public C4432uc(com.soundcloud.android.properties.a aVar, FirebaseRemoteConfig firebaseRemoteConfig, C6699jHa jha) {
        C7471uYa.b(aVar, "appFeatures");
        C7471uYa.b(firebaseRemoteConfig, "firebaseRemoteConfig");
        C7471uYa.b(jha, "deviceHelper");
        this.a = aVar;
        this.b = firebaseRemoteConfig;
        this.c = jha;
    }

    private final List<C3749dba> a() {
        return C6850lWa.a(C3749dba.b);
    }

    private final List<Mla> c() {
        return C6850lWa.a(Mla.b);
    }

    private final boolean d() {
        return this.a.a((defpackage.C3821mba.a) n.a) || a(this.b);
    }

    public List<m> b(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        if (playbackItem instanceof AudioAdPlaybackItem) {
            return a();
        }
        if (playbackItem instanceof VideoAdPlaybackItem) {
            return a();
        }
        if (playbackItem instanceof AudioPlaybackItem) {
            return b();
        }
        if (playbackItem instanceof OfflinePlaybackItem) {
            return c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No player for ");
        sb.append(playbackItem);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        return !(playbackItem instanceof OfflinePlaybackItem);
    }

    public PlaybackItem a(PlaybackItem playbackItem, long j) {
        C7471uYa.b(playbackItem, "playbackItem");
        if ((playbackItem instanceof AudioAdPlaybackItem) || (playbackItem instanceof VideoAdPlaybackItem)) {
            return playbackItem;
        }
        if (playbackItem instanceof AudioPlaybackItem) {
            return AudioPlaybackItem.a((AudioPlaybackItem) playbackItem, null, null, j, 0, null, null, 59, null);
        }
        throw new a(playbackItem);
    }

    private final List<m> b() {
        if (d()) {
            return C6850lWa.a(C3749dba.b);
        }
        return C6918mWa.b((Object[]) new m[]{Mla.b, C3749dba.b});
    }

    private final boolean a(FirebaseRemoteConfig firebaseRemoteConfig) {
        String string = firebaseRemoteConfig.getString("android_flipper_blacklist");
        C7471uYa.a((Object) string, "getString(\"android_flipper_blacklist\")");
        return C7676xWa.t(Hxb.a((CharSequence) Cxb.a(string, " ", "", false, 4, (Object) null), new String[]{","}, false, 0, 6, (Object) null)).contains(this.c.i());
    }
}
