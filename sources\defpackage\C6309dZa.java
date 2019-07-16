package defpackage;

import java.util.NoSuchElementException;

/* renamed from: dZa reason: default package and case insensitive filesystem */
/* compiled from: ProgressionIterators.kt */
public final class C6309dZa extends C6714jWa {
    private final int a;
    private boolean b;
    private int c;
    private final int d;

    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r3v0, types: [char, int] */
    public C6309dZa(int i, char c2, int i2) {
        this.d = i2;
        this.a = c2;
        boolean z = true;
        if (this.d <= 0 ? i < c2 : i > c2) {
            z = false;
        }
        this.b = z;
        if (!this.b) {
            i = this.a;
        }
        this.c = i;
    }

    public char a() {
        int i = this.c;
        if (i != this.a) {
            this.c = this.d + i;
        } else if (this.b) {
            this.b = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    public boolean hasNext() {
        return this.b;
    }
}
