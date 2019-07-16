package defpackage;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import androidx.work.c;
import androidx.work.f;
import androidx.work.j;
import androidx.work.n;
import androidx.work.r;
import com.soundcloud.android.periodic.ApiConfigurationSyncWorker;
import com.soundcloud.android.periodic.DatabaseCleanupWorker;
import com.soundcloud.android.periodic.OfflineAuditWorker;
import com.soundcloud.android.periodic.RemoteConfigSyncWorker;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.o;
import java.util.concurrent.TimeUnit;

/* renamed from: pQ reason: default package and case insensitive filesystem */
/* compiled from: PeriodicWorkScheduler.kt */
public final class C3200pQ {
    @SuppressLint({"NewApi"})
    private final c a;
    private final c b;
    private final r c;
    private final a d;

    public C3200pQ(r rVar, a aVar) {
        C7471uYa.b(rVar, "workManager");
        C7471uYa.b(aVar, "appFeatures");
        this.c = rVar;
        this.d = aVar;
        c.a aVar2 = new c.a();
        aVar2.c(true);
        c a2 = aVar2.a();
        C7471uYa.a((Object) a2, "Constraints.Builder()\n  …oking at\n        .build()");
        this.a = a2;
        c.a aVar3 = new c.a();
        aVar3.a(j.CONNECTED);
        c a3 = aVar3.a();
        C7471uYa.a((Object) a3, "Constraints\n        .Bui…NNECTED)\n        .build()");
        this.b = a3;
    }

    public final void a() {
        a(this, this.c, o.a, "offlineAuditor", OfflineAuditWorker.class, 24, 12, null, 32, null);
        a(this.c, o.a, "databaseCleanup", DatabaseCleanupWorker.class, 24, 12, this.a);
        a(this.c, o.a, "remoteConfigSync", RemoteConfigSyncWorker.class, 6, 2, this.b);
        a(this.c, o.a, "apiConfigurationSync", ApiConfigurationSyncWorker.class, 24, 12, this.b);
    }

    static /* synthetic */ void a(C3200pQ pQVar, r rVar, a aVar, String str, Class cls, long j, long j2, c cVar, int i, Object obj) {
        c cVar2;
        if ((i & 32) != 0) {
            c cVar3 = c.a;
            C7471uYa.a((Object) cVar3, "Constraints.NONE");
            cVar2 = cVar3;
        } else {
            cVar2 = cVar;
        }
        pQVar.a(rVar, aVar, str, cls, j, j2, cVar2);
    }

    private final <T extends ListenableWorker> void a(r rVar, a aVar, String str, Class<T> cls, long j, long j2, c cVar) {
        a aVar2 = aVar;
        if (this.d.a(aVar)) {
            a(rVar, str, cls, j, j2, cVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cancelling periodic work for ");
        Class<T> cls2 = cls;
        sb.append(cls);
        SDb.c(sb.toString(), new Object[0]);
        r rVar2 = rVar;
        String str2 = str;
        C7471uYa.a((Object) rVar.b(str), "cancelUniqueWork(uniqueWorkName)");
    }

    private final <T extends ListenableWorker> void a(r rVar, String str, Class<T> cls, long j, long j2, c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Scheduling periodic work for ");
        Class<T> cls2 = cls;
        sb.append(cls);
        sb.append(" every ");
        long j3 = j;
        sb.append(j3);
        sb.append(" hours with flex initerval of ");
        long j4 = j2;
        sb.append(j4);
        sb.append(" hours");
        SDb.c(sb.toString(), new Object[0]);
        f fVar = f.KEEP;
        TimeUnit timeUnit = TimeUnit.HOURS;
        n.a aVar = new n.a(cls, j3, timeUnit, j4, timeUnit);
        r rVar2 = rVar;
        String str2 = str;
        rVar.a(str, fVar, (n) ((n.a) aVar.a(cVar)).a());
    }
}
