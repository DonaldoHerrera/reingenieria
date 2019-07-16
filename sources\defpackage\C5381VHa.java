package defpackage;

import android.telephony.TelephonyManager;

/* renamed from: VHa reason: default package and case insensitive filesystem */
/* compiled from: TelephonyBasedCountryProvider */
public class C5381VHa implements C6291dHa {
    private TelephonyManager a;

    public C5381VHa(TelephonyManager telephonyManager) {
        this.a = telephonyManager;
    }

    public String a() {
        TelephonyManager telephonyManager = this.a;
        if (telephonyManager == null) {
            return null;
        }
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (simCountryIso == null) {
            simCountryIso = this.a.getNetworkCountryIso();
        }
        return simCountryIso;
    }
}
