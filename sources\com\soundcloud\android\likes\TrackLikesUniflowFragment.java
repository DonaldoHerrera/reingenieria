package com.soundcloud.android.likes;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.collection.Da;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.offline.Od;
import com.soundcloud.android.settings.C5987t;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001PB\u0005¢\u0006\u0002\u0010\u0004J\"\u00108\u001a\u00020!2\u0018\u00109\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0.\u0012\u0004\u0012\u00020\u000e0:H\u0016J\u001a\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020!H\u0016J\u0010\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020\u0002H\u0014J\b\u0010C\u001a\u00020\u0002H\u0014J\u0010\u0010D\u001a\u00020!2\u0006\u0010B\u001a\u00020\u0002H\u0014J\b\u0010E\u001a\u00020-H\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020!0\u0010H\u0016J\u0012\u0010G\u001a\u00020!2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0010H\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u0010H\u0016J\b\u0010K\u001a\u00020!H\u0016J\b\u0010L\u001a\u00020!H\u0016J\b\u0010M\u001a\u00020!H\u0016J\b\u0010N\u001a\u00020-H\u0014J\b\u0010O\u001a\u00020!H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR!\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00108VX\u0002¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b\"\u0010\u0013R$\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R3\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0,0\u00108VX\u0002¢\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b0\u0010\u0013R!\u00102\u001a\b\u0012\u0004\u0012\u00020!0\u00108VX\u0002¢\u0006\f\n\u0004\b4\u0010\u0015\u001a\u0004\b3\u0010\u0013R!\u00105\u001a\b\u0012\u0004\u0012\u00020!0\u00108VX\u0002¢\u0006\f\n\u0004\b7\u0010\u0015\u001a\u0004\b6\u0010\u0013¨\u0006Q"}, d2 = {"Lcom/soundcloud/android/likes/TrackLikesUniflowFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/likes/TrackLikesUniflowPresenter;", "Lcom/soundcloud/android/likes/TrackLikesUniflowView;", "()V", "adapter", "Lcom/soundcloud/android/likes/TrackLikesUniflowAdapter;", "getAdapter$base_release", "()Lcom/soundcloud/android/likes/TrackLikesUniflowAdapter;", "setAdapter$base_release", "(Lcom/soundcloud/android/likes/TrackLikesUniflowAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/likes/TrackLikesUniflowItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "offlineToggled", "Lio/reactivex/Observable;", "", "getOfflineToggled", "()Lio/reactivex/Observable;", "offlineToggled$delegate", "Lkotlin/Lazy;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "shuffleClick", "", "getShuffleClick", "shuffleClick$delegate", "syncLikesDialogProvider", "Ljavax/inject/Provider;", "Lcom/soundcloud/android/offline/OfflineLikesDialog;", "getSyncLikesDialogProvider$base_release", "()Ljavax/inject/Provider;", "setSyncLikesDialogProvider$base_release", "(Ljavax/inject/Provider;)V", "trackClick", "Lkotlin/Pair;", "", "", "Lcom/soundcloud/android/likes/TrackLikesTrackUniflowItem;", "getTrackClick", "trackClick$delegate", "upsellClick", "getUpsellClick", "upsellClick$delegate", "upsellImpression", "getUpsellImpression", "upsellImpression$delegate", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "nextPageSignal", "onCreate", "refreshSignal", "Lcom/soundcloud/android/likes/TrackLikesParams;", "requestContent", "showConfirmRemoveOfflineDialog", "showOfflineStorageErrorDialog", "showSyncLikesDialog", "titleResId", "unbindViews", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesUniflowFragment.kt */
public final class TrackLikesUniflowFragment extends UniflowBaseFragment<ma> implements Ha {
    static final /* synthetic */ DZa[] i = {HYa.a((DYa) new EYa(HYa.a(TrackLikesUniflowFragment.class), "upsellImpression", "getUpsellImpression()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesUniflowFragment.class), "shuffleClick", "getShuffleClick()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesUniflowFragment.class), "upsellClick", "getUpsellClick()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesUniflowFragment.class), "offlineToggled", "getOfflineToggled()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(TrackLikesUniflowFragment.class), "trackClick", "getTrackClick()Lio/reactivex/Observable;"))};
    public static final a j = new a(null);
    private final String k = "TrackLikesUniflowPresenter";
    public C4806CMa<ma> l;
    public C3970aa m;
    public C7054oVa<Od> n;
    private C6769kJa<la, C6973nJa> o;
    private final C7744yVa p = BVa.a(new ja(this));
    private final C7744yVa q = BVa.a(new C3982ga(this));
    private final C7744yVa r = BVa.a(new ia(this));
    private final C7744yVa s = BVa.a(new C3976da(this));
    private final C7744yVa t = BVa.a(new C3984ha(this));
    private HashMap u;

    /* compiled from: TrackLikesUniflowFragment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final TrackLikesUniflowFragment a(boolean z) {
            TrackLikesUniflowFragment trackLikesUniflowFragment = new TrackLikesUniflowFragment();
            trackLikesUniflowFragment.setArguments(C1687sb.a(NVa.a("auto_play", Boolean.valueOf(z))));
            return trackLikesUniflowFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public TrackLikesUniflowFragment() {
        SoundCloudApplication.f().a(this);
    }

    public void Rb() {
        HashMap hashMap = this.u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C3970aa aaVar = this.m;
        if (aaVar != null) {
            C6769kJa kja = new C6769kJa(aaVar, C3974ca.a, null, new L(), true, true, false, false, false, false, 964, null);
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

    public final C3970aa Xb() {
        C3970aa aaVar = this.m;
        if (aaVar != null) {
            return aaVar;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<Boolean> Y() {
        C7744yVa yva = this.s;
        DZa dZa = i[3];
        return (APa) yva.getValue();
    }

    public APa<RVa> Z() {
        C7744yVa yva = this.r;
        DZa dZa = i[2];
        return (APa) yva.getValue();
    }

    public APa<RVa> aa() {
        C7744yVa yva = this.p;
        DZa dZa = i[0];
        return (APa) yva.getValue();
    }

    public APa<U> c() {
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("auto_play", false);
        }
        APa<U> d = APa.c(new U(z)).d((C6776kQa<? super T>) new C3980fa<Object>(this));
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
        C7744yVa yva = this.q;
        DZa dZa = i[1];
        return (APa) yva.getValue();
    }

    public APa<U> f() {
        C6769kJa<la, C6973nJa> kja = this.o;
        if (kja != null) {
            APa<U> h = kja.g().h(C3978ea.a);
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
        C7744yVa yva = this.t;
        DZa dZa = i[4];
        return (APa) yva.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.track_likes_title;
    }

    /* access modifiers changed from: protected */
    public ma Tb() {
        C4806CMa<ma> cMa = this.l;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (ma) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<la, C6973nJa> kja = this.o;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        com.soundcloud.android.likes.Ha.a.a(this);
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
    public void b(ma maVar) {
        C7471uYa.b(maVar, "presenter");
        maVar.a();
    }

    /* access modifiers changed from: protected */
    public void a(ma maVar) {
        C7471uYa.b(maVar, "presenter");
        maVar.a((Ha) this);
    }
}
