package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.Stream;

@EVa(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006'"}, d2 = {"Lcom/soundcloud/android/playback/AudioAdPlaybackItem;", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "progressiveStream", "Lcom/soundcloud/android/playback/core/Stream;", "hlsStream", "startPosition", "", "duration", "extras", "Landroid/os/Bundle;", "(Lcom/soundcloud/android/playback/core/Stream;Lcom/soundcloud/android/playback/core/Stream;JJLandroid/os/Bundle;)V", "getDuration", "()J", "getExtras", "()Landroid/os/Bundle;", "getHlsStream", "()Lcom/soundcloud/android/playback/core/Stream;", "getProgressiveStream", "getStartPosition", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "base_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: AudioAdPlaybackItem.kt */
public final class AudioAdPlaybackItem extends PlaybackItem {
    public static final Creator CREATOR = new a();
    private final Stream h;
    private final Stream i;
    private final long j;
    private final long k;
    private final Bundle l;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            AudioAdPlaybackItem audioAdPlaybackItem = new AudioAdPlaybackItem((Stream) parcel.readParcelable(AudioAdPlaybackItem.class.getClassLoader()), (Stream) parcel.readParcelable(AudioAdPlaybackItem.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readBundle());
            return audioAdPlaybackItem;
        }

        public final Object[] newArray(int i) {
            return new AudioAdPlaybackItem[i];
        }
    }

    public /* synthetic */ AudioAdPlaybackItem(Stream stream, Stream stream2, long j2, long j3, Bundle bundle, int i2, C7264rYa rya) {
        this(stream, stream2, j2, (i2 & 8) != 0 ? (long) -1 : j3, (i2 & 16) != 0 ? C1687sb.a(new HVa[0]) : bundle);
    }

    public long a() {
        return this.k;
    }

    public Bundle b() {
        return this.l;
    }

    public Stream c() {
        return this.i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioAdPlaybackItem) {
                AudioAdPlaybackItem audioAdPlaybackItem = (AudioAdPlaybackItem) obj;
                if (C7471uYa.a((Object) f(), (Object) audioAdPlaybackItem.f()) && C7471uYa.a((Object) c(), (Object) audioAdPlaybackItem.c())) {
                    if (g() == audioAdPlaybackItem.g()) {
                        if (!(a() == audioAdPlaybackItem.a()) || !C7471uYa.a((Object) b(), (Object) audioAdPlaybackItem.b())) {
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
        return this.h;
    }

    public long g() {
        return this.j;
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
        Bundle b = b();
        if (b != null) {
            i2 = b.hashCode();
        }
        return i4 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAdPlaybackItem(progressiveStream=");
        sb.append(f());
        sb.append(", hlsStream=");
        sb.append(c());
        sb.append(", startPosition=");
        sb.append(g());
        sb.append(", duration=");
        sb.append(a());
        sb.append(", extras=");
        sb.append(b());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeParcelable(this.h, i2);
        parcel.writeParcelable(this.i, i2);
        parcel.writeLong(this.j);
        parcel.writeLong(this.k);
        parcel.writeBundle(this.l);
    }

    public AudioAdPlaybackItem(Stream stream, Stream stream2, long j2, long j3, Bundle bundle) {
        C7471uYa.b(stream, "progressiveStream");
        C7471uYa.b(stream2, "hlsStream");
        C7471uYa.b(bundle, "extras");
        this.h = stream;
        this.i = stream2;
        this.j = j2;
        this.k = j3;
        this.l = bundle;
    }
}
