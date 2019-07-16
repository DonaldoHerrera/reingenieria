package com.soundcloud.android.view.bottomnav;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ScBottomNavigationPresenter */
class d implements Creator<SavedState> {
    d() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
