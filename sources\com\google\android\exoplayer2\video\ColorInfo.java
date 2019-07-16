package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
    public static final Creator<ColorInfo> CREATOR = new i();
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int e;

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (!(this.a == colorInfo.a && this.b == colorInfo.b && this.c == colorInfo.c && Arrays.equals(this.d, colorInfo.d))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.a);
        String str = ", ";
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append(this.c);
        sb.append(str);
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        C0471ar.a(parcel, this.d != null);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    ColorInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = C0471ar.a(parcel) ? parcel.createByteArray() : null;
    }
}
