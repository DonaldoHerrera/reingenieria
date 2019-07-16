package com.soundcloud.android.search.suggestions.searchsuggestions;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001HB\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0 H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\u001a\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0002H\u0014J\b\u0010.\u001a\u00020\u0002H\u0014J\u0010\u0010/\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0002H\u0014J\b\u00100\u001a\u000201H\u0016J\n\u00102\u001a\u0004\u0018\u000103H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002050#H\u0016J4\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00122\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002010:H\u0016J6\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00122\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010@\u001a\u000201H\u0016J\b\u0010A\u001a\u00020\u001eH\u0016J\b\u0010B\u001a\u00020\u001eH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00120#H\u0016J\u0010\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u0012H\u0016J\b\u0010G\u001a\u00020\u001eH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX.¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006I"}, d2 = {"Lcom/soundcloud/android/search/suggestions/searchsuggestions/SearchSuggestionsUniflowFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/search/suggestions/searchsuggestions/SearchSuggestionsUniflowPresenter;", "Lcom/soundcloud/android/search/suggestions/searchsuggestions/SearchSuggestionsQueryExecutor;", "Lcom/soundcloud/android/search/suggestions/searchsuggestions/SearchSuggestionsUniflowView;", "()V", "adapter", "Lcom/soundcloud/android/search/suggestions/SuggestionsAdapter;", "getAdapter", "()Lcom/soundcloud/android/search/suggestions/SuggestionsAdapter;", "setAdapter", "(Lcom/soundcloud/android/search/suggestions/SuggestionsAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/search/suggestions/SuggestionItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "onNewQuerySubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "presenterKey", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "Lcom/soundcloud/android/search/suggestions/searchsuggestions/SearchSuggestionsViewModel;", "autocompleteArrowClick", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/search/suggestions/AutoCompletionClickData;", "autocompletionClick", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "getSuggestionsListener", "Lcom/soundcloud/android/search/suggestions/SuggestionListener;", "localSuggestionClick", "Lcom/soundcloud/android/search/suggestions/SuggestionItemClickData;", "onAutocompleteArrowClicked", "userQuery", "selectedSearchTerm", "queryUrn", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/foundation/domain/Urn;", "queryInteger", "onAutocompletionClicked", "apiQuery", "output", "position", "onLocalSuggestionClicked", "onRefreshed", "refreshSignal", "requestContent", "showSuggestionsFor", "query", "unbindViews", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchSuggestionsUniflowFragment.kt */
public final class SearchSuggestionsUniflowFragment extends UniflowBaseFragment<j> implements b, l {
    public static final a i = new a(null);
    private C6769kJa<C7780ywa, C6973nJa> j;
    public C4852Dwa k;
    private final C6781kVa<String> l;
    private final String m = "SearchSuggestionsUniflowFragment";
    public C4806CMa<j> n;
    private HashMap o;

    /* compiled from: SearchSuggestionsUniflowFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public SearchSuggestionsUniflowFragment() {
        C6781kVa<String> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<String>()");
        this.l = s;
        SoundCloudApplication.f().a(this);
    }

    private final C4821Cwa Yb() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof C4821Cwa)) {
            return null;
        }
        return (C4821Cwa) parentFragment;
    }

    public APa<C7433tva> Ba() {
        C4852Dwa dwa = this.k;
        if (dwa != null) {
            APa<C7433tva> j2 = dwa.j();
            C7471uYa.a((Object) j2, "adapter.onAutocompleteArrowClicked()");
            return j2;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void Pa() {
        C4821Cwa Yb = Yb();
        if (Yb != null) {
            Yb.Kb();
        }
    }

    public APa<C7433tva> Qa() {
        C4852Dwa dwa = this.k;
        if (dwa != null) {
            APa<C7433tva> k2 = dwa.k();
            C7471uYa.a((Object) k2, "adapter.onAutocompletionClicked()");
            return k2;
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
        C4852Dwa dwa = this.k;
        if (dwa != null) {
            C6769kJa kja = new C6769kJa(dwa, c.a, null, new a(), false, false, false, false, false, false, 868, null);
            this.j = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.m;
    }

    public int Vb() {
        return l.search_history_fragment;
    }

    public void Wb() {
        C6769kJa<C7780ywa, C6973nJa> kja = this.j;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
    }

    public APa<String> c() {
        return this.l;
    }

    public APa<RVa> e() {
        return com.soundcloud.android.search.suggestions.searchsuggestions.l.a.a(this);
    }

    public APa<RVa> f() {
        APa<RVa> l2 = APa.l();
        C7471uYa.a((Object) l2, "Observable.never()");
        return l2;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public APa<C7849zwa> qa() {
        C4852Dwa dwa = this.k;
        if (dwa != null) {
            APa<C7849zwa> l2 = dwa.l();
            C7471uYa.a((Object) l2, "adapter.onSuggestionClicked()");
            return l2;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public j Tb() {
        C4806CMa<j> cMa = this.n;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (j) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<C7780ywa, C6973nJa> kja = this.j;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, l.search_suggestion_empty_view_wrapper, 6, null);
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b(j jVar) {
        C7471uYa.b(jVar, "presenter");
        jVar.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r4 != null) goto L_0x0022;
     */
    public void a(C6832lEa<m, C6973nJa> lea) {
        List list;
        C7471uYa.b(lea, "viewModel");
        C6769kJa<C7780ywa, C6973nJa> kja = this.j;
        if (kja != null) {
            C6900mEa a2 = lea.a();
            m mVar = (m) lea.b();
            if (mVar != null) {
                list = mVar.a();
            }
            list = C6918mWa.a();
            kja.a(new C4736AEa<>(a2, list));
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void b(String str) {
        C7471uYa.b(str, "query");
        this.l.a(str);
    }

    /* access modifiers changed from: protected */
    public void a(j jVar) {
        C7471uYa.b(jVar, "presenter");
        jVar.a((l) this);
    }

    public void a(String str, String str2, C4928GKa<C3508cda> gKa, C4928GKa<Integer> gKa2) {
        C7471uYa.b(str, "userQuery");
        C7471uYa.b(str2, "selectedSearchTerm");
        C7471uYa.b(gKa, "queryUrn");
        C7471uYa.b(gKa2, "queryInteger");
        C4821Cwa Yb = Yb();
        if (Yb != null) {
            Yb.a(str, str2, gKa, gKa2);
        }
    }

    public void a(String str, String str2, String str3, C4928GKa<C3508cda> gKa, int i2) {
        C7471uYa.b(str, "apiQuery");
        C7471uYa.b(str2, "userQuery");
        C7471uYa.b(str3, "output");
        C7471uYa.b(gKa, "queryUrn");
        C4821Cwa Yb = Yb();
        if (Yb != null) {
            Yb.b(str, str2, str3, gKa, i2);
        }
    }
}
