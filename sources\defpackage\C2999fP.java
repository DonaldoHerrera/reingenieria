package defpackage;

import java.io.IOException;

/* renamed from: fP reason: default package and case insensitive filesystem */
/* compiled from: ApiUserPlanInterceptor */
class C2999fP implements C7164pyb {
    private final C3223qU a;

    C2999fP(C3223qU qUVar) {
        this.a = qUVar;
    }

    private boolean a(C7647wyb wyb) {
        return wyb.c().a().contains("Authorization");
    }

    public Ayb intercept(a aVar) throws IOException {
        C7647wyb x = aVar.x();
        Ayb a2 = aVar.a(x);
        if (a(x)) {
            C2455aV a3 = C2455aV.a(a2.a("SC-Mob-UserPlan"));
            b a4 = SDb.a("Configuration");
            StringBuilder sb = new StringBuilder();
            sb.append("Got remote plan: ");
            sb.append(a3);
            sb.append(" for req=");
            sb.append(x);
            a4.a(sb.toString(), new Object[0]);
            this.a.a(a3);
        }
        return a2;
    }
}
