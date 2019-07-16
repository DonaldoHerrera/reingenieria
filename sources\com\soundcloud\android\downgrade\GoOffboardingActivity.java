package com.soundcloud.android.downgrade;

import android.os.Bundle;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.main.ActivityEnterScreenDispatcher;
import com.soundcloud.android.main.I.b;
import com.soundcloud.android.main.RootActivity;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class GoOffboardingActivity extends RootActivity implements b {
    @LightCycle
    ActivityEnterScreenDispatcher n;
    private GoOffboardingFragment o;

    public final class LightCycleBinder {
        public static void bind(GoOffboardingActivity goOffboardingActivity) {
            com.soundcloud.android.main.RootActivity.LightCycleBinder.bind(goOffboardingActivity);
            goOffboardingActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) goOffboardingActivity.n));
        }
    }

    public void a(RootActivity rootActivity) {
        this.o.Qb();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0370l supportFragmentManager = getSupportFragmentManager();
        this.o = (GoOffboardingFragment) supportFragmentManager.a(i.go_offboarding_fragment);
        if (this.o == null) {
            this.o = new GoOffboardingFragment();
            A a = supportFragmentManager.a();
            a.a(i.go_offboarding_fragment, (Fragment) this.o);
            a.a();
        }
        this.n.a((b) this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.o = null;
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.go_offboarding_activity);
    }

    public Yca x() {
        return Yca.OFFLINE_OFFBOARDING;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }

    public void a(RootActivity rootActivity, int i) {
        this.o.Qb();
    }
}
