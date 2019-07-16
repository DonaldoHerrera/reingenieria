package com.soundcloud.android.search;

import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0005%&'()B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011H\u0002J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00140\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0002J\u0012\u0010\u001e\u001a\u00060\u001fR\u00020\u00002\u0006\u0010 \u001a\u00020!J\f\u0010\"\u001a\u00020#*\u00020\u001aH\u0002J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0011*\b\u0012\u0004\u0012\u00020\u001a0\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/soundcloud/android/search/SearchStrategyFactory;", "", "apiClientRx", "Lcom/soundcloud/android/libs/api/ApiClientRx;", "scheduler", "Lio/reactivex/Scheduler;", "trackWriter", "Lcom/soundcloud/android/foundation/domain/tracks/TrackWriter;", "userWriter", "Lcom/soundcloud/android/foundation/domain/users/UserWriter;", "playlistStorage", "Lcom/soundcloud/android/playlists/PlaylistStorage;", "(Lcom/soundcloud/android/libs/api/ApiClientRx;Lio/reactivex/Scheduler;Lcom/soundcloud/android/foundation/domain/tracks/TrackWriter;Lcom/soundcloud/android/foundation/domain/users/UserWriter;Lcom/soundcloud/android/playlists/PlaylistStorage;)V", "cachePlaylists", "Lio/reactivex/Single;", "Lcom/soundcloud/propeller/WriteResult;", "playlists", "", "Lcom/soundcloud/android/foundation/domain/playlists/ApiPlaylist;", "cacheTracks", "", "Lcom/soundcloud/android/foundation/domain/tracks/ApiTrack;", "tracks", "cacheUniversalResults", "Lio/reactivex/Completable;", "items", "Lcom/soundcloud/android/search/ApiUniversalSearchItem;", "cacheUsers", "Lcom/soundcloud/android/foundation/domain/users/ApiUser;", "users", "getSearchStrategy", "Lcom/soundcloud/android/search/SearchStrategyFactory$SearchStrategy;", "searchType", "Lcom/soundcloud/android/search/SearchType;", "getUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "toKnownUrns", "PlaylistSearchStrategy", "SearchStrategy", "TrackSearchStrategy", "UniversalSearchStrategy", "UserSearchStrategy", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.search.oa reason: case insensitive filesystem */
/* compiled from: SearchStrategyFactory.kt */
public final class C5927oa {
    /* access modifiers changed from: private */
    public final efa a;
    /* access modifiers changed from: private */
    public final HPa b;
    private final C3768fea c;
    private final C3800jea d;
    private final C6332dsa e;

    /* renamed from: com.soundcloud.android.search.oa$a */
    /* compiled from: SearchStrategyFactory.kt */
    private final class a extends b {
        private final C5925na c = new C5925na();
        final /* synthetic */ C5927oa d;

        public a(C5927oa oaVar, C2226PO po) {
            C7471uYa.b(po, "endpoint");
            this.d = oaVar;
            super(oaVar, po);
        }

