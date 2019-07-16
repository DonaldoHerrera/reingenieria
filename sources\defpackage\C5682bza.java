package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: bza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvidePaymentsPrefsFactory */
public final class C5682bza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences x = C7853zya.x(context);
        C5023JMa.a(x, "Cannot return null from a non-@Nullable @Provides method");
        return x;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
