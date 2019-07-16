package defpackage;

import android.content.SharedPreferences;

/* renamed from: kL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvideEventLoggerMuteFactory */
public final class C3090kL implements C4961HMa<C7648wza<Boolean>> {
    private final C7054oVa<SharedPreferences> a;

    public C3090kL(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C3090kL a(C7054oVa<SharedPreferences> ova) {
        return new C3090kL(ova);
    }

    public static C7648wza<Boolean> a(SharedPreferences sharedPreferences) {
        C7648wza<Boolean> b = C2995fL.b(sharedPreferences);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C7648wza<Boolean> get() {
        return a((SharedPreferences) this.a.get());
    }
}
