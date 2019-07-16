package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.soundcloud.android.periodic.ApiConfigurationSyncWorker;
import com.soundcloud.android.periodic.DatabaseCleanupWorker;
import com.soundcloud.android.periodic.OfflineAuditWorker;
import com.soundcloud.android.periodic.RemoteConfigSyncWorker;
import com.soundcloud.android.periodic.a;
import com.soundcloud.android.periodic.c;
import com.soundcloud.android.periodic.e;
import com.soundcloud.android.periodic.j;

/* renamed from: nQ reason: default package and case insensitive filesystem */
/* compiled from: DaggerWorkerFactory.kt */
public final class C3152nQ {
    private final e a;
    private final c b;
    private final j c;
    private final a d;

    public C3152nQ(e eVar, c cVar, j jVar, a aVar) {
        C7471uYa.b(eVar, "offlineAuditWorkerFactory");
        C7471uYa.b(cVar, "databaseCleanupWorkerFactory");
        C7471uYa.b(jVar, "remoteConfigSyncWorkerFactory");
        C7471uYa.b(aVar, "apiConfigurationSyncWorkerFactory");
        this.a = eVar;
        this.b = cVar;
        this.c = jVar;
        this.d = aVar;
    }

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(str, "workerClassName");
        C7471uYa.b(workerParameters, "workerParameters");
        if (Class.forName(str).isAssignableFrom(OfflineAuditWorker.class)) {
            return this.a.a(context, workerParameters);
        }
        if (Class.forName(str).isAssignableFrom(DatabaseCleanupWorker.class)) {
            return this.b.a(context, workerParameters);
        }
        if (Class.forName(str).isAssignableFrom(RemoteConfigSyncWorker.class)) {
            return this.c.a(context, workerParameters);
        }
        if (Class.forName(str).isAssignableFrom(ApiConfigurationSyncWorker.class)) {
            return this.d.a(context, workerParameters);
        }
        return null;
    }
}
