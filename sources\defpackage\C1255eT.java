package defpackage;

import java.util.concurrent.Callable;

@Deprecated
/* renamed from: eT reason: default package and case insensitive filesystem */
/* compiled from: Command */
public abstract class C1255eT<I, O> {
    public O a() {
        return b(null);
    }

    /* renamed from: a */
    public abstract O b(I i);

    public IPa<O> c(I i) {
        return IPa.c((Callable<? extends T>) new VS<Object>(this, i));
    }

    public final C6776kQa<I> b() {
        return new XS(this);
    }

    public IPa<O> c() {
        return IPa.c((Callable<? extends T>) new ZS<Object>(this));
    }
}
