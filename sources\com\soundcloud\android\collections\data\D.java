package com.soundcloud.android.collections.data;

import android.database.Cursor;
import androidx.room.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: LikeDao_Impl */
class D implements Callable<List<I>> {
    final /* synthetic */ w a;
    final /* synthetic */ H b;

    D(H h, w wVar) {
        this.b = h;
        this.a = wVar;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        this.a.b();
    }

    public List<I> call() throws Exception {
        Long l;
        Long l2;
        Cursor a2 = Md.a(this.b.a, this.a, false);
        try {
            int b2 = Ld.b(a2, "urn");
            int b3 = Ld.b(a2, C1325gg.TYPE);
            int b4 = Ld.b(a2, "createdAt");
            int b5 = Ld.b(a2, "addedAt");
            int b6 = Ld.b(a2, "removedAt");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C3508cda a3 = this.b.c.a(a2.getString(b2));
                ea a4 = this.b.c.a(a2.getInt(b3));
                long j = a2.getLong(b4);
                if (a2.isNull(b5)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(b5));
                }
                if (a2.isNull(b6)) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(a2.getLong(b6));
                }
                I i = new I(a3, a4, j, l, l2);
                arrayList.add(i);
            }
            return arrayList;
        } finally {
            a2.close();
        }
    }
}
