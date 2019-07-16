package com.soundcloud.android.features.library.playlists;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import com.soundcloud.android.collection.C;
import com.soundcloud.android.features.library.aa.g;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.j;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001!\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001JB\u0005¢\u0006\u0002\u0010\u0004J\"\u0010-\u001a\u00020\u00162\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r00\u0012\u0004\u0012\u00020\u000e0/H\u0016J\u001a\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020\u0016H\u0016J\u0010\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0002H\u0014J\u0010\u00109\u001a\n \u0012*\u0004\u0018\u00010\u00020\u0002H\u0014J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0002H\u0014J\b\u0010?\u001a\u00020=H\u0016J\u0012\u0010@\u001a\u00020\u00162\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016J,\u0010D\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00160\u0016 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00160\u0016\u0018\u00010B0BH\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160BH\u0016J\u0010\u0010F\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u0011H\u0016J\b\u0010H\u001a\u00020=H\u0014J\b\u0010I\u001a\u00020\u0016H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00160\u00160\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00160\u00160\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u00020!X\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0014\u0010#\u001a\u00020$XD¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R$\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006K"}, d2 = {"Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionPresenter;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionView;", "()V", "adapter", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionAdapter;", "getAdapter", "()Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionAdapter;", "setAdapter", "(Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "onFiltersChanged", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistsOptions;", "kotlin.jvm.PlatformType", "getOnFiltersChanged", "()Lio/reactivex/subjects/PublishSubject;", "onFiltersClicked", "", "getOnFiltersClicked", "onRemoveFiltersClicked", "getOnRemoveFiltersClicked", "optionsPresenter", "Lcom/soundcloud/android/features/library/playlists/PlaylistOptionsPresenter;", "getOptionsPresenter", "()Lcom/soundcloud/android/features/library/playlists/PlaylistOptionsPresenter;", "setOptionsPresenter", "(Lcom/soundcloud/android/features/library/playlists/PlaylistOptionsPresenter;)V", "playlistOptionsListener", "com/soundcloud/android/features/library/playlists/PlaylistCollectionFragment$playlistOptionsListener$1", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionFragment$playlistOptionsListener$1;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "createSpanSizeLookup", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "spanCount", "", "disconnectPresenter", "getResId", "onCreate", "playlistClick", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/foundation/domain/Urn;", "refreshSignal", "requestContent", "showFiltersDialog", "initialOptions", "titleResId", "unbindViews", "Companion", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: PlaylistCollectionFragment.kt */
public final class PlaylistCollectionFragment extends UniflowBaseFragment<D> implements F {
    public static final a i = new a(null);
    public C4806CMa<D> j;
    public C3626c k;
    public J l;
    private C6769kJa<C3635l, C6973nJa> m;
    private final String n = "PlaylistCollectionPresenter";
    private final C6781kVa<RVa> o;
    private final C6781kVa<C3871sda> p;
    private final C6781kVa<RVa> q;
    private final C3632i r;
    private HashMap s;

    /* compiled from: PlaylistCollectionFragment.kt */
    public static final class a {
        private a() {
        }

        public final PlaylistCollectionFragment a() {
            return new PlaylistCollectionFragment();
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public PlaylistCollectionFragment() {
        C6781kVa<RVa> s2 = C6781kVa.s();
        String str = "PublishSubject.create<Unit>()";
        C7471uYa.a((Object) s2, str);
        this.o = s2;
        C6781kVa<C3871sda> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, "PublishSubject.create<PlaylistsOptions>()");
        this.p = s3;
        C6781kVa<RVa> s4 = C6781kVa.s();
        C7471uYa.a((Object) s4, str);
        this.q = s4;
        this.r = new C3632i(this);
    }

    private final b c(int i2) {
        return new C3631h(this, i2);
    }

    public void Rb() {
        HashMap hashMap = this.s;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C3626c cVar = this.k;
        String str = "adapter";
        if (cVar != null) {
            cVar.a((C3626c.b) new C3629f(this));
            C3626c cVar2 = this.k;
            if (cVar2 != null) {
                C6769kJa kja = new C6769kJa(cVar2, C3630g.a, null, null, false, false, false, false, false, false, 1012, null);
                this.m = kja;
                return;
            }
            C7471uYa.b(str);
            throw null;
        }
        C7471uYa.b(str);
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
        C6769kJa<C3635l, C6973nJa> kja = this.m;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final C3626c Xb() {
        C3626c cVar = this.k;
        if (cVar != null) {
            return cVar;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> e() {
        return com.soundcloud.android.features.library.playlists.F.a.a(this);
    }

    public APa<RVa> f() {
        C6769kJa<C3635l, C6973nJa> kja = this.m;
        if (kja != null) {
            return kja.g().h(C3633j.a);
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<C3508cda> k() {
        C3626c cVar = this.k;
        if (cVar != null) {
            return cVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        dagger.android.support.a.a(this);
        super.onCreate(bundle);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public C6781kVa<C3871sda> Ka() {
        return this.p;
    }

    public C6781kVa<RVa> Na() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.collections_playlists_header;
    }

    /* access modifiers changed from: protected */
    public D Tb() {
        C4806CMa<D> cMa = this.j;
        if (cMa != null) {
            return (D) cMa.get();
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(C6832lEa<List<C3635l>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<C3635l, C6973nJa> kja = this.m;
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

    public void b() {
        com.soundcloud.android.features.library.playlists.F.a.b(this);
    }

    public APa<RVa> c() {
        APa<RVa> c = APa.c(RVa.a);
        C7471uYa.a((Object) c, "Observable.just(Unit)");
        return c;
    }

    public C6781kVa<RVa> wa() {
        return this.q;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        int integer = getResources().getInteger(j.collection_grid_span_count);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), integer);
        gridLayoutManager.a(c(integer));
        C6769kJa<C3635l, C6973nJa> kja = this.m;
        if (kja != null) {
            C6769kJa.a(kja, view, false, new C3628e(gridLayoutManager), 0, 8, null);
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(g.collection_default_margin);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(i.ak_recycler_view);
            C7471uYa.a((Object) recyclerView, "recyclerView");
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.a((h) new C(dimensionPixelSize));
            recyclerView.setPadding(dimensionPixelSize, 0, 0, 0);
            recyclerView.setClipToPadding(false);
            recyclerView.setClipChildren(false);
            recyclerView.setBackgroundColor(-1);
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b(D d) {
        C7471uYa.b(d, "presenter");
        d.a();
    }

    /* access modifiers changed from: protected */
    public void a(D d) {
        C7471uYa.b(d, "presenter");
        d.a((F) this);
    }

    public void a(C3871sda sda) {
        C7471uYa.b(sda, "initialOptions");
        J j2 = this.l;
        if (j2 != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                j2.a(activity, this.r, sda);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        C7471uYa.b("optionsPresenter");
        throw null;
    }
}
