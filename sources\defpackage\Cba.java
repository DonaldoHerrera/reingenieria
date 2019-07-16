package defpackage;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: Cba reason: default package */
/* compiled from: FollowingStorage.kt */
public class Cba {
    private final int a = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
    private final C3869sba b;

    public Cba(C3869sba sba) {
        C7471uYa.b(sba, "database");
        this.b = sba;
    }

    public void a() {
        this.b.b();
    }

    public void b(List<C3508cda> list) {
        C7471uYa.b(list, "userIds");
        g gVar = new g(this.b.a(), C3909xba.a());
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                gVar.a((C3508cda) next, (long) i);
                this.b.a("following", (Yd) gVar);
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
    }

    public void c(C3508cda cda) {
        C7471uYa.b(cda, "followedUser");
        C3837oba b2 = b(cda);
        Date date = null;
        String str = "following";
        if ((b2 != null ? b2.a() : null) != null) {
            a aVar = new a(this.b.a(), C3909xba.a());
            aVar.a(cda);
            this.b.c(str, (Yd) aVar);
            return;
        }
        if (b2 != null) {
            date = b2.b();
        }
        if (date != null) {
            d dVar = new d(this.b.a(), C3909xba.a());
            dVar.a(cda);
            this.b.c(str, (Yd) dVar);
        }
    }

    public Set<C3508cda> d() {
        C3869sba sba = this.b;
        C6840lMa c = C3909xba.a().c();
        C7471uYa.a((Object) c, "FOLLOWING_FACTORY.loadFollowedUserIds()");
        C6772kMa d = C3909xba.a().d();
        C7471uYa.a((Object) d, "FOLLOWING_FACTORY.loadFollowedUserIdsMapper()");
        return C7676xWa.t(sba.c((Xd) c, d));
    }

    public IPa<List<C3837oba>> e() {
        C3869sba sba = this.b;
        C6840lMa f = C3909xba.a().f();
        C7471uYa.a((Object) f, "FOLLOWING_FACTORY.selectAll()");
        h g = C3909xba.a().g();
        C7471uYa.a((Object) g, "FOLLOWING_FACTORY.selectAllMapper()");
        return sba.a((Xd) f, (C6772kMa<T>) g);
    }

    public List<C3837oba> f() {
        C3869sba sba = this.b;
        C6840lMa h = C3909xba.a().h();
        C7471uYa.a((Object) h, "FOLLOWING_FACTORY.selectStale()");
        h k = C3909xba.a().k();
        C7471uYa.a((Object) k, "FOLLOWING_FACTORY.selectStaleMapper()");
        return C7676xWa.q(sba.c((Xd) h, (C6772kMa<T>) k));
    }

    public Set<C3508cda> g() {
        C3869sba sba = this.b;
        C6840lMa f = C3909xba.a().f();
        C7471uYa.a((Object) f, "FOLLOWING_FACTORY.selectAll()");
        h g = C3909xba.a().g();
        C7471uYa.a((Object) g, "FOLLOWING_FACTORY.selectAllMapper()");
        List<C3837oba> c = sba.c((Xd) f, (C6772kMa<T>) g);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) c, 10));
        for (C3837oba c2 : c) {
            arrayList.add(c2.c());
        }
        return C7676xWa.t(arrayList);
    }

    public void a(List<C3508cda> list) {
        C7471uYa.b(list, "itemDeletions");
        List<List> b2 = C7676xWa.b((Iterable) list, this.a);
        ArrayList<C6840lMa> arrayList = new ArrayList<>(C6986nWa.a((Iterable) b2, 10));
        for (List list2 : b2) {
            e a2 = C3909xba.a();
            if (list2 != null) {
                Object[] array = list2.toArray(new C3508cda[0]);
                if (array != null) {
                    arrayList.add(a2.a((C3508cda[]) array));
                } else {
                    throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new OVa("null cannot be cast to non-null type java.util.Collection<T>");
            }
        }
        for (C6840lMa lma : arrayList) {
            C3869sba sba = this.b;
            C7471uYa.a((Object) lma, "it");
            sba.a((Xd) lma);
        }
    }

    public C3837oba b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C3869sba sba = this.b;
        C6840lMa b2 = C3909xba.a().b(cda);
        C7471uYa.a((Object) b2, "FOLLOWING_FACTORY.selectById(urn)");
        return (C3837oba) C7676xWa.g(sba.c((Xd) b2, (C6772kMa<T>) C3909xba.b()));
    }

    public IPa<List<C3837oba>> b() {
        C3869sba sba = this.b;
        C6840lMa a2 = C3909xba.a().a();
        C7471uYa.a((Object) a2, "FOLLOWING_FACTORY.loadFollowed()");
        return sba.a((Xd) a2, (C6772kMa<T>) C3909xba.b());
    }

    public long b(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "userUrn");
        Date date = new Date();
        Date date2 = z ? date : null;
        if (z) {
            date = null;
        }
        f fVar = new f(this.b.a(), C3909xba.a());
        fVar.a(cda, date2, date);
        return this.b.a("following", (Yd) fVar);
    }

    public boolean c() {
        C3869sba sba = this.b;
        C6840lMa i = C3909xba.a().i();
        C7471uYa.a((Object) i, "FOLLOWING_FACTORY.selectStaleCount()");
        C6772kMa j = C3909xba.a().j();
        C7471uYa.a((Object) j, "FOLLOWING_FACTORY.selectStaleCountMapper()");
        Long l = (Long) sba.d((Xd) i, j);
        return l != null && l.longValue() > 0;
    }

    public IPa<Boolean> a(C3508cda cda) {
        C7471uYa.b(cda, "targetUrn");
        C3869sba sba = this.b;
        C6840lMa a2 = C3909xba.a().a(cda);
        C7471uYa.a((Object) a2, "FOLLOWING_FACTORY.select…FollowingCount(targetUrn)");
        C6772kMa e = C3909xba.a().e();
        C7471uYa.a((Object) e, "FOLLOWING_FACTORY.select…iveFollowingCountMapper()");
        IPa<Boolean> d = sba.b((Xd) a2, e).f(Bba.a).d(Boolean.valueOf(false));
        C7471uYa.a((Object) d, "database.executeAsyncSel…         .toSingle(false)");
        return d;
    }

    public IPa<Long> a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "userUrn");
        IPa<Long> c = IPa.c((Callable<? extends T>) new Aba<Object>(this, cda, z));
        C7471uYa.a((Object) c, "Single.fromCallable {\n  …Urn, following)\n        }");
        return c;
    }
}
