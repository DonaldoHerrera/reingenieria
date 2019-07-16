package defpackage;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;

/* renamed from: oGa reason: default package and case insensitive filesystem */
/* compiled from: NetworkConnectionHelper_Factory */
public final class C7039oGa implements C4961HMa<C6970nGa> {
    private final C7054oVa<ConnectivityManager> a;
    private final C7054oVa<TelephonyManager> b;

    public C7039oGa(C7054oVa<ConnectivityManager> ova, C7054oVa<TelephonyManager> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C7039oGa a(C7054oVa<ConnectivityManager> ova, C7054oVa<TelephonyManager> ova2) {
        return new C7039oGa(ova, ova2);
    }

    public C6970nGa get() {
        return new C6970nGa((ConnectivityManager) this.a.get(), (TelephonyManager) this.b.get());
    }
}
