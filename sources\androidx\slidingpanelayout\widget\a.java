package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: SlidingPaneLayout */
class a implements ClassLoaderCreator<SavedState> {
    a() {
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }

    public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SavedState(parcel, null);
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel, null);
    }
}
