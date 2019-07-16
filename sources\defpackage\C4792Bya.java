package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Bya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideAdsPrefsFactory */
public final class C4792Bya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C4792Bya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C4792Bya a(C7054oVa<Context> ova) {
        return new C4792Bya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences c = C7853zya.c(context);
        C5023JMa.a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
