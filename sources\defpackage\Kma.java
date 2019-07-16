package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* renamed from: Kma reason: default package */
/* compiled from: MetadataOperations.kt */
final class Kma<V> implements Callable<EPa<? extends T>> {
    final /* synthetic */ Fma a;
    final /* synthetic */ Rma b;

    Kma(Fma fma, Rma rma) {
        this.a = fma;
        this.b = rma;
    }

    public final APa<C4928GKa<Bitmap>> call() {
        return this.a.d.a(this.b.f(), this.b.c(), this.a.c(), this.a.e(), this.a.d()).j().h(Jma.a);
    }
}
