package com.soundcloud.android.search;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import com.google.android.material.tabs.TabLayout;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

@SuppressLint({"ValidFragment"})
/* compiled from: TabbedSearchFragment */
public class Ta extends Fragment {
    Resources a;
    Ja b;
    private ViewPager c;

    /* compiled from: TabbedSearchFragment */
    protected static class a implements e {
        private final Ja a;

        a(Ja ja) {
            this.a = ja;
        }

        public void a(int i) {
        }

        public void a(int i, float f, int i2) {
        }

        public void b(int i) {
            this.a.b(La.a(i));
        }
    }

    public Ta() {
        setRetainInstance(true);
        SoundCloudApplication.f().a(this);
    }

    private String Qb() {
        return getArguments().getString("query");
    }

    private C4928GKa<Integer> Rb() {
        return C4928GKa.b(Integer.valueOf(getArguments().getInt("queryPosition")));
    }

    private C4928GKa<C3508cda> Sb() {
        return C5526_Ha.a(getArguments(), "queryUrn");
    }

    private String Tb() {
        return getArguments().getString("userQuery");
    }

    static Bundle b(String str, String str2, C4928GKa<C3508cda> gKa, C4928GKa<Integer> gKa2) {
        Bundle bundle = new Bundle();
        bundle.putString("query", str);
        bundle.putString("userQuery", str2);
        C5526_Ha.a(bundle, "queryUrn", gKa);
        if (gKa2.c()) {
            bundle.putInt("queryPosition", ((Integer) gKa2.b()).intValue());
        }
        return bundle;
    }

    public static Ta c(String str, String str2, C4928GKa<C3508cda> gKa, C4928GKa<Integer> gKa2) {
        Bundle b2 = b(str, str2, gKa, gKa2);
        Ta ta = new Ta();
        ta.setArguments(b2);
        return ta;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.b(La.ALL);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(l.tabbed_search_fragment, viewGroup, false);
        inflate.setBackgroundColor(getResources().getColor(f.white));
        inflate.findViewById(i.tab_indicator).setPadding(0, 0, 0, 0);
        inflate.findViewById(i.tab_indicator).setElevation(this.a.getDimension(g.toolbar_elevation));
        return inflate;
    }

    public void onDestroyView() {
        this.c = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5939v vVar = new C5939v(this.a, getChildFragmentManager(), Qb(), Tb(), Sb(), Rb());
        this.c = (ViewPager) view.findViewById(i.search_results_pager);
        this.c.setAdapter(vVar);
        this.c.setPageMarginDrawable(h.divider_vertical_grey);
        this.c.setPageMargin(this.a.getDimensionPixelOffset(g.view_pager_divider_width));
        ((TabLayout) view.findViewById(i.tab_indicator)).setupWithViewPager(this.c);
        this.c.a((e) new a(this.b));
    }
}
