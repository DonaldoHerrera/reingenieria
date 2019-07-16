package com.google.android.gms.internal.firebase-perf;

import java.util.NoSuchElementException;

final class Ra extends Ta {
    private int a = 0;
    private final int b = this.c.size();
    private final /* synthetic */ Oa c;

    Ra(Oa oa) {
        this.c = oa;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    public final byte nextByte() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.m(i);
        }
        throw new NoSuchElementException();
    }
}
