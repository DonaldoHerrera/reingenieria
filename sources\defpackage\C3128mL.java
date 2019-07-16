package defpackage;

import android.content.SharedPreferences;

/* renamed from: mL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvideFlushEventLoggerInstantlySettingFactory */
public final class C3128mL implements C4961HMa<C7648wza<Boolean>> {
    private final C7054oVa<SharedPreferences> a;

    public C3128mL(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C3128mL a(C7054oVa<SharedPreferences> ova) {
        return new C3128mL(ova);
    }

    public static C7648wza<Boolean> a(SharedPreferences sharedPreferences) {
        C7648wza<Boolean> c = C2995fL.c(sharedPreferences);
        C5023JMa.a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public C7648wza<Boolean> get() {
        return a((SharedPreferences) this.a.get());
    }
}
