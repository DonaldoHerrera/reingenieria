package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: uAb reason: default package and case insensitive filesystem */
/* compiled from: Okio */
class C7444uAb implements GAb {
    final /* synthetic */ JAb a;
    final /* synthetic */ OutputStream b;

    C7444uAb(JAb jAb, OutputStream outputStream) {
        this.a = jAb;
        this.b = outputStream;
    }

    public void a(C6825lAb lab, long j) throws IOException {
        KAb.a(lab.c, 0, j);
        while (j > 0) {
            this.a.e();
            DAb dAb = lab.b;
            int min = (int) Math.min(j, (long) (dAb.c - dAb.b));
            this.b.write(dAb.a, dAb.b, min);
            dAb.b += min;
            long j2 = (long) min;
            j -= j2;
            lab.c -= j2;
            if (dAb.b == dAb.c) {
                lab.b = dAb.b();
                EAb.a(dAb);
            }
        }
    }

    public void close() throws IOException {
        this.b.close();
    }

    public void flush() throws IOException {
        this.b.flush();
    }

    public JAb k() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sink(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
