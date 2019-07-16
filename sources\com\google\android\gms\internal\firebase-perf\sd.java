package com.google.android.gms.internal.firebase-perf;

import java.util.Arrays;

class sd<E> extends vd<E> {
    Object[] a = new Object[4];
    int b = 0;
    boolean c;

    sd(int i) {
        rd.a(4, "initialCapacity");
    }

    public sd<E> a(E e) {
        Db.a(e);
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, vd.a(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr2[i2] = e;
        return this;
    }
}
