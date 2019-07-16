package com.soundcloud.android.offline;

import com.google.common.base.Function;
import com.soundcloud.android.collections.data.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.soundcloud.android.offline.ie reason: case insensitive filesystem */
/* compiled from: OfflineStateOperations */
public class C4106ie {
    private final K a;
    private final Gd b;
    private final De c;
    private final C6332dsa d;
    private final C5421Wpa e;
    private final HPa f;

    C4106ie(K k, Gd gd, De de, C6332dsa dsa, C5421Wpa wpa, HPa hPa) {
        this.a = k;
        this.b = gd;
        this.c = de;
        this.d = dsa;
        this.e = wpa;
        this.f = hPa;
    }

    private IPa<Map<C3823mda, Collection<C3508cda>>> d(Collection<C3508cda> collection) {
        return a(e(collection));
    }

    private IPa<List<C3508cda>> e(Collection<C3508cda> collection) {
        return this.d.c(collection).a((MPa<U>) this.b.b(), (C6504gQa<? super T, ? super U, ? extends R>) Ta.a);
    }

    /* access modifiers changed from: 0000 */
    public IPa<Map<C3823mda, ze>> a(Collection<C3508cda> collection, C3823mda mda) {
        int i = C4100he.a[mda.ordinal()];
        if (i == 1 || i == 2) {
            return b(collection, mda);
        }
        if (i == 3 || i == 4 || i == 5) {
            return c(collection);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown state: ");
        sb.append(mda);
        throw new IllegalStateException(sb.toString());
    }

    public IPa<C3823mda> b() {
        return this.b.c().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Na<Object,Object>(this)).b(this.f);
    }

    public /* synthetic */ MPa c(Boolean bool) throws Exception {
        return bool.booleanValue() ? d().e(new Ka(this)) : IPa.a(C3823mda.NOT_OFFLINE);
    }

    private IPa<Map<C3823mda, ze>> c(Collection<C3508cda> collection) {
        return IPa.a((MPa<? extends T1>) d(collection), (MPa<? extends T2>) a(collection), (MPa<? extends T3>) a(), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new Ma<Object,Object,Object,Object>(this));
    }

    private IPa<Collection<C3823mda>> d() {
        return this.a.a().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Ja<Object,Object>(this)).e(C4061bb.a);
    }

    /* access modifiers changed from: 0000 */
    public IPa<Map<C3823mda, Collection<C3508cda>>> c(List<C3508cda> list) {
        return a(IPa.a(list));
    }

    private IPa<Map<C3823mda, ze>> b(Collection<C3508cda> collection, C3823mda mda) {
        return IPa.a((MPa<? extends T1>) e(collection), (MPa<? extends T2>) this.b.c(), (MPa<? extends T3>) a(collection), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new Oa<Object,Object,Object,Object>(this)).a((C7256rQa<? super T>) new Pa<Object>(this)).f(new Sa(mda)).d(Collections.emptyMap());
    }

    private <KEY, VALUE> Map<KEY, VALUE> c() {
        return new HashMap();
    }

    /* access modifiers changed from: private */
    public Map<C3823mda, ze> a(Map<C3823mda, Collection<C3508cda>> map, Boolean bool, C3823mda mda) {
        C3823mda[] values;
        Collection collection;
        Map<C3823mda, ze> c2 = c();
        for (C3823mda mda2 : C3823mda.values()) {
            boolean z = bool.booleanValue() && mda2.equals(mda);
            if (map.containsKey(mda2)) {
                collection = (Collection) map.get(mda2);
            } else {
                collection = Collections.emptyList();
            }
            ze a2 = a(z, collection);
            if (a(a2)) {
                c2.put(mda2, a2);
            }
        }
        return c2;
    }

    public /* synthetic */ MPa b(Boolean bool) throws Exception {
        return d().e(new Ka(this));
    }

    public /* synthetic */ MPa b(List list) throws Exception {
        return this.c.a((Collection<C3508cda>) C2063HD.a(list, (Function<? super F, ? extends T>) C4133nb.a));
    }

    /* access modifiers changed from: private */
    public C3823mda b(Collection<C3823mda> collection) {
        return C3831nda.a(collection.contains(C3823mda.REQUESTED), collection.contains(C3823mda.DOWNLOADED), collection.contains(C3823mda.UNAVAILABLE));
    }

    public /* synthetic */ ze a(List list, Boolean bool, Boolean bool2) throws Exception {
        return a(bool.booleanValue() && bool2.booleanValue(), (Collection<C3508cda>) list);
    }

    static /* synthetic */ List a(Set set, List list) throws Exception {
        ArrayList arrayList = new ArrayList(set);
        arrayList.retainAll(list);
        return arrayList;
    }

    /* access modifiers changed from: private */
    public boolean a(ze zeVar) {
        return zeVar != ze.a;
    }

    private ze a(boolean z, Collection<C3508cda> collection) {
        if (z || !collection.isEmpty()) {
            return ze.a(collection, z);
        }
        return ze.a;
    }

    private IPa<Map<C3823mda, Collection<C3508cda>>> a(IPa<List<C3508cda>> iPa) {
        return iPa.d((C7118pQa<? super T, ? extends EPa<? extends R>>) Za.a).g(new Ia(this)).b(c(), (C6504gQa<R, ? super T, R>) new Ra<R,Object,R>(this)).j();
    }

    public /* synthetic */ Map a(Map map, C7664xKa xka) throws Exception {
        a(map, (C3823mda) xka.b()).add(xka.a());
        return map;
    }

    private Collection<C3508cda> a(Map<C3823mda, Collection<C3508cda>> map, C3823mda mda) {
        if (map.containsKey(mda)) {
            return (Collection) map.get(mda);
        }
        ArrayList arrayList = new ArrayList();
        map.put(mda, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public IPa<C3823mda> a() {
        return this.b.c().a((C7256rQa<? super T>) Ga.a).e(new Ha(this)).d(C3823mda.NOT_OFFLINE);
    }

    /* access modifiers changed from: private */
    public IPa<C7664xKa<C3508cda, C3823mda>> a(C3508cda cda) {
        IPa c2 = this.e.c(cda);
        De de = this.c;
        de.getClass();
        return c2.a((C7118pQa<? super T, ? extends MPa<? extends R>>) new _a<Object,Object>(de)).e(C4061bb.a).e(new Ka(this)).e(new La(cda));
    }

    private IPa<Boolean> a(Collection<C3508cda> collection) {
        boolean isEmpty = collection.isEmpty();
        Boolean valueOf = Boolean.valueOf(false);
        if (isEmpty) {
            return IPa.a(valueOf);
        }
        return this.a.a().a((C7256rQa<? super T>) Fa.a).f(new Qa(collection)).d(valueOf);
    }

    static /* synthetic */ boolean a(List list) throws Exception {
        return !list.isEmpty();
    }
}
