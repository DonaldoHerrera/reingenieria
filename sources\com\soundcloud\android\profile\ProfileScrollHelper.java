package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.view.CustomFontTitleToolbar;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;
import java.util.ArrayList;
import java.util.List;

class ProfileScrollHelper extends SupportFragmentLightCycleDispatcher<Fragment> implements a {
    private final List<Qa> a = new ArrayList();
    private C5293SHa b;
    private View c;
    private View d;
    protected CustomFontTitleToolbar e;
    protected AppBarLayout f;
    private float g;

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        a(view);
        this.g = fragment.getResources().getDimension(g.toolbar_elevation);
        this.b = new C5293SHa(this);
    }

    /* renamed from: b */
    public void onStart(Fragment fragment) {
        this.b.a();
    }

    /* renamed from: c */
    public void onStop(Fragment fragment) {
        this.b.b();
        this.a.clear();
    }

    public void d(boolean z) {
        for (Qa a2 : this.a) {
            a2.a(Boolean.valueOf(z));
        }
    }

    public View e() {
        return this.d;
    }

    public AppBarLayout o() {
        return this.f;
    }

    public float p() {
        return this.g;
    }

    public View s() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public void v() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public Toolbar c() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        this.c = view.findViewById(i.profile_header);
        this.d = view.findViewById(i.profile_pager);
        this.e = (CustomFontTitleToolbar) view.findViewById(i.toolbar_id);
        this.f = (AppBarLayout) view.findViewById(i.appbar);
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        v();
        this.b = null;
        super.onDestroyView(fragment);
    }

    public void a(int i) {
        for (Qa a2 : this.a) {
            a2.a(Integer.valueOf(i));
        }
    }
}
