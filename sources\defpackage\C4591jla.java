package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.payments.Aa;
import com.soundcloud.android.payments.C;
import java.util.ArrayList;
import org.json.JSONException;

/* renamed from: jla reason: default package and case insensitive filesystem */
/* compiled from: BillingService */
public class C4591jla {
    private final C6699jHa a;
    /* access modifiers changed from: private */
    public final C4599kla b;
    private final C4639pla c;
    private final C3700b d;
    /* access modifiers changed from: private */
    public final C6713jVa<C> e = C6713jVa.s();
    private final ServiceConnection f = new C4583ila(this);
    private Activity g;
    /* access modifiers changed from: private */
    public IInAppBillingService h;

    C4591jla(C6699jHa jha, C4599kla kla, C4639pla pla, C3700b bVar) {
        this.a = jha;
        this.b = kla;
        this.c = pla;
        this.d = bVar;
    }

    /* access modifiers changed from: private */
    public boolean c() {
        try {
            int a2 = this.h.a(3, this.a.h(), "subs");
            C4623nla.a("isSubsSupported", a2);
            if (a2 == 0) {
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public IPa<C4657rla> b() {
        return IPa.a((LPa<T>) new C4567gla<T>(this));
    }

    private Bundle b(String str) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", C2063HD.a((E[]) new String[]{str}));
        return bundle;
    }

    public APa<C> a(Activity activity) {
        this.g = activity;
        if (this.b.a()) {
            C4623nla.a("Billing service available about to connect");
            this.b.a(activity, this.f);
        } else {
            C4623nla.a("Billing service is not available on this device");
            this.e.a(C.UNSUPPORTED);
        }
        return this.e.h();
    }

    public void a() {
        if (this.h != null) {
            this.g.unbindService(this.f);
            C4623nla.a("Connection closed");
        }
        this.e.onComplete();
        this.g = null;
    }

    public IPa<Aa> a(String str) {
        return IPa.a((LPa<T>) new C4559fla<T>(this, str));
    }

    public /* synthetic */ void a(String str, JPa jPa) throws Exception {
        String str2 = "DETAILS_LIST";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("About to get details for product id: ");
            sb.append(str);
            C4623nla.a(sb.toString());
            Bundle skuDetails = this.h.getSkuDetails(3, this.a.h(), "subs", b(str));
            C4623nla.a("getSkuDetails", C4623nla.a(skuDetails));
            if (skuDetails.containsKey(str2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Response: ");
                sb2.append(skuDetails);
                C4623nla.a(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SkuDetails: ");
                sb3.append(skuDetails.get(str2));
                C4623nla.a(sb3.toString());
                jPa.onSuccess(this.c.b((String) skuDetails.getStringArrayList(str2).get(0)));
                return;
            }
            jPa.a((Throwable) new IllegalStateException("No subscription details in IAB service response"));
        } catch (RemoteException | JSONException e2) {
            C4623nla.a("Failed to retrieve subscription details");
            jPa.a(e2);
        }
    }

    public /* synthetic */ void a(JPa jPa) throws Exception {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Calling getPurchases with continuation token: ");
            sb.append(null);
            C4623nla.a(sb.toString());
            Bundle a2 = this.h.a(3, this.a.h(), "subs", null);
            int a3 = C4623nla.a(a2);
            C4623nla.a("getPurchases", a3);
            if (a3 == 0) {
                jPa.onSuccess(a(a2));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getPurchases() failed: ");
            sb2.append(C4623nla.a(a3));
            C4623nla.a(sb2.toString());
            jPa.a((Throwable) new IllegalStateException("Non-OK subscription status response code from IAB service"));
        } catch (RemoteException | JSONException e2) {
            C4623nla.a("Failed to retrieve subscription status");
            jPa.a(e2);
        }
    }

    private C4657rla a(Bundle bundle) throws JSONException {
        ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList.isEmpty()) {
            return C4657rla.d();
        }
        return C4657rla.a(this.c.a((String) stringArrayList.get(0)), new C4631ola((String) stringArrayList.get(0), (String) stringArrayList2.get(0)));
    }

    public void a(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Calling getBuyIntent with id ");
            sb.append(str);
            sb.append(" and purchaseUrn ");
            sb.append(str2);
            C4623nla.a(sb.toString());
            Bundle a2 = this.h.a(3, this.a.h(), str, "subs", str2);
            int a3 = C4623nla.a(a2);
            C4623nla.a("getBuyIntent", a3);
            if (a3 == 0) {
                this.g.startIntentSenderForResult(((PendingIntent) a2.getParcelable("BUY_INTENT")).getIntentSender(), 1001, new Intent(), 0, 0, 0);
            }
        } catch (SendIntentException | RemoteException e2) {
            C4623nla.a("Failed to send purchase Intent");
            this.d.a((J) Caa.a("BillingService.startPurchase"));
            C7316sHa.d(e2);
        }
    }
}
