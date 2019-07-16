package com.google.android.gms.internal.firebase-perf;

import java.io.IOException;
import java.nio.charset.Charset;

class Ya extends Za {
    protected final byte[] e;

    Ya(byte[] bArr) {
        if (bArr != null) {
            this.e = bArr;
            return;
        }
        throw new NullPointerException();
    }

    public final Oa a(int i, int i2) {
        int b = Oa.b(0, i2, size());
        if (b == 0) {
            return Oa.a;
        }
        return new Va(this.e, i(), b);
    }

    public byte c(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Oa) || size() != ((Oa) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return obj.equals(this);
        }
        Ya ya = (Ya) obj;
        int h = h();
        int h2 = ya.h();
        if (h == 0 || h2 == 0 || h == h2) {
            return a((Oa) ya, 0, size());
        }
        return false;
    }

    public final boolean g() {
        int i = i();
        return Tc.a(this.e, i, size() + i);
    }

    /* access modifiers changed from: protected */
    public int i() {
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
    public final void a(Pa pa) throws IOException {
        pa.a(this.e, i(), size());
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.e, i(), size(), charset);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Oa oa, int i, int i2) {
        if (i2 > oa.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > oa.size()) {
            int size2 = oa.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(oa instanceof Ya)) {
            return oa.a(0, i2).equals(a(0, i2));
        } else {
            Ya ya = (Ya) oa;
            byte[] bArr = this.e;
            byte[] bArr2 = ya.e;
            int i3 = i() + i2;
            int i4 = i();
            int i5 = ya.i();
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

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        return C0897ub.a(i, this.e, i(), i3);
    }
}
