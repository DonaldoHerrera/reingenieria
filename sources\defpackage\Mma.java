package defpackage;

import android.support.v4.media.MediaMetadataCompat;

/* renamed from: Mma reason: default package */
/* compiled from: MetadataOperations.kt */
final class Mma<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Fma a;
    final /* synthetic */ MediaMetadataCompat b;

    Mma(Fma fma, MediaMetadataCompat mediaMetadataCompat) {
        this.a = fma;
        this.b = mediaMetadataCompat;
    }

    /* renamed from: a */
    public final APa<Sma> apply(Rma rma) {
        C7471uYa.b(rma, "trackItem");
        return this.a.a(rma, this.b);
    }
}
