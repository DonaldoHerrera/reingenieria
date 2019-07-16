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

@Class(creator = "UserAttributeParcelCreator")
public final class zzjn extends AbstractSafeParcelable {
    public static final Creator<zzjn> CREATOR = new Td();
    @Field(id = 1)
    private final int a;
    @Field(id = 2)
    public final String b;
    @Field(id = 3)
    public final long c;
    @Field(id = 4)
    public final Long d;
    @Field(id = 5)
    private final Float e;
    @Field(id = 6)
    public final String f;
    @Field(id = 7)
    public final String g;
    @Field(id = 8)
    public final Double h;

    zzjn(Sd sd) {
        this(sd.c, sd.d, sd.e, sd.b);
    }

    public final Object i() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d2 = this.h;
        if (d2 != null) {
            return d2;
        }
        String str = this.f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeLongObject(parcel, 4, this.d, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeString(parcel, 7, this.g, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzjn(String str, long j, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.g = str2;
        if (obj == null) {
            this.d = null;
            this.e = null;
            this.h = null;
            this.f = null;
        } else if (obj instanceof Long) {
            this.d = (Long) obj;
            this.e = null;
            this.h = null;
            this.f = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.e = null;
            this.h = null;
            this.f = (String) obj;
        } else if (obj instanceof Double) {
            this.d = null;
            this.e = null;
            this.h = (Double) obj;
            this.f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    zzjn(String str, long j, String str2) {
        Preconditions.checkNotEmpty(str);
        this.a = 2;
        this.b = str;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.h = null;
        this.f = null;
        this.g = null;
    }

    @Constructor
    zzjn(@Param(id = 1) int i, @Param(id = 2) String str, @Param(id = 3) long j, @Param(id = 4) Long l, @Param(id = 5) Float f2, @Param(id = 6) String str2, @Param(id = 7) String str3, @Param(id = 8) Double d2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        Double d3 = null;
        this.e = null;
        if (i == 1) {
            if (f2 != null) {
                d3 = Double.valueOf(f2.doubleValue());
            }
            this.h = d3;
        } else {
            this.h = d2;
        }
        this.f = str2;
        this.g = str3;
    }
}
