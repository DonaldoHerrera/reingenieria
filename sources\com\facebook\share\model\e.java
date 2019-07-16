package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ShareOpenGraphContent */
class e implements Creator<ShareOpenGraphContent> {
    e() {
    }

    public ShareOpenGraphContent createFromParcel(Parcel parcel) {
        return new ShareOpenGraphContent(parcel);
    }

    public ShareOpenGraphContent[] newArray(int i) {
        return new ShareOpenGraphContent[i];
    }
}
