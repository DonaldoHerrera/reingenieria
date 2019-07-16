package com.soundcloud.android.ads.data;

import androidx.room.C0433b;
import androidx.room.t;

/* compiled from: VideoAdsDao_Impl */
class A extends C0433b<h> {
    final /* synthetic */ E d;

    A(E e, t tVar) {
        this.d = e;
        super(tVar);
    }

    public String c() {
        return "DELETE FROM `videoAds` WHERE `id` = ?";
    }

    public void a(Yd yd, h hVar) {
        yd.a(1, hVar.e());
    }
}
