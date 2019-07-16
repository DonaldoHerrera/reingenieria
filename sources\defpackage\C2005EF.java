package defpackage;

/* renamed from: EF reason: default package and case insensitive filesystem */
/* compiled from: EdifactEncoder */
final class C2005EF implements C2025FF {
    C2005EF() {
    }

    public int a() {
        return 4;
    }

    public void a(C2045GF gf) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!gf.h()) {
                break;
            }
            a(gf.c(), sb);
            gf.f++;
            if (sb.length() >= 4) {
                gf.a(a((CharSequence) sb, 0));
                sb.delete(0, 4);
                if (C2084IF.a(gf.d(), gf.f, a()) != a()) {
                    gf.b(0);
                    break;
                }
            }
        }
        sb.append(31);
        a(gf, (CharSequence) sb);
    }

    private static void a(C2045GF gf, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    gf.k();
                    int a = gf.g().a() - gf.a();
                    if (gf.f() == 0 && a <= 2) {
                        gf.b(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String a2 = a(charSequence, 0);
                    if (!(!gf.h()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        gf.c(gf.a() + i);
                        if (gf.g().a() - gf.a() >= 3) {
                            gf.c(gf.a() + a2.length());
                            z = false;
                        }
                    }
                    if (z) {
                        gf.j();
                        gf.f -= i;
                    } else {
                        gf.a(a2);
                    }
                    gf.b(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            gf.b(0);
        }
    }

    private static void a(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C2084IF.a(c);
            throw null;
        } else {
            sb.append((char) (c - '@'));
        }
    }

    private static String a(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 16) & 255);
            char c3 = (char) ((i2 >> 8) & 255);
            char c4 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c2);
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }
}
