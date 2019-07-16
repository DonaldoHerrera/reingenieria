package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Pya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideDeviceManagementPrefsFactory */
public final class C5224Pya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5224Pya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5224Pya a(C7054oVa<Context> ova) {
        return new C5224Pya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences l = C7853zya.l(context);
        C5023JMa.a(l, "Cannot return null from a non-@Nullable @Provides method");
        return l;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
