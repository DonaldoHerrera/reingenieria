package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: hdb reason: default package and case insensitive filesystem */
/* compiled from: NotFoundClasses.kt */
public final class C6586hdb {
    /* access modifiers changed from: private */
    public final Msb<C7349snb, C6790kdb> a = this.c.b((_Xa<? super K, ? extends V>) new C6722jdb<Object,Object>(this));
    private final Msb<a, C5029Jcb> b = this.c.b((_Xa<? super K, ? extends V>) new C6654idb<Object,Object>(this));
    /* access modifiers changed from: private */
    public final Ssb c;
    /* access modifiers changed from: private */
    public final C6450fdb d;

    /* renamed from: hdb$a */
    /* compiled from: NotFoundClasses.kt */
    private static final class a {
        private final C7280rnb a;
        private final List<Integer> b;

        public a(C7280rnb rnb, List<Integer> list) {
            C7471uYa.b(rnb, "classId");
            C7471uYa.b(list, "typeParametersCount");
            this.a = rnb;
            this.b = list;
        }

        public final C7280rnb a() {
            return this.a;
        }

        public final List<Integer> b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C7280rnb rnb = this.a;
            int i = 0;
            int hashCode = (rnb != null ? rnb.hashCode() : 0) * 31;
            List<Integer> list = this.b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassRequest(classId=");
            sb.append(this.a);
            sb.append(", typeParametersCount=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: hdb$b */
    /* compiled from: NotFoundClasses.kt */
    public static final class b extends Meb {
        private final List<C4905Fdb> h;
        private final C6335dtb i;
        private final boolean j;

        public b(Ssb ssb, C5272Rcb rcb, C7694xnb xnb, boolean z, int i2) {
            C7471uYa.b(ssb, "storageManager");
            C7471uYa.b(rcb, "container");
            C7471uYa.b(xnb, "name");
            super(ssb, rcb, xnb, C7822zdb.a, false);
            this.j = z;
            C6785kZa d = C7265rZa.d(0, i2);
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) d, 10));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                int nextInt = ((FWa) it).nextInt();
                C6723jeb a = C6723jeb.c.a();
                C6473fub fub = C6473fub.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(nextInt);
                arrayList.add(C7686xfb.a(this, a, false, fub, C7694xnb.b(sb.toString()), nextInt));
            }
            this.h = arrayList;
            this.i = new C6335dtb(this, this.h, RWa.a(C7148pqb.e(this).E().e()), ssb);
        }

        public List<C4905Fdb> B() {
            return this.h;
        }

        public Collection<C5029Jcb> C() {
            return C6918mWa.a();
        }

        public boolean D() {
            return this.j;
        }

        public C4997Icb F() {
            return null;
        }

        public boolean K() {
            return false;
        }

        public C5029Jcb M() {
            return null;
        }

        public boolean N() {
            return false;
        }

        public C5583aeb d() {
            C5583aeb aeb = _db.e;
            C7471uYa.a((Object) aeb, "Visibilities.PUBLIC");
            return aeb;
        }

        public C5060Kcb g() {
            return C5060Kcb.CLASS;
        }

        public C6723jeb getAnnotations() {
            return C6723jeb.c.a();
        }

        public C6314ddb h() {
            return C6314ddb.FINAL;
        }

        public Collection<C4997Icb> i() {
            return SWa.a();
        }

        public boolean isInline() {
            return false;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ");
            sb.append(getName());
            sb.append(" (not found)");
            return sb.toString();
        }

        public defpackage.Eqb.b J() {
            return defpackage.Eqb.b.a;
        }

        public defpackage.Eqb.b L() {
            return defpackage.Eqb.b.a;
        }

        public C6335dtb Q() {
            return this.i;
        }
    }

    public C6586hdb(Ssb ssb, C6450fdb fdb) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(fdb, "module");
        this.c = ssb;
        this.d = fdb;
    }

    public final C5029Jcb a(C7280rnb rnb, List<Integer> list) {
        C7471uYa.b(rnb, "classId");
        C7471uYa.b(list, "typeParametersCount");
        return (C5029Jcb) this.b.invoke(new a(rnb, list));
    }
}
