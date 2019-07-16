package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "SignInAccountCreator")
@Reserved({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new f();
    @Field(defaultValue = "", id = 4)
    @Deprecated
    private String a;
    @Field(getter = "getGoogleSignInAccount", id = 7)
    private GoogleSignInAccount b;
    @Field(defaultValue = "", id = 8)
    @Deprecated
    private String c;

    @Constructor
    SignInAccount(@Param(id = 4) String str, @Param(id = 7) GoogleSignInAccount googleSignInAccount, @Param(id = 8) String str2) {
        this.b = googleSignInAccount;
        Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    public final GoogleSignInAccount i() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
