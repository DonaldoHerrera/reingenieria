package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, a> {
    public static final Creator<ShareOpenGraphAction> CREATOR = new d();

    public static final class a extends com.facebook.share.model.ShareOpenGraphValueContainer.a<ShareOpenGraphAction, a> {
        public a a(String str) {
            a("og:type", str);
            return this;
        }

        public ShareOpenGraphAction a() {
            return new ShareOpenGraphAction(this, null);
        }

        public a a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            super.a(shareOpenGraphAction);
            a aVar = this;
            aVar.a(shareOpenGraphAction.c());
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        public a a(Parcel parcel) {
            return a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    /* synthetic */ ShareOpenGraphAction(a aVar, d dVar) {
        this(aVar);
    }

    public String c() {
        return b("og:type");
    }

    private ShareOpenGraphAction(a aVar) {
        super((com.facebook.share.model.ShareOpenGraphValueContainer.a<P, E>) aVar);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }
}
