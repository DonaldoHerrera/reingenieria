package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: Kt reason: default package */
final class Kt extends OutputStream {
    long a;

    Kt() {
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a += (long) i2;
    }

    public final void write(int i) throws IOException {
        this.a++;
    }
}
