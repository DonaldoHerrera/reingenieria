package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: StaggeredGridLayoutManager */
class la implements Creator<FullSpanItem> {
    la() {
    }

    public FullSpanItem createFromParcel(Parcel parcel) {
        return new FullSpanItem(parcel);
    }

    public FullSpanItem[] newArray(int i) {
        return new FullSpanItem[i];
    }
}
