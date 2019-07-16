package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class InternalFrame extends Id3Frame {
    public static final Creator<InternalFrame> CREATOR = new i();
    public final String b;
    public final String c;
    public final String d;

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (!C0471ar.a((Object) this.c, (Object) internalFrame.c) || !C0471ar.a((Object) this.b, (Object) internalFrame.b) || !C0471ar.a((Object) this.d, (Object) internalFrame.d)) {
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
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": domain=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    InternalFrame(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.b = readString;
        String readString2 = parcel.readString();
        C0471ar.a(readString2);
        this.c = readString2;
        String readString3 = parcel.readString();
        C0471ar.a(readString3);
        this.d = readString3;
    }
}
