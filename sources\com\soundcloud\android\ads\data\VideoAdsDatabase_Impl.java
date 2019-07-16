package com.soundcloud.android.ads.data;

import androidx.room.C0432a;
import androidx.room.h;
import androidx.room.v;
import java.util.HashMap;

public final class VideoAdsDatabase_Impl extends VideoAdsDatabase {
    private volatile v l;

    public v n() {
        v vVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new E(this);
            }
            vVar = this.l;
        }
        return vVar;
    }

    /* access modifiers changed from: protected */
    public h d() {
        return new h(this, new HashMap(0), new HashMap(0), "videoAds");
    }

    /* access modifiers changed from: protected */
    public Vd a(C0432a aVar) {
        v vVar = new v(aVar, new F(this, 2), "0f806da86321144e6c5df8a109f84e0b", "139a6c7ff71ad530c1e611a983540923");
        a a = b.a(aVar.b);
        a.a(aVar.c);
        a.a((a) vVar);
        return aVar.a.a(a.a());
    }
}
