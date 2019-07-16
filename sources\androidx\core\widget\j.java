package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: NestedScrollView */
class j implements Creator<SavedState> {
    j() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
