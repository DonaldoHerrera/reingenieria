package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: SharePhoto */
class g implements Creator<SharePhoto> {
    g() {
    }

    public SharePhoto createFromParcel(Parcel parcel) {
        return new SharePhoto(parcel);
    }

    public SharePhoto[] newArray(int i) {
        return new SharePhoto[i];
    }
}
