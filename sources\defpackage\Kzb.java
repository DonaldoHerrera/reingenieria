package defpackage;

import java.io.IOException;

/* renamed from: Kzb reason: default package */
/* compiled from: Http2Connection */
class Kzb extends Jyb {
    final /* synthetic */ Szb b;
    final /* synthetic */ d c;

    Kzb(d dVar, String str, Object[] objArr, Szb szb) {
        this.c = dVar;
        this.b = szb;
        super(str, objArr);
    }

    public void b() {
        try {
            Gzb.this.s.a(this.b);
        } catch (IOException e) {
            Gzb.this.a(e);
        }
    }
}
