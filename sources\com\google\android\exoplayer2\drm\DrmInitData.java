package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.C0615o;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Creator<DrmInitData> CREATOR = new k();
    private final SchemeData[] a;
    private int b;
    public final String c;
    public final int d;

    public static final class SchemeData implements Parcelable {
        public static final Creator<SchemeData> CREATOR = new l();
        private int a;
        /* access modifiers changed from: private */
        public final UUID b;
        public final String c;
        public final String d;
        public final byte[] e;
        public final boolean f;

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            boolean z = true;
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!C0471ar.a((Object) this.c, (Object) schemeData.c) || !C0471ar.a((Object) this.d, (Object) schemeData.d) || !C0471ar.a((Object) this.b, (Object) schemeData.b) || !Arrays.equals(this.e, schemeData.e)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.a == 0) {
                int hashCode = this.b.hashCode() * 31;
                String str = this.c;
                this.a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.e);
            }
            return this.a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b.getMostSignificantBits());
            parcel.writeLong(this.b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.e);
            parcel.writeByte(this.f ? (byte) 1 : 0);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, z);
        }

        public boolean a(UUID uuid) {
            return C0615o.a.equals(this.b) || uuid.equals(this.b);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
            C1852xq.a(uuid);
            this.b = uuid;
            this.c = str;
            C1852xq.a(str2);
            this.d = str2;
            this.e = bArr;
            this.f = z;
        }

        SchemeData(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            String readString = parcel.readString();
            C0471ar.a(readString);
            this.d = readString;
            this.e = parcel.createByteArray();
            this.f = parcel.readByte() != 0;
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public SchemeData a(int i) {
        return this.a[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (!C0471ar.a((Object) this.c, (Object) drmInitData.c) || !Arrays.equals(this.a, drmInitData.a)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    public DrmInitData a(String str) {
        if (C0471ar.a((Object) this.c, (Object) str)) {
            return this;
        }
        return new DrmInitData(str, false, this.a);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.c = str;
        if (z) {
            schemeDataArr = (SchemeData[]) schemeDataArr.clone();
        }
        this.a = schemeDataArr;
        this.d = schemeDataArr.length;
        Arrays.sort(this.a, this);
    }

    /* renamed from: a */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        if (C0615o.a.equals(schemeData.b)) {
            return C0615o.a.equals(schemeData2.b) ? 0 : 1;
        }
        return schemeData.b.compareTo(schemeData2.b);
    }

    DrmInitData(Parcel parcel) {
        this.c = parcel.readString();
        Object[] createTypedArray = parcel.createTypedArray(SchemeData.CREATOR);
        C0471ar.a(createTypedArray);
        this.a = (SchemeData[]) createTypedArray;
        this.d = this.a.length;
    }
}
