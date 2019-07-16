package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class MlltFrame extends Id3Frame {
    public static final Creator<MlltFrame> CREATOR = new j();
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (!(this.b == mlltFrame.b && this.c == mlltFrame.c && this.d == mlltFrame.d && Arrays.equals(this.e, mlltFrame.e) && Arrays.equals(this.f, mlltFrame.f))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
    }

    MlltFrame(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        C0471ar.a(createIntArray);
        this.e = createIntArray;
        int[] createIntArray2 = parcel.createIntArray();
        C0471ar.a(createIntArray2);
        this.f = createIntArray2;
    }
}
