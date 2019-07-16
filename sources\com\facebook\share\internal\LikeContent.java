package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.c;

@Deprecated
public class LikeContent implements ShareModel {
    @Deprecated
    public static final Creator<LikeContent> CREATOR = new x();
    private final String a;
    private final String b;

    @Deprecated
    public static class a implements c<LikeContent, a> {
        /* access modifiers changed from: private */
        public String a;
        /* access modifiers changed from: private */
        public String b;

        @Deprecated
        public a a(String str) {
            this.a = str;
            return this;
        }

        @Deprecated
        public a b(String str) {
            this.b = str;
            return this;
        }

        @Deprecated
        public LikeContent a() {
            return new LikeContent(this, null);
        }
    }

    /* synthetic */ LikeContent(a aVar, x xVar) {
        this(aVar);
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    private LikeContent(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
    }

    @Deprecated
    LikeContent(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
