package defpackage;

import android.content.ContentValues;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 Y2\u00020\u0001:\u0002YZB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0012J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0012J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0016H\u0012J\u0016\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160$H\u0012J3\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0016H\u0010¢\u0006\u0002\b+J0\u0010,\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0016H\u0012J\u0018\u0010/\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0012J \u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u000203H\u0012J\b\u00104\u001a\u00020(H\u0016J\b\u00105\u001a\u00020(H\u0012J\b\u00106\u001a\u00020(H\u0012J\b\u00107\u001a\u000208H\u0012J\u0010\u00109\u001a\n :*\u0004\u0018\u00010808H\u0012J\"\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00150\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0016J\"\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00150\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0012J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010!\u001a\u00020\u0016H\u0016J$\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000e2\u000e\b\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0012J\"\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0\u000e2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0016J\"\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000e2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0012J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160$H\u0016J\"\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0012J\u001e\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0012J\u0010\u0010K\u001a\u00020(2\u0006\u0010E\u001a\u00020LH\u0012J\u0010\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0016H\u0016J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001c0?2\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0018\u0010Q\u001a\u00020R2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u0012H\u0016J\u0016\u0010T\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00160V2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010W\u001a\b\u0012\u0004\u0012\u00020<0\u0015*\u00020XH\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lcom/soundcloud/android/playlists/PlaylistStorage;", "", "propeller", "Lcom/soundcloud/propeller/PropellerDatabase;", "propellerRx", "Lcom/soundcloud/propeller/rx/PropellerRx;", "playlistMapper", "Lcom/soundcloud/android/playlists/NewPlaylistMapper;", "storePlaylistsCommand", "Lcom/soundcloud/android/commands/StorePlaylistsCommand;", "dateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "(Lcom/soundcloud/propeller/PropellerDatabase;Lcom/soundcloud/propeller/rx/PropellerRx;Lcom/soundcloud/android/playlists/NewPlaylistMapper;Lcom/soundcloud/android/commands/StorePlaylistsCommand;Lcom/soundcloud/android/utilities/android/date/DateProvider;)V", "asyncStorePlaylists", "Lio/reactivex/Single;", "Lcom/soundcloud/propeller/WriteResult;", "playlists", "", "Lcom/soundcloud/android/foundation/domain/playlists/ApiPlaylist;", "availablePlaylists", "Lio/reactivex/Observable;", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "playlistUrns", "", "buildPermalinkQuery", "Lcom/soundcloud/propeller/query/Query;", "permalink", "", "buildPlaylistContentValues", "Landroid/content/ContentValues;", "playlist", "buildPlaylistModificationQuery", "playlistUrn", "buildPlaylistQuery", "urns", "", "createNewPlaylist", "title", "isPrivate", "", "firstTrackUrn", "creatorUrn", "createNewPlaylist$base_release", "createPlaylistValues", "createdAt", "", "getContentValuesForPlaylistTrack", "playlistNumericId", "trackUrn", "position", "", "hasLocalChanges", "hasLocalPlaylistChange", "hasLocalTrackChanges", "hasLocalTracks", "Lcom/soundcloud/propeller/query/Where;", "isNotLocal", "kotlin.jvm.PlatformType", "livePlaylists", "Lcom/soundcloud/android/foundation/domain/playlists/Playlist;", "loadPlaylistBatch", "loadPlaylistModifications", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/sync/playlists/LocalPlaylistChange;", "loadPlaylistWithTracksBatch", "loadPlaylistsWithTracks", "trackUrns", "playlistIdsQueryResult", "it", "playlistWithTrackChanges", "playlistsChange", "playlistsChanged", "", "writeResult", "readBoolean", "Lcom/soundcloud/propeller/CursorReader;", "removePlaylist", "Lcom/soundcloud/propeller/ChangeResult;", "playListUrn", "secretToken", "storePlaylistInTransaction", "Lcom/soundcloud/propeller/InsertResult;", "newPlaylist", "storePlaylists", "urnForPermalink", "Lio/reactivex/Maybe;", "toPlaylistItems", "Lcom/soundcloud/propeller/QueryResult;", "Companion", "PlaylistModificationMapper", "base_release"}, mv = {1, 1, 15})
/* renamed from: dsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistStorage.kt */
public class C6332dsa {
    /* access modifiers changed from: private */
    public static final C7744yVa a = BVa.a(C6264csa.a);
    public static final a b = new a(null);
    private final C5500ZKa c;
    private final C4898FLa d;
    private final C5537_pa e;
    private final C1409jT f;
    private final C5694cGa g;

    /* renamed from: dsa$a */
    /* compiled from: PlaylistStorage.kt */
    public static final class a {
        static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(a.class), "playlistChangedSubject", "getPlaylistChangedSubject()Lio/reactivex/subjects/BehaviorSubject;"))};

        private a() {
        }

        /* access modifiers changed from: private */
        public final C6713jVa<List<C3508cda>> a() {
            C7744yVa a2 = C6332dsa.a;
            a aVar = C6332dsa.b;
            DZa dZa = a[0];
            return (C6713jVa) a2.getValue();
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: dsa$b */
    /* compiled from: PlaylistStorage.kt */
    private static final class b implements C6295dLa<C7376tBa> {
        public C7376tBa a(C5326TKa tKa) {
            C7471uYa.b(tKa, "cursorReader");
            C3508cda c = C3508cda.c(tKa.c(e.d));
            String d = tKa.d(e.p);
            C3492ada a = C3492ada.a(tKa.d(e.y));
            C7471uYa.a((Object) a, "Sharing.from(cursorReade…g(Tables.Sounds.SHARING))");
            C7376tBa a2 = C7376tBa.a(c, d, a.a());
            C7471uYa.a((Object) a2, "LocalPlaylistChange.crea…).isPrivate\n            )");
            return a2;
        }
    }

    public C6332dsa(C5500ZKa zKa, C4898FLa fLa, C5537_pa _pa, C1409jT jTVar, C5694cGa cga) {
        C7471uYa.b(zKa, "propeller");
        C7471uYa.b(fLa, "propellerRx");
        C7471uYa.b(_pa, "playlistMapper");
        C7471uYa.b(jTVar, "storePlaylistsCommand");
        C7471uYa.b(cga, "dateProvider");
        this.c = zKa;
        this.d = fLa;
        this.e = _pa;
        this.f = jTVar;
        this.g = cga;
    }

    private boolean d() {
        String str = "_type";
        Object a2 = this.c.a(C6975nLa.a((C6635iLa) C6703jLa.a((C6975nLa) ((C6975nLa) C6975nLa.a(e.c).a(c.d, e.L).d(str, (Object) Integer.valueOf(1))).b(e.d, (Object) Integer.valueOf(0))).d("has_local_playlists").c(e.L))).a((C6295dLa<T>) new C6876lsa<T>(this));
        C7471uYa.a(a2, "propeller.query(\n       …first { readBoolean(it) }");
        return ((Boolean) a2).booleanValue();
    }

    private boolean e() {
        Object a2 = this.c.a(C6975nLa.a((C6635iLa) C6703jLa.a(C6975nLa.a(_ea.PlaylistTracks.name()).a("playlist_id").a(f()).a(g())))).a((C6295dLa<T>) new C6944msa<T>(this));
        C7471uYa.a(a2, "propeller.query(\n       …first { readBoolean(it) }");
        return ((Boolean) a2).booleanValue();
    }

    private C7113pLa f() {
        C7113pLa c2 = C6907mLa.a().b(_ea.PlaylistTracks.a("added_at")).c(_ea.PlaylistTracks.a("removed_at"));
        C7471uYa.a((Object) c2, "filter()\n            .wh…aylistTracks.REMOVED_AT))");
        return c2;
    }

    private C7113pLa g() {
        return C6907mLa.a().a("playlist_id", (Object) Integer.valueOf(0));
    }

    public C4928GKa<String> c(C3508cda cda) {
        C7471uYa.b(cda, "playlistUrn");
        Object a2 = this.c.a((C6975nLa) ((C6975nLa) C6975nLa.a(e.c).a(e.S).a(e.d, (Object) Long.valueOf(cda.c()))).a(e.e, (Object) Integer.valueOf(1))).a((C6295dLa<T>) C4817Csa.a, C4928GKa.a());
        C7471uYa.a(a2, "propeller.query(\n       …bsent<String>()\n        )");
        return (C4928GKa) a2;
    }

    public boolean b() {
        return d() || e();
    }

    public APa<List<Eda>> b(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "playlistUrns");
        APa<List<Eda>> g2 = e(collection).g(new C7289rsa(this, collection));
        C7471uYa.a((Object) g2, "playlistsChange(playlist…{ it.toList() }\n        }");
        return g2;
    }

    public C6499gLa b(Iterable<C3927zda> iterable) {
        C7471uYa.b(iterable, "playlists");
        C6499gLa gla = (C6499gLa) this.f.a(iterable);
        C7471uYa.a((Object) gla, "writeResult");
        a(gla, iterable);
        return gla;
    }

    public C5266RKa b(C3508cda cda) {
        C7471uYa.b(cda, "playListUrn");
        C5266RKa a2 = this.c.a((C5116MLa) e.c, C6907mLa.a().a(e.e, (Object) Integer.valueOf(1)).a(e.d, (Object) Long.valueOf(cda.c())));
        C7471uYa.a((Object) a2, "propeller.delete(\n      …tUrn.numericId)\n        )");
        return a2;
    }

    public C7531vPa<C3508cda> a(String str) {
        C7471uYa.b(str, "permalink");
        if (!Cxb.b(str, "/", false, 2, null)) {
            C7531vPa<C3508cda> f2 = this.d.a(b(str)).a((C7256rQa<? super T>) C4848Dsa.a).h(C4910Fsa.a).f();
            C7471uYa.a((Object) f2, "propellerRx.query(buildP…          .firstElement()");
            return f2;
        }
        throw new IllegalArgumentException("Permalink must not start with a '/' and must not be a url.");
    }

    private APa<Set<C3508cda>> e(Collection<C3508cda> collection) {
        APa<Set<C3508cda>> d2 = b.a().h(new C4786Bsa(collection)).d();
        C7471uYa.a((Object) d2, "playlistChangedSubject\n …  .distinctUntilChanged()");
        return d2;
    }

    public Set<C3508cda> c() {
        String str = "playlist_id";
        C5631bLa<C5326TKa> a2 = this.c.a(C6975nLa.a(_ea.PlaylistTracks.name()).a(str).a(f()).a(g()));
        C7471uYa.a((Object) a2, "queryResult");
        ArrayList arrayList = new ArrayList();
        for (C5326TKa d2 : a2) {
            C3508cda c2 = C3508cda.c(d2.d(str));
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return C7676xWa.t(arrayList);
    }

    private C6975nLa b(String str) {
        C6975nLa a2 = C6975nLa.a(c.c).a(c.d);
        C5085LLa lLa = c.o;
        StringBuilder sb = new StringBuilder();
        sb.append("https://soundcloud.com/");
        sb.append(str);
        C6975nLa a3 = ((C6975nLa) a2.a(lLa, sb.toString())).a(1);
        C7471uYa.a((Object) a3, "Query.from(Tables.Playli…nk)\n            .limit(1)");
        return a3;
    }

    /* access modifiers changed from: private */
    public IPa<List<Eda>> d(Collection<C3508cda> collection) {
        C4898FLa fLa = this.d;
        HashSet a2 = C2458bE.a((Iterable<? extends E>) collection);
        C7471uYa.a((Object) a2, "Sets.newHashSet(playlistUrns)");
        IPa<List<Eda>> b2 = fLa.a(a((Set<C3508cda>) a2)).h(new C7358ssa(this)).b(C6918mWa.a());
        C7471uYa.a((Object) b2, "propellerRx.query(buildP…      .first(emptyList())");
        return b2;
    }

    /* access modifiers changed from: private */
    public boolean a(C5326TKa tKa) {
        return tKa.d(0) == 1;
    }

    /* access modifiers changed from: private */
    public IPa<List<C3508cda>> b(List<C3508cda> list) {
        IPa<List<C3508cda>> g2 = this.d.a((C6975nLa) ((C6975nLa) C6975nLa.a(c.c).a(c.d).c(c.x, (Object) Integer.valueOf(0))).a(c.d, C5526_Ha.a((Collection<C3508cda>) list))).h(C4755Asa.a).g();
        C7471uYa.a((Object) g2, "propellerRx.query(\n     …          .firstOrError()");
        return g2;
    }

    private C6975nLa d(C3508cda cda) {
        C7182qLa b2 = ((C6975nLa) ((C6975nLa) C6975nLa.a(e.c).a(e.d, e.p, e.y).a(e.d, (Object) Long.valueOf(cda.c()))).a(e.e, (Object) Integer.valueOf(1))).b(e.M);
        C7471uYa.a((Object) b2, "Query.from(Tables.Sounds…ables.Sounds.MODIFIED_AT)");
        return (C6975nLa) b2;
    }

    public APa<List<C3508cda>> a(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "playlistUrns");
        APa<List<C3508cda>> g2 = e(collection).g(new C6604hsa(this, collection));
        C7471uYa.a((Object) g2, "playlistsChange(playlist… list + batch }\n        }");
        return g2;
    }

    public IPa<C6499gLa> a(Iterable<C3927zda> iterable) {
        C7471uYa.b(iterable, "playlists");
        IPa<C6499gLa> c2 = this.f.c(iterable).c((C6776kQa<? super T>) new C6400esa<Object>(this, iterable));
        C7471uYa.a((Object) c2, "storePlaylistsCommand.to…sChanged(it, playlists) }");
        return c2;
    }

    /* access modifiers changed from: private */
    public void a(C6499gLa gla, Iterable<C3927zda> iterable) {
        if (gla.b()) {
            C6713jVa a2 = b.a();
            ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
            for (C3927zda a3 : iterable) {
                arrayList.add(a3.a());
            }
            a2.a(arrayList);
        }
    }

    public IPa<Set<C3508cda>> c(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "trackUrns");
        IPa<Set<C3508cda>> e2 = APa.a((Iterable<? extends T>) C7676xWa.b((Iterable) collection, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)).g(new C7565vsa(this)).a((Callable<? extends U>) C7634wsa.a, (C6436fQa<? super U, ? super T>) C7703xsa.a).e(C7772ysa.a);
        C7471uYa.a((Object) e2, "Observable.fromIterable(…      .map { it.toSet() }");
        return e2;
    }

    public C5413WKa a(C5500ZKa zKa, C3927zda zda) {
        C7471uYa.b(zKa, "propeller");
        C7471uYa.b(zda, "newPlaylist");
        C5413WKa a2 = zKa.a((C5116MLa) e.c, a(zda));
        C7471uYa.a((Object) a2, "propeller.insert(Tables.…ntentValues(newPlaylist))");
        return a2;
    }

    public IPa<C3508cda> a(String str, boolean z, C3508cda cda, C3508cda cda2) {
        String str2 = str;
        C7471uYa.b(str, "title");
        C3508cda cda3 = cda;
        C7471uYa.b(cda3, "firstTrackUrn");
        C3508cda cda4 = cda2;
        C7471uYa.b(cda4, "creatorUrn");
        long a2 = this.g.a();
        C3508cda L = C3508cda.L();
        C4898FLa fLa = this.d;
        C6740jsa jsa = new C6740jsa(this, L, a2, str2, z, cda4, cda3);
        IPa<C3508cda> e2 = fLa.a((defpackage.C5500ZKa.a) jsa).p().e(new C6808ksa(L));
        C7471uYa.a((Object) e2, "propellerRx.runTransacti…rError().map { playlist }");
        return e2;
    }

    /* access modifiers changed from: private */
    public IPa<List<C3508cda>> a(List<C3508cda> list) {
        C4898FLa fLa = this.d;
        C6975nLa a2 = C6975nLa.a(_ea.PlaylistTracks.name()).a("playlist_id");
        ArrayList arrayList = new ArrayList(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r2v2 'arrayList' java.util.ArrayList) = (wrap: int
              0x0020: INVOKE  (r3v4 int) = (r6v0 'list' java.util.List<cda>), (10 int) kWa.a(java.lang.Iterable, int):int type: STATIC) java.util.ArrayList.<init>(int):void CONSTRUCTOR in method: dsa.a(java.util.List):IPa<java.util.List<cda>>, dex: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:76)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:32)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
            	at jadx.core.ProcessClass.process(ProcessClass.java:36)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  (r3v4 int) = (r6v0 'list' java.util.List<cda>), (10 int) kWa.a(java.lang.Iterable, int):int type: STATIC in method: dsa.a(java.util.List):IPa<java.util.List<cda>>, dex: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:773)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:625)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:353)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
            	... 19 more
            Caused by: java.util.ConcurrentModificationException
            	at java.util.ArrayList.removeIf(Unknown Source)
            	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:86)
            	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:90)
            	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:130)
            	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:134)
            	at jadx.core.codegen.InsnGen.inlineMethod(InsnGen.java:892)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:669)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
            	... 24 more
            */
        /*
            this = this;
            FLa r0 = r5.d
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            _ea r3 = defpackage._ea.PlaylistTracks
            java.lang.String r3 = r3.name()
            r4 = 0
            r2[r4] = r3
            nLa r2 = defpackage.C6975nLa.a(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "playlist_id"
            r1[r4] = r3
            nLa r1 = r2.a(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.C6986nWa.a(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L_0x002b:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r6.next()
            cda r3 = (defpackage.C3508cda) r3
            long r3 = r3.c()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.add(r3)
            goto L_0x002b
        L_0x0043:
            java.lang.String r6 = "track_id"
            qLa r6 = r1.b(r6, r2)
            nLa r6 = (defpackage.C6975nLa) r6
            APa r6 = r0.a(r6)
            usa r0 = defpackage.C7496usa.a
            APa r6 = r6.h(r0)
            java.util.List r0 = defpackage.C6918mWa.a()
            IPa r6 = r6.b(r0)
            java.lang.String r0 = "propellerRx.query(\n     …      .first(emptyList())"
            defpackage.C7471uYa.a(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6332dsa.a(java.util.List):IPa");
    }

    public C4928GKa<C7376tBa> a(C3508cda cda) {
        C7471uYa.b(cda, "playlistUrn");
        C4928GKa<C7376tBa> b2 = C4928GKa.b(this.c.a(d(cda)).a((C6295dLa<T>) new b<T>(), null));
        C7471uYa.a((Object) b2, "Optional.fromNullable(pr…ificationMapper(), null))");
        return b2;
    }

    private C6975nLa a(Set<C3508cda> set) {
        List a2 = C5526_Ha.a((List<C3508cda>) new ArrayList<C3508cda>(set));
        C7471uYa.a((Object) a2, "toIds(ArrayList(urns))");
        C6975nLa a3 = C6975nLa.a(c.c);
        StringBuilder sb = new StringBuilder();
        sb.append(c.c.name());
        sb.append(".*");
        C7182qLa a4 = a3.a(sb.toString()).a(c.d, (Collection<?>) a2);
        C7471uYa.a((Object) a4, "Query.from(Tables.Playli…listView.ID, playlistIds)");
        return (C6975nLa) a4;
    }

    private ContentValues a(C3927zda zda) {
        C5296SKa a2 = C5296SKa.b().a(e.d, zda.a().c()).a(e.e, 1).a(e.p, zda.getTitle()).a(e.k, zda.h()).a(e.f, zda.g().getTime()).a(e.y, zda.n().b()).a(e.E, zda.o().a()).a(e.F, zda.o().b()).a(e.K, zda.q()).a(e.H, zda.s().l().c()).a(e.j, zda.i());
        C5085LLa lLa = e.n;
        List p = zda.p();
        ContentValues a3 = a2.a(lLa, p != null ? C7676xWa.a(p, null, null, null, 0, null, C6672isa.a, 31, null) : null).a(e.q, zda.j()).a(e.r, (String) zda.b().d()).a(e.O, zda.t()).a(e.P, zda.m()).a(e.Q, zda.k()).a(e.S, zda.l()).a(e.g, zda.r().getTime()).a();
        C7471uYa.a((Object) a3, "ContentValuesBuilder.val….time)\n            .get()");
        return a3;
    }

    private ContentValues a(long j, C3508cda cda, int i) {
        String str = "added_at";
        ContentValues a2 = C5296SKa.b().a("playlist_id", j).a("track_id", cda.c()).a("position", i).a(str, this.g.b().getTime()).a();
        C7471uYa.a((Object) a2, "ContentValuesBuilder.val….time)\n            .get()");
        return a2;
    }

    /* access modifiers changed from: private */
    public ContentValues a(C3508cda cda, C3508cda cda2) {
        return a(cda.c(), cda2, 0);
    }

    /* access modifiers changed from: private */
    public ContentValues a(C3508cda cda, long j, String str, boolean z, C3508cda cda2) {
        String str2 = "";
        ContentValues a2 = C5296SKa.b().a(e.d, cda.c()).a(e.e, 1).a(e.p, str).a(e.y, (z ? C3492ada.PRIVATE : C3492ada.PUBLIC).b()).a(e.f, j).a(e.g, j).a(e.H, cda2.c()).a(e.P, str2).a(e.Q, str2).a();
        C7471uYa.a((Object) a2, "ContentValuesBuilder.val…EMPTY)\n            .get()");
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=bLa, code=bLa<TKa>, for r4v0, types: [bLa, bLa<TKa>, java.lang.Iterable] */
    public List<Eda> a(C5631bLa<C5326TKa> bla) {
        ArrayList arrayList = new ArrayList();
        for (C5326TKa a2 : bla) {
            Eda a3 = this.e.a(a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }
}
