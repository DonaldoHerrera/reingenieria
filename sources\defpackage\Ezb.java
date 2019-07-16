package defpackage;

import java.io.IOException;

/* renamed from: Ezb reason: default package */
/* compiled from: Http2Connection */
class Ezb extends Jyb {
    final /* synthetic */ int b;
    final /* synthetic */ C6825lAb c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Gzb f;

    Ezb(Gzb gzb, String str, Object[] objArr, int i, C6825lAb lab, int i2, boolean z) {
        this.f = gzb;
        this.b = i;
        this.c = lab;
        this.d = i2;
        this.e = z;
        super(str, objArr);
    }

    public void b() {
        try {
            boolean a = this.f.k.a(this.b, this.c, this.d, this.e);
            if (a) {
                this.f.s.a(this.b, C7649wzb.CANCEL);
            }
            if (a || this.e) {
                synchronized (this.f) {
                    this.f.u.remove(Integer.valueOf(this.b));
                }
            }
        } catch (IOException unused) {
        }
    }
}
