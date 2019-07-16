package defpackage;

import android.content.SharedPreferences;

/* renamed from: jL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvideEventLoggerMonitorFactory */
public final class C3071jL implements C4961HMa<C7648wza<Boolean>> {
    private final C7054oVa<SharedPreferences> a;

    public C3071jL(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C3071jL a(C7054oVa<SharedPreferences> ova) {
        return new C3071jL(ova);
    }

    public static C7648wza<Boolean> a(SharedPreferences sharedPreferences) {
        C7648wza<Boolean> a2 = C2995fL.a(sharedPreferences);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7648wza<Boolean> get() {
        return a((SharedPreferences) this.a.get());
    }
}
