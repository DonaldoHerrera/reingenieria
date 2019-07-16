package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: _bb reason: default package and case insensitive filesystem */
/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
public final class C5534_bb implements C7547veb {
    public static final a a = new a(null);
    private final Ssb b;
    private final C6450fdb c;

    /* renamed from: _bb$a */
    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final b b(String str, C7349snb snb) {
            c a = c.f.a(snb, str);
            b bVar = null;
            if (a == null) {
                return null;
            }
            int length = a.a().length();
            if (str != null) {
                String substring = str.substring(length);
                C7471uYa.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                Integer a2 = a(substring);
                if (a2 != null) {
                    bVar = new b(a, a2.intValue());
                }
                return bVar;
            }
            throw new OVa("null cannot be cast to non-null type java.lang.String");
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final c a(String str, C7349snb snb) {
            C7471uYa.b(str, "className");
            C7471uYa.b(snb, "packageFqName");
            b b = b(str, snb);
            if (b != null) {
                return b.c();
            }
            return null;
        }

        private final Integer a(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - '0';
                if (charAt < 0 || 9 < charAt) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: _bb$b */
    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    private static final class b {
        private final c a;
        private final int b;

        public b(c cVar, int i) {
            C7471uYa.b(cVar, "kind");
            this.a = cVar;
            this.b = i;
        }

        public final c a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final c c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
                        if (this.b == bVar.b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            c cVar = this.a;
            return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("KindWithArity(kind=");
            sb.append(this.a);
            sb.append(", arity=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public C5534_bb(Ssb ssb, C6450fdb fdb) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(fdb, "module");
        this.b = ssb;
        this.c = fdb;
    }

    public boolean a(C7349snb snb, C7694xnb xnb) {
        C7471uYa.b(snb, "packageFqName");
        C7471uYa.b(xnb, "name");
        String a2 = xnb.a();
        C7471uYa.a((Object) a2, "name.asString()");
        if ((Cxb.b(a2, "Function", false, 2, null) || Cxb.b(a2, "KFunction", false, 2, null) || Cxb.b(a2, "SuspendFunction", false, 2, null) || Cxb.b(a2, "KSuspendFunction", false, 2, null)) && a.b(a2, snb) != null) {
            return true;
        }
        return false;
    }

    public C5029Jcb a(C7280rnb rnb) {
        C7471uYa.b(rnb, "classId");
        if (!rnb.g() && !rnb.h()) {
            String a2 = rnb.e().a();
            C7471uYa.a((Object) a2, "classId.relativeClassName.asString()");
            if (!Hxb.a((CharSequence) a2, (CharSequence) "Function", false, 2, (Object) null)) {
                return null;
            }
            C7349snb d = rnb.d();
            C7471uYa.a((Object) d, "classId.packageFqName");
            b a3 = a.b(a2, d);
            if (a3 != null) {
                c a4 = a3.a();
                int b2 = a3.b();
                List ra = this.c.a(d).ra();
                ArrayList arrayList = new ArrayList();
                for (Object next : ra) {
                    if (next instanceof C5059Kbb) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : arrayList) {
                    if (next2 instanceof C5151Nbb) {
                        arrayList2.add(next2);
                    }
                }
                C6790kdb kdb = (C5151Nbb) C7676xWa.g((List) arrayList2);
                if (kdb == null) {
                    kdb = (C5059Kbb) C7676xWa.f((List) arrayList);
                }
                return new C5649bcb(this.b, kdb, a4, b2);
            }
        }
        return null;
    }

    public Collection<C5029Jcb> a(C7349snb snb) {
        C7471uYa.b(snb, "packageFqName");
        return SWa.a();
    }
}
