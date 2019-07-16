package com.soundcloud.android.collection.recentlyplayed;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedItem;", "headerRenderer", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedHeaderRenderer;", "playlistRenderer", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedPlaylistRenderer;", "profileRenderer", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedProfileRenderer;", "stationRenderer", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedStationRenderer;", "emptyRenderer", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedEmptyRenderer;", "(Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedHeaderRenderer;Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedPlaylistRenderer;Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedProfileRenderer;Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedStationRenderer;Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedEmptyRenderer;)V", "clearContent", "Lio/reactivex/Observable;", "", "getBasicItemViewType", "", "position", "playlistClicked", "Lcom/soundcloud/android/foundation/domain/Urn;", "profileClicked", "stationClicked", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.collection.recentlyplayed.l reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedAdapter.kt */
public final class C2821l extends C5407WEa<E> {
    private final C g;
    private final C2810fa h;
    private final ua i;
    private final za j;

    /* renamed from: com.soundcloud.android.collection.recentlyplayed.l$a */
    /* compiled from: RecentlyPlayedAdapter.kt */
    public static class a {
        private final C a;
        private final C2812ga b;
        private final va c;
        private final Aa d;
        private final C2830t e;

        public a(C c2, C2812ga gaVar, va vaVar, Aa aa, C2830t tVar) {
            C7471uYa.b(c2, "headerRenderer");
            C7471uYa.b(gaVar, "playlistRendererFactory");
            C7471uYa.b(vaVar, "profileRendererFactory");
            C7471uYa.b(aa, "stationRendererFactory");
            C7471uYa.b(tVar, "emptyRenderer");
            this.a = c2;
            this.b = gaVar;
            this.c = vaVar;
            this.d = aa;
            this.e = tVar;
        }

        public static /* synthetic */ C2821l a(a aVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return aVar.a(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }

        public C2821l a(boolean z) {
            C2821l lVar = new C2821l(this.a, this.b.a(z), this.c.a(z), this.d.a(z), this.e);
            return lVar;
        }
    }

    public C2821l(C c, C2810fa faVar, ua uaVar, za zaVar, C2830t tVar) {
        C7471uYa.b(c, "headerRenderer");
        C7471uYa.b(faVar, "playlistRenderer");
        C7471uYa.b(uaVar, "profileRenderer");
        C7471uYa.b(zaVar, "stationRenderer");
        C7471uYa.b(tVar, "emptyRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(com.soundcloud.android.collection.recentlyplayed.E.a.EMPTY.ordinal(), tVar), new C5693cFa(com.soundcloud.android.collection.recentlyplayed.E.a.HEADER.ordinal(), c), new C5693cFa(com.soundcloud.android.collection.recentlyplayed.E.a.PLAYLIST.ordinal(), faVar), new C5693cFa(com.soundcloud.android.collection.recentlyplayed.E.a.PROFILE.ordinal(), uaVar), new C5693cFa(com.soundcloud.android.collection.recentlyplayed.E.a.STATION.ordinal(), zaVar)});
        this.g = c;
        this.h = faVar;
        this.i = uaVar;
        this.j = zaVar;
    }

    public int f(int i2) {
        return ((E) g(i2)).f().ordinal();
    }

    public final APa<RVa> j() {
        C6781kVa<RVa> kva = this.g.a;
        C7471uYa.a((Object) kva, "headerRenderer.clearClicked");
        return kva;
    }

    public final APa<C3508cda> k() {
        return this.h.a();
    }

    public final APa<C3508cda> l() {
        return this.i.a();
    }

    public final APa<C3508cda> m() {
        return this.j.a();
    }
}
