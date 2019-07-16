package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: Fqb reason: default package */
/* compiled from: MemberScopeImpl.kt */
public abstract class Fqb implements Eqb {
    public Collection<? extends C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return C6918mWa.a();
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return null;
    }

    public Set<C7694xnb> b() {
        Collection a = a(C7700xqb.t, C7779yvb.a());
        ArrayList<C5123Mdb> arrayList = new ArrayList<>();
        for (Object next : a) {
            if (next instanceof C5123Mdb) {
                arrayList.add(next);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C5123Mdb name : arrayList) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public Collection<? extends C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return C6918mWa.a();
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        return C6918mWa.a();
    }

    public Set<C7694xnb> a() {
        Collection a = a(C7700xqb.s, C7779yvb.a());
        ArrayList<C7684xdb> arrayList = new ArrayList<>();
        for (Object next : a) {
            if (next instanceof C7684xdb) {
                arrayList.add(next);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C7684xdb name : arrayList) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }
}
