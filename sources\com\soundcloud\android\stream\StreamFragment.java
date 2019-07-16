package com.soundcloud.android.stream;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ads.C2617ra;
import com.soundcloud.android.ads.gd;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.W.b;
import com.soundcloud.android.playback.ke;
import com.soundcloud.android.stream.vb.a;
import com.soundcloud.android.stream.vb.c;
import com.soundcloud.android.upsell.i;
import com.soundcloud.android.view.F;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010T\u001a\u00020)2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u000f0VH\u0016J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0-H\u0016J\u001a\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\b\u0010_\u001a\u00020)H\u0016J\u0010\u0010`\u001a\u00020)2\u0006\u0010a\u001a\u00020\u0002H\u0014J\b\u0010b\u001a\u00020\u0002H\u0014J\u0010\u0010c\u001a\u00020)2\u0006\u0010a\u001a\u00020\u0002H\u0014J\b\u0010d\u001a\u00020.H\u0016J\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00020)0-H\u0016J\u0012\u0010f\u001a\u00020)2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\u0018\u0010g\u001a\u00020)2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0016J&\u0010l\u001a\u0004\u0018\u00010\\2\u0006\u0010j\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010o2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\b\u0010p\u001a\u00020)H\u0016J\b\u0010q\u001a\u00020)H\u0016J\b\u0010r\u001a\u00020)H\u0016J\u000e\u0010s\u001a\b\u0012\u0004\u0012\u00020t0-H\u0016J\u000e\u0010u\u001a\b\u0012\u0004\u0012\u00020v0-H\u0016J\u000e\u0010w\u001a\b\u0012\u0004\u0012\u00020)0-H\u0016J\b\u0010x\u001a\u00020)H\u0016J\b\u0010y\u001a\u00020.H\u0014J\u000e\u0010z\u001a\b\u0012\u0004\u0012\u00020{0-H\u0016J\b\u0010|\u001a\u00020)H\u0016J\u000e\u0010}\u001a\b\u0012\u0004\u0012\u00020)0-H\u0016J\u000e\u0010~\u001a\b\u0012\u0004\u0012\u000200-H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020Y0-H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eXD¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R!\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-8VX\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100R!\u00103\u001a\b\u0012\u0004\u0012\u00020.0-8VX\u0002¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b4\u00100R!\u00106\u001a\b\u0012\u0004\u0012\u00020)0-8VX\u0002¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b7\u00100R\u001e\u00109\u001a\u00020:8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0016¨\u0006\u0001"}, d2 = {"Lcom/soundcloud/android/stream/StreamFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/stream/StreamPresenter;", "Lcom/soundcloud/android/stream/StreamView;", "Lcom/soundcloud/android/main/MainPagerAdapter$ScrollContent;", "()V", "adapter", "Lcom/soundcloud/android/stream/StreamAdapter;", "getAdapter$base_release", "()Lcom/soundcloud/android/stream/StreamAdapter;", "setAdapter$base_release", "(Lcom/soundcloud/android/stream/StreamAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/stream/StreamItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/stream/StreamEmptyStateProvider;", "layoutManagerChange", "Lio/reactivex/subjects/BehaviorSubject;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "getLayoutManagerChange", "()Lio/reactivex/subjects/BehaviorSubject;", "newItemsIndicator", "Lcom/soundcloud/android/view/NewItemsIndicator;", "getNewItemsIndicator$base_release", "()Lcom/soundcloud/android/view/NewItemsIndicator;", "setNewItemsIndicator$base_release", "(Lcom/soundcloud/android/view/NewItemsIndicator;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "scrollReset", "Lio/reactivex/subjects/PublishSubject;", "", "getScrollReset", "()Lio/reactivex/subjects/PublishSubject;", "scrollStateChange", "Lio/reactivex/Observable;", "", "getScrollStateChange", "()Lio/reactivex/Observable;", "scrollStateChange$delegate", "Lkotlin/Lazy;", "scrolled", "getScrolled", "scrolled$delegate", "searchActionClick", "getSearchActionClick", "searchActionClick$delegate", "streamAdsController", "Lcom/soundcloud/android/ads/StreamAdsController;", "getStreamAdsController$base_release", "()Lcom/soundcloud/android/ads/StreamAdsController;", "setStreamAdsController$base_release", "(Lcom/soundcloud/android/ads/StreamAdsController;)V", "streamMeasurements", "Lcom/soundcloud/android/stream/perf/StreamMeasurements;", "getStreamMeasurements$base_release", "()Lcom/soundcloud/android/stream/perf/StreamMeasurements;", "setStreamMeasurements$base_release", "(Lcom/soundcloud/android/stream/perf/StreamMeasurements;)V", "titleBarUpsellController", "Lcom/soundcloud/android/upsell/TitleBarUpsellController;", "getTitleBarUpsellController$base_release", "()Lcom/soundcloud/android/upsell/TitleBarUpsellController;", "setTitleBarUpsellController$base_release", "(Lcom/soundcloud/android/upsell/TitleBarUpsellController;)V", "videoSurfaceProvider", "Lcom/soundcloud/android/playback/VideoSurfaceProvider;", "getVideoSurfaceProvider$base_release", "()Lcom/soundcloud/android/playback/VideoSurfaceProvider;", "setVideoSurfaceProvider$base_release", "(Lcom/soundcloud/android/playback/VideoSurfaceProvider;)V", "visible", "Lcom/soundcloud/android/stream/ViewVisibilityState;", "getVisible", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "Lcom/soundcloud/android/stream/StreamViewModel;", "appInstallCallback", "Lcom/soundcloud/android/ads/AdItemCallback;", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "nextPageSignal", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPause", "onResume", "playlistClick", "Lcom/soundcloud/android/stream/PlaylistStreamItem;", "refreshSignal", "Lcom/soundcloud/android/stream/StreamView$RefreshType;", "requestContent", "resetScroll", "titleResId", "trackClick", "Lcom/soundcloud/android/stream/TrackStreamItemClickParams;", "unbindViews", "upsellHeaderItemCallback", "upsellItemCallback", "Lcom/soundcloud/android/upsell/UpsellItemCallback;", "videoAdItemCallback", "base_release"}, mv = {1, 1, 15})
/* compiled from: StreamFragment.kt */
public final class StreamFragment extends UniflowBaseFragment<ib> implements rb, b {
    static final /* synthetic */ DZa[] i = {HYa.a((DYa) new EYa(HYa.a(StreamFragment.class), "scrollStateChange", "getScrollStateChange()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(StreamFragment.class), "scrolled", "getScrolled()Lio/reactivex/Observable;")), HYa.a((DYa) new EYa(HYa.a(StreamFragment.class), "searchActionClick", "getSearchActionClick()Lio/reactivex/Observable;"))};
    public C4806CMa<ib> j;
    public C6114y k;
    public F l;
    public ke m;
    public gd n;
    public C4762Aza o;
    public i p;
    private C6769kJa<C6109va, C6973nJa> q;
    private C6080ga r;
    private final String s = "StreamPresenterKey";
    private final C6781kVa<RVa> t;
    private final C7744yVa u;
    private final C7744yVa v;
    private final C6713jVa<StaggeredGridLayoutManager> w;
    private final C7744yVa x;
    private final C6713jVa<vb> y;
    private HashMap z;

    public StreamFragment() {
        C6781kVa<RVa> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, "PublishSubject.create()");
        this.t = s2;
        this.u = BVa.a(new C6100qa(this));
        this.v = BVa.a(new C6101ra(this));
        C6713jVa<StaggeredGridLayoutManager> s3 = C6713jVa.s();
        C7471uYa.a((Object) s3, "BehaviorSubject.create()");
        this.w = s3;
        this.x = BVa.a(new C6103sa(this));
        C6713jVa<vb> f = C6713jVa.f(a.a);
        C7471uYa.a((Object) f, "BehaviorSubject.createDe…sibilityState.NotVisible)");
        this.y = f;
        SoundCloudApplication.f().a(this);
    }

    public static final /* synthetic */ C6769kJa a(StreamFragment streamFragment) {
        C6769kJa<C6109va, C6973nJa> kja = streamFragment.q;
        if (kja != null) {
            return kja;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public static final /* synthetic */ C6080ga b(StreamFragment streamFragment) {
        C6080ga gaVar = streamFragment.r;
        if (gaVar != null) {
            return gaVar;
        }
        C7471uYa.b("emptyStateProvider");
        throw null;
    }

    public APa<RVa> Ca() {
        C7744yVa yva = this.x;
        DZa dZa = i[2];
        return (APa) yva.getValue();
    }

    public APa<Integer> La() {
        C7744yVa yva = this.v;
        DZa dZa = i[1];
        return (APa) yva.getValue();
    }

    public APa<RVa> Ra() {
        C6114y yVar = this.k;
        if (yVar != null) {
            APa<RVa> o2 = yVar.o();
            C7471uYa.a((Object) o2, "adapter.upsellHeaderItemCallback()");
            return o2;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void Rb() {
        HashMap hashMap = this.z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        this.r = new C6080ga();
        C6114y yVar = this.k;
        if (yVar != null) {
            C6090la laVar = C6090la.a;
            C6080ga gaVar = this.r;
            if (gaVar != null) {
                C6769kJa kja = new C6769kJa(yVar, laVar, null, gaVar, true, false, true, false, true, false, 676, null);
                this.q = kja;
                return;
            }
            C7471uYa.b("emptyStateProvider");
            throw null;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.s;
    }

    public int Vb() {
        return l.recyclerview_with_new_items_indicator;
    }

    public void Wb() {
        F f = this.l;
        if (f != null) {
            f.c();
            C6769kJa<C6109va, C6973nJa> kja = this.q;
            if (kja != null) {
                kja.b();
            } else {
                C7471uYa.b("collectionRenderer");
                throw null;
            }
        } else {
            C7471uYa.b("newItemsIndicator");
            throw null;
        }
    }

    public final C6114y Xb() {
        C6114y yVar = this.k;
        if (yVar != null) {
            return yVar;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public final F Yb() {
        F f = this.l;
        if (f != null) {
            return f;
        }
        C7471uYa.b("newItemsIndicator");
        throw null;
    }

    public final C4762Aza Zb() {
        C4762Aza aza = this.o;
        if (aza != null) {
            return aza;
        }
        C7471uYa.b("streamMeasurements");
        throw null;
    }

    public APa<RVa> c() {
        APa<RVa> d = APa.c(RVa.a).d((C6776kQa<? super T>) new C6098pa<Object>(this));
        C7471uYa.a((Object) d, "Observable.just(Unit).do…urements.startLoading() }");
        return d;
    }

    public View c(int i2) {
        if (this.z == null) {
            this.z = new HashMap();
        }
        View view = (View) this.z.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.z.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public APa<RVa> e() {
        C6769kJa<C6109va, C6973nJa> kja = this.q;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<rb.b> f() {
        F f = this.l;
        if (f != null) {
            APa h = f.f().h(C6092ma.a);
            C6769kJa<C6109va, C6973nJa> kja = this.q;
            if (kja != null) {
                APa<rb.b> b = APa.b((EPa<? extends T>) h, (EPa<? extends T>) kja.g().h(C6094na.a).d((C6776kQa<? super T>) new C6096oa<Object>(this)));
                C7471uYa.a((Object) b, "Observable.merge(newItem…                       })");
                return b;
            }
            C7471uYa.b("collectionRenderer");
            throw null;
        }
        C7471uYa.b("newItemsIndicator");
        throw null;
    }

    public APa<C6102s> k() {
        C6114y yVar = this.k;
        if (yVar != null) {
            APa<C6102s> l2 = yVar.l();
            C7471uYa.a((Object) l2, "adapter.playlistClick()");
            return l2;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<ub> l() {
        C6114y yVar = this.k;
        if (yVar != null) {
            APa<ub> h = yVar.n().h(new C6105ta(this));
            C7471uYa.a((Object) h, "adapter.trackClick().map…rams(it, adapter.items) }");
            return h;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C7471uYa.b(menu, "menu");
        C7471uYa.b(menuInflater, "inflater");
        i iVar = this.p;
        if (iVar != null) {
            iVar.a(menu, Yca.STREAM);
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

    public void onDestroy() {
        FragmentActivity activity = getActivity();
        String str = "videoSurfaceProvider";
        if (activity == null || !activity.isChangingConfigurations()) {
            ke keVar = this.m;
            if (keVar != null) {
                keVar.b(ke.b.STREAM);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            ke keVar2 = this.m;
            if (keVar2 != null) {
                keVar2.a(ke.b.STREAM);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        }
        gd gdVar = this.n;
        if (gdVar != null) {
            gdVar.d();
            super.onDestroy();
            return;
        }
        C7471uYa.b("streamAdsController");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public void onPause() {
        gd gdVar = this.n;
        if (gdVar != null) {
            gdVar.a((Fragment) this);
            super.onPause();
            return;
        }
        C7471uYa.b("streamAdsController");
        throw null;
    }

    public void onResume() {
        pa().a(c.a);
        super.onResume();
    }

    public APa<C2617ra> ra() {
        C6114y yVar = this.k;
        if (yVar != null) {
            APa<C2617ra> j2 = yVar.j();
            C7471uYa.a((Object) j2, "adapter.appInstallCallback()");
            return j2;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C2617ra> ua() {
        C6114y yVar = this.k;
        if (yVar != null) {
            APa<C2617ra> q2 = yVar.q();
            C7471uYa.a((Object) q2, "adapter.videoAdItemCallback()");
            return q2;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<com.soundcloud.android.upsell.l> ya() {
        C6114y yVar = this.k;
        if (yVar != null) {
            APa<com.soundcloud.android.upsell.l> p2 = yVar.p();
            C7471uYa.a((Object) p2, "adapter.upsellItemCallback()");
            return p2;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<Integer> za() {
        C7744yVa yva = this.u;
        DZa dZa = i[0];
        return (APa) yva.getValue();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.tab_stream;
    }

    /* access modifiers changed from: protected */
    public ib Tb() {
        C4806CMa<ib> cMa = this.j;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (ib) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public C6713jVa<vb> pa() {
        return this.y;
    }

    public C6713jVa<StaggeredGridLayoutManager> va() {
        return this.w;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        F f = this.l;
        String str = "newItemsIndicator";
        if (f != null) {
            f.a(o.stream_new_posts);
            F f2 = this.l;
            if (f2 != null) {
                f2.a((TextView) view.findViewById(ia.i.new_items_indicator));
                C6769kJa<C6109va, C6973nJa> kja = this.q;
                String str2 = "collectionRenderer";
                if (kja != null) {
                    C6769kJa.a(kja, view, true, new C6088ka(this), 0, 8, null);
                    C6769kJa<C6109va, C6973nJa> kja2 = this.q;
                    if (kja2 != null) {
                        RecyclerView c = kja2.c();
                        if (c != null) {
                            F f3 = this.l;
                            if (f3 != null) {
                                c.a((m) f3.d());
                                gd gdVar = this.n;
                                if (gdVar != null) {
                                    RecyclerView recyclerView = (RecyclerView) c(ia.i.ak_recycler_view);
                                    C6114y yVar = this.k;
                                    if (yVar != null) {
                                        gdVar.a(recyclerView, yVar);
                                    } else {
                                        C7471uYa.b("adapter");
                                        throw null;
                                    }
                                } else {
                                    C7471uYa.b("streamAdsController");
                                    throw null;
                                }
                            } else {
                                C7471uYa.b(str);
                                throw null;
                            }
                        } else {
                            C7471uYa.a();
                            throw null;
                        }
                    } else {
                        C7471uYa.b(str2);
                        throw null;
                    }
                } else {
                    C7471uYa.b(str2);
                    throw null;
                }
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    public void b() {
        rb.a.a(this);
    }

    /* access modifiers changed from: protected */
    public void b(ib ibVar) {
        C7471uYa.b(ibVar, "presenter");
        ibVar.a();
    }

    /* access modifiers changed from: protected */
    public void a(ib ibVar) {
        C7471uYa.b(ibVar, "presenter");
        ibVar.a((rb) this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r4 != null) goto L_0x006f;
     */
    public void a(C6832lEa<sb, C6973nJa> lea) {
        List list;
        C7471uYa.b(lea, "viewModel");
        String str = "streamMeasurements";
        String str2 = "collectionRenderer";
        if (!lea.a().d()) {
            C6769kJa<C6109va, C6973nJa> kja = this.q;
            if (kja == null) {
                C7471uYa.b(str2);
                throw null;
            } else if (kja.d()) {
                C4762Aza aza = this.o;
                if (aza != null) {
                    aza.a();
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            }
        }
        if (!lea.a().e()) {
            C6769kJa<C6109va, C6973nJa> kja2 = this.q;
            if (kja2 == null) {
                C7471uYa.b(str2);
                throw null;
            } else if (kja2.e()) {
                C4762Aza aza2 = this.o;
                if (aza2 != null) {
                    aza2.b();
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            }
        }
        C6769kJa<C6109va, C6973nJa> kja3 = this.q;
        if (kja3 != null) {
            C6900mEa a = lea.a();
            sb sbVar = (sb) lea.b();
            if (sbVar != null) {
                list = sbVar.b();
            }
            list = C6918mWa.a();
            kja3.a(new C4736AEa<>(a, list));
            sb sbVar2 = (sb) lea.b();
            if (sbVar2 != null) {
                int a2 = sbVar2.a();
                F f = this.l;
                if (f != null) {
                    f.b(a2);
                } else {
                    C7471uYa.b("newItemsIndicator");
                    throw null;
                }
            }
        } else {
            C7471uYa.b(str2);
            throw null;
        }
    }
}
