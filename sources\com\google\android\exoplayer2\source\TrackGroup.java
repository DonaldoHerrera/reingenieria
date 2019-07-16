package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;

public final class TrackGroup implements Parcelable {
    public static final Creator<TrackGroup> CREATOR = new A();
    public final int a;
    private final Format[] b;
    private int c;

    public TrackGroup(Format... formatArr) {
        C1852xq.b(formatArr.length > 0);
        this.b = formatArr;
        this.a = formatArr.length;
    }

    public Format a(int i) {
        return this.b[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        if (this.a != trackGroup.a || !Arrays.equals(this.b, trackGroup.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }

    public int a(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.b;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    TrackGroup(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = new Format[this.a];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
