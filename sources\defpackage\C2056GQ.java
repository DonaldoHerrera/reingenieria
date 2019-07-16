package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: GQ reason: default package and case insensitive filesystem */
/* compiled from: AppFeaturesModule_ProvidesAppFeaturesPrefsFactory */
public final class C2056GQ implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public C2056GQ(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C2056GQ a(C7054oVa<Context> ova) {
        return new C2056GQ(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences a2 = C2016EQ.a(context);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
