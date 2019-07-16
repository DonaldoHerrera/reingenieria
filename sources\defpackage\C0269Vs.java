package defpackage;

import java.io.IOException;

/* renamed from: Vs reason: default package and case insensitive filesystem */
public final class C0269Vs {
    private final C0473at a;
    private final C0284Ys b;

    C0269Vs(C0473at atVar, C0284Ys ys) {
        this.a = atVar;
        this.b = ys;
    }

    public final C0274Ws a(String str, C1740ty tyVar, C1710sy syVar) throws IOException {
        C0274Ws ws = new C0274Ws(this.a, null);
        C0284Ys ys = this.b;
        if (ys != null) {
            ys.zza(ws);
        }
        ws.a(str);
        ws.a(tyVar);
        if (syVar != null) {
            ws.a(syVar);
        }
        return ws;
    }
}
