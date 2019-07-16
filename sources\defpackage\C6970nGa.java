package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: nGa reason: default package and case insensitive filesystem */
/* compiled from: NetworkConnectionHelper.kt */
public class C6970nGa implements C6834lGa {
    private final ConnectivityManager a;
    private final TelephonyManager b;

    public C6970nGa(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        C7471uYa.b(connectivityManager, "connectivityManager");
        C7471uYa.b(telephonyManager, "telephonyManager");
        this.a = connectivityManager;
        this.b = telephonyManager;
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 6)) {
            return false;
        }
        return true;
    }

    public C6902mGa b() {
        return C6902mGa.h.a(this.a.getActiveNetworkInfo(), this.b.getNetworkType());
    }

    public boolean c() {
        return C1628qb.a(this.a);
    }

    public boolean d() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }
}
