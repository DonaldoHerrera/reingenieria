package defpackage;

/* renamed from: rqb reason: default package and case insensitive filesystem */
/* compiled from: JavaDescriptorResolver.kt */
public final class C7286rqb {
    private final C6522ghb a;
    private final Dgb b;

    public C7286rqb(C6522ghb ghb, Dgb dgb) {
        C7471uYa.b(ghb, "packageFragmentProvider");
        C7471uYa.b(dgb, "javaResolverCache");
        this.a = ghb;
        this.b = dgb;
    }

    public final C6522ghb a() {
        return this.a;
    }

    public final C5029Jcb a(Kib kib) {
        C7471uYa.b(kib, "javaClass");
        C7349snb q = kib.q();
        if (q != null && kib.u() == C6320djb.SOURCE) {
            return this.b.a(q);
        }
        Kib l = kib.l();
        C5029Jcb jcb = null;
        if (l != null) {
            C5029Jcb a2 = a(l);
            Gqb H = a2 != null ? a2.H() : null;
            C5122Mcb b2 = H != null ? H.b(kib.getName(), Ffb.FROM_JAVA_LOADER) : null;
            if (!(b2 instanceof C5029Jcb)) {
                b2 = null;
            }
            return (C5029Jcb) b2;
        } else if (q == null) {
            return null;
        } else {
            C6522ghb ghb = this.a;
            C7349snb c = q.c();
            C7471uYa.a((Object) c, "fqName.parent()");
            Rhb rhb = (Rhb) C7676xWa.g(ghb.a(c));
            if (rhb != null) {
                jcb = rhb.a(kib);
            }
            return jcb;
        }
    }
}
