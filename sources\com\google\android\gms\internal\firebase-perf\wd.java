package com.google.android.gms.internal.firebase-perf;

final class wd<E> extends od<E> {
    private final ud<E> c;

    wd(ud<E> udVar, int i) {
        super(udVar.size(), i);
        this.c = udVar;
    }

    /* access modifiers changed from: protected */
    public final E a(int i) {
        return this.c.get(i);
    }
}
