package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Hya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideCollectionsPrefsFactory */
public final class C4978Hya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C4978Hya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C4978Hya a(C7054oVa<Context> ova) {
        return new C4978Hya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences h = C7853zya.h(context);
        C5023JMa.a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
