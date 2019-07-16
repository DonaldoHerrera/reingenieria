package com.soundcloud.android.periodic;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.properties.a;

/* compiled from: RemoteConfigSyncWorker.kt */
public final class j {
    private final a a;
    private final C3700b b;

    public j(a aVar, C3700b bVar) {
        C7471uYa.b(aVar, "appFeatures");
        C7471uYa.b(bVar, "analytics");
        this.a = aVar;
        this.b = bVar;
    }

    public final ListenableWorker a(Context context, WorkerParameters workerParameters) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(workerParameters, "workerParameters");
        return new RemoteConfigSyncWorker(context, workerParameters, this.b, this.a);
    }
}
