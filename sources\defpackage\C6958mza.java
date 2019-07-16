package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: mza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideStreamSyncPrefsFactory */
public final class C6958mza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C6958mza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C6958mza a(C7054oVa<Context> ova) {
        return new C6958mza(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences H = C7853zya.H(context);
        C5023JMa.a(H, "Cannot return null from a non-@Nullable @Provides method");
        return H;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
