package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ShareOpenGraphObject */
class f implements Creator<ShareOpenGraphObject> {
    f() {
    }

    public ShareOpenGraphObject createFromParcel(Parcel parcel) {
        return new ShareOpenGraphObject(parcel);
    }

    public ShareOpenGraphObject[] newArray(int i) {
        return new ShareOpenGraphObject[i];
    }
}
