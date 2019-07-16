package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.playback.core.PreloadItem;

/* compiled from: PlaybackItemRepository.kt */
public class Ub {
    private final Jb a;

    public Ub(Jb jb) {
        C7471uYa.b(jb, "playbackItemFactory");
        this.a = jb;
    }

    public C7531vPa<PreloadItem> a(C3509cea cea) {
        C7471uYa.b(cea, "track");
        return this.a.a(cea);
    }

    public C7531vPa<OfflinePlaybackItem> b(C3509cea cea, long j) {
        C7471uYa.b(cea, "track");
        return this.a.b(cea, j);
    }

    public C7531vPa<AudioPlaybackItem> c(C3509cea cea, long j) {
        C7471uYa.b(cea, "track");
        return this.a.c(cea, j);
    }

    public C7531vPa<AudioPlaybackItem> a(C3509cea cea, long j) {
        C7471uYa.b(cea, "track");
        return this.a.a(cea, j);
    }

    public IPa<AudioAdPlaybackItem> a(C3693u uVar, long j) {
        C7471uYa.b(uVar, "audioAd");
        return this.a.a(uVar, j);
    }

    public static /* synthetic */ IPa a(Ub ub, aa aaVar, long j, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = 0;
            }
            if ((i & 4) != 0) {
                f = 1.0f;
            }
            return ub.a(aaVar, j, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: videoAdItem");
    }

    public IPa<VideoAdPlaybackItem> a(aa aaVar, long j, float f) {
        C7471uYa.b(aaVar, "ad");
        IPa<VideoAdPlaybackItem> c = this.a.a(aaVar, j, f).c((C6776kQa<? super T>) new Tb<Object>(aaVar));
        C7471uYa.a((Object) c, "playbackItemFactory.vide…ad, it)\n                }");
        return c;
    }

    public VideoAdPlaybackItem a(String str) {
        C7471uYa.b(str, "videoAdUuid");
        return Wb.b.a(str);
    }
}
