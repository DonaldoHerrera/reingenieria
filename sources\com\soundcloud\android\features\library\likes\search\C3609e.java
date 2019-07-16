package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.likes.search.e reason: case insensitive filesystem */
/* compiled from: LikesDataSource.kt */
public class C3609e {
    private final K a;
    private final Ca b;
    private final HPa c;
    private final Aa d;

    public C3609e(K k, Ca ca, HPa hPa, Aa aa) {
        C7471uYa.b(k, "likesReadStorage");
        C7471uYa.b(ca, "trackItemRepository");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(aa, "collectionSyncer");
        this.a = k;
        this.b = ca;
        this.c = hPa;
        this.d = aa;
    }

    public APa<List<C6185ma>> b() {
        APa<List<C6185ma>> d2 = this.d.b().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3607c<Object,Object>(this));
        C7471uYa.a((Object) d2, "collectionSyncer.failSaf…rvable { loadAllLikes() }");
        return d2;
    }

    public APa<List<C6185ma>> a() {
        APa<List<C6185ma>> b2 = this.a.b().c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3606b<Object,Object>(this)).b(this.c);
        C7471uYa.a((Object) b2, "likesReadStorage.liveLoa…  .subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public APa<List<C6185ma>> a(List<C2862s> list) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C2862s a2 : list) {
            arrayList.add(a2.a());
        }
        APa<List<C6185ma>> h = this.b.a((List<C3508cda>) arrayList, true).h(new C3608d(arrayList));
        C7471uYa.a((Object) h, "trackItemRepository.live…ull { urnTrackMap[it] } }");
        return h;
    }
}
