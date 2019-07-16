package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: Czb reason: default package */
/* compiled from: Http2Connection */
class Czb extends Jyb {
    final /* synthetic */ int b;
    final /* synthetic */ List c;
    final /* synthetic */ Gzb d;

    Czb(Gzb gzb, String str, Object[] objArr, int i, List list) {
        this.d = gzb;
        this.b = i;
        this.c = list;
        super(str, objArr);
    }

    public void b() {
        if (this.d.k.a(this.b, this.c)) {
            try {
                this.d.s.a(this.b, C7649wzb.CANCEL);
                synchronized (this.d) {
                    this.d.u.remove(Integer.valueOf(this.b));
                }
            } catch (IOException unused) {
            }
        }
    }
}
