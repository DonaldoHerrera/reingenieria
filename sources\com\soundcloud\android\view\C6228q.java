package com.soundcloud.android.view;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;

/* renamed from: com.soundcloud.android.view.q reason: case insensitive filesystem */
/* compiled from: CollapsingToolbarStyleHelper */
public class C6228q implements b {
    private final CustomFontTitleToolbar a;
    private final View b;
    private final View c;
    private final a d;

    /* renamed from: com.soundcloud.android.view.q$a */
    /* compiled from: CollapsingToolbarStyleHelper */
    public interface a {
        int b();

        C7664xKa<Float, Float> d();

        int r();

        C7664xKa<Float, Float> t();

        C7664xKa<Float, Float> u();
    }

    public C6228q(CustomFontTitleToolbar customFontTitleToolbar, View view, View view2, a aVar) {
        this.a = customFontTitleToolbar;
        this.b = view;
        this.c = view2;
        this.d = aVar;
    }

    private int b(AppBarLayout appBarLayout) {
        if (this.d.b() != 0) {
            return this.d.b();
        }
        return a(appBarLayout);
    }

    public void a(AppBarLayout appBarLayout, int i) {
        float height = (float) ((this.b.getHeight() - this.a.getHeight()) - this.d.r());
        this.b.setAlpha(C6768kIa.a(i, height, this.d.t()));
        this.a.setTitleAlpha(C6768kIa.a(i, height, this.d.d()));
        this.c.setAlpha(C6768kIa.a(i, height, this.d.u()));
        a(this.a, i, (double) b(appBarLayout));
    }

    private int a(AppBarLayout appBarLayout) {
        return -((int) (((float) appBarLayout.getTotalScrollRange()) - (((float) appBarLayout.getTotalScrollRange()) * ((Float) this.d.d().b()).floatValue())));
    }

    private void a(CustomFontTitleToolbar customFontTitleToolbar, int i, double d2) {
        double d3 = (double) i;
        if (d3 > d2) {
            customFontTitleToolbar.l();
        } else if (d3 < d2) {
            customFontTitleToolbar.m();
        }
    }
}
