package defpackage;

import java.nio.charset.Charset;

/* renamed from: hw reason: default package and case insensitive filesystem */
class C1372hw extends C1402iw {
    protected final byte[] e;

    C1372hw(byte[] bArr) {
        if (bArr != null) {
            this.e = bArr;
            return;
        }
        throw new NullPointerException();
    }

    public final C0289Zv a(int i, int i2) {
        int b = C0289Zv.b(0, i2, size());
        if (b == 0) {
            return C0289Zv.a;
        }
        return new C1310fw(this.e, h(), b);
    }

    /* access modifiers changed from: protected */
    public final String b(Charset charset) {
        return new String(this.e, h(), size(), charset);
    }

    public byte c(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0289Zv) || size() != ((C0289Zv) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1372hw)) {
            return obj.equals(this);
        }
        C1372hw hwVar = (C1372hw) obj;
        int g = g();
        int g2 = hwVar.g();
        if (g == 0 || g2 == 0 || g == g2) {
            return a((C0289Zv) hwVar, 0, size());
        }
        return false;
    }

    public final boolean f() {
        int h = h();
        return Xx.a(this.e, h, size() + h);
    }

    /* access modifiers changed from: protected */
    public int h() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public byte m(int i) {
        return this.e[i];
    }

    public int size() {
        return this.e.length;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(C0289Zv zv, int i, int i2) {
        if (i2 > zv.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zv.size()) {
            int size2 = zv.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zv instanceof C1372hw)) {
            return zv.a(0, i2).equals(a(0, i2));
        } else {
            C1372hw hwVar = (C1372hw) zv;
            byte[] bArr = this.e;
            byte[] bArr2 = hwVar.e;
            int h = h() + i2;
            int h2 = h();
            int h3 = hwVar.h();
            while (h2 < h) {
                if (bArr[h2] != bArr2[h3]) {
                    return false;
                }
                h2++;
                h3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        return C0209Gw.a(i, this.e, h(), i3);
    }
}
