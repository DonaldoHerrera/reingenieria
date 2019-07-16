package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {
    public static final Creator<ShareLinkContent> CREATOR = new b();
    @Deprecated
    private final String g;
    @Deprecated
    private final String h;
    @Deprecated
    private final Uri i;
    private final String j;

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.j = parcel.readString();
    }

    public String c() {
        return this.j;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, 0);
        parcel.writeString(this.j);
    }
}
