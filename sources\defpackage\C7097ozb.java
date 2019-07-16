package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: ozb reason: default package and case insensitive filesystem */
/* compiled from: RealInterceptorChain */
public final class C7097ozb implements a {
    private final List<C7164pyb> a;
    private final C6551gzb b;
    private final Zyb c;
    private final int d;
    private final C7647wyb e;
    private final Yxb f;
    private final int g;
    private final int h;
    private final int i;
    private int j;

    public C7097ozb(List<C7164pyb> list, C6551gzb gzb, Zyb zyb, int i2, C7647wyb wyb, Yxb yxb, int i3, int i4, int i5) {
        this.a = list;
        this.b = gzb;
        this.c = zyb;
        this.d = i2;
        this.e = wyb;
        this.f = yxb;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public C5681byb a() {
        Zyb zyb = this.c;
        if (zyb != null) {
            return zyb.b();
        }
        return null;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public int d() {
        return this.g;
    }

    public Zyb e() {
        Zyb zyb = this.c;
        if (zyb != null) {
            return zyb;
        }
        throw new IllegalStateException();
    }

    public C6551gzb f() {
        return this.b;
    }

    public C7647wyb x() {
        return this.e;
    }

    public Ayb a(C7647wyb wyb) throws IOException {
        return a(wyb, this.b, this.c);
    }

    public Ayb a(C7647wyb wyb, C6551gzb gzb, Zyb zyb) throws IOException {
        if (this.d < this.a.size()) {
            this.j++;
            Zyb zyb2 = this.c;
            String str = "network interceptor ";
            if (zyb2 == null || zyb2.b().a(wyb.g())) {
                String str2 = " must call proceed() exactly once";
                if (this.c == null || this.j <= 1) {
                    C7097ozb ozb = new C7097ozb(this.a, gzb, zyb, this.d + 1, wyb, this.f, this.g, this.h, this.i);
                    C7164pyb pyb = (C7164pyb) this.a.get(this.d);
                    Ayb intercept = pyb.intercept(ozb);
                    if (zyb == null || this.d + 1 >= this.a.size() || ozb.j == 1) {
                        String str3 = "interceptor ";
                        if (intercept == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append(pyb);
                            sb.append(" returned null");
                            throw new NullPointerException(sb.toString());
                        } else if (intercept.a() != null) {
                            return intercept;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            sb2.append(pyb);
                            sb2.append(" returned a response with no body");
                            throw new IllegalStateException(sb2.toString());
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(pyb);
                        sb3.append(str2);
                        throw new IllegalStateException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(this.a.get(this.d - 1));
                    sb4.append(str2);
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.a.get(this.d - 1));
                sb5.append(" must retain the same host and port");
                throw new IllegalStateException(sb5.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
