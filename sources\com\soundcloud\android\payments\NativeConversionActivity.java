package com.soundcloud.android.payments;

import android.content.Intent;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.android.payments.Fa.l;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class NativeConversionActivity extends LoggedInActivity {
    @LightCycle
    W x;
    C4834DJa y;

    public final class LightCycleBinder {
        public static void bind(NativeConversionActivity nativeConversionActivity) {
            nativeConversionActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) nativeConversionActivity.x));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.x.a(new C4575hla(i, i2, intent));
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return this.x.x();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.legacy_conversion_activity);
        this.y.f(this);
    }

    public Yca x() {
        return Yca.CONVERSION;
    }
}
