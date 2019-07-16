package defpackage;

import com.soundcloud.android.collections.data.C2852h;
import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.collections.data.K;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: lwa reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
public class C6884lwa {
    private final K a;
    private final C4942Gta b;
    /* access modifiers changed from: private */
    public final C3760eea c;
    /* access modifiers changed from: private */
    public final Fda d;
    private final Cba e;
    /* access modifiers changed from: private */
    public final C3792iea f;

    public C6884lwa(K k, C4942Gta gta, C3760eea eea, Fda fda, Cba cba, C3792iea iea) {
        C7471uYa.b(k, "likesReadStorage");
        C7471uYa.b(gta, "postsStorage");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(fda, "playlistRepository");
        C7471uYa.b(cba, "followingStorage");
        C7471uYa.b(iea, "userRepository");
        this.a = k;
        this.b = gta;
        this.c = eea;
        this.d = fda;
        this.e = cba;
        this.f = iea;
    }

    private IPa<List<C4882Eva>> d(IPa<List<C2862s>> iPa, String str) {
        return b(a(iPa), str, (_Xa<? super C3509cea, Boolean>) new C5608awa<Object,Boolean>(str), (C6308dYa<? super C3509cea, ? super a, ? extends C4882Eva>) new C5676bwa<Object,Object,Object>(this), a.Like);
    }

    private IPa<List<C4882Eva>> c(IPa<List<C2862s>> iPa, String str) {
        return b(a(iPa), str, (_Xa<? super C3509cea, Boolean>) new C5514Zva<Object,Boolean>(str), (C6308dYa<? super C3509cea, ? super a, ? extends C4882Eva>) new C5543_va<Object,Object,Object>(this), a.LikeByUsername);
    }

    private IPa<List<C4882Eva>> b(String str, C3508cda cda, int i) {
        IPa<List<C4882Eva>> a2 = IPa.a(d(this.a.a(), str), b(this.a.e(), str), a(str), a(str, cda), b(str), a(str, i), c(this.a.a(), str), a(this.a.e(), str), C5369Uva.a);
        C7471uYa.a((Object) a2, "Single.zip(getLikedTrack…(t6).plus(t7).plus(t8) })");
        return a2;
    }

    public IPa<List<C7159pwa>> a(String str, C3508cda cda, int i) {
        C7471uYa.b(str, "searchQuery");
        C7471uYa.b(cda, "loggedInUserUrn");
        IPa<List<C7159pwa>> e2 = b(str, cda, i).e(new C6612hwa(this)).e(new C6680iwa(i));
        C7471uYa.a((Object) e2, "getInitialSuggestions(se… minOf(it.size, limit)) }");
        return e2;
    }

