package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: tfb reason: default package and case insensitive filesystem */
/* compiled from: SubpackagesScope.kt */
public class C7410tfb extends Fqb {
    private final C6450fdb a;
    private final C7349snb b;

    public C7410tfb(C6450fdb fdb, C7349snb snb) {
        C7471uYa.b(fdb, "moduleDescriptor");
        C7471uYa.b(snb, "fqName");
        this.a = fdb;
        this.b = snb;
    }

    /* access modifiers changed from: protected */
    public final C7132pdb a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        if (xnb.c()) {
            return null;
        }
        C6450fdb fdb = this.a;
        C7349snb a2 = this.b.a(xnb);
        C7471uYa.a((Object) a2, "fqName.child(name)");
        C7132pdb a3 = fdb.a(a2);
        if (a3.isEmpty()) {
            return null;
        }
        return a3;
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        if (!xqb.a(C7700xqb.x.e())) {
            return C6918mWa.a();
        }
        if (this.b.b() && xqb.j().contains(b.a)) {
            return C6918mWa.a();
        }
        Collection<C7349snb> a2 = this.a.a(this.b, _xa);
        ArrayList arrayList = new ArrayList(a2.size());
        for (C7349snb e : a2) {
            C7694xnb e2 = e.e();
            C7471uYa.a((Object) e2, "subFqName.shortName()");
            if (((Boolean) _xa.invoke(e2)).booleanValue()) {
                C7089ovb.a(arrayList, a(e2));
            }
        }
        return arrayList;
    }
}
