package defpackage;

import android.content.SharedPreferences;

/* renamed from: YU reason: default package and case insensitive filesystem */
/* compiled from: FeatureStorage_Factory */
public final class C2398YU implements C4961HMa<C2380XU> {
    private final C7054oVa<SharedPreferences> a;

    public C2398YU(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C2398YU a(C7054oVa<SharedPreferences> ova) {
        return new C2398YU(ova);
    }

    public C2380XU get() {
        return new C2380XU((SharedPreferences) this.a.get());
    }
}
