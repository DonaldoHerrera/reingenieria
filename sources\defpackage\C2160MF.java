package defpackage;

/* renamed from: MF reason: default package and case insensitive filesystem */
/* compiled from: X12Encoder */
final class C2160MF extends C1945BF {
    C2160MF() {
    }

    public int a() {
        return 3;
    }

    public void a(C2045GF gf) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!gf.h()) {
                break;
            }
            char c = gf.c();
            gf.f++;
            a(c, sb);
            if (sb.length() % 3 == 0) {
                C1945BF.b(gf, sb);
                int a = C2084IF.a(gf.d(), gf.f, a());
                if (a != a()) {
                    gf.b(a);
                    break;
                }
            }
        }
        a(gf, sb);
    }

    /* access modifiers changed from: 0000 */
    public int a(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C2084IF.a(c);
            throw null;
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public void a(C2045GF gf, StringBuilder sb) {
        gf.k();
        int a = gf.g().a() - gf.a();
        gf.f -= sb.length();
        if (gf.f() > 1 || a > 1 || gf.f() != a) {
            gf.a(254);
        }
        if (gf.e() < 0) {
            gf.b(0);
        }
    }
}
