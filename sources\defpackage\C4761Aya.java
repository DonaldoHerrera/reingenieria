package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Aya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideActivitiesSyncPrefsFactory */
public final class C4761Aya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C4761Aya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C4761Aya a(C7054oVa<Context> ova) {
        return new C4761Aya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences b = C7853zya.b(context);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
