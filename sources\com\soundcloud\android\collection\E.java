package com.soundcloud.android.collection;

import com.soundcloud.android.collection.La.a;
import com.soundcloud.android.collection.playhistory.C2791t;
import com.soundcloud.android.collection.recentlyplayed.C2825n;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: CollectionItemTransformer.kt */
public class E {
    private final C2436_U a;
    private final C2746fa b;
    private final Ca c;

    public E(C2436_U _u, C2746fa faVar, Ca ca) {
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(faVar, "collectionOptionsStorage");
        C7471uYa.b(ca, "trackItemRepository");
        this.a = _u;
        this.b = faVar;
        this.c = ca;
    }

    public APa<List<B>> a(C2843y yVar) {
        C7471uYa.b(yVar, "domainModel");
        _Ua _ua = _Ua.a;
        Ca ca = this.c;
        List<C6185ma> b2 = yVar.b();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) b2, 10));
        for (C6185ma a2 : b2) {
            arrayList.add(a2.a());
        }
        APa<List<B>> a3 = APa.a(ca.a(C7676xWa.q(C7676xWa.t(arrayList)), true), this.b.g(), this.b.k(), this.b.j(), new D(this, yVar));
        C7471uYa.a((Object) a3, "Observables.combineLates…, urnsToTracks)\n        }");
        return a3;
    }

    /* access modifiers changed from: private */
    public List<B> a(C2843y yVar, Map<C3508cda, ? extends C6185ma> map) {
        B[] bArr = new B[3];
        a aVar = La.a;
        List a2 = yVar.a();
        C4928GKa b2 = C4928GKa.b(yVar.c());
        C7471uYa.a((Object) b2, "Optional.fromNullable(do…Model.playlistsAndAlbums)");
        bArr[0] = aVar.a(a2, b2, yVar.e());
        bArr[1] = new C2825n(yVar.d());
        List<C6185ma> b3 = yVar.b();
        ArrayList arrayList = new ArrayList();
        for (C6185ma a3 : b3) {
            C6185ma maVar = (C6185ma) map.get(a3.a());
            if (maVar != null) {
                arrayList.add(maVar);
            }
        }
        bArr[2] = C2791t.a(arrayList);
        return C6918mWa.b((Object[]) bArr);
    }

    /* access modifiers changed from: private */
    public B a(boolean z, boolean z2, boolean z3) {
        if (z) {
            return a.d();
        }
        if (z3) {
            return c.d();
        }
        if (this.a.l() || !this.a.s() || !z2) {
            return null;
        }
        return b.d();
    }
}
