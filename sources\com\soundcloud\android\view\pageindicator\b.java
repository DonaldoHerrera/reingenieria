package com.soundcloud.android.view.pageindicator;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: CirclePageIndicator */
class b implements Creator<SavedState> {
    b() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
