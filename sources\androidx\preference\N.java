package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: TwoStatePreference */
class N implements Creator<SavedState> {
    N() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
