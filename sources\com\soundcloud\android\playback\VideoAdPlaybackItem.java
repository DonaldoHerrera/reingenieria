package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.Surface;
import com.soundcloud.android.foundation.ads.VideoAdTracking;
import com.soundcloud.android.playback.core.PlaybackItem.InitialVolume;
import com.soundcloud.android.playback.core.Stream;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;

@EVa(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u0011HÆ\u0003Je\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00069"}, d2 = {"Lcom/soundcloud/android/playback/VideoAdPlaybackItem;", "Lcom/soundcloud/android/playback/core/SurfacePlaybackItem;", "progressiveStream", "Lcom/soundcloud/android/playback/core/Stream;", "hlsStream", "startPosition", "", "duration", "initialVolume", "Lcom/soundcloud/android/playback/core/PlaybackItem$InitialVolume;", "isRetryable", "", "surface", "Landroid/view/Surface;", "extras", "Landroid/os/Bundle;", "videoAdTracking", "Lcom/soundcloud/android/foundation/ads/VideoAdTracking;", "(Lcom/soundcloud/android/playback/core/Stream;Lcom/soundcloud/android/playback/core/Stream;JJLcom/soundcloud/android/playback/core/PlaybackItem$InitialVolume;ZLandroid/view/Surface;Landroid/os/Bundle;Lcom/soundcloud/android/foundation/ads/VideoAdTracking;)V", "getDuration", "()J", "getExtras", "()Landroid/os/Bundle;", "getHlsStream", "()Lcom/soundcloud/android/playback/core/Stream;", "getInitialVolume", "()Lcom/soundcloud/android/playback/core/PlaybackItem$InitialVolume;", "()Z", "getProgressiveStream", "getStartPosition", "getSurface", "()Landroid/view/Surface;", "getVideoAdTracking", "()Lcom/soundcloud/android/foundation/ads/VideoAdTracking;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "base_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: VideoAdPlaybackItem.kt */
public final class VideoAdPlaybackItem extends SurfacePlaybackItem {
    public static final Creator CREATOR = new a();
    private final Stream h;
    private final Stream i;
    private final long j;
    private final long k;
    private final InitialVolume l;
    private final boolean m;
    private final Surface n;
    private final Bundle o;
    private final VideoAdTracking p;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            VideoAdPlaybackItem videoAdPlaybackItem = new VideoAdPlaybackItem((Stream) parcel.readParcelable(VideoAdPlaybackItem.class.getClassLoader()), (Stream) parcel.readParcelable(VideoAdPlaybackItem.class.getClassLoader()), parcel.readLong(), parcel.readLong(), (InitialVolume) parcel.readParcelable(VideoAdPlaybackItem.class.getClassLoader()), parcel.readInt() != 0, (Surface) parcel.readParcelable(VideoAdPlaybackItem.class.getClassLoader()), parcel.readBundle(), (VideoAdTracking) parcel.readParcelable(VideoAdPlaybackItem.class.getClassLoader()));
            return videoAdPlaybackItem;
        }

        public final Object[] newArray(int i) {
            return new VideoAdPlaybackItem[i];
        }
    }

    public /* synthetic */ VideoAdPlaybackItem(Stream stream, Stream stream2, long j2, long j3, InitialVolume initialVolume, boolean z, Surface surface, Bundle bundle, VideoAdTracking videoAdTracking, int i2, C7264rYa rya) {
        int i3 = i2;
        this(stream, stream2, j2, j3, initialVolume, (i3 & 32) != 0 ? false : z, surface, (i3 & 128) != 0 ? C1687sb.a(new HVa[0]) : bundle, videoAdTracking);
    }

    public long a() {
        return this.k;
    }

    public Bundle b() {
        return this.o;
    }

    public Stream c() {
        return this.i;
    }

    public int describeContents() {
        return 0;
    }

    public InitialVolume e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoAdPlaybackItem) {
                VideoAdPlaybackItem videoAdPlaybackItem = (VideoAdPlaybackItem) obj;
                if (C7471uYa.a((Object) f(), (Object) videoAdPlaybackItem.f()) && C7471uYa.a((Object) c(), (Object) videoAdPlaybackItem.c())) {
                    if (g() == videoAdPlaybackItem.g()) {
                        if ((a() == videoAdPlaybackItem.a()) && C7471uYa.a((Object) e(), (Object) videoAdPlaybackItem.e())) {
                            if (!(h() == videoAdPlaybackItem.h()) || !C7471uYa.a((Object) i(), (Object) videoAdPlaybackItem.i()) || !C7471uYa.a((Object) b(), (Object) videoAdPlaybackItem.b()) || !C7471uYa.a((Object) this.p, (Object) videoAdPlaybackItem.p)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Stream f() {
        return this.h;
    }

    public long g() {
        return this.j;
    }

    public boolean h() {
        return this.m;
    }

    public int hashCode() {
        Stream f = f();
        int i2 = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Stream c = c();
        int hashCode2 = (hashCode + (c != null ? c.hashCode() : 0)) * 31;
        long g = g();
        int i3 = (hashCode2 + ((int) (g ^ (g >>> 32)))) * 31;
        long a2 = a();
        int i4 = (i3 + ((int) (a2 ^ (a2 >>> 32)))) * 31;
        InitialVolume e = e();
        int hashCode3 = (i4 + (e != null ? e.hashCode() : 0)) * 31;
        boolean h2 = h();
        if (h2) {
            h2 = true;
        }
        int i5 = (hashCode3 + (h2 ? 1 : 0)) * 31;
        Surface i6 = i();
        int hashCode4 = (i5 + (i6 != null ? i6.hashCode() : 0)) * 31;
        Bundle b = b();
        int hashCode5 = (hashCode4 + (b != null ? b.hashCode() : 0)) * 31;
        VideoAdTracking videoAdTracking = this.p;
        if (videoAdTracking != null) {
            i2 = videoAdTracking.hashCode();
        }
        return hashCode5 + i2;
    }

    public Surface i() {
        return this.n;
    }

    public final VideoAdTracking j() {
        return this.p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoAdPlaybackItem(progressiveStream=");
        sb.append(f());
        sb.append(", hlsStream=");
        sb.append(c());
        sb.append(", startPosition=");
        sb.append(g());
        sb.append(", duration=");
        sb.append(a());
        sb.append(", initialVolume=");
        sb.append(e());
        sb.append(", isRetryable=");
        sb.append(h());
        sb.append(", surface=");
        sb.append(i());
        sb.append(", extras=");
        sb.append(b());
        sb.append(", videoAdTracking=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeParcelable(this.h, i2);
        parcel.writeParcelable(this.i, i2);
        parcel.writeLong(this.j);
        parcel.writeLong(this.k);
        parcel.writeParcelable(this.l, i2);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeParcelable(this.n, i2);
        parcel.writeBundle(this.o);
        parcel.writeParcelable(this.p, i2);
    }

    public VideoAdPlaybackItem(Stream stream, Stream stream2, long j2, long j3, InitialVolume initialVolume, boolean z, Surface surface, Bundle bundle, VideoAdTracking videoAdTracking) {
        C7471uYa.b(stream, "progressiveStream");
        C7471uYa.b(stream2, "hlsStream");
        C7471uYa.b(initialVolume, "initialVolume");
        C7471uYa.b(bundle, "extras");
        C7471uYa.b(videoAdTracking, "videoAdTracking");
        this.h = stream;
        this.i = stream2;
        this.j = j2;
        this.k = j3;
        this.l = initialVolume;
        this.m = z;
        this.n = surface;
        this.o = bundle;
        this.p = videoAdTracking;
    }
}
