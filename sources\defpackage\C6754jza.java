package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: jza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideReportedCommentsStorageFactory */
public final class C6754jza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C6754jza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C6754jza a(C7054oVa<Context> ova) {
        return new C6754jza(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences E = C7853zya.E(context);
        C5023JMa.a(E, "Cannot return null from a non-@Nullable @Provides method");
        return E;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
