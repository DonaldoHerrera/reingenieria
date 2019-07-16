package defpackage;

import java.io.IOException;

/* renamed from: dt reason: default package and case insensitive filesystem */
public abstract class C1245dt {
    private long a = -1;
    private String b;
    private String c;
    private C1370hu d;

    public abstract void a(int i, int i2) throws IOException;

    public final void a(long j) throws IOException {
        this.a = j;
    }

    public abstract void a(String str, String str2) throws IOException;

    public final long b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final C1370hu d() {
        return this.d;
    }

    public abstract C1215ct e() throws IOException;

    public final void a(String str) throws IOException {
        this.b = str;
    }

    public final void b(String str) throws IOException {
        this.c = str;
    }

    public final String a() {
        return this.b;
    }

    public final void a(C1370hu huVar) throws IOException {
        this.d = huVar;
    }
}
