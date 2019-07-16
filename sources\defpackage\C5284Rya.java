package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Rya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideFeaturePrefsFactory */
public final class C5284Rya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C2041FV> b;

    public C5284Rya(C7054oVa<Context> ova, C7054oVa<C2041FV> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5284Rya a(C7054oVa<Context> ova, C7054oVa<C2041FV> ova2) {
        return new C5284Rya(ova, ova2);
    }

    public static SharedPreferences a(Context context, C2041FV fv) {
        SharedPreferences a2 = C7853zya.a(context, fv);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get(), (C2041FV) this.b.get());
    }
}
