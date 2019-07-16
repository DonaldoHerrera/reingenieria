package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ImagesContract;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PlaybackItem.FadeOut;
import com.soundcloud.android.playback.core.Stream;

@EVa(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006-"}, d2 = {"Lcom/soundcloud/android/playback/AudioPlaybackItem;", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "progressiveStream", "Lcom/soundcloud/android/playback/core/Stream;", "hlsStream", "startPosition", "", "duration", "fadeOut", "Lcom/soundcloud/android/playback/core/PlaybackItem$FadeOut;", "extras", "Landroid/os/Bundle;", "(Lcom/soundcloud/android/playback/core/Stream;Lcom/soundcloud/android/playback/core/Stream;JJLcom/soundcloud/android/playback/core/PlaybackItem$FadeOut;Landroid/os/Bundle;)V", "getDuration", "()J", "getExtras", "()Landroid/os/Bundle;", "getFadeOut", "()Lcom/soundcloud/android/playback/core/PlaybackItem$FadeOut;", "getHlsStream", "()Lcom/soundcloud/android/playback/core/Stream;", "getProgressiveStream", "getStartPosition", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "base_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: AudioPlaybackItem.kt */
public final class AudioPlaybackItem extends PlaybackItem {
    public static final Creator CREATOR = new b();
    public static final a h = new a(null);
    private final Stream i;
    private final Stream j;
    private final long k;
    private final long l;
    private final FadeOut m;
    private final Bundle n;

    /* compiled from: AudioPlaybackItem.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final AudioPlaybackItem a(Stream stream, Stream stream2, long j, long j2) {
            Stream stream3 = stream;
            C7471uYa.b(stream, ImagesContract.URL);
            Stream stream4 = stream2;
            C7471uYa.b(stream2, "hlsUrl");
            AudioPlaybackItem audioPlaybackItem = new AudioPlaybackItem(stream3, stream4, j, j2, null, null, 32, null);
            return audioPlaybackItem;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final AudioPlaybackItem a(Stream stream, Stream stream2, long j, long j2, FadeOut fadeOut) {
            Stream stream3 = stream;
            C7471uYa.b(stream, ImagesContract.URL);
            Stream stream4 = stream2;
            C7471uYa.b(stream2, "hlsUrl");
            FadeOut fadeOut2 = fadeOut;
            C7471uYa.b(fadeOut2, "fadeOut");
            AudioPlaybackItem audioPlaybackItem = new AudioPlaybackItem(stream3, stream4, j, j2, fadeOut2, null, 32, null);
            return audioPlaybackItem;
        }
    }

    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            AudioPlaybackItem audioPlaybackItem = new AudioPlaybackItem((Stream) parcel.readParcelable(AudioPlaybackItem.class.getClassLoader()), (Stream) parcel.readParcelable(AudioPlaybackItem.class.getClassLoader()), parcel.readLong(), parcel.readLong(), (FadeOut) parcel.readParcelable(AudioPlaybackItem.class.getClassLoader()), parcel.readBundle());
            return audioPlaybackItem;
        }

        public final Object[] newArray(int i) {
            return new AudioPlaybackItem[i];
        }
    }

    public /* synthetic */ AudioPlaybackItem(Stream stream, Stream stream2, long j2, long j3, FadeOut fadeOut, Bundle bundle, int i2, C7264rYa rya) {
        this(stream, stream2, j2, j3, fadeOut, (i2 & 32) != 0 ? C1687sb.a(new HVa[0]) : bundle);
    }

    public static /* synthetic */ AudioPlaybackItem a(AudioPlaybackItem audioPlaybackItem, Stream stream, Stream stream2, long j2, long j3, FadeOut fadeOut, Bundle bundle, int i2, Object obj) {
        return audioPlaybackItem.a((i2 & 1) != 0 ? audioPlaybackItem.f() : stream, (i2 & 2) != 0 ? audioPlaybackItem.c() : stream2, (i2 & 4) != 0 ? audioPlaybackItem.g() : j2, (i2 & 8) != 0 ? audioPlaybackItem.a() : j3, (i2 & 16) != 0 ? audioPlaybackItem.i() : fadeOut, (i2 & 32) != 0 ? audioPlaybackItem.b() : bundle);
    }

    public long a() {
        return this.l;
    }

    public final AudioPlaybackItem a(Stream stream, Stream stream2, long j2, long j3, FadeOut fadeOut, Bundle bundle) {
        Stream stream3 = stream;
        C7471uYa.b(stream, "progressiveStream");
        Stream stream4 = stream2;
        C7471uYa.b(stream2, "hlsStream");
        Bundle bundle2 = bundle;
        C7471uYa.b(bundle2, "extras");
        AudioPlaybackItem audioPlaybackItem = new AudioPlaybackItem(stream3, stream4, j2, j3, fadeOut, bundle2);
        return audioPlaybackItem;
    }

    public Bundle b() {
        return this.n;
    }

    public Stream c() {
        return this.j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioPlaybackItem) {
                AudioPlaybackItem audioPlaybackItem = (AudioPlaybackItem) obj;
                if (C7471uYa.a((Object) f(), (Object) audioPlaybackItem.f()) && C7471uYa.a((Object) c(), (Object) audioPlaybackItem.c())) {
                    if (g() == audioPlaybackItem.g()) {
                        if (!(a() == audioPlaybackItem.a()) || !C7471uYa.a((Object) i(), (Object) audioPlaybackItem.i()) || !C7471uYa.a((Object) b(), (Object) audioPlaybackItem.b())) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Stream f() {
        return this.i;
    }

    public long g() {
        return this.k;
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
        FadeOut i5 = i();
        int hashCode3 = (i4 + (i5 != null ? i5.hashCode() : 0)) * 31;
        Bundle b2 = b();
        if (b2 != null) {
            i2 = b2.hashCode();
        }
        return hashCode3 + i2;
    }

    public FadeOut i() {
        return this.m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioPlaybackItem(progressiveStream=");
        sb.append(f());
        sb.append(", hlsStream=");
        sb.append(c());
        sb.append(", startPosition=");
        sb.append(g());
        sb.append(", duration=");
        sb.append(a());
        sb.append(", fadeOut=");
        sb.append(i());
        sb.append(", extras=");
        sb.append(b());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeParcelable(this.i, i2);
        parcel.writeParcelable(this.j, i2);
        parcel.writeLong(this.k);
        parcel.writeLong(this.l);
        parcel.writeParcelable(this.m, i2);
        parcel.writeBundle(this.n);
    }

    public AudioPlaybackItem(Stream stream, Stream stream2, long j2, long j3, FadeOut fadeOut, Bundle bundle) {
        C7471uYa.b(stream, "progressiveStream");
        C7471uYa.b(stream2, "hlsStream");
        C7471uYa.b(bundle, "extras");
        this.i = stream;
        this.j = stream2;
        this.k = j2;
        this.l = j3;
        this.m = fadeOut;
        this.n = bundle;
    }
}
