package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import androidx.fragment.app.Fragment.SavedState;

/* renamed from: androidx.fragment.app.f reason: case insensitive filesystem */
/* compiled from: Fragment */
class C0364f implements ClassLoaderCreator<SavedState> {
    C0364f() {
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel, null);
    }

    public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SavedState(parcel, classLoader);
    }
}
