package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Dsb reason: default package */
/* compiled from: DeserializedTypeParameterDescriptor.kt */
public final class Dsb extends Ceb {
    private final Xrb j = new Xrb(this.k.f(), new Csb(this));
    /* access modifiers changed from: private */
    public final C6875lrb k;
    /* access modifiers changed from: private */
    public final C6527gmb l;

    public Dsb(C6875lrb lrb, C6527gmb gmb, int i) {
        C7471uYa.b(lrb, "c");
        C7471uYa.b(gmb, "proto");
        Ssb f = lrb.f();
        C5272Rcb c = lrb.c();
        C7694xnb b = Drb.b(lrb.e(), gmb.n());
        Hrb hrb = Hrb.a;
        b s = gmb.s();
        C7471uYa.a((Object) s, "proto.variance");
        super(f, c, b, hrb.a(s), gmb.o(), i, C7822zdb.a, a.a);
        this.k = lrb;
        this.l = gmb;
    }

    /* access modifiers changed from: protected */
    public List<C7706xtb> ta() {
        List<_lb> a = Imb.a(this.l, this.k.h());
        if (a.isEmpty()) {
            return C6850lWa.a(C7148pqb.b((C5272Rcb) this).n());
        }
        Rrb g = this.k.g();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a, 10));
        for (_lb b : a) {
            arrayList.add(g.b(b));
        }
        return arrayList;
    }

    public Xrb getAnnotations() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public Void a(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append("There should be no cycles for deserialized type parameters, but found for: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
}
