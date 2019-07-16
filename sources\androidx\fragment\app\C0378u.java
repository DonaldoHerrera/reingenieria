package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: androidx.fragment.app.u reason: case insensitive filesystem */
/* compiled from: FragmentManagerState */
class C0378u implements Creator<FragmentManagerState> {
    C0378u() {
    }

    public FragmentManagerState createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    public FragmentManagerState[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
