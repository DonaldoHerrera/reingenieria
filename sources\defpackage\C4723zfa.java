package defpackage;

import java.util.concurrent.Callable;

/* renamed from: zfa reason: default package and case insensitive filesystem */
/* compiled from: SqlBriteDatabase.kt */
final class C4723zfa<V> implements Callable<T> {
    final /* synthetic */ C3929Afa a;
    final /* synthetic */ String b;
    final /* synthetic */ Yd c;

    C4723zfa(C3929Afa afa, String str, Yd yd) {
        this.a = afa;
        this.b = str;
        this.c = yd;
    }

    public final long call() {
        return this.a.c(this.b, this.c);
    }
}
