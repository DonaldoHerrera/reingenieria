package com.soundcloud.android.view;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.soundcloud.android.ia.i;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public abstract class BaseFragment extends LightCycleSupportFragment<Fragment> implements N, X {
    @LightCycle
    SupportFragmentLightCycle<Fragment> a = C4987IHa.a.b(getClass().getSimpleName());
    @LightCycle
    C7592wHa b = new C7592wHa();

    public final class LightCycleBinder {
        public static void bind(BaseFragment baseFragment) {
            baseFragment.bind(LightCycles.lift(baseFragment.a));
            baseFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) baseFragment.b));
        }
    }

    /* access modifiers changed from: protected */
    public Integer Qb() {
        return null;
    }

    public void a() {
        View view = getView();
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(i.ak_recycler_view);
            if (recyclerView != null) {
                recyclerView.j(0);
            }
            AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(i.appbar);
            if (appBarLayout != null) {
                appBarLayout.setExpanded(true);
            }
            if (appBarLayout == null && recyclerView == null) {
                throw new IllegalStateException("Called BaseFragment#scrollToTop and nothing happened because appBarLayout and recyclerView were both null.");
            }
        }
    }

    public APa<RVa> d() {
        return this.b.g();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(i.toolbar_id);
        if (toolbar != null) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
            ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
            int g = supportActionBar != null ? supportActionBar.g() : -1;
            appCompatActivity.setSupportActionBar(toolbar);
            if (g != -1) {
                ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
                if (supportActionBar2 != null) {
                    supportActionBar2.a(g, 4);
                }
            }
            Integer Qb = Qb();
            if (Qb != null) {
                appCompatActivity.setTitle(Qb.intValue());
            }
        }
    }
}
