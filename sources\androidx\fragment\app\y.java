package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: FragmentState */
class y implements Creator<FragmentState> {
    y() {
    }

    public FragmentState createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }

    public FragmentState[] newArray(int i) {
        return new FragmentState[i];
    }
}
