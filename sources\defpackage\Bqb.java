package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: Bqb reason: default package */
/* compiled from: InnerClassesScopeWrapper.kt */
public final class Bqb extends Fqb {
    private final Eqb a;

    public Bqb(Eqb eqb) {
        C7471uYa.b(eqb, "workerScope");
        this.a = eqb;
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        C5122Mcb b = this.a.b(xnb, dfb);
        if (b == null) {
            return null;
        }
        C5029Jcb jcb = (C5029Jcb) (!(b instanceof C5029Jcb) ? null : b);
        if (jcb != null) {
            return jcb;
        }
        if (!(b instanceof C4874Edb)) {
            b = null;
        }
        return (C4874Edb) b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Classes from ");
        sb.append(this.a);
        return sb.toString();
    }

    public List<C5122Mcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        C7700xqb c = xqb.c(C7700xqb.x.b());
        if (c == null) {
            return C6918mWa.a();
        }
        Collection a2 = this.a.a(c, _xa);
        ArrayList arrayList = new ArrayList();
        for (Object next : a2) {
            if (next instanceof C5152Ncb) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Set<C7694xnb> b() {
        return this.a.b();
    }

    public Set<C7694xnb> a() {
        return this.a.a();
    }
}
