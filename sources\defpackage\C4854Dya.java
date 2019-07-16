package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Dya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideAnalyticsPrefsFactory */
public final class C4854Dya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C4854Dya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C4854Dya a(C7054oVa<Context> ova) {
        return new C4854Dya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences e = C7853zya.e(context);
        C5023JMa.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
