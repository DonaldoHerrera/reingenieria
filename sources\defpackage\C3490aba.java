package defpackage;

import java.util.Set;

/* renamed from: aba reason: default package and case insensitive filesystem */
/* compiled from: UrnStateChangedEvent */
public abstract class C3490aba {

    /* renamed from: aba$a */
    /* compiled from: UrnStateChangedEvent */
    public enum a {
        ENTITY_CREATED,
        ENTITY_DELETED,
        STATIONS_COLLECTION_UPDATED
    }

    public boolean a() {
        if (d() != a.ENTITY_CREATED) {
            return false;
        }
        for (C3508cda u : e()) {
            if (u.u()) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        if (d() != a.ENTITY_DELETED) {
            return false;
        }
        for (C3508cda u : e()) {
            if (u.u()) {
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        for (C3508cda u : e()) {
            if (u.u()) {
                return true;
            }
        }
        return false;
    }

    public abstract a d();

    public abstract Set<C3508cda> e();

    public static C3490aba c(C3508cda cda) {
        return new C3820maa(a.STATIONS_COLLECTION_UPDATED, C2458bE.a((E[]) new C3508cda[]{cda}));
    }

    public static C3490aba a(C3508cda cda) {
        return new C3820maa(a.ENTITY_CREATED, C2458bE.a((E[]) new C3508cda[]{cda}));
    }

    public static C3490aba b(C3508cda cda) {
        return new C3820maa(a.ENTITY_DELETED, C2458bE.a((E[]) new C3508cda[]{cda}));
    }

    public static C3490aba a(Set<C3508cda> set) {
        return new C3820maa(a.ENTITY_CREATED, set);
    }

    public static C3490aba b(Set<C3508cda> set) {
        return new C3820maa(a.ENTITY_DELETED, set);
    }
}
