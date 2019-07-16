package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "SignInConfigurationCreator")
@Reserved({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new u();
    @Field(getter = "getConsumerPkgName", id = 2)
    private final String a;
    @Field(getter = "getGoogleConfig", id = 5)
    private GoogleSignInOptions b;

    @Constructor
    public SignInConfiguration(@Param(id = 2) String str, @Param(id = 5) GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = this.b;
            if (googleSignInOptions != null ? googleSignInOptions.equals(signInConfiguration.b) : signInConfiguration.b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a aVar = new a();
        aVar.a((Object) this.a);
        aVar.a((Object) this.b);
        return aVar.a();
    }

    public final GoogleSignInOptions i() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
