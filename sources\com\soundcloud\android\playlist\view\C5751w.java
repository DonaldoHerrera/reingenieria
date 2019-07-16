package com.soundcloud.android.playlist.view;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.soundcloud.android.utilities.android.MultiSwipeRefreshLayout;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

/* renamed from: com.soundcloud.android.playlist.view.w reason: case insensitive filesystem */
/* compiled from: PlaylistDetailHeaderScrollHelper.kt */
public final class C5751w extends DefaultSupportFragmentLightCycle<Fragment> implements b {
    private MultiSwipeRefreshLayout a;
    private boolean b = true;
    private boolean c;

    private final void g() {
        boolean z = this.b && !this.c;
        MultiSwipeRefreshLayout multiSwipeRefreshLayout = this.a;
        if (multiSwipeRefreshLayout == null || multiSwipeRefreshLayout.isEnabled() != z) {
            MultiSwipeRefreshLayout multiSwipeRefreshLayout2 = this.a;
            if (multiSwipeRefreshLayout2 != null) {
                multiSwipeRefreshLayout2.setEnabled(z);
            }
        }
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        this.a = view != null ? (MultiSwipeRefreshLayout) view.findViewById(i.str_layout) : null;
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        this.a = null;
        super.onDestroyView(fragment);
    }

    public void a(AppBarLayout appBarLayout, int i) {
        C7471uYa.b(appBarLayout, "appBarLayout");
        this.b = i == 0;
        g();
    }

    public final void a(boolean z) {
        this.c = z;
        g();
    }
}
