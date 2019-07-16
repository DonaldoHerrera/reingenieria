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
import com.google.android.gms.internal.cast.X;

@ShowFirstParty
@Class(creator = "EqualizerSettingsCreator")
@Reserved({1})
public final class zzae extends AbstractSafeParcelable {
    public static final Creator<zzae> CREATOR = new r();
    @Field(getter = "getLowShelf", id = 2)
    private final zzac a;
    @Field(getter = "getHighShelf", id = 3)
    private final zzac b;

    @Constructor
    public zzae(@Param(id = 2) zzac zzac, @Param(id = 3) zzac zzac2) {
        this.a = zzac;
        this.b = zzac2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzae = (zzae) obj;
        return X.a(this.a, zzae.a) && X.a(this.b, zzae.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
