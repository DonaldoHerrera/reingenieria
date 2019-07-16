package com.soundcloud.android.playback.core;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ImagesContract;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/playback/core/Stream;", "Landroid/os/Parcelable;", "url", "", "extras", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getExtras", "()Landroid/os/Bundle;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "playback-core_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: Stream.kt */
public final class Stream implements Parcelable {
    public static final Creator CREATOR = new a();
    private final String a;
    private final Bundle b;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            return new Stream(parcel.readString(), parcel.readBundle());
        }

        public final Object[] newArray(int i) {
            return new Stream[i];
        }
    }

    public Stream(String str, Bundle bundle) {
        C7471uYa.b(str, ImagesContract.URL);
        C7471uYa.b(bundle, "extras");
        this.a = str;
        this.b = bundle;
    }

    public final Bundle a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (!C7471uYa.a(obj != null ? obj.getClass() : null, (Object) Stream.class)) {
            return false;
        }
        if (!(obj instanceof Stream)) {
            obj = null;
        }
        Stream stream = (Stream) obj;
        if (stream != null && C7471uYa.a((Object) this.a, (Object) stream.a) && Lla.a(this.b, stream.b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stream(url=");
        sb.append(this.a);
        sb.append(", extras=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeBundle(this.b);
    }

    public /* synthetic */ Stream(String str, Bundle bundle, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            bundle = C1687sb.a(new HVa[0]);
        }
        this(str, bundle);
    }
}
