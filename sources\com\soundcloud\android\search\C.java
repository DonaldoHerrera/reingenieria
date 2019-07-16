package com.soundcloud.android.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.ViewFlipper;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.LayoutParams;
import com.soundcloud.android.deeplinks.k;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.G;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.search.history.SearchHistoryFragment;
import com.soundcloud.android.search.history.y;
import com.soundcloud.android.search.suggestions.searchsuggestions.SearchSuggestionsUniflowFragment;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

/* compiled from: SearchPresenter */
public class C extends DefaultSupportFragmentLightCycle<SearchFragment> implements a, C3964cja {
    /* access modifiers changed from: private */
    public EditText a;
    private ImageView b;
    private ViewFlipper c;
    private Window d;
    private C0370l e;
    private A f;
    private e g;
    private Toolbar h;
    private View i;
    private AppBarLayout j;
    private final C5920l k;
    /* access modifiers changed from: private */
    public final Ja l;
    /* access modifiers changed from: private */
    public final C3700b m;
    /* access modifiers changed from: private */
    public final F n;
    private final Resources o;
    private final C4801CHa p;
    /* access modifiers changed from: private */
    public final com.soundcloud.android.search.history.A q;
    /* access modifiers changed from: private */
    public final UPa r = new UPa();
    private int s;

