package com.soundcloud.android.ads.data;

import android.database.Cursor;
import androidx.room.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: VideoAdsDao_Impl */
class D implements Callable<List<h>> {
    final /* synthetic */ w a;
    final /* synthetic */ E b;

    D(E e, w wVar) {
        this.b = e;
        this.a = wVar;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        this.a.b();
    }

    public List<h> call() throws Exception {
        Cursor a2 = Md.a(this.b.a, this.a, false);
        try {
            int b2 = Ld.b(a2, "id");
            int b3 = Ld.b(a2, "ad");
            int b4 = Ld.b(a2, "errorAd");
            int b5 = Ld.b(a2, "expiryTimestamp");
            int b6 = Ld.b(a2, "appVersion");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                h hVar = new h(this.b.c.a(a2.getString(b3)), this.b.c.b(a2.getString(b4)), a2.getLong(b5), a2.getInt(b6));
                hVar.a(a2.getLong(b2));
                arrayList.add(hVar);
            }
            return arrayList;
        } finally {
            a2.close();
        }
    }
}
