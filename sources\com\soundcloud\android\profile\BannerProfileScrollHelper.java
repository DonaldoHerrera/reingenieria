package com.soundcloud.android.profile;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout.LayoutParams;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.view.C6228q;
import com.soundcloud.android.view.C6228q.a;
import com.soundcloud.android.view.r;

@TargetApi(23)
class BannerProfileScrollHelper extends ProfileScrollHelper implements a {
    private View h;
    private View i;
    private int j;
    private int k;
    private final r l;
    private OnGlobalLayoutListener m;

    BannerProfileScrollHelper(r rVar) {
        this.l = rVar;
    }

    private C6228q w() {
        return this.l.a(this.e, this.i, this.h, this);
    }

    private void x() {
        this.f.a((b) w());
    }

    private void y() {
        if (this.m != null) {
            this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this.m);
            this.m = null;
        }
    }

    public int b() {
        return this.k;
    }

    /* renamed from: d */
    public void onPause(Fragment fragment) {
        y();
    }

    /* renamed from: e */
    public void onResume(Fragment fragment) {
        y();
        this.m = new C5795i(this, fragment);
        this.e.getViewTreeObserver().addOnGlobalLayoutListener(this.m);
    }

    public int r() {
        return this.j;
    }

    public C7664xKa<Float, Float> t() {
        return C7664xKa.a(Float.valueOf(0.2f), Float.valueOf(1.0f));
    }

    public C7664xKa<Float, Float> u() {
        return C7664xKa.a(Float.valueOf(1.0f), Float.valueOf(0.7f));
    }

    /* access modifiers changed from: protected */
    public void v() {
        super.v();
        this.h = null;
        this.i = null;
    }

    private void b(CollapsingToolbarLayout collapsingToolbarLayout) {
        if (collapsingToolbarLayout != null) {
            a(collapsingToolbarLayout);
            this.e.l();
            x();
        }
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        b((CollapsingToolbarLayout) view.findViewById(i.collapsing_toolbar));
    }

    public C7664xKa<Float, Float> d() {
        return C7664xKa.a(Float.valueOf(0.1f), Float.valueOf(0.3f));
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        super.a(view);
        this.h = view.findViewById(i.top_gradient);
        this.i = view.findViewById(i.header_scrim);
    }

    /* access modifiers changed from: private */
    public void a(FragmentActivity fragmentActivity) {
        View findViewById = fragmentActivity.findViewById(i.profile_banner);
        if (findViewById != null) {
            int height = findViewById.getHeight();
            this.j = C5295SJa.a((Activity) fragmentActivity);
            this.k = (-height) + this.j + (this.e.getHeight() / 2);
        }
    }

    private void a(CollapsingToolbarLayout collapsingToolbarLayout) {
        ((LayoutParams) collapsingToolbarLayout.getLayoutParams()).a(1);
    }
}
