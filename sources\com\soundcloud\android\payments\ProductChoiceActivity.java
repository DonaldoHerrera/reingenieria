package com.soundcloud.android.payments;

import android.os.Bundle;
import com.soundcloud.android.foundation.events.C3701c;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.android.payments.Fa.l;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class ProductChoiceActivity extends LoggedInActivity {
    @LightCycle
    C4264sa x;
    C3701c y;

    public final class LightCycleBinder {
        public static void bind(ProductChoiceActivity productChoiceActivity) {
            productChoiceActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) productChoiceActivity.x));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y.r();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.product_choice_activity);
    }

    public Yca x() {
        return Yca.PLAN_CHOICE;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }
}
