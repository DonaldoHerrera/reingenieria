package defpackage;

import java.io.IOException;

/* renamed from: Xyb reason: default package */
/* compiled from: ConnectInterceptor */
public final class Xyb implements C7164pyb {
    public final C7440tyb a;

    public Xyb(C7440tyb tyb) {
        this.a = tyb;
    }

    public Ayb intercept(a aVar) throws IOException {
        C7097ozb ozb = (C7097ozb) aVar;
        C7647wyb x = ozb.x();
        C6551gzb f = ozb.f();
        return ozb.a(x, f, f.a(aVar, !x.e().equals("GET")));
    }
}
