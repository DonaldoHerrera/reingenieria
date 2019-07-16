package defpackage;

/* renamed from: JF reason: default package and case insensitive filesystem */
/* compiled from: SymbolInfo */
public class C2103JF {
    static final C2103JF[] a;
    private static C2103JF[] b;
    private final boolean c;
    private final int d;
    private final int e;
    public final int f;
    public final int g;
    private final int h;
    private final int i;
    private final int j;

    static {
        C2103JF jf = new C2103JF(false, 3, 5, 8, 8, 1);
        C2103JF jf2 = new C2103JF(false, 5, 7, 10, 10, 1);
        C2103JF jf3 = new C2103JF(true, 5, 7, 16, 6, 1);
        C2103JF jf4 = new C2103JF(false, 8, 10, 12, 12, 1);
        C2103JF jf5 = new C2103JF(true, 10, 11, 14, 6, 2);
        C2103JF jf6 = new C2103JF(false, 12, 12, 14, 14, 1);
        C2103JF jf7 = new C2103JF(true, 16, 14, 24, 10, 1);
        C2103JF jf8 = new C2103JF(false, 18, 14, 16, 16, 1);
        C2103JF jf9 = new C2103JF(false, 22, 18, 18, 18, 1);
        C2103JF jf10 = new C2103JF(true, 22, 18, 16, 10, 2);
        C2103JF jf11 = new C2103JF(false, 30, 20, 20, 20, 1);
        C2103JF jf12 = new C2103JF(true, 32, 24, 16, 14, 2);
        C2103JF jf13 = new C2103JF(false, 36, 24, 22, 22, 1);
        C2103JF jf14 = new C2103JF(false, 44, 28, 24, 24, 1);
        C2103JF jf15 = new C2103JF(true, 49, 28, 22, 14, 2);
        C2103JF jf16 = new C2103JF(false, 62, 36, 14, 14, 4);
        C2103JF jf17 = new C2103JF(false, 86, 42, 16, 16, 4);
        C2103JF jf18 = new C2103JF(false, 114, 48, 18, 18, 4);
        C2103JF jf19 = new C2103JF(false, 144, 56, 20, 20, 4);
        C2103JF jf20 = new C2103JF(false, 174, 68, 22, 22, 4);
        C2103JF jf21 = new C2103JF(false, 204, 84, 24, 24, 4, 102, 42);
        C2103JF jf22 = new C2103JF(false, 280, 112, 14, 14, 16, 140, 56);
        C2103JF jf23 = new C2103JF(false, 368, 144, 16, 16, 16, 92, 36);
        C2103JF jf24 = new C2103JF(false, 456, 192, 18, 18, 16, 114, 48);
        C2103JF jf25 = new C2103JF(false, 576, 224, 20, 20, 16, 144, 56);
        C2103JF jf26 = new C2103JF(false, 696, 272, 22, 22, 16, 174, 68);
        C2103JF jf27 = new C2103JF(false, 816, 336, 24, 24, 16, 136, 56);
        C2103JF jf28 = new C2103JF(false, 1050, 408, 18, 18, 36, 175, 68);
        C2103JF jf29 = new C2103JF(false, 1304, 496, 20, 20, 36, 163, 62);
        C2103JF[] jfArr = {jf, jf2, jf3, jf4, jf5, jf6, jf7, jf8, jf9, jf10, jf11, jf12, jf13, jf14, jf15, jf16, jf17, jf18, jf19, jf20, jf21, jf22, jf23, jf24, jf25, jf26, jf27, jf28, jf29, new C1965CF()};
        a = jfArr;
        b = jfArr;
    }

    public C2103JF(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    public static C2103JF a(int i2, C2122KF kf, C2440aF aFVar, C2440aF aFVar2, boolean z) {
        C2103JF[] jfArr;
        for (C2103JF jf : b) {
            if ((kf != C2122KF.FORCE_SQUARE || !jf.c) && ((kf != C2122KF.FORCE_RECTANGLE || jf.c) && ((aFVar == null || (jf.g() >= aFVar.b() && jf.f() >= aFVar.a())) && ((aFVar2 == null || (jf.g() <= aFVar2.b() && jf.f() <= aFVar2.a())) && i2 <= jf.d)))) {
                return jf;
            }
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Can't find a symbol arrangement that matches the message. Data codewords: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private int h() {
        int i2 = this.h;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (!(i2 == 2 || i2 == 4)) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    private int i() {
        int i2 = this.h;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final int b() {
        return this.e;
    }

    public int c() {
        return this.d / this.i;
    }

    public final int d() {
        return i() * this.g;
    }

    public final int e() {
        return h() * this.f;
    }

    public final int f() {
        return d() + (i() << 1);
    }

    public final int g() {
        return e() + (h() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f);
        sb.append('x');
        sb.append(this.g);
        sb.append(", symbol size ");
        sb.append(g());
        sb.append('x');
        sb.append(f());
        sb.append(", symbol data size ");
        sb.append(e());
        sb.append('x');
        sb.append(d());
        sb.append(", codewords ");
        sb.append(this.d);
        sb.append('+');
        sb.append(this.e);
        return sb.toString();
    }

    C2103JF(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
    }

    public final int b(int i2) {
        return this.j;
    }

    public final int a() {
        return this.d;
    }

    public int a(int i2) {
        return this.i;
    }
}
