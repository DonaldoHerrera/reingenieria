package com.soundcloud.android.stations;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.j;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000278B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001f\u0012\u0004\u0012\u00020\u000e0\u001eH\u0016J\u001a\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002H\u0014J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0002H\u0014J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002H\u0014J\b\u0010,\u001a\u00020-H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0/H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0/H\u0016J\u0016\u00101\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u0001030302H\u0016J\b\u00105\u001a\u00020-H\u0014J\b\u00106\u001a\u00020\u001cH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00069"}, d2 = {"Lcom/soundcloud/android/stations/LikedStationsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/stations/LikedStationsPresenter;", "Lcom/soundcloud/android/stations/LikedStationsView;", "()V", "adapter", "Lcom/soundcloud/android/stations/StationsAdapter;", "getAdapter$base_release", "()Lcom/soundcloud/android/stations/StationsAdapter;", "setAdapter$base_release", "(Lcom/soundcloud/android/stations/StationsAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/stations/StationViewModel;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/stations/LikedStationsFragment$LikedStationEmptyStateProvider;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "createPresenter", "disconnectPresenter", "getResId", "", "refreshSignal", "Lio/reactivex/Observable;", "requestContent", "stationClick", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/foundation/domain/Urn;", "kotlin.jvm.PlatformType", "titleResId", "unbindViews", "Companion", "LikedStationEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: LikedStationsFragment.kt */
public final class LikedStationsFragment extends UniflowBaseFragment<C6065za> implements Fa {
    public static final a i = new a(null);
    public C4806CMa<C6065za> j;
    public Rb k;
    private C6769kJa<Nb, C6973nJa> l;
    private b m = new b();
    private final String n = "LikedStationsPresenter";
    private HashMap o;

    /* compiled from: LikedStationsFragment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Fragment a() {
            return new LikedStationsFragment();
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: LikedStationsFragment.kt */
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
            return l.emptyview_no_liked_station;
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

    public LikedStationsFragment() {
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final i Yb() {
        return new GridLayoutManager(getContext(), getResources().getInteger(j.stations_grid_span_count));
    }

    public void Rb() {
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        Rb rb = this.k;
        if (rb != null) {
            C6769kJa kja = new C6769kJa(rb, C6030na.a, null, this.m, true, false, false, false, false, false, 964, null);
            this.l = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.n;
    }

    public int Vb() {
        return l.recyclerview_with_refresh_and_toolbar_and_page_bg_without_empty;
    }

    public void Wb() {
        C6769kJa<Nb, C6973nJa> kja = this.l;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public APa<RVa> c() {
        APa<RVa> c = APa.c(RVa.a);
        C7471uYa.a((Object) c, "Observable.just(Unit)");
        return c;
    }

    public APa<RVa> e() {
        return com.soundcloud.android.stations.Fa.a.a(this);
    }

    public APa<RVa> f() {
        C6769kJa<Nb, C6973nJa> kja = this.l;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public C6781kVa<C3508cda> J() {
        Rb rb = this.k;
        if (rb != null) {
            return rb.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.stations_collection_title_liked_stations;
    }

    /* access modifiers changed from: protected */
    public C6065za Tb() {
        C4806CMa<C6065za> cMa = this.j;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (C6065za) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void b() {
        com.soundcloud.android.stations.Fa.a.b(this);
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<Nb, C6973nJa> kja = this.l;
        if (kja != null) {
            C6769kJa.a(kja, view, false, new C6027ma(this), 0, 10, null);
            ((RecyclerView) view.findViewById(ia.i.ak_recycler_view)).setHasFixedSize(true);
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b(C6065za zaVar) {
        C7471uYa.b(zaVar, "presenter");
        zaVar.a();
    }

    public void a(C6832lEa<List<Nb>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<Nb, C6973nJa> kja = this.l;
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
    public void a(C6065za zaVar) {
        C7471uYa.b(zaVar, "presenter");
        zaVar.a((Fa) this);
    }
}
