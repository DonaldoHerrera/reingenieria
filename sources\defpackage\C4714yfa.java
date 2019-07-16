package defpackage;

import java.util.concurrent.Callable;

/* renamed from: yfa reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabase.kt */
final class C4714yfa<V> implements Callable<Object> {
    final /* synthetic */ C3929Afa a;
    final /* synthetic */ PXa b;

    C4714yfa(C3929Afa afa, PXa pXa) {
        this.a = afa;
        this.b = pXa;
    }

    public final void call() {
        this.a.a(this.b);
    }
}
