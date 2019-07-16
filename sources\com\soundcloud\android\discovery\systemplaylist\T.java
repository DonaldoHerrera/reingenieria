package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import java.util.List;

/* compiled from: SystemPlaylistPresenter.kt */
public class T extends C7318sJa<List<? extends ca>, G, G, aa> {
    private final C6781kVa<C3520k> l;
    private final E m;
    /* access modifiers changed from: private */
    public final B n;
    private final Db o;
    /* access modifiers changed from: private */
    public final C3700b p;
    private final HPa q;

    public T(E e, B b, Db db, C3700b bVar, HPa hPa) {
        C7471uYa.b(e, "systemPlaylistOperations");
        C7471uYa.b(b, "systemPlaylistItemMapper");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.m = e;
        this.n = b;
        this.o = db;
        this.p = bVar;
        this.q = hPa;
        C6781kVa<C3520k> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<SystemPlaylist>()");
        this.l = s;
    }

    private C7531vPa<C3520k> c(G g) {
        if (g.a() != null) {
            C7531vPa<C3520k> a = this.m.a(g.a());
            C7471uYa.a((Object) a, "systemPlaylistOperations…ist(pageParams.permalink)");
            return a;
        }
        C7531vPa<C3520k> b = this.m.b(g.b());
        C7471uYa.a((Object) b, "systemPlaylistOperations…mPlaylist(pageParams.urn)");
        return b;
    }

    /* renamed from: b */
    public APa<List<ca>> g(G g) {
        C7471uYa.b(g, "pageParams");
        APa<List<ca>> h = this.m.a(g.b()).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new O<Object,Object>(this)).h(P.a);
        C7471uYa.a((Object) h, "systemPlaylistOperations….map { it.playlistItems }");
        return h;
    }

    public C6781kVa<C3520k> f() {
        return this.l;
    }

    public void a(aa aaVar) {
        C7471uYa.b(aaVar, "view");
        super.a(aaVar);
        b().a(b(aaVar).f((C6776kQa<? super T>) new H<Object>(this)), f().f((C6776kQa<? super T>) new I<Object>(aaVar)), aaVar.P().g(new J(this)).f((C6776kQa<? super T>) new Q<Object>(new K(aaVar))));
    }

    private APa<Zca> b(aa aaVar) {
        APa<Zca> a = APa.a((EPa<? extends T1>) aaVar.d(), (EPa<? extends T2>) f(), (C6504gQa<? super T1, ? super T2, ? extends R>) S.a);
        C7471uYa.a((Object) a, "combineLatest(view.onVis…me().orNull())\n        })");
        return a;
    }

    /* access modifiers changed from: private */
    public IPa<C4536zc> a(PlaySessionSource playSessionSource, List<C3508cda> list, int i) {
        return this.o.b(list, i, playSessionSource);
    }

    /* renamed from: a */
    public APa<List<ca>> f(G g) {
        C7471uYa.b(g, "pageParams");
        APa<List<ca>> h = c(g).b((C6776kQa<? super T>) new L<Object>(this)).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new M<Object,Object>(this)).h(N.a);
        C7471uYa.a((Object) h, "loadSystemPlaylist(pageP….map { it.playlistItems }");
        return h;
    }
}
