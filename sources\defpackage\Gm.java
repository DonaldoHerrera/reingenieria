package defpackage;

import java.nio.ByteBuffer;

/* renamed from: Gm reason: default package */
/* compiled from: SilenceSkippingAudioProcessor */
public final class Gm extends C1818wm {
    private int g;
    private boolean h;
    private byte[] i;
    private byte[] j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private long o;

    public Gm() {
        byte[] bArr = C0471ar.f;
        this.i = bArr;
        this.j = bArr;
    }

    private int b(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs(byteBuffer.get(limit)) > 4) {
                int i2 = this.g;
                return ((limit / i2) * i2) + i2;
            }
        }
        return byteBuffer.position();
    }

    private int c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.get(position)) > 4) {
                int i2 = this.g;
                return i2 * (position / i2);
            }
        }
        return byteBuffer.limit();
    }

    private void d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.n = true;
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c = c(byteBuffer);
        int position = c - byteBuffer.position();
        byte[] bArr = this.i;
        int length = bArr.length;
        int i2 = this.l;
        int i3 = length - i2;
        if (c >= limit || position >= i3) {
            int min = Math.min(position, i3);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.i, this.l, min);
            this.l += min;
            int i4 = this.l;
            byte[] bArr2 = this.i;
            if (i4 == bArr2.length) {
                if (this.n) {
                    a(bArr2, this.m);
                    this.o += (long) ((this.l - (this.m * 2)) / this.g);
                } else {
                    this.o += (long) ((i4 - this.m) / this.g);
                }
                a(byteBuffer, this.i, this.l);
                this.l = 0;
                this.k = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        a(bArr, i2);
        this.l = 0;
        this.k = 0;
    }

    private void f(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.i.length));
        int b = b(byteBuffer);
        if (b == byteBuffer.position()) {
            this.k = 1;
        } else {
            byteBuffer.limit(b);
            d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c = c(byteBuffer);
        byteBuffer.limit(c);
        this.o += (long) (byteBuffer.remaining() / this.g);
        a(byteBuffer, this.j, this.m);
        if (c < limit) {
            a(this.j, this.m);
            this.k = 0;
            byteBuffer.limit(limit);
        }
    }

    public void a(boolean z) {
        this.h = z;
        flush();
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (isActive()) {
            int a = a(150000) * this.g;
            if (this.i.length != a) {
                this.i = new byte[a];
            }
            this.m = a(20000) * this.g;
            int length = this.j.length;
            int i2 = this.m;
            if (length != i2) {
                this.j = new byte[i2];
            }
        }
        this.k = 0;
        this.o = 0;
        this.l = 0;
        this.n = false;
    }

    /* access modifiers changed from: protected */
    public void i() {
        int i2 = this.l;
        if (i2 > 0) {
            a(this.i, i2);
        }
        if (!this.n) {
            this.o += (long) (this.m / this.g);
        }
    }

    public boolean isActive() {
        return super.isActive() && this.h;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.h = false;
        this.m = 0;
        byte[] bArr = C0471ar.f;
        this.i = bArr;
        this.j = bArr;
    }

    public long k() {
        return this.o;
    }

    public boolean a(int i2, int i3, int i4) throws a {
        if (i4 == 2) {
            this.g = i3 * 2;
            return b(i2, i3, i4);
        }
        throw new a(i2, i3, i4);
    }

    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i2 = this.k;
            if (i2 == 0) {
                f(byteBuffer);
            } else if (i2 == 1) {
                e(byteBuffer);
            } else if (i2 == 2) {
                g(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void a(byte[] bArr, int i2) {
        a(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.n = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.m);
        int i3 = this.m - min;
        System.arraycopy(bArr, i2 - i3, this.j, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.j, i3, min);
    }

    private int a(long j2) {
        return (int) ((j2 * ((long) this.a)) / 1000000);
    }
}
