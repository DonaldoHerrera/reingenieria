package com.soundcloud.android.features.library.downloads;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.features.library.downloads.K.a;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010&\u001a\u00020\u00172\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0)\u0012\u0004\u0012\u00020\u000e0(H\u0016J\u001a\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u0017H\u0016J\u0010\u00100\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0002H\u0014J\b\u00101\u001a\u00020\u0002H\u0014J\u0010\u00102\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0002H\u0014J\b\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0016H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\b\u0010:\u001a\u000204H\u0014J \u0010;\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0)0<0\u0016H\u0016J\b\u0010=\u001a\u00020\u0017H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#XD¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006>"}, d2 = {"Lcom/soundcloud/android/features/library/downloads/DownloadsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/features/library/downloads/DownloadsPresenter;", "Lcom/soundcloud/android/features/library/downloads/DownloadsView;", "()V", "adapter", "Lcom/soundcloud/android/features/library/downloads/DownloadsAdapter;", "getAdapter", "()Lcom/soundcloud/android/features/library/downloads/DownloadsAdapter;", "setAdapter", "(Lcom/soundcloud/android/features/library/downloads/DownloadsAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem;", "Lcom/soundcloud/android/features/library/downloads/Error;", "downloadsEmptyStateProvider", "Lcom/soundcloud/android/features/library/downloads/DownloadsEmptyStateProvider;", "getDownloadsEmptyStateProvider", "()Lcom/soundcloud/android/features/library/downloads/DownloadsEmptyStateProvider;", "setDownloadsEmptyStateProvider", "(Lcom/soundcloud/android/features/library/downloads/DownloadsEmptyStateProvider;)V", "emptyActionClick", "Lio/reactivex/Observable;", "", "getEmptyActionClick", "()Lio/reactivex/Observable;", "emptyActionClick$delegate", "Lkotlin/Lazy;", "presenter", "Ldagger/Lazy;", "getPresenter", "()Ldagger/Lazy;", "setPresenter", "(Ldagger/Lazy;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "createPresenter", "disconnectPresenter", "getResId", "", "onCreate", "playlistClick", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem$Playlist;", "refreshSignal", "requestContent", "titleResId", "trackClick", "Lkotlin/Pair;", "unbindViews", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: DownloadsFragment.kt */
public final class DownloadsFragment extends UniflowBaseFragment<E> implements K {
    static final /* synthetic */ DZa[] i = {HYa.a((DYa) new EYa(HYa.a(DownloadsFragment.class), "emptyActionClick", "getEmptyActionClick()Lio/reactivex/Observable;"))};
    public C3567a j;
    public C4806CMa<E> k;
    public n l;
    private C6769kJa<s, L> m;
    private final String n = "DownloadsPresenterKey";
    private final C7744yVa o = BVa.a(new q(this));
    private HashMap p;

    public void Rb() {
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C3567a aVar = this.j;
        if (aVar != null) {
            p pVar = p.a;
            n nVar = this.l;
            if (nVar != null) {
                C6769kJa kja = new C6769kJa(aVar, pVar, null, nVar, false, true, false, false, false, false, 980, null);
                this.m = kja;
                return;
            }
            C7471uYa.b("downloadsEmptyStateProvider");
            throw null;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.n;
    }

    public int Vb() {
        return l.recyclerview_with_top_divider_and_refresh_and_toolbar_without_empty;
    }

    public void Wb() {
        C6769kJa<s, L> kja = this.m;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final n Xb() {
        n nVar = this.l;
        if (nVar != null) {
            return nVar;
        }
        C7471uYa.b("downloadsEmptyStateProvider");
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

    public APa<RVa> f() {
        C6769kJa<s, L> kja = this.m;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<s.a> k() {
        C3567a aVar = this.j;
        if (aVar != null) {
            return aVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<HVa<s, List<s>>> l() {
        C3567a aVar = this.j;
        if (aVar != null) {
            return aVar.k();
        }
        C7471uYa.b("adapter");
        throw null;
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
        C7744yVa yva = this.o;
        DZa dZa = i[0];
        return (APa) yva.getValue();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.tab_downloads;
    }

    /* access modifiers changed from: protected */
    public E Tb() {
        C4806CMa<E> cMa = this.k;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenter.get()");
            return (E) obj;
        }
        C7471uYa.b("presenter");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<s, L> kja = this.m;
        if (kja != null) {
            C6769kJa.a(kja, view, true, null, 0, 12, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        a.b(this);
    }

    /* access modifiers changed from: protected */
    public void a(E e) {
        C7471uYa.b(e, "presenter");
        e.a((K) this);
    }

    /* access modifiers changed from: protected */
    public void b(E e) {
        C7471uYa.b(e, "presenter");
        e.a();
    }

    public void a(C6832lEa<List<s>, L> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<s, L> kja = this.m;
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
