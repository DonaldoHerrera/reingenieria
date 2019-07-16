package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphAction.a;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Creator<ShareOpenGraphContent> CREATOR = new e();
    private final ShareOpenGraphAction g;
    private final String h;

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.g = new a().a(parcel).a();
        this.h = parcel.readString();
    }

    public ShareOpenGraphAction c() {
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.h);
    }
}
