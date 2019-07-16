package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zua reason: default package and case insensitive filesystem */
/* compiled from: Operators.kt */
final class C7845zua<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ AtomicInteger a;

    C7845zua(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public final HVa<Integer, T> apply(T t) {
        return NVa.a(Integer.valueOf(this.a.getAndIncrement()), t);
    }
}
