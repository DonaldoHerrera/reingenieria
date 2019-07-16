package com.facebook.internal;

import android.graphics.Bitmap;
import com.facebook.internal.P.b;

/* compiled from: ImageDownloader */
class M implements Runnable {
    final /* synthetic */ P a;
    final /* synthetic */ Exception b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Bitmap d;
    final /* synthetic */ b e;

    M(P p, Exception exc, boolean z, Bitmap bitmap, b bVar) {
        this.a = p;
        this.b = exc;
        this.c = z;
        this.d = bitmap;
        this.e = bVar;
    }

    public void run() {
        this.e.a(new Q(this.a, this.b, this.c, this.d));
    }
}
