package com.soundcloud.android.playback.core;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000 %2\u00020\u0001:\u0003%&'B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u00060\u0014j\u0002`\u00158FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fXD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010 R\u0012\u0010!\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006¨\u0006("}, d2 = {"Lcom/soundcloud/android/playback/core/PlaybackItem;", "Landroid/os/Parcelable;", "()V", "duration", "", "getDuration", "()J", "extras", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "fadeOut", "Lcom/soundcloud/android/playback/core/PlaybackItem$FadeOut;", "getFadeOut", "()Lcom/soundcloud/android/playback/core/PlaybackItem$FadeOut;", "hlsStream", "Lcom/soundcloud/android/playback/core/Stream;", "getHlsStream", "()Lcom/soundcloud/android/playback/core/Stream;", "id", "", "Lcom/soundcloud/android/playback/core/PlaybackItemId;", "getId", "()Ljava/lang/String;", "id$delegate", "Lkotlin/Lazy;", "initialVolume", "Lcom/soundcloud/android/playback/core/PlaybackItem$InitialVolume;", "getInitialVolume", "()Lcom/soundcloud/android/playback/core/PlaybackItem$InitialVolume;", "isRetryable", "", "()Z", "progressiveStream", "getProgressiveStream", "startPosition", "getStartPosition", "Companion", "FadeOut", "InitialVolume", "playback-core_release"}, mv = {1, 1, 15})
/* compiled from: PlaybackItem.kt */
public abstract class PlaybackItem implements Parcelable {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(PlaybackItem.class), "id", "getId()Ljava/lang/String;"))};
    public static final a b = new a(null);
    private final C7744yVa c = BVa.a(new i(this));
    private final long d;
    private final InitialVolume e = new InitialVolume(1.0f, false);
    private final boolean f = true;
    private final Bundle g = C1687sb.a(new HVa[0]);

    @EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/android/playback/core/PlaybackItem$FadeOut;", "Landroid/os/Parcelable;", "fadeOutStartOffset", "", "fadeOutDuration", "(JJ)V", "getFadeOutDuration", "()J", "getFadeOutStartOffset", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "playback-core_release"}, mv = {1, 1, 15})
    @SuppressLint({"ParcelCreator"})
    /* compiled from: PlaybackItem.kt */
    public static final class FadeOut implements Parcelable {
        public static final Creator CREATOR = new a();
        private final long a;
        private final long b;

        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C7471uYa.b(parcel, "in");
                return new FadeOut(parcel.readLong(), parcel.readLong());
            }

            public final Object[] newArray(int i) {
                return new FadeOut[i];
            }
        }

        public FadeOut(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FadeOut) {
                    FadeOut fadeOut = (FadeOut) obj;
                    if (this.a == fadeOut.a) {
                        if (this.b == fadeOut.b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FadeOut(fadeOutStartOffset=");
            sb.append(this.a);
            sb.append(", fadeOutDuration=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C7471uYa.b(parcel, "parcel");
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
        }
    }

    @EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0005J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/soundcloud/android/playback/core/PlaybackItem$InitialVolume;", "Landroid/os/Parcelable;", "volume", "", "forceInitialVolume", "", "(FZ)V", "getForceInitialVolume", "()Z", "getVolume", "()F", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "isMuted", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "playback-core_release"}, mv = {1, 1, 15})
    @SuppressLint({"ParcelCreator"})
    /* compiled from: PlaybackItem.kt */
    public static final class InitialVolume implements Parcelable {
        public static final Creator CREATOR = new a();
        private final float a;
        private final boolean b;

        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C7471uYa.b(parcel, "in");
                return new InitialVolume(parcel.readFloat(), parcel.readInt() != 0);
            }

            public final Object[] newArray(int i) {
                return new InitialVolume[i];
            }
        }

        public InitialVolume(float f, boolean z) {
            this.a = f;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final float b() {
            return this.a;
        }

        public final boolean c() {
            return this.a == 0.0f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InitialVolume) {
                    InitialVolume initialVolume = (InitialVolume) obj;
                    if (Float.compare(this.a, initialVolume.a) == 0) {
                        if (this.b == initialVolume.b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int floatToIntBits = Float.floatToIntBits(this.a) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            return floatToIntBits + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InitialVolume(volume=");
            sb.append(this.a);
            sb.append(", forceInitialVolume=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C7471uYa.b(parcel, "parcel");
            parcel.writeFloat(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* compiled from: PlaybackItem.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public abstract long a();

    public Bundle b() {
        return this.g;
    }

    public abstract Stream c();

    public final String d() {
        C7744yVa yva = this.c;
        DZa dZa = a[0];
        return (String) yva.getValue();
    }

    public InitialVolume e() {
        return this.e;
    }

    public abstract Stream f();

    public long g() {
        return this.d;
    }

    public boolean h() {
        return this.f;
    }
}
