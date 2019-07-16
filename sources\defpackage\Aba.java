package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Aba reason: default package */
/* compiled from: FollowingStorage.kt */
final class Aba<V> implements Callable<T> {
    final /* synthetic */ Cba a;
    final /* synthetic */ C3508cda b;
    final /* synthetic */ boolean c;

    Aba(Cba cba, C3508cda cda, boolean z) {
        this.a = cba;
        this.b = cda;
        this.c = z;
    }

    public final long call() {
        return this.a.b(this.b, this.c);
    }
}
