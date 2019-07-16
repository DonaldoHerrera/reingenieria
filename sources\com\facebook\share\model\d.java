package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ShareOpenGraphAction */
class d implements Creator<ShareOpenGraphAction> {
    d() {
    }

    public ShareOpenGraphAction createFromParcel(Parcel parcel) {
        return new ShareOpenGraphAction(parcel);
    }

    public ShareOpenGraphAction[] newArray(int i) {
        return new ShareOpenGraphAction[i];
    }
}
