package com.soundcloud.android.image;

import android.graphics.Bitmap;
import com.squareup.picasso.A;
import com.squareup.picasso.L;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: ImageOperations.kt */
final class H<V> implements Callable<T> {
    final /* synthetic */ N a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    H(N n, String str, int i, int i2) {
        this.a = n;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final Bitmap call() {
        try {
            L a2 = this.a.g.a(this.b);
            a2.a(A.OFFLINE, new A[0]);
            a2.a(this.c, this.d);
            return a2.b();
        } catch (IOException unused) {
            return null;
        }
    }
}
