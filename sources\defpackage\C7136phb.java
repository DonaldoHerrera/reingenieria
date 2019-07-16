package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: phb reason: default package and case insensitive filesystem */
/* compiled from: DeclaredMemberIndex.kt */
public class C7136phb implements C7205qhb {
    private final _Xa<Uib, Boolean> a = new C7067ohb(this);
    private final Map<C7694xnb, List<Uib>> b;
    private final Map<C7694xnb, Rib> c;
    private final Kib d;
    /* access modifiers changed from: private */
    public final _Xa<Tib, Boolean> e;

    public C7136phb(Kib kib, _Xa<? super Tib, Boolean> _xa) {
        C7471uYa.b(kib, "jClass");
        C7471uYa.b(_xa, "memberFilter");
        this.d = kib;
        this.e = _xa;
        Iwb a2 = Ywb.a(C7676xWa.d(this.d.s()), this.a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : a2) {
            C7694xnb name = ((Uib) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.b = linkedHashMap;
        Iwb a3 = Ywb.a(C7676xWa.d(this.d.p()), this.e);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object next2 : a3) {
            linkedHashMap2.put(((Rib) next2).getName(), next2);
        }
        this.c = linkedHashMap2;
    }

    public Rib b(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return (Rib) this.c.get(xnb);
    }

    public Collection<Uib> a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        List list = (List) this.b.get(xnb);
        return list != null ? list : C6918mWa.a();
    }

    public Set<C7694xnb> b() {
        Iwb<Rib> a2 = Ywb.a(C7676xWa.d(this.d.p()), this.e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Rib name : a2) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public Set<C7694xnb> a() {
        Iwb<Uib> a2 = Ywb.a(C7676xWa.d(this.d.s()), this.a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Uib name : a2) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }
}
