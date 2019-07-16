package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Iterator;

@Class(creator = "EventParamsCreator")
@Reserved({1})
public final class zzah extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzah> CREATOR = new C1122i();
    /* access modifiers changed from: private */
    @Field(getter = "z", id = 2)
    public final Bundle a;

    @Constructor
    zzah(@Param(id = 2) Bundle bundle) {
        this.a = bundle;
    }

    /* access modifiers changed from: 0000 */
    public final Object a(String str) {
        return this.a.get(str);
    }

    /* access modifiers changed from: 0000 */
    public final Long b(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    public final String c(String str) {
        return this.a.getString(str);
    }

    /* access modifiers changed from: 0000 */
    public final Double d(String str) {
        return Double.valueOf(this.a.getDouble(str));
    }

    public final Bundle i() {
        return new Bundle(this.a);
    }

    public final Iterator<String> iterator() {
        return new C1117h(this);
    }

    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, i(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
