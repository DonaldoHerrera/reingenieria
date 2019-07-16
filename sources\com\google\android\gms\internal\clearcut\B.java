package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class B implements Iterator {
    private int a = 0;
    private final int b = this.c.size();
    private final /* synthetic */ A c;

    B(A a2) {
        this.c = a2;
    }

    private final byte nextByte() {
        try {
            A a2 = this.c;
            int i = this.a;
            this.a = i + 1;
            return a2.c(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
