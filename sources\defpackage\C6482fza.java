package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: fza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvidePrivacySettingsPrefsFactory */
public final class C6482fza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C6482fza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C6482fza a(C7054oVa<Context> ova) {
        return new C6482fza(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences B = C7853zya.B(context);
        C5023JMa.a(B, "Cannot return null from a non-@Nullable @Provides method");
        return B;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
