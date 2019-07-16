package defpackage;

import java.util.concurrent.Callable;

/* renamed from: mW reason: default package and case insensitive filesystem */
/* compiled from: UserStorage.kt */
final class C1503mW<V> implements Callable<T> {
    final /* synthetic */ C1472lW a;
    final /* synthetic */ Iterable b;

    C1503mW(C1472lW lWVar, Iterable iterable) {
        this.a = lWVar;
        this.b = iterable;
    }

    public final C6499gLa call() {
        return this.a.d.a(this.b);
    }
}
