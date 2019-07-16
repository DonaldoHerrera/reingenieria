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
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "EventParcelCreator")
@Reserved({1})
public final class zzai extends AbstractSafeParcelable {
    public static final Creator<zzai> CREATOR = new C1132k();
    @Field(id = 2)
    public final String a;
    @Field(id = 3)
    public final zzah b;
    @Field(id = 4)
    public final String c;
    @Field(id = 5)
    public final long d;

    @Constructor
    public zzai(@Param(id = 2) String str, @Param(id = 3) zzah zzah, @Param(id = 4) String str2, @Param(id = 5) long j) {
        this.a = str;
        this.b = zzah;
        this.c = str2;
        this.d = j;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeLong(parcel, 5, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzai(zzai zzai, long j) {
        Preconditions.checkNotNull(zzai);
        this.a = zzai.a;
        this.b = zzai.b;
        this.c = zzai.c;
        this.d = j;
    }
}
