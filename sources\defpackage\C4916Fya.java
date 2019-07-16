package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Fya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideChartsSyncPrefsFactory */
public final class C4916Fya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences g = C7853zya.g(context);
        C5023JMa.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
