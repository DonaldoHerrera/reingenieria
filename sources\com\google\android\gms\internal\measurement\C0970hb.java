package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.hb reason: case insensitive filesystem */
class C0970hb extends C0949eb {
    protected final byte[] e;

    C0970hb(byte[] bArr) {
        if (bArr != null) {
            this.e = bArr;
            return;
        }
        throw new NullPointerException();
    }

    public final Ya a(int i, int i2) {
        int b = Ya.b(0, i2, size());
        if (b == 0) {
            return Ya.a;
        }
        return new C0921ab(this.e, i(), b);
    }

    public byte c(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ya) || size() != ((Ya) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0970hb)) {
            return obj.equals(this);
        }
        C0970hb hbVar = (C0970hb) obj;
        int h = h();
        int h2 = hbVar.h();
        if (h == 0 || h2 == 0 || h == h2) {
            return a((Ya) hbVar, 0, size());
        }
        return false;
    }

    public final boolean g() {
        int i = i();
        return C0958fd.a(this.e, i, size() + i);
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
    public final void a(Va va) throws IOException {
        va.a(this.e, i(), size());
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.e, i(), size(), charset);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Ya ya, int i, int i2) {
        if (i2 > ya.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > ya.size()) {
            int size2 = ya.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(ya instanceof C0970hb)) {
            return ya.a(0, i2).equals(a(0, i2));
        } else {
            C0970hb hbVar = (C0970hb) ya;
            byte[] bArr = this.e;
            byte[] bArr2 = hbVar.e;
            int i3 = i() + i2;
            int i4 = i();
            int i5 = hbVar.i();
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
        return Hb.a(i, this.e, i(), i3);
    }
}
