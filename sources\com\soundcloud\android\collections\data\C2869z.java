package com.soundcloud.android.collections.data;

import androidx.room.C0434c;
import androidx.room.t;

/* renamed from: com.soundcloud.android.collections.data.z reason: case insensitive filesystem */
/* compiled from: LikeDao_Impl */
class C2869z extends C0434c<I> {
    final /* synthetic */ H d;

    C2869z(H h, t tVar) {
        this.d = h;
        super(tVar);
    }

    public String c() {
        return "INSERT OR REPLACE INTO `likes`(`urn`,`type`,`createdAt`,`addedAt`,`removedAt`) VALUES (?,?,?,?,?)";
    }

    public void a(Yd yd, I i) {
        String a = this.d.c.a(i.e());
        if (a == null) {
            yd.c(1);
        } else {
            yd.a(1, a);
        }
        yd.a(2, (long) this.d.c.a(i.d()));
        yd.a(3, i.b());
        if (i.a() == null) {
            yd.c(4);
        } else {
            yd.a(4, i.a().longValue());
        }
        if (i.c() == null) {
            yd.c(5);
        } else {
            yd.a(5, i.c().longValue());
        }
    }
}
