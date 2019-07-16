package com.soundcloud.android.periodic;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.soundcloud.android.offline.Ec;

/* compiled from: OfflineAuditWorker.kt */
public final class e {
    private final Ec a;

    public e(Ec ec) {
        C7471uYa.b(ec, "offlineAuditor");
        this.a = ec;
    }

    public final ListenableWorker a(Context context, WorkerParameters workerParameters) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(workerParameters, "workerParameters");
        return new OfflineAuditWorker(context, workerParameters, this.a);
    }
}
