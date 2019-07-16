package defpackage;

/* renamed from: BF reason: default package and case insensitive filesystem */
/* compiled from: C40Encoder */
class C1945BF implements C2025FF {
    C1945BF() {
    }

    static void b(C2045GF gf, StringBuilder sb) {
        gf.a(a((CharSequence) sb, 0));
        sb.delete(0, 3);
    }

    public int a() {
        return 1;
    }

    public void a(C2045GF gf) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!gf.h()) {
                break;
            }
            char c = gf.c();
            gf.f++;
            int a = a(c, sb);
            int a2 = gf.a() + ((sb.length() / 3) << 1);
            gf.c(a2);
            int a3 = gf.g().a() - a2;
            if (!gf.h()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (a3 < 2 || a3 > 2)) {
                    a = a(gf, sb, sb2, a);
                }
                while (sb.length() % 3 == 1 && ((a <= 3 && a3 != 1) || a > 3)) {
                    a = a(gf, sb, sb2, a);
                }
            } else if (sb.length() % 3 == 0) {
                int a4 = C2084IF.a(gf.d(), gf.f, a());
                if (a4 != a()) {
                    gf.b(a4);
                    break;
                }
            }
        }
        a(gf, sb);
    }

    private int a(C2045GF gf, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        gf.f--;
        int a = a(gf.c(), sb2);
        gf.j();
        return a;
    }

    /* access modifiers changed from: 0000 */
    public void a(C2045GF gf, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = gf.a() + ((sb.length() / 3) << 1);
        gf.c(a);
        int a2 = gf.g().a() - a;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                b(gf, sb);
            }
            if (gf.h()) {
                gf.a(254);
            }
        } else if (a2 == 1 && length == 1) {
            while (sb.length() >= 3) {
                b(gf, sb);
            }
            if (gf.h()) {
                gf.a(254);
            }
            gf.f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                b(gf, sb);
            }
            if (a2 > 0 || gf.h()) {
                gf.a(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        gf.b(0);
    }

    /* access modifiers changed from: 0000 */
    public int a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c >= 0 && c <= 31) {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 128) {
            sb.append("\u0001\u001e");
            return a((char) (c - 128), sb) + 2;
        } else {
            StringBuilder sb2 = new StringBuilder("Illegal character: ");
            sb2.append(c);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static String a(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }
}
