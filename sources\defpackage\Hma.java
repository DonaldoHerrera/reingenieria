package defpackage;

import android.graphics.Bitmap;

/* renamed from: Hma reason: default package */
/* compiled from: MetadataOperations.kt */
final class Hma<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    public static final Hma a = new Hma();

    Hma() {
    }

    /* renamed from: a */
    public final C7531vPa<Bitmap> apply(Bitmap bitmap) {
        C7471uYa.b(bitmap, "it");
        return bitmap.isRecycled() ? C7531vPa.c() : C7531vPa.c(bitmap);
    }
}
