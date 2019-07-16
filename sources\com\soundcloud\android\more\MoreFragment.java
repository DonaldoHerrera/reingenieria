package com.soundcloud.android.more;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.W.a;
import com.soundcloud.android.main.W.b;
import com.soundcloud.android.view.BaseFragment;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public class MoreFragment extends BaseFragment implements b, a {
    @LightCycle
    B c;
    C3700b d;
    private VPa e;

    public final class LightCycleBinder {
        public static void bind(MoreFragment moreFragment) {
            com.soundcloud.android.view.BaseFragment.LightCycleBinder.bind(moreFragment);
            moreFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) moreFragment.c));
        }
    }

    public MoreFragment() {
        SoundCloudApplication.f().a(this);
        setRetainInstance(true);
    }

    private int Rb() {
        return l.more_with_toolbar;
    }

    public Integer Qb() {
        return Integer.valueOf(p.tab_more);
    }

    public void a() {
        super.a();
        this.c.g();
    }

    public void c(boolean z) {
        this.c.c(z);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.e = d().f((C6776kQa<? super T>) new C4050d<Object>(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(Rb(), viewGroup, false);
    }

    public void onDetach() {
        this.e.dispose();
        super.onDetach();
    }

    public /* synthetic */ void a(RVa rVa) throws Exception {
        this.d.a(Yca.MORE);
    }
}
