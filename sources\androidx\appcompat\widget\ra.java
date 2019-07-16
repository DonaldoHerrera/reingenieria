package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import androidx.appcompat.widget.Toolbar.SavedState;

/* compiled from: Toolbar */
class ra implements ClassLoaderCreator<SavedState> {
    ra() {
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
