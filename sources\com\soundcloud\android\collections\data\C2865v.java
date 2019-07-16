package com.soundcloud.android.collections.data;

import android.database.Cursor;
import androidx.room.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.soundcloud.android.collections.data.v reason: case insensitive filesystem */
/* compiled from: LikeDao_Impl */
class C2865v implements Callable<List<C3508cda>> {
    final /* synthetic */ w a;
    final /* synthetic */ H b;

    /* access modifiers changed from: protected */
    public void finalize() {
        this.a.b();
    }

    public List<C3508cda> call() throws Exception {
        Cursor a2 = Md.a(this.b.a, this.a, false);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(this.b.c.a(a2.getString(0)));
            }
            return arrayList;
        } finally {
            a2.close();
        }
    }
}
