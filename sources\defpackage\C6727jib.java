package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jib reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaStaticClassScope.kt */
public final class C6727jib extends C6795kib {
    private final Kib j;
    private final C7757yhb k;

    public C6727jib(C6590hhb hhb, Kib kib, C7757yhb yhb) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(kib, "jClass");
        C7471uYa.b(yhb, "ownerDescriptor");
        super(hhb);
        this.j = kib;
        this.k = yhb;
    }

    /* access modifiers changed from: protected */
    public void a(Collection<C7684xdb> collection, C7694xnb xnb) {
        C7471uYa.b(collection, "result");
        C7471uYa.b(xnb, "name");
        Collection b = C7411tgb.b(xnb, a(xnb, (C5029Jcb) g()), collection, g(), d().a().c());
        C7471uYa.a((Object) b, "resolveOverridesForStati…components.errorReporter)");
        collection.addAll(b);
        if (!this.j.o()) {
            return;
        }
        if (C7471uYa.a((Object) xnb, (Object) C6531gpb.b)) {
            C7684xdb a = C6463fpb.a((C5029Jcb) g());
            C7471uYa.a((Object) a, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(a);
        } else if (C7471uYa.a((Object) xnb, (Object) C6531gpb.a)) {
            C7684xdb b2 = C6463fpb.b((C5029Jcb) g());
            C7471uYa.a((Object) b2, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(b2);
        }
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return null;
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> b(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        return SWa.a();
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> d(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        Set<C7694xnb> s = C7676xWa.s(((C7205qhb) e().d()).b());
        a(g(), s, C6455fib.a);
        return s;
    }

    /* access modifiers changed from: protected */
    public C7136phb c() {
        return new C7136phb(this.j, C6319dib.a);
    }

    /* access modifiers changed from: protected */
    public C7757yhb g() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> c(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        Set<C7694xnb> s = C7676xWa.s(((C7205qhb) e().d()).a());
        C6727jib a = Vgb.a((C5029Jcb) g());
        Set a2 = a != null ? a.a() : null;
        if (a2 == null) {
            a2 = SWa.a();
        }
        s.addAll(a2);
        if (this.j.o()) {
            s.addAll(C6918mWa.b((T[]) new C7694xnb[]{C6531gpb.b, C6531gpb.a}));
        }
        return s;
    }

    /* access modifiers changed from: protected */
    public void a(C7694xnb xnb, Collection<C7408tdb> collection) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(collection, "result");
        C7757yhb g = g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a(g, linkedHashSet, new C6387eib(xnb));
        if (!collection.isEmpty()) {
            Collection b = C7411tgb.b(xnb, linkedHashSet, collection, g(), d().a().c());
            C7471uYa.a((Object) b, "resolveOverridesForStati…rorReporter\n            )");
            collection.addAll(b);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : linkedHashSet) {
            C7408tdb a = a((C7408tdb) next);
            Object obj = linkedHashMap.get(a);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Entry value : linkedHashMap.entrySet()) {
            C7331sWa.a((Collection) arrayList, (Iterable) C7411tgb.b(xnb, (Collection) value.getValue(), collection, g(), d().a().c()));
        }
        collection.addAll(arrayList);
    }

    private final Set<C7684xdb> a(C7694xnb xnb, C5029Jcb jcb) {
        C6727jib a = Vgb.a(jcb);
        if (a != null) {
            return C7676xWa.t(a.a(xnb, (Dfb) Ffb.WHEN_GET_SUPER_MEMBERS));
        }
        return SWa.a();
    }

    private final <R> Set<R> a(C5029Jcb jcb, Set<R> set, _Xa<? super Eqb, ? extends Collection<? extends R>> _xa) {
        C7227qvb.a((Collection<N>) C6850lWa.a(jcb), (b<N>) C6591hib.a, (c<N, R>) new C6659iib<N,R>(jcb, set, _xa));
        return set;
    }

    private final C7408tdb a(C7408tdb tdb) {
        a g = tdb.g();
        C7471uYa.a((Object) g, "this.kind");
        if (g.a()) {
            return tdb;
        }
        Collection<C7408tdb> j2 = tdb.j();
        C7471uYa.a((Object) j2, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) j2, 10));
        for (C7408tdb tdb2 : j2) {
            C7471uYa.a((Object) tdb2, "it");
            arrayList.add(a(tdb2));
        }
        return (C7408tdb) C7676xWa.j(C7676xWa.e(arrayList));
    }
}
