package defpackage;

/* renamed from: AF reason: default package and case insensitive filesystem */
/* compiled from: Base256Encoder */
final class C1925AF implements C2025FF {
    C1925AF() {
    }

    public int a() {
        return 5;
    }

    public void a(C2045GF gf) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!gf.h()) {
                break;
            }
            sb.append(gf.c());
            gf.f++;
            int a = C2084IF.a(gf.d(), gf.f, a());
            if (a != a()) {
                gf.b(a);
                break;
            }
        }
        int length = sb.length() - 1;
        int a2 = gf.a() + length + 1;
        gf.c(a2);
        boolean z = gf.g().a() - a2 > 0;
        if (gf.h() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                StringBuilder sb2 = new StringBuilder("Message length not in valid ranges: ");
                sb2.append(length);
                throw new IllegalStateException(sb2.toString());
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            gf.a(a(sb.charAt(i), gf.a() + 1));
        }
    }

    private static char a(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }
}
