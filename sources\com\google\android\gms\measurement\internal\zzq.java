package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Creator<zzq> CREATOR = new de();
    @Field(id = 2)
    public String a;
    @Field(id = 3)
    public String b;
    @Field(id = 4)
    public zzjn c;
    @Field(id = 5)
    public long d;
    @Field(id = 6)
    public boolean e;
    @Field(id = 7)
    public String f;
    @Field(id = 8)
    public zzai g;
    @Field(id = 9)
    public long h;
    @Field(id = 10)
    public zzai i;
    @Field(id = 11)
    public long j;
    @Field(id = 12)
    public zzai k;

    zzq(zzq zzq) {
        Preconditions.checkNotNull(zzq);
        this.a = zzq.a;
        this.b = zzq.b;
        this.c = zzq.c;
        this.d = zzq.d;
        this.e = zzq.e;
        this.f = zzq.f;
        this.g = zzq.g;
        this.h = zzq.h;
        this.i = zzq.i;
        this.j = zzq.j;
        this.k = zzq.k;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.c, i2, false);
        SafeParcelWriter.writeLong(parcel, 5, this.d);
        SafeParcelWriter.writeBoolean(parcel, 6, this.e);
        SafeParcelWriter.writeString(parcel, 7, this.f, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.g, i2, false);
        SafeParcelWriter.writeLong(parcel, 9, this.h);
        SafeParcelWriter.writeParcelable(parcel, 10, this.i, i2, false);
        SafeParcelWriter.writeLong(parcel, 11, this.j);
        SafeParcelWriter.writeParcelable(parcel, 12, this.k, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Constructor
    zzq(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) zzjn zzjn, @Param(id = 5) long j2, @Param(id = 6) boolean z, @Param(id = 7) String str3, @Param(id = 8) zzai zzai, @Param(id = 9) long j3, @Param(id = 10) zzai zzai2, @Param(id = 11) long j4, @Param(id = 12) zzai zzai3) {
        this.a = str;
        this.b = str2;
        this.c = zzjn;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.g = zzai;
        this.h = j3;
        this.i = zzai2;
        this.j = j4;
        this.k = zzai3;
    }
}
