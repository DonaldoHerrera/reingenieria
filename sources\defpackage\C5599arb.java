package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: arb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationAndConstantLoaderImpl.kt */
public final class C5599arb implements Zqb<C6315deb, Npb<?>> {
    private final C6263crb a;
    private final Xqb b;

    public C5599arb(C6450fdb fdb, C6586hdb hdb, Xqb xqb) {
        C7471uYa.b(fdb, "module");
        C7471uYa.b(hdb, "notFoundClasses");
        C7471uYa.b(xqb, "protocol");
        this.b = xqb;
        this.a = new C6263crb(fdb, hdb);
    }

    public List<C6315deb> b(Frb frb, Olb olb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(olb, "proto");
        return C6918mWa.a();
    }

    public List<C6315deb> a(a aVar) {
        C7471uYa.b(aVar, "container");
        List<C5590alb> list = (List) aVar.f().a(this.b.a());
        if (list == null) {
            list = C6918mWa.a();
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C5590alb a2 : list) {
            arrayList.add(this.a.a(a2, aVar.b()));
        }
        return arrayList;
    }

    public List<C6315deb> b(Frb frb, Wnb wnb, Yqb yqb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(wnb, "proto");
        C7471uYa.b(yqb, "kind");
        return C6918mWa.a();
    }

    public List<C6315deb> a(Frb frb, Wnb wnb, Yqb yqb) {
        List<C5590alb> list;
        C7471uYa.b(frb, "container");
        C7471uYa.b(wnb, "proto");
        C7471uYa.b(yqb, "kind");
        if (wnb instanceof C6730jlb) {
            list = (List) ((C6730jlb) wnb).a(this.b.c());
        } else if (wnb instanceof Blb) {
            list = (List) ((Blb) wnb).a(this.b.f());
        } else if (wnb instanceof Olb) {
            int i = _qb.a[yqb.ordinal()];
            if (i == 1) {
                list = (List) ((Olb) wnb).a(this.b.h());
            } else if (i == 2) {
                list = (List) ((Olb) wnb).a(this.b.i());
            } else if (i == 3) {
                list = (List) ((Olb) wnb).a(this.b.j());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown message: ");
            sb.append(wnb);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (list == null) {
            list = C6918mWa.a();
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C5590alb a2 : list) {
            arrayList.add(this.a.a(a2, frb.b()));
        }
        return arrayList;
    }

    public List<C6315deb> a(Frb frb, Olb olb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(olb, "proto");
        return C6918mWa.a();
    }

    public List<C6315deb> a(Frb frb, C7485ulb ulb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(ulb, "proto");
        List<C5590alb> list = (List) ulb.a(this.b.d());
        if (list == null) {
            list = C6918mWa.a();
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C5590alb a2 : list) {
            arrayList.add(this.a.a(a2, frb.b()));
        }
        return arrayList;
    }

    public List<C6315deb> a(Frb frb, Wnb wnb, Yqb yqb, int i, C7003nmb nmb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(wnb, "callableProto");
        C7471uYa.b(yqb, "kind");
        C7471uYa.b(nmb, "proto");
        List<C5590alb> list = (List) nmb.a(this.b.g());
        if (list == null) {
            list = C6918mWa.a();
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C5590alb a2 : list) {
            arrayList.add(this.a.a(a2, frb.b()));
        }
        return arrayList;
    }

    public List<C6315deb> a(_lb _lb, Emb emb) {
        C7471uYa.b(_lb, "proto");
        C7471uYa.b(emb, "nameResolver");
        List<C5590alb> list = (List) _lb.a(this.b.k());
        if (list == null) {
            list = C6918mWa.a();
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C5590alb a2 : list) {
            arrayList.add(this.a.a(a2, emb));
        }
        return arrayList;
    }

    public List<C6315deb> a(C6527gmb gmb, Emb emb) {
        C7471uYa.b(gmb, "proto");
        C7471uYa.b(emb, "nameResolver");
        List<C5590alb> list = (List) gmb.a(this.b.l());
        if (list == null) {
            list = C6918mWa.a();
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C5590alb a2 : list) {
            arrayList.add(this.a.a(a2, emb));
        }
        return arrayList;
    }

    public Npb<?> a(Frb frb, Olb olb, C7706xtb xtb) {
        C7471uYa.b(frb, "container");
        C7471uYa.b(olb, "proto");
        C7471uYa.b(xtb, "expectedType");
        b bVar = (b) Hmb.a(olb, this.b.b());
        if (bVar != null) {
            return this.a.a(xtb, bVar, frb.b());
        }
        return null;
    }
}
