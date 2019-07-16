package com.soundcloud.android.image;

import android.graphics.Bitmap;
import com.soundcloud.android.image.ca.a;
import com.soundcloud.android.image.ca.b;
import com.soundcloud.android.image.ca.c;
import com.soundcloud.android.image.ca.d;

/* compiled from: ImageOperations.kt */
final class I<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    public static final I a = new I();

    I() {
    }

    /* renamed from: a */
    public final C7531vPa<Bitmap> apply(ca caVar) {
        C7471uYa.b(caVar, "it");
        if (caVar instanceof b) {
            return C7531vPa.c(((b) caVar).a());
        }
        if (caVar instanceof d) {
            return C7531vPa.c();
        }
        if (caVar instanceof a) {
            return C7531vPa.c();
        }
        if (caVar instanceof c) {
            return C7531vPa.a(((c) caVar).a());
        }
        throw new FVa();
    }
}
