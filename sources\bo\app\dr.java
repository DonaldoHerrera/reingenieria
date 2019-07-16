package bo.app;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

public final class dr {
    private static final String a = Hg.a(dr.class);

    public static boolean a(Context context) {
        try {
            Class.forName("com.google.android.gms.common.GoogleApiAvailability");
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            if (isGooglePlayServicesAvailable == 0) {
                Hg.a(a, "Google Play Services is available.");
                return true;
            }
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Google Play Services is unavailable: ");
            sb.append(isGooglePlayServicesAvailable);
            Hg.c(str, sb.toString());
            return false;
        } catch (Exception e) {
            Hg.c(a, "Google Play Services Availability API not found. Google Play Services not enabled.", e);
            return false;
        }
    }
}
