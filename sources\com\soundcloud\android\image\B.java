package com.soundcloud.android.image;

import android.graphics.Bitmap;

/* compiled from: ImageOperations.kt */
final class B<Upstream, Downstream> implements FPa<T, R> {
    final /* synthetic */ N a;
    final /* synthetic */ C3508cda b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    B(N n, C3508cda cda, int i, int i2) {
        this.a = n;
        this.b = cda;
        this.c = i;
        this.d = i2;
    }

    public final APa<Bitmap> a(APa<ca> aPa) {
        C7471uYa.b(aPa, "it");
        return this.a.a(aPa, (PXa<Bitmap>) new A<Bitmap>(this));
    }
}
