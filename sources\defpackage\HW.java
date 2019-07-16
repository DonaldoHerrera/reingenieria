package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: HW reason: default package */
/* compiled from: UserStorageWriter.kt */
public class HW implements C4618nga<C3776gea>, C3800jea {
    private final C1472lW a;
    private final WV b;
    private final C4643qga c;
    private final HPa d;

    public HW(C1472lW lWVar, WV wv, C4643qga qga, HPa hPa) {
        C7471uYa.b(lWVar, "usersStorage");
        C7471uYa.b(wv, "timeToLiveStorage");
        C7471uYa.b(qga, "timeToLiveStrategy");
        C7471uYa.b(hPa, "scheduler");
        this.a = lWVar;
        this.b = wv;
        this.c = qga;
        this.d = hPa;
    }

    public boolean b(Iterable<C3776gea> iterable) {
        C7471uYa.b(iterable, "apiUsers");
        C6499gLa b2 = this.a.b(iterable);
        if (b2.b()) {
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) iterable, 10));
            for (C3776gea a2 : iterable) {
                arrayList.add(a(a2));
            }
            b((Collection<Ufa<C3776gea>>) arrayList);
        }
        return b2.b();
    }

    public C6979nPa a(Collection<Ufa<C3776gea>> collection) {
        C7471uYa.b(collection, "models");
        C1472lW lWVar = this.a;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
        for (Ufa b2 : collection) {
            arrayList.add((C3776gea) b2.b());
        }
        C6979nPa b3 = lWVar.a((Iterable<C3776gea>) arrayList).c((C6776kQa<? super T>) new FW<Object>(this, collection)).b((C7118pQa<? super T, ? extends C7255rPa>) GW.a);
        C7471uYa.a((Object) b3, "usersStorage.asyncStoreU…          }\n            }");
        return b3;
    }

    /* access modifiers changed from: private */
    public void b(Collection<Ufa<C3776gea>> collection) {
        for (Ufa ufa : collection) {
            this.b.a(((C3776gea) ufa.b()).l(), ufa.a());
        }
    }

    public IPa<Iterable<C3776gea>> a(Iterable<C3776gea> iterable) {
        C7471uYa.b(iterable, "apiUsers");
        IPa<Iterable<C3776gea>> b2 = this.a.a(iterable).e(new DW(iterable)).c((C6776kQa<? super T>) new EW<Object>(this)).b(this.d);
        C7471uYa.a((Object) b2, "usersStorage.asyncStoreU…  .subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public Ufa<C3776gea> a(C3776gea gea) {
        long a2 = this.c.a();
        Tfa.a(a2);
        return new Ufa<>(gea, a2, null);
    }
}
