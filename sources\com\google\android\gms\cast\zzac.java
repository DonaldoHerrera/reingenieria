package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@ShowFirstParty
@Class(creator = "EqualizerBandSettingsCreator")
@Reserved({1})
public final class zzac extends AbstractSafeParcelable {
    public static final Creator<zzac> CREATOR = new C0684q();
    @Field(getter = "getFrequency", id = 2)
    private final float a;
    @Field(getter = "getQFactor", id = 3)
    private final float b;
    @Field(getter = "getGainDb", id = 4)
    private final float c;

    @Constructor
    public zzac(@Param(id = 2) float f, @Param(id = 3) float f2, @Param(id = 4) float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzac)) {
            return false;
        }
        zzac zzac = (zzac) obj;
        return this.a == zzac.a && this.b == zzac.b && this.c == zzac.c;
    }

    public final int hashCode() {
        return Objects.hashCode(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.a);
        SafeParcelWriter.writeFloat(parcel, 3, this.b);
        SafeParcelWriter.writeFloat(parcel, 4, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
