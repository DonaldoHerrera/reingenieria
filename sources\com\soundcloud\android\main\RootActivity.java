package com.soundcloud.android.main;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.image.O;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleAppCompatActivity;
import com.soundcloud.lightcycle.LightCycles;
import dagger.android.a;
import java.util.ArrayList;
import java.util.List;

public abstract class RootActivity extends LightCycleAppCompatActivity<RootActivity> {
    @LightCycle
    protected ForegroundTracker a;
    C2416ZT b;
    C4655rja c;
    C4709xja d;
    @LightCycle
    D e;
    @LightCycle
    B f;
    @LightCycle
    O g;
    @LightCycle
    C3079jU h;
    @LightCycle
    C2466bM i;
    @LightCycle
    @f
    ActivityLightCycle<AppCompatActivity> j;
    @LightCycle
    @a
    ActivityLightCycle<AppCompatActivity> k;
    C3700b l;
    private final UPa m = new UPa();

    public final class LightCycleBinder {
        public static void bind(RootActivity rootActivity) {
            rootActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) rootActivity.a));
            rootActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) rootActivity.e));
            rootActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) rootActivity.f));
            rootActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) rootActivity.g));
            rootActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) rootActivity.h));
            rootActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) rootActivity.i));
            rootActivity.bind(LightCycles.lift(rootActivity.j));
            rootActivity.bind(LightCycles.lift(rootActivity.k));
        }
    }

    private void z() {
        Yca x = x();
        if (x != Yca.UNKNOWN) {
            this.l.a(x);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a.a((Activity) this);
        if (y()) {
            bind(LightCycles.lift((ActivityLightCycle<Source>) this.b));
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.m.b();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.m.b((VPa) this.c.a().c(this.d.a(this, w())));
        z();
    }

    /* access modifiers changed from: protected */
    public List<C4613mja> w() {
        return new ArrayList();
    }

    public Yca x() {
        return Yca.UNKNOWN;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return true;
    }
}
