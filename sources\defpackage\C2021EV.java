package defpackage;

import android.content.SharedPreferences;

/* renamed from: EV reason: default package and case insensitive filesystem */
/* compiled from: KeyStorage_Factory */
public final class C2021EV implements C4961HMa<C2001DV> {
    private final C7054oVa<SharedPreferences> a;

    public C2021EV(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C2021EV a(C7054oVa<SharedPreferences> ova) {
        return new C2021EV(ova);
    }

    public static C2001DV a(SharedPreferences sharedPreferences) {
        return new C2001DV(sharedPreferences);
    }

    public C2001DV get() {
        return new C2001DV((SharedPreferences) this.a.get());
    }
}
