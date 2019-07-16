package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: vAb reason: default package and case insensitive filesystem */
/* compiled from: Okio */
class C7513vAb implements HAb {
    final /* synthetic */ JAb a;
    final /* synthetic */ InputStream b;

    C7513vAb(JAb jAb, InputStream inputStream) {
        this.a = jAb;
        this.b = inputStream;
    }

    public long b(C6825lAb lab, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                this.a.e();
                DAb b2 = lab.b(1);
                int read = this.b.read(b2.a, b2.c, (int) Math.min(j, (long) (8192 - b2.c)));
                if (read == -1) {
                    return -1;
                }
                b2.c += read;
                long j2 = (long) read;
                lab.c += j2;
                return j2;
            } catch (AssertionError e) {
                if (C7720yAb.a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
    }

    public void close() throws IOException {
        this.b.close();
    }

    public JAb k() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("source(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
