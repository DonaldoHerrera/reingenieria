package com.soundcloud.android.periodic;

import android.content.Context;
import androidx.work.ListenableWorker.a;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.soundcloud.android.offline.Ec;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/periodic/OfflineAuditWorker;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "offlineAuditor", "Lcom/soundcloud/android/offline/OfflineAuditor;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/soundcloud/android/offline/OfflineAuditor;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "periodicjobs_release"}, mv = {1, 1, 15})
/* compiled from: OfflineAuditWorker.kt */
public final class OfflineAuditWorker extends Worker {
    private final Ec f;

    public OfflineAuditWorker(Context context, WorkerParameters workerParameters, Ec ec) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(workerParameters, "workerParams");
        C7471uYa.b(ec, "offlineAuditor");
        super(context, workerParameters);
        this.f = ec;
    }

    public a m() {
        this.f.a();
        a c = a.c();
        C7471uYa.a((Object) c, "Result.success()");
        return c;
    }
}
