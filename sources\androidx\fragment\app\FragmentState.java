package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new y();
    final String a;
    final String b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    final boolean j;
    Bundle k;
    Fragment l;

    FragmentState(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.mWho;
        this.c = fragment.mFromLayout;
        this.d = fragment.mFragmentId;
        this.e = fragment.mContainerId;
        this.f = fragment.mTag;
        this.g = fragment.mRetainInstance;
        this.h = fragment.mDetached;
        this.i = fragment.mArguments;
        this.j = fragment.mHidden;
    }

    public Fragment a(ClassLoader classLoader, C0368j jVar) {
        if (this.l == null) {
            Bundle bundle = this.i;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            this.l = jVar.a(classLoader, this.a, this.i);
            this.l.setArguments(this.i);
            Bundle bundle2 = this.k;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.l.mSavedFragmentState = this.k;
            } else {
                this.l.mSavedFragmentState = new Bundle();
            }
            Fragment fragment = this.l;
            fragment.mWho = this.b;
            fragment.mFromLayout = this.c;
            fragment.mRestored = true;
            fragment.mFragmentId = this.d;
            fragment.mContainerId = this.e;
            fragment.mTag = this.f;
            fragment.mRetainInstance = this.g;
            fragment.mDetached = this.h;
            fragment.mHidden = this.j;
            if (C0377t.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiated fragment ");
                sb.append(this.l);
                Log.v("FragmentManager", sb.toString());
            }
        }
        return this.l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
    }

    FragmentState(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        boolean z = true;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.j = z;
        this.k = parcel.readBundle();
    }
}
