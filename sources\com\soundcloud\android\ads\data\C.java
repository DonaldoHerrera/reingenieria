package com.soundcloud.android.ads.data;

import androidx.room.t;

/* compiled from: VideoAdsDao_Impl */
class C extends androidx.room.C {
    final /* synthetic */ E d;

    C(E e, t tVar) {
        this.d = e;
        super(tVar);
    }

    public String c() {
        return "DELETE FROM videoAds";
    }
}
