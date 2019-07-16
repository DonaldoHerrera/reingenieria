package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import androidx.viewpager.widget.ViewPager.h;
import com.google.android.material.tabs.TabLayout;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.FragmentEnterScreenDispatcher;
import com.soundcloud.android.main.I.b;
import com.soundcloud.android.main.RootActivity;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;

public class ProfilePresenter extends SupportFragmentLightCycleDispatcher<Fragment> implements b {
    @LightCycle
    final ProfileScrollHelper a;
    @LightCycle
    final FragmentEnterScreenDispatcher b;
    private final C5875ya c;
    private final C5836qa d;
    private final C5604aua e;
    private final C2526g f;
    private final C3700b g;
    private final UPa h = new UPa();
    private final HPa i;
    private final C5606ava j;
    private ViewPager k;
    private Jd l;
    private C5850ta m;
    private VPa n = C4881Eua.b();
    private C4928GKa<FragmentActivity> o = C4928GKa.a();
    private C3508cda p;
    private h q;

    public final class LightCycleBinder {
        public static void bind(ProfilePresenter profilePresenter) {
            profilePresenter.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) profilePresenter.a));
            profilePresenter.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) profilePresenter.b));
        }
    }

    ProfilePresenter(ProfileScrollHelper profileScrollHelper, HPa hPa, C5836qa qaVar, C5875ya yaVar, C5604aua aua, C2526g gVar, C3700b bVar, FragmentEnterScreenDispatcher fragmentEnterScreenDispatcher, C5606ava ava) {
        this.a = profileScrollHelper;
        this.i = hPa;
        this.d = qaVar;
        this.c = yaVar;
        this.e = aua;
        this.f = gVar;
        this.g = bVar;
        this.b = fragmentEnterScreenDispatcher;
        this.j = ava;
        this.b.a((b) this);
    }

    private void b(int i2) {
        if (this.f.b(this.p)) {
            this.g.a(new Zca(this.l.h(i2)));
        } else {
            this.g.a(new Zca(this.l.g(i2), C3508cda.f(this.p.c())));
        }
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        FragmentActivity activity = fragment.getActivity();
        this.o = C4928GKa.c(activity);
        this.m = this.c.a();
        this.m.a(fragment, view);
        this.p = ProfileFragment.b(fragment);
        boolean b2 = this.f.b(this.p);
        activity.setTitle(b2 ? p.side_menu_you : p.side_menu_profile);
        this.k = (ViewPager) view.findViewById(i.profile_pager);
        Na na = new Na(fragment.getChildFragmentManager(), fragment.getResources(), this.p, b2, ProfileFragment.a(fragment));
        this.l = na;
        this.k.setAdapter(this.l);
        this.k.setCurrentItem(0);
        this.q = new Oa(this);
        this.k.a((e) this.q);
        this.k.setPageMarginDrawable(ia.h.divider_vertical_grey);
        this.k.setPageMargin(fragment.getResources().getDimensionPixelOffset(g.view_pager_divider_width));
        TabLayout tabLayout = (TabLayout) view.findViewById(i.tab_indicator_fixed);
        tabLayout.setVisibility(0);
        tabLayout.setupWithViewPager(this.k);
        this.h.b((VPa) this.e.b(this.p).h(new C5765c(b2)).a(this.i).c(this.j.b(new C5760b(this))));
    }

    static /* synthetic */ Ka a(boolean z, C4954HFa hFa) throws Exception {
        return new Ka(hFa, z);
    }

    public /* synthetic */ RVa a(Ka ka) {
        this.m.a(ka);
        if (!ka.b() && this.d.a()) {
            this.o.a((C7733yKa<? super T>) new C5755a<Object>(ka));
        }
        return RVa.a;
    }

    public void a(RootActivity rootActivity) {
        b(this.k.getCurrentItem());
    }

    public void a(RootActivity rootActivity, int i2) {
        b(i2);
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        this.h.b();
        this.n.dispose();
        this.o = C4928GKa.a();
        this.m.a();
        this.k = null;
        this.l = null;
        this.q = null;
        this.m = null;
        super.onDestroyView(fragment);
    }
}
