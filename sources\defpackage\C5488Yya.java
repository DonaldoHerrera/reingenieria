package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Yya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideNightModePrefsFactory */
public final class C5488Yya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5488Yya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5488Yya a(C7054oVa<Context> ova) {
        return new C5488Yya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences t = C7853zya.t(context);
        C5023JMa.a(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
