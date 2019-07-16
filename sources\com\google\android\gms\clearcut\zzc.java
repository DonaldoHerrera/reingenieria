package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "CollectForDebugParcelableCreator")
public final class zzc extends AbstractSafeParcelable {
    public static final Creator<zzc> CREATOR = new d();
    @Field(defaultValue = "false", id = 1)
    private final boolean a;
    @Field(id = 3)
    private final long b;
    @Field(id = 2)
    private final long c;

    @Constructor
    public zzc(@Param(id = 1) boolean z, @Param(id = 3) long j, @Param(id = 2) long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzc = (zzc) obj;
            return this.a == zzc.a && this.b == zzc.b && this.c == zzc.c;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb.append(this.a);
        sb.append(",collectForDebugStartTimeMillis: ");
        sb.append(this.b);
        sb.append(",collectForDebugExpiryTimeMillis: ");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.c);
        SafeParcelWriter.writeLong(parcel, 3, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
