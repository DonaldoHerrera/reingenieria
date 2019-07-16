package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: izb reason: default package and case insensitive filesystem */
/* compiled from: CallServerInterceptor */
public final class C6687izb implements C7164pyb {
    private final boolean a;

    public C6687izb(boolean z) {
        this.a = z;
    }

    public Ayb intercept(a aVar) throws IOException {
        boolean z;
        Ayb ayb;
        C7097ozb ozb = (C7097ozb) aVar;
        Zyb e = ozb.e();
        C7647wyb x = ozb.x();
        long currentTimeMillis = System.currentTimeMillis();
        e.a(x);
        a aVar2 = null;
        if (!C7028nzb.b(x.e()) || x.a() == null) {
            e.h();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(x.a("Expect"))) {
                e.e();
                e.i();
                aVar2 = e.a(true);
                z = true;
            } else {
                z = false;
            }
            if (aVar2 != null) {
                e.h();
                if (!e.b().c()) {
                    e.g();
                }
            } else if (x.a().c()) {
                e.e();
                x.a().a(C7720yAb.a(e.a(x, true)));
            } else {
                C6893mAb a2 = C7720yAb.a(e.a(x, false));
                x.a().a(a2);
                a2.close();
            }
        }
        if (x.a() == null || !x.a().c()) {
            e.d();
        }
        if (!z) {
            e.i();
        }
        if (aVar2 == null) {
            aVar2 = e.a(false);
        }
        aVar2.a(x);
        aVar2.a(e.b().b());
        aVar2.b(currentTimeMillis);
        aVar2.a(System.currentTimeMillis());
        Ayb a3 = aVar2.a();
        int d = a3.d();
        if (d == 100) {
            a a4 = e.a(false);
            a4.a(x);
            a4.a(e.b().b());
            a4.b(currentTimeMillis);
            a4.a(System.currentTimeMillis());
            a3 = a4.a();
            d = a3.d();
        }
        e.b(a3);
        if (!this.a || d != 101) {
            a G = a3.G();
            G.a(e.a(a3));
            ayb = G.a();
        } else {
            a G2 = a3.G();
            G2.a(Kyb.d);
            ayb = G2.a();
        }
        String str = "Connection";
        String str2 = "close";
        if (str2.equalsIgnoreCase(ayb.K().a(str)) || str2.equalsIgnoreCase(ayb.a(str))) {
            e.g();
        }
        if ((d != 204 && d != 205) || ayb.a().contentLength() <= 0) {
            return ayb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(d);
        sb.append(" had non-zero Content-Length: ");
        sb.append(ayb.a().contentLength());
        throw new ProtocolException(sb.toString());
    }
}
