package defpackage;

import android.content.SharedPreferences;

/* renamed from: eU reason: default package and case insensitive filesystem */
/* compiled from: DeviceManagementStorage_Factory */
public final class C2984eU implements C4961HMa<C2965dU> {
    private final C7054oVa<SharedPreferences> a;

    public C2984eU(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C2984eU a(C7054oVa<SharedPreferences> ova) {
        return new C2984eU(ova);
    }

    public C2965dU get() {
        return new C2965dU((SharedPreferences) this.a.get());
    }
}
