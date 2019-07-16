package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: Im reason: default package */
/* compiled from: SonicAudioProcessor */
public final class Im implements C1639qm {
    private int a = -1;
    private int b = -1;
    private float c = 1.0f;
    private float d = 1.0f;
    private int e = -1;
    private int f = -1;
    private boolean g;
    private Hm h;
    private ByteBuffer i = C1639qm.a;
    private ShortBuffer j = this.i.asShortBuffer();
    private ByteBuffer k = C1639qm.a;
    private long l;
    private long m;
    private boolean n;

    public float a(float f2) {
        float a2 = C0471ar.a(f2, 0.1f, 8.0f);
        if (this.d != a2) {
            this.d = a2;
            this.g = true;
        }
        flush();
        return a2;
    }

    public float b(float f2) {
        float a2 = C0471ar.a(f2, 0.1f, 8.0f);
        if (this.c != a2) {
            this.c = a2;
            this.g = true;
        }
        flush();
        return a2;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return 2;
    }

    public void f() {
        Hm hm = this.h;
        if (hm != null) {
            hm.c();
        }
        this.n = true;
    }

    public void flush() {
        if (isActive()) {
            if (this.g) {
                Hm hm = new Hm(this.b, this.a, this.c, this.d, this.e);
                this.h = hm;
            } else {
                Hm hm2 = this.h;
                if (hm2 != null) {
                    hm2.a();
                }
            }
        }
        this.k = C1639qm.a;
        this.l = 0;
        this.m = 0;
        this.n = false;
    }

    public boolean isActive() {
        return this.b != -1 && (Math.abs(this.c - 1.0f) >= 0.01f || Math.abs(this.d - 1.0f) >= 0.01f || this.e != this.b);
    }

    public void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.a = -1;
        this.b = -1;
        this.e = -1;
        this.i = C1639qm.a;
        this.j = this.i.asShortBuffer();
        this.k = C1639qm.a;
        this.f = -1;
        this.g = false;
        this.h = null;
        this.l = 0;
        this.m = 0;
        this.n = false;
    }

    public long a(long j2) {
        long j3;
        long j4 = this.m;
        if (j4 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (((double) this.c) * ((double) j2));
        }
        int i2 = this.e;
        int i3 = this.b;
        if (i2 == i3) {
            j3 = C0471ar.c(j2, this.l, j4);
        } else {
            j3 = C0471ar.c(j2, this.l * ((long) i2), j4 * ((long) i3));
        }
        return j3;
    }

    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.k;
        this.k = C1639qm.a;
        return byteBuffer;
    }

    public boolean a(int i2, int i3, int i4) throws a {
        if (i4 == 2) {
            int i5 = this.f;
            if (i5 == -1) {
                i5 = i2;
            }
            if (this.b == i2 && this.a == i3 && this.e == i5) {
                return false;
            }
            this.b = i2;
            this.a = i3;
            this.e = i5;
            this.g = true;
            return true;
        }
        throw new a(i2, i3, i4);
    }

    public void a(ByteBuffer byteBuffer) {
        Hm hm = this.h;
        C1852xq.a(hm);
        Hm hm2 = hm;
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.l += (long) remaining;
            hm2.b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b2 = hm2.b() * this.a * 2;
        if (b2 > 0) {
            if (this.i.capacity() < b2) {
                this.i = ByteBuffer.allocateDirect(b2).order(ByteOrder.nativeOrder());
                this.j = this.i.asShortBuffer();
            } else {
                this.i.clear();
                this.j.clear();
            }
            hm2.a(this.j);
            this.m += (long) b2;
            this.i.limit(b2);
            this.k = this.i;
        }
    }

    public boolean a() {
        if (this.n) {
            Hm hm = this.h;
            if (hm == null || hm.b() == 0) {
                return true;
            }
        }
        return false;
    }
}
