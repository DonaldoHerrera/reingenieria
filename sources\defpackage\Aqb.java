package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: Aqb reason: default package */
/* compiled from: GivenFunctionsMemberScope.kt */
public abstract class Aqb extends Fqb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(Aqb.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    private final Psb b;
    private final C5029Jcb c;

    public Aqb(Ssb ssb, C5029Jcb jcb) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(jcb, "containingClass");
        this.c = jcb;
        this.b = ssb.a((PXa<? extends T>) new C7769yqb<Object>(this));
    }

    private final List<C5272Rcb> e() {
        return (List) Rsb.a(this.b, (Object) this, a[0]);
    }

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        List e = e();
        ArrayList arrayList = new ArrayList();
        for (Object next : e) {
            if (next instanceof C7408tdb) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (C7471uYa.a((Object) ((C7408tdb) next2).getName(), (Object) xnb)) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public abstract List<C5582adb> c();

    /* access modifiers changed from: protected */
    public final C5029Jcb d() {
        return this.c;
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        if (!xqb.a(C7700xqb.m.k())) {
            return C6918mWa.a();
        }
        return e();
    }

    public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        List e = e();
        ArrayList arrayList = new ArrayList();
        for (Object next : e) {
            if (next instanceof C7684xdb) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (C7471uYa.a((Object) ((C7684xdb) next2).getName(), (Object) xnb)) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public final List<C5272Rcb> a(List<? extends C5582adb> list) {
        Collection collection;
        ArrayList arrayList = new ArrayList(3);
        Ptb Q = this.c.Q();
        C7471uYa.a((Object) Q, "containingClass.typeConstructor");
        Collection<C7706xtb> b2 = Q.b();
        C7471uYa.a((Object) b2, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (C7706xtb ha : b2) {
            C7331sWa.a((Collection) arrayList2, (Iterable) a.a(ha.ha(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (next instanceof C4935Gcb) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList3) {
            C7694xnb name = ((C4935Gcb) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            C7694xnb xnb = (C7694xnb) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : list2) {
                Boolean valueOf = Boolean.valueOf(((C4935Gcb) next3) instanceof C5582adb);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                if (booleanValue) {
                    collection = new ArrayList();
                    for (Object next4 : list) {
                        if (C7471uYa.a((Object) ((C5582adb) next4).getName(), (Object) xnb)) {
                            collection.add(next4);
                        }
                    }
                } else {
                    collection = C6918mWa.a();
                }
                C7629wpb.a(xnb, list3, collection, this.c, new C7838zqb(this, arrayList));
            }
        }
        return C7089ovb.a(arrayList);
    }
}
