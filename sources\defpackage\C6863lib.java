package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lib reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaTypeParameterDescriptor.kt */
public final class C6863lib extends Ceb {
    private final C6318dhb j = new C6318dhb(this.k, this.l);
    private final C6590hhb k;
    private final _ib l;

    public C6863lib(C6590hhb hhb, _ib _ib, int i, C5272Rcb rcb) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(_ib, "javaTypeParameter");
        C7471uYa.b(rcb, "containingDeclaration");
        super(hhb.e(), rcb, _ib.getName(), C6473fub.INVARIANT, false, i, C7822zdb.a, hhb.a().s());
        this.k = hhb;
        this.l = _ib;
    }

    /* access modifiers changed from: protected */
    public void a(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
    }

    /* access modifiers changed from: protected */
    public List<C7706xtb> ta() {
        Collection<Nib> upperBounds = this.l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            Etb e = this.k.d().E().e();
            C7471uYa.a((Object) e, "c.module.builtIns.anyType");
            Etb v = this.k.d().E().v();
            C7471uYa.a((Object) v, "c.module.builtIns.nullableAnyType");
            return C6850lWa.a(C7775ytb.a(e, v));
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) upperBounds, 10));
        for (Nib a : upperBounds) {
            arrayList.add(this.k.g().a((Zib) a, C7482uib.a(Lgb.COMMON, false, (C4905Fdb) this, 1, (Object) null)));
        }
        return arrayList;
    }

    public C6318dhb getAnnotations() {
        return this.j;
    }
}
