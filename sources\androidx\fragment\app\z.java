package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: FragmentTabHost */
class z implements Creator<SavedState> {
    z() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
