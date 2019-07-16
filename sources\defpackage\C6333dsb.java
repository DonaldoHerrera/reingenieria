package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: dsb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedClassDescriptor.kt */
public final class C6333dsb extends Beb {
    /* access modifiers changed from: private */
    public final C7280rnb e;
    private final C6314ddb f = Hrb.a.a((Glb) Dmb.d.a(this.u.r()));
    private final C5583aeb g = Hrb.a.a((C7762ymb) Dmb.c.a(this.u.r()));
    private final C5060Kcb h = Hrb.a.a((defpackage.C6458flb.b) Dmb.e.a(this.u.r()));
    private final C6875lrb i;
    private final Fqb j;
    /* access modifiers changed from: private */
    public final b k;
    private final a l;
    /* access modifiers changed from: private */
    public final c m;
    private final C5272Rcb n;
    private final Qsb<C4997Icb> o;
    private final Psb<Collection<C4997Icb>> p;
    private final Qsb<C5029Jcb> q;
    private final Psb<Collection<C5029Jcb>> r;
    private final defpackage.Frb.a s;
    private final C6723jeb t;
    private final C6458flb u;
    private final Bmb v;
    private final C7822zdb w;

    /* renamed from: dsb$a */
    /* compiled from: DeserializedClassDescriptor.kt */
    private final class a extends C7704xsb {
        private final Psb<Collection<C5272Rcb>> l;

