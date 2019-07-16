package defpackage;

/* renamed from: DAb reason: default package */
/* compiled from: Segment */
final class DAb {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    DAb f;
    DAb g;

    DAb() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final DAb a(DAb dAb) {
        dAb.g = this;
        dAb.f = this.f;
        this.f.g = dAb;
        this.f = dAb;
        return dAb;
    }

    public final DAb b() {
        DAb dAb = this.f;
        if (dAb == this) {
            dAb = null;
        }
        DAb dAb2 = this.g;
        dAb2.f = this.f;
        this.f.g = dAb2;
        this.f = null;
        this.g = null;
        return dAb;
    }

    /* access modifiers changed from: 0000 */
    public final DAb c() {
        this.d = true;
        DAb dAb = new DAb(this.a, this.b, this.c, true, false);
        return dAb;
    }

    DAb(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final DAb a(int i) {
        DAb dAb;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            dAb = c();
        } else {
            dAb = EAb.a();
            System.arraycopy(this.a, this.b, dAb.a, 0, i);
        }
        dAb.c = dAb.b + i;
        this.b += i;
        this.g.a(dAb);
        return dAb;
    }

    public final void a() {
        DAb dAb = this.g;
        if (dAb == this) {
            throw new IllegalStateException();
        } else if (dAb.e) {
            int i = this.c - this.b;
            if (i <= (8192 - dAb.c) + (dAb.d ? 0 : dAb.b)) {
                a(this.g, i);
                b();
                EAb.a(this);
            }
        }
    }

    public final void a(DAb dAb, int i) {
        if (dAb.e) {
            int i2 = dAb.c;
            if (i2 + i > 8192) {
                if (!dAb.d) {
                    int i3 = i2 + i;
                    int i4 = dAb.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = dAb.a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        dAb.c -= dAb.b;
                        dAb.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, dAb.a, dAb.c, i);
            dAb.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
