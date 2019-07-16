package com.soundcloud.android.features.library.likes;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.collection.Da;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.likes.V;
import com.soundcloud.android.likes.la;
import com.soundcloud.android.offline.Od;
import com.soundcloud.android.settings.C5987t;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001[B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010C\u001a\u00020\u00112\u0018\u0010D\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r09\u0012\u0004\u0012\u00020\u000e0EH\u0016J\u001a\u0010F\u001a\u00020\u00112\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010K\u001a\u00020\u0011H\u0016J\u0010\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u0002H\u0014J\b\u0010N\u001a\u00020\u0002H\u0014J\u0010\u0010O\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u0002H\u0014J\b\u0010P\u001a\u000208H\u0016J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0012\u0010R\u001a\u00020\u00112\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u0011\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u0010H\u0016ø\u0001\u0000J\u0011\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u0010H\u0016ø\u0001\u0000J\b\u0010V\u001a\u00020\u0011H\u0016J\b\u0010W\u001a\u00020\u0011H\u0016J\b\u0010X\u001a\u00020\u0011H\u0016J\b\u0010Y\u001a\u000208H\u0014J\b\u0010Z\u001a\u00020\u0011H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00108VX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001f\u001a\u00020 XD¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R!\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0002¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b*\u0010\u0013R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0002¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b-\u0010\u0013R$\u0010/\u001a\b\u0012\u0004\u0012\u000201008\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R3\u00106\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09070\u00108VX\u0002¢\u0006\f\n\u0004\b<\u0010\u0015\u001a\u0004\b;\u0010\u0013R!\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0002¢\u0006\f\n\u0004\b?\u0010\u0015\u001a\u0004\b>\u0010\u0013R!\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0002¢\u0006\f\n\u0004\bB\u0010\u0015\u001a\u0004\bA\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Lcom/soundcloud/android/features/library/likes/TrackLikesFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/features/library/likes/TrackLikesPresenter;", "Lcom/soundcloud/android/features/library/likes/TrackLikesView;", "()V", "adapter", "Lcom/soundcloud/android/features/library/likes/TrackLikesAdapter;", "getAdapter$collections_ui_release", "()Lcom/soundcloud/android/features/library/likes/TrackLikesAdapter;", "setAdapter$collections_ui_release", "(Lcom/soundcloud/android/features/library/likes/TrackLikesAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/likes/TrackLikesUniflowItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyActionClick", "Lio/reactivex/Observable;", "", "getEmptyActionClick", "()Lio/reactivex/Observable;", "emptyActionClick$delegate", "Lkotlin/Lazy;", "emptyStateProvider", "Lcom/soundcloud/android/features/library/likes/TrackLikesEmptyStateProvider;", "getEmptyStateProvider", "()Lcom/soundcloud/android/features/library/likes/TrackLikesEmptyStateProvider;", "emptyStateProvider$delegate", "offlineToggled", "", "getOfflineToggled", "offlineToggled$delegate", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$collections_ui_release", "()Ldagger/Lazy;", "setPresenterLazy$collections_ui_release", "(Ldagger/Lazy;)V", "searchClick", "getSearchClick", "searchClick$delegate", "shuffleClick", "getShuffleClick", "shuffleClick$delegate", "syncLikesDialogProvider", "Ljavax/inject/Provider;", "Lcom/soundcloud/android/offline/OfflineLikesDialog;", "getSyncLikesDialogProvider$collections_ui_release", "()Ljavax/inject/Provider;", "setSyncLikesDialogProvider$collections_ui_release", "(Ljavax/inject/Provider;)V", "trackClick", "Lkotlin/Pair;", "", "", "Lcom/soundcloud/android/likes/TrackLikesTrackUniflowItem;", "getTrackClick", "trackClick$delegate", "upsellClick", "getUpsellClick", "upsellClick$delegate", "upsellImpression", "getUpsellImpression", "upsellImpression$delegate", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "nextPageSignal", "onCreate", "refreshSignal", "Lcom/soundcloud/android/features/library/likes/TrackLikesParams;", "requestContent", "showConfirmRemoveOfflineDialog", "showOfflineStorageErrorDialog", "showSyncLikesDialog", "titleResId", "unbindViews", "Companion", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesFragment.kt */
public final class TrackLikesFragment extends UniflowBaseFragment<z> implements T {
    static final /* synthetic */ DZa[] i = {HYa.a((DYa) new EYa(HYa.a(TrackLikesFragment.class), "emptyStateProvider", "getEmptyStateProvider()Lcom/soundcloud/android/features/library/likes/TrackLikesEmptyStateProvider;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesFragment.class), "upsellImpression", "getUpsellImpression()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesFragment.class), "shuffleClick", "getShuffleClick()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesFragment.class), "upsellClick", "getUpsellClick()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesFragment.class), "offlineToggled", "getOfflineToggled()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesFragment.class), "searchClick", "getSearchClick()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesFragment.class), "trackClick", "getTrackClick()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesFragment.class), "emptyActionClick", "getEmptyActionClick()Lio/reactivex/Observable;"))};
    public static final a j = new a(null);
    private final String k = "TrackLikesPresenter";
    public C4806CMa<z> l;
    public C3588b m;
    public C7054oVa<Od> n;
    private C6769kJa<la, C6973nJa> o;
    private final C7744yVa p = BVa.a(C3594h.a);
    private final C7744yVa q = BVa.a(new C3602p(this));
    private final C7744yVa r = BVa.a(new C3599m(this));
    private final C7744yVa s = BVa.a(new C3601o(this));
    private final C7744yVa t = BVa.a(new C3595i(this));
    private final C7744yVa u = BVa.a(new C3598l(this));
    private final C7744yVa v = BVa.a(new C3600n(this));
    private final C7744yVa w = BVa.a(new C3593g(this));
    private HashMap x;

    /* compiled from: TrackLikesFragment.kt */
    public static final class a {
        private a() {
        }

        public final TrackLikesFragment a(boolean z) {
            TrackLikesFragment trackLikesFragment = new TrackLikesFragment();
            trackLikesFragment.setArguments(C1687sb.a(NVa.a("auto_play", Boolean.valueOf(z))));
            return trackLikesFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final C3591e Yb() {
        C7744yVa yva = this.p;
        DZa dZa = i[0];
        return (C3591e) yva.getValue();
    }

    public APa<RVa> Fa() {
        C7744yVa yva = this.u;
        DZa dZa = i[5];
        return (APa) yva.getValue();
    }

    public void Rb() {
        HashMap hashMap = this.x;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C3588b bVar = this.m;
        if (bVar != null) {
            C6769kJa kja = new C6769kJa(bVar, C3592f.a, null, Yb(), false, true, false, false, false, false, 980, null);
            this.o = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void U() {
        Da.a(getFragmentManager());
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.k;
    }

    public int Vb() {
        return l.recyclerview_with_refresh_and_toolbar_and_page_bg_without_empty;
    }

    public void Wb() {
        C6769kJa<la, C6973nJa> kja = this.o;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final C3588b Xb() {
        C3588b bVar = this.m;
        if (bVar != null) {
            return bVar;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<Boolean> Y() {
        C7744yVa yva = this.t;
        DZa dZa = i[4];
        return (APa) yva.getValue();
    }

    public APa<RVa> Z() {
        C7744yVa yva = this.s;
        DZa dZa = i[3];
        return (APa) yva.getValue();
    }

    public APa<RVa> aa() {
        C7744yVa yva = this.q;
        DZa dZa = i[1];
        return (APa) yva.getValue();
    }

    public APa<y> c() {
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("auto_play", false);
        }
        y.b(z);
        APa<y> d = APa.c(y.a(z)).d((C6776kQa<? super T>) new C3597k<Object>(this));
        C7471uYa.a((Object) d, "Observable.just(TrackLik…ntentFactory.AUTO_PLAY) }");
        return d;
    }

    public void da() {
        C5987t.a(getFragmentManager());
    }

    public APa<RVa> e() {
        C6769kJa<la, C6973nJa> kja = this.o;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<RVa> ea() {
        C7744yVa yva = this.r;
        DZa dZa = i[2];
        return (APa) yva.getValue();
    }

    public APa<y> f() {
        C6769kJa<la, C6973nJa> kja = this.o;
        if (kja != null) {
            APa<y> h = kja.g().h(C3596j.a);
            C7471uYa.a((Object) h, "collectionRenderer.onRef…TrackLikesParams(false) }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void la() {
        C7054oVa<Od> ova = this.n;
        if (ova != null) {
            ((Od) ova.get()).a(getFragmentManager());
        } else {
            C7471uYa.b("syncLikesDialogProvider");
            throw null;
        }
    }

    public APa<HVa<Integer, List<V>>> o() {
        C7744yVa yva = this.v;
        DZa dZa = i[6];
        return (APa) yva.getValue();
    }

    public void onCreate(Bundle bundle) {
        dagger.android.support.a.a(this);
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public APa<RVa> x() {
        C7744yVa yva = this.w;
        DZa dZa = i[7];
        return (APa) yva.getValue();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.track_likes_title;
    }

    /* access modifiers changed from: protected */
    public z Tb() {
        C4806CMa<z> cMa = this.l;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (z) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void b() {
        com.soundcloud.android.features.library.likes.T.a.a(this);
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<la, C6973nJa> kja = this.o;
        if (kja != null) {
            C6769kJa.a(kja, view, true, null, 0, 12, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(z zVar) {
        C7471uYa.b(zVar, "presenter");
        zVar.a();
    }

    public void a(C6832lEa<List<la>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<la, C6973nJa> kja = this.o;
        if (kja != null) {
            C6900mEa a2 = lea.a();
            List list = (List) lea.b();
            if (list == null) {
                list = C6918mWa.a();
            }
            kja.a(new C4736AEa<>(a2, list));
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(z zVar) {
        C7471uYa.b(zVar, "presenter");
        zVar.a((T) this);
    }
}
