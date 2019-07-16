package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "PlayLoggerContextCreator")
@Reserved({1})
public final class zzr extends AbstractSafeParcelable {
    public static final Creator<zzr> CREATOR = new wc();
    @Field(id = 2)
    private final String a;
    @Field(id = 3)
    private final int b;
    @Field(id = 4)
    public final int c;
    @Field(id = 5)
    private final String d;
    @Field(id = 6)
    private final String e;
    @Field(defaultValue = "true", id = 7)
    private final boolean f;
    @Field(id = 8)
    public final String g;
    @Field(id = 9)
    private final boolean h;
    @Field(id = 10)
    private final int i;

    public zzr(String str, int i2, int i3, String str2, String str3, String str4, boolean z, bc bcVar) {
        Preconditions.checkNotNull(str);
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.g = str2;
        this.d = str3;
        this.e = str4;
        this.f = !z;
        this.h = z;
        this.i = bcVar.zzc();
    }

    @Constructor
    public zzr(@Param(id = 2) String str, @Param(id = 3) int i2, @Param(id = 4) int i3, @Param(id = 5) String str2, @Param(id = 6) String str3, @Param(id = 7) boolean z, @Param(id = 8) String str4, @Param(id = 9) boolean z2, @Param(id = 10) int i4) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzr = (zzr) obj;
            return Objects.equal(this.a, zzr.a) && this.b == zzr.b && this.c == zzr.c && Objects.equal(this.g, zzr.g) && Objects.equal(this.d, zzr.d) && Objects.equal(this.e, zzr.e) && this.f == zzr.f && this.h == zzr.h && this.i == zzr.i;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayLoggerContext[");
        sb.append("package=");
        sb.append(this.a);
        sb.append(',');
        sb.append("packageVersionCode=");
        sb.append(this.b);
        sb.append(',');
        sb.append("logSource=");
        sb.append(this.c);
        sb.append(',');
        sb.append("logSourceName=");
        sb.append(this.g);
        sb.append(',');
        sb.append("uploadAccount=");
        sb.append(this.d);
        sb.append(',');
        sb.append("loggingId=");
        sb.append(this.e);
        sb.append(',');
        sb.append("logAndroidId=");
        sb.append(this.f);
        sb.append(',');
        sb.append("isAnonymous=");
        sb.append(this.h);
        sb.append(',');
        sb.append("qosTier=");
        sb.append(this.i);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeInt(parcel, 3, this.b);
        SafeParcelWriter.writeInt(parcel, 4, this.c);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.writeString(parcel, 6, this.e, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.h);
        SafeParcelWriter.writeInt(parcel, 10, this.i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
