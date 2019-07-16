package defpackage;

import java.util.List;

/* renamed from: Hcb reason: default package and case insensitive filesystem */
/* compiled from: typeParameterUtils.kt */
final class C4966Hcb implements C4905Fdb {
    private final C4905Fdb a;
    private final C5272Rcb b;
    private final int c;

    public C4966Hcb(C4905Fdb fdb, C5272Rcb rcb, int i) {
        C7471uYa.b(fdb, "originalDescriptor");
        C7471uYa.b(rcb, "declarationDescriptor");
        this.a = fdb;
        this.b = rcb;
        this.c = i;
    }

    public Ptb Q() {
        return this.a.Q();
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        return this.a.a(tcb, d);
    }

    public C5272Rcb e() {
        return this.b;
    }

    public C6723jeb getAnnotations() {
        return this.a.getAnnotations();
    }

    public int getIndex() {
        return this.c + this.a.getIndex();
    }

    public C7694xnb getName() {
        return this.a.getName();
    }

    public C7822zdb getSource() {
        return this.a.getSource();
    }

    public List<C7706xtb> getUpperBounds() {
        return this.a.getUpperBounds();
    }

    public boolean oa() {
        return this.a.oa();
    }

    public C6473fub pa() {
        return this.a.pa();
    }

    public boolean qa() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append("[inner-copy]");
        return sb.toString();
    }

    public Etb z() {
        return this.a.z();
    }

    public C4905Fdb getOriginal() {
        C4905Fdb original = this.a.getOriginal();
        C7471uYa.a((Object) original, "originalDescriptor.original");
        return original;
    }
}
