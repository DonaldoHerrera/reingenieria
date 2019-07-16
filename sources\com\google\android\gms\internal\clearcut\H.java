package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.charset.Charset;

class H extends G {
    protected final byte[] d;

    H(byte[] bArr) {
        this.d = bArr;
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        return C0761ia.a(i, this.d, i(), i3);
    }

    public final A a(int i, int i2) {
        int b = A.b(0, i2, size());
        return b == 0 ? A.a : new D(this.d, i(), b);
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.d, i(), size(), charset);
    }

    /* access modifiers changed from: 0000 */
    public final void a(C0810z zVar) throws IOException {
        zVar.a(this.d, i(), size());
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(A a, int i, int i2) {
        if (i2 > a.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > a.size()) {
            int size2 = a.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(a instanceof H)) {
            return a.a(0, i2).equals(a(0, i2));
        } else {
            H h = (H) a;
            byte[] bArr = this.d;
            byte[] bArr2 = h.d;
            int i3 = i() + i2;
            int i4 = i();
            int i5 = h.i();
            while (i4 < i3) {
                if (bArr[i4] != bArr2[i5]) {
                    return false;
                }
                i4++;
                i5++;
            }
            return true;
        }
    }

    public byte c(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A) || size() != ((A) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof H)) {
            return obj.equals(this);
        }
        H h = (H) obj;
        int g = g();
        int g2 = h.g();
        if (g == 0 || g2 == 0 || g == g2) {
            return a((A) h, 0, size());
        }
        return false;
    }

    public final boolean f() {
        int i = i();
        return Cb.a(this.d, i, size() + i);
    }

    /* access modifiers changed from: protected */
    public int i() {
        return 0;
    }

    public int size() {
        return this.d.length;
    }
}
