package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.login.LoginClient.Result;

/* compiled from: LoginClient */
class v implements Creator<Result> {
    v() {
    }

    public Result createFromParcel(Parcel parcel) {
        return new Result(parcel, null);
    }

    public Result[] newArray(int i) {
        return new Result[i];
    }
}
