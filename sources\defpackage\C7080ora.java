package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.playqueue.C4403wa;
import com.soundcloud.android.sync.T;

/* renamed from: ora reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsPresenter.kt */
public final class C7080ora {
    private final C4972Hsa a;
    private final Db b;
    private final C4909Fra c;
    private final C4403wa d;
    private final C5327TLa e;
    private final C4197yd f;
    private final C3700b g;
    private final C3983h h;
    private final C5662bpa i;
    private final C1997DR j;
    private final C2436_U k;
    private final C4088fe l;
    private final C6668iqa m;
    private final HPa n;
    private final T o;

    public C7080ora(C4972Hsa hsa, Db db, C4909Fra fra, C4403wa waVar, C5327TLa tLa, C4197yd ydVar, C3700b bVar, C3983h hVar, C5662bpa bpa, C1997DR dr, C2436_U _u, C4088fe feVar, C6668iqa iqa, HPa hPa, T t) {
        C4972Hsa hsa2 = hsa;
        Db db2 = db;
        C4909Fra fra2 = fra;
        C4403wa waVar2 = waVar;
        C5327TLa tLa2 = tLa;
        C4197yd ydVar2 = ydVar;
        C3700b bVar2 = bVar;
        C3983h hVar2 = hVar;
        C5662bpa bpa2 = bpa;
        C1997DR dr2 = dr;
        C2436_U _u2 = _u;
        C4088fe feVar2 = feVar;
        C6668iqa iqa2 = iqa;
        HPa hPa2 = hPa;
        T t2 = t;
        C7471uYa.b(hsa2, "playlistUpsellOperations");
        C7471uYa.b(db2, "playbackInitiator");
        C7471uYa.b(fra2, "playlistOperations");
        C7471uYa.b(waVar2, "playQueueHelper");
        C7471uYa.b(tLa2, "eventBus");
        C7471uYa.b(ydVar2, "offlineContentOperations");
        C7471uYa.b(bVar2, "analytics");
        C7471uYa.b(hVar2, "likeOperations");
        C7471uYa.b(bpa2, "dataSourceProvider");
        C7471uYa.b(dr2, "repostOperations");
        C7471uYa.b(_u2, "featureOperations");
        C7471uYa.b(feVar2, "offlineSettingsStorage");
        C7471uYa.b(iqa2, "playlistDetailsMetadataBuilderFactory");
        C7471uYa.b(hPa2, "mainScheduler");
        C7471uYa.b(t2, "syncInitiator");
        this.a = hsa2;
        this.b = db2;
        this.c = fra2;
        this.d = waVar2;
        this.e = tLa2;
        this.f = ydVar2;
        this.g = bVar2;
        this.h = hVar2;
        this.i = bpa2;
        this.j = dr2;
        this.k = _u2;
        this.l = feVar2;
        this.m = iqa2;
        this.n = hPa2;
        this.o = t2;
    }

    public final C6804kqa a(C3508cda cda, String str, SearchQuerySourceInfo searchQuerySourceInfo, PromotedSourceInfo promotedSourceInfo) {
        C3508cda cda2 = cda;
        String str2 = str;
        SearchQuerySourceInfo searchQuerySourceInfo2 = searchQuerySourceInfo;
        PromotedSourceInfo promotedSourceInfo2 = promotedSourceInfo;
        C7471uYa.b(cda, "initialUrn");
        C7471uYa.b(str, "screen");
        C6804kqa kqa = new C6804kqa(cda2, str2, searchQuerySourceInfo2, promotedSourceInfo2, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        return kqa;
    }
}
