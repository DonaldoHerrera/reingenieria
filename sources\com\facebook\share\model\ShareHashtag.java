package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ShareHashtag implements ShareModel {
    public static final Creator<ShareHashtag> CREATOR = new a();
    private final String a;

    public static class a implements c<ShareHashtag, a> {
        /* access modifiers changed from: private */
        public String a;

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(ShareHashtag shareHashtag) {
            if (shareHashtag == null) {
                return this;
            }
            a(shareHashtag.a());
            return this;
        }

        /* access modifiers changed from: 0000 */
        public a a(Parcel parcel) {
            a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
            return this;
        }

        public ShareHashtag a() {
            return new ShareHashtag(this, null);
        }
    }

    /* synthetic */ ShareHashtag(a aVar, a aVar2) {
        this(aVar);
    }

    public String a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    private ShareHashtag(a aVar) {
        this.a = aVar.a;
    }

    ShareHashtag(Parcel parcel) {
        this.a = parcel.readString();
    }
}
