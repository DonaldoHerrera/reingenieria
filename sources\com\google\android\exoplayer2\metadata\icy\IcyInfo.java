package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.Metadata.Entry;

public final class IcyInfo implements Entry {
    public static final Creator<IcyInfo> CREATOR = new c();
    public final String a;
    public final String b;

    public IcyInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        IcyInfo icyInfo = (IcyInfo) obj;
        if (!C0471ar.a((Object) this.a, (Object) icyInfo.a) || !C0471ar.a((Object) this.b, (Object) icyInfo.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ICY: title=\"");
        sb.append(this.a);
        sb.append("\", url=\"");
        sb.append(this.b);
        sb.append("\"");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    IcyInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
