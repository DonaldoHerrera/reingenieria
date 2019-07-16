package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new C0378u();
    ArrayList<FragmentState> a;
    ArrayList<String> b;
    BackStackState[] c;
    String d = null;
    int e;

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }

    public FragmentManagerState(Parcel parcel) {
        this.a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }
}
