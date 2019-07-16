package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Creator<StreamKey> CREATOR = new c();
    public final int a;
    public final int b;
    public final int c;

    StreamKey(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    /* renamed from: a */
    public int compareTo(StreamKey streamKey) {
        int i = this.a - streamKey.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - streamKey.b;
        return i2 == 0 ? this.c - streamKey.c : i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (!(this.a == streamKey.a && this.b == streamKey.b && this.c == streamKey.c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        String str = ".";
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append(this.c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
