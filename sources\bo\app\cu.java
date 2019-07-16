package bo.app;

public class cu implements ct {
    private static final String a = Hg.a(cu.class);
    private final ab b;

    public cu(ab abVar) {
        this.b = abVar;
    }

    private void c(cs csVar) {
        Hg.c(a, "Short circuiting execution of network request and immediately marking it as succeeded.");
        csVar.a(this.b, (bm) null);
        csVar.a(this.b);
        if (csVar instanceof cr) {
            this.b.a(new ad((cr) csVar), ad.class);
        } else if (csVar instanceof ch) {
            this.b.a(new cf((ch) csVar, null), cf.class);
        }
    }

    public void a(cs csVar) {
        c(csVar);
    }

    public void b(cs csVar) {
        c(csVar);
    }
}
