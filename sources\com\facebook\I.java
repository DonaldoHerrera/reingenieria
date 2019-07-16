package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;

/* compiled from: GraphRequest */
class I implements Creator<ParcelableResourceWithMimeType> {
    I() {
    }

    public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
        return new ParcelableResourceWithMimeType(parcel, (E) null);
    }

    public ParcelableResourceWithMimeType[] newArray(int i) {
        return new ParcelableResourceWithMimeType[i];
    }
}
