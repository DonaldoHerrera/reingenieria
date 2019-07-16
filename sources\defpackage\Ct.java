package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: Ct reason: default package */
final class Ct extends C1735tt {
    private final C0248Qv a;
    private final At b;

    Ct(At at, C0248Qv qv) {
        this.b = at;
        this.a = qv;
        qv.a(true);
    }

    public final void a() throws IOException {
        this.a.flush();
    }

    public final void b(String str) throws IOException {
        this.a.b(str);
    }

    public final void c() throws IOException {
        this.a.b();
    }

    public final void d() throws IOException {
        this.a.c();
    }

    public final void e() throws IOException {
        this.a.d();
    }

    public final void f() throws IOException {
        this.a.e();
    }

    public final void g() throws IOException {
        this.a.a("  ");
    }

    public final void a(boolean z) throws IOException {
        this.a.b(z);
    }

    public final void b() throws IOException {
        this.a.a();
    }

    public final void a(int i) throws IOException {
        this.a.h((long) i);
    }

    public final void a(long j) throws IOException {
        this.a.h(j);
    }

    public final void a(BigInteger bigInteger) throws IOException {
        this.a.a((Number) bigInteger);
    }

    public final void a(double d) throws IOException {
        this.a.a(d);
    }

    public final void a(float f) throws IOException {
        this.a.a((double) f);
    }

    public final void a(BigDecimal bigDecimal) throws IOException {
        this.a.a((Number) bigDecimal);
    }

    public final void a(String str) throws IOException {
        this.a.c(str);
    }
}
