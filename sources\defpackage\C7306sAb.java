package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: sAb reason: default package and case insensitive filesystem */
/* compiled from: GzipSource */
public final class C7306sAb implements HAb {
    private int a = 0;
    private final C6961nAb b;
    private final Inflater c;
    private final C7375tAb d;
    private final CRC32 e = new CRC32();

    public C7306sAb(HAb hAb) {
        if (hAb != null) {
            this.c = new Inflater(true);
            this.b = C7720yAb.a(hAb);
            this.d = new C7375tAb(this.b, this.c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a() throws IOException {
        this.b.e(10);
        byte g = this.b.j().g(3);
        boolean z = ((g >> 1) & 1) == 1;
        if (z) {
            a(this.b.j(), 0, 10);
        }
        a("ID1ID2", 8075, (int) this.b.readShort());
        this.b.skip(8);
        if (((g >> 2) & 1) == 1) {
            this.b.e(2);
            if (z) {
                a(this.b.j(), 0, 2);
            }
            long n = (long) this.b.j().n();
            this.b.e(n);
            if (z) {
                a(this.b.j(), 0, n);
            }
            this.b.skip(n);
        }
        if (((g >> 3) & 1) == 1) {
            long a2 = this.b.a(0);
            if (a2 != -1) {
                if (z) {
                    a(this.b.j(), 0, a2 + 1);
                }
                this.b.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((g >> 4) & 1) == 1) {
            long a3 = this.b.a(0);
            if (a3 != -1) {
                if (z) {
                    a(this.b.j(), 0, a3 + 1);
                }
                this.b.skip(a3 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", (int) this.b.n(), (int) (short) ((int) this.e.getValue()));
            this.e.reset();
        }
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
            if (this.a == 0) {
                a();
                this.a = 1;
            }
            if (this.a == 1) {
                long j2 = lab.c;
                long b2 = this.d.b(lab, j);
                if (b2 != -1) {
                    a(lab, j2, b2);
                    return b2;
                }
                this.a = 2;
            }
            if (this.a == 2) {
                b();
                this.a = 3;
                if (!this.b.p()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() throws IOException {
        this.d.close();
    }

    public JAb k() {
        return this.b.k();
    }

    private void b() throws IOException {
        a("CRC", this.b.r(), (int) this.e.getValue());
        a("ISIZE", this.b.r(), (int) this.c.getBytesWritten());
    }

    private void a(C6825lAb lab, long j, long j2) {
        DAb dAb = lab.b;
        while (true) {
            int i = dAb.c;
            int i2 = dAb.b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            dAb = dAb.f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) dAb.b) + j);
            int min = (int) Math.min((long) (dAb.c - i3), j2);
            this.e.update(dAb.a, i3, min);
            j2 -= (long) min;
            dAb = dAb.f;
            j = 0;
        }
    }

    private void a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
