package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.login.LoginClient.Request;

/* compiled from: LoginClient */
class u implements Creator<Request> {
    u() {
    }

    public Request createFromParcel(Parcel parcel) {
        return new Request(parcel, null);
    }

    public Request[] newArray(int i) {
        return new Request[i];
    }
}
