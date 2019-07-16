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
@Class(creator = "JoinOptionsCreator")
@Reserved({1})
public final class zzah extends AbstractSafeParcelable {
    public static final Creator<zzah> CREATOR = new C0686t();
    @Field(getter = "getConnectionType", id = 2)
    private int a;

    @Constructor
    zzah(@Param(id = 2) int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        return this.a == ((zzah) obj).a;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a));
    }

    public final String toString() {
        int i = this.a;
        String str = i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG";
        return String.format("joinOptions(connectionType=%s)", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzah() {
        this(0);
    }
}
