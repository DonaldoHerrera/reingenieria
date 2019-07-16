package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: androidx.fragment.app.b reason: case insensitive filesystem */
/* compiled from: BackStackState */
class C0360b implements Creator<BackStackState> {
    C0360b() {
    }

    public BackStackState createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    public BackStackState[] newArray(int i) {
        return new BackStackState[i];
    }
}
