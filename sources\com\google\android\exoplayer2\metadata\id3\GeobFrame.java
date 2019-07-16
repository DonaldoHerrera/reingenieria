package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Creator<GeobFrame> CREATOR = new g();
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (!C0471ar.a((Object) this.b, (Object) geobFrame.b) || !C0471ar.a((Object) this.c, (Object) geobFrame.c) || !C0471ar.a((Object) this.d, (Object) geobFrame.d) || !Arrays.equals(this.e, geobFrame.e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": mimeType=");
        sb.append(this.b);
        sb.append(", filename=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.b = readString;
        String readString2 = parcel.readString();
        C0471ar.a(readString2);
        this.c = readString2;
        String readString3 = parcel.readString();
        C0471ar.a(readString3);
        this.d = readString3;
        byte[] createByteArray = parcel.createByteArray();
        C0471ar.a(createByteArray);
        this.e = createByteArray;
    }
}
