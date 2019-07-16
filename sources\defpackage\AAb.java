package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: AAb reason: default package */
/* compiled from: RealBufferedSink */
final class AAb implements C6893mAb {
    public final C6825lAb a = new C6825lAb();
    public final GAb b;
    boolean c;

    AAb(GAb gAb) {
        if (gAb != null) {
            this.b = gAb;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public void a(C6825lAb lab, long j) throws IOException {
        if (!this.c) {
            this.a.a(lab, j);
            l();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public C6893mAb b(long j) throws IOException {
        if (!this.c) {
            this.a.b(j);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void close() throws IOException {
        if (!this.c) {
            try {
                if (this.a.c > 0) {
                    this.b.a(this.a, this.a.c);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.b.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.c = true;
            if (th != null) {
                KAb.a(th);
                throw null;
            }
        }
    }

    public C6893mAb f(String str) throws IOException {
        if (!this.c) {
            this.a.f(str);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void flush() throws IOException {
        if (!this.c) {
            C6825lAb lab = this.a;
            long j = lab.c;
            if (j > 0) {
                this.b.a(lab, j);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.c;
    }

    public C6825lAb j() {
        return this.a;
    }

    public JAb k() {
        return this.b.k();
    }

    public C6893mAb l() throws IOException {
        if (!this.c) {
            long z = this.a.z();
            if (z > 0) {
                this.b.a(this.a, z);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public C6893mAb write(byte[] bArr) throws IOException {
        if (!this.c) {
            this.a.write(bArr);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C6893mAb writeByte(int i) throws IOException {
        if (!this.c) {
            this.a.writeByte(i);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C6893mAb writeInt(int i) throws IOException {
        if (!this.c) {
            this.a.writeInt(i);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C6893mAb writeShort(int i) throws IOException {
        if (!this.c) {
            this.a.writeShort(i);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C6893mAb a(C7030oAb oab) throws IOException {
        if (!this.c) {
            this.a.a(oab);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C6893mAb write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.c) {
            this.a.write(bArr, i, i2);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public long a(HAb hAb) throws IOException {
        if (hAb != null) {
            long j = 0;
            while (true) {
                long b2 = hAb.b(this.a, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (b2 == -1) {
                    return j;
                }
                j += b2;
                l();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.c) {
            int write = this.a.write(byteBuffer);
            l();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public C6893mAb a(long j) throws IOException {
        if (!this.c) {
            this.a.a(j);
            l();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
