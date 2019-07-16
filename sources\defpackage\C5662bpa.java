package defpackage;

import com.soundcloud.android.profile.Lc;
import com.soundcloud.android.sync.C6135s;
import com.soundcloud.android.sync.T;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 +2\u00020\u0001:\u0003+,-BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0012J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00182\u0006\u0010 \u001a\u00020!H\u0012J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0#0\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0012J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010 \u001a\u00020!H\u0016J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0#0\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0012J\u0010\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020!H\u0012J\u001a\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\u00182\u0006\u0010 \u001a\u00020!H\u0012J \u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0#*\b\u0012\u0004\u0012\u00020\u001b0#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/soundcloud/android/playlists/DataSourceProvider;", "", "liveEntities", "Lcom/soundcloud/android/presentation/LiveEntities;", "playlistItemRepository", "Lcom/soundcloud/android/playlists/PlaylistItemRepository;", "entitySyncStateStorage", "Lcom/soundcloud/android/sync/EntitySyncStateStorage;", "currentDateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "playlistOperations", "Lcom/soundcloud/android/playlists/PlaylistOperations;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "myPlaylistsOperations", "Lcom/soundcloud/android/collection/playlists/MyPlaylistsUniflowOperations;", "userProfileOperations", "Lcom/soundcloud/android/profile/UserProfileOperations;", "syncInitiator", "Lcom/soundcloud/android/sync/SyncInitiator;", "sessionProvider", "Lcom/soundcloud/android/foundation/accounts/SessionProvider;", "(Lcom/soundcloud/android/presentation/LiveEntities;Lcom/soundcloud/android/playlists/PlaylistItemRepository;Lcom/soundcloud/android/sync/EntitySyncStateStorage;Lcom/soundcloud/android/utilities/android/date/DateProvider;Lcom/soundcloud/android/playlists/PlaylistOperations;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/collection/playlists/MyPlaylistsUniflowOperations;Lcom/soundcloud/android/profile/UserProfileOperations;Lcom/soundcloud/android/sync/SyncInitiator;Lcom/soundcloud/android/foundation/accounts/SessionProvider;)V", "emissions", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/playlists/PlaylistDetailsFeatureModel;", "playlist", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistItem;", "isOwner", "", "liveTracksForPlaylist", "Lcom/soundcloud/android/playlists/DataSourceProvider$TracksResponse;", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "otherPlaylistsByUser", "", "playlistWithExtras", "playlistsForOtherUser", "syncStaleTracks", "Lio/reactivex/Completable;", "tracklistChanges", "Lcom/soundcloud/android/events/PlaylistChangedEvent;", "filterThisPlaylistAndOtherTypes", "Companion", "PlaylistNotFoundException", "TracksResponse", "base_release"}, mv = {1, 1, 15})
/* renamed from: bpa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
public class C5662bpa {
    private static final long a = TimeUnit.DAYS.toMillis(1);
    public static final a b = new a(null);
    /* access modifiers changed from: private */
    public final C5604aua c;
    /* access modifiers changed from: private */
    public final C4785Bra d;
    private final C6135s e;
    private final C5694cGa f;
    /* access modifiers changed from: private */
    public final C4909Fra g;
    private final C5327TLa h;
    private final C2287SS i;
    private final Lc j;
    private final T k;
    private final Ica l;

    /* renamed from: bpa$a */
    /* compiled from: DataSourceProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: bpa$b */
    /* compiled from: DataSourceProvider.kt */
    public static final class b extends Exception {
        public b(C3508cda cda) {
            C7471uYa.b(cda, "urn");
            StringBuilder sb = new StringBuilder();
            sb.append("Playlist not found in playlist details: ");
            sb.append(cda);
            super(sb.toString());
        }
    }

    /* renamed from: bpa$c */
    /* compiled from: DataSourceProvider.kt */
    public static final class c {
        private final List<C6185ma> a;
        private final Exception b;

        public c(List<? extends C6185ma> list, Exception exc) {
            C7471uYa.b(list, "tracks");
            this.a = list;
            this.b = exc;
        }

        public final Exception a() {
            return this.b;
        }

        public final List<C6185ma> b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<C6185ma> list = this.a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            Exception exc = this.b;
            if (exc != null) {
                i = exc.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TracksResponse(tracks=");
            sb.append(this.a);
            sb.append(", error=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public C5662bpa(C5604aua aua, C4785Bra bra, C6135s sVar, C5694cGa cga, C4909Fra fra, C5327TLa tLa, C2287SS ss, Lc lc, T t, Ica ica) {
        C7471uYa.b(aua, "liveEntities");
        C7471uYa.b(bra, "playlistItemRepository");
        C7471uYa.b(sVar, "entitySyncStateStorage");
        C7471uYa.b(cga, "currentDateProvider");
        C7471uYa.b(fra, "playlistOperations");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(ss, "myPlaylistsOperations");
        C7471uYa.b(lc, "userProfileOperations");
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(ica, "sessionProvider");
        this.c = aua;
        this.d = bra;
        this.e = sVar;
        this.f = cga;
        this.g = fra;
        this.h = tLa;
        this.i = ss;
        this.j = lc;
        this.k = t;
        this.l = ica;
    }

    /* access modifiers changed from: private */
    public APa<Jaa<?>> d(C3508cda cda) {
        C5327TLa tLa = this.h;
        C5443XLa<Jaa> xLa = C3876taa.q;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYLIST_CHANGED");
        APa<Jaa<?>> a2 = tLa.a(xLa).a((C7256rQa<? super T>) new C7352spa<Object>(cda)).a((C7256rQa<? super T>) C7421tpa.a);
        C7471uYa.a((Object) a2, "eventBus.queue(EventQueu…LIST_EDITED\n            }");
        return a2;
    }

    private APa<List<C3863rda>> b(C3863rda rda, boolean z) {
        if (z) {
            C2287SS ss = this.i;
            C3871sda sda = new C3871sda(C3911xda.ADDED_AT, false, true, false, 8, null);
            APa<List<C3863rda>> h2 = ss.a(sda).h(new C6734jpa(this, rda));
            C7471uYa.a((Object) h2, "myPlaylistsOperations.my…AndOtherTypes(playlist) }");
            return h2;
        }
        IPa a2 = IPa.a(C6918mWa.a());
        C7471uYa.a((Object) a2, "Single.just(emptyList<PlaylistItem>())");
        APa<List<C3863rda>> d2 = a(rda).h(new C6802kpa(this, rda)).d((EPa<? extends T>) a2.j());
        C7471uYa.a((Object) d2, "lazyEmission.startWith(e…rEmission.toObservable())");
        return d2;
    }

    private C6979nPa c(C3508cda cda) {
        if (this.f.a() - a > this.e.a(cda)) {
            C6979nPa e2 = this.k.a(cda).e();
            C7471uYa.a((Object) e2, "syncInitiator.syncPlaylist(urn).ignoreElement()");
            return e2;
        }
        C6979nPa e3 = C6979nPa.e();
        C7471uYa.a((Object) e3, "Completable.complete()");
        return e3;
    }

    public APa<C6464fqa> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        APa<C6464fqa> d2 = this.l.c().h().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C7076opa<Object,Object>(this, cda));
        C7471uYa.a((Object) d2, "sessionProvider.currentU…creatorUrn()) }\n        }");
        return d2;
    }

    /* access modifiers changed from: private */
    public APa<C6464fqa> a(C3863rda rda, boolean z) {
        APa c2 = APa.c(rda);
        C5604aua aua = this.c;
        C3508cda a2 = rda.a();
        String str = "playlist.urn";
        C7471uYa.a((Object) a2, str);
        APa b2 = c2.b((EPa<? extends T>) aua.a(a2).c(1));
        C3508cda a3 = rda.a();
        C7471uYa.a((Object) a3, str);
        APa a4 = APa.a((EPa<? extends T1>) b2, (EPa<? extends T2>) b(a3), (EPa<? extends T3>) C7662xIa.a(b(rda, z), C6918mWa.a()), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new C6258cpa<Object,Object,Object,Object>(z));
        C6464fqa fqa = new C6464fqa(rda, null, z, null, null, 26, null);
        APa<C6464fqa> d2 = a4.e(fqa).d();
        C7471uYa.a((Object) d2, "Observable.combineLatest…  .distinctUntilChanged()");
        return d2;
    }

    private APa<c> b(C3508cda cda) {
        APa<c> d2 = c(cda).b((Callable<? extends T>) C6326dpa.a).f(C6394epa.a).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C6666ipa<Object,Object>(this, cda));
        C7471uYa.a((Object) d2, "syncStaleTracks(urn).toS…          }\n            }");
        return d2;
    }

    private APa<List<C3863rda>> a(C3863rda rda) {
        String str = "userProfileOperations.us…{ it.items().collection }";
        String str2 = "playlist.creatorUrn()";
        if (rda.F()) {
            Lc lc = this.j;
            C3508cda e2 = rda.e();
            C7471uYa.a((Object) e2, str2);
            APa<List<C3863rda>> h2 = lc.c(e2).h(C7145ppa.a);
            C7471uYa.a((Object) h2, str);
            return h2;
        }
        Lc lc2 = this.j;
        C3508cda e3 = rda.e();
        C7471uYa.a((Object) e3, str2);
        APa<List<C3863rda>> h3 = lc2.e(e3).h(C7214qpa.a);
        C7471uYa.a((Object) h3, str);
        return h3;
    }

    /* access modifiers changed from: private */
    public List<C3863rda> a(List<? extends C3863rda> list, C3863rda rda) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C3863rda rda2 = (C3863rda) next;
            boolean z = true;
            if (!(!C7471uYa.a((Object) rda.a(), (Object) rda2.a())) || rda.F() != rda2.F()) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
