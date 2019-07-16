package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import java.util.concurrent.CancellationException;

public class zabu extends zal {
    private Xy<Void> zajp = new Xy<>();

    private zabu(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zabu zac(Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zabu zabu = (zabu) fragment.getCallbackOrNull("GmsAvailabilityHelper", zabu.class);
        if (zabu == null) {
            return new zabu(fragment);
        }
        if (zabu.zajp.a().d()) {
            zabu.zajp = new Xy<>();
        }
        return zabu;
    }

    public final Wy<Void> getTask() {
        return this.zajp.a();
    }

    public void onDestroy() {
        super.onDestroy();
        this.zajp.b((Exception) new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    /* access modifiers changed from: protected */
    public final void zaa(ConnectionResult connectionResult, int i) {
        this.zajp.a((Exception) ApiExceptionUtil.fromStatus(new Status(connectionResult.getErrorCode(), connectionResult.getErrorMessage(), connectionResult.getResolution())));
    }

    /* access modifiers changed from: protected */
    public final void zao() {
        int isGooglePlayServicesAvailable = this.zacd.isGooglePlayServicesAvailable(this.mLifecycleFragment.getLifecycleActivity());
        if (isGooglePlayServicesAvailable == 0) {
            this.zajp.a(null);
            return;
        }
        if (!this.zajp.a().d()) {
            zab(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        }
    }
}
