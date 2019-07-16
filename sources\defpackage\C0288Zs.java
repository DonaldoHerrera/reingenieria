package defpackage;

import java.io.IOException;

/* renamed from: Zs reason: default package and case insensitive filesystem */
public final class C0288Zs {
    int a;
    String b;
    C1830wy c;
    String d;
    String e;

    public C0288Zs(int i, String str, C1830wy wyVar) {
        if (i >= 0) {
            this.a = i;
            this.b = str;
            Pu.a(wyVar);
            this.c = wyVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final C0288Zs a(String str) {
        this.e = str;
        return this;
    }

    public final C0288Zs b(String str) {
        this.d = str;
        return this;
    }

    public C0288Zs(C0279Xs xs) {
        this(xs.d(), xs.e(), xs.i());
        try {
            this.d = xs.h();
            if (this.d.length() == 0) {
                this.d = null;
            }
        } catch (IOException e2) {
            Xu.a(e2);
        }
        StringBuilder a2 = C0292_s.a(xs);
        if (this.d != null) {
            a2.append(C1339gu.a);
            a2.append(this.d);
        }
        this.e = a2.toString();
    }
}
