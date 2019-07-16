package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
    public static final Creator<PrivFrame> CREATOR = new k();
    public final String b;
    public final byte[] c;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (!C0471ar.a((Object) this.b, (Object) privFrame.b) || !Arrays.equals(this.c, privFrame.c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": owner=");
        sb.append(this.b);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    PrivFrame(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.b = readString;
        byte[] createByteArray = parcel.createByteArray();
        C0471ar.a(createByteArray);
        this.c = createByteArray;
    }
}
