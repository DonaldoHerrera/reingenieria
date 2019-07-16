package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzae;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "DeviceStatusCreator")
@Reserved({1})
public final class zzdb extends AbstractSafeParcelable {
    public static final Creator<zzdb> CREATOR = new Y();
    @Field(getter = "getVolume", id = 2)
    private double a;
    @Field(getter = "getMuteState", id = 3)
    private boolean b;
    @Field(getter = "getActiveInputState", id = 4)
    private int c;
    @Field(getter = "getApplicationMetadata", id = 5)
    private ApplicationMetadata d;
    @Field(getter = "getStandbyState", id = 6)
    private int e;
    @Field(getter = "getEqualizerSettings", id = 7)
    private zzae f;
    @Field(getter = "getStepInterval", id = 8)
    private double g;

    @Constructor
    zzdb(@Param(id = 2) double d2, @Param(id = 3) boolean z, @Param(id = 4) int i, @Param(id = 5) ApplicationMetadata applicationMetadata, @Param(id = 6) int i2, @Param(id = 7) zzae zzae, @Param(id = 8) double d3) {
        this.a = d2;
        this.b = z;
        this.c = i;
        this.d = applicationMetadata;
        this.e = i2;
        this.f = zzae;
        this.g = d3;
    }

    public final int F() {
        return this.e;
    }

    public final double G() {
        return this.a;
    }

    public final boolean H() {
        return this.b;
    }

    public final zzae I() {
        return this.f;
    }

    public final double X() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdb = (zzdb) obj;
        if (this.a == zzdb.a && this.b == zzdb.b && this.c == zzdb.c && X.a(this.d, zzdb.d) && this.e == zzdb.e) {
            zzae zzae = this.f;
            return X.a(zzae, zzae) && this.g == zzdb.g;
        }
    }

    public final ApplicationMetadata h() {
        return this.d;
    }

    public final int hashCode() {
        return Objects.hashCode(Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g));
    }

    public final int i() {
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.a);
        SafeParcelWriter.writeBoolean(parcel, 3, this.b);
        SafeParcelWriter.writeInt(parcel, 4, this.c);
        SafeParcelWriter.writeParcelable(parcel, 5, this.d, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.e);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f, i, false);
        SafeParcelWriter.writeDouble(parcel, 8, this.g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzdb() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }
}
