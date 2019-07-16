package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Vhb reason: default package */
/* compiled from: LazyJavaScope.kt */
public abstract class Vhb extends Fqb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(Vhb.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), HYa.a((DYa) new EYa(HYa.a(Vhb.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), HYa.a((DYa) new EYa(HYa.a(Vhb.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    private final Psb<Collection<C5272Rcb>> b = this.i.e().a(new Whb(this), C6918mWa.a());
    private final Psb<C7205qhb> c = this.i.e().a((PXa<? extends T>) new Yhb<Object>(this));
    private final Msb<C7694xnb, Collection<C7684xdb>> d = this.i.e().b((_Xa<? super K, ? extends V>) new _hb<Object,Object>(this));
    private final Psb e = this.i.e().a((PXa<? extends T>) new Zhb<Object>(this));
    private final Psb f = this.i.e().a((PXa<? extends T>) new C5655bib<Object>(this));
    private final Psb g = this.i.e().a((PXa<? extends T>) new Xhb<Object>(this));
    private final Msb<C7694xnb, List<C7408tdb>> h = this.i.e().b((_Xa<? super K, ? extends V>) new C5587aib<Object,Object>(this));
    private final C6590hhb i;

    /* renamed from: Vhb$a */
    /* compiled from: LazyJavaScope.kt */
    protected static final class a {
        private final C7706xtb a;
        private final C7706xtb b;
        private final List<C5061Kdb> c;
        private final List<C4905Fdb> d;
        private final boolean e;
        private final List<String> f;

        public a(C7706xtb xtb, C7706xtb xtb2, List<? extends C5061Kdb> list, List<? extends C4905Fdb> list2, boolean z, List<String> list3) {
            C7471uYa.b(xtb, "returnType");
            C7471uYa.b(list, "valueParameters");
            C7471uYa.b(list2, "typeParameters");
            C7471uYa.b(list3, "errors");
            this.a = xtb;
            this.b = xtb2;
            this.c = list;
            this.d = list2;
            this.e = z;
            this.f = list3;
        }

        public final List<String> a() {
            return this.f;
        }

        public final boolean b() {
            return this.e;
        }

        public final C7706xtb c() {
            return this.b;
        }

        public final C7706xtb d() {
            return this.a;
        }

        public final List<C4905Fdb> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a) && C7471uYa.a((Object) this.b, (Object) aVar.b) && C7471uYa.a((Object) this.c, (Object) aVar.c) && C7471uYa.a((Object) this.d, (Object) aVar.d)) {
                        if (!(this.e == aVar.e) || !C7471uYa.a((Object) this.f, (Object) aVar.f)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final List<C5061Kdb> f() {
            return this.c;
        }

        public int hashCode() {
            C7706xtb xtb = this.a;
            int i = 0;
            int hashCode = (xtb != null ? xtb.hashCode() : 0) * 31;
            C7706xtb xtb2 = this.b;
            int hashCode2 = (hashCode + (xtb2 != null ? xtb2.hashCode() : 0)) * 31;
            List<C5061Kdb> list = this.c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            List<C4905Fdb> list2 = this.d;
            int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
            List<String> list3 = this.f;
            if (list3 != null) {
                i = list3.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MethodSignatureData(returnType=");
            sb.append(this.a);
            sb.append(", receiverType=");
            sb.append(this.b);
            sb.append(", valueParameters=");
            sb.append(this.c);
            sb.append(", typeParameters=");
            sb.append(this.d);
            sb.append(", hasStableParameterNames=");
            sb.append(this.e);
            sb.append(", errors=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: Vhb$b */
    /* compiled from: LazyJavaScope.kt */
    protected static final class b {
        private final List<C5061Kdb> a;
        private final boolean b;

        public b(List<? extends C5061Kdb> list, boolean z) {
            C7471uYa.b(list, "descriptors");
            this.a = list;
            this.b = z;
        }

        public final List<C5061Kdb> a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public Vhb(C6590hhb hhb) {
        C7471uYa.b(hhb, "c");
        this.i = hhb;
    }

    private final boolean c(Rib rib) {
        return rib.h() && rib.k();
    }

    private final Set<C7694xnb> h() {
        return (Set) Rsb.a(this.e, (Object) this, a[0]);
    }

    private final Set<C7694xnb> i() {
        return (Set) Rsb.a(this.f, (Object) this, a[1]);
    }

    /* access modifiers changed from: protected */
    public abstract a a(Uib uib, List<? extends C4905Fdb> list, C7706xtb xtb, List<? extends C5061Kdb> list2);

    /* access modifiers changed from: protected */
    public abstract void a(Collection<C7684xdb> collection, C7694xnb xnb);

    /* access modifiers changed from: protected */
    public abstract void a(C7694xnb xnb, Collection<C7408tdb> collection);

    /* access modifiers changed from: protected */
    public boolean a(Rgb rgb) {
        C7471uYa.b(rgb, "$this$isVisibleAsFunction");
        return true;
    }

    public Set<C7694xnb> b() {
        return i();
    }

    /* access modifiers changed from: protected */
    public abstract Set<C7694xnb> b(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa);

    /* access modifiers changed from: protected */
    public abstract Set<C7694xnb> c(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa);

    /* access modifiers changed from: protected */
    public abstract C7205qhb c();

    /* access modifiers changed from: protected */
    public final C6590hhb d() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public abstract Set<C7694xnb> d(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa);

    /* access modifiers changed from: protected */
    public final Psb<C7205qhb> e() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public abstract C7615wdb f();

    /* access modifiers changed from: protected */
    public abstract C5272Rcb g();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lazy scope for ");
        sb.append(g());
        return sb.toString();
    }

    private final C7706xtb b(Rib rib) {
        boolean z = false;
        C7706xtb a2 = this.i.g().a(rib.getType(), C7482uib.a(Lgb.COMMON, false, (C4905Fdb) null, 3, (Object) null));
        if ((C5301Sbb.s(a2) || C5301Sbb.v(a2)) && c(rib) && rib.x()) {
            z = true;
        }
        if (!z) {
            return a2;
        }
        C7706xtb i2 = C5605aub.i(a2);
        C7471uYa.a((Object) i2, "TypeUtils.makeNotNullable(propertyType)");
        return i2;
    }

    /* access modifiers changed from: private */
    public final C7408tdb d(Rib rib) {
        C7065ofb a2 = a(rib);
        a2.a((C7134pfb) null, (C7546vdb) null, (C5448Xcb) null, (C5448Xcb) null);
        a2.a(b(rib), C6918mWa.a(), f(), (C7615wdb) null);
        if (C6531gpb.a((C5123Mdb) a2, a2.getType())) {
            a2.a(this.i.e().b((PXa<? extends T>) new C5723cib<Object>(this, rib, a2)));
        }
        this.i.a().g().a(rib, (C7408tdb) a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    public final Rgb a(Uib uib) {
        Map map;
        Uib uib2 = uib;
        C7471uYa.b(uib2, "method");
        Rgb a2 = Rgb.a(g(), C6386ehb.a(this.i, uib2), uib.getName(), (C7822zdb) this.i.a().q().a(uib2));
        C7471uYa.a((Object) a2, "JavaMethodDescriptor.cre….source(method)\n        )");
        C6590hhb a3 = Zgb.a(this.i, (C5272Rcb) a2, (C5588ajb) uib, 0, 4, (Object) null);
        List<_ib> typeParameters = uib.getTypeParameters();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) typeParameters, 10));
        for (_ib a4 : typeParameters) {
            C4905Fdb a5 = a3.f().a(a4);
            if (a5 != null) {
                arrayList.add(a5);
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        b a6 = a(a3, (C5582adb) a2, uib.f());
        a a7 = a(uib2, arrayList, a(uib2, a3), a6.a());
        C7706xtb c2 = a7.c();
        C7615wdb a8 = c2 != null ? C6463fpb.a((C4904Fcb) a2, c2, C6723jeb.c.a()) : null;
        C7615wdb f2 = f();
        List e2 = a7.e();
        List f3 = a7.f();
        C7706xtb d2 = a7.d();
        C6314ddb a9 = C6314ddb.f.a(uib.g(), !uib.h());
        C5583aeb d3 = uib.d();
        if (a7.c() != null) {
            map = KWa.a(NVa.a(Rgb.D, C7676xWa.f(a6.a())));
        } else {
            map = LWa.a();
        }
        a2.a(a8, f2, e2, f3, d2, a9, d3, map);
        a2.a(a7.b(), a6.b());
        if (!(!a7.a().isEmpty())) {
            return a2;
        }
        a3.a().p().a(a2, a7.a());
        throw null;
    }

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        if (!b().contains(xnb)) {
            return C6918mWa.a();
        }
        return (Collection) this.h.invoke(xnb);
    }

    /* access modifiers changed from: protected */
    public final C7706xtb a(Uib uib, C6590hhb hhb) {
        C7471uYa.b(uib, "method");
        C7471uYa.b(hhb, "c");
        return hhb.g().a(uib.a(), C7482uib.a(Lgb.COMMON, uib.j().m(), (C4905Fdb) null, 2, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    public final b a(C6590hhb hhb, C5582adb adb, List<? extends C5656bjb> list) {
        String str;
        HVa hVa;
        C7694xnb name;
        C6590hhb hhb2 = hhb;
        C7471uYa.b(hhb2, "c");
        C7471uYa.b(adb, "function");
        C7471uYa.b(list, "jValueParameters");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterable<CWa> u = C7676xWa.u(list);
        ArrayList arrayList = new ArrayList(C6986nWa.a(u, 10));
        boolean z = false;
        boolean z2 = false;
        for (CWa cWa : u) {
            int a2 = cWa.a();
            C5656bjb bjb = (C5656bjb) cWa.b();
            C6723jeb a3 = C6386ehb.a(hhb2, bjb);
            Jib jib = null;
            C6931mib a4 = C7482uib.a(Lgb.COMMON, z, (C4905Fdb) null, 3, (Object) null);
            C7349snb snb = C6657igb.m;
            C7471uYa.a((Object) snb, "JvmAnnotationNames.PARAMETER_NAME_FQ_NAME");
            C6315deb a5 = a3.a(snb);
            if (a5 != null) {
                Npb a6 = C7148pqb.a(a5);
                if (a6 != null) {
                    if (!(a6 instanceof C5665bqb)) {
                        a6 = null;
                    }
                    C5665bqb bqb = (C5665bqb) a6;
                    if (bqb != null) {
                        str = (String) bqb.a();
                        if (!bjb.G()) {
                            Zib type = bjb.getType();
                            if (type instanceof Jib) {
                                jib = type;
                            }
                            Jib jib2 = jib;
                            if (jib2 != null) {
                                C7706xtb a7 = hhb.g().a(jib2, a4, true);
                                hVa = NVa.a(a7, hhb.d().E().a(a7));
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Vararg parameter should be an array: ");
                                sb.append(bjb);
                                throw new AssertionError(sb.toString());
                            }
                        } else {
                            hVa = NVa.a(hhb.g().a(bjb.getType(), a4), null);
                        }
                        C7706xtb xtb = (C7706xtb) hVa.a();
                        C7706xtb xtb2 = (C7706xtb) hVa.b();
                        if (C7471uYa.a((Object) adb.getName().a(), (Object) "equals") || list.size() != 1 || !C7471uYa.a((Object) hhb.d().E().v(), (Object) xtb)) {
                            if (str != null) {
                                if ((str.length() > 0) && linkedHashSet.add(str)) {
                                    name = C7694xnb.b(str);
                                }
                            }
                            name = bjb.getName();
                            if (name == null) {
                                z2 = true;
                            }
                            if (name == null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append('p');
                                sb2.append(a2);
                                name = C7694xnb.b(sb2.toString());
                            }
                        } else {
                            name = C7694xnb.b("other");
                        }
                        boolean z3 = z2;
                        C7694xnb xnb = name;
                        C7471uYa.a((Object) xnb, "if (function.name.asStri…(\"p$index\")\n            }");
                        C7755yfb yfb = r2;
                        ArrayList arrayList2 = arrayList;
                        C7755yfb yfb2 = new C7755yfb(adb, null, a2, a3, xnb, xtb, false, false, false, xtb2, hhb.a().q().a(bjb));
                        arrayList2.add(yfb);
                        arrayList = arrayList2;
                        z2 = z3;
                        z = false;
                        hhb2 = hhb;
                    }
                }
            }
            str = null;
            if (!bjb.G()) {
            }
            C7706xtb xtb3 = (C7706xtb) hVa.a();
            C7706xtb xtb22 = (C7706xtb) hVa.b();
            if (C7471uYa.a((Object) adb.getName().a(), (Object) "equals")) {
            }
            if (str != null) {
            }
            name = bjb.getName();
            if (name == null) {
            }
            if (name == null) {
            }
            boolean z32 = z2;
            C7694xnb xnb2 = name;
            C7471uYa.a((Object) xnb2, "if (function.name.asStri…(\"p$index\")\n            }");
            C7755yfb yfb3 = yfb2;
            ArrayList arrayList22 = arrayList;
            C7755yfb yfb22 = new C7755yfb(adb, null, a2, a3, xnb2, xtb3, false, false, false, xtb22, hhb.a().q().a(bjb));
            arrayList22.add(yfb3);
            arrayList = arrayList22;
            z2 = z32;
            z = false;
            hhb2 = hhb;
        }
        return new b(C7676xWa.q(arrayList), z2);
    }

    public Set<C7694xnb> a() {
        return h();
    }

    public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        if (!a().contains(xnb)) {
            return C6918mWa.a();
        }
        return (Collection) this.d.invoke(xnb);
    }

    private final C7065ofb a(Rib rib) {
        Sgb a2 = Sgb.a(g(), C6386ehb.a(this.i, rib), C6314ddb.FINAL, rib.d(), !rib.h(), rib.getName(), this.i.a().q().a(rib), c(rib));
        C7471uYa.a((Object) a2, "JavaPropertyDescriptor.c…d.isFinalStatic\n        )");
        return a2;
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        return (Collection) this.b.d();
    }

    /* access modifiers changed from: protected */
    public final List<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa, Dfb dfb) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        C7471uYa.b(dfb, "location");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (xqb.a(C7700xqb.x.b())) {
            for (C7694xnb xnb : b(xqb, _xa)) {
                if (((Boolean) _xa.invoke(xnb)).booleanValue()) {
                    C7089ovb.a(linkedHashSet, b(xnb, dfb));
                }
            }
        }
        if (xqb.a(C7700xqb.x.c()) && !xqb.j().contains(defpackage.C7631wqb.a.b)) {
            for (C7694xnb xnb2 : c(xqb, _xa)) {
                if (((Boolean) _xa.invoke(xnb2)).booleanValue()) {
                    linkedHashSet.addAll(a(xnb2, dfb));
                }
            }
        }
        if (xqb.a(C7700xqb.x.h()) && !xqb.j().contains(defpackage.C7631wqb.a.b)) {
            for (C7694xnb xnb3 : d(xqb, _xa)) {
                if (((Boolean) _xa.invoke(xnb3)).booleanValue()) {
                    linkedHashSet.addAll(c(xnb3, dfb));
                }
            }
        }
        return C7676xWa.q(linkedHashSet);
    }
}
