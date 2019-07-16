package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import androidx.viewpager.widget.ViewPager.SavedState;

/* compiled from: ViewPager */
class h implements ClassLoaderCreator<SavedState> {
    h() {
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
