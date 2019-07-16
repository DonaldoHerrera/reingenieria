package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Creator<BinaryFrame> CREATOR = new c();
    public final byte[] b;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (!this.a.equals(binaryFrame.a) || !Arrays.equals(this.b, binaryFrame.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31) + Arrays.hashCode(this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    BinaryFrame(Parcel parcel) {
        String readString = parcel.readString();
        C0471ar.a(readString);
        super(readString);
        byte[] createByteArray = parcel.createByteArray();
        C0471ar.a(createByteArray);
        this.b = createByteArray;
    }
}
