package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class TextInformationFrame extends Id3Frame {
    public static final Creator<TextInformationFrame> CREATOR = new l();
    public final String b;
    public final String c;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!this.a.equals(textInformationFrame.a) || !C0471ar.a((Object) this.b, (Object) textInformationFrame.b) || !C0471ar.a((Object) this.c, (Object) textInformationFrame.c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (527 + this.a.hashCode()) * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": value=");
        sb.append(this.c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    TextInformationFrame(Parcel parcel) {
        String readString = parcel.readString();
        C0471ar.a(readString);
        super(readString);
        this.b = parcel.readString();
        String readString2 = parcel.readString();
        C0471ar.a(readString2);
        this.c = readString2;
    }
}
