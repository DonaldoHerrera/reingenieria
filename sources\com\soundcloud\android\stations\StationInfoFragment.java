package com.soundcloud.android.stations;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.stations._a.c;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002EFB\u0005¢\u0006\u0002\u0010\u0004J\"\u0010+\u001a\u00020,2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130/\u0012\u0004\u0012\u00020\u00140.H\u0016J\u001a\u00100\u001a\u00020,2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020,H\u0016J\u0010\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020\u0002H\u0014J\b\u00108\u001a\u00020\u0002H\u0014J\u0010\u00109\u001a\u00020,2\u0006\u00107\u001a\u00020\u0002H\u0014J\b\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020=H\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020,0\u0018H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020;0\u0018H\u0016J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020;0\u0018H\u0016J\b\u0010A\u001a\u00020=H\u0014J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0018H\u0016J\b\u0010D\u001a\u00020,H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001e8TX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R!\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00188VX\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b)\u0010\u001b¨\u0006G"}, d2 = {"Lcom/soundcloud/android/stations/StationInfoFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/stations/StationInfoPresenter;", "Lcom/soundcloud/android/stations/StationInfoView;", "()V", "adapter", "Lcom/soundcloud/android/stations/StationInfoAdapter;", "getAdapter", "()Lcom/soundcloud/android/stations/StationInfoAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "adapterFactory", "Lcom/soundcloud/android/stations/StationInfoAdapter$Factory;", "getAdapterFactory$base_release", "()Lcom/soundcloud/android/stations/StationInfoAdapter$Factory;", "setAdapterFactory$base_release", "(Lcom/soundcloud/android/stations/StationInfoAdapter$Factory;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/stations/StationInfoItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/stations/StationInfoFragment$StationInfoEmptyStateProvider;", "playStationClick", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/stations/StationInfoPageClickParams$PlayStationClickParams;", "getPlayStationClick", "()Lio/reactivex/Observable;", "playStationClick$delegate", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "trackClick", "Lcom/soundcloud/android/stations/StationInfoPageClickParams$TrackClickParams;", "getTrackClick", "trackClick$delegate", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getFragmentArgs", "Lcom/soundcloud/android/stations/StationFragmentArgs;", "getResId", "", "nextPageSignal", "refreshSignal", "requestContent", "titleResId", "toggleLikeClick", "Lcom/soundcloud/android/stations/StationInfoPageClickParams$LikeStationClickParams;", "unbindViews", "Companion", "StationInfoEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: StationInfoFragment.kt */
public final class StationInfoFragment extends UniflowBaseFragment<C6034ob> implements C6051ub {
    static final /* synthetic */ DZa[] i = {HYa.a((DYa) new EYa(HYa.a(StationInfoFragment.class), "adapter", "getAdapter()Lcom/soundcloud/android/stations/StationInfoAdapter;")), HYa.a((DYa) new EYa(HYa.a(StationInfoFragment.class), "playStationClick", "getPlayStationClick()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(StationInfoFragment.class), "trackClick", "getTrackClick()Lio/reactivex/Observable;"))};
    public static final a j = new a(null);
    public C4806CMa<C6034ob> k;
    public com.soundcloud.android.stations.Ma.a l;
    private C6769kJa<Za, C6973nJa> m;
    private b n = new b();
    private final C7744yVa o = BVa.a(new Oa(this));
    private final C7744yVa p = BVa.a(new Ra(this));
    private final C7744yVa q = BVa.a(new Ua(this));
    private HashMap r;

    /* compiled from: StationInfoFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: StationInfoFragment.kt */
    public static final class b implements C6837lJa {
        public void a(View view, C6973nJa nja) {
            C7471uYa.b(view, "view");
            C7471uYa.b(nja, "errorType");
            defpackage.C6837lJa.a.a(this, view, nja);
        }

        public void b(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.b(this, view);
        }

        public int c() {
            return defpackage.C6837lJa.a.c(this);
        }

        public int d() {
            return defpackage.C6837lJa.a.a(this);
        }

        public int b() {
            return l.emptyview_server_error;
        }

        public void a(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.a((C6837lJa) this, view);
        }

        public int a(C6973nJa nja) {
            C7471uYa.b(nja, "legacyError");
            return defpackage.C6837lJa.a.a((C6837lJa) this, nja);
        }

        public int a() {
            return defpackage.C6837lJa.a.b(this);
        }
    }

    public StationInfoFragment() {
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final Ma Yb() {
        C7744yVa yva = this.o;
        DZa dZa = i[0];
        return (Ma) yva.getValue();
    }

    /* access modifiers changed from: private */
    public final StationFragmentArgs Zb() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            StationFragmentArgs stationFragmentArgs = (StationFragmentArgs) arguments.getParcelable("args");
            if (stationFragmentArgs != null) {
                return stationFragmentArgs;
            }
        }
        throw new IllegalArgumentException("Missing Arguments: args");
    }

    public APa<com.soundcloud.android.stations._a.a> M() {
        return Yb().k();
    }

    public APa<com.soundcloud.android.stations._a.b> Q() {
        C7744yVa yva = this.p;
        DZa dZa = i[1];
        return (APa) yva.getValue();
    }

    public void Rb() {
        HashMap hashMap = this.r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C6769kJa kja = new C6769kJa(Yb(), Pa.a, null, this.n, false, false, false, false, false, false, 612, null);
        this.m = kja;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return "stationInfoPresenter";
    }

    public int Vb() {
        return l.recyclerview_with_refresh_and_toolbar_without_empty;
    }

    public void Wb() {
        C6769kJa<Za, C6973nJa> kja = this.m;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final com.soundcloud.android.stations.Ma.a Xb() {
        com.soundcloud.android.stations.Ma.a aVar = this.l;
        if (aVar != null) {
            return aVar;
        }
        C7471uYa.b("adapterFactory");
        throw null;
    }

    public APa<StationFragmentArgs> c() {
        APa<StationFragmentArgs> c = APa.c(Zb());
        C7471uYa.a((Object) c, "Observable.just(getFragmentArgs())");
        return c;
    }

    public APa<RVa> e() {
        C6769kJa<Za, C6973nJa> kja = this.m;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<StationFragmentArgs> f() {
        C6769kJa<Za, C6973nJa> kja = this.m;
        if (kja != null) {
            APa<StationFragmentArgs> h = kja.g().h(new Sa(this));
            C7471uYa.a((Object) h, "collectionRenderer.onRef…map { getFragmentArgs() }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<c> o() {
        C7744yVa yva = this.q;
        DZa dZa = i[2];
        return (APa) yva.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.stations_collection_title_station_page;
    }

    /* access modifiers changed from: protected */
    public C6034ob Tb() {
        C4806CMa<C6034ob> cMa = this.k;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (C6034ob) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<Za, C6973nJa> kja = this.m;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        com.soundcloud.android.stations.C6051ub.a.a(this);
    }

    /* access modifiers changed from: protected */
    public void a(C6034ob obVar) {
        C7471uYa.b(obVar, "presenter");
        obVar.a((C6051ub) this);
    }

    /* access modifiers changed from: protected */
    public void b(C6034ob obVar) {
        C7471uYa.b(obVar, "presenter");
        obVar.a();
    }

    public void a(C6832lEa<List<Za>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<Za, C6973nJa> kja = this.m;
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
}
