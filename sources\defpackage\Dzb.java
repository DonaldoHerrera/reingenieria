package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: Dzb reason: default package */
/* compiled from: Http2Connection */
class Dzb extends Jyb {
    final /* synthetic */ int b;
    final /* synthetic */ List c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Gzb e;

    Dzb(Gzb gzb, String str, Object[] objArr, int i, List list, boolean z) {
        this.e = gzb;
        this.b = i;
        this.c = list;
        this.d = z;
        super(str, objArr);
    }

    public void b() {
        boolean a = this.e.k.a(this.b, this.c, this.d);
        if (a) {
            try {
                this.e.s.a(this.b, C7649wzb.CANCEL);
            } catch (IOException unused) {
                return;
            }
        }
        if (a || this.d) {
            synchronized (this.e) {
                this.e.u.remove(Integer.valueOf(this.b));
            }
        }
    }
}
