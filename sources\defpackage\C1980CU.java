package defpackage;

import android.content.SharedPreferences;

/* renamed from: CU reason: default package and case insensitive filesystem */
/* compiled from: PlanStorage_Factory */
public final class C1980CU implements C4961HMa<C1960BU> {
    private final C7054oVa<SharedPreferences> a;

    public C1980CU(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C1980CU a(C7054oVa<SharedPreferences> ova) {
        return new C1980CU(ova);
    }

    public C1960BU get() {
        return new C1960BU((SharedPreferences) this.a.get());
    }
}
