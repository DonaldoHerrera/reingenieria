package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Eya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideBottomNavStateFactory */
public final class C4885Eya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences f = C7853zya.f(context);
        C5023JMa.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
