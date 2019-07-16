package defpackage;

import android.content.SharedPreferences;

/* renamed from: WT reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationSettingsStorage_Factory */
public final class C2361WT implements C4961HMa<C2343VT> {
    private final C7054oVa<SharedPreferences> a;

    public C2361WT(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C2361WT a(C7054oVa<SharedPreferences> ova) {
        return new C2361WT(ova);
    }

    public C2343VT get() {
        return new C2343VT((SharedPreferences) this.a.get());
    }
}
