package com.soundcloud.android.sync;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

/* compiled from: SyncSchedulerModule */
public class ja {

    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: SyncSchedulerModule */
    public @interface a {
    }

    static /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "SyncerCoordinatorThread");
    }

    @a
    static HPa a() {
        return C6645iVa.a(Executors.newSingleThreadExecutor(C6126i.a));
    }
}
