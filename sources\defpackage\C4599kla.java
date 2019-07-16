package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import java.util.List;

/* renamed from: kla reason: default package and case insensitive filesystem */
/* compiled from: BillingServiceBinder */
class C4599kla {
    private final Context a;
    private final Intent b = new Intent("com.android.vending.billing.InAppBillingService.BIND");

    C4599kla(Context context) {
        this.a = context;
        this.b.setPackage("com.android.vending");
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        List queryIntentServices = this.a.getPackageManager().queryIntentServices(this.b, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return false;
        }
        return true;
    }

    public void a(Activity activity, ServiceConnection serviceConnection) {
        activity.bindService(this.b, serviceConnection, 1);
    }

    public IInAppBillingService a(IBinder iBinder) {
        return Stub.a(iBinder);
    }
}
