package com.soundcloud.android.collection.playhistory;

import com.google.common.base.Function;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.ia;
import com.soundcloud.android.sync.na;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 02\u00020\u0001:\u00010BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0017J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u0014H\u0012J\u001e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0!H\u0012J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0014H\u0012J\u001e\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0017J\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0017J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00142\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*H\u0016J&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u0015H\u0012J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018*\b\u0012\u0004\u0012\u00020/0.H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/soundcloud/android/collection/playhistory/PlayHistoryOperations;", "", "playbackInitiator", "Lcom/soundcloud/android/playback/PlaybackInitiator;", "playHistoryStorage", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryStorage;", "scheduler", "Lio/reactivex/Scheduler;", "syncOperations", "Lcom/soundcloud/android/sync/SyncOperations;", "clearPlayHistoryCommand", "Lcom/soundcloud/android/collection/playhistory/ClearPlayHistoryCommand;", "trackRepository", "Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;", "trackItemRepository", "Lcom/soundcloud/android/tracks/TrackItemRepository;", "sessionProvider", "Lcom/soundcloud/android/foundation/accounts/SessionProvider;", "(Lcom/soundcloud/android/playback/PlaybackInitiator;Lcom/soundcloud/android/collection/playhistory/PlayHistoryStorage;Lio/reactivex/Scheduler;Lcom/soundcloud/android/sync/SyncOperations;Lcom/soundcloud/android/collection/playhistory/ClearPlayHistoryCommand;Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;Lcom/soundcloud/android/tracks/TrackItemRepository;Lcom/soundcloud/android/foundation/accounts/SessionProvider;)V", "clearHistory", "Lio/reactivex/Single;", "", "failSafePlayHistory", "Lio/reactivex/Observable;", "", "Lcom/soundcloud/android/tracks/TrackItem;", "limit", "", "getAllTracksForPlayback", "Lcom/soundcloud/android/foundation/domain/Urn;", "isPublicOrOwnedPrivateTrack", "track", "loggedInUserUrn", "Lcom/soundcloud/java/optional/Optional;", "lazySyncIfStale", "Lcom/soundcloud/android/sync/SyncResult;", "playHistory", "refreshPlayHistory", "startPlaybackFrom", "Lcom/soundcloud/android/playback/PlaybackResult;", "trackUrn", "screen", "Lcom/soundcloud/android/foundation/domain/Screen;", "tracks", "onErrorReturnLocalData", "toUrnList", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse;", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayHistoryOperations.kt */
public class Z {
    public static final a a = new a(null);
    private final Db b;
    private final va c;
    private final HPa d;
    private final ca e;
    private final C2783k f;
    /* access modifiers changed from: private */
    public final C3760eea g;
    /* access modifiers changed from: private */
    public final Ca h;
    /* access modifiers changed from: private */
    public final Ica i;

    /* compiled from: PlayHistoryOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Z(Db db, va vaVar, HPa hPa, ca caVar, C2783k kVar, C3760eea eea, Ca ca, Ica ica) {
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(vaVar, "playHistoryStorage");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(caVar, "syncOperations");
        C7471uYa.b(kVar, "clearPlayHistoryCommand");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(ca, "trackItemRepository");
        C7471uYa.b(ica, "sessionProvider");
        this.b = db;
        this.c = vaVar;
        this.d = hPa;
        this.e = caVar;
        this.f = kVar;
        this.g = eea;
        this.h = ca;
        this.i = ica;
    }

    public APa<List<C6185ma>> b(int i2) {
        APa<List<C6185ma>> d2 = c().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C2775ea<Object,Object>(this, i2));
        C7471uYa.a((Object) d2, "lazySyncIfStale()\n      …le { _ -> tracks(limit) }");
        return d2;
    }

    public APa<List<C6185ma>> c(int i2) {
        APa<List<C6185ma>> d2 = this.e.a(na.PLAY_HISTORY).a(this.d).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C2777fa<Object,Object>(this, i2));
        C7471uYa.a((Object) d2, "syncOperations.failSafeS…le { _ -> tracks(limit) }");
        return d2;
    }

    public static /* synthetic */ APa a(Z z, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = 1000;
            }
            return z.b(i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playHistory");
    }

    private IPa<List<C3508cda>> b() {
        IPa<List<C3508cda>> b2 = this.c.e().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C2771ca<Object,Object>(this)).b(this.d);
        C7471uYa.a((Object) b2, "playHistoryStorage.loadT…  .subscribeOn(scheduler)");
        return b2;
    }

    private IPa<ia> c() {
        IPa<ia> a2 = this.e.b(na.PLAY_HISTORY).a(this.d).a(IPa.a(ia.c()));
        C7471uYa.a((Object) a2, "syncOperations.lazySyncI….just(SyncResult.noOp()))");
        return a2;
    }

    public APa<List<C6185ma>> a(int i2) {
        APa<List<C6185ma>> d2 = c().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C2767aa<Object,Object>(this, i2));
        C7471uYa.a((Object) d2, "lazySyncIfStale()\n      …ReturnLocalData = true) }");
        return d2;
    }

    static /* synthetic */ APa a(Z z, int i2, boolean z2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                z2 = false;
            }
            return z.a(i2, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tracks");
    }

    /* access modifiers changed from: private */
    public APa<List<C6185ma>> a(int i2, boolean z) {
        if (i2 >= 0 && 1000 >= i2) {
            APa<List<C6185ma>> c2 = this.c.a(i2 * 30).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new ia<Object,Object>(this, z, i2));
            C7471uYa.a((Object) c2, "playHistoryStorage.loadT…         })\n            }");
            return c2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("limit must be in range of 0 to 1000, but was ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* access modifiers changed from: private */
    public boolean a(C6185ma maVar, C4928GKa<C3508cda> gKa) {
        if (maVar.m()) {
            Object d2 = gKa.b((Function<? super T, V>) new C2773da<Object,V>(maVar)).d(Boolean.valueOf(false));
            C7471uYa.a(d2, "loggedInUserUrn.transfor…rUrn() == urn }.or(false)");
            if (!((Boolean) d2).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public IPa<C4536zc> a(C3508cda cda, Yca yca) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(yca, "screen");
        Db db = this.b;
        IPa b2 = b();
        PlaySessionSource a2 = PlaySessionSource.a(yca);
        C7471uYa.a((Object) a2, "PlaySessionSource.forHistory(screen)");
        return Db.a(db, b2, cda, 0, a2, 0, 16, null);
    }

    public IPa<Boolean> a() {
        IPa<Boolean> b2 = this.f.c().b(this.d);
        C7471uYa.a((Object) b2, "clearPlayHistoryCommand.…  .subscribeOn(scheduler)");
        return b2;
    }

    public List<C3508cda> a(Ida<C3509cea> ida) {
        C7471uYa.b(ida, "$this$toUrnList");
        List<C3509cea> a2 = Nda.a(ida);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C3509cea y : a2) {
            arrayList.add(y.y());
        }
        return arrayList;
    }
}
