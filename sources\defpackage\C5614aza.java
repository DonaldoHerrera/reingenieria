package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideOfflinePrefsFactory */
public final class C5614aza implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5614aza(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5614aza a(C7054oVa<Context> ova) {
        return new C5614aza(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences w = C7853zya.w(context);
        C5023JMa.a(w, "Cannot return null from a non-@Nullable @Provides method");
        return w;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
