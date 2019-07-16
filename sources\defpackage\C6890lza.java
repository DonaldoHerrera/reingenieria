package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: lza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideStreamPrefsFactory */
public final class C6890lza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C6890lza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C6890lza a(C7054oVa<Context> ova) {
        return new C6890lza(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences G = C7853zya.G(context);
        C5023JMa.a(G, "Cannot return null from a non-@Nullable @Provides method");
        return G;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
