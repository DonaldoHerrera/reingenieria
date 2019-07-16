package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class Xa extends Za {
    private int a = 0;
    private final int b = this.c.size();
    private final /* synthetic */ Ya c;

    Xa(Ya ya) {
        this.c = ya;
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
