package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PreferenceGroup */
class u implements Creator<SavedState> {
    u() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
