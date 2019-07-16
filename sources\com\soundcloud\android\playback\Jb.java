package com.soundcloud.android.playback;

import android.view.Surface;
import com.google.android.gms.common.internal.ImagesContract;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.VideoAdTracking;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.ads.ba;
import com.soundcloud.android.playback.core.PlaybackItem.InitialVolume;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.Stream;

@EVa(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000 %2\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0016J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020!H\u0017J\f\u0010\"\u001a\u00020#*\u00020$H\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/soundcloud/android/playback/PlaybackItemFactory;", "", "streamSelector", "Lcom/soundcloud/android/playback/StreamSelector;", "videoSourceProvider", "Lcom/soundcloud/android/playback/VideoSourceProvider;", "videoSurfaceProvider", "Lcom/soundcloud/android/playback/VideoSurfaceProvider;", "cryptoOperations", "Lcom/soundcloud/android/crypto/CryptoOperations;", "(Lcom/soundcloud/android/playback/StreamSelector;Lcom/soundcloud/android/playback/VideoSourceProvider;Lcom/soundcloud/android/playback/VideoSurfaceProvider;Lcom/soundcloud/android/crypto/CryptoOperations;)V", "audioAdItem", "Lio/reactivex/Single;", "Lcom/soundcloud/android/playback/AudioAdPlaybackItem;", "audioAd", "Lcom/soundcloud/android/foundation/ads/AudioAd;", "position", "", "audioItem", "Lio/reactivex/Maybe;", "Lcom/soundcloud/android/playback/AudioPlaybackItem;", "track", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "offlineItem", "Lcom/soundcloud/android/playback/OfflinePlaybackItem;", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "snippetItem", "videoAdItem", "Lcom/soundcloud/android/playback/VideoAdPlaybackItem;", "ad", "Lcom/soundcloud/android/foundation/ads/VideoAd;", "initialVolume", "", "toStream", "Lcom/soundcloud/android/playback/core/Stream;", "Lcom/soundcloud/android/playback/Stream;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlaybackItemFactory.kt */
public class Jb {
    public static final a a = new a(null);
    private final C4527xd b;
    private final ie c;
    private final ke d;
    /* access modifiers changed from: private */
    public final C3284tV e;

    /* compiled from: PlaybackItemFactory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Jb(C4527xd xdVar, ie ieVar, ke keVar, C3284tV tVVar) {
        C7471uYa.b(xdVar, "streamSelector");
        C7471uYa.b(ieVar, "videoSourceProvider");
        C7471uYa.b(keVar, "videoSurfaceProvider");
        C7471uYa.b(tVVar, "cryptoOperations");
        this.b = xdVar;
        this.c = ieVar;
        this.d = keVar;
        this.e = tVVar;
    }

    public C7531vPa<OfflinePlaybackItem> b(C3509cea cea, long j) {
        C7471uYa.b(cea, "track");
        C7531vPa<OfflinePlaybackItem> f = this.b.a(cea).f(new Mb(this, j, cea));
        C7471uYa.a((Object) f, "streamSelector.getFileSt…          }\n            }");
        return f;
    }

    public C7531vPa<AudioPlaybackItem> c(C3509cea cea, long j) {
        C7471uYa.b(cea, "track");
        C7531vPa<AudioPlaybackItem> f = this.b.b(cea).f(new Ob(this, j, cea));
        C7471uYa.a((Object) f, "streamSelector.getWebStr…          }\n            }");
        return f;
    }

    public C7531vPa<PreloadItem> a(C3509cea cea) {
        C7471uYa.b(cea, "track");
        C7531vPa<PreloadItem> f = this.b.b(cea).f(new Nb(this));
        C7471uYa.a((Object) f, "streamSelector.getWebStr…Item(it.hls.toStream()) }");
        return f;
    }

    public C7531vPa<AudioPlaybackItem> a(C3509cea cea, long j) {
        C7471uYa.b(cea, "track");
        C7531vPa<AudioPlaybackItem> f = this.b.b(cea).f(new Lb(this, j, cea));
        C7471uYa.a((Object) f, "streamSelector.getWebStr…          }\n            }");
        return f;
    }

    public IPa<AudioAdPlaybackItem> a(C3693u uVar, long j) {
        C7471uYa.b(uVar, "audioAd");
        IPa<AudioAdPlaybackItem> e2 = this.b.a(uVar).e(new Kb(this, j, uVar));
        C7471uYa.a((Object) e2, "streamSelector.getWebStr…oAd.adUrn }\n            }");
        return e2;
    }

    public IPa<VideoAdPlaybackItem> a(aa aaVar, long j, float f) {
        aa aaVar2 = aaVar;
        C7471uYa.b(aaVar2, "ad");
        ba a2 = this.c.a(aaVar.L());
        String f2 = a2.f();
        String f3 = a2.f();
        Surface b2 = this.d.b(aaVar.I());
        C7471uYa.a((Object) f2, ImagesContract.URL);
        Stream stream = new Stream(f2, null, 2, null);
        C7471uYa.a((Object) f3, "hlsUrl");
        VideoAdPlaybackItem videoAdPlaybackItem = new VideoAdPlaybackItem(stream, new Stream(f3, null, 2, null), j, aaVar.B(), new InitialVolume(f, true), false, b2, null, VideoAdTracking.a.a(aaVar2), 160, null);
        Tma.a(videoAdPlaybackItem, aaVar.f());
        IPa<VideoAdPlaybackItem> a3 = IPa.a(videoAdPlaybackItem);
        C7471uYa.a((Object) a3, "Single.just(\n           …n\n            }\n        )");
        return a3;
    }

    /* access modifiers changed from: private */
    public Stream a(C4308fd fdVar) {
        Stream stream = new Stream(fdVar.e(), null, 2, null);
        C4313gd.c(stream, fdVar.c());
        C4313gd.b(stream, fdVar.b());
        C4313gd.d(stream, fdVar.d());
        C4313gd.a(stream, fdVar.a());
        return stream;
    }
}
