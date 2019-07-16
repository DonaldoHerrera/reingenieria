package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
    public static final Creator<ApicFrame> CREATOR = new b();
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.d != apicFrame.d || !C0471ar.a((Object) this.b, (Object) apicFrame.b) || !C0471ar.a((Object) this.c, (Object) apicFrame.c) || !Arrays.equals(this.e, apicFrame.e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (527 + this.d) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": mimeType=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.b = readString;
        String readString2 = parcel.readString();
        C0471ar.a(readString2);
        this.c = readString2;
        this.d = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        C0471ar.a(createByteArray);
        this.e = createByteArray;
    }
}
