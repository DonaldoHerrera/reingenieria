package defpackage;

/* renamed from: whb reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaAnnotationDescriptor.kt */
final class C7619whb extends C7540vYa implements PXa<Etb> {
    final /* synthetic */ C7688xhb a;

    C7619whb(C7688xhb xhb) {
        this.a = xhb;
        super(0);
    }

    public final Etb d() {
        C7349snb q = this.a.q();
        if (q != null) {
            C7471uYa.a((Object) q, "fqName ?: return@createL…fqName: $javaAnnotation\")");
            C5029Jcb a2 = C6721jcb.a(C6721jcb.m, q, this.a.f.d().E(), null, 4, null);
            if (a2 == null) {
                Kib H = this.a.g.H();
                a2 = H != null ? this.a.f.a().k().a(H) : null;
            }
            if (a2 == null) {
                a2 = this.a.a(q);
            }
            return a2.z();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No fqName: ");
        sb.append(this.a.g);
        return C7154ptb.c(sb.toString());
    }
}
