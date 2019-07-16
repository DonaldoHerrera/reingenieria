package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bw reason: default package and case insensitive filesystem */
final class C0507bw extends C1248dw {
    private int a = 0;
    private final int b = this.c.size();
    private final /* synthetic */ C0289Zv c;

    C0507bw(C0289Zv zv) {
        this.c = zv;
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
