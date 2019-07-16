package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.soundcloud.android.search.s reason: case insensitive filesystem */
/* compiled from: SearchOperations.kt */
public class C5933s {
    private final C5927oa a;
    private final Ca b;
    private final C4785Bra c;
    private final C5141NFa d;

    public C5933s(C5927oa oaVar, Ca ca, C4785Bra bra, C5141NFa nFa) {
        C7471uYa.b(oaVar, "searchStrategyFactory");
        C7471uYa.b(ca, "trackItemRepository");
        C7471uYa.b(bra, "playlistItemRepository");
        C7471uYa.b(nFa, "userItemRepository");
        this.a = oaVar;
        this.b = ca;
        this.c = bra;
        this.d = nFa;
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r22v0, types: [com.soundcloud.android.search.Ma] */
    /* JADX WARNING: type inference failed for: r12v4, types: [com.soundcloud.android.search.w] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r12v6, types: [com.soundcloud.android.search.Da] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r22v2, types: [com.soundcloud.android.search.Ma] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2
  assigns: []
  uses: []
  mth insns count: 104
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012a A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 5 */
    private List<Wca> b(I i, Map<C3508cda, ? extends C6185ma> map, Map<C3508cda, ? extends C3863rda> map2, Map<C3508cda, C4954HFa> map3, La la, C3508cda cda, String str) {
        ? r5;
        Map<C3508cda, ? extends C6185ma> map4 = map;
        Map<C3508cda, ? extends C3863rda> map5 = map2;
        Map<C3508cda, C4954HFa> map6 = map3;
        La la2 = la;
        List a2 = i.a();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        for (Object next : a2) {
            int i4 = i2 + 1;
            ? r52 = 0;
            if (i2 >= 0) {
                C3508cda cda2 = (C3508cda) next;
                C4928GKa b2 = C4928GKa.b(i.d());
                SearchQuerySourceInfo searchQuerySourceInfo = new SearchQuerySourceInfo(cda, str, i2, cda2, null, 16, null);
                String str2 = "queryUrnOpt";
                if (map4.containsKey(cda2)) {
                    C6185ma maVar = (C6185ma) map4.get(cda2);
                    if (maVar != null) {
                        List c2 = c(i);
                        C7471uYa.a((Object) b2, str2);
                        C3508cda a3 = maVar.a();
                        C7471uYa.a((Object) a3, "trackItem.urn");
                        SearchQuerySourceInfo searchQuerySourceInfo2 = searchQuerySourceInfo;
                        C4928GKa gKa = b2;
                        Ea ea = new Ea(a3, la, c2, i3, searchQuerySourceInfo2);
                        ? da = new Da(maVar, gKa, null, null, ea, 12, null);
                        i3++;
                        r52 = da;
                    }
                } else {
                    SearchQuerySourceInfo searchQuerySourceInfo3 = searchQuerySourceInfo;
                    C4928GKa gKa2 = b2;
                    String str3 = "searchType.screen";
                    if (map5.containsKey(cda2)) {
                        C3863rda rda = (C3863rda) map5.get(cda2);
                        if (rda != null) {
                            C7471uYa.a((Object) gKa2, str2);
                            C3508cda a4 = rda.a();
                            C7471uYa.a((Object) a4, "it.urn");
                            Yca b3 = la.b();
                            C7471uYa.a((Object) b3, str3);
                            ? wVar = new C5940w(rda, gKa2, null, null, new C5941x(a4, b3, searchQuerySourceInfo3, la2), 12, null);
                            r52 = wVar;
                        }
                    } else if (map6.containsKey(cda2)) {
                        C4954HFa hFa = (C4954HFa) map6.get(cda2);
                        if (hFa != null) {
                            C7471uYa.a((Object) gKa2, str2);
                            C3508cda a5 = hFa.a();
                            Yca b4 = la.b();
                            C7471uYa.a((Object) b4, str3);
                            Na na = new Na(a5, b4, searchQuerySourceInfo3, la2);
                            C3508cda a6 = hFa.a();
                            boolean z = !hFa.e;
                            String a7 = la.b().a();
                            C7471uYa.a((Object) a7, "searchType.screen.get()");
                            ? ma = new Ma(hFa, gKa2, null, null, na, new Sa(a6, z, a(i2, a7, i.d())), 12, null);
                            r5 = ma;
                            if (r5 == 0) {
                                arrayList.add(r5);
                            }
                            map4 = map;
                            i2 = i4;
                        }
                    }
                }
                r5 = r52;
                if (r5 == 0) {
                }
                map4 = map;
                i2 = i4;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        return arrayList;
    }

    private List<C3508cda> c(I i) {
        List a2 = i.a();
        ArrayList<C3508cda> arrayList = new ArrayList<>();
        for (Object next : a2) {
            if (((C3508cda) next).x()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (C3508cda add : arrayList) {
            arrayList2.add(add);
        }
        return arrayList2;
    }

    private List<C3508cda> d(I i) {
        List a2 = i.a();
        ArrayList<C3508cda> arrayList = new ArrayList<>();
        for (Object next : a2) {
            if (((C3508cda) next).J()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (C3508cda add : arrayList) {
            arrayList2.add(add);
        }
        return arrayList2;
    }

    public IPa<I> a(La la, String str, C3508cda cda) {
        C7471uYa.b(la, "searchType");
        C7471uYa.b(str, "query");
        return this.a.a(la).a(str, cda, la);
    }

    public IPa<I> a(La la, Oca oca, String str) {
        C7471uYa.b(la, "searchType");
        C7471uYa.b(oca, "nextHref");
        C7471uYa.b(str, "queryString");
        return this.a.a(la).a(oca, la, str);
    }

    public APa<List<Wca>> a(I i) {
        C7471uYa.b(i, "originalResults");
        APa<List<Wca>> d2 = APa.a((EPa<? extends T1>) Ca.a(this.b, c(i), false, 2, null), (EPa<? extends T2>) C4785Bra.a(this.c, b(i), false, 2, null), (EPa<? extends T3>) this.d.a((Iterable<C3508cda>) d(i)), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new C5930q<Object,Object,Object,Object>(this, i)).h(r.a).d();
        C7471uYa.a((Object) d2, "Observable.combineLatest…  .distinctUntilChanged()");
        return d2;
    }

    /* access modifiers changed from: private */
    public J a(I i, Map<C3508cda, ? extends C6185ma> map, Map<C3508cda, ? extends C3863rda> map2, Map<C3508cda, C4954HFa> map3, La la, C3508cda cda, String str) {
        return new J(C7676xWa.c(b(i, map, map2, map3, la, cda, str)), i.e());
    }

    private C3710l a(int i, String str, C3508cda cda) {
        String str2 = str;
        C3508cda cda2 = cda;
        v vVar = r1;
        v vVar2 = new v(str, i);
        C3710l lVar = new C3710l(null, str2, vVar, false, null, null, null, null, cda2, null, null, null, null, null, 16121, null);
        return lVar;
    }

    private List<C3508cda> b(I i) {
        List a2 = i.a();
        ArrayList<C3508cda> arrayList = new ArrayList<>();
        for (Object next : a2) {
            if (((C3508cda) next).u()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (C3508cda add : arrayList) {
            arrayList2.add(add);
        }
        return arrayList2;
    }
}
