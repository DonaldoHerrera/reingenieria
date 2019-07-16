package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ShareHashtag */
class a implements Creator<ShareHashtag> {
    a() {
    }

    public ShareHashtag createFromParcel(Parcel parcel) {
        return new ShareHashtag(parcel);
    }

    public ShareHashtag[] newArray(int i) {
        return new ShareHashtag[i];
    }
}
