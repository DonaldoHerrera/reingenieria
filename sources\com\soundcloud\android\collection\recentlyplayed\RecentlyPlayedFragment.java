package com.soundcloud.android.collection.recentlyplayed;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.collection.recentlyplayed.C2821l.a;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.j;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010 \u001a\u00020\u000f2\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140#\u0012\u0004\u0012\u00020\u00150\"H\u0016J\u001a\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u000fH\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0+H\u0016J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0002H\u0014J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u0002H\u0014J\u0010\u00101\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0002H\u0014J\b\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000203H\u0002J\u0012\u00107\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002090+H\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u0002090+H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f0+H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000f0+H\u0016J\u0010\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020\u000fH\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u0002090+H\u0016J\b\u0010B\u001a\u000203H\u0014J\b\u0010C\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006D"}, d2 = {"Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedPresenter;", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedView;", "()V", "adapter", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedAdapter;", "adapterFactory", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedAdapter$Factory;", "getAdapterFactory", "()Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedAdapter$Factory;", "setAdapterFactory", "(Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedAdapter$Factory;)V", "clearConfirmationClick", "Lio/reactivex/subjects/BehaviorSubject;", "", "getClearConfirmationClick", "()Lio/reactivex/subjects/BehaviorSubject;", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "clearContent", "Lio/reactivex/Observable;", "connectPresenter", "presenter", "createLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "createPresenter", "disconnectPresenter", "getResId", "", "getSpanSizeLookup", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "spanCount", "onCreate", "playlistClick", "Lcom/soundcloud/android/foundation/domain/Urn;", "profileClick", "refreshSignal", "requestContent", "setupRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showClearContentDialog", "stationClick", "titleResId", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: RecentlyPlayedFragment.kt */
public final class RecentlyPlayedFragment extends UniflowBaseFragment<C2816ia> implements Ma {
    public C4806CMa<C2816ia> i;
    public a j;
    private C6769kJa<E, C6973nJa> k;
    private final C6713jVa<RVa> l;
    /* access modifiers changed from: private */
    public final C2821l m;
    private final String n;
    private HashMap o;

    public RecentlyPlayedFragment() {
        C6713jVa<RVa> s = C6713jVa.s();
        C7471uYa.a((Object) s, "BehaviorSubject.create()");
        this.l = s;
        SoundCloudApplication.f().a(this);
        a aVar = this.j;
        if (aVar != null) {
            this.m = a.a(aVar, false, 1, null);
            this.n = "recentlyPlayedPresenter";
            return;
        }
        C7471uYa.b("adapterFactory");
        throw null;
    }

    /* access modifiers changed from: private */
    public final GridLayoutManager Yb() {
        int integer = getResources().getInteger(j.collection_grid_span_count);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), integer);
        gridLayoutManager.a(c(integer));
        return gridLayoutManager;
    }

    public APa<C3508cda> Da() {
        return this.m.l();
    }

    public APa<C3508cda> J() {
        return this.m.m();
    }

    public void Rb() {
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C6769kJa kja = new C6769kJa(this.m, C2834x.a, null, new C2832v(), true, false, false, false, true, false, 612, null);
        this.k = kja;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.n;
    }

    public int Vb() {
        return l.recyclerview_with_refresh_and_toolbar_without_empty;
    }

    public void W() {
        new C2809f().a((a) new C2836z(this)).a(getFragmentManager());
    }

    public void Wb() {
        C6769kJa<E, C6973nJa> kja = this.k;
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
        return Ma.a.a(this);
    }

    public APa<RVa> f() {
        C6769kJa<E, C6973nJa> kja = this.k;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<RVa> ia() {
        return this.m.j();
    }

    public APa<C3508cda> k() {
        return this.m.k();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    private final b c(int i2) {
        return new C2835y(this, i2);
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.collections_recently_played_header;
    }

    public C6713jVa<RVa> S() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public C2816ia Tb() {
        C4806CMa<C2816ia> cMa = this.i;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (C2816ia) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<E, C6973nJa> kja = this.k;
        if (kja != null) {
            C6769kJa.a(kja, view, false, new C2833w(this), 0, 10, null);
            View findViewById = view.findViewById(i.ak_recycler_view);
            C7471uYa.a((Object) findViewById, "view.findViewById(R.id.ak_recycler_view)");
            a((RecyclerView) findViewById);
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void b() {
        Ma.a.b(this);
    }

    /* access modifiers changed from: protected */
    public void b(C2816ia iaVar) {
        C7471uYa.b(iaVar, "presenter");
        iaVar.a();
    }

    /* access modifiers changed from: protected */
    public void a(C2816ia iaVar) {
        C7471uYa.b(iaVar, "presenter");
        iaVar.a((Ma) this);
    }

    public void a(C6832lEa<List<E>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<E, C6973nJa> kja = this.k;
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

    private final void a(RecyclerView recyclerView) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(g.collection_padding);
        recyclerView.setClipToPadding(false);
        recyclerView.a((h) new F(dimensionPixelSize));
        recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }
}
