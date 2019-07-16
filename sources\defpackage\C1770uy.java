package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: uy reason: default package and case insensitive filesystem */
public final class C1770uy implements C1370hu {
    private final C1370hu a;
    private final C1800vy b;

    public C1770uy(C1370hu huVar, C1800vy vyVar) {
        Pu.a(huVar);
        this.a = huVar;
        Pu.a(vyVar);
        this.b = vyVar;
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        this.b.a(this.a, outputStream);
    }
}
