package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new C0360b();
    final int[] a;
    final ArrayList<String> b;
    final int c;
    final int d;
    final String e;
    final int f;
    final int g;
    final CharSequence h;
    final int i;
    final CharSequence j;
    final ArrayList<String> k;
    final ArrayList<String> l;
    final boolean m;

    public BackStackState(C0359a aVar) {
        int size = aVar.b.size();
        this.a = new int[(size * 5)];
        if (aVar.i) {
            this.b = new ArrayList<>(size);
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                C0008a aVar2 = (C0008a) aVar.b.get(i2);
                int i4 = i3 + 1;
                this.a[i3] = aVar2.a;
                ArrayList<String> arrayList = this.b;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.a;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.e;
                int i8 = i7 + 1;
                iArr[i7] = aVar2.f;
                i2++;
                i3 = i8;
            }
            this.c = aVar.g;
            this.d = aVar.h;
            this.e = aVar.k;
            this.f = aVar.m;
            this.g = aVar.n;
            this.h = aVar.o;
            this.i = aVar.p;
            this.j = aVar.q;
            this.k = aVar.r;
            this.l = aVar.s;
            this.m = aVar.t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0359a a(C0377t tVar) {
        C0359a aVar = new C0359a(tVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.a.length) {
            C0008a aVar2 = new C0008a();
            int i4 = i2 + 1;
            aVar2.a = this.a[i2];
            if (C0377t.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i3);
                sb.append(" base fragment #");
                sb.append(this.a[i4]);
                Log.v("FragmentManager", sb.toString());
            }
            String str = (String) this.b.get(i3);
            if (str != null) {
                aVar2.b = (Fragment) tVar.i.get(str);
            } else {
                aVar2.b = null;
            }
            int[] iArr = this.a;
            int i5 = i4 + 1;
            aVar2.c = iArr[i4];
            int i6 = i5 + 1;
            aVar2.d = iArr[i5];
            int i7 = i6 + 1;
            aVar2.e = iArr[i6];
            int i8 = i7 + 1;
            aVar2.f = iArr[i7];
            aVar.c = aVar2.c;
            aVar.d = aVar2.d;
            aVar.e = aVar2.e;
            aVar.f = aVar2.f;
            aVar.a(aVar2);
            i3++;
            i2 = i8;
        }
        aVar.g = this.c;
        aVar.h = this.d;
        aVar.k = this.e;
        aVar.m = this.f;
        aVar.i = true;
        aVar.n = this.g;
        aVar.o = this.h;
        aVar.p = this.i;
        aVar.q = this.j;
        aVar.r = this.k;
        aVar.s = this.l;
        aVar.t = this.m;
        aVar.c(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        TextUtils.writeToParcel(this.h, parcel, 0);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeStringList(this.k);
        parcel.writeStringList(this.l);
        parcel.writeInt(this.m ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.createStringArrayList();
        this.l = parcel.createStringArrayList();
        this.m = parcel.readInt() != 0;
    }
}
