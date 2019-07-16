package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: androidx.preference.f reason: case insensitive filesystem */
/* compiled from: ListPreference */
class C0398f implements Creator<SavedState> {
    C0398f() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
