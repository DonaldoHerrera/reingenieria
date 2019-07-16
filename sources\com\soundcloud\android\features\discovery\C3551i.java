package com.soundcloud.android.features.discovery;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.Db;
import java.util.Iterator;
import java.util.List;

@EVa(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 '2 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001'B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J!\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0018J!\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0012\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u000e\u0010$\u001a\u0004\u0018\u00010#*\u00020%H\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010#*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/soundcloud/android/features/discovery/DiscoveryPresenter;", "Lcom/soundcloud/android/view/collection/LegacySimplePresenter;", "", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel;", "", "Lcom/soundcloud/android/features/discovery/DiscoveryView;", "discoveryOperations", "Lcom/soundcloud/android/discovery/DiscoveryOperations;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "discoveryCardViewModelMapper", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModelMapper;", "playbackInitiator", "Lcom/soundcloud/android/playback/PlaybackInitiator;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "mainScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/discovery/DiscoveryOperations;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/discovery/DiscoveryCardViewModelMapper;Lcom/soundcloud/android/playback/PlaybackInitiator;Lcom/soundcloud/rx/eventbus/EventBus;Lio/reactivex/Scheduler;)V", "attachView", "view", "legacyLoad", "Lio/reactivex/Observable;", "pageParams", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "legacyRefresh", "subscribeForPromotedTrackClick", "Lio/reactivex/disposables/Disposable;", "subscribeForPromotedTrackCreatorClick", "subscribeForPromoterClick", "subscribeForSelectionItemClick", "subscribeForTrackCardBound", "subscribeForUpsellHeaderClick", "trackPageView", "queryUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "promoterUrn", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$PromotedTrackCard;", "responseQueryUrn", "Companion", "discovery_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.features.discovery.i reason: case insensitive filesystem */
/* compiled from: DiscoveryPresenter.kt */
public final class C3551i extends C7318sJa<List<? extends C3794jY>, RVa, RVa, H> {
    /* access modifiers changed from: private */
    public static final C4928GKa<Integer> l;
    public static final a m = new a(null);
    /* access modifiers changed from: private */
    public final C3858rY n;
    /* access modifiers changed from: private */
    public final C3700b o;
    /* access modifiers changed from: private */
    public final C3802kY p;
    /* access modifiers changed from: private */
    public final Db q;
    private final C5327TLa r;
    private final HPa s;

    /* renamed from: com.soundcloud.android.features.discovery.i$a */
    /* compiled from: DiscoveryPresenter.kt */
    public static final class a {
        private a() {
        }

        public final C4928GKa<Integer> a() {
            return C3551i.l;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        C4928GKa<Integer> c = C4928GKa.c(Integer.valueOf(0));
        C7471uYa.a((Object) c, "Optional.of(0)");
        l = c;
    }

    public C3551i(C3858rY rYVar, C3700b bVar, C3802kY kYVar, Db db, C5327TLa tLa, HPa hPa) {
        C7471uYa.b(rYVar, "discoveryOperations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(kYVar, "discoveryCardViewModelMapper");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(hPa, "mainScheduler");
        super(hPa);
        this.n = rYVar;
        this.o = bVar;
        this.p = kYVar;
        this.q = db;
        this.r = tLa;
        this.s = hPa;
    }

    private final VPa e(H h) {
        VPa f = h.H().d((C6776kQa<? super T>) new B<Object>(this)).f((C6776kQa<? super T>) new C<Object>(h));
        C7471uYa.a((Object) f, "view.selectionItemClick(…          }\n            }");
        return f;
    }

    private final VPa b(H h) {
        VPa f = h.C().d((C6776kQa<? super T>) new C3561t<Object>(this)).h(C3562u.a).a(this.s).g(new v(this)).f((C6776kQa<? super T>) new C3560s<Object>(new w(h)));
        C7471uYa.a((Object) f, "view.promotedTrackClick(…view::showPlaybackResult)");
        return f;
    }

    private final VPa c(H h) {
        VPa f = h.A().d((C6776kQa<? super T>) new x<Object>(this)).f((C6776kQa<? super T>) new y<Object>(h));
        C7471uYa.a((Object) f, "view.promotedTrackCreato…Profile(it.creatorUrn)) }");
        return f;
    }

    private final VPa d(H h) {
        VPa f = h.F().d((C6776kQa<? super T>) new z<Object>(this)).f((C6776kQa<? super T>) new A<Object>(this, h));
        C7471uYa.a((Object) f, "view.promoterClick()\n   …          }\n            }");
        return f;
    }

    private final VPa g(H h) {
        VPa f = h.D().f((C6776kQa<? super T>) new F<Object>(this, h));
        C7471uYa.a((Object) f, "view.upsellHeaderItemCli…ROM_DISCOVERY))\n        }");
        return f;
    }

    private final VPa f(H h) {
        VPa f = h.G().a((C7256rQa<? super T>) D.a).f((C6776kQa<? super T>) new E<Object>(this));
        C7471uYa.a((Object) f, "view.promotedTrackCardBo…sionFired()\n            }");
        return f;
    }

    public void a(H h) {
        C7471uYa.b(h, "view");
        super.a(h);
        UPa b = b();
        APa d = c().h(C3553k.a).d();
        C7471uYa.a((Object) d, "loader.map { it.asyncLoa…  .distinctUntilChanged()");
        _Ua _ua = _Ua.a;
        APa d2 = h.d();
        APa h2 = c().a((C7256rQa<? super T>) C3555m.a).h(C3556n.a);
        C7471uYa.a((Object) h2, "loader.filter { it.data … it.data ?: emptyList() }");
        b.a(Yl.a(d).f((C6776kQa<? super T>) new C3554l<Object>(h)), g(h), e(h), b(h), c(h), d(h), f(h), APa.a((EPa<? extends T1>) d2, (EPa<? extends T2>) h2, (C6504gQa<? super T1, ? super T2, ? extends R>) new C3552j<Object,Object,Object>(this)).b((C7118pQa<? super T, K>) C3557o.a).f((C6776kQa<? super T>) new C3558p<Object>(this)));
    }

    /* renamed from: b */
    public APa<List<C3794jY>> g(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<List<C3794jY>> j = this.n.b().e(new r(this)).j();
        C7471uYa.a((Object) j, "discoveryOperations.refr…odel(it) }.toObservable()");
        return j;
    }

    /* renamed from: a */
    public APa<List<C3794jY>> f(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<List<C3794jY>> j = this.n.a().e(new C3559q(this)).j();
        C7471uYa.a((Object) j, "discoveryOperations.disc…odel(it) }.toObservable()");
        return j;
    }

    /* access modifiers changed from: private */
    public final C3508cda a(List<? extends C3794jY> list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C3794jY) obj).a() != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C3794jY jYVar = (C3794jY) obj;
        if (jYVar != null) {
            return jYVar.a();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void a(C3508cda cda) {
        C3700b bVar = this.o;
        Zca zca = new Zca(Yca.DISCOVER, null, cda, null, null, 26, null);
        bVar.a(zca);
    }

    /* access modifiers changed from: private */
    public final C3508cda a(c cVar) {
        C3895vda b = cVar.e().b();
        if (b != null) {
            return b.c();
        }
        return null;
    }
}
