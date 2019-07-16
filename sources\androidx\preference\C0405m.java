package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.preference.Preference.BaseSavedState;

/* renamed from: androidx.preference.m reason: case insensitive filesystem */
/* compiled from: Preference */
class C0405m implements Creator<BaseSavedState> {
    C0405m() {
    }

    public BaseSavedState createFromParcel(Parcel parcel) {
        return new BaseSavedState(parcel);
    }

    public BaseSavedState[] newArray(int i) {
        return new BaseSavedState[i];
    }
}
