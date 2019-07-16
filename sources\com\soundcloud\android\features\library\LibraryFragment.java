package com.soundcloud.android.features.library;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.soundcloud.android.collection.B;
import com.soundcloud.android.features.library.Z.a;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.search.C5916j;
import com.soundcloud.android.upsell.i;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010%\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130)\u0012\u0004\u0012\u00020\u00140(H\u0016J\u001a\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020&H\u0016J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020\u0002H\u0014J\b\u00102\u001a\u00020\u0002H\u0014J\u0010\u00103\u001a\u00020&2\u0006\u00101\u001a\u00020\u0002H\u0014J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\b\u00107\u001a\u000208H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u0010\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<H\u0016J\u0012\u0010=\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0018\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020E05H\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020E05H\u0016J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020E05H\u0016J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\b\u0010L\u001a\u000208H\u0014J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020E05H\u0016J\b\u0010N\u001a\u00020&H\u0016J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020&05H\u0016J\u000e\u0010R\u001a\b\u0012\u0004\u0012\u00020&05H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006S"}, d2 = {"Lcom/soundcloud/android/features/library/LibraryFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/features/library/LibraryPresenter;", "Lcom/soundcloud/android/features/library/LibraryView;", "()V", "adapter", "Lcom/soundcloud/android/features/library/LibraryAdapter;", "getAdapter$collections_ui_release", "()Lcom/soundcloud/android/features/library/LibraryAdapter;", "setAdapter$collections_ui_release", "(Lcom/soundcloud/android/features/library/LibraryAdapter;)V", "collection2Experiment", "Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;", "getCollection2Experiment$collections_ui_release", "()Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;", "setCollection2Experiment$collections_ui_release", "(Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/collection/CollectionItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$collections_ui_release", "()Ldagger/Lazy;", "setPresenterLazy$collections_ui_release", "(Ldagger/Lazy;)V", "titleBarUpsellController", "Lcom/soundcloud/android/upsell/TitleBarUpsellController;", "getTitleBarUpsellController$collections_ui_release", "()Lcom/soundcloud/android/upsell/TitleBarUpsellController;", "setTitleBarUpsellController$collections_ui_release", "(Lcom/soundcloud/android/upsell/TitleBarUpsellController;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "downloadsClick", "Lio/reactivex/Observable;", "followingsClick", "getResId", "", "likesClick", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onboardingItemClosed", "playlistItemClick", "Lcom/soundcloud/android/foundation/domain/Urn;", "playlistsClick", "profileItemClick", "refreshSignal", "requestContent", "stationItemClick", "stationsClick", "titleResId", "trackItemClick", "unbindViews", "upsellClick", "upsellClose", "upsellHeaderClick", "upsellShown", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: LibraryFragment.kt */
public final class LibraryFragment extends UniflowBaseFragment<T> implements Z {
    private final String i = "LibraryPresenterKey";
    public C4806CMa<T> j;
    public C3580f k;
    public C2040FU l;
    public i m;
    private C6769kJa<B, C6973nJa> n;
    private HashMap o;

    public void Rb() {
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C3580f fVar = this.k;
        if (fVar != null) {
            C6769kJa kja = new C6769kJa(fVar, C3582h.a, null, new C5916j(), true, false, true, false, false, false, 932, null);
            this.n = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.i;
    }

    public int Vb() {
        return l.recyclerview_with_top_divider_and_refresh_and_toolbar_without_empty;
    }

    public void Wb() {
        C6769kJa<B, C6973nJa> kja = this.n;
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
        return a.a(this);
    }

    public APa<RVa> f() {
        C6769kJa<B, C6973nJa> kja = this.n;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<RVa> g() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.m();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> h() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.k();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> i() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.n();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> j() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.l();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> m() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
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
        i iVar = this.m;
        if (iVar != null) {
            iVar.a(menu, Yca.COLLECTIONS);
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        C7471uYa.b("titleBarUpsellController");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public APa<RVa> p() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.o();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> q() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.s();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> s() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.r();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> t() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.p();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> u() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.t();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> v() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.u();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> w() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.v();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> y() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.w();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> z() {
        C3580f fVar = this.k;
        if (fVar != null) {
            return fVar.q();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.tab_library;
    }

    /* access modifiers changed from: protected */
    public T Tb() {
        C4806CMa<T> cMa = this.j;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (T) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<B, C6973nJa> kja = this.n;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        a.b(this);
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        C7471uYa.b(t, "presenter");
        t.a((Z) this);
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        C7471uYa.b(t, "presenter");
        t.a();
    }

    public void a(C6832lEa<List<B>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<B, C6973nJa> kja = this.n;
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
}
