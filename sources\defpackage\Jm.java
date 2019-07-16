package defpackage;

import java.nio.ByteBuffer;

/* renamed from: Jm reason: default package */
/* compiled from: TrimmingAudioProcessor */
final class Jm extends C1818wm {
    private boolean g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = C0471ar.f;
    private int n;
    private long o;

    public void a(int i2, int i3) {
        this.h = i2;
        this.i = i3;
    }

    public ByteBuffer b() {
        if (super.a()) {
            int i2 = this.n;
            if (i2 > 0) {
                a(i2).put(this.m, 0, this.n).flip();
                this.n = 0;
            }
        }
        return super.b();
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (this.k) {
            this.l = 0;
        }
        this.n = 0;
    }

    public boolean isActive() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.m = C0471ar.f;
    }

    public long k() {
        return this.o;
    }

    public void l() {
        this.o = 0;
    }

    public boolean a(int i2, int i3, int i4) throws a {
        if (i4 == 2) {
            int i5 = this.n;
            if (i5 > 0) {
                this.o += (long) (i5 / this.j);
            }
            this.j = C0471ar.b(2, i3);
            int i6 = this.i;
            int i7 = this.j;
            this.m = new byte[(i6 * i7)];
            this.n = 0;
            int i8 = this.h;
            this.l = i7 * i8;
            boolean z = this.g;
            this.g = (i8 == 0 && i6 == 0) ? false : true;
            this.k = false;
            b(i2, i3, i4);
            if (z != this.g) {
                return true;
            }
            return false;
        }
        throw new a(i2, i3, i4);
    }

    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 != 0) {
            this.k = true;
            int min = Math.min(i2, this.l);
            this.o += (long) (min / this.j);
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l <= 0) {
                int i3 = i2 - min;
                int length = (this.n + i3) - this.m.length;
                ByteBuffer a = a(length);
                int a2 = C0471ar.a(length, 0, this.n);
                a.put(this.m, 0, a2);
                int a3 = C0471ar.a(length - a2, 0, i3);
                byteBuffer.limit(byteBuffer.position() + a3);
                a.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - a3;
                this.n -= a2;
                byte[] bArr = this.m;
                System.arraycopy(bArr, a2, bArr, 0, this.n);
                byteBuffer.get(this.m, this.n, i4);
                this.n += i4;
                a.flip();
            }
        }
    }

    public boolean a() {
        return super.a() && this.n == 0;
    }
}
