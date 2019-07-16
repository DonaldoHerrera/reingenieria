package bo.app;

import java.io.InputStream;

public class gp extends InputStream {
    private final InputStream a;
    private final int b;

    public gp(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
    }

    public int available() {
        return this.b;
    }

    public void close() {
        this.a.close();
    }

    public void mark(int i) {
        this.a.mark(i);
    }

    public boolean markSupported() {
        return this.a.markSupported();
    }

    public int read() {
        return this.a.read();
    }

    public void reset() {
        this.a.reset();
    }

    public long skip(long j) {
        return this.a.skip(j);
    }

    public int read(byte[] bArr) {
        return this.a.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
