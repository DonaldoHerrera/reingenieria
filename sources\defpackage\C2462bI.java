package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: bI reason: default package and case insensitive filesystem */
public class C2462bI {
    protected static final String a = "bI";
    protected final String b = "OPTOUT";
    protected final String c = "-";
    private Context d;
    public Info e;

    public C2462bI(Context context) {
        this.d = context;
    }

    public final Info a() {
        StringBuilder sb;
        String str;
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.d);
        } catch (IOException e2) {
            e = e2;
            str = a;
            sb = new StringBuilder("Unable to get Google advertising id: ");
            sb.append(e);
            Log.e(str, sb.toString());
            return null;
        } catch (GooglePlayServicesNotAvailableException e3) {
            e = e3;
            str = a;
            sb = new StringBuilder("Google play services is not available: ");
            sb.append(e);
            Log.e(str, sb.toString());
            return null;
        } catch (GooglePlayServicesRepairableException e4) {
            e = e4;
            str = a;
            sb = new StringBuilder("Google play services is not installed, up-to-date, or enabled: ");
            sb.append(e);
            Log.e(str, sb.toString());
            return null;
        } catch (Exception e5) {
            e = e5;
            str = a;
            sb = new StringBuilder("Google play services exception ");
            sb.append(e);
            Log.e(str, sb.toString());
            return null;
        }
    }
}
