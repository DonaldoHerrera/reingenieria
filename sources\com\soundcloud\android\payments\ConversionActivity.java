package com.soundcloud.android.payments;

import android.os.Bundle;
import com.soundcloud.android.foundation.events.C3701c;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.android.payments.Fa.l;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.y;

public class ConversionActivity extends LoggedInActivity {
    C3701c A;
    C4806CMa<P> x;
    C4806CMa<Ga> y;
    a z;

    private int C() {
        return this.z.a((a) y.a) ? l.conversion_activity : l.legacy_conversion_activity;
    }

    private E D() {
        return (E) (this.z.a((a) y.a) ? this.y : this.x).get();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        D().b(this, bundle);
        this.A.r();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        D().a(this);
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        D().a(this, bundle);
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(C());
    }

    public Yca x() {
        return Yca.CONVERSION;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }
}
