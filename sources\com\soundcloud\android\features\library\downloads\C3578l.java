package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.offline.C4197yd;

/* renamed from: com.soundcloud.android.features.library.downloads.l reason: case insensitive filesystem */
/* compiled from: DownloadsDataSource_Factory */
public final class C3578l implements C4961HMa<C3577k> {
    private final C7054oVa<K> a;
    private final C7054oVa<C4942Gta> b;
    private final C7054oVa<C4197yd> c;
    private final C7054oVa<C5604aua> d;
    private final C7054oVa<HPa> e;

    public C3578l(C7054oVa<K> ova, C7054oVa<C4942Gta> ova2, C7054oVa<C4197yd> ova3, C7054oVa<C5604aua> ova4, C7054oVa<HPa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C3578l a(C7054oVa<K> ova, C7054oVa<C4942Gta> ova2, C7054oVa<C4197yd> ova3, C7054oVa<C5604aua> ova4, C7054oVa<HPa> ova5) {
        C3578l lVar = new C3578l(ova, ova2, ova3, ova4, ova5);
        return lVar;
    }

    public C3577k get() {
        C3577k kVar = new C3577k((K) this.a.get(), (C4942Gta) this.b.get(), (C4197yd) this.c.get(), (C5604aua) this.d.get(), (HPa) this.e.get());
        return kVar;
    }
}
