package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Tya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideInAppUpdatesStorageFactory */
public final class C5343Tya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences o = C7853zya.o(context);
        C5023JMa.a(o, "Cannot return null from a non-@Nullable @Provides method");
        return o;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
