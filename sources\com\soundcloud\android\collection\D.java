package com.soundcloud.android.collection;

import java.util.Collection;
import java.util.Map;

/* compiled from: Observables.kt */
public final class D<T1, T2, T3, T4, R> implements C6912mQa<T1, T2, T3, T4, R> {
    final /* synthetic */ E a;
    final /* synthetic */ C2843y b;

    public D(E e, C2843y yVar) {
        this.a = e;
        this.b = yVar;
    }

    public final R a(T1 t1, T2 t2, T3 t3, T4 t4) {
        boolean booleanValue = ((Boolean) t4).booleanValue();
        boolean booleanValue2 = ((Boolean) t3).booleanValue();
        return C7676xWa.c((Collection) C6918mWa.b((Object) this.a.a(((Boolean) t2).booleanValue(), booleanValue2, booleanValue)), (Iterable) this.a.a(this.b, (Map) t1));
    }
}
