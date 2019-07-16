package defpackage;

import java.io.IOException;

/* renamed from: Us reason: default package and case insensitive filesystem */
public final class C0264Us implements C0284Ys, C1860xy {
    private final boolean a;

    public C0264Us() {
        this(false);
    }

    public final void a(C0274Ws ws) throws IOException {
        String a2 = ws.a();
        String str = "POST";
        boolean z = true;
        String str2 = "GET";
        if (a2.equals(str) || ((!a2.equals(str2) || ws.f().k().length() <= 2048) && ws.e().a(a2))) {
            z = false;
        }
        if (z) {
            String a3 = ws.a();
            ws.a(str);
            ws.j().a("X-HTTP-Method-Override", (Object) a3);
            if (a3.equals(str2)) {
                ws.a((C1710sy) new C1369ht((C1740ty) ws.f().clone()));
                ws.f().clear();
            } else if (ws.g() == null) {
                ws.a((C1710sy) new C1590oy());
            }
        }
    }

    public final void zza(C0274Ws ws) {
        ws.a((C1860xy) this);
    }

    private C0264Us(boolean z) {
        this.a = false;
    }
}
