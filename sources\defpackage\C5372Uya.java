package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: Uya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideIntroductoryOverlayPrefsFactory */
public final class C5372Uya implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C5372Uya(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C5372Uya a(C7054oVa<Context> ova) {
        return new C5372Uya(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences p = C7853zya.p(context);
        C5023JMa.a(p, "Cannot return null from a non-@Nullable @Provides method");
        return p;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
