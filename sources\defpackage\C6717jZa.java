package defpackage;

import java.util.NoSuchElementException;

/* renamed from: jZa reason: default package and case insensitive filesystem */
/* compiled from: ProgressionIterators.kt */
public final class C6717jZa extends FWa {
    private final int a;
    private boolean b;
    private int c;
    private final int d;

    public C6717jZa(int i, int i2, int i3) {
        this.d = i3;
        this.a = i2;
        boolean z = true;
        if (this.d <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.b = z;
        if (!this.b) {
            i = this.a;
        }
        this.c = i;
    }

    public boolean hasNext() {
        return this.b;
    }

    public int nextInt() {
        int i = this.c;
        if (i != this.a) {
            this.c = this.d + i;
        } else if (this.b) {
            this.b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
