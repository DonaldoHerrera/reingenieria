package com.soundcloud.android.search.history;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002CDB\u0005¢\u0006\u0002\u0010\u0004J\"\u0010/\u001a\u00020\u00112\u0018\u00100\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b02\u0012\u0004\u0012\u00020\u001c01H\u0016J\u001a\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u00020\u0011H\u0016J\u0010\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0002H\u0014J\b\u0010;\u001a\u00020\u0002H\u0014J\u0010\u0010<\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0002H\u0014J\b\u0010=\u001a\u00020>H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110@H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110@H\u0016J\b\u0010B\u001a\u00020\u0011H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\u00020 XD¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006E"}, d2 = {"Lcom/soundcloud/android/search/history/SearchHistoryFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/search/history/SearchHistoryPresenter;", "Lcom/soundcloud/android/search/history/SearchHistoryView;", "()V", "adapterFactory", "Lcom/soundcloud/android/search/history/SearchHistoryAdapter$Factory;", "getAdapterFactory$base_release", "()Lcom/soundcloud/android/search/history/SearchHistoryAdapter$Factory;", "setAdapterFactory$base_release", "(Lcom/soundcloud/android/search/history/SearchHistoryAdapter$Factory;)V", "autocompleteArrowClickListener", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/search/history/SearchHistoryItem$SearchHistoryListItem;", "getAutocompleteArrowClickListener", "()Lio/reactivex/subjects/PublishSubject;", "clearHistoryClickListener", "", "getClearHistoryClickListener", "clearSearchHistoryCellRenderer", "Lcom/soundcloud/android/search/history/ClearSearchHistoryCellRenderer$Factory;", "getClearSearchHistoryCellRenderer$base_release", "()Lcom/soundcloud/android/search/history/ClearSearchHistoryCellRenderer$Factory;", "setClearSearchHistoryCellRenderer$base_release", "(Lcom/soundcloud/android/search/history/ClearSearchHistoryCellRenderer$Factory;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/search/history/SearchHistoryItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "itemClickListener", "getItemClickListener", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "searchHistoryCellRenderer", "Lcom/soundcloud/android/search/history/SearchHistoryCellRenderer$Factory;", "getSearchHistoryCellRenderer$base_release", "()Lcom/soundcloud/android/search/history/SearchHistoryCellRenderer$Factory;", "setSearchHistoryCellRenderer$base_release", "(Lcom/soundcloud/android/search/history/SearchHistoryCellRenderer$Factory;)V", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "refreshSignal", "Lio/reactivex/Observable;", "requestContent", "unbindViews", "Companion", "SearchHistoryEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchHistoryFragment.kt */
public final class SearchHistoryFragment extends UniflowBaseFragment<y> implements J {
    public static final a i = new a(null);
    private final String j = "SearchHistoryPresenterKey";
    private final C6781kVa<com.soundcloud.android.search.history.s.b> k;
    private final C6781kVa<com.soundcloud.android.search.history.s.b> l;
    private final C6781kVa<RVa> m;
    public com.soundcloud.android.search.history.C5911h.a n;
    public com.soundcloud.android.search.history.C5906c.a o;
    public com.soundcloud.android.search.history.C5909f.b p;
    public C4806CMa<y> q;
    private C6769kJa<s, C6973nJa> r;
    private HashMap s;

    /* compiled from: SearchHistoryFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: SearchHistoryFragment.kt */
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
            return l.emptyview_search_tab;
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

    public SearchHistoryFragment() {
        C6781kVa<com.soundcloud.android.search.history.s.b> s2 = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s2, str);
        this.k = s2;
        C6781kVa<com.soundcloud.android.search.history.s.b> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.l = s3;
        C6781kVa<RVa> s4 = C6781kVa.s();
        C7471uYa.a((Object) s4, str);
        this.m = s4;
        SoundCloudApplication.f().a(this);
    }

    public void Rb() {
        HashMap hashMap = this.s;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        com.soundcloud.android.search.history.C5909f.b bVar = this.p;
        if (bVar != null) {
            com.soundcloud.android.search.history.C5911h.a aVar = this.n;
            if (aVar != null) {
                com.soundcloud.android.search.history.C5906c.a aVar2 = this.o;
                if (aVar2 != null) {
                    C6769kJa kja = new C6769kJa(bVar.a(aVar, aVar2, Oa(), xa(), Ia()), q.a, null, new b(), false, true, false, false, false, false, 708, null);
                    this.r = kja;
                    return;
                }
                C7471uYa.b("clearSearchHistoryCellRenderer");
                throw null;
            }
            C7471uYa.b("searchHistoryCellRenderer");
            throw null;
        }
        C7471uYa.b("adapterFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.j;
    }

    public int Vb() {
        return l.search_history_fragment;
    }

    public void Wb() {
        C6769kJa<s, C6973nJa> kja = this.r;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final C4806CMa<y> Xb() {
        C4806CMa<y> cMa = this.q;
        if (cMa != null) {
            return cMa;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public APa<RVa> c() {
        APa<RVa> c = APa.c(RVa.a);
        C7471uYa.a((Object) c, "Observable.just(Unit)");
        return c;
    }

    public APa<RVa> e() {
        return com.soundcloud.android.search.history.J.a.a(this);
    }

    public APa<RVa> f() {
        APa<RVa> e = APa.e();
        C7471uYa.a((Object) e, "Observable.empty<Unit>()");
        return e;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public C6781kVa<RVa> Ia() {
        return this.m;
    }

    public C6781kVa<com.soundcloud.android.search.history.s.b> Oa() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public y Tb() {
        C4806CMa<y> cMa = this.q;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (y) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(C6832lEa<List<s>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        List list = (List) lea.b();
        if (list == null) {
            list = C6918mWa.a();
        }
        C6769kJa<s, C6973nJa> kja = this.r;
        if (kja != null) {
            kja.a(new C4736AEa<>(lea.a(), list));
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        com.soundcloud.android.search.history.J.a.b(this);
    }

    public C6781kVa<com.soundcloud.android.search.history.s.b> xa() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public void b(y yVar) {
        C7471uYa.b(yVar, "presenter");
        yVar.a();
    }

    /* access modifiers changed from: protected */
    public void a(y yVar) {
        C7471uYa.b(yVar, "presenter");
        yVar.a((J) this);
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<s, C6973nJa> kja = this.r;
        if (kja != null) {
            C6769kJa.a(kja, view, true, null, 0, 12, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }
}
