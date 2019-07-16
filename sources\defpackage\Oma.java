package defpackage;

import android.graphics.Bitmap;

/* renamed from: Oma reason: default package */
/* compiled from: MetadataOperations.kt */
final class Oma<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Fma a;
    final /* synthetic */ Rma b;

    Oma(Fma fma, Rma rma) {
        this.a = fma;
        this.b = rma;
    }

    /* renamed from: a */
    public final APa<C4928GKa<Bitmap>> apply(C4928GKa<Bitmap> gKa) {
        C7471uYa.b(gKa, "optionalBitmap");
        return this.a.a(this.b, gKa);
    }
}
