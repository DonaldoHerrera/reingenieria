package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Mhb reason: default package */
/* compiled from: LazyJavaClassMemberScope.kt */
public final class Mhb extends Vhb {
    private final Psb<List<C4997Icb>> j;
    /* access modifiers changed from: private */
    public final Psb<Set<C7694xnb>> k;
    /* access modifiers changed from: private */
    public final Psb<Map<C7694xnb, Rib>> l;
    private final Nsb<C7694xnb, Meb> m;
    private final C5029Jcb n;
    /* access modifiers changed from: private */
    public final Kib o;

    public Mhb(C6590hhb hhb, C5029Jcb jcb, Kib kib) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(jcb, "ownerDescriptor");
        C7471uYa.b(kib, "jClass");
        super(hhb);
        this.n = jcb;
        this.o = kib;
        this.j = hhb.e().a((PXa<? extends T>) new Ghb<Object>(this, hhb));
        this.k = hhb.e().a((PXa<? extends T>) new Jhb<Object>(this));
        this.l = hhb.e().a((PXa<? extends T>) new Hhb<Object>(this));
        this.m = hhb.e().a((_Xa<? super K, ? extends V>) new Lhb<Object,Object>(this, hhb));
    }

    private final boolean e(C7684xdb xdb) {
        Nfb nfb = Nfb.h;
        C7694xnb name = xdb.getName();
        String str = "name";
        C7471uYa.a((Object) name, str);
        boolean a = nfb.a(name);
        boolean z = false;
        if (!a) {
            return false;
        }
        C7694xnb name2 = xdb.getName();
        C7471uYa.a((Object) name2, str);
        Set<C7684xdb> a2 = a(name2);
        ArrayList arrayList = new ArrayList();
        for (C7684xdb a3 : a2) {
            C5582adb a4 = Nfb.a((C5582adb) a3);
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (b(xdb, (C5582adb) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final C4997Icb j() {
        List list;
        boolean m2 = this.o.m();
        if (this.o.t() && !m2) {
            return null;
        }
        C5029Jcb g = g();
        Ogb b = Ogb.b(g, C6723jeb.c.a(), true, d().a().q().a(this.o));
        C7471uYa.a((Object) b, "JavaClassConstructorDesc….source(jClass)\n        )");
        if (m2) {
            list = a((Leb) b);
        } else {
            list = Collections.emptyList();
        }
        b.e(false);
        b.a(list, a(g));
        b.d(true);
        b.a((C7706xtb) g.z());
        d().a().g().a((Pib) this.o, (C5242Qcb) b);
        return b;
    }

    /* access modifiers changed from: protected */
    public C7615wdb f() {
        return C6531gpb.d(g());
    }

    public final Psb<List<C4997Icb>> h() {
        return this.j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lazy Java member scope for ");
        sb.append(this.o.q());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072 A[SYNTHETIC] */
    private final boolean d(C7684xdb xdb) {
        boolean z;
        boolean z2;
        boolean z3;
        C7694xnb name = xdb.getName();
        C7471uYa.a((Object) name, "function.name");
        List a = C6861lgb.a(name);
        boolean z4 = true;
        if (!(a instanceof Collection) || !a.isEmpty()) {
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Set b = b((C7694xnb) it.next());
                if (!(b instanceof Collection) || !b.isEmpty()) {
                    Iterator it2 = b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C7408tdb tdb = (C7408tdb) it2.next();
                        if (!b(tdb, (_Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>>) new Ihb<Object,Object>(this, xdb)) || (!tdb.V() && C6589hgb.c(xdb.getName().a()))) {
                            z3 = false;
                            continue;
                        } else {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            z2 = true;
                            continue;
                            break;
                        }
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
                z2 = false;
                continue;
                if (z2) {
                }
            }
            if (!z) {
                return false;
            }
            if (b(xdb) || e(xdb) || c(xdb)) {
                z4 = false;
            }
            return z4;
        }
        z = false;
        if (!z) {
        }
    }

    /* access modifiers changed from: protected */
    public C5029Jcb g() {
        return this.n;
    }

    private final boolean b(C7684xdb xdb) {
        boolean z;
        Mfb mfb = Mfb.f;
        C7694xnb name = xdb.getName();
        C7471uYa.a((Object) name, "name");
        List<C7694xnb> a = mfb.a(name);
        if ((a instanceof Collection) && a.isEmpty()) {
            return false;
        }
        for (C7694xnb xnb : a) {
            Set a2 = a(xnb);
            ArrayList arrayList = new ArrayList();
            for (Object next : a2) {
                if (C7135pgb.a((C7684xdb) next)) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                C7684xdb a3 = a(xdb, xnb);
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (a((C7684xdb) it.next(), (C5582adb) a3)) {
                                z = true;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            z = false;
            continue;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(Rgb rgb) {
        C7471uYa.b(rgb, "$this$isVisibleAsFunction");
        if (this.o.m()) {
            return false;
        }
        return d((C7684xdb) rgb);
    }

    /* access modifiers changed from: protected */
    public C7136phb c() {
        return new C7136phb(this.o, Bhb.a);
    }

    /* access modifiers changed from: protected */
    public HashSet<C7694xnb> c(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        Ptb Q = g().Q();
        C7471uYa.a((Object) Q, "ownerDescriptor.typeConstructor");
        Collection<C7706xtb> b = Q.b();
        C7471uYa.a((Object) b, "ownerDescriptor.typeConstructor.supertypes");
        HashSet<C7694xnb> hashSet = new HashSet<>();
        for (C7706xtb ha : b) {
            C7331sWa.a((Collection) hashSet, (Iterable) ha.ha().a());
        }
        hashSet.addAll(((C7205qhb) e().d()).a());
        hashSet.addAll(b(xqb, _xa));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    private final C7684xdb a(C7684xdb xdb) {
        C7349snb snb;
        List f = xdb.f();
        String str = "valueParameters";
        C7471uYa.a((Object) f, str);
        C5061Kdb kdb = (C5061Kdb) C7676xWa.i(f);
        if (kdb != null) {
            C5122Mcb c = kdb.getType().za().c();
            if (c != null) {
                C7487unb d = C7148pqb.d(c);
                if (d != null) {
                    if (!d.c()) {
                        d = null;
                    }
                    if (d != null) {
                        snb = d.h();
                        if (!C5447Xbb.a(snb, d().a().n().a())) {
                            kdb = null;
                        }
                        if (kdb != null) {
                            a x = xdb.x();
                            List f2 = xdb.f();
                            C7471uYa.a((Object) f2, str);
                            C7684xdb xdb2 = (C7684xdb) x.a(C7676xWa.c(f2, 1)).a(((Stb) kdb.getType().ya().get(0)).getType()).build();
                            C7341sfb sfb = (C7341sfb) xdb2;
                            if (sfb != null) {
                                sfb.i(true);
                            }
                            return xdb2;
                        }
                    }
                }
            }
            snb = null;
            if (!C5447Xbb.a(snb, d().a().n().a())) {
            }
            if (kdb != null) {
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final Collection<C7684xdb> c(C7694xnb xnb) {
        Collection<Uib> a = ((C7205qhb) e().d()).a(xnb);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a, 10));
        for (Uib a2 : a) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final Collection<C7684xdb> d(C7694xnb xnb) {
        Set a = a(xnb);
        ArrayList arrayList = new ArrayList();
        for (Object next : a) {
            C7684xdb xdb = (C7684xdb) next;
            if (!(C7135pgb.a(xdb) || Nfb.a((C5582adb) xdb) != null)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final boolean b(C7408tdb tdb, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        boolean z = false;
        if (C7274rhb.a(tdb)) {
            return false;
        }
        C7684xdb c = c(tdb, _xa);
        C7684xdb d = d(tdb, _xa);
        if (c == null) {
            return false;
        }
        if (!tdb.V()) {
            return true;
        }
        if (d != null && d.h() == c.h()) {
            z = true;
        }
        return z;
    }

    private final C7684xdb a(C7684xdb xdb, C7694xnb xnb) {
        a x = xdb.x();
        x.a(xnb);
        x.e();
        x.d();
        C5582adb build = x.build();
        if (build != null) {
            return (C7684xdb) build;
        }
        C7471uYa.a();
        throw null;
    }

    private final boolean c(C7684xdb xdb) {
        boolean z;
        C7684xdb a = a(xdb);
        if (a == null) {
            return false;
        }
        C7694xnb name = xdb.getName();
        C7471uYa.a((Object) name, "name");
        Set<C7684xdb> a2 = a(name);
        if ((a2 instanceof Collection) && a2.isEmpty()) {
            return false;
        }
        for (C7684xdb xdb2 : a2) {
            if (!xdb2.s() || !a((C4904Fcb) a, (C4904Fcb) xdb2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final C7684xdb d(C7408tdb tdb, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        C7684xdb xdb;
        C7694xnb b = C7694xnb.b(C6589hgb.d(tdb.getName().a()));
        C7471uYa.a((Object) b, "Name.identifier(JvmAbi.s…terName(name.asString()))");
        Iterator it = ((Iterable) _xa.invoke(b)).iterator();
        do {
            xdb = null;
            if (!it.hasNext()) {
                break;
            }
            C7684xdb xdb2 = (C7684xdb) it.next();
            if (xdb2.f().size() == 1) {
                C7706xtb a = xdb2.a();
                if (a != null && C5301Sbb.w(a)) {
                    C6745jub jub = C6745jub.a;
                    List f = xdb2.f();
                    C7471uYa.a((Object) f, "descriptor.valueParameters");
                    Object j2 = C7676xWa.j(f);
                    C7471uYa.a(j2, "descriptor.valueParameters.single()");
                    if (jub.a(((C5061Kdb) j2).getType(), tdb.getType())) {
                        xdb = xdb2;
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } while (xdb == null);
        return xdb;
    }

    private final void b(C7694xnb xnb, Collection<C7408tdb> collection) {
        Uib uib = (Uib) C7676xWa.n(((C7205qhb) e().d()).a(xnb));
        if (uib != null) {
            collection.add(a(this, uib, (C7706xtb) null, C6314ddb.FINAL, 2, (Object) null));
        }
    }

    private final boolean a(C7684xdb xdb, C5582adb adb) {
        if (Mfb.f.c(xdb)) {
            adb = adb.getOriginal();
        }
        C7471uYa.a((Object) adb, "if (superDescriptor.isRe…iginal else subDescriptor");
        return a((C4904Fcb) adb, (C4904Fcb) xdb);
    }

    private final Set<C7408tdb> b(C7694xnb xnb) {
        Ptb Q = g().Q();
        C7471uYa.a((Object) Q, "ownerDescriptor.typeConstructor");
        Collection<C7706xtb> b = Q.b();
        C7471uYa.a((Object) b, "ownerDescriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (C7706xtb ha : b) {
            Collection<C7408tdb> c = ha.ha().c(xnb, Ffb.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) c, 10));
            for (C7408tdb add : c) {
                arrayList2.add(add);
            }
            C7331sWa.a((Collection) arrayList, (Iterable) arrayList2);
        }
        return C7676xWa.t(arrayList);
    }

    private final C7684xdb c(C7408tdb tdb, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        C7477udb b = tdb.b();
        String str = null;
        C4935Gcb gcb = b != null ? (C7477udb) C7135pgb.c(b) : null;
        if (gcb != null) {
            str = Rfb.e.a(gcb);
        }
        if (str != null && !C7135pgb.a(g(), (C4904Fcb) gcb)) {
            return a(tdb, str, _xa);
        }
        String a = C6589hgb.a(tdb.getName().a());
        C7471uYa.a((Object) a, "JvmAbi.getterName(name.asString())");
        return a(tdb, a, _xa);
    }

    private final boolean a(C4904Fcb fcb, C4904Fcb fcb2) {
        a a = C7629wpb.b.a(fcb2, fcb, true);
        C7471uYa.a((Object) a, "OverridingUtil.DEFAULT.i…erDescriptor, this, true)");
        C0186a a2 = a.a();
        C7471uYa.a((Object) a2, "OverridingUtil.DEFAULT.i…iptor, this, true).result");
        if (a2 != C0186a.OVERRIDABLE || C5721cgb.a.a(fcb2, fcb)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> d(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        if (this.o.m()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((C7205qhb) e().d()).b());
        Ptb Q = g().Q();
        C7471uYa.a((Object) Q, "ownerDescriptor.typeConstructor");
        Collection<C7706xtb> b = Q.b();
        C7471uYa.a((Object) b, "ownerDescriptor.typeConstructor.supertypes");
        for (C7706xtb ha : b) {
            C7331sWa.a((Collection) linkedHashSet, (Iterable) ha.ha().b());
        }
        return linkedHashSet;
    }

    private final C7684xdb a(C7408tdb tdb, String str, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        C7684xdb xdb;
        C7694xnb b = C7694xnb.b(str);
        C7471uYa.a((Object) b, "Name.identifier(getterName)");
        Iterator it = ((Iterable) _xa.invoke(b)).iterator();
        do {
            xdb = null;
            if (!it.hasNext()) {
                break;
            }
            C7684xdb xdb2 = (C7684xdb) it.next();
            if (xdb2.f().size() == 0) {
                C6745jub jub = C6745jub.a;
                C7706xtb a = xdb2.a();
                if (a != null ? jub.b(a, tdb.getType()) : false) {
                    xdb = xdb2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (xdb == null);
        return xdb;
    }

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        d(xnb, dfb);
        return super.c(xnb, dfb);
    }

    /* access modifiers changed from: protected */
    public void a(Collection<C7684xdb> collection, C7694xnb xnb) {
        boolean z;
        C7471uYa.b(collection, "result");
        C7471uYa.b(xnb, "name");
        Set a = a(xnb);
        if (!Mfb.f.b(xnb) && !Nfb.h.a(xnb)) {
            if (!(a instanceof Collection) || !a.isEmpty()) {
                Iterator it = a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C5582adb) it.next()).s()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object next : a) {
                    if (d((C7684xdb) next)) {
                        arrayList.add(next);
                    }
                }
                a(collection, xnb, (Collection<? extends C7684xdb>) arrayList, false);
                return;
            }
        }
        Gvb a2 = Gvb.b.a();
        Collection a3 = C7411tgb.a(xnb, a, C6918mWa.a(), g(), C7357srb.a);
        C7471uYa.a((Object) a3, "resolveOverridesForNonSt…rter.DO_NOTHING\n        )");
        a(xnb, collection, a3, collection, new Chb(this));
        a(xnb, collection, a3, a2, new Dhb(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : a) {
            if (d((C7684xdb) next2)) {
                arrayList2.add(next2);
            }
        }
        a(collection, xnb, (Collection<? extends C7684xdb>) C7676xWa.c((Collection) arrayList2, (Iterable) a2), true);
    }

    public void d(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        Bfb.a(d().a().i(), dfb, g(), xnb);
    }

    private final boolean b(C7684xdb xdb, C5582adb adb) {
        String a = Hkb.a(xdb, false, false, 2, null);
        C5582adb original = adb.getOriginal();
        C7471uYa.a((Object) original, "builtinWithErasedParameters.original");
        if (!C7471uYa.a((Object) a, (Object) Hkb.a(original, false, false, 2, null)) || a((C4904Fcb) xdb, (C4904Fcb) adb)) {
            return false;
        }
        return true;
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        d(xnb, dfb);
        return (C5122Mcb) this.m.invoke(xnb);
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> b(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        return TWa.b((Set) this.k.d(), (Iterable) ((Map) this.l.d()).keySet());
    }

    private final void a(Collection<C7684xdb> collection, C7694xnb xnb, Collection<? extends C7684xdb> collection2, boolean z) {
        Collection<C7684xdb> a = C7411tgb.a(xnb, collection2, collection, g(), d().a().c());
        C7471uYa.a((Object) a, "resolveOverridesForNonSt…s.errorReporter\n        )");
        if (!z) {
            collection.addAll(a);
            return;
        }
        List c = C7676xWa.c((Collection) collection, (Iterable) a);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a, 10));
        for (C7684xdb xdb : a) {
            C7684xdb xdb2 = (C7684xdb) C7135pgb.d(xdb);
            if (xdb2 != null) {
                C7471uYa.a((Object) xdb, "resolvedOverride");
                xdb = a(xdb, (C4904Fcb) xdb2, (Collection<? extends C7684xdb>) c);
            }
            arrayList.add(xdb);
        }
        collection.addAll(arrayList);
    }

    private final void a(C7694xnb xnb, Collection<? extends C7684xdb> collection, Collection<? extends C7684xdb> collection2, Collection<C7684xdb> collection3, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        for (C7684xdb xdb : collection2) {
            C7089ovb.a(collection3, a(xdb, _xa, xnb, collection));
            C7089ovb.a(collection3, a(xdb, _xa, collection));
            C7089ovb.a(collection3, a(xdb, _xa));
        }
    }

    private final C7684xdb a(C7684xdb xdb, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa, Collection<? extends C7684xdb> collection) {
        C5582adb a = Nfb.a((C5582adb) xdb);
        if (a == null) {
            return null;
        }
        C7684xdb a2 = a(a, _xa);
        if (a2 == null) {
            return null;
        }
        if (!d(a2)) {
            a2 = null;
        }
        if (a2 != null) {
            return a(a2, (C4904Fcb) a, collection);
        }
        return null;
    }

    private final C7684xdb a(C7684xdb xdb, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa, C7694xnb xnb, Collection<? extends C7684xdb> collection) {
        C7684xdb xdb2 = (C7684xdb) C7135pgb.c(xdb);
        if (xdb2 == null) {
            return null;
        }
        String b = C7135pgb.b(xdb2);
        if (b != null) {
            C7694xnb b2 = C7694xnb.b(b);
            C7471uYa.a((Object) b2, "Name.identifier(nameInJava)");
            for (C7684xdb a : (Collection) _xa.invoke(b2)) {
                C7684xdb a2 = a(a, xnb);
                if (a(xdb2, (C5582adb) a2)) {
                    return a(a2, (C4904Fcb) xdb2, collection);
                }
            }
            return null;
        }
        C7471uYa.a();
        throw null;
    }

    private final C7684xdb a(C7684xdb xdb, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        C7684xdb xdb2;
        if (!xdb.s()) {
            return null;
        }
        C7694xnb name = xdb.getName();
        C7471uYa.a((Object) name, "descriptor.name");
        Iterator it = ((Iterable) _xa.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                xdb2 = null;
                break;
            }
            xdb2 = a((C7684xdb) it.next());
            if (xdb2 == null || !a((C4904Fcb) xdb2, (C4904Fcb) xdb)) {
                xdb2 = null;
                continue;
            }
            if (xdb2 != null) {
                break;
            }
        }
        return xdb2;
    }

    private final C7684xdb a(C5582adb adb, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        Object obj;
        C7694xnb name = adb.getName();
        C7471uYa.a((Object) name, "overridden.name");
        Iterator it = ((Iterable) _xa.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (b((C7684xdb) obj, adb)) {
                break;
            }
        }
        C7684xdb xdb = (C7684xdb) obj;
        if (xdb == null) {
            return null;
        }
        a x = xdb.x();
        List<C5061Kdb> f = adb.f();
        C7471uYa.a((Object) f, "overridden.valueParameters");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) f, 10));
        for (C5061Kdb kdb : f) {
            C7471uYa.a((Object) kdb, "it");
            C7706xtb type = kdb.getType();
            C7471uYa.a((Object) type, "it.type");
            arrayList.add(new Wgb(type, kdb.ea()));
        }
        List f2 = xdb.f();
        C7471uYa.a((Object) f2, "override.valueParameters");
        x.a(Vgb.a(arrayList, f2, adb));
        x.e();
        x.d();
        return (C7684xdb) x.build();
    }

    private final Set<C7684xdb> a(C7694xnb xnb) {
        Ptb Q = g().Q();
        C7471uYa.a((Object) Q, "ownerDescriptor.typeConstructor");
        Collection<C7706xtb> b = Q.b();
        C7471uYa.a((Object) b, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C7706xtb ha : b) {
            C7331sWa.a((Collection) linkedHashSet, (Iterable) ha.ha().a(xnb, Ffb.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public void a(C7694xnb xnb, Collection<C7408tdb> collection) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(collection, "result");
        if (this.o.m()) {
            b(xnb, collection);
        }
        Set b = b(xnb);
        if (!b.isEmpty()) {
            Gvb a = Gvb.b.a();
            a(b, collection, (_Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>>) new Ehb<Object,Object>(this));
            a(b, (Collection<C7408tdb>) a, (_Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>>) new Fhb<Object,Object>(this));
            Collection a2 = C7411tgb.a(xnb, TWa.b(b, (Iterable) a), collection, g(), d().a().c());
            C7471uYa.a((Object) a2, "resolveOverridesForNonSt…rorReporter\n            )");
            collection.addAll(a2);
        }
    }

    private final void a(Set<? extends C7408tdb> set, Collection<C7408tdb> collection, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        for (C7408tdb a : set) {
            Sgb a2 = a(a, _xa);
            if (a2 != null) {
                collection.add(a2);
                return;
            }
        }
    }

    static /* synthetic */ Sgb a(Mhb mhb, Uib uib, C7706xtb xtb, C6314ddb ddb, int i, Object obj) {
        if ((i & 2) != 0) {
            xtb = null;
        }
        return mhb.a(uib, xtb, ddb);
    }

    private final Sgb a(Uib uib, C7706xtb xtb, C6314ddb ddb) {
        C7706xtb xtb2;
        Uib uib2 = uib;
        Sgb a = Sgb.a(g(), C6386ehb.a(d(), uib2), ddb, uib.d(), false, uib.getName(), d().a().q().a(uib2), false);
        C7471uYa.a((Object) a, "JavaPropertyDescriptor.c…inal = */ false\n        )");
        C7134pfb a2 = C6463fpb.a((C7408tdb) a, C6723jeb.c.a());
        C7471uYa.a((Object) a2, "DescriptorFactory.create…iptor, Annotations.EMPTY)");
        a.a(a2, (C7546vdb) null);
        if (xtb != null) {
            xtb2 = xtb;
        } else {
            xtb2 = a(uib2, Zgb.a(d(), (C5272Rcb) a, (C5588ajb) uib, 0, 4, (Object) null));
        }
        a.a(xtb2, C6918mWa.a(), f(), (C7615wdb) null);
        a2.a(xtb2);
        return a;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [vdb] */
    /* JADX WARNING: type inference failed for: r1v5, types: [nfb, qfb] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [ddb] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ddb, qfb]
  uses: [vdb, java.lang.Object, nfb]
  mth insns count: 107
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    private final Sgb a(C7408tdb tdb, _Xa<? super C7694xnb, ? extends Collection<? extends C7684xdb>> _xa) {
        C5582adb adb;
        ? r1 = 0;
        if (!b(tdb, _xa)) {
            return null;
        }
        C7684xdb c = c(tdb, _xa);
        if (c != null) {
            if (tdb.V()) {
                adb = d(tdb, _xa);
                if (adb == null) {
                    C7471uYa.a();
                    throw null;
                }
            } else {
                adb = null;
            }
            boolean z = adb == null || adb.h() == c.h();
            if (!TVa.a || z) {
                C7408tdb tdb2 = tdb;
                Sgb a = Sgb.a(g(), C6723jeb.c.a(), c.h(), c.d(), adb != null, tdb.getName(), c.getSource(), false);
                C7471uYa.a((Object) a, "JavaPropertyDescriptor.c…inal = */ false\n        )");
                C7706xtb a2 = c.a();
                if (a2 != null) {
                    a.a(a2, C6918mWa.a(), f(), (C7615wdb) null);
                    C7134pfb a3 = C6463fpb.a(a, c.getAnnotations(), false, false, false, c.getSource());
                    a3.a((C5582adb) c);
                    a3.a(a.getType());
                    C7471uYa.a((Object) a3, "DescriptorFactory.create…escriptor.type)\n        }");
                    if (adb != null) {
                        List f = adb.f();
                        C7471uYa.a((Object) f, "setterMethod.valueParameters");
                        C5061Kdb kdb = (C5061Kdb) C7676xWa.g(f);
                        if (kdb != null) {
                            ? a4 = C6463fpb.a(a, adb.getAnnotations(), kdb.getAnnotations(), false, false, false, adb.d(), adb.getSource());
                            a4.a(adb);
                            r1 = a4;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("No parameter found for ");
                            sb.append(adb);
                            throw new AssertionError(sb.toString());
                        }
                    }
                    a.a(a3, (C7546vdb) r1);
                    return a;
                }
                C7471uYa.a();
                throw null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Different accessors modalities when creating overrides for ");
            sb2.append(tdb);
            sb2.append(" in ");
            sb2.append(g());
            sb2.append("for getter is ");
            sb2.append(c.h());
            sb2.append(", but for setter is ");
            if (adb != null) {
                r1 = adb.h();
            }
            sb2.append(r1);
            throw new AssertionError(sb2.toString());
        }
        C7471uYa.a();
        throw null;
    }

    /* access modifiers changed from: protected */
    public a a(Uib uib, List<? extends C4905Fdb> list, C7706xtb xtb, List<? extends C5061Kdb> list2) {
        C7471uYa.b(uib, "method");
        C7471uYa.b(list, "methodTypeParameters");
        C7471uYa.b(xtb, "returnType");
        C7471uYa.b(list2, "valueParameters");
        a a = d().a().p().a(uib, g(), xtb, null, list2, list);
        C7471uYa.a((Object) a, "c.components.signaturePr…dTypeParameters\n        )");
        C7706xtb c = a.c();
        C7471uYa.a((Object) c, "propagated.returnType");
        C7706xtb b = a.b();
        List e = a.e();
        C7471uYa.a((Object) e, "propagated.valueParameters");
        List d = a.d();
        C7471uYa.a((Object) d, "propagated.typeParameters");
        boolean f = a.f();
        List a2 = a.a();
        C7471uYa.a((Object) a2, "propagated.errors");
        a aVar = new a(c, b, e, d, f, a2);
        return aVar;
    }

    /* access modifiers changed from: private */
    public final Ogb a(Oib oib) {
        C5029Jcb g = g();
        Ogb b = Ogb.b(g, C6386ehb.a(d(), oib), false, d().a().q().a(oib));
        C7471uYa.a((Object) b, "JavaClassConstructorDesc…ce(constructor)\n        )");
        C6590hhb a = Zgb.a(d(), (C5272Rcb) b, (C5588ajb) oib, g.B().size());
        b a2 = a(a, (C5582adb) b, oib.f());
        List B = g.B();
        C7471uYa.a((Object) B, "classDescriptor.declaredTypeParameters");
        List<_ib> typeParameters = oib.getTypeParameters();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) typeParameters, 10));
        for (_ib a3 : typeParameters) {
            C4905Fdb a4 = a.f().a(a3);
            if (a4 != null) {
                arrayList.add(a4);
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        b.a(a2.a(), oib.d(), C7676xWa.c((Collection) B, (Iterable) arrayList));
        b.d(false);
        b.e(a2.b());
        b.a((C7706xtb) g.z());
        a.a().g().a((Pib) oib, (C5242Qcb) b);
        return b;
    }

    private final C5583aeb a(C5029Jcb jcb) {
        C5583aeb d = jcb.d();
        C7471uYa.a((Object) d, "classDescriptor.visibility");
        if (!C7471uYa.a((Object) d, (Object) C6521ggb.b)) {
            return d;
        }
        C5583aeb aeb = C6521ggb.c;
        C7471uYa.a((Object) aeb, "JavaVisibilities.PROTECTED_AND_PACKAGE");
        return aeb;
    }

    private final List<C5061Kdb> a(Leb leb) {
        HVa hVa;
        Collection s = this.o.s();
        ArrayList arrayList = new ArrayList(s.size());
        C6931mib a = C7482uib.a(Lgb.COMMON, true, (C4905Fdb) null, 2, (Object) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : s) {
            if (C7471uYa.a((Object) ((Uib) next).getName(), (Object) C6657igb.c)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        HVa hVa2 = new HVa(arrayList2, arrayList3);
        List list = (List) hVa2.a();
        List<Uib> list2 = (List) hVa2.b();
        int i = 0;
        boolean z = list.size() <= 1;
        if (!TVa.a || z) {
            Uib uib = (Uib) C7676xWa.g(list);
            if (uib != null) {
                Zib a2 = uib.a();
                if (a2 instanceof Jib) {
                    Jib jib = (Jib) a2;
                    hVa = new HVa(d().g().a(jib, a, true), d().g().a(jib.a(), a));
                } else {
                    hVa = new HVa(d().g().a(a2, a), null);
                }
                a((List<C5061Kdb>) arrayList, (C5242Qcb) leb, 0, uib, (C7706xtb) hVa.a(), (C7706xtb) hVa.b());
            }
            int i2 = uib != null ? 1 : 0;
            for (Uib uib2 : list2) {
                a((List<C5061Kdb>) arrayList, (C5242Qcb) leb, i + i2, uib2, d().g().a(uib2.a(), a), (C7706xtb) null);
                i++;
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("There can't be more than one method named 'value' in annotation class: ");
        sb.append(this.o);
        throw new AssertionError(sb.toString());
    }

    private final void a(List<C5061Kdb> list, C5242Qcb qcb, int i, Uib uib, C7706xtb xtb, C7706xtb xtb2) {
        C6723jeb a = C6723jeb.c.a();
        C7694xnb name = uib.getName();
        C7706xtb i2 = C5605aub.i(xtb);
        C7471uYa.a((Object) i2, "TypeUtils.makeNotNullable(returnType)");
        C7755yfb yfb = new C7755yfb(qcb, null, i, a, name, i2, uib.v(), false, false, xtb2 != null ? C5605aub.i(xtb2) : null, d().a().q().a(uib));
        List<C5061Kdb> list2 = list;
        list.add(yfb);
    }

    public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        d(xnb, dfb);
        return super.a(xnb, dfb);
    }

    private final C7684xdb a(C7684xdb xdb, C4904Fcb fcb, Collection<? extends C7684xdb> collection) {
        boolean z;
        boolean z2 = true;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7684xdb xdb2 = (C7684xdb) it.next();
                if (!(!C7471uYa.a((Object) xdb, (Object) xdb2)) || xdb2.u() != null || !a((C4904Fcb) xdb2, fcb)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return xdb;
        }
        C5582adb build = xdb.x().c().build();
        if (build != null) {
            return (C7684xdb) build;
        }
        C7471uYa.a();
        throw null;
    }
}
