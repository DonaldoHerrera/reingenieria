package com.soundcloud.android;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;

/* renamed from: com.soundcloud.android.u reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideConnectionHelperFactory */
public final class C2942u implements C4961HMa<C6834lGa> {
    private final C2933l a;
    private final C7054oVa<ConnectivityManager> b;
    private final C7054oVa<TelephonyManager> c;
    private final C7054oVa<C6766kGa> d;

    public C2942u(C2933l lVar, C7054oVa<ConnectivityManager> ova, C7054oVa<TelephonyManager> ova2, C7054oVa<C6766kGa> ova3) {
        this.a = lVar;
        this.b = ova;
        this.c = ova2;
        this.d = ova3;
    }

    public static C2942u a(C2933l lVar, C7054oVa<ConnectivityManager> ova, C7054oVa<TelephonyManager> ova2, C7054oVa<C6766kGa> ova3) {
        return new C2942u(lVar, ova, ova2, ova3);
    }

    public static C6834lGa a(C2933l lVar, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, C6766kGa kga) {
        C6834lGa a2 = lVar.a(connectivityManager, telephonyManager, kga);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C6834lGa get() {
        return a(this.a, (ConnectivityManager) this.b.get(), (TelephonyManager) this.c.get(), (C6766kGa) this.d.get());
    }
}
