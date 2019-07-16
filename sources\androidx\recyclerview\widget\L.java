package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.recyclerview.widget.LinearLayoutManager.SavedState;

/* compiled from: LinearLayoutManager */
class L implements Creator<SavedState> {
    L() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
