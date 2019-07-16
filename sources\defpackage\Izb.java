package defpackage;

import java.io.IOException;

/* renamed from: Izb reason: default package */
/* compiled from: Http2Connection */
class Izb extends Jyb {
    final /* synthetic */ Nzb b;
    final /* synthetic */ d c;

    Izb(d dVar, String str, Object[] objArr, Nzb nzb) {
        this.c = dVar;
        this.b = nzb;
        super(str, objArr);
    }

    public void b() {
        try {
            Gzb.this.c.a(this.b);
        } catch (IOException e) {
            _zb a = _zb.a();
            StringBuilder sb = new StringBuilder();
            sb.append("Http2Connection.Listener failure for ");
            sb.append(Gzb.this.e);
            a.a(4, sb.toString(), (Throwable) e);
            try {
                this.b.a(C7649wzb.PROTOCOL_ERROR, e);
            } catch (IOException unused) {
            }
        }
    }
}
