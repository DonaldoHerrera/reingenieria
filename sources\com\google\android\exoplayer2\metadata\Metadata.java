package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Creator<Metadata> CREATOR = new a();
    private final Entry[] a;

    public interface Entry extends Parcelable {
    }

    public Metadata(Entry... entryArr) {
        if (entryArr == null) {
            entryArr = new Entry[0];
        }
        this.a = entryArr;
    }

    public int a() {
        return this.a.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((Metadata) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (Entry writeParcelable : this.a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public Entry a(int i) {
        return this.a[i];
    }

    public Metadata(List<? extends Entry> list) {
        if (list != null) {
            this.a = new Entry[list.size()];
            list.toArray(this.a);
            return;
        }
        this.a = new Entry[0];
    }

    public Metadata a(Entry... entryArr) {
        Entry[] entryArr2 = this.a;
        Entry[] entryArr3 = (Entry[]) Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, entryArr3, this.a.length, entryArr.length);
        C0471ar.a((T[]) entryArr3);
        return new Metadata(entryArr3);
    }

    Metadata(Parcel parcel) {
        this.a = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.a;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
