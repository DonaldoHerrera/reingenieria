package defpackage;

import defpackage.C6499gLa;

/* renamed from: pT reason: default package and case insensitive filesystem */
/* compiled from: WriteStorageCommand */
public abstract class C1595pT<I, R extends C6499gLa, O> extends C1255eT<I, O> {
    private final C5500ZKa a;

    protected C1595pT(C5500ZKa zKa) {
        this.a = zKa;
    }

    /* access modifiers changed from: protected */
    public abstract R a(C5500ZKa zKa, I i);

    /* access modifiers changed from: protected */
    public abstract O a(R r);

    public O a(I i) {
        C6499gLa a2 = a(this.a, i);
        if (a2.b()) {
            return a((R) a2);
        }
        throw a2.a();
    }
}
