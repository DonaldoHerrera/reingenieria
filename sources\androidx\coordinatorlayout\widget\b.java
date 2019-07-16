package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: CoordinatorLayout */
class b implements ClassLoaderCreator<SavedState> {
    b() {
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }

    public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SavedState(parcel, classLoader);
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel, null);
    }
}
