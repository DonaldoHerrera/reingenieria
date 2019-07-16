package com.soundcloud.android.collections.data;

import androidx.room.C0433b;
import androidx.room.t;

/* compiled from: LikeDao_Impl */
class A extends C0433b<I> {
    final /* synthetic */ H d;

    A(H h, t tVar) {
        this.d = h;
        super(tVar);
    }

    public String c() {
        return "UPDATE OR ABORT `likes` SET `urn` = ?,`type` = ?,`createdAt` = ?,`addedAt` = ?,`removedAt` = ? WHERE `urn` = ? AND `type` = ?";
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
        String a2 = this.d.c.a(i.e());
        if (a2 == null) {
            yd.c(6);
        } else {
            yd.a(6, a2);
        }
        yd.a(7, (long) this.d.c.a(i.d()));
    }
}