        /* access modifiers changed from: protected */
        public IPa<I> a(defpackage.hfa.b bVar, String str, La la) {
            C7471uYa.b(bVar, "builder");
            C7471uYa.b(str, "queryString");
            C7471uYa.b(la, "searchType");
            IPa<I> e = this.d.a.a(bVar.b(), (C4990IKa<T>) this.c).b(this.d.b).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5921la<Object,Object>(this)).e(new C5923ma(la, str));
            C7471uYa.a((Object) e, "apiClientRx.mappedRespon…      )\n                }");
            return e;
        }
    }

    /* renamed from: com.soundcloud.android.search.oa$b */
    /* compiled from: SearchStrategyFactory.kt */
    public abstract class b {
        private final C2226PO a;
        final /* synthetic */ C5927oa b;

        public b(C5927oa oaVar, C2226PO po) {
            C7471uYa.b(po, "endpoint");
            this.b = oaVar;
            this.a = po;
        }

        /* access modifiers changed from: protected */
        public abstract IPa<I> a(defpackage.hfa.b bVar, String str, La la);

        public final IPa<I> a(String str, C3508cda cda, La la) {
            C7471uYa.b(str, "query");
            C7471uYa.b(la, "searchType");
            defpackage.hfa.b a2 = hfa.b(this.a.a()).a(defpackage.hfa.c.PAGE_SIZE, String.valueOf(30)).a("q", str);
            if (cda != null) {
                a2.a("query_urn", cda.toString());
            }
            defpackage.hfa.b c = a2.c();
            C7471uYa.a((Object) c, "requestBuilder.forPrivateApi()");
            return a(c, str, la);
        }

        public final IPa<I> a(Oca oca, La la, String str) {
            C7471uYa.b(oca, "nextPageLink");
            C7471uYa.b(la, "searchType");
            C7471uYa.b(str, "queryString");
            defpackage.hfa.b c = hfa.b(oca.a()).c();
            C7471uYa.a((Object) c, "ApiRequest.get(nextPageLink.href).forPrivateApi()");
            return a(c, str, la);
        }
    }

    /* renamed from: com.soundcloud.android.search.oa$c */
    /* compiled from: SearchStrategyFactory.kt */
    private final class c extends b {
        private final C5934sa c = new C5934sa();

        public c() {
            super(C5927oa.this, C2226PO.SEARCH_TRACKS);
        }

        /* access modifiers changed from: protected */
        public IPa<I> a(defpackage.hfa.b bVar, String str, La la) {
            C7471uYa.b(bVar, "builder");
            C7471uYa.b(str, "queryString");
            C7471uYa.b(la, "searchType");
            IPa<I> e = C5927oa.this.a.a(bVar.b(), (C4990IKa<T>) this.c).b(C5927oa.this.b).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5931qa<Object,Object>(this)).e(new C5932ra(la, str));
            C7471uYa.a((Object) e, "apiClientRx.mappedRespon…      )\n                }");
            return e;
        }
    }

    /* renamed from: com.soundcloud.android.search.oa$d */
    /* compiled from: SearchStrategyFactory.kt */
    private final class d extends b {
        private final wa c = new wa();

        public d() {
            super(C5927oa.this, C2226PO.SEARCH_ALL);
        }

        /* access modifiers changed from: protected */
        public IPa<I> a(defpackage.hfa.b bVar, String str, La la) {
            C7471uYa.b(bVar, "builder");
            C7471uYa.b(str, "queryString");
            C7471uYa.b(la, "searchType");
            IPa<I> e = C5927oa.this.a.a(bVar.b(), (C4990IKa<T>) this.c).b(C5927oa.this.b).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5938ua<Object,Object>(this)).e(new va(this, str, la));
            C7471uYa.a((Object) e, "apiClientRx.mappedRespon…ueryString, searchType) }");
            return e;
        }

        /* access modifiers changed from: private */
        public final I a(C5926o<C5914i> oVar, String str, La la) {
            List f = oVar.f();
            C4928GKa h = oVar.h();
            oVar.j();
            C5927oa oaVar = C5927oa.this;
            C7471uYa.a((Object) f, "collection");
            List e = oaVar.e(f);
            Oca oca = (Oca) h.d();
            Object d2 = oVar.j().d(C3508cda.a);
            C7471uYa.a(d2, "searchCollection.queryUrn.or(Urn.NOT_SET)");
            I i = new I(e, oca, (C3508cda) d2, oVar.l(), la, str);
            return i;
        }
    }

    /* renamed from: com.soundcloud.android.search.oa$e */
    /* compiled from: SearchStrategyFactory.kt */
    private final class e extends b {
        private final Aa c = new Aa();

        public e() {
            super(C5927oa.this, C2226PO.SEARCH_USERS);
        }

        /* access modifiers changed from: protected */
        public IPa<I> a(defpackage.hfa.b bVar, String str, La la) {
            C7471uYa.b(bVar, "builder");
            C7471uYa.b(str, "queryString");
            C7471uYa.b(la, "searchType");
            IPa<I> e = C5927oa.this.a.a(bVar.b(), (C4990IKa<T>) this.c).b(C5927oa.this.b).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new ya<Object,Object>(this)).e(new za(la, str));
            C7471uYa.a((Object) e, "apiClientRx.mappedRespon…      )\n                }");
            return e;
        }
    }

    public C5927oa(efa efa, HPa hPa, C3768fea fea, C3800jea jea, C6332dsa dsa) {
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(fea, "trackWriter");
        C7471uYa.b(jea, "userWriter");
        C7471uYa.b(dsa, "playlistStorage");
        this.a = efa;
        this.b = hPa;
        this.c = fea;
        this.d = jea;
        this.e = dsa;
    }

    /* access modifiers changed from: private */
    public final C6979nPa c(List<C5914i> list) {
        C6979nPa[] npaArr = new C6979nPa[3];
        ArrayList arrayList = new ArrayList();
        for (C5914i b2 : list) {
            Yda b3 = b2.b();
            if (b3 != null) {
                arrayList.add(b3);
            }
        }
        npaArr[0] = b((List<Yda>) arrayList).h();
        ArrayList arrayList2 = new ArrayList();
        for (C5914i c2 : list) {
            C3776gea c3 = c2.c();
            if (c3 != null) {
                arrayList2.add(c3);
            }
        }
        npaArr[1] = d(arrayList2).h();
        ArrayList arrayList3 = new ArrayList();
        for (C5914i a2 : list) {
            C3927zda a3 = a2.a();
            if (a3 != null) {
                arrayList3.add(a3);
            }
        }
        npaArr[2] = a((List<C3927zda>) arrayList3).h();
        C6979nPa a4 = C6979nPa.a((Iterable<? extends C7255rPa>) C6918mWa.b((Object[]) npaArr));
        C7471uYa.a((Object) a4, "Completable.merge(\n     …)\n            )\n        )");
        return a4;
    }

    /* access modifiers changed from: private */
    public final IPa<Iterable<C3776gea>> d(List<C3776gea> list) {
        return this.d.a(list);
    }

    /* access modifiers changed from: private */
    public final List<C3508cda> e(List<C5914i> list) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C5914i a2 : list) {
            arrayList.add(a(a2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (!C7471uYa.a((Object) (C3508cda) next, (Object) C3508cda.a)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public final IPa<Iterable<Yda>> b(List<Yda> list) {
        return this.c.b(list);
    }

    public final b a(La la) {
        C7471uYa.b(la, "searchType");
        int i = Ba.a[la.ordinal()];
        if (i == 1) {
            return new d();
        }
        if (i == 2) {
            return new c();
        }
        if (i == 3) {
            return new a(this, C2226PO.SEARCH_PLAYLISTS_WITHOUT_ALBUMS);
        }
        if (i == 4) {
            return new a(this, C2226PO.SEARCH_ALBUMS);
        }
        if (i == 5) {
            return new e();
        }
        throw new FVa();
    }

    /* access modifiers changed from: private */
    public final IPa<C6499gLa> a(List<C3927zda> list) {
        return this.e.a((Iterable<C3927zda>) list);
    }

    private final C3508cda a(C5914i iVar) {
        if (iVar.c() != null) {
            return iVar.c().l();
        }
        if (iVar.b() != null) {
            return iVar.b().w();
        }
        if (iVar.a() != null) {
            return iVar.a().a();
        }
        C3508cda cda = C3508cda.a;
        C7471uYa.a((Object) cda, "Urn.NOT_SET");
        return cda;
    }
}
