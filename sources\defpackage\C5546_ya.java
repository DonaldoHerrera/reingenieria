package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: _ya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideOfflineContentPrefsFactory */
public final class C5546_ya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5546_ya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5546_ya a(C7054oVa<Context> ova) {
        return new C5546_ya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences v = C7853zya.v(context);
        C5023JMa.a(v, "Cannot return null from a non-@Nullable @Provides method");
        return v;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
