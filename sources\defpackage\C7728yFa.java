package defpackage;

import com.soundcloud.android.sync.T;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: yFa reason: default package and case insensitive filesystem */
/* compiled from: DefaultUserRepository.kt */
public class C7728yFa implements C3792iea, C3800jea {
    /* access modifiers changed from: private */
    public final C1472lW a;
    private final T b;
    private final HPa c;
    private final C2034FO d;

    public C7728yFa(C1472lW lWVar, T t, HPa hPa, C2034FO fo) {
        C7471uYa.b(lWVar, "userStorage");
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(fo, "performanceReporter");
        this.a = lWVar;
        this.b = t;
        this.c = hPa;
        this.d = fo;
    }

    private C7531vPa<C3784hea> c(C3508cda cda) {
        C7531vPa<C3784hea> c2 = this.b.c(cda).c((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C7107pFa<Object,Object>(this, cda));
        C7471uYa.a((Object) c2, "syncInitiator.syncUser(u…orage.loadUser(userUrn) }");
        return c2;
    }

    public C7531vPa<C3784hea> b(C3508cda cda) {
        C7471uYa.b(cda, "userUrn");
        C2074HO a2 = this.d.a("repository_user");
        C7531vPa<C3784hea> b2 = this.a.a(cda).a((C6776kQa<? super VPa>) new C7245rFa<Object>(a2)).b((C6776kQa<? super T>) new C7314sFa<Object>(a2)).a((C7669xPa<? extends T>) c(cda).b((C6776kQa<? super T>) new C7383tFa<Object>(a2))).a((C6436fQa<? super T, ? super Throwable>) new C7452uFa<Object,Object>(a2)).b(this.c);
        C7471uYa.a((Object) b2, "userStorage.loadUser(use…  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<List<C3784hea>> a(List<C3508cda> list) {
        C7471uYa.b(list, "userUrns");
        List e = C7676xWa.e(list);
        boolean z = true;
        if (!(e instanceof Collection) || !e.isEmpty()) {
            Iterator it = e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C3508cda) it.next()).J()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to sync user without a valid user urn. userUrns = [");
            sb.append(list);
            sb.append(']');
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (e.isEmpty()) {
            APa<List<C3784hea>> c2 = APa.c(C6918mWa.a());
            C7471uYa.a((Object) c2, "Observable.just(listOf())");
            return c2;
        } else {
            C2074HO a2 = this.d.a("repository_users");
            APa<List<C3784hea>> b2 = this.a.a(e).e((C6776kQa<? super VPa>) new C6561hFa<Object>(a2)).e((C6776kQa<? super VPa>) new C6629iFa<Object>(a2, e)).d((C6776kQa<? super T>) new C6697jFa<Object>(a2, e)).g(new C6765kFa(this, e, a2)).b((C6776kQa<? super C7738yPa<T>>) new C6833lFa<Object>(a2)).h(C6901mFa.a).b(this.c);
            C7471uYa.a((Object) b2, "userStorage.loadUserMap(…  .subscribeOn(scheduler)");
            return b2;
        }
    }

    public boolean b(Iterable<C3776gea> iterable) {
        C7471uYa.b(iterable, "apiUsers");
        return this.a.b(iterable).b();
    }

    /* access modifiers changed from: private */
    public IPa<Map<C3508cda, C3784hea>> a(Map<C3508cda, C3784hea> map, List<C3508cda> list, C2074HO ho) {
        if (map.size() == list.size()) {
            IPa<Map<C3508cda, C3784hea>> a2 = IPa.a(map);
            C7471uYa.a((Object) a2, "Single.just(foundUsers)");
            return a2;
        }
        IPa<Map<C3508cda, C3784hea>> a3 = this.b.b(C7676xWa.c((Iterable<? extends T>) list, (Iterable<? extends T>) map.keySet())).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C7038oFa<Object,Object>(this, list, ho));
        C7471uYa.a((Object) a3, "syncInitiator.batchSyncU…size) }\n                }");
        return a3;
    }

    public C7531vPa<C3784hea> a(C3508cda cda) {
        C7471uYa.b(cda, "userUrn");
        C7531vPa<C3784hea> b2 = a(this.a.a(cda), "repository_local_user", "storage").b(this.c);
        C7471uYa.a((Object) b2, "userStorage.loadUser(use…  .subscribeOn(scheduler)");
        return b2;
    }

    public IPa<Boolean> a(C3508cda cda, long j) {
        C7471uYa.b(cda, "urn");
        IPa<Boolean> e = this.a.a(cda, j).e(C7176qFa.a);
        C7471uYa.a((Object) e, "userStorage.updateFollow…unt).map { it.success() }");
        return e;
    }

    public IPa<Iterable<C3776gea>> a(Iterable<C3776gea> iterable) {
        C7471uYa.b(iterable, "apiUsers");
        IPa<Iterable<C3776gea>> e = this.a.a(iterable).e(new C6493gFa(iterable));
        C7471uYa.a((Object) e, "userStorage.asyncStoreUs…piUsers).map { apiUsers }");
        return e;
    }

    private <T> C7531vPa<T> a(C7531vPa<T> vpa, String str, String str2) {
        C2074HO a2 = this.d.a(str);
        C7531vPa<T> a3 = vpa.a((C6776kQa<? super VPa>) new C7521vFa<Object>(a2)).b((C6776kQa<? super T>) new C7590wFa<Object>(a2, str2)).a((C6436fQa<? super T, ? super Throwable>) new C7659xFa<Object,Object>(a2));
        C7471uYa.a((Object) a3, "doOnSubscribe { trace.st… { _, _ -> trace.stop() }");
        return a3;
    }
}
