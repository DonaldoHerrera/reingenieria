package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Creator<Format> CREATOR = new A();
    public final String A;
    public final int B;
    private int C;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final Metadata g;
    public final String h;
    public final String i;
    public final int j;
    public final List<byte[]> k;
    public final DrmInitData l;
    public final long m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;
    public final int s;
    public final byte[] t;
    public final ColorInfo u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    Format(String str, String str2, int i2, int i3, int i4, String str3, Metadata metadata, String str4, String str5, int i5, List<byte[]> list, DrmInitData drmInitData, long j2, int i6, int i7, float f2, int i8, float f3, byte[] bArr, int i9, ColorInfo colorInfo, int i10, int i11, int i12, int i13, int i14, String str6, int i15) {
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str3;
        this.g = metadata;
        this.h = str4;
        this.i = str5;
        this.j = i5;
        this.k = list == null ? Collections.emptyList() : list;
        this.l = drmInitData;
        this.m = j2;
        this.n = i6;
        this.o = i7;
        this.p = f2;
        int i16 = i8;
        if (i16 == -1) {
            i16 = 0;
        }
        this.q = i16;
        this.r = f3 == -1.0f ? 1.0f : f3;
        this.t = bArr;
        this.s = i9;
        this.u = colorInfo;
        this.v = i10;
        this.w = i11;
        this.x = i12;
        int i17 = i13;
        if (i17 == -1) {
            i17 = 0;
        }
        this.y = i17;
        int i18 = i14;
        if (i18 == -1) {
            i18 = 0;
        }
        this.z = i18;
        this.A = C0471ar.f(str6);
        this.B = i15;
    }

    public static Format a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, DrmInitData drmInitData) {
        return a(str, str2, str3, i2, i3, i4, i5, f2, list, i6, f3, (byte[]) null, -1, (ColorInfo) null, drmInitData);
    }

    public Format b(int i2) {
        Format format = new Format(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, i2, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
        return format;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.C;
        if (i2 != 0) {
            int i3 = format.C;
            if (!(i3 == 0 || i2 == i3)) {
                return false;
            }
        }
        if (!(this.c == format.c && this.d == format.d && this.e == format.e && this.j == format.j && this.m == format.m && this.n == format.n && this.o == format.o && this.q == format.q && this.s == format.s && this.v == format.v && this.w == format.w && this.x == format.x && this.y == format.y && this.z == format.z && this.B == format.B && Float.compare(this.p, format.p) == 0 && Float.compare(this.r, format.r) == 0 && C0471ar.a((Object) this.a, (Object) format.a) && C0471ar.a((Object) this.b, (Object) format.b) && C0471ar.a((Object) this.f, (Object) format.f) && C0471ar.a((Object) this.h, (Object) format.h) && C0471ar.a((Object) this.i, (Object) format.i) && C0471ar.a((Object) this.A, (Object) format.A) && Arrays.equals(this.t, format.t) && C0471ar.a((Object) this.g, (Object) format.g) && C0471ar.a((Object) this.u, (Object) format.u) && C0471ar.a((Object) this.l, (Object) format.l) && a(format))) {
            z2 = false;
        }
        return z2;
    }

    public int hashCode() {
        if (this.C == 0) {
            String str = this.a;
            int i2 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
            String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.g;
            int hashCode4 = (hashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.h;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.i;
            int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.j) * 31) + ((int) this.m)) * 31) + this.n) * 31) + this.o) * 31) + Float.floatToIntBits(this.p)) * 31) + this.q) * 31) + Float.floatToIntBits(this.r)) * 31) + this.s) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31;
            String str6 = this.A;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.C = ((hashCode6 + i2) * 31) + this.B;
        }
        return this.C;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Format(");
        sb.append(this.a);
        String str = ", ";
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append(this.h);
        sb.append(str);
        sb.append(this.i);
        sb.append(str);
        sb.append(this.f);
        sb.append(str);
        sb.append(this.e);
        sb.append(str);
        sb.append(this.A);
        sb.append(", [");
        sb.append(this.n);
        sb.append(str);
        sb.append(this.o);
        sb.append(str);
        sb.append(this.p);
        sb.append("], [");
        sb.append(this.v);
        sb.append(str);
        sb.append(this.w);
        sb.append("])");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        boolean z2 = false;
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        int size = this.k.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) this.k.get(i3));
        }
        parcel.writeParcelable(this.l, 0);
        parcel.writeLong(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeFloat(this.p);
        parcel.writeInt(this.q);
        parcel.writeFloat(this.r);
        if (this.t != null) {
            z2 = true;
        }
        C0471ar.a(parcel, z2);
        byte[] bArr = this.t;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.s);
        parcel.writeParcelable(this.u, i2);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
    }

    public static Format a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, ColorInfo colorInfo, DrmInitData drmInitData) {
        int i8 = i2;
        Format format = new Format(str, null, 0, 0, i8, str3, null, null, str2, i3, list, drmInitData, Long.MAX_VALUE, i4, i5, f2, i6, f3, bArr, i7, colorInfo, -1, -1, -1, -1, -1, null, -1);
        return format;
    }

    public static Format a(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return a(str, str2, str3, i2, i3, i4, i5, -1, list, drmInitData, i6, str4);
    }

    public static Format a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, DrmInitData drmInitData, int i7, String str4) {
        return a(str, str2, str3, i2, i3, i4, i5, i6, -1, -1, list, drmInitData, i7, str4, (Metadata) null);
    }

    public static Format a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, DrmInitData drmInitData, int i9, String str4, Metadata metadata) {
        int i10 = i2;
        int i11 = i9;
        Metadata metadata2 = metadata;
        Format format = new Format(str, null, i11, 0, i10, str3, metadata2, null, str2, i3, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, i7, i8, str4, -1);
        return format;
    }

    public static Format a(String str, String str2, int i2, String str3) {
        return a(str, str2, i2, str3, (DrmInitData) null);
    }

    public static Format a(String str, String str2, int i2, String str3, DrmInitData drmInitData) {
        return a(str, str2, null, -1, i2, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format a(String str, String str2, String str3, int i2, int i3, String str4, int i4, DrmInitData drmInitData, long j2, List<byte[]> list) {
        int i5 = i2;
        int i6 = i3;
        List<byte[]> list2 = list;
        Format format = new Format(str, null, i6, 0, i5, str3, null, null, str2, -1, list2, drmInitData, j2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, i4);
        return format;
    }

    public static Format a(String str, String str2, String str3, int i2, int i3, List<byte[]> list, String str4, DrmInitData drmInitData) {
        int i4 = i2;
        int i5 = i3;
        Format format = new Format(str, null, i5, 0, i4, str3, null, null, str2, -1, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, -1);
        return format;
    }

    public static Format a(String str, String str2, long j2) {
        Format format = new Format(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
        return format;
    }

    public static Format a(String str, String str2, String str3, int i2, DrmInitData drmInitData) {
        int i3 = i2;
        Format format = new Format(str, null, 0, 0, i3, str3, null, null, str2, -1, null, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
        return format;
    }

    public Format a(long j2) {
        Format format = new Format(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, j2, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
        return format;
    }

    public Format a(int i2, int i3) {
        Format format = new Format(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, i2, i3, this.A, this.B);
        return format;
    }

    public Format a(float f2) {
        Format format = new Format(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, f2, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
        return format;
    }

    public Format a(DrmInitData drmInitData) {
        Format format = new Format(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, drmInitData, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
        return format;
    }

    public Format a(Metadata metadata) {
        Format format = new Format(this.a, this.b, this.c, this.d, this.e, this.f, metadata, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
        return format;
    }

    public Format a(int i2) {
        Format format = new Format(this.a, this.b, this.c, this.d, i2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
        return format;
    }

    public int a() {
        int i2 = this.n;
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.o;
        if (i3 == -1) {
            return -1;
        }
        return i2 * i3;
    }

    public boolean a(Format format) {
        if (this.k.size() != format.k.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (!Arrays.equals((byte[]) this.k.get(i2), (byte[]) format.k.get(i2))) {
                return false;
            }
        }
        return true;
    }

    Format(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        int readInt = parcel.readInt();
        this.k = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.k.add(parcel.createByteArray());
        }
        this.l = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.m = parcel.readLong();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readFloat();
        this.q = parcel.readInt();
        this.r = parcel.readFloat();
        this.t = C0471ar.a(parcel) ? parcel.createByteArray() : null;
        this.s = parcel.readInt();
        this.u = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readInt();
    }
}
