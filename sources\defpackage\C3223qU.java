package defpackage;

/* renamed from: qU reason: default package and case insensitive filesystem */
/* compiled from: PlanChangeDetector */
public class C3223qU {
    private final C5327TLa a;
    private final C2436_U b;
    private final C3184oU c;

    C3223qU(C5327TLa tLa, C2436_U _u, C3184oU oUVar) {
        this.a = tLa;
        this.b = _u;
        this.c = oUVar;
    }

    public void a(C2455aV aVVar) {
        if (!this.c.d()) {
            C2455aV q = this.b.q();
            String str = " to ";
            String str2 = "Configuration";
            if (C2474bV.b(aVVar, q)) {
                b a2 = SDb.a(str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Plan upgrade detected from ");
                sb.append(q);
                sb.append(str);
                sb.append(aVVar);
                a2.a(sb.toString(), new Object[0]);
                this.c.b(aVVar);
                this.a.c(C3876taa.j, C2000DU.b(q, aVVar));
            } else if (C2474bV.a(aVVar, q)) {
                b a3 = SDb.a(str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Plan downgrade detected from ");
                sb2.append(q);
                sb2.append(str);
                sb2.append(aVVar);
                a3.a(sb2.toString(), new Object[0]);
                this.c.a(aVVar);
                this.a.c(C3876taa.j, C2000DU.a(q, aVVar));
            }
        }
    }
}
