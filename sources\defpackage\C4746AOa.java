package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: AOa reason: default package and case insensitive filesystem */
/* compiled from: HttpRequest */
class C4746AOa extends a<C4777BOa> {
    final /* synthetic */ InputStream c;
    final /* synthetic */ OutputStream d;
    final /* synthetic */ C4777BOa e;

    C4746AOa(C4777BOa bOa, Closeable closeable, boolean z, InputStream inputStream, OutputStream outputStream) {
        this.e = bOa;
        this.c = inputStream;
        this.d = outputStream;
        super(closeable, z);
    }

    public C4777BOa b() throws IOException {
        byte[] bArr = new byte[this.e.j];
        while (true) {
            int read = this.c.read(bArr);
            if (read == -1) {
                return this.e;
            }
            this.d.write(bArr, 0, read);
        }
    }
}
