package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.a;
import com.google.android.gms.auth.b;
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.AccountType;
import java.io.IOException;

/* renamed from: yHa reason: default package and case insensitive filesystem */
/* compiled from: GooglePlayServicesWrapper */
public class C7730yHa {
    public int a(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
    }

    public boolean b(Context context) {
        try {
            return a(context) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean a(Context context, int i) {
        return b(context) && GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE >= i;
    }

    public boolean a(int i) {
        return GoogleApiAvailability.getInstance().isUserResolvableError(i);
    }

    public void a(Activity activity, int i) {
        C5232QGa.a(GoogleApiAvailability.getInstance().getErrorDialog(activity, i, 9000));
    }

    public boolean a(Activity activity, int i, int i2) {
        if (activity.isFinishing()) {
            return false;
        }
        return GoogleApiAvailability.getInstance().showErrorDialogFragment(activity, i, i2);
    }

    public Intent a() {
        return AccountPicker.newChooseAccountIntent(null, null, new String[]{AccountType.GOOGLE}, false, null, null, null, null);
    }

    public String a(Context context, String str, String str2, Bundle bundle) throws IOException, a {
        return b.a(context, str, str2, bundle);
    }
}
