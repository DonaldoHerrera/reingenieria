package defpackage;

import java.util.List;

/* renamed from: cp reason: default package and case insensitive filesystem */
/* compiled from: SubtitleOutputBuffer */
public abstract class C1211cp extends Rm implements Xo {
    private Xo d;
    private long e;

    public void a(long j, Xo xo, long j2) {
        this.b = j;
        this.d = xo;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.b;
        }
        this.e = j2;
    }

    public List<Uo> b(long j) {
        return this.d.b(j - this.e);
    }

    public void b() {
        super.b();
        this.d = null;
    }

    public int a() {
        return this.d.a();
    }

    public long a(int i) {
        return this.d.a(i) + this.e;
    }

    public int a(long j) {
        return this.d.a(j - this.e);
    }
}
