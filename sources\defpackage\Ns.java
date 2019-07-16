package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Ns reason: default package */
final class Ns extends FilterInputStream {
    private long a;
    private long b = -1;

    Ns(InputStream inputStream, long j) {
        super(inputStream);
        Js.a(inputStream);
        this.a = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.a);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.b = this.a;
    }

    public final int read() throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.a--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.b != -1) {
            this.in.reset();
            this.a = this.b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.a));
        this.a -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.a -= (long) read;
        }
        return read;
    }
}
