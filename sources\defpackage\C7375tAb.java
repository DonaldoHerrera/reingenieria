package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: tAb reason: default package and case insensitive filesystem */
/* compiled from: InflaterSource */
public final class C7375tAb implements HAb {
    private final C6961nAb a;
    private final Inflater b;
    private int c;
    private boolean d;

    C7375tAb(C6961nAb nab, Inflater inflater) {
        if (nab == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.a = nab;
            this.b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final boolean a() throws IOException {
        if (!this.b.needsInput()) {
            return false;
        }
        b();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.a.p()) {
            return true;
        } else {
            DAb dAb = this.a.j().b;
            int i = dAb.c;
            int i2 = dAb.b;
            this.c = i - i2;
            this.b.setInput(dAb.a, i2, this.c);
            return false;
        }
    }

    public long b(C6825lAb lab, long j) throws IOException {
        DAb b2;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.d) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean a2 = a();
                try {
                    b2 = lab.b(1);
                    int inflate = this.b.inflate(b2.a, b2.c, (int) Math.min(j, (long) (8192 - b2.c)));
                    if (inflate > 0) {
                        b2.c += inflate;
                        long j2 = (long) inflate;
                        lab.c += j2;
                        return j2;
                    } else if (this.b.finished()) {
                        break;
                    } else if (this.b.needsDictionary()) {
                        break;
                    } else if (a2) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            b();
            if (b2.b == b2.c) {
                lab.b = b2.b();
                EAb.a(b2);
            }
            return -1;
        }
    }

    public void close() throws IOException {
        if (!this.d) {
            this.b.end();
            this.d = true;
            this.a.close();
        }
    }

    public JAb k() {
        return this.a.k();
    }

    private void b() throws IOException {
        int i = this.c;
        if (i != 0) {
            int remaining = i - this.b.getRemaining();
            this.c -= remaining;
            this.a.skip((long) remaining);
        }
    }
}
