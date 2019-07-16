package defpackage;

import java.util.NoSuchElementException;

/* renamed from: mZa reason: default package and case insensitive filesystem */
/* compiled from: ProgressionIterators.kt */
public final class C6921mZa extends GWa {
    private final long a;
    private boolean b;
    private long c;
    private final long d;

    public C6921mZa(long j, long j2, long j3) {
        this.d = j3;
        this.a = j2;
        boolean z = true;
        if (this.d <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.b = z;
        if (!this.b) {
            j = this.a;
        }
        this.c = j;
    }

    public boolean hasNext() {
        return this.b;
    }

    public long nextLong() {
        long j = this.c;
        if (j != this.a) {
            this.c = this.d + j;
        } else if (this.b) {
            this.b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }
}
