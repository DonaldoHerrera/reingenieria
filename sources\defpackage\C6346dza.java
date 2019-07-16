package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: dza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvidePlayerPreferencesFactory */
public final class C6346dza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences z = C7853zya.z(context);
        C5023JMa.a(z, "Cannot return null from a non-@Nullable @Provides method");
        return z;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
