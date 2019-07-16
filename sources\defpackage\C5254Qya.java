package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Qya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideEntitySyncStatePreferencesFactory */
public final class C5254Qya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5254Qya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5254Qya a(C7054oVa<Context> ova) {
        return new C5254Qya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences m = C7853zya.m(context);
        C5023JMa.a(m, "Cannot return null from a non-@Nullable @Provides method");
        return m;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
