package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Oya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideDevSettingsFactory */
public final class C5194Oya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5194Oya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5194Oya a(C7054oVa<Context> ova) {
        return new C5194Oya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences k = C7853zya.k(context);
        C5023JMa.a(k, "Cannot return null from a non-@Nullable @Provides method");
        return k;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
