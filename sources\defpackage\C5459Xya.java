package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Xya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideNavigationStatePrefsFactory */
public final class C5459Xya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences s = C7853zya.s(context);
        C5023JMa.a(s, "Cannot return null from a non-@Nullable @Provides method");
        return s;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
