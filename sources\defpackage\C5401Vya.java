package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Vya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideKeysPrefsFactory */
public final class C5401Vya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5401Vya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5401Vya a(C7054oVa<Context> ova) {
        return new C5401Vya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences q = C7853zya.q(context);
        C5023JMa.a(q, "Cannot return null from a non-@Nullable @Provides method");
        return q;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
