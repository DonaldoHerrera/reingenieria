package com.soundcloud.android.downgrade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.l;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public class GoOffboardingFragment extends LightCycleSupportFragment<GoOffboardingFragment> {
    @LightCycle
    f a;

    public final class LightCycleBinder {
        public static void bind(GoOffboardingFragment goOffboardingFragment) {
            goOffboardingFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) goOffboardingFragment.a));
        }
    }

    public GoOffboardingFragment() {
        setRetainInstance(true);
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: 0000 */
    public void Qb() {
        this.a.i();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(l.go_offboarding_fragment, viewGroup, false);
    }
}
