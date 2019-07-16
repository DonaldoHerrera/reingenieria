package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: tfa reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabase.kt */
final class C4669tfa<V> implements Callable<T> {
    final /* synthetic */ C3929Afa a;
    final /* synthetic */ Xd b;
    final /* synthetic */ C6772kMa c;

    C4669tfa(C3929Afa afa, Xd xd, C6772kMa kma) {
        this.a = afa;
        this.b = xd;
        this.c = kma;
    }

    public final List<T> call() {
        return this.a.c(this.b, this.c);
    }
}
