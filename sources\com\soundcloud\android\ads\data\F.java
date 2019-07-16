package com.soundcloud.android.ads.data;

import androidx.room.t.b;
import androidx.room.v.a;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: VideoAdsDatabase_Impl */
class F extends a {
    final /* synthetic */ VideoAdsDatabase_Impl b;

    F(VideoAdsDatabase_Impl videoAdsDatabase_Impl, int i) {
        this.b = videoAdsDatabase_Impl;
        super(i);
    }

    public void a(Ud ud) {
        ud.g("CREATE TABLE IF NOT EXISTS `videoAds` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ad` TEXT, `errorAd` TEXT, `expiryTimestamp` INTEGER NOT NULL, `appVersion` INTEGER NOT NULL)");
        ud.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ud.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0f806da86321144e6c5df8a109f84e0b')");
    }

    public void b(Ud ud) {
        ud.g("DROP TABLE IF EXISTS `videoAds`");
    }

    /* access modifiers changed from: protected */
    public void c(Ud ud) {
        if (this.b.h != null) {
            int size = this.b.h.size();
            for (int i = 0; i < size; i++) {
                ((b) this.b.h.get(i)).a(ud);
            }
        }
    }

    public void d(Ud ud) {
        this.b.a = ud;
        this.b.a(ud);
        if (this.b.h != null) {
            int size = this.b.h.size();
            for (int i = 0; i < size; i++) {
                ((b) this.b.h.get(i)).b(ud);
            }
        }
    }

    public void e(Ud ud) {
    }

    public void f(Ud ud) {
        Md.a(ud);
    }

    /* access modifiers changed from: protected */
    public void g(Ud ud) {
        HashMap hashMap = new HashMap(5);
        String str = "id";
        String str2 = "INTEGER";
        hashMap.put(str, new a(str, str2, true, 1));
        String str3 = "TEXT";
        String str4 = "ad";
        hashMap.put(str4, new a(str4, str3, false, 0));
        String str5 = "errorAd";
        hashMap.put(str5, new a(str5, str3, false, 0));
        String str6 = "expiryTimestamp";
        hashMap.put(str6, new a(str6, str2, true, 0));
        String str7 = "appVersion";
        hashMap.put(str7, new a(str7, str2, true, 0));
        String str8 = "videoAds";
        Od od = new Od(str8, hashMap, new HashSet(0), new HashSet(0));
        Od a = Od.a(ud, str8);
        if (!od.equals(a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Migration didn't properly handle videoAds(com.soundcloud.android.ads.data.VideoAdEntity).\n Expected:\n");
            sb.append(od);
            sb.append("\n Found:\n");
            sb.append(a);
            throw new IllegalStateException(sb.toString());
        }
    }
}
