package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Nya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideDefaultHomeScreenStatePrefsFactory */
public final class C5164Nya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences j = C7853zya.j(context);
        C5023JMa.a(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
