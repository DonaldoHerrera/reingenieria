package com.soundcloud.android.features.library.likes.search;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.o;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0003XYZB\u0005¢\u0006\u0002\u0010\u0005J\u001c\u00108\u001a\u00020(2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00110:H\u0016J\u001a\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020(H\u0016J\b\u0010A\u001a\u00020(H\u0016J\u0010\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020\u0002H\u0014J\b\u0010D\u001a\u00020\u0002H\u0014J\u0010\u0010E\u001a\u00020(2\u0006\u0010C\u001a\u00020\u0002H\u0014J\b\u0010F\u001a\u000201H\u0016J\b\u0010G\u001a\u000207H\u0016J\b\u0010H\u001a\u00020(H\u0016J\u0012\u0010I\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010J\u001a\u00020(H\u0016J\u001a\u0010K\u001a\u00020(2\u0006\u0010=\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020(0MH\u0016J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\u0010\u0010O\u001a\u00020(2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u00020(2\u0006\u0010R\u001a\u000207H\u0016J\b\u0010S\u001a\u00020(H\u0002J\b\u0010T\u001a\u00020(H\u0016J\b\u0010U\u001a\u00020(H\u0016J\u0010\u0010V\u001a\u00020(2\u0006\u0010W\u001a\u000201H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX.¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R3\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001002000'8VX\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b3\u0010*R\u000e\u00106\u001a\u000207X\u000e¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lcom/soundcloud/android/features/library/likes/search/LikesSearchFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchPresenter;", "Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchView;", "Lcom/soundcloud/android/navigation/BackButtonAware;", "()V", "adapter", "Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchAdapter;", "getAdapter$collections_ui_release", "()Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchAdapter;", "setAdapter$collections_ui_release", "(Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchAdapter;)V", "clearSearchButton", "Landroid/view/View;", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchItem;", "Lcom/soundcloud/android/features/library/likes/search/Error;", "hideKeyboardOnScrollDelegate", "Lcom/soundcloud/android/features/library/likes/search/LikesSearchFragment$HideKeyboardOnScrollDelegate;", "keyboardHelper", "Lcom/soundcloud/android/utils/KeyboardHelper;", "getKeyboardHelper$collections_ui_release", "()Lcom/soundcloud/android/utils/KeyboardHelper;", "setKeyboardHelper$collections_ui_release", "(Lcom/soundcloud/android/utils/KeyboardHelper;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$collections_ui_release", "()Ldagger/Lazy;", "setPresenterLazy$collections_ui_release", "(Ldagger/Lazy;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "searchClearClicked", "Lio/reactivex/Observable;", "", "getSearchClearClicked", "()Lio/reactivex/Observable;", "searchEditText", "Landroid/widget/TextView;", "searchQuery", "getSearchQuery", "trackClick", "Lkotlin/Pair;", "", "", "getTrackClick", "trackClick$delegate", "Lkotlin/Lazy;", "wasFragmentDestroyed", "", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "Lcom/soundcloud/android/features/library/likes/search/TrackLikesSearchViewModel;", "bindViews", "view", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "clearSearchQuery", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "handleBackPressed", "hideKeyboard", "onCreate", "onDestroyView", "onViewCreated", "refreshSignal", "Lio/reactivex/subjects/PublishSubject;", "requestContent", "setupToolbar", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "showClearButton", "showKeyboard", "snapToTop", "unbindViews", "updateLikesCount", "likesCount", "HideKeyboardOnScrollDelegate", "LikesSearchEmptyStateProvider", "SimpleTextWatcher", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: LikesSearchFragment.kt */
public final class LikesSearchFragment extends UniflowBaseFragment<K> implements M, C3964cja {
    static final /* synthetic */ DZa[] i = {HYa.a((DYa) new EYa(HYa.a(LikesSearchFragment.class), "trackClick", "getTrackClick()Lio/reactivex/Observable;"))};
    public C4806CMa<K> j;
    public v k;
    public C4801CHa l;
    /* access modifiers changed from: private */
    public TextView m;
    private RecyclerView n;
    private final a o = new a();
    /* access modifiers changed from: private */
    public View p;
    private boolean q = true;
    private C6769kJa<x, C3605a> r;
    private final String s = "TrackLikesSearchPresenter";
    private final APa<String> t;
    private final APa<RVa> u;
    private final C7744yVa v;
    private HashMap w;

    /* compiled from: LikesSearchFragment.kt */
    public final class a extends m {
        public a() {
        }

        public void a(RecyclerView recyclerView, int i) {
            C7471uYa.b(recyclerView, "recyclerView");
            if (i == 1) {
                LikesSearchFragment.this.Yb().a(recyclerView);
            }
        }
    }

    /* compiled from: LikesSearchFragment.kt */
    private static final class b implements defpackage.C5494ZEa.c<C3605a> {
        public void a(View view, C3605a aVar) {
            C7471uYa.b(view, "view");
            C7471uYa.b(aVar, "errorType");
            defpackage.C5494ZEa.c.a.a(this, view, aVar);
        }

        public void b(View view) {
            C7471uYa.b(view, "view");
            defpackage.C5494ZEa.c.a.b(this, view);
        }

        public int c() {
            return l.emptyview_progress;
        }

        public int b() {
            return l.empty_no_likes_search_results;
        }

        public int a(C3605a aVar) {
            C7471uYa.b(aVar, "errorType");
            throw new GVa(null, 1, null);
        }

        public void a(View view) {
            C7471uYa.b(view, "view");
            defpackage.C5494ZEa.c.a.a(this, view);
            view.setLayoutParams(new LayoutParams(-1, -1));
        }
    }

    /* compiled from: LikesSearchFragment.kt */
    public static abstract class c implements TextWatcher {
        public void afterTextChanged(Editable editable) {
            C7471uYa.b(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7471uYa.b(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7471uYa.b(charSequence, "s");
        }
    }

    public LikesSearchFragment() {
        APa<String> a2 = APa.a((CPa<T>) new r<T>(this));
        C7471uYa.a((Object) a2, "Observable.create<String…(watcher)\n        }\n    }");
        this.t = a2;
        APa<RVa> a3 = APa.a((CPa<T>) new o<T>(this));
        C7471uYa.a((Object) a3, "Observable.create<Unit> …ner(null)\n        }\n    }");
        this.u = a3;
        this.v = BVa.a(new s(this));
    }

    private final void Zb() {
        TextView textView = this.m;
        if (textView == null) {
            C7471uYa.a();
            throw null;
        } else if (textView.requestFocus()) {
            C4801CHa cHa = this.l;
            if (cHa != null) {
                TextView textView2 = this.m;
                if (textView2 != null) {
                    cHa.b(textView2);
                } else {
                    C7471uYa.a();
                    throw null;
                }
            } else {
                C7471uYa.b("keyboardHelper");
                throw null;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to focus on SearchEditText=");
            sb.append(this.m);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final void c(int i2) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setHint(getResources().getQuantityString(o.library_search_likes_hint, i2, new Object[]{Integer.valueOf(i2)}));
            return;
        }
        C7471uYa.a();
        throw null;
    }

    public void Aa() {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.i(0);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public APa<RVa> Ga() {
        return this.u;
    }

    public APa<String> Ma() {
        return this.t;
    }

    public void Rb() {
        HashMap hashMap = this.w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public boolean Sa() {
        C4801CHa cHa = this.l;
        if (cHa != null) {
            TextView textView = this.m;
            if (textView != null) {
                cHa.a(textView);
                return false;
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.b("keyboardHelper");
        throw null;
    }

    public void Sb() {
        v vVar = this.k;
        if (vVar != null) {
            C6769kJa kja = new C6769kJa(vVar, C3616l.a, null, new b(), false, true, false, false, false, false, 980, null);
            this.r = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.s;
    }

    public int Vb() {
        return l.track_likes_search_fragment;
    }

    public void Wb() {
        C6769kJa<x, C3605a> kja = this.r;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final v Xb() {
        v vVar = this.k;
        if (vVar != null) {
            return vVar;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public final C4801CHa Yb() {
        C4801CHa cHa = this.l;
        if (cHa != null) {
            return cHa;
        }
        C7471uYa.b("keyboardHelper");
        throw null;
    }

    public APa<RVa> e() {
        return com.soundcloud.android.features.library.likes.search.M.a.a(this);
    }

    public APa<HVa<Integer, List<x>>> o() {
        C7744yVa yva = this.v;
        DZa dZa = i[0];
        return (APa) yva.getValue();
    }

    public void onCreate(Bundle bundle) {
        dagger.android.support.a.a(this);
        super.onCreate(bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.b((m) this.o);
            TextView textView = this.m;
            if (textView != null) {
                textView.clearFocus();
            }
            this.q = false;
            this.m = null;
            this.n = null;
            this.p = null;
            Rb();
            return;
        }
        C7471uYa.a();
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        C7471uYa.a((Object) requireActivity, "requireActivity()");
        if (requireActivity instanceof AppCompatActivity) {
            a((AppCompatActivity) requireActivity);
            if (bundle == null && this.q) {
                Zb();
            }
            RecyclerView recyclerView = this.n;
            if (recyclerView != null) {
                recyclerView.a((m) this.o);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(requireActivity);
        sb.append(" not of type ");
        sb.append(AppCompatActivity.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    public void sa() {
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(null);
        } else {
            C7471uYa.a();
            throw null;
        }
    }

    public void ta() {
        C4801CHa cHa = this.l;
        if (cHa != null) {
            View requireView = requireView();
            C7471uYa.a((Object) requireView, "requireView()");
            cHa.a(requireView);
            return;
        }
        C7471uYa.b("keyboardHelper");
        throw null;
    }

    /* access modifiers changed from: protected */
    public K Tb() {
        C4806CMa<K> cMa = this.j;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (K) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public APa<RVa> c() {
        APa<RVa> c2 = APa.c(RVa.a);
        C7471uYa.a((Object) c2, "Observable.just(Unit)");
        return c2;
    }

    public C6781kVa<RVa> f() {
        C6769kJa<x, C3605a> kja = this.r;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        this.m = (TextView) ((Toolbar) view.findViewById(i.toolbar_id)).findViewById(i.search_edit_text);
        this.p = view.findViewById(i.search_close);
        this.n = (RecyclerView) view.findViewById(i.ak_recycler_view);
        C6769kJa<x, C3605a> kja = this.r;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, l.emptyview_no_padding_container, 6, null);
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void b() {
        com.soundcloud.android.features.library.likes.search.M.a.b(this);
    }

    public void b(boolean z) {
        View view = this.p;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        } else {
            C7471uYa.a();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(K k2) {
        C7471uYa.b(k2, "presenter");
        k2.a();
    }

    private final void a(AppCompatActivity appCompatActivity) {
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.e(false);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 != null) goto L_0x0018;
     */
    public void a(C6832lEa<N, C3605a> lea) {
        List list;
        C7471uYa.b(lea, "viewModel");
        N n2 = (N) lea.b();
        if (n2 != null) {
            list = n2.a();
        }
        list = C6918mWa.a();
        C6769kJa<x, C3605a> kja = this.r;
        if (kja != null) {
            kja.a(new C4736AEa<>(lea.a(), list));
            if (lea.b() != null) {
                c(list.size());
                return;
            }
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(K k2) {
        C7471uYa.b(k2, "presenter");
        k2.a((M) this);
    }
}
