package com.soundcloud.android.playback.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/playback/core/PreloadItem;", "Landroid/os/Parcelable;", "stream", "Lcom/soundcloud/android/playback/core/Stream;", "(Lcom/soundcloud/android/playback/core/Stream;)V", "getStream", "()Lcom/soundcloud/android/playback/core/Stream;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "playback-core_release"}, mv = {1, 1, 15})
/* compiled from: PreloadItem.kt */
public final class PreloadItem implements Parcelable {
    public static final Creator CREATOR = new a();
    private final Stream a;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            return new PreloadItem((Stream) Stream.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new PreloadItem[i];
        }
    }

    public PreloadItem(Stream stream) {
        C7471uYa.b(stream, "stream");
        this.a = stream;
    }

    public final Stream a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.playback.core.PreloadItem) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PreloadItem) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Stream stream = this.a;
        if (stream != null) {
            return stream.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreloadItem(stream=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        this.a.writeToParcel(parcel, 0);
    }
}