        public a() {
            C6875lrb a = C6333dsb.this.a();
            List u = C6333dsb.this.b().u();
            C7471uYa.a((Object) u, "classProto.functionList");
            List x = C6333dsb.this.b().x();
            C7471uYa.a((Object) x, "classProto.propertyList");
            List D = C6333dsb.this.b().D();
            C7471uYa.a((Object) D, "classProto.typeAliasList");
            List<Number> v = C6333dsb.this.b().v();
            C7471uYa.a((Object) v, "classProto.nestedClassNameList");
            Emb e = C6333dsb.this.a().e();
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) v, 10));
            for (Number intValue : v) {
                arrayList.add(Drb.b(e, intValue.intValue()));
            }
            super(a, u, x, D, new _rb(arrayList));
            this.l = c().f().a((PXa<? extends T>) new C5601asb<Object>(this));
        }

        private final C6333dsb j() {
            return C6333dsb.this;
        }

        public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
            C7471uYa.b(xqb, "kindFilter");
            C7471uYa.b(_xa, "nameFilter");
            return (Collection) this.l.d();
        }

        /* access modifiers changed from: protected */
        public void b(C7694xnb xnb, Collection<C7408tdb> collection) {
            C7471uYa.b(xnb, "name");
            C7471uYa.b(collection, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (C7706xtb ha : j().Q().b()) {
                arrayList.addAll(ha.ha().c(xnb, Ffb.FOR_ALREADY_TRACKED));
            }
            a(xnb, arrayList, collection);
        }

        public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
            C7471uYa.b(xnb, "name");
            C7471uYa.b(dfb, "location");
            d(xnb, dfb);
            return super.c(xnb, dfb);
        }

        public void d(C7694xnb xnb, Dfb dfb) {
            C7471uYa.b(xnb, "name");
            C7471uYa.b(dfb, "location");
            Bfb.a(c().a().l(), dfb, (C5029Jcb) j(), xnb);
        }

        /* access modifiers changed from: protected */
        public Set<C7694xnb> e() {
            List<C7706xtb> b = j().k.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C7706xtb ha : b) {
                C7331sWa.a((Collection) linkedHashSet, (Iterable) ha.ha().a());
            }
            linkedHashSet.addAll(c().a().a().c(C6333dsb.this));
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        public Set<C7694xnb> f() {
            List<C7706xtb> b = j().k.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C7706xtb ha : b) {
                C7331sWa.a((Collection) linkedHashSet, (Iterable) ha.ha().b());
            }
            return linkedHashSet;
        }

        public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
            C7471uYa.b(xnb, "name");
            C7471uYa.b(dfb, "location");
            d(xnb, dfb);
            return super.a(xnb, dfb);
        }

        /* access modifiers changed from: protected */
        public void a(C7694xnb xnb, Collection<C7684xdb> collection) {
            C7471uYa.b(xnb, "name");
            C7471uYa.b(collection, "functions");
            ArrayList arrayList = new ArrayList();
            for (C7706xtb ha : j().Q().b()) {
                arrayList.addAll(ha.ha().a(xnb, Ffb.FOR_ALREADY_TRACKED));
            }
            C7331sWa.a((Iterable) collection, (_Xa) new C5669bsb(this));
            collection.addAll(c().a().a().a(xnb, C6333dsb.this));
            a(xnb, arrayList, collection);
        }

        public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
            C7471uYa.b(xnb, "name");
            C7471uYa.b(dfb, "location");
            d(xnb, dfb);
            c f = j().m;
            if (f != null) {
                C5029Jcb a = f.a(xnb);
                if (a != null) {
                    return a;
                }
            }
            return super.b(xnb, dfb);
        }

        private final <D extends C4935Gcb> void a(C7694xnb xnb, Collection<? extends D> collection, Collection<D> collection2) {
            C7629wpb.a(xnb, collection, new ArrayList(collection2), j(), new C6265csb(collection2));
        }

        /* access modifiers changed from: protected */
        public C7280rnb a(C7694xnb xnb) {
            C7471uYa.b(xnb, "name");
            C7280rnb a = C6333dsb.this.e.a(xnb);
            C7471uYa.a((Object) a, "classId.createNestedClassId(name)");
            return a;
        }

        /* access modifiers changed from: protected */
        public void a(Collection<C5272Rcb> collection, _Xa<? super C7694xnb, Boolean> _xa) {
            C7471uYa.b(collection, "result");
            C7471uYa.b(_xa, "nameFilter");
            c f = j().m;
            Collection a = f != null ? f.a() : null;
            if (a == null) {
                a = C6918mWa.a();
            }
            collection.addAll(a);
        }
    }

    /* renamed from: dsb$b */
    /* compiled from: DeserializedClassDescriptor.kt */
    private final class b extends Usb {
        private final Psb<List<C4905Fdb>> c;

        public b() {
            super(C6333dsb.this.a().f());
            this.c = C6333dsb.this.a().f().a((PXa<? extends T>) new C6401esb<Object>(this));
        }

        public boolean d() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Collection<C7706xtb> e() {
            String str;
            List<_lb> a = Imb.a(C6333dsb.this.b(), C6333dsb.this.a().h());
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) a, 10));
            for (_lb b : a) {
                arrayList.add(C6333dsb.this.a().g().b(b));
            }
            List<C7706xtb> c2 = C7676xWa.c((Collection) arrayList, (Iterable) C6333dsb.this.a().a().a().b(C6333dsb.this));
            ArrayList<defpackage.C6586hdb.b> arrayList2 = new ArrayList<>();
            for (C7706xtb za : c2) {
                C5122Mcb c3 = za.za().c();
                if (!(c3 instanceof defpackage.C6586hdb.b)) {
                    c3 = null;
                }
                defpackage.C6586hdb.b bVar = (defpackage.C6586hdb.b) c3;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                C7357srb g = C6333dsb.this.a().a().g();
                C6333dsb dsb = C6333dsb.this;
                ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList2, 10));
                for (defpackage.C6586hdb.b bVar2 : arrayList2) {
                    C7280rnb a2 = C7148pqb.a((C5122Mcb) bVar2);
                    if (a2 != null) {
                        C7349snb a3 = a2.a();
                        if (a3 != null) {
                            str = a3.a();
                            if (str != null) {
                                arrayList3.add(str);
                            }
                        }
                    }
                    str = bVar2.getName().a();
                    arrayList3.add(str);
                }
                g.a(dsb, arrayList3);
            }
            return C7676xWa.q(c2);
        }

        /* access modifiers changed from: protected */
        public C4843Ddb g() {
            return defpackage.C4843Ddb.a.a;
        }

        public List<C4905Fdb> getParameters() {
            return (List) this.c.d();
        }

        public String toString() {
            String xnb = C6333dsb.this.getName().toString();
            C7471uYa.a((Object) xnb, "name.toString()");
            return xnb;
        }

        public C6333dsb c() {
            return C6333dsb.this;
        }
    }

    /* renamed from: dsb$c */
    /* compiled from: DeserializedClassDescriptor.kt */
    private final class c {
        /* access modifiers changed from: private */
        public final Map<C7694xnb, C7485ulb> a;
        private final Nsb<C7694xnb, C5029Jcb> b;
        /* access modifiers changed from: private */
        public final Psb<Set<C7694xnb>> c;

        public c() {
            List q = C6333dsb.this.b().q();
            C7471uYa.a((Object) q, "classProto.enumEntryList");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable<? extends T>) q, 10)), 16));
            for (Object next : q) {
                C7485ulb ulb = (C7485ulb) next;
                Emb e = C6333dsb.this.a().e();
                C7471uYa.a((Object) ulb, "it");
                linkedHashMap.put(Drb.b(e, ulb.m()), next);
            }
            this.a = linkedHashMap;
            this.b = C6333dsb.this.a().f().a((_Xa<? super K, ? extends V>) new C6537gsb<Object,Object>(this));
            this.c = C6333dsb.this.a().f().a((PXa<? extends T>) new C6605hsb<Object>(this));
        }

        /* access modifiers changed from: private */
        public final Set<C7694xnb> b() {
            String str;
            HashSet hashSet = new HashSet();
            for (C7706xtb ha : C6333dsb.this.Q().b()) {
                for (C5272Rcb rcb : defpackage.Gqb.a.a(ha.ha(), null, null, 3, null)) {
                    if ((rcb instanceof C7684xdb) || (rcb instanceof C7408tdb)) {
                        hashSet.add(rcb.getName());
                    }
                }
            }
            List u = C6333dsb.this.b().u();
            C7471uYa.a((Object) u, "classProto.functionList");
            Iterator it = u.iterator();
            while (true) {
                str = "it";
                if (!it.hasNext()) {
                    break;
                }
                Blb blb = (Blb) it.next();
                Emb e = C6333dsb.this.a().e();
                C7471uYa.a((Object) blb, str);
                hashSet.add(Drb.b(e, blb.o()));
            }
            List<Olb> x = C6333dsb.this.b().x();
            C7471uYa.a((Object) x, "classProto.propertyList");
            for (Olb olb : x) {
                Emb e2 = C6333dsb.this.a().e();
                C7471uYa.a((Object) olb, str);
                hashSet.add(Drb.b(e2, olb.o()));
            }
            return TWa.b((Set<? extends T>) hashSet, (Iterable<? extends T>) hashSet);
        }

        public final C5029Jcb a(C7694xnb xnb) {
            C7471uYa.b(xnb, "name");
            return (C5029Jcb) this.b.invoke(xnb);
        }

        public final Collection<C5029Jcb> a() {
            Set<C7694xnb> keySet = this.a.keySet();
            ArrayList arrayList = new ArrayList();
            for (C7694xnb a2 : keySet) {
                C5029Jcb a3 = a(a2);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            return arrayList;
        }
    }

    public C6333dsb(C6875lrb lrb, C6458flb flb, Emb emb, Bmb bmb, C7822zdb zdb) {
        C6723jeb jeb;
        C7471uYa.b(lrb, "outerContext");
        C7471uYa.b(flb, "classProto");
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(bmb, "metadataVersion");
        C7471uYa.b(zdb, "sourceElement");
        super(lrb.f(), Drb.a(emb, flb.s()).f());
        this.u = flb;
        this.v = bmb;
        this.w = zdb;
        this.e = Drb.a(emb, this.u.s());
        List F = this.u.F();
        C7471uYa.a((Object) F, "classProto.typeParameterList");
        C6799kmb G = this.u.G();
        C7471uYa.a((Object) G, "classProto.typeTable");
        Jmb jmb = new Jmb(G);
        defpackage.Mmb.a aVar = Mmb.b;
        C7555vmb I = this.u.I();
        C7471uYa.a((Object) I, "classProto.versionRequirementTable");
        this.i = lrb.a(this, F, emb, jmb, aVar.a(I), this.v);
        this.j = this.h == C5060Kcb.ENUM_CLASS ? new Iqb(this.i.f(), this) : defpackage.Eqb.b.a;
        this.k = new b();
        this.l = new a();
        defpackage.Frb.a aVar2 = null;
        this.m = this.h == C5060Kcb.ENUM_CLASS ? new c() : null;
        this.n = lrb.c();
        this.o = this.i.f().b((PXa<? extends T>) new C6877lsb<Object>(this));
        this.p = this.i.f().a((PXa<? extends T>) new C6809ksb<Object>(this));
        this.q = this.i.f().b((PXa<? extends T>) new C6741jsb<Object>(this));
        this.r = this.i.f().a((PXa<? extends T>) new C6945msb<Object>(this));
        C6458flb flb2 = this.u;
        Emb e2 = this.i.e();
        Jmb h2 = this.i.h();
        C7822zdb zdb2 = this.w;
        C5272Rcb rcb = this.n;
        if (!(rcb instanceof C6333dsb)) {
            rcb = null;
        }
        C6333dsb dsb = (C6333dsb) rcb;
        if (dsb != null) {
            aVar2 = dsb.s;
        }
        defpackage.Frb.a aVar3 = new defpackage.Frb.a(flb2, e2, h2, zdb2, aVar2);
        this.s = aVar3;
        if (!Dmb.b.a(this.u.r()).booleanValue()) {
            jeb = C6723jeb.c.a();
        } else {
            jeb = new Esb(this.i.f(), new C6673isb(this));
        }
        this.t = jeb;
    }

    /* access modifiers changed from: private */
    public final C5029Jcb j() {
        if (!this.u.J()) {
            return null;
        }
        C5122Mcb b2 = this.l.b(Drb.b(this.i.e(), this.u.l()), (Dfb) Ffb.FROM_DESERIALIZATION);
        if (!(b2 instanceof C5029Jcb)) {
            b2 = null;
        }
        return (C5029Jcb) b2;
    }

    /* access modifiers changed from: private */
    public final Collection<C4997Icb> k() {
        return C7676xWa.c((Collection) C7676xWa.c((Collection) o(), (Iterable) C6918mWa.b((Object) F())), (Iterable) this.i.a().a().a(this));
    }

    /* access modifiers changed from: private */
    public final C4997Icb l() {
        C4997Icb icb;
        Object obj;
        if (this.h.a()) {
            Leb a2 = C6463fpb.a((C5029Jcb) this, C7822zdb.a);
            a2.a((C7706xtb) z());
            return a2;
        }
        List n2 = this.u.n();
        C7471uYa.a((Object) n2, "classProto.constructorList");
        Iterator it = n2.iterator();
        while (true) {
            icb = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C6730jlb jlb = (C6730jlb) obj;
            defpackage.Dmb.a aVar = Dmb.k;
            C7471uYa.a((Object) jlb, "it");
            if (!aVar.a(jlb.m()).booleanValue()) {
                break;
            }
        }
        C6730jlb jlb2 = (C6730jlb) obj;
        if (jlb2 != null) {
            icb = this.i.d().a(jlb2, true);
        }
        return icb;
    }

    private final List<C4997Icb> o() {
        String str;
        List n2 = this.u.n();
        C7471uYa.a((Object) n2, "classProto.constructorList");
        ArrayList<C6730jlb> arrayList = new ArrayList<>();
        Iterator it = n2.iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C6730jlb jlb = (C6730jlb) next;
            defpackage.Dmb.a aVar = Dmb.k;
            C7471uYa.a((Object) jlb, str);
            Boolean a2 = aVar.a(jlb.m());
            C7471uYa.a((Object) a2, "Flags.IS_SECONDARY.get(it.flags)");
            if (a2.booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (C6730jlb jlb2 : arrayList) {
            Crb d = this.i.d();
            C7471uYa.a((Object) jlb2, str);
            arrayList2.add(d.a(jlb2, false));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public final Collection<C5029Jcb> q() {
        if (this.f != C6314ddb.SEALED) {
            return C6918mWa.a();
        }
        List<Integer> y = this.u.y();
        C7471uYa.a((Object) y, "fqNames");
        if (!(!y.isEmpty())) {
            return C7148pqb.a((C5029Jcb) this);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : y) {
            C6739jrb a2 = this.i.a();
            Emb e2 = this.i.e();
            C7471uYa.a((Object) num, "index");
            C5029Jcb a3 = a2.a(Drb.a(e2, num.intValue()));
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    public List<C4905Fdb> B() {
        return this.i.g().b();
    }

    public Collection<C5029Jcb> C() {
        return (Collection) this.r.d();
    }

    public boolean D() {
        Boolean a2 = Dmb.f.a(this.u.r());
        C7471uYa.a((Object) a2, "Flags.IS_INNER.get(classProto.flags)");
        return a2.booleanValue();
    }

    public C4997Icb F() {
        return (C4997Icb) this.o.d();
    }

    public Eqb J() {
        return this.l;
    }

    public boolean K() {
        return ((defpackage.C6458flb.b) Dmb.e.a(this.u.r())) == defpackage.C6458flb.b.COMPANION_OBJECT;
    }

    public C5029Jcb M() {
        return (C5029Jcb) this.q.d();
    }

    public boolean N() {
        Boolean a2 = Dmb.g.a(this.u.r());
        C7471uYa.a((Object) a2, "Flags.IS_DATA.get(classProto.flags)");
        return a2.booleanValue();
    }

    public Ptb Q() {
        return this.k;
    }

    public C6723jeb getAnnotations() {
        return this.t;
    }

    public C7822zdb getSource() {
        return this.w;
    }

    public C6314ddb h() {
        return this.f;
    }

    public Collection<C4997Icb> i() {
        return (Collection) this.p.d();
    }

    public boolean isInline() {
        Boolean a2 = Dmb.j.a(this.u.r());
        C7471uYa.a((Object) a2, "Flags.IS_INLINE_CLASS.get(classProto.flags)");
        return a2.booleanValue();
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        Boolean a2 = Dmb.h.a(this.u.r());
        C7471uYa.a((Object) a2, "Flags.IS_EXTERNAL_CLASS.get(classProto.flags)");
        return a2.booleanValue();
    }

    public boolean p() {
        Boolean a2 = Dmb.i.a(this.u.r());
        C7471uYa.a((Object) a2, "Flags.IS_EXPECT_CLASS.get(classProto.flags)");
        return a2.booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized class ");
        sb.append(getName());
        return sb.toString();
    }

    public Fqb L() {
        return this.j;
    }

    public final C6875lrb a() {
        return this.i;
    }

    public final C6458flb b() {
        return this.u;
    }

    public final Bmb c() {
        return this.v;
    }

    public C5583aeb d() {
        return this.g;
    }

    public C5272Rcb e() {
        return this.n;
    }

    public final defpackage.Frb.a f() {
        return this.s;
    }

    public C5060Kcb g() {
        return this.h;
    }

    public final boolean a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return this.l.d().contains(xnb);
    }
}
