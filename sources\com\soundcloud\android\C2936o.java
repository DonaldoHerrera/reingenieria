package com.soundcloud.android;

/* renamed from: com.soundcloud.android.o reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideAndroidMainThreadSchedulerFactory */
public final class C2936o implements C4961HMa<HPa> {
    private static final C2936o a = new C2936o();

    public static C2936o a() {
        return a;
    }

    public static HPa b() {
        HPa a2 = C2933l.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public HPa get() {
        return b();
    }
}
