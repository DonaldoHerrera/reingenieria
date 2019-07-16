package defpackage;

import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Uta reason: default package and case insensitive filesystem */
/* compiled from: DefaultLiveEntities.kt */
public class C5367Uta implements C5604aua {
    private final Ca a;
    private final C5141NFa b;
    private final C4785Bra c;
    private final Vda d;

    public C5367Uta(Ca ca, C5141NFa nFa, C4785Bra bra, Vda vda) {
        C7471uYa.b(ca, "trackItemRepository");
        C7471uYa.b(nFa, "userItemRepository");
        C7471uYa.b(bra, "playlistItemRepository");
        C7471uYa.b(vda, "stationsRepository");
        this.a = ca;
        this.b = nFa;
        this.c = bra;
        this.d = vda;
    }

    public C4785Bra a() {
        return this.c;
    }

    public Ca b() {
        return this.a;
    }

    public C5141NFa c() {
        return this.b;
    }

    public <Entity extends PXa<? extends List<? extends C3508cda>>, Aggregate> APa<Aggregate> a(Entity entity, C6376eYa<? super Map<C3508cda, ? extends C6185ma>, ? super Map<C3508cda, C4954HFa>, ? super Map<C3508cda, ? extends C3863rda>, ? extends Aggregate> eya) {
        C7471uYa.b(entity, "sourceItem");
        C7471uYa.b(eya, "combiner");
        List list = (List) entity.d();
        _Ua _ua = _Ua.a;
        Ca b2 = b();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C3508cda) next).x()) {
                arrayList.add(next);
            }
        }
        APa a2 = Ca.a(b2, arrayList, false, 2, null);
        C5141NFa c2 = c();
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (((C3508cda) next2).J()) {
                arrayList2.add(next2);
            }
        }
        APa a3 = c2.a((Iterable<C3508cda>) arrayList2);
        C4785Bra a4 = a();
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : list) {
            if (((C3508cda) next3).u()) {
                arrayList3.add(next3);
            }
        }
        APa<Aggregate> a5 = APa.a((EPa<? extends T1>) a2, (EPa<? extends T2>) a3, (EPa<? extends T3>) C4785Bra.a(a4, arrayList3, false, 2, null), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new C5036Jta<Object,Object,Object,Object>(eya));
        C7471uYa.a((Object) a5, "Observables.combineLates…       combiner\n        )");
        return a5;
    }

    public APa<List<C4954HFa>> b(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        _Ua _ua = _Ua.a;
        APa c2 = APa.c(list);
        C7471uYa.a((Object) c2, "just(urns)");
        C5141NFa c3 = c();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C3508cda) next).J()) {
                arrayList.add(next);
            }
        }
        APa<List<C4954HFa>> a2 = APa.a((EPa<? extends T1>) c2, (EPa<? extends T2>) c3.a((Iterable<C3508cda>) arrayList), (C6504gQa<? super T1, ? super T2, ? extends R>) new C5338Tta<Object,Object,Object>());
        C7471uYa.a((Object) a2, "Observables.combineLates…{ users[it] } }\n        )");
        return a2;
    }

    public APa<List<C3863rda>> c(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        _Ua _ua = _Ua.a;
        APa c2 = APa.c(list);
        C7471uYa.a((Object) c2, "just(urns)");
        C4785Bra a2 = a();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C3508cda) next).u()) {
                arrayList.add(next);
            }
        }
        APa<List<C3863rda>> a3 = APa.a((EPa<? extends T1>) c2, (EPa<? extends T2>) C4785Bra.a(a2, arrayList, false, 2, null), (C6504gQa<? super T1, ? super T2, ? extends R>) new C5159Nta<Object,Object,Object>());
        C7471uYa.a((Object) a3, "Observables.combineLates…aylists[it] } }\n        )");
        return a3;
    }

    public APa<C4954HFa> b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        APa<C4954HFa> h = b(C6850lWa.a(cda)).a((C7256rQa<? super T>) C5279Rta.a).h(C5309Sta.a);
        C7471uYa.a((Object) h, "liveUsers(listOf(urn)).f…ty() }.map { it.first() }");
        return h;
    }

    public APa<List<C6185ma>> a(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        _Ua _ua = _Ua.a;
        APa c2 = APa.c(list);
        C7471uYa.a((Object) c2, "just(urns)");
        Ca b2 = b();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C3508cda) next).x()) {
                arrayList.add(next);
            }
        }
        APa<List<C6185ma>> a2 = APa.a((EPa<? extends T1>) c2, (EPa<? extends T2>) Ca.a(b2, arrayList, false, 2, null), (C6504gQa<? super T1, ? super T2, ? extends R>) new C5249Qta<Object,Object,Object>());
        C7471uYa.a((Object) a2, "Observables.combineLates… tracks[it] } }\n        )");
        return a2;
    }

    public APa<C3863rda> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        APa<C3863rda> h = c(C6850lWa.a(cda)).a((C7256rQa<? super T>) C5098Lta.a).h(C5129Mta.a);
        C7471uYa.a((Object) h, "livePlaylists(listOf(urn…ty() }.map { it.first() }");
        return h;
    }

    public <Entity extends C3759eda, Aggregate> APa<List<Aggregate>> a(List<? extends Entity> list, C6376eYa<? super C6185ma, ? super Entity, ? super Integer, ? extends Aggregate> eya, C6376eYa<? super C4954HFa, ? super Entity, ? super Integer, ? extends Aggregate> eya2, C6376eYa<? super C3863rda, ? super Entity, ? super Integer, ? extends Aggregate> eya3, boolean z) {
        C7471uYa.b(list, "sourceItems");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3508cda c2 = ((C3759eda) it.next()).c();
            if (c2 != null) {
                arrayList.add(c2);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        _Ua _ua = _Ua.a;
        APa c3 = APa.c(list);
        C7471uYa.a((Object) c3, "just(sourceItems)");
        Ca b2 = b();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (((C3508cda) next).x()) {
                arrayList2.add(next);
            }
        }
        APa a2 = b2.a((List<C3508cda>) arrayList2, z);
        C5141NFa c4 = c();
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : arrayList) {
            if (((C3508cda) next2).J()) {
                arrayList3.add(next2);
            }
        }
        APa a3 = c4.a((Iterable<C3508cda>) arrayList3);
        C4785Bra a4 = a();
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (((C3508cda) next3).u()) {
                arrayList4.add(next3);
            }
        }
        APa<List<Aggregate>> a5 = APa.a(c3, a2, a3, a4.a((Collection<C3508cda>) arrayList4, z), new C5004Ita(eya, eya2, eya3));
        C7471uYa.a((Object) a5, "Observables.combineLates…}\n            }\n        }");
        return a5;
    }
}
