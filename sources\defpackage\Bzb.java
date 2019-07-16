package defpackage;

import java.io.IOException;

/* renamed from: Bzb reason: default package */
/* compiled from: Http2Connection */
class Bzb extends Jyb {
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ Gzb d;

    Bzb(Gzb gzb, String str, Object[] objArr, int i, long j) {
        this.d = gzb;
        this.b = i;
        this.c = j;
        super(str, objArr);
    }

    public void b() {
        try {
            this.d.s.b(this.b, this.c);
        } catch (IOException e) {
            this.d.a(e);
        }
    }
}
