package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import java.util.Arrays;

public final class EventMessage implements Entry {
    public static final Creator<EventMessage> CREATOR = new a();
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int f;

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.c != eventMessage.c || this.d != eventMessage.d || !C0471ar.a((Object) this.a, (Object) eventMessage.a) || !C0471ar.a((Object) this.b, (Object) eventMessage.b) || !Arrays.equals(this.e, eventMessage.e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            long j = this.c;
            int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = ((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EMSG: scheme=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", value=");
        sb.append(this.b);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }

    EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.a = readString;
        String readString2 = parcel.readString();
        C0471ar.a(readString2);
        this.b = readString2;
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        C0471ar.a(createByteArray);
        this.e = createByteArray;
    }
}
