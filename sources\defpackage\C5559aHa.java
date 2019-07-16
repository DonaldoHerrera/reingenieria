package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.soundcloud.android.ia.i;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

/* renamed from: aHa reason: default package and case insensitive filesystem */
/* compiled from: CollapsingScrollHelper */
public class C5559aHa extends DefaultSupportFragmentLightCycle<Fragment> implements b {
    private AppBarLayout a;
    private SwipeRefreshLayout b;

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        this.b = (SwipeRefreshLayout) view.findViewById(i.str_layout);
        if (this.b != null) {
            this.a = (AppBarLayout) view.findViewById(i.appbar);
            AppBarLayout appBarLayout = this.a;
            if (appBarLayout != null) {
                appBarLayout.a((b) this);
                return;
            }
            throw new IllegalStateException("Expected to find AppBarLayout with ID R.id.appbar");
        }
        throw new IllegalStateException("Expected to find SwipeRefreshLayout with ID R.id.str_layout");
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        this.a.b((b) this);
        this.b = null;
        this.a = null;
        super.onDestroyView(fragment);
    }

    public void a(AppBarLayout appBarLayout, int i) {
        this.b.setEnabled(i >= 0);
    }
}
