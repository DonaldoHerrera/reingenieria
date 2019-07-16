package defpackage;

import java.io.IOException;

/* renamed from: mMa reason: default package and case insensitive filesystem */
/* compiled from: SqlDelightStatement */
public abstract class C6908mMa implements Yd {
    private final String a;
    private final Yd b;

    protected C6908mMa(String str, Yd yd) {
        this.a = str;
        this.b = yd;
    }

    public final void a(int i, long j) {
        this.b.a(i, j);
    }

    public final void c(int i) {
        this.b.c(i);
    }

    public final void close() throws IOException {
        this.b.close();
    }

    public final void execute() {
        this.b.execute();
    }

    public final int v() {
        return this.b.v();
    }

    public final long x() {
        return this.b.x();
    }

    public final void a(int i, double d) {
        this.b.a(i, d);
    }

    public final void a(int i, String str) {
        this.b.a(i, str);
    }

    public final void a(int i, byte[] bArr) {
        this.b.a(i, bArr);
    }
}
