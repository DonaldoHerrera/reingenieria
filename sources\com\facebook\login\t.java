package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: LoginClient */
class t implements Creator<LoginClient> {
    t() {
    }

    public LoginClient createFromParcel(Parcel parcel) {
        return new LoginClient(parcel);
    }

    public LoginClient[] newArray(int i) {
        return new LoginClient[i];
    }
}
