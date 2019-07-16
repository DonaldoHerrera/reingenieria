package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ysb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedPackageMemberScope.kt */
public class C7773ysb extends C7704xsb {
    private final C7349snb l = this.m.q();
    private final C6790kdb m;

    public C7773ysb(C6790kdb kdb, Ilb ilb, Emb emb, Bmb bmb, C7014nsb nsb, C6739jrb jrb, PXa<? extends Collection<C7694xnb>> pXa) {
        C6790kdb kdb2 = kdb;
        C7471uYa.b(kdb2, "packageDescriptor");
        C7471uYa.b(ilb, "proto");
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(bmb, "metadataVersion");
        C7471uYa.b(jrb, "components");
        PXa<? extends Collection<C7694xnb>> pXa2 = pXa;
        C7471uYa.b(pXa2, "classNames");
        C6799kmb s = ilb.s();
        C7471uYa.a((Object) s, "proto.typeTable");
        Jmb jmb = new Jmb(s);
        a aVar = Mmb.b;
        C7555vmb t = ilb.t();
        C7471uYa.a((Object) t, "proto.versionRequirementTable");
        C6875lrb a = jrb.a(kdb, emb, jmb, aVar.a(t), bmb, nsb);
        List n = ilb.n();
        C7471uYa.a((Object) n, "proto.functionList");
        List p = ilb.p();
        C7471uYa.a((Object) p, "proto.propertyList");
        List r = ilb.r();
        C7471uYa.a((Object) r, "proto.typeAliasList");
        super(a, n, p, r, pXa2);
        this.m = kdb2;
    }

    /* access modifiers changed from: protected */
    public void a(Collection<C5272Rcb> collection, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(collection, "result");
        C7471uYa.b(_xa, "nameFilter");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    public boolean b(C7694xnb xnb) {
        boolean z;
        C7471uYa.b(xnb, "name");
        if (super.b(xnb)) {
            return true;
        }
        Iterable i = c().a().i();
        if (!(i instanceof Collection) || !((Collection) i).isEmpty()) {
            Iterator it = i.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C7547veb) it.next()).a(this.l, xnb)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                return true;
            }
            return false;
        }
        z = false;
        if (!z) {
        }
    }

    public void d(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        Bfb.a(c().a().l(), dfb, this.m, xnb);
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> e() {
        return SWa.a();
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> f() {
        return SWa.a();
    }

    public List<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        Collection a = a(xqb, _xa, Ffb.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<C7547veb> i = c().a().i();
        ArrayList arrayList = new ArrayList();
        for (C7547veb a2 : i) {
            C7331sWa.a((Collection<? super T>) arrayList, (Iterable<? extends T>) a2.a(this.l));
        }
        return C7676xWa.c(a, (Iterable<? extends T>) arrayList);
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        d(xnb, dfb);
        return super.b(xnb, dfb);
    }

    /* access modifiers changed from: protected */
    public C7280rnb a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return new C7280rnb(this.l, xnb);
    }
}
