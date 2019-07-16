package defpackage;

import defpackage.C1317gT;
import java.util.concurrent.Callable;

@Deprecated
/* renamed from: gT reason: default package and case insensitive filesystem */
/* compiled from: LegacyCommand */
public abstract class C1317gT<I, O, This extends C1317gT<I, O, This>> implements Callable<O>, C7118pQa<I, APa<O>> {
    protected I a;

    /* renamed from: gT$a */
    /* compiled from: LegacyCommand */
    public static class a extends RuntimeException {
    }

    public final This a(I i) {
        this.a = i;
        return this;
    }

    public APa<O> a() {
        return APa.c((Callable<? extends T>) this);
    }

    public final APa<O> apply(I i) {
        return a(i).a();
    }
}
