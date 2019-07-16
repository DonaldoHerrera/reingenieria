package defpackage;

import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.collections.data.C2852h;
import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.collections.data.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@EVa(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0012J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000e0\u0018H\u0012J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0012J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\u0018H\u0012J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0010¢\u0006\u0002\b J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0012J\u0018\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/soundcloud/android/collection/playlists/MyPlaylistOperations;", "", "collectionSyncer", "Lcom/soundcloud/android/collection/CollectionSyncer;", "likesReadStorage", "Lcom/soundcloud/android/collections/data/LikesReadStorage;", "postsStorage", "Lcom/soundcloud/android/posts/PostsStorage;", "playlistItemRepository", "Lcom/soundcloud/android/playlists/PlaylistItemRepository;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/collection/CollectionSyncer;Lcom/soundcloud/android/collections/data/LikesReadStorage;Lcom/soundcloud/android/posts/PostsStorage;Lcom/soundcloud/android/playlists/PlaylistItemRepository;Lio/reactivex/Scheduler;)V", "filterAndSort", "", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistItem;", "values", "", "options", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistsOptions;", "postsAndLikes", "", "Lcom/soundcloud/android/collections/data/Collectable;", "loadPlaylistLikes", "Lio/reactivex/Single;", "Lcom/soundcloud/android/collections/data/Like;", "loadPlaylists", "Lio/reactivex/Observable;", "loadPostedPlaylists", "Lcom/soundcloud/android/posts/Post;", "myPlaylists", "refreshAndLoadPlaylists", "refreshAndLoadPlaylists$base_release", "sortByAddedAt", "", "rhs", "lhs", "sortByUpdatedAt", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: AS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations.kt */
public class C1938AS {
    public static final a a = new a(null);
    private final Aa b;
    private final K c;
    private final C4942Gta d;
    /* access modifiers changed from: private */
    public final C4785Bra e;
    private final HPa f;

    /* renamed from: AS$a */
    /* compiled from: MyPlaylistOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C1938AS(Aa aa, K k, C4942Gta gta, C4785Bra bra, HPa hPa) {
        C7471uYa.b(aa, "collectionSyncer");
        C7471uYa.b(k, "likesReadStorage");
        C7471uYa.b(gta, "postsStorage");
        C7471uYa.b(bra, "playlistItemRepository");
        C7471uYa.b(hPa, "scheduler");
        this.b = aa;
        this.c = k;
        this.d = gta;
        this.e = bra;
        this.f = hPa;
    }

    /* access modifiers changed from: private */
    public APa<List<C3863rda>> c(C3871sda sda) {
        IPa iPa;
        if (sda.a() && !sda.c()) {
            iPa = a().e(C2038FS.a);
            C7471uYa.a((Object) iPa, "loadPlaylistLikes().map { it.toSet() }");
        } else if (!sda.c() || sda.a()) {
            iPa = b().a((MPa<U>) a(), (C6504gQa<? super T, ? super U, ? extends R>) C2078HS.a);
            C7471uYa.a((Object) iPa, "loadPostedPlaylists().zi…s union likedPlaylists })");
        } else {
            iPa = b().e(C2058GS.a);
            C7471uYa.a((Object) iPa, "loadPostedPlaylists().map { it.toSet() }");
        }
        APa<List<C3863rda>> d2 = iPa.b(this.f).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C2116JS<Object,Object>(this, sda));
        C7471uYa.a((Object) d2, "when {\n            optio…istinct() }\n            }");
        return d2;
    }

    public APa<List<C3863rda>> b(C3871sda sda) {
        C7471uYa.b(sda, "options");
        APa<List<C3863rda>> a2 = this.b.j().a((EPa<T>) c(sda));
        C7471uYa.a((Object) a2, "collectionSyncer\n       …n(loadPlaylists(options))");
        return a2;
    }

    private IPa<List<C7843zta>> b() {
        IPa<List<C7843zta>> b2 = this.d.a(Integer.valueOf(1000), Long.MAX_VALUE).b(this.f);
        C7471uYa.a((Object) b2, "postsStorage.loadPostedP…  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<List<C3863rda>> a(C3871sda sda) {
        C7471uYa.b(sda, "options");
        APa<List<C3863rda>> b2 = this.b.g().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C2135KS<Object,Object>(this, sda)).b(this.f);
        C7471uYa.a((Object) b2, "collectionSyncer\n       … }.subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public List<C3863rda> a(Collection<? extends C3863rda> collection, C3871sda sda, Set<? extends C2852h> set) {
        Comparator comparator;
        Set t = C7676xWa.t(collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = t.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Object next = it.next();
                C3863rda rda = (C3863rda) next;
                boolean b2 = sda.b();
                if (b2) {
                    if (rda.r() == C3823mda.NOT_OFFLINE) {
                        z = false;
                    }
                } else if (b2) {
                    throw new FVa();
                }
                if (z) {
                    arrayList.add(next);
                }
            } else {
                int i = C1958BS.a[sda.d().ordinal()];
                if (i == 1) {
                    comparator = C1978CS.a;
                } else if (i == 2) {
                    comparator = new C1998DS(this);
                } else if (i == 3) {
                    comparator = new C2018ES(this, set);
                } else {
                    throw new FVa();
                }
                return C7676xWa.a((Iterable) arrayList, comparator);
            }
        }
    }

    /* access modifiers changed from: private */
    public int a(C3863rda rda, C3863rda rda2) {
        int compareTo = rda.H().k().compareTo(rda2.H().k());
        return compareTo == 0 ? rda.E().compareTo(rda2.E()) : compareTo;
    }

    private IPa<List<C2862s>> a() {
        IPa<List<C2862s>> b2 = this.c.a(Long.MAX_VALUE, 1000).b(this.f);
        C7471uYa.a((Object) b2, "likesReadStorage.loadPla…  .subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public int a(C3863rda rda, C3863rda rda2, Set<? extends C2852h> set) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) set, 10));
        for (C2852h hVar : set) {
            arrayList.add(NVa.a(hVar.a(), hVar.b()));
        }
        Map a2 = LWa.a((Iterable) arrayList);
        Object obj = a2.get(rda.a());
        if (obj != null) {
            return ((Date) obj).compareTo((Date) a2.get(rda2.a()));
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
