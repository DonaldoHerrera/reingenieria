package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState;

/* compiled from: StaggeredGridLayoutManager */
class ma implements Creator<SavedState> {
    ma() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
