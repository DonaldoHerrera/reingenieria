package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "ImageHintsCreator")
@Reserved({1})
public class ImageHints extends AbstractSafeParcelable {
    public static final Creator<ImageHints> CREATOR = new D();
    @Field(getter = "getType", id = 2)
    private final int a;
    @Field(getter = "getWidthInPixels", id = 3)
    private final int b;
    @Field(getter = "getHeightInPixels", id = 4)
    private final int c;

    @Constructor
    public ImageHints(@Param(id = 2) int i, @Param(id = 3) int i2, @Param(id = 4) int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int F() {
        return this.a;
    }

    public int G() {
        return this.b;
    }

    public int i() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, F());
        SafeParcelWriter.writeInt(parcel, 3, G());
        SafeParcelWriter.writeInt(parcel, 4, i());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
