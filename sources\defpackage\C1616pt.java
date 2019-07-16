package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: pt reason: default package and case insensitive filesystem */
public final class C1616pt extends C1621py {
    private final Object c;
    private final C1646qt d;
    private String e;

    public C1616pt(C1646qt qtVar, Object obj) {
        super("application/json; charset=UTF-8");
        Pu.a(qtVar);
        this.d = qtVar;
        Pu.a(obj);
        this.c = obj;
    }

    public final C1616pt a(String str) {
        this.e = str;
        return this;
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        C1735tt a = this.d.a(outputStream, b());
        if (this.e != null) {
            a.d();
            a.b(this.e);
        }
        a.a(this.c);
        if (this.e != null) {
            a.e();
        }
        a.a();
    }
}
