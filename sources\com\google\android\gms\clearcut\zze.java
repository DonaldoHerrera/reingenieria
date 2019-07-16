package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.a.c;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.clearcut.lc;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

@Class(creator = "LogEventParcelableCreator")
@Reserved({1})
public final class zze extends AbstractSafeParcelable {
    public static final Creator<zze> CREATOR = new e();
    @Field(id = 2)
    public zzr a;
    @Field(id = 3)
    public byte[] b;
    @Field(id = 4)
    private int[] c;
    @Field(id = 5)
    private String[] d;
    @Field(id = 6)
    private int[] e;
    @Field(id = 7)
    private byte[][] f;
    @Field(id = 9)
    private ExperimentTokens[] g;
    @Field(defaultValue = "true", id = 8)
    private boolean h;
    public final lc i;
    public final c j;
    public final c k;

    public zze(zzr zzr, lc lcVar, c cVar, c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ExperimentTokens[] experimentTokensArr, boolean z) {
        this.a = zzr;
        this.i = lcVar;
        this.j = cVar;
        this.k = null;
        this.c = iArr;
        this.d = null;
        this.e = iArr2;
        this.f = null;
        this.g = null;
        this.h = z;
    }

    @Constructor
    zze(@Param(id = 2) zzr zzr, @Param(id = 3) byte[] bArr, @Param(id = 4) int[] iArr, @Param(id = 5) String[] strArr, @Param(id = 6) int[] iArr2, @Param(id = 7) byte[][] bArr2, @Param(id = 8) boolean z, @Param(id = 9) ExperimentTokens[] experimentTokensArr) {
        this.a = zzr;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.i = null;
        this.j = null;
        this.k = null;
        this.e = iArr2;
        this.f = bArr2;
        this.g = experimentTokensArr;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zze = (zze) obj;
            return Objects.equal(this.a, zze.a) && Arrays.equals(this.b, zze.b) && Arrays.equals(this.c, zze.c) && Arrays.equals(this.d, zze.d) && Objects.equal(this.i, zze.i) && Objects.equal(this.j, zze.j) && Objects.equal(this.k, zze.k) && Arrays.equals(this.e, zze.e) && Arrays.deepEquals(this.f, zze.f) && Arrays.equals(this.g, zze.g) && this.h == zze.h;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.i, this.j, this.k, this.e, this.f, this.g, Boolean.valueOf(this.h));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.i);
        sb.append(", ExtensionProducer: ");
        sb.append(this.j);
        sb.append(", VeProducer: ");
        sb.append(this.k);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.a, i2, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.b, false);
        SafeParcelWriter.writeIntArray(parcel, 4, this.c, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.d, false);
        SafeParcelWriter.writeIntArray(parcel, 6, this.e, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.h);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.g, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