    /* compiled from: SearchPresenter */
    private class a implements OnEditorActionListener {
        private a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 0 && i != 3) {
                return false;
            }
            String obj = C.this.a.getText().toString();
            C.this.a(obj, obj);
            return true;
        }
    }

    /* compiled from: SearchPresenter */
    private class b implements OnClickListener {
        private b() {
        }

        public void onClick(View view) {
            C.this.m.a((J) G.a(C.this.n.b(), C.this.a.getText().toString()));
            C.this.a.setText("");
            C.this.q();
            C.this.n();
            C.this.i();
            C.this.a(0);
            C.this.l.a();
        }
    }

    /* compiled from: SearchPresenter */
    private class c implements OnFocusChangeListener {
        private c() {
        }

        public /* synthetic */ void b(C4928GKa gKa) throws Exception {
            C.this.m.a((J) G.a(C.this.n.b(), C.this.a.getText().toString(), (Integer) gKa.d()));
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                C.this.r.b(C.this.q.b().h(C5892c.a).g().d((C6776kQa<? super T>) new C5894d<Object>(this)));
            }
        }
    }

    /* compiled from: SearchPresenter */
    private class d implements OnClickListener {
        private d() {
        }

        public void onClick(View view) {
            C.this.a(0);
            C.this.i();
        }
    }

    /* compiled from: SearchPresenter */
    private class e implements TextWatcher {
        private boolean a = true;

        e() {
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            this.a = z;
        }

        public void afterTextChanged(Editable editable) {
            if (C5206PKa.a((CharSequence) C.this.a.getText().toString().trim())) {
                C.this.q();
                C.this.n();
                C.this.p();
                return;
            }
            C.this.v();
            C.this.x();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String trim = charSequence.toString().trim();
            if (this.a && C5206PKa.b(trim)) {
                C.this.f(trim);
            }
        }
    }

    C(C5922m mVar, Ja ja, Resources resources, C4801CHa cHa, C3700b bVar, F f2, com.soundcloud.android.search.history.A a2) {
        this.k = mVar.a(this);
        this.l = ja;
        this.o = resources;
        this.p = cHa;
        this.m = bVar;
        this.n = f2;
        this.q = a2;
    }

    private String m() {
        return "SearchSuggestionFragmentTag";
    }

    /* access modifiers changed from: private */
    public void n() {
        this.b.setVisibility(8);
        this.b.setClickable(false);
    }

    private void o() {
        this.p.a(this.d, this.a);
    }

    /* access modifiers changed from: private */
    public void p() {
        this.c.animate().alpha(0.0f).start();
        this.c.setVisibility(4);
    }

    /* access modifiers changed from: private */
    public void q() {
        l().a((C7733yKa<? super T>) new C5890b<Object>(this));
    }

    private Fragment r() {
        return new SearchSuggestionsUniflowFragment();
    }

    private void s() {
        this.a.addTextChangedListener(this.g);
        this.a.setOnClickListener(new d());
        this.a.setOnEditorActionListener(new a());
        this.b.setOnClickListener(new b());
        this.a.setOnFocusChangeListener(new c());
    }

    private void t() {
        SearchHistoryFragment searchHistoryFragment = (SearchHistoryFragment) this.e.a(i.search_history_fragment);
        this.r.b(((y) searchHistoryFragment.Xb().get()).g().f((C6776kQa<? super T>) new C5898f<Object>(this)));
        this.r.b(((y) searchHistoryFragment.Xb().get()).f().f((C6776kQa<? super T>) new C5900g<Object>(this)));
    }

    @SuppressLint({"CommitTransaction"})
    private void u() {
        C4928GKa l2 = l();
        this.f = this.e.a();
        A a2 = this.f;
        a2.b(i.search_suggestions_container, l2.c() ? (Fragment) l2.b() : r(), m());
        a2.a();
    }

    /* access modifiers changed from: private */
    public void v() {
        this.b.setVisibility(0);
        this.b.setClickable(true);
    }

    private void w() {
        this.p.b(this.d, this.a);
    }

    /* access modifiers changed from: private */
    public void x() {
        this.c.animate().alpha(1.0f).start();
        this.c.setVisibility(0);
    }

    public boolean Sa() {
        ViewFlipper viewFlipper = this.c;
        if (viewFlipper == null || viewFlipper.getDisplayedChild() == 0) {
            return false;
        }
        a(0);
        this.a.setText("");
        this.l.a();
        return true;
    }

    private void c(SearchFragment searchFragment) {
        FragmentActivity activity = searchFragment.getActivity();
        try {
            this.k.a(activity, activity.getIntent());
        } catch (k e2) {
            C5232QGa.a((Context) searchFragment.getActivity(), p.error_unknown_navigation, new Object[0]);
            C7316sHa.d(e2);
        }
    }

    private void e(String str) {
        String trim = str.trim();
        if (!trim.isEmpty()) {
            this.q.a(trim, System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: private */
    public void f(String str) {
        l().a((C7733yKa<? super T>) new C5888a<Object>(this, str));
    }

    private void i(View view) {
        this.c = (ViewFlipper) view.findViewById(i.search_view_flipper);
    }

    private void j() {
        this.a.removeTextChangedListener(this.g);
        this.a.setOnClickListener(null);
        this.a.setOnEditorActionListener(null);
        this.b.setOnClickListener(null);
        this.a.setOnFocusChangeListener(null);
    }

    private void k() {
        this.a.setFocusable(false);
        this.a.setFocusableInTouchMode(false);
        this.a.clearFocus();
        o();
    }

    private C4928GKa<Fragment> l() {
        C0370l lVar = this.e;
        return lVar != null ? C4928GKa.b(lVar.a("SearchSuggestionFragmentTag")) : C4928GKa.a();
    }

    public /* synthetic */ void b(String str) throws Exception {
        this.g.a(false);
        this.a.setText(str);
        a(str, str);
        this.g.a(true);
    }

    public /* synthetic */ void d(String str) {
        this.a.setText(str);
        this.a.setSelection(str.length());
    }

    /* access modifiers changed from: 0000 */
    public int g() {
        return this.s;
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        k();
    }

    /* access modifiers changed from: private */
    public void i() {
        this.a.setFocusable(true);
        this.a.setFocusableInTouchMode(true);
        this.a.requestFocus();
        w();
    }

    /* renamed from: a */
    public void onAttach(SearchFragment searchFragment, Activity activity) {
        super.onAttach(searchFragment, activity);
        this.d = ((AppCompatActivity) searchFragment.getActivity()).getWindow();
        this.e = searchFragment.getChildFragmentManager();
    }

    /* renamed from: b */
    public void onDetach(SearchFragment searchFragment) {
        this.d = null;
        this.e = null;
        this.f = null;
        super.onDetach(searchFragment);
    }

    public /* synthetic */ void c(String str) throws Exception {
        a(str, str, C4928GKa.a(), C4928GKa.a());
    }

    private void c(int i2) {
        if (i2 == 1) {
            C1778vc.a((View) this.c, this.o.getDimension(g.toolbar_elevation));
            C6428fIa.a(this.j, 0.0f);
            return;
        }
        C1778vc.a((View) this.c, 0.0f);
        C6428fIa.a(this.j, this.o.getDimension(g.toolbar_elevation));
    }

    /* renamed from: a */
    public void onViewCreated(SearchFragment searchFragment, View view, Bundle bundle) {
        super.onViewCreated(searchFragment, view, bundle);
        this.g = new e();
        a((AppCompatActivity) searchFragment.getActivity(), view);
        u();
        i(view);
        s();
        t();
        a(this.s);
        if (bundle == null) {
            c(searchFragment);
        }
    }

    private void b(int i2) {
        c(i2);
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        a(z);
    }

    private void b(String str, String str2, C4928GKa<String> gKa, C4928GKa<C3508cda> gKa2, C4928GKa<Integer> gKa3) {
        Fragment b2 = b(str, str2, gKa2, gKa3);
        A a2 = this.e.a();
        a2.b(i.search_results_container, b2, "search_results");
        a2.a();
        a(gKa);
        a(1);
    }

    /* renamed from: a */
    public void onDestroyView(SearchFragment searchFragment) {
        j();
        this.g = null;
        this.c = null;
        this.a = null;
        this.b = null;
        this.i = null;
        this.j = null;
        this.h = null;
        this.r.b();
        super.onDestroyView(searchFragment);
    }

    private Fragment b(String str, String str2, C4928GKa<C3508cda> gKa, C4928GKa<Integer> gKa2) {
        return Ta.c(str, str2, gKa, gKa2);
    }

    public void a(String str) {
        this.a.setText(str);
        a(str, str);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2, C4928GKa<C3508cda> gKa, C4928GKa<Integer> gKa2) {
        a(C4928GKa.c(str2));
        this.m.a((J) G.a(this.n.b(), str, str2, (C3508cda) gKa.d(), (Integer) gKa2.d()));
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2) {
        a(str, str2, C4928GKa.a(), C4928GKa.a(), C4928GKa.a());
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2, C4928GKa<String> gKa, C4928GKa<C3508cda> gKa2, C4928GKa<Integer> gKa3) {
        e(str);
        k();
        b(str, str2, gKa, gKa2, gKa3);
    }

    private void a(AppCompatActivity appCompatActivity, View view) {
        this.i = view.findViewById(i.legacy_elevation);
        this.h = (Toolbar) view.findViewById(i.toolbar_id);
        this.j = (AppBarLayout) view.findViewById(i.search_appbar);
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) appCompatActivity.getSystemService("layout_inflater")).inflate(l.search_text_view, this.h, false);
        this.a = (EditText) viewGroup.findViewById(i.search_edit_text);
        this.b = (ImageView) viewGroup.findViewById(i.search_close);
        appCompatActivity.setSupportActionBar(this.h);
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.e(false);
        }
        this.h.addView(viewGroup);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        b(i2);
        if (this.c.getDisplayedChild() != i2) {
            this.c.setDisplayedChild(i2);
        }
        if (i2 == 1) {
            o();
        }
        this.s = i2;
    }

    private void a(boolean z) {
        if (this.h.getLayoutParams() instanceof LayoutParams) {
            ((LayoutParams) this.h.getLayoutParams()).a(z ? 21 : 0);
        }
    }

    private void a(C4928GKa<String> gKa) {
        gKa.a((C7733yKa<? super T>) new C5896e<Object>(this));
    }

    public /* synthetic */ void a(String str, Fragment fragment) {
        this.f.e(fragment);
        ((com.soundcloud.android.search.suggestions.searchsuggestions.b) fragment).b(str);
    }

    public /* synthetic */ void a(Fragment fragment) {
        this.f.c(fragment);
    }

    public void a(FragmentActivity fragmentActivity) {
        fragmentActivity.supportFinishAfterTransition();
    }
}
