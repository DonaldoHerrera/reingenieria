package defpackage;

import com.google.common.base.Function;
import com.soundcloud.android.discovery.systemplaylist.C3524o;
import com.soundcloud.android.image.W;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* renamed from: bY reason: default package and case insensitive filesystem */
/* compiled from: DbModelMapper */
final class C3495bY {
    private C3495bY() {
    }

    static C2215PD<C3508cda, e> a(List<e> list) {
        C2987fD f = C2987fD.f();
        for (e eVar : list) {
            f.put(eVar.g(), eVar);
        }
        return f;
    }

    static List<C3503cY> a(List<b> list, C2215PD<C3508cda, e> pd) {
        return C2063HD.a(list, (Function<? super F, ? extends T>) new C3745dX<Object,Object>(pd));
    }

    static C3524o a(g gVar, List<C3508cda> list) {
        return C3524o.a(gVar.c(), C4928GKa.b(gVar.d()), C4928GKa.b(gVar.e()), C4928GKa.b(gVar.description()), list, C4928GKa.b(gVar.a()), C4928GKa.b(gVar.b()), C4928GKa.b(gVar.f()));
    }

    /* access modifiers changed from: private */
    public static C3503cY a(b bVar, C2215PD<C3508cda, e> pd) {
        if (bVar.a() != null) {
            f fVar = (f) bVar.a();
            return a(fVar, (e) pd.get(fVar.c()).iterator().next());
        } else if (bVar.b() != null) {
            c cVar = (c) bVar.b();
            return a(cVar, pd.get(cVar.c()));
        } else {
            throw new IllegalArgumentException("Unexpected card type");
        }
    }

    private static d a(f fVar, e eVar) {
        d dVar = new d(fVar.g(), fVar.c(), fVar.h(), fVar.e(), fVar.description(), fVar.d(), a(fVar.c(), eVar), fVar.f(), fVar.i(), fVar.b());
        return dVar;
    }

    private static b a(c cVar, Collection<e> collection) {
        b bVar = new b(cVar.g(), cVar.c(), cVar.d(), cVar.h(), cVar.e(), cVar.description(), cVar.f(), C2063HD.a((List<F>) C2063HD.a((Iterable<? extends E>) collection), (Function<? super F, ? extends T>) new C3502cX<Object,Object>(cVar)));
        return bVar;
    }

    /* access modifiers changed from: private */
    public static C3418EY a(C3508cda cda, e eVar) {
        String i = eVar.i();
        Long count = eVar.count();
        C3418EY ey = new C3418EY(eVar.c(), cda, eVar.b(), i != null ? W.a(i) : null, count != null ? Integer.valueOf(count.intValue()) : null, eVar.d(), eVar.e(), eVar.h(), eVar.f());
        return ey;
    }

    static C3409BY a(d dVar) {
        String str = ",";
        C3887uda uda = new C3887uda(Arrays.asList(dVar.h().split(str)), Arrays.asList(dVar.e().split(str)), Arrays.asList(dVar.f().split(str)), Arrays.asList(dVar.k().split(str)), Arrays.asList(dVar.i().split(str)));
        C3409BY by = new C3409BY(new Date(dVar.d()), dVar.b(), dVar.j(), dVar.c(), uda, dVar.g());
        return by;
    }
}
