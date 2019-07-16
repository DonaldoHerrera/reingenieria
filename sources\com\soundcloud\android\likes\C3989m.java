package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.J;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.collections.data.L;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@EVa(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0001+B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010H\u0016J|\u0010\u0014\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013 \u0015*\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00110\u0011 \u0015**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013 \u0015*\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00110\u0011\u0018\u00010\u00100\u00102\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0012J\b\u0010\u001a\u001a\u00020\u001bH\u0012J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000eH\u0012J\b\u0010 \u001a\u00020\u000eH\u0017J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\"0\u0010H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016J\u001a\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010H\u0012JX\u0010%\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u0015*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\"0\" \u0015*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u0015*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\"0\"\u0018\u00010\u00100\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u0017H\u0012J\b\u0010&\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u001bH\u0016J\u001a\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010H\u0016J\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\"0\u0010H\u0016J\b\u0010*\u001a\u00020\u001bH\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/soundcloud/android/likes/LikesStateProvider;", "Lcom/soundcloud/android/likes/ILikesStateProvider;", "likesStorage", "Lcom/soundcloud/android/collections/data/LikesReadStorage;", "likesWriteStorage", "Lcom/soundcloud/android/collections/data/LikesWriteStorage;", "scheduler", "Lio/reactivex/Scheduler;", "mainThread", "(Lcom/soundcloud/android/collections/data/LikesReadStorage;Lcom/soundcloud/android/collections/data/LikesWriteStorage;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "statuses", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/soundcloud/android/likes/LikedStatuses;", "changes", "Lio/reactivex/Observable;", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "Lcom/soundcloud/android/collections/data/LikeStatus;", "changesByType", "kotlin.jvm.PlatformType", "predicate", "Lkotlin/Function1;", "", "", "clearLikesStorage", "", "createStatusMap", "Lcom/soundcloud/android/likes/LikesStateProvider$LikesAndChanges;", "prev", "next", "latest", "likedPlaylists", "", "likedStatuses", "playlistChanges", "playlistChangesByLikeStatus", "reset", "subscribe", "trackChanges", "unlikedPlaylists", "unsubscribe", "LikesAndChanges", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.likes.m reason: case insensitive filesystem */
/* compiled from: LikesStateProvider.kt */
public class C3989m implements C3971b {
    private final C2314UH<C3988l> a;
    private final UPa b = new UPa();
    private final K c;
    private final L d;
    private final HPa e;
    private final HPa f;

    /* renamed from: com.soundcloud.android.likes.m$a */
    /* compiled from: LikesStateProvider.kt */
    private static final class a {
        private final Map<C3508cda, J> a;
        private final Set<C3508cda> b;

        public a() {
            this(null, null, 3, null);
        }

        public a(Map<C3508cda, J> map, Set<C3508cda> set) {
            C7471uYa.b(map, "changes");
            C7471uYa.b(set, "likes");
            this.a = map;
            this.b = set;
        }

        public final Map<C3508cda, J> a() {
            return this.a;
        }

        public final Set<C3508cda> b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Map<C3508cda, J> map = this.a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            Set<C3508cda> set = this.b;
            if (set != null) {
                i = set.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LikesAndChanges(changes=");
            sb.append(this.a);
            sb.append(", likes=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ a(Map map, Set set, int i, C7264rYa rya) {
            if ((i & 1) != 0) {
                map = LWa.a();
            }
            if ((i & 2) != 0) {
                set = SWa.a();
            }
            this(map, set);
        }
    }

    public C3989m(K k, L l, HPa hPa, HPa hPa2) {
        C7471uYa.b(k, "likesStorage");
        C7471uYa.b(l, "likesWriteStorage");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(hPa2, "mainThread");
        this.c = k;
        this.d = l;
        this.e = hPa;
        this.f = hPa2;
        C2314UH<C3988l> s = C2314UH.s();
        C7471uYa.a((Object) s, "BehaviorRelay.create()");
        this.a = s;
    }

    private void i() {
        this.d.clear();
    }

    private APa<Map<C3508cda, J>> j() {
        APa<Map<C3508cda, J>> a2 = a(C3994s.a);
        C7471uYa.a((Object) a2, "changesByType { it.key.isPlaylist }");
        return a2;
    }

    private void k() {
        i();
        this.b.b();
    }

    public APa<Map<C3508cda, J>> b() {
        APa<Map<C3508cda, J>> h = this.a.b(new a(null, null, 3, null), (C6504gQa<R, ? super T, R>) new C3990n<R,Object,R>(this)).h(C3991o.a);
        C7471uYa.a((Object) h, "statuses.scan(LikesAndCh…ext) }.map { it.changes }");
        return h;
    }

    public APa<Set<C3508cda>> c() {
        APa<Set<C3508cda>> b2 = b(r.a);
        C7471uYa.a((Object) b2, "playlistChangesByLikeStatus { it.isUserLike }");
        return b2;
    }

    public APa<C3988l> d() {
        APa<C3988l> h = this.a.h();
        C7471uYa.a((Object) h, "statuses.hide()");
        return h;
    }

    public void e() {
        k();
        f();
    }

    public void f() {
        this.b.a(this.c.d().b(this.e).a(this.f).h(C3997v.a).f((C6776kQa<? super T>) this.a));
    }

    public APa<Map<C3508cda, J>> g() {
        APa<Map<C3508cda, J>> a2 = a(C3998w.a);
        C7471uYa.a((Object) a2, "changesByType { it.key.isTrack }");
        return a2;
    }

    public APa<Set<C3508cda>> h() {
        APa<Set<C3508cda>> b2 = b(C3999x.a);
        C7471uYa.a((Object) b2, "playlistChangesByLikeStatus { !it.isUserLike }");
        return b2;
    }

    private APa<Set<C3508cda>> b(_Xa<? super J, Boolean> _xa) {
        return j().h(new C3995t(_xa)).a((C7256rQa<? super T>) C3996u.a);
    }

    public C3988l a() {
        Object t = this.a.t();
        if (t != null) {
            return (C3988l) t;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private APa<Map<C3508cda, J>> a(_Xa<? super Entry<C3508cda, J>, Boolean> _xa) {
        return b().h(new C3992p(_xa)).a((C7256rQa<? super T>) C3993q.a);
    }

    /* access modifiers changed from: private */
    public a a(a aVar, C3988l lVar) {
        Set<C3508cda> a2 = TWa.a(lVar.a(), (Iterable) aVar.b());
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C3508cda cda : a2) {
            arrayList.add(NVa.a(cda, new J(cda, true)));
        }
        Map a3 = LWa.a((Iterable) arrayList);
        Set<C3508cda> a4 = TWa.a(aVar.b(), (Iterable) lVar.a());
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) a4, 10));
        for (C3508cda cda2 : a4) {
            arrayList2.add(NVa.a(cda2, new J(cda2, false)));
        }
        return new a(LWa.a(a3, LWa.a((Iterable) arrayList2)), lVar.a());
    }
}
