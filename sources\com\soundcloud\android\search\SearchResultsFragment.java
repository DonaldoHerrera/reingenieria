package com.soundcloud.android.search;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002CDB\u0005¢\u0006\u0002\u0010\u0004J\"\u0010!\u001a\u00020\"2\u0018\u0010#\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0%\u0012\u0004\u0012\u00020\u000e0$H\u0016J\u001a\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\"H\u0016J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0002H\u0014J\b\u0010.\u001a\u00020\u0002H\u0014J\u0010\u0010/\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0002H\u0014J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\"05H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020705H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<05H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020>05H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020105H\u0016J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020105H\u0016J\b\u0010A\u001a\u000203H\u0014J\b\u0010B\u001a\u00020\"H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188TX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006E"}, d2 = {"Lcom/soundcloud/android/search/SearchResultsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/search/SearchResultsPresenter;", "Lcom/soundcloud/android/search/SearchResultsView;", "()V", "adapter", "Lcom/soundcloud/android/search/SearchResultsAdapter;", "getAdapter$base_release", "()Lcom/soundcloud/android/search/SearchResultsAdapter;", "setAdapter$base_release", "(Lcom/soundcloud/android/search/SearchResultsAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/foundation/domain/ListItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/search/SearchResultsFragment$SearchResultsEmptyStateProvider;", "navigationExecutor", "Lcom/soundcloud/android/navigation/NavigationExecutor;", "getNavigationExecutor$base_release", "()Lcom/soundcloud/android/navigation/NavigationExecutor;", "setNavigationExecutor$base_release", "(Lcom/soundcloud/android/navigation/NavigationExecutor;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getFragmentArgs", "Lcom/soundcloud/android/search/SearchFragmentArgs;", "getResId", "", "nextPageSignal", "Lio/reactivex/Observable;", "onPlaylistClicked", "Lcom/soundcloud/android/search/SearchPlaylistItemClickParams;", "onTrackClicked", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/search/SearchTrackItemClickParams;", "onUserClicked", "Lcom/soundcloud/android/search/SearchUserItemClickParams;", "onUserToggleFollow", "Lcom/soundcloud/android/search/SearchUserItemToggleFollowParams;", "refreshSignal", "requestContent", "titleResId", "unbindViews", "Companion", "SearchResultsEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchResultsFragment.kt */
public final class SearchResultsFragment extends UniflowBaseFragment<C5903ha> implements C5917ja {
    public static final a i = new a(null);
    public C4806CMa<C5903ha> j;
    public K k;
    public C4581ija l;
    private C6769kJa<Wca, C6973nJa> m;
    private b n;
    private HashMap o;

    /* compiled from: SearchResultsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: SearchResultsFragment.kt */
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
            return l.emptyview_no_search_results;
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

    public SearchResultsFragment() {
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final SearchFragmentArgs Yb() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            SearchFragmentArgs searchFragmentArgs = (SearchFragmentArgs) arguments.getParcelable("args");
            if (searchFragmentArgs != null) {
                return searchFragmentArgs;
            }
        }
        throw new IllegalArgumentException("Missing Arguments: args");
    }

    public APa<Sa> B() {
        K k2 = this.k;
        if (k2 != null) {
            return k2.m();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<Na> I() {
        K k2 = this.k;
        if (k2 != null) {
            return k2.l();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void Rb() {
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        this.n = new b();
        K k2 = this.k;
        if (k2 != null) {
            N n2 = N.a;
            b bVar = this.n;
            if (bVar != null) {
                C6769kJa kja = new C6769kJa(k2, n2, null, bVar, true, true, false, false, true, false, 708, null);
                this.m = kja;
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
        return Yb().e().name();
    }

    public int Vb() {
        return l.recyclerview_with_refresh_without_empty;
    }

    public void Wb() {
        C6769kJa<Wca, C6973nJa> kja = this.m;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public APa<SearchFragmentArgs> c() {
        APa<SearchFragmentArgs> c = APa.c(Yb());
        C7471uYa.a((Object) c, "Observable.just(getFragmentArgs())");
        return c;
    }

    public APa<RVa> e() {
        C6769kJa<Wca, C6973nJa> kja = this.m;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<SearchFragmentArgs> f() {
        C6769kJa<Wca, C6973nJa> kja = this.m;
        if (kja != null) {
            APa<SearchFragmentArgs> h = kja.g().h(new O(this));
            C7471uYa.a((Object) h, "collectionRenderer.onRef…map { getFragmentArgs() }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public APa<C5941x> r() {
        K k2 = this.k;
        if (k2 != null) {
            return k2.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.search_type_all;
    }

    /* access modifiers changed from: protected */
    public C5903ha Tb() {
        C4806CMa<C5903ha> cMa = this.j;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (C5903ha) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void b() {
        com.soundcloud.android.search.C5917ja.a.a(this);
    }

    public C6781kVa<Ea> n() {
        K k2 = this.k;
        if (k2 != null) {
            return k2.k();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<Wca, C6973nJa> kja = this.m;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(C5903ha haVar) {
        C7471uYa.b(haVar, "presenter");
        haVar.a();
    }

    /* access modifiers changed from: protected */
    public void a(C5903ha haVar) {
        C7471uYa.b(haVar, "presenter");
        haVar.a((C5917ja) this);
    }

    public void a(C6832lEa<List<Wca>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<Wca, C6973nJa> kja = this.m;
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
