package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Iya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideConfigurationPrefsFactory */
public final class C5009Iya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5009Iya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5009Iya a(C7054oVa<Context> ova) {
        return new C5009Iya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences i = C7853zya.i(context);
        C5023JMa.a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
