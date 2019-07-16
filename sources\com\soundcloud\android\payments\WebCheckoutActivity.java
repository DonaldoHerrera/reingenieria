package com.soundcloud.android.payments;

import android.os.Bundle;
import com.soundcloud.android.foundation.events.C3701c;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.android.payments.Fa.l;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class WebCheckoutActivity extends LoggedInActivity {
    C4834DJa x;
    @LightCycle
    Ta y;
    C3701c z;

    public final class LightCycleBinder {
        public static void bind(WebCheckoutActivity webCheckoutActivity) {
            webCheckoutActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) webCheckoutActivity.y));
        }
    }

    public void onBackPressed() {
        if (!this.y.x()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.z.r();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.web_checkout_activity);
        this.x.f(this);
    }

    public Yca x() {
        return Yca.CHECKOUT;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }
}
