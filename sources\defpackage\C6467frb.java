package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: frb reason: default package and case insensitive filesystem */
/* compiled from: ClassDeserializer.kt */
public final class C6467frb {
    /* access modifiers changed from: private */
    public static final Set<C7280rnb> a = RWa.a(C7280rnb.a(C5301Sbb.h.c.h()));
    public static final b b = new b(null);
    private final _Xa<a, C5029Jcb> c = this.d.q().a((_Xa<? super K, ? extends V>) new C6535grb<Object,Object>(this));
    private final C6739jrb d;

    /* renamed from: frb$a */
    /* compiled from: ClassDeserializer.kt */
    private static final class a {
        private final C7280rnb a;
        private final C6331drb b;

        public a(C7280rnb rnb, C6331drb drb) {
            C7471uYa.b(rnb, "classId");
            this.a = rnb;
            this.b = drb;
        }

        public final C6331drb a() {
            return this.b;
        }

        public final C7280rnb b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C7471uYa.a((Object) this.a, (Object) ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: frb$b */
    /* compiled from: ClassDeserializer.kt */
    public static final class b {
        private b() {
        }

        public final Set<C7280rnb> a() {
            return C6467frb.a;
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public C6467frb(C6739jrb jrb) {
        C7471uYa.b(jrb, "components");
        this.d = jrb;
    }

    public static /* synthetic */ C5029Jcb a(C6467frb frb, C7280rnb rnb, C6331drb drb, int i, Object obj) {
        if ((i & 2) != 0) {
            drb = null;
        }
        return frb.a(rnb, drb);
    }

    public final C5029Jcb a(C7280rnb rnb, C6331drb drb) {
        C7471uYa.b(rnb, "classId");
        return (C5029Jcb) this.c.invoke(new a(rnb, drb));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9 A[EDGE_INSN: B:45:0x00b9->B:37:0x00b9 ?: BREAK  , SYNTHETIC] */
    public final C5029Jcb a(a aVar) {
        Object obj;
        C6875lrb a2;
        boolean z;
        C7280rnb b2 = aVar.b();
        for (C7547veb a3 : this.d.i()) {
            C5029Jcb a4 = a3.a(b2);
            if (a4 != null) {
                return a4;
            }
        }
        if (a.contains(b2)) {
            return null;
        }
        C6331drb a5 = aVar.a();
        if (a5 == null) {
            a5 = this.d.c().a(b2);
        }
        if (a5 != null) {
            Emb a6 = a5.a();
            C6458flb b3 = a5.b();
            Bmb c2 = a5.c();
            C7822zdb d2 = a5.d();
            C7280rnb c3 = b2.c();
            String str = "classId.shortClassName";
            if (c3 != null) {
                C5029Jcb a7 = a(this, c3, null, 2, null);
                if (!(a7 instanceof C6333dsb)) {
                    a7 = null;
                }
                C6333dsb dsb = (C6333dsb) a7;
                if (dsb == null) {
                    return null;
                }
                C7694xnb f = b2.f();
                C7471uYa.a((Object) f, str);
                if (!dsb.a(f)) {
                    return null;
                }
                a2 = dsb.a();
            } else {
                C6858ldb o = this.d.o();
                C7349snb d3 = b2.d();
                C7471uYa.a((Object) d3, "classId.packageFqName");
                Iterator it = o.a(d3).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C6790kdb kdb = (C6790kdb) obj;
                    if (kdb instanceof C7012nrb) {
                        C7012nrb nrb = (C7012nrb) kdb;
                        C7694xnb f2 = b2.f();
                        C7471uYa.a((Object) f2, str);
                        if (!nrb.a(f2)) {
                            z = false;
                            continue;
                            if (z) {
                                break;
                            }
                        }
                    }
                    z = true;
                    continue;
                    if (z) {
                    }
                }
                C6790kdb kdb2 = (C6790kdb) obj;
                if (kdb2 != null) {
                    C6739jrb jrb = this.d;
                    C6799kmb G = b3.G();
                    C7471uYa.a((Object) G, "classProto.typeTable");
                    Jmb jmb = new Jmb(G);
                    defpackage.Mmb.a aVar2 = Mmb.b;
                    C7555vmb I = b3.I();
                    C7471uYa.a((Object) I, "classProto.versionRequirementTable");
                    a2 = jrb.a(kdb2, a6, jmb, aVar2.a(I), c2, null);
                }
            }
            C6333dsb dsb2 = new C6333dsb(a2, b3, a6, c2, d2);
            return dsb2;
        }
        return null;
    }
}
