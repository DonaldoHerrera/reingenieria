package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: _t reason: default package */
public final class _t extends FilterInputStream {
    private final Xt a;

    public _t(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.a = new Xt(logger, level, i);
    }

    public final void close() throws IOException {
        this.a.close();
        super.close();
    }

    public final int read() throws IOException {
        int read = super.read();
        this.a.write(read);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.a.write(bArr, i, read);
        }
        return read;
    }
}
