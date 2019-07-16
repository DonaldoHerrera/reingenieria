package defpackage;

import java.util.List;

/* renamed from: idb reason: default package and case insensitive filesystem */
/* compiled from: NotFoundClasses.kt */
final class C6654idb extends C7540vYa implements _Xa<a, b> {
    final /* synthetic */ C6586hdb a;

    C6654idb(C6586hdb hdb) {
        this.a = hdb;
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r1 != null) goto L_0x0041;
     */
    /* renamed from: a */
    public final b invoke(a aVar) {
        C5272Rcb rcb;
        C7471uYa.b(aVar, "<name for destructuring parameter 0>");
        C7280rnb a2 = aVar.a();
        List b = aVar.b();
        if (!a2.g()) {
            C7280rnb c = a2.c();
            if (c != null) {
                C6586hdb hdb = this.a;
                C7471uYa.a((Object) c, "outerClassId");
                rcb = hdb.a(c, C7676xWa.c((Iterable) b, 1));
            }
            Msb b2 = this.a.a;
            C7349snb d = a2.d();
            C7471uYa.a((Object) d, "classId.packageFqName");
            rcb = (C5091Lcb) b2.invoke(d);
            C5272Rcb rcb2 = rcb;
            boolean h = a2.h();
            Ssb c2 = this.a.c;
            C7694xnb f = a2.f();
            C7471uYa.a((Object) f, "classId.shortClassName");
            Integer num = (Integer) C7676xWa.g(b);
            b bVar = new b(c2, rcb2, f, h, num != null ? num.intValue() : 0);
            return bVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unresolved local class: ");
        sb.append(a2);
        throw new UnsupportedOperationException(sb.toString());
    }
}
