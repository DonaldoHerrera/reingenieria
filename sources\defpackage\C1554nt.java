package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nt reason: default package and case insensitive filesystem */
final class C1554nt extends FilterInputStream {
    private long a = 0;
    private final /* synthetic */ C1461kt b;

    public C1554nt(C1461kt ktVar, InputStream inputStream) {
        this.b = ktVar;
        super(inputStream);
    }

    private final void a() throws IOException {
        long i = this.b.i();
        if (i != -1) {
            long j = this.a;
            if (j != 0 && j < i) {
                StringBuilder sb = new StringBuilder(102);
                sb.append("Connection closed prematurely: bytesRead = ");
                sb.append(j);
                sb.append(", Content-Length = ");
                sb.append(i);
                throw new IOException(sb.toString());
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            a();
        } else {
            this.a += (long) read;
        }
        return read;
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(j);
        this.a += skip;
        return skip;
    }

    public final int read() throws IOException {
        int read = this.in.read();
        if (read == -1) {
            a();
        } else {
            this.a++;
        }
        return read;
    }
}
