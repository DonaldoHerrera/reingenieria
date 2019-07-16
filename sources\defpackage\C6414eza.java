package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: eza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvidePolicyPrefsFactory */
public final class C6414eza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences A = C7853zya.A(context);
        C5023JMa.a(A, "Cannot return null from a non-@Nullable @Provides method");
        return A;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
