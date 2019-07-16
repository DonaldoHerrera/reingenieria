package defpackage;

import android.telephony.TelephonyManager;

/* renamed from: WHa reason: default package and case insensitive filesystem */
/* compiled from: TelephonyBasedCountryProvider_Factory */
public final class C5410WHa implements C4961HMa<C5381VHa> {
    private final C7054oVa<TelephonyManager> a;

    public C5410WHa(C7054oVa<TelephonyManager> ova) {
        this.a = ova;
    }

    public static C5410WHa a(C7054oVa<TelephonyManager> ova) {
        return new C5410WHa(ova);
    }

    public C5381VHa get() {
        return new C5381VHa((TelephonyManager) this.a.get());
    }
}
