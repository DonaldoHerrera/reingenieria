package com.google.android.exoplayer2.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import java.util.Arrays;

public final class MdtaMetadataEntry implements Entry {
    public static final Creator<MdtaMetadataEntry> CREATOR = new i();
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* synthetic */ MdtaMetadataEntry(Parcel parcel, i iVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (!this.a.equals(mdtaMetadataEntry.a) || !Arrays.equals(this.b, mdtaMetadataEntry.b) || this.c != mdtaMetadataEntry.c || this.d != mdtaMetadataEntry.d) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("mdta: key=");
        sb.append(this.a);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b.length);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.a = readString;
        this.b = new byte[parcel.readInt()];
        parcel.readByteArray(this.b);
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
