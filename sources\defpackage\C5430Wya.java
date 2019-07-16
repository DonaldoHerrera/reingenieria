package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Wya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideLegacyAnalyticsPrefsFactory */
public final class C5430Wya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences r = C7853zya.r(context);
        C5023JMa.a(r, "Cannot return null from a non-@Nullable @Provides method");
        return r;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
