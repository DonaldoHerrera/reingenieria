package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvidePromotedImpressionsPrefsFactory */
public final class C6550gza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C6550gza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C6550gza a(C7054oVa<Context> ova) {
        return new C6550gza(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences C = C7853zya.C(context);
        C5023JMa.a(C, "Cannot return null from a non-@Nullable @Provides method");
        return C;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
