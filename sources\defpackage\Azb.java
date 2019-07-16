package defpackage;

import java.io.IOException;

/* renamed from: Azb reason: default package */
/* compiled from: Http2Connection */
class Azb extends Jyb {
    final /* synthetic */ int b;
    final /* synthetic */ C7649wzb c;
    final /* synthetic */ Gzb d;

    Azb(Gzb gzb, String str, Object[] objArr, int i, C7649wzb wzb) {
        this.d = gzb;
        this.b = i;
        this.c = wzb;
        super(str, objArr);
    }

    public void b() {
        try {
            this.d.b(this.b, this.c);
        } catch (IOException e) {
            this.d.a(e);
        }
    }
}
