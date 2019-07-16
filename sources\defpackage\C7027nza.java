package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: nza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideSyncerPreferencesFactory */
public final class C7027nza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C7027nza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C7027nza a(C7054oVa<Context> ova) {
        return new C7027nza(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences I = C7853zya.I(context);
        C5023JMa.a(I, "Cannot return null from a non-@Nullable @Provides method");
        return I;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
