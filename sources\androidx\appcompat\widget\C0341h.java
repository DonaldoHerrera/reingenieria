package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: androidx.appcompat.widget.h reason: case insensitive filesystem */
/* compiled from: ActionMenuPresenter */
class C0341h implements Creator<SavedState> {
    C0341h() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
