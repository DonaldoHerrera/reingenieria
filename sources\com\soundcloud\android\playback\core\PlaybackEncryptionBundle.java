package com.soundcloud.android.playback.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/android/playback/core/PlaybackEncryptionBundle;", "Landroid/os/Parcelable;", "key", "", "initVector", "([B[B)V", "getInitVector", "()[B", "getKey", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "playback-core_release"}, mv = {1, 1, 15})
/* compiled from: PlaybackEncryptionBundle.kt */
public final class PlaybackEncryptionBundle implements Parcelable {
    public static final Creator CREATOR = new a();
    private final byte[] a;
    private final byte[] b;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            return new PlaybackEncryptionBundle(parcel.createByteArray(), parcel.createByteArray());
        }

        public final Object[] newArray(int i) {
            return new PlaybackEncryptionBundle[i];
        }
    }

    public PlaybackEncryptionBundle(byte[] bArr, byte[] bArr2) {
        C7471uYa.b(bArr, "key");
        C7471uYa.b(bArr2, "initVector");
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return this.b;
    }

    public final byte[] b() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        PlaybackEncryptionBundle playbackEncryptionBundle = null;
        if (!C7471uYa.a((Object) PlaybackEncryptionBundle.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj instanceof PlaybackEncryptionBundle) {
            playbackEncryptionBundle = obj;
        }
        if (playbackEncryptionBundle == null) {
            return false;
        }
        PlaybackEncryptionBundle playbackEncryptionBundle2 = (PlaybackEncryptionBundle) obj;
        return Arrays.equals(this.a, playbackEncryptionBundle2.a) && Arrays.equals(this.b, playbackEncryptionBundle2.b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackEncryptionBundle(key=");
        sb.append(Arrays.toString(this.a));
        sb.append(", initVector=");
        sb.append(Arrays.toString(this.b));
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeByteArray(this.a);
        parcel.writeByteArray(this.b);
    }
}
