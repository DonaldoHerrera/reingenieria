package defpackage;

import android.graphics.Bitmap;

/* renamed from: Pma reason: default package */
/* compiled from: MetadataOperations.kt */
final class Pma<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Rma a;

    Pma(Rma rma) {
        this.a = rma;
    }

    /* renamed from: a */
    public final Sma apply(C4928GKa<Bitmap> gKa) {
        C7471uYa.b(gKa, "optionalBitmap");
        return new Sma(this.a, gKa);
    }
}
