package com.soundcloud.android.sync;

/* compiled from: SyncSchedulerModule_ProvideSyncSchedulerFactory */
public final class ka implements C4961HMa<HPa> {
    private static final ka a = new ka();

    public static ka a() {
        return a;
    }

    public static HPa b() {
        HPa a2 = ja.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public HPa get() {
        return b();
    }
}
