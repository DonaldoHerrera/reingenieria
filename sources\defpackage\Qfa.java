package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: Qfa reason: default package */
/* compiled from: DefaultVault.kt */
public final class Qfa<Key, Model, NetworkModel> implements Zfa<Key, List<? extends Model>> {
    /* access modifiers changed from: private */
    public final C3100lC<Set<Key>, IPa<C3953bga<Key, NetworkModel>>> a;
    /* access modifiers changed from: private */
    public final C3961cga<Key, NetworkModel> b;
    private final C4618nga<NetworkModel> c;
    private final C4610mga<Key, Model> d;
    private final HPa e;
    /* access modifiers changed from: private */
    public final Sfa<Key, Model> f;
    /* access modifiers changed from: private */
    public final C4634pga<Key> g;
    /* access modifiers changed from: private */
    public final C4643qga h;

    public Qfa(C3961cga<Key, NetworkModel> cga, C4618nga<NetworkModel> nga, C4610mga<Key, Model> mga, HPa hPa, Sfa<Key, Model> sfa, C4634pga<Key> pga, C4643qga qga) {
        C7471uYa.b(cga, "networkFetcher");
        C7471uYa.b(nga, "storageWriter");
        C7471uYa.b(mga, "storageReader");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(sfa, "keyExtractor");
        C7471uYa.b(pga, "timeToLiveStorage");
        C7471uYa.b(qga, "timeToLiveStrategy");
        this.b = cga;
        this.c = nga;
        this.d = mga;
        this.e = hPa;
        this.f = sfa;
        this.g = pga;
        this.h = qga;
        C3024hC o = C3024hC.o();
        o.a(5);
        this.a = o.a((C3043iC<? super K1, V1>) new C3937Ifa<Object,V1>(this));
    }

    /* access modifiers changed from: private */
    public final IPa<C3953bga<Key, NetworkModel>> e(Set<? extends Key> set) {
        IPa<C3953bga<Key, NetworkModel>> a2 = ((IPa) this.a.get(set)).a((C6436fQa<? super T, ? super Throwable>) new C3933Efa<Object,Object>(this, set));
        C7471uYa.a((Object) a2, "networkFetchersCache.get…te(request)\n            }");
        return a2;
    }

    public APa<Wfa<Key, List<Model>>> b(Set<? extends Key> set) {
        C7471uYa.b(set, "keys");
        APa<Wfa<Key, List<Model>>> b2 = d(set).d((EPa<? extends T>) c(set).a((C7256rQa<? super T>) C3936Hfa.a).f().g()).b(this.e);
        C7471uYa.a((Object) b2, "synced(keys)\n           …  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<Wfa<Key, List<Model>>> c(Set<? extends Key> set) {
        C7471uYa.b(set, "keys");
        APa<Wfa<Key, List<Model>>> b2 = this.d.a(set).h(new C3934Ffa(this)).h(new C3935Gfa(this, set)).b(this.e);
        C7471uYa.a((Object) b2, "storageReader.read(keys)…  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<Wfa<Key, List<Model>>> d(Set<? extends Key> set) {
        C7471uYa.b(set, "keys");
        APa<Wfa<Key, List<Model>>> b2 = e(set).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3939Kfa<Object,Object>(this)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3940Lfa<Object,Object>(this, set)).b(this.e);
        C7471uYa.a((Object) b2, "cachedNetworkFetcher(key…  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<Wfa<Key, List<Model>>> a(Set<? extends Key> set) {
        C7471uYa.b(set, "keys");
        APa c2 = c(set).c();
        APa<Wfa<Key, List<Model>>> b2 = c2.g().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3944Pfa<Object,Object>(this, c2, set)).b(this.e);
        C7471uYa.a((Object) b2, "diskEmitter\n            …  .subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public final IPa<? extends C3953bga<Key, NetworkModel>> a(C3953bga<Key, NetworkModel> bga) {
        if (bga instanceof b) {
            IPa<? extends C3953bga<Key, NetworkModel>> b2 = this.c.a(((b) bga).a().a()).b((Callable<? extends T>) new C3938Jfa<Object>(bga));
            C7471uYa.a((Object) b2, "storageWriter.write(it.r…e.models).toSingle { it }");
            return b2;
        } else if (bga instanceof a) {
            IPa<? extends C3953bga<Key, NetworkModel>> a2 = IPa.a(bga);
            C7471uYa.a((Object) a2, "Single.just(it)");
            return a2;
        } else {
            throw new FVa();
        }
    }

    /* access modifiers changed from: private */
    public final Wfa<Key, List<Model>> a(List<? extends Model> list, Set<? extends Key> set) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (Object a2 : list) {
            arrayList.add(this.f.a(a2));
        }
        Set a3 = TWa.a((Set) set, (Iterable) C7676xWa.t(arrayList));
        if (a3.isEmpty()) {
            return Xfa.a(list);
        }
        return Xfa.a(list, a3);
    }
}
