package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.offline.C4197yd;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.downloads.k reason: case insensitive filesystem */
/* compiled from: DownloadsDataSource.kt */
public class C3577k {
    /* access modifiers changed from: private */
    public final K a;
    private final C4942Gta b;
    private final C4197yd c;
    /* access modifiers changed from: private */
    public final C5604aua d;
    /* access modifiers changed from: private */
    public final HPa e;

    public C3577k(K k, C4942Gta gta, C4197yd ydVar, C5604aua aua, HPa hPa) {
        C7471uYa.b(k, "likesStorage");
        C7471uYa.b(gta, "postsStorage");
        C7471uYa.b(ydVar, "offlineContentOperations");
        C7471uYa.b(aua, "liveEntities");
        C7471uYa.b(hPa, "scheduler");
        this.a = k;
        this.b = gta;
        this.c = ydVar;
        this.d = aua;
        this.e = hPa;
    }

    private APa<Boolean> b() {
        return this.c.g();
    }

    /* access modifiers changed from: private */
    public APa<List<C2862s>> c() {
        APa<List<C2862s>> b2 = this.a.f().b(this.e);
        C7471uYa.a((Object) b2, "likesStorage.liveLoadPla…().subscribeOn(scheduler)");
        return b2;
    }

    private IPa<List<C7843zta>> d() {
        IPa<List<C7843zta>> b2 = C4942Gta.a(this.b, null, 1, null).b(this.e);
        C7471uYa.a((Object) b2, "postsStorage.loadPostedP…().subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public APa<List<C2862s>> e() {
        APa<List<C2862s>> k = b().k(new C3570d(this));
        C7471uYa.a((Object) k, "areLikesOfflineSynced().…tyList())\n        }\n    }");
        return k;
    }

    public APa<List<s>> a() {
        APa<List<s>> d2 = d().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3575i<Object,Object>(this));
        C7471uYa.a((Object) d2, "loadPlaylistPosts().flat…edForDownload()\n        }");
        return d2;
    }

    /* access modifiers changed from: private */
    public APa<List<s>> a(APa<List<s>> aPa) {
        APa<List<s>> h = aPa.h(C3576j.a);
        C7471uYa.a((Object) h, "map { it.filter { it.off…lineState.NOT_OFFLINE } }");
        return h;
    }
}
