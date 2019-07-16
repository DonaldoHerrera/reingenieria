package com.soundcloud.android.periodic;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* compiled from: DatabaseCleanupWorker.kt */
public final class c {
    private final C5680bya a;

    public c(C5680bya bya) {
        C7471uYa.b(bya, "databaseCleanupController");
        this.a = bya;
    }

    public final ListenableWorker a(Context context, WorkerParameters workerParameters) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(workerParameters, "workerParameters");
        return new DatabaseCleanupWorker(context, workerParameters, this.a);
    }
}
