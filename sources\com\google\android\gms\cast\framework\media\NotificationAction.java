package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "NotificationActionCreator")
@Reserved({1})
public class NotificationAction extends AbstractSafeParcelable {
    public static final Creator<NotificationAction> CREATOR = new K();
    @Field(getter = "getAction", id = 2)
    private final String a;
    @Field(getter = "getIconResId", id = 3)
    private final int b;
    @Field(getter = "getContentDescription", id = 4)
    private final String c;

    public static final class a {
        private String a;

        public final a a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.a = str;
                return this;
            }
            throw new IllegalArgumentException("action cannot be null or an empty string.");
        }
    }

    @Constructor
    NotificationAction(@Param(id = 2) String str, @Param(id = 3) int i, @Param(id = 4) String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public String F() {
        return this.c;
    }

    public int G() {
        return this.b;
    }

    public String i() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, i(), false);
        SafeParcelWriter.writeInt(parcel, 3, G());
        SafeParcelWriter.writeString(parcel, 4, F(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
