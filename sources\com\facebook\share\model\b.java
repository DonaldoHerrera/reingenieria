package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ShareLinkContent */
class b implements Creator<ShareLinkContent> {
    b() {
    }

    public ShareLinkContent createFromParcel(Parcel parcel) {
        return new ShareLinkContent(parcel);
    }

    public ShareLinkContent[] newArray(int i) {
        return new ShareLinkContent[i];
    }
}
