package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.likes.V;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.likes.search.j reason: case insensitive filesystem */
/* compiled from: LikesSearchDataSource.kt */
public class C3614j {
    private final C3609e a;
    private final Aa b;

    public C3614j(C3609e eVar, Aa aa) {
        C7471uYa.b(eVar, "likesDataSource");
        C7471uYa.b(aa, "collectionSyncer");
        this.a = eVar;
        this.b = aa;
    }

    public APa<N> b(APa<String> aPa) {
        C7471uYa.b(aPa, "queryRelay");
        APa<N> d = this.b.b().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3613i<Object,Object>(this, aPa));
        C7471uYa.a((Object) d, "collectionSyncer.failSaf…tchingQuery(queryRelay) }");
        return d;
    }

    public APa<N> a(APa<String> aPa) {
        C7471uYa.b(aPa, "queryRelay");
        APa<N> k = this.a.a().k(new C3612h(this, aPa));
        C7471uYa.a((Object) k, "likesDataSource.loadAllL…          }\n            }");
        return k;
    }

    /* access modifiers changed from: private */
    public N a(String str, List<? extends C6185ma> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C6185ma v : list) {
            arrayList.add(new x(str, new V(v)));
        }
        return new N(size, arrayList);
    }

    /* access modifiers changed from: private */
    public List<C6185ma> a(List<? extends C6185ma> list, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C6185ma maVar = (C6185ma) next;
            String B = maVar.B();
            C7471uYa.a((Object) B, "it.title()");
            boolean z = true;
            if (!Hxb.a((CharSequence) B, charSequence, true)) {
                String d = maVar.d();
                C7471uYa.a((Object) d, "it.creatorName()");
                if (!Hxb.a((CharSequence) d, charSequence, true)) {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
