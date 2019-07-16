package defpackage;

import java.io.IOException;

/* renamed from: ww reason: default package and case insensitive filesystem */
final class C1828ww implements C0504bt {
    private final /* synthetic */ C0504bt a;
    private final /* synthetic */ C0274Ws b;
    private final /* synthetic */ C1827wv c;

    C1828ww(C1827wv wvVar, C0504bt btVar, C0274Ws ws) {
        this.c = wvVar;
        this.a = btVar;
        this.b = ws;
    }

    public final void a(C0279Xs xs) throws IOException {
        C0504bt btVar = this.a;
        if (btVar != null) {
            btVar.a(xs);
        }
        if (!xs.g() && this.b.c()) {
            throw this.c.a(xs);
        }
    }
}
