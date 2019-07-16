package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: jga reason: default package and case insensitive filesystem */
/* compiled from: TombstoneNetworkFetcher.kt */
public final class C4586jga<Key, Model> implements C3961cga<Key, Model> {
    /* access modifiers changed from: private */
    public final C3961cga<Key, Model> a;
    private final C4594kga<Key> b;
    private final C4602lga<Key> c;

    public C4586jga(C3961cga<Key, Model> cga, C4594kga<Key> kga, C4602lga<Key> lga) {
        C7471uYa.b(cga, "delegate");
        C7471uYa.b(kga, "tombstoneStorage");
        C7471uYa.b(lga, "tombstoneStrategy");
        this.a = cga;
        this.b = kga;
        this.c = lga;
    }

    /* access modifiers changed from: private */
    public final Set<C4554fga<Key>> b(Set<? extends Key> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            C4554fga fga = this.b.get(obj);
            if (fga != null) {
                arrayList.add(fga);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (!this.c.a((C4554fga) next)) {
                arrayList2.add(next);
            }
        }
        return C7676xWa.t(arrayList2);
    }

    public IPa<C3953bga<Key, Model>> a(Set<? extends Key> set) {
        C7471uYa.b(set, "keys");
        IPa<C3953bga<Key, Model>> c2 = IPa.c((Callable<? extends T>) new C4562gga<Object>(this, set)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4570hga<Object,Object>(this, set)).c((C6776kQa<? super T>) new C4578iga<Object>(this));
        C7471uYa.a((Object) c2, "Single.fromCallable { ge…          }\n            }");
        return c2;
    }

    /* access modifiers changed from: private */
    public final void a(C3945aga<Key, Model> aga) {
        for (C4554fga a2 : aga.b()) {
            this.b.a(a2);
        }
    }
}
