package com.soundcloud.android.features.discovery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.features.discovery.H.a;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.search.C5916j;
import com.soundcloud.android.stream.nb;
import com.soundcloud.android.upsell.i;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u00101\u001a\u0002022\u0018\u00103\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r05\u0012\u0004\u0012\u00020\u000e04H\u0016J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\rH\u0002J\u001a\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u000202H\u0016J\u0010\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020\u0002H\u0014J\b\u0010B\u001a\u00020\u0002H\u0014J\u0010\u0010C\u001a\u0002022\u0006\u0010A\u001a\u00020\u0002H\u0014J\b\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u0002022\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0018\u0010M\u001a\u0002022\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0016J&\u0010R\u001a\u0004\u0018\u00010<2\u0006\u0010P\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020X0WH\u0016J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0WH\u0016J\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0WH\u0016J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020X0WH\u0016J\u0010\u0010\\\u001a\u0002022\u0006\u0010]\u001a\u00020\u000eH\u0016J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u0002020_H\u0016J\u000e\u0010`\u001a\b\u0012\u0004\u0012\u0002020WH\u0016J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020b0WH\u0016J\b\u0010c\u001a\u00020EH\u0014J\b\u0010d\u001a\u000202H\u0016J\u000e\u0010e\u001a\b\u0012\u0004\u0012\u0002020WH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cXD¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006f"}, d2 = {"Lcom/soundcloud/android/features/discovery/DiscoveryFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/features/discovery/DiscoveryPresenter;", "Lcom/soundcloud/android/features/discovery/DiscoveryView;", "()V", "adapter", "Lcom/soundcloud/android/features/discovery/DiscoveryAdapter;", "getAdapter$discovery_release", "()Lcom/soundcloud/android/features/discovery/DiscoveryAdapter;", "setAdapter$discovery_release", "(Lcom/soundcloud/android/features/discovery/DiscoveryAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel;", "Lcom/soundcloud/android/view/collection/LegacyError;", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "getFeedbackController$discovery_release", "()Lcom/soundcloud/android/view/snackbar/FeedbackController;", "setFeedbackController$discovery_release", "(Lcom/soundcloud/android/view/snackbar/FeedbackController;)V", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "getNavigator$discovery_release", "()Lcom/soundcloud/android/navigation/Navigator;", "setNavigator$discovery_release", "(Lcom/soundcloud/android/navigation/Navigator;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$discovery_release", "()Ldagger/Lazy;", "setPresenterLazy$discovery_release", "(Ldagger/Lazy;)V", "swipeRefreshAttacher", "Lcom/soundcloud/android/stream/StreamSwipeRefreshAttacher;", "getSwipeRefreshAttacher$discovery_release", "()Lcom/soundcloud/android/stream/StreamSwipeRefreshAttacher;", "setSwipeRefreshAttacher$discovery_release", "(Lcom/soundcloud/android/stream/StreamSwipeRefreshAttacher;)V", "titleBarUpsellController", "Lcom/soundcloud/android/upsell/TitleBarUpsellController;", "getTitleBarUpsellController$discovery_release", "()Lcom/soundcloud/android/upsell/TitleBarUpsellController;", "setTitleBarUpsellController$discovery_release", "(Lcom/soundcloud/android/upsell/TitleBarUpsellController;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "areItemsTheSame", "", "item1", "item2", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "navigateTo", "navigationTarget", "Lcom/soundcloud/android/navigation/NavigationTarget;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "promotedTrackCardBound", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$PromotedTrackCard;", "promotedTrackClick", "promotedTrackCreatorClick", "promoterClick", "refreshErrorConsumer", "error", "refreshSignal", "Lio/reactivex/subjects/PublishSubject;", "requestContent", "selectionItemClick", "Lcom/soundcloud/android/discovery/SelectionItemViewModel;", "titleResId", "unbindViews", "upsellHeaderItemClick", "discovery_release"}, mv = {1, 1, 15})
/* compiled from: DiscoveryFragment.kt */
public final class DiscoveryFragment extends UniflowBaseFragment<C3551i> implements H {
    public C4806CMa<C3551i> i;
    public C3543a j;
    public C5052KJa k;
    public nb l;
    public C4655rja m;
    public i n;
    private C6769kJa<C3794jY, C6973nJa> o;
    private final String p = "HomePresenterKey";
    private HashMap q;

    public APa<c> A() {
        C3543a aVar = this.j;
        if (aVar != null) {
            return aVar.l();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<c> C() {
        C3543a aVar = this.j;
        if (aVar != null) {
            return aVar.k();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> D() {
        C3543a aVar = this.j;
        if (aVar != null) {
            return aVar.o();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<c> F() {
        C3543a aVar = this.j;
        if (aVar != null) {
            return aVar.m();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<c> G() {
        C3543a aVar = this.j;
        if (aVar != null) {
            return aVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3445NY> H() {
        C3543a aVar = this.j;
        if (aVar != null) {
            return aVar.n();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void Rb() {
        HashMap hashMap = this.q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C3543a aVar = this.j;
        if (aVar != null) {
            C6769kJa kja = new C6769kJa(aVar, new C3545c(this), null, new C5916j(), true, false, true, false, true, false, 676, null);
            this.o = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.p;
    }

    public int Vb() {
        return l.recyclerview_with_top_divider_and_refresh_and_toolbar_without_empty;
    }

    public void Wb() {
        C6769kJa<C3794jY, C6973nJa> kja = this.o;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final nb Xb() {
        nb nbVar = this.l;
        if (nbVar != null) {
            return nbVar;
        }
        C7471uYa.b("swipeRefreshAttacher");
        throw null;
    }

    public APa<RVa> c() {
        APa<RVa> c = APa.c(RVa.a);
        C7471uYa.a((Object) c, "Observable.just(Unit)");
        return c;
    }

    public APa<RVa> e() {
        return a.a(this);
    }

    public void onAttach(Context context) {
        C7471uYa.b(context, "context");
        dagger.android.support.a.a(this);
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C7471uYa.b(menu, "menu");
        C7471uYa.b(menuInflater, "inflater");
        i iVar = this.n;
        if (iVar != null) {
            iVar.a(menu, Yca.DISCOVER);
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        C7471uYa.b("titleBarUpsellController");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7471uYa.b(layoutInflater, "inflater");
        return layoutInflater.inflate(Vb(), viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.tab_home;
    }

    /* access modifiers changed from: protected */
    public C3551i Tb() {
        C4806CMa<C3551i> cMa = this.i;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (C3551i) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void b() {
        a.b(this);
    }

    public C6781kVa<RVa> f() {
        C6769kJa<C3794jY, C6973nJa> kja = this.o;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: private */
    public final boolean a(C3794jY jYVar, C3794jY jYVar2) {
        if (!(jYVar instanceof a) || !(jYVar2 instanceof a)) {
            if ((jYVar instanceof d) && (jYVar2 instanceof d)) {
                return C7471uYa.a((Object) ((d) jYVar).d(), (Object) ((d) jYVar2).d());
            }
            if ((jYVar instanceof b) && (jYVar2 instanceof b)) {
                return C7471uYa.a((Object) ((b) jYVar).d(), (Object) ((b) jYVar2).d());
            }
            if (!(jYVar instanceof c) || !(jYVar2 instanceof c)) {
                return false;
            }
            c cVar = (c) jYVar;
            c cVar2 = (c) jYVar2;
            if (!C7471uYa.a((Object) cVar.g(), (Object) cVar2.g()) || !C7471uYa.a((Object) cVar.e().a(), (Object) cVar2.e().a())) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(C3551i iVar) {
        C7471uYa.b(iVar, "presenter");
        iVar.a();
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<C3794jY, C6973nJa> kja = this.o;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(C3551i iVar) {
        C7471uYa.b(iVar, "presenter");
        iVar.a((H) this);
    }

    public void a(C6832lEa<List<C3794jY>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<C3794jY, C6973nJa> kja = this.o;
        if (kja != null) {
            C6900mEa a = lea.a();
            List list = (List) lea.b();
            if (list == null) {
                list = C6918mWa.a();
            }
            kja.a(new C4736AEa<>(a, list));
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void a(C6973nJa nja) {
        C7471uYa.b(nja, "error");
        String str = "feedbackController";
        if (C6972nIa.f(nja.b())) {
            C5052KJa kJa = this.k;
            if (kJa != null) {
                Fca fca = new Fca(p.discovery_error_offline, 1, 0, null, null, null, 60, null);
                kJa.a(fca);
                return;
            }
            C7471uYa.b(str);
            throw null;
        }
        C5052KJa kJa2 = this.k;
        if (kJa2 != null) {
            Fca fca2 = new Fca(p.discovery_error_failed_to_load, 1, p.discovery_error_retry_button, new C3546d(this), null, null, 48, null);
            kJa2.a(fca2);
            return;
        }
        C7471uYa.b(str);
        throw null;
    }

    public void a(C4621nja nja) {
        C7471uYa.b(nja, "navigationTarget");
        C4655rja rja = this.m;
        if (rja != null) {
            rja.a(nja);
        } else {
            C7471uYa.b("navigator");
            throw null;
        }
    }
}
