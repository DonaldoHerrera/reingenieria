package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: Zt reason: default package */
public final class Zt extends FilterOutputStream {
    private final Xt a;

    public Zt(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.a = new Xt(logger, level, i);
    }

    public final Xt a() {
        return this.a;
    }

    public final void close() throws IOException {
        this.a.close();
        super.close();
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        this.a.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.a.write(bArr, i, i2);
    }
}
