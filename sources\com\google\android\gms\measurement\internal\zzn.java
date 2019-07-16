package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.List;

@Class(creator = "AppMetadataCreator")
@Reserved({1, 20})
public final class zzn extends AbstractSafeParcelable {
    public static final Creator<zzn> CREATOR = new Zd();
    @Field(id = 2)
    public final String a;
    @Field(id = 3)
    public final String b;
    @Field(id = 4)
    public final String c;
    @Field(id = 5)
    public final String d;
    @Field(id = 6)
    public final long e;
    @Field(id = 7)
    public final long f;
    @Field(id = 8)
    public final String g;
    @Field(defaultValue = "true", id = 9)
    public final boolean h;
    @Field(id = 10)
    public final boolean i;
    @Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long j;
    @Field(id = 12)
    public final String k;
    @Field(id = 13)
    public final long l;
    @Field(id = 14)
    public final long m;
    @Field(id = 15)
    public final int n;
    @Field(defaultValue = "true", id = 16)
    public final boolean o;
    @Field(defaultValue = "true", id = 17)
    public final boolean p;
    @Field(id = 18)
    public final boolean q;
    @Field(id = 19)
    public final String r;
    @Field(id = 21)
    public final Boolean s;
    @Field(id = 22)
    public final long t;
    @Field(id = 23)
    public final List<String> u;

    zzn(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list) {
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j2;
        this.d = str4;
        this.e = j3;
        this.f = j4;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
        this.s = bool;
        this.t = j7;
        this.u = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.writeLong(parcel, 6, this.e);
        SafeParcelWriter.writeLong(parcel, 7, this.f);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.i);
        SafeParcelWriter.writeLong(parcel, 11, this.j);
        SafeParcelWriter.writeString(parcel, 12, this.k, false);
        SafeParcelWriter.writeLong(parcel, 13, this.l);
        SafeParcelWriter.writeLong(parcel, 14, this.m);
        SafeParcelWriter.writeInt(parcel, 15, this.n);
        SafeParcelWriter.writeBoolean(parcel, 16, this.o);
        SafeParcelWriter.writeBoolean(parcel, 17, this.p);
        SafeParcelWriter.writeBoolean(parcel, 18, this.q);
        SafeParcelWriter.writeString(parcel, 19, this.r, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.s, false);
        SafeParcelWriter.writeLong(parcel, 22, this.t);
        SafeParcelWriter.writeStringList(parcel, 23, this.u, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Constructor
    zzn(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) String str3, @Param(id = 5) String str4, @Param(id = 6) long j2, @Param(id = 7) long j3, @Param(id = 8) String str5, @Param(id = 9) boolean z, @Param(id = 10) boolean z2, @Param(id = 11) long j4, @Param(id = 12) String str6, @Param(id = 13) long j5, @Param(id = 14) long j6, @Param(id = 15) int i2, @Param(id = 16) boolean z3, @Param(id = 17) boolean z4, @Param(id = 18) boolean z5, @Param(id = 19) String str7, @Param(id = 21) Boolean bool, @Param(id = 22) long j7, @Param(id = 23) List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j4;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
        this.s = bool;
        this.t = j7;
        this.u = list;
    }
}
