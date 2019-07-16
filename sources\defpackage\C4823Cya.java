package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Cya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideAlphaReminderFactory */
public final class C4823Cya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences d = C7853zya.d(context);
        C5023JMa.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
