package com.soundcloud.android.image;

import android.graphics.Bitmap;
import com.soundcloud.android.image.ca.b;

/* compiled from: PicassoImageLoader.kt */
final class ja extends C7540vYa implements _Xa<Bitmap, RVa> {
    final /* synthetic */ ka a;

    ja(ka kaVar) {
        this.a = kaVar;
        super(1);
    }

    public final void a(Bitmap bitmap) {
        C7471uYa.b(bitmap, "it");
        ka kaVar = this.a;
        BPa bPa = kaVar.b;
        la laVar = kaVar.a;
        bPa.a(new b(laVar.b, laVar.c, bitmap));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Bitmap) obj);
        return RVa.a;
    }
}
