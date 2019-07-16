package com.facebook.internal;

import android.graphics.Bitmap;

/* compiled from: ImageResponse */
public class Q {
    private P a;
    private Exception b;
    private boolean c;
    private Bitmap d;

    Q(P p, Exception exc, boolean z, Bitmap bitmap) {
        this.a = p;
        this.b = exc;
        this.d = bitmap;
        this.c = z;
    }

    public Bitmap a() {
        return this.d;
    }

    public Exception b() {
        return this.b;
    }

    public P c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }
}
