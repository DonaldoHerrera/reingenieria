package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class TrackSelectionParameters implements Parcelable {
    public static final Creator<TrackSelectionParameters> CREATOR = new n();
    public static final TrackSelectionParameters a = new TrackSelectionParameters();
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;

    TrackSelectionParameters() {
        this(null, null, false, 0);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        if (!TextUtils.equals(this.b, trackSelectionParameters.b) || !TextUtils.equals(this.c, trackSelectionParameters.c) || this.d != trackSelectionParameters.d || this.e != trackSelectionParameters.e) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + (this.d ? 1 : 0)) * 31) + this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        C0471ar.a(parcel, this.d);
        parcel.writeInt(this.e);
    }

    TrackSelectionParameters(String str, String str2, boolean z, int i) {
        this.b = C0471ar.f(str);
        this.c = C0471ar.f(str2);
        this.d = z;
        this.e = i;
    }

    TrackSelectionParameters(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = C0471ar.a(parcel);
        this.e = parcel.readInt();
    }
}
