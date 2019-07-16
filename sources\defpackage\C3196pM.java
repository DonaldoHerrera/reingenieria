package defpackage;

import android.content.SharedPreferences;

/* renamed from: pM reason: default package and case insensitive filesystem */
/* compiled from: PrivacySettingsStorage_Factory */
public final class C3196pM implements C4961HMa<C3177oM> {
    private final C7054oVa<SharedPreferences> a;

    public C3196pM(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C3196pM a(C7054oVa<SharedPreferences> ova) {
        return new C3196pM(ova);
    }

    public C3177oM get() {
        return new C3177oM((SharedPreferences) this.a.get());
    }
}
