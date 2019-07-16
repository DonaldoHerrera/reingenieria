package com.soundcloud.android.likes;

import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.tracks.Ca;
import java.util.List;

@EVa(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001$B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0012J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0012J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010\u001b\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0012H\u0012J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u0011H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0016J\u0012\u0010#\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020 0\u0012H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/soundcloud/android/likes/TrackLikeOperations;", "", "likesReadStorage", "Lcom/soundcloud/android/collections/data/LikesReadStorage;", "scheduler", "Lio/reactivex/Scheduler;", "trackRepo", "Lcom/soundcloud/android/tracks/TrackItemRepository;", "likesStateProvider", "Lcom/soundcloud/android/likes/LikesStateProvider;", "collectionSyncer", "Lcom/soundcloud/android/collection/CollectionSyncer;", "(Lcom/soundcloud/android/collections/data/LikesReadStorage;Lio/reactivex/Scheduler;Lcom/soundcloud/android/tracks/TrackItemRepository;Lcom/soundcloud/android/likes/LikesStateProvider;Lcom/soundcloud/android/collection/CollectionSyncer;)V", "likedTrackCount", "Lio/reactivex/Observable;", "", "likedTrackUrns", "Lio/reactivex/Single;", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "likedTracks", "Lcom/soundcloud/android/likes/LikeWithTrack;", "beforeTime", "", "likes", "Lcom/soundcloud/android/likes/TrackLikesPage;", "liveLikesFromStorageFrom", "latest", "nextPageItems", "currentPage", "pageChanges", "initialTrackLikes", "Lcom/soundcloud/android/collections/data/Like;", "updatedLikedTracks", "updatedLikes", "lastTime", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.likes.z reason: case insensitive filesystem */
/* compiled from: TrackLikeOperations.kt */
public class C4001z {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public final K b;
    private final HPa c;
    /* access modifiers changed from: private */
    public final Ca d;
    private final C3989m e;
    private final Aa f;

    /* renamed from: com.soundcloud.android.likes.z$a */
    /* compiled from: TrackLikeOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4001z(K k, HPa hPa, Ca ca, C3989m mVar, Aa aa) {
        C7471uYa.b(k, "likesReadStorage");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(ca, "trackRepo");
        C7471uYa.b(mVar, "likesStateProvider");
        C7471uYa.b(aa, "collectionSyncer");
        this.b = k;
        this.c = hPa;
        this.d = ca;
        this.e = mVar;
        this.f = aa;
    }

    private APa<Integer> d() {
        APa<Integer> h = this.e.d().a(this.c).h(A.a);
        C7471uYa.a((Object) h, "likesStateProvider.liked…ter { it.isTrack }.size }");
        return h;
    }

    public APa<T> c() {
        APa<T> b2 = this.f.b().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new J<Object,Object>(this)).b(this.c);
        C7471uYa.a((Object) b2, "collectionSyncer.failSaf…  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<T> b() {
        APa<T> b2 = this.f.h().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new D<Object,Object>(this)).b(this.c);
        C7471uYa.a((Object) b2, "collectionSyncer.lazySyn…  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<T> a(T t) {
        C7471uYa.b(t, "currentPage");
        if (t.a().isEmpty()) {
            return null;
        }
        return b(((C2862s) C7676xWa.h(t.a())).b().getTime()).b(this.c);
    }

    /* access modifiers changed from: private */
    public APa<T> b(long j) {
        APa<T> c2 = d().d(1).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new F<Object,Object>(this, j));
        C7471uYa.a((Object) c2, "likedTrackCount().take(1…          }\n            }");
        return c2;
    }

    /* access modifiers changed from: private */
    public APa<T> a(long j, List<C2862s> list) {
        APa<T> m = d().c(1).m(new H(this, j, list));
        C7471uYa.a((Object) m, "likedTrackCount().skip(1…it, newCount) }\n        }");
        return m;
    }

    public IPa<List<C3987k>> a(long j) {
        IPa<List<C3987k>> b2 = this.b.b(j, 30).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C<Object,Object>(this)).b(this.c);
        C7471uYa.a((Object) b2, "likesReadStorage.loadTra…  .subscribeOn(scheduler)");
        return b2;
    }

    public IPa<List<C3508cda>> a() {
        IPa<List<C3508cda>> b2 = this.b.c().b(this.c);
        C7471uYa.a((Object) b2, "likesReadStorage.loadTra…  .subscribeOn(scheduler)");
        return b2;
    }

    public long a(List<C2862s> list) {
        C7471uYa.b(list, "$this$lastTime");
        if (list.isEmpty()) {
            return 0;
        }
        return ((C2862s) C7676xWa.h((List) list)).b().getTime();
    }
}