    private IPa<List<C4882Eva>> a(String str) {
        IPa<List<C4882Eva>> e2 = this.e.e().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5281Rva<Object,Object>(this)).e(new C5340Tva(str));
        C7471uYa.a((Object) e2, "followingStorage\n       …          }\n            }");
        return e2;
    }

    private IPa<List<C4882Eva>> a(String str, C3508cda cda) {
        IPa<List<C4882Eva>> e2 = this.f.a(C6850lWa.a(cda)).g().e(new C6272cwa(str));
        C7471uYa.a((Object) e2, "userRepository.liveUsers…          }\n            }");
        return e2;
    }

    private IPa<List<C4882Eva>> b(String str) {
        return b(b(this.b.b()), str, (_Xa<? super C3509cea, Boolean>) new C6476fwa<Object,Boolean>(str), (C6308dYa<? super C3509cea, ? super a, ? extends C4882Eva>) new C6544gwa<Object,Object,Object>(this), a.Post);
    }

    private IPa<List<C4882Eva>> a(String str, int i) {
        return a(b(this.b.a(Integer.valueOf(i))), str, (_Xa<? super Eda, Boolean>) new C6340dwa<Object,Boolean>(str), (C6308dYa<? super Eda, ? super a, ? extends C4882Eva>) new C6408ewa<Object,Object,Object>(this), a.Post);
    }

    private IPa<List<C4882Eva>> b(IPa<List<C2862s>> iPa, String str) {
        return a(a(iPa), str, (_Xa<? super Eda, Boolean>) new C5456Xva<Object,Boolean>(str), (C6308dYa<? super Eda, ? super a, ? extends C4882Eva>) new C5485Yva<Object,Object,Object>(this), a.Like);
    }

    private IPa<List<C4882Eva>> a(IPa<List<C2862s>> iPa, String str) {
        return a(a(iPa), str, (_Xa<? super Eda, Boolean>) new C5398Vva<Object,Boolean>(str), (C6308dYa<? super Eda, ? super a, ? extends C4882Eva>) new C5427Wva<Object,Object,Object>(this), a.LikeByUsername);
    }

    private IPa<List<C4882Eva>> b(IPa<List<C2852h>> iPa, String str, _Xa<? super C3509cea, Boolean> _xa, C6308dYa<? super C3509cea, ? super a, ? extends C4882Eva> dya, a aVar) {
        IPa a2 = iPa.a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5191Ova<Object,Object>(this));
        C5221Pva pva = new C5221Pva(this, str, _xa, dya, aVar);
        IPa<List<C4882Eva>> e2 = a2.e(pva);
        C7471uYa.a((Object) e2, "input\n            .flatM…, filter, mapper, kind) }");
        return e2;
    }

    /* access modifiers changed from: private */
    public C4882Eva a(C3509cea cea, a aVar) {
        C3508cda y = cea.y();
        StringBuilder sb = new StringBuilder();
        sb.append(cea.f());
        sb.append(" - ");
        sb.append(cea.w());
        C4882Eva a2 = C4882Eva.a(y, sb.toString(), C4928GKa.b(cea.k()), cea.e(), aVar);
        C7471uYa.a((Object) a2, "DatabaseSearchSuggestion…           kind\n        )");
        return a2;
    }

    /* access modifiers changed from: private */
    public C4882Eva b(C3509cea cea, a aVar) {
        C4882Eva a2 = C4882Eva.a(cea.y(), cea.w(), C4928GKa.b(cea.k()), cea.e(), aVar);
        C7471uYa.a((Object) a2, "DatabaseSearchSuggestion…           kind\n        )");
        return a2;
    }

    private IPa<List<C4882Eva>> a(IPa<List<C2852h>> iPa, String str, _Xa<? super Eda, Boolean> _xa, C6308dYa<? super Eda, ? super a, ? extends C4882Eva> dya, a aVar) {
        IPa a2 = iPa.a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5069Kva<Object,Object>(this));
        C5100Lva lva = new C5100Lva(this, str, _xa, dya, aVar);
        IPa<List<C4882Eva>> e2 = a2.e(lva);
        C7471uYa.a((Object) e2, "input\n            .flatM…, filter, mapper, kind) }");
        return e2;
    }

    /* access modifiers changed from: private */
    public C4882Eva b(Eda eda, a aVar) {
        C4882Eva a2 = C4882Eva.a(eda.v(), eda.s(), eda.h(), eda.c(), aVar);
        C7471uYa.a((Object) a2, "DatabaseSearchSuggestion…           kind\n        )");
        return a2;
    }

    /* access modifiers changed from: private */
    public C4882Eva a(Eda eda, a aVar) {
        C3508cda v = eda.v();
        StringBuilder sb = new StringBuilder();
        sb.append(eda.d());
        sb.append(" - ");
        sb.append(eda.s());
        C4882Eva a2 = C4882Eva.a(v, sb.toString(), eda.h(), eda.c(), aVar);
        C7471uYa.a((Object) a2, "DatabaseSearchSuggestion…           kind\n        )");
        return a2;
    }

    private IPa<List<C2852h>> b(IPa<List<C7843zta>> iPa) {
        IPa<List<C2852h>> e2 = iPa.e(C6816kwa.a);
        C7471uYa.a((Object) e2, "map { it as List<Collectable> }");
        return e2;
    }

    private IPa<List<C2852h>> a(IPa<List<C2862s>> iPa) {
        IPa<List<C2852h>> e2 = iPa.e(C6748jwa.a);
        C7471uYa.a((Object) e2, "map { it as List<Collectable> }");
        return e2;
    }

    /* access modifiers changed from: private */
    public List<C4882Eva> b(List<? extends HVa<C3509cea, ? extends C2852h>> list, String str, _Xa<? super C3509cea, Boolean> _xa, C6308dYa<? super C3509cea, ? super a, ? extends C4882Eva> dya, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) _xa.invoke(((HVa) next).c())).booleanValue()) {
                arrayList.add(next);
            }
        }
        List<HVa> a2 = C7676xWa.a((Iterable<? extends T>) arrayList, (Comparator<? super T>) new C4944Gva<Object>());
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, 10));
        for (HVa a3 : a2) {
            arrayList2.add((C4882Eva) dya.invoke((C3509cea) a3.a(), aVar));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public List<C4882Eva> a(List<? extends HVa<? extends Eda, ? extends C2852h>> list, String str, _Xa<? super Eda, Boolean> _xa, C6308dYa<? super Eda, ? super a, ? extends C4882Eva> dya, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) _xa.invoke(((HVa) next).c())).booleanValue()) {
                arrayList.add(next);
            }
        }
        List<HVa> a2 = C7676xWa.a((Iterable<? extends T>) arrayList, (Comparator<? super T>) new C4913Fva<Object>());
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, 10));
        for (HVa a3 : a2) {
            arrayList2.add((C4882Eva) dya.invoke((Eda) a3.a(), aVar));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public List<C7159pwa> a(List<? extends C4882Eva> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            C3508cda d2 = ((C4882Eva) next).d();
            Object obj = linkedHashMap.get(d2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(d2, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((List) entry.getValue()).size() > 1) {
                z = true;
            }
            if (z) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        List b2 = C6986nWa.b((Iterable<? extends Iterable<? extends T>>) linkedHashMap2.values());
        ArrayList arrayList = new ArrayList();
        for (Object next2 : b2) {
            if (a.LikeByUsername == ((C4882Eva) next2).g()) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next3 : list) {
            if (!arrayList.contains((C4882Eva) next3)) {
                arrayList2.add(next3);
            }
        }
        return arrayList2;
    }
}
