package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class DownloadRequest implements Parcelable {
    public static final Creator<DownloadRequest> CREATOR = new b();
    public final String a;
    public final String b;
    public final Uri c;
    public final List<StreamKey> d;
    public final String e;
    public final byte[] f;

    DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.a = readString;
        String readString2 = parcel.readString();
        C0471ar.a(readString2);
        this.b = readString2;
        String readString3 = parcel.readString();
        C0471ar.a(readString3);
        this.c = Uri.parse(readString3);
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.e = parcel.readString();
        this.f = new byte[parcel.readInt()];
        parcel.readByteArray(this.f);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (this.a.equals(downloadRequest.a) && this.b.equals(downloadRequest.b) && this.c.equals(downloadRequest.c) && this.d.equals(downloadRequest.d) && C0471ar.a((Object) this.e, (Object) downloadRequest.e) && Arrays.equals(this.f, downloadRequest.f)) {
            z = true;
        }
        return z;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(":");
        sb.append(this.a);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.toString());
        parcel.writeInt(this.d.size());
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            parcel.writeParcelable((Parcelable) this.d.get(i2), 0);
        }
        parcel.writeString(this.e);
        parcel.writeInt(this.f.length);
        parcel.writeByteArray(this.f);
    }
}
