package defpackage;

/* renamed from: zF reason: default package and case insensitive filesystem */
/* compiled from: ASCIIEncoder */
final class C3388zF implements C2025FF {
    C3388zF() {
    }

    public int a() {
        return 0;
    }

    public void a(C2045GF gf) {
        if (C2084IF.a((CharSequence) gf.d(), gf.f) >= 2) {
            gf.a(a(gf.d().charAt(gf.f), gf.d().charAt(gf.f + 1)));
            gf.f += 2;
            return;
        }
        char c = gf.c();
        int a = C2084IF.a(gf.d(), gf.f, a());
        if (a != a()) {
            if (a == 1) {
                gf.a(230);
                gf.b(1);
            } else if (a == 2) {
                gf.a(239);
                gf.b(2);
            } else if (a == 3) {
                gf.a(238);
                gf.b(3);
            } else if (a == 4) {
                gf.a(240);
                gf.b(4);
            } else if (a == 5) {
                gf.a(231);
                gf.b(5);
            } else {
                StringBuilder sb = new StringBuilder("Illegal mode: ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
        } else if (C2084IF.c(c)) {
            gf.a(235);
            gf.a((char) ((c - 128) + 1));
            gf.f++;
        } else {
            gf.a((char) (c + 1));
            gf.f++;
        }
    }

    private static char a(char c, char c2) {
        if (C2084IF.b(c) && C2084IF.b(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        StringBuilder sb = new StringBuilder("not digits: ");
        sb.append(c);
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }
}
