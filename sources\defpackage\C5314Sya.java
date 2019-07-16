package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Sya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideGcmPrefsFactory */
public final class C5314Sya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5314Sya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5314Sya a(C7054oVa<Context> ova) {
        return new C5314Sya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences n = C7853zya.n(context);
        C5023JMa.a(n, "Cannot return null from a non-@Nullable @Provides method");
        return n;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
