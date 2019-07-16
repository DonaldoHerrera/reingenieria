package com.soundcloud.android.ads.data;

import androidx.room.C0434c;
import androidx.room.t;

/* compiled from: VideoAdsDao_Impl */
class z extends C0434c<h> {
    final /* synthetic */ E d;

    z(E e, t tVar) {
        this.d = e;
        super(tVar);
    }

    public String c() {
        return "INSERT OR ABORT INTO `videoAds`(`id`,`ad`,`errorAd`,`expiryTimestamp`,`appVersion`) VALUES (nullif(?, 0),?,?,?,?)";
    }

    public void a(Yd yd, h hVar) {
        yd.a(1, hVar.e());
        String a = this.d.c.a(hVar.a());
        if (a == null) {
            yd.c(2);
        } else {
            yd.a(2, a);
        }
        String a2 = this.d.c.a(hVar.c());
        if (a2 == null) {
            yd.c(3);
        } else {
            yd.a(3, a2);
        }
        yd.a(4, hVar.d());
        yd.a(5, (long) hVar.b());
    }
}
