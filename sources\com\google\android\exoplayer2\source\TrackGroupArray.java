package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final Creator<TrackGroupArray> CREATOR = new B();
    public static final TrackGroupArray a = new TrackGroupArray(new TrackGroup[0]);
    public final int b;
    private final TrackGroup[] c;
    private int d;

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.c = trackGroupArr;
        this.b = trackGroupArr.length;
    }

    public TrackGroup a(int i) {
        return this.c[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.b != trackGroupArray.b || !Arrays.equals(this.c, trackGroupArray.c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = Arrays.hashCode(this.c);
        }
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        for (int i2 = 0; i2 < this.b; i2++) {
            parcel.writeParcelable(this.c[i2], 0);
        }
    }

    public int a(TrackGroup trackGroup) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    TrackGroupArray(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = new TrackGroup[this.b];
        for (int i = 0; i < this.b; i++) {
            this.c[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
