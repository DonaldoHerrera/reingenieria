package com.soundcloud.android.periodic;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* compiled from: ApiConfigurationSyncWorker.kt */
public final class a {
    private final C2288ST a;

    public a(C2288ST st) {
        C7471uYa.b(st, "configurationManager");
        this.a = st;
    }

    public final ListenableWorker a(Context context, WorkerParameters workerParameters) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(workerParameters, "workerParameters");
        return new ApiConfigurationSyncWorker(context, workerParameters, this.a);
    }
}
