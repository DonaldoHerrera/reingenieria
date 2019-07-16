package com.soundcloud.android.image;

import android.graphics.Bitmap;
import com.soundcloud.android.image.ca.a;
import com.soundcloud.android.image.ca.b;
import com.soundcloud.android.image.ca.c;
import com.soundcloud.android.image.ca.d;

/* compiled from: ImageOperations.kt */
final class M<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ PXa a;

    M(PXa pXa) {
        this.a = pXa;
    }

    /* renamed from: a */
    public final C7531vPa<Bitmap> apply(ca caVar) {
        C7471uYa.b(caVar, "it");
        if (caVar instanceof b) {
            Bitmap a2 = ((b) caVar).a();
            if (a2 == null) {
                a2 = (Bitmap) this.a.d();
            }
            return C7531vPa.c(a2);
        } else if (caVar instanceof d) {
            return C7531vPa.c();
        } else {
            if (caVar instanceof a) {
                return C7531vPa.c();
            }
            if (caVar instanceof c) {
                return C7531vPa.c(this.a.d());
            }
            throw new FVa();
        }
    }
}
