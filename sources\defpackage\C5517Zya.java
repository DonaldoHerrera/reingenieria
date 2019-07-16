package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Zya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideNotificationPreferencesFactory */
public final class C5517Zya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5517Zya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5517Zya a(C7054oVa<Context> ova) {
        return new C5517Zya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences u = C7853zya.u(context);
        C5023JMa.a(u, "Cannot return null from a non-@Nullable @Provides method");
        return u;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
