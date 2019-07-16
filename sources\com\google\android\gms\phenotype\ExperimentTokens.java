package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@KeepForSdk
@Class(creator = "ExperimentTokensCreator")
@Reserved({1})
public class ExperimentTokens extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Creator<ExperimentTokens> CREATOR = new f();
    private static final byte[][] a = new byte[0][];
    private static final ExperimentTokens b;
    private static final a c = new b();
    private static final a d = new c();
    private static final a e = new d();
    private static final a f = new e();
    @Field(id = 2)
    private final String g;
    @Field(id = 3)
    private final byte[] h;
    @Field(id = 4)
    private final byte[][] i;
    @Field(id = 5)
    private final byte[][] j;
    @Field(id = 6)
    private final byte[][] k;
    @Field(id = 7)
    private final byte[][] l;
    @Field(id = 8)
    private final int[] m;
    @Field(id = 9)
    private final byte[][] n;

    private interface a {
    }

    static {
        byte[][] bArr = a;
        ExperimentTokens experimentTokens = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
        b = experimentTokens;
    }

    @Constructor
    public ExperimentTokens(@Param(id = 2) String str, @Param(id = 3) byte[] bArr, @Param(id = 4) byte[][] bArr2, @Param(id = 5) byte[][] bArr3, @Param(id = 6) byte[][] bArr4, @Param(id = 7) byte[][] bArr5, @Param(id = 8) int[] iArr, @Param(id = 9) byte[][] bArr6) {
        this.g = str;
        this.h = bArr;
        this.i = bArr2;
        this.j = bArr3;
        this.k = bArr4;
        this.l = bArr5;
        this.m = iArr;
        this.n = bArr6;
    }

    private static List<Integer> a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void a(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            int i2 = 0;
            boolean z = true;
            while (i2 < length) {
                byte[] bArr2 = bArr[i2];
                if (!z) {
                    sb.append(", ");
                }
                String str3 = "'";
                sb.append(str3);
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append(str3);
                i2++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (i.a(this.g, experimentTokens.g) && Arrays.equals(this.h, experimentTokens.h) && i.a(a(this.i), a(experimentTokens.i)) && i.a(a(this.j), a(experimentTokens.j)) && i.a(a(this.k), a(experimentTokens.k)) && i.a(a(this.l), a(experimentTokens.l)) && i.a(a(this.m), a(experimentTokens.m)) && i.a(a(this.n), a(experimentTokens.n))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        String str2 = "(";
        sb.append(str2);
        String str3 = this.g;
        String str4 = "null";
        String str5 = "'";
        if (str3 == null) {
            str = str4;
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 2);
            sb2.append(str5);
            sb2.append(str3);
            sb2.append(str5);
            str = sb2.toString();
        }
        sb.append(str);
        String str6 = ", ";
        sb.append(str6);
        byte[] bArr = this.h;
        sb.append("direct");
        String str7 = "=";
        sb.append(str7);
        if (bArr == null) {
            sb.append(str4);
        } else {
            sb.append(str5);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append(str5);
        }
        sb.append(str6);
        a(sb, "GAIA", this.i);
        sb.append(str6);
        a(sb, "PSEUDO", this.j);
        sb.append(str6);
        a(sb, "ALWAYS", this.k);
        sb.append(str6);
        a(sb, "OTHER", this.l);
        sb.append(str6);
        int[] iArr = this.m;
        sb.append("weak");
        sb.append(str7);
        String str8 = ")";
        if (iArr == null) {
            sb.append(str4);
        } else {
            sb.append(str2);
            int length = iArr.length;
            int i2 = 0;
            boolean z = true;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (!z) {
                    sb.append(str6);
                }
                sb.append(i3);
                i2++;
                z = false;
            }
            sb.append(str8);
        }
        sb.append(str6);
        a(sb, "directs", this.n);
        sb.append(str8);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.g, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.h, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.i, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.j, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.k, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.l, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.m, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.n, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
