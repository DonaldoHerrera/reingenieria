package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: androidx.preference.d reason: case insensitive filesystem */
/* compiled from: EditTextPreference */
class C0396d implements Creator<SavedState> {
    C0396d() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
