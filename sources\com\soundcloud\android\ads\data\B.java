package com.soundcloud.android.ads.data;

import androidx.room.C;
import androidx.room.t;

/* compiled from: VideoAdsDao_Impl */
class B extends C {
    final /* synthetic */ E d;

    B(E e, t tVar) {
        this.d = e;
        super(tVar);
    }

    public String c() {
        return "DELETE FROM videoAds WHERE (expiryTimestamp < ? OR appVersion != ?)";
    }
}
