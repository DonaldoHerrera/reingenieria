package com.soundcloud.android.image;

import android.graphics.Bitmap;
import com.soundcloud.android.image.ca.b;

/* compiled from: PicassoImageLoader.kt */
final class ga extends C7540vYa implements _Xa<Bitmap, RVa> {
    final /* synthetic */ ha a;

    ga(ha haVar) {
        this.a = haVar;
        super(1);
    }

    public final void a(Bitmap bitmap) {
        C7471uYa.b(bitmap, "it");
        ha haVar = this.a;
        haVar.c.accept(new b(haVar.d, haVar.b, bitmap));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Bitmap) obj);
        return RVa.a;
    }
}
