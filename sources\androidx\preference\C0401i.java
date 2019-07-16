package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: androidx.preference.i reason: case insensitive filesystem */
/* compiled from: MultiSelectListPreference */
class C0401i implements Creator<SavedState> {
    C0401i() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
