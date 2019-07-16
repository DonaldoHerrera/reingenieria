package defpackage;

import android.os.Bundle;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.o;
import java.util.concurrent.TimeUnit;

/* renamed from: lya reason: default package and case insensitive filesystem */
/* compiled from: DatabaseCleanupJob.kt */
public final class C6888lya implements C2453aS {
    private final C5680bya a;
    private final a b;

    public C6888lya(C5680bya bya, a aVar) {
        C7471uYa.b(bya, "databaseCleanupController");
        C7471uYa.b(aVar, "appFeatures");
        this.a = bya;
        this.b = aVar;
    }

    public b a(C2267RR rr) {
        C7471uYa.b(rr, "jobParamsHolder");
        if (!this.b.a((a) o.a)) {
            this.a.e();
        }
        return b.SUCCESS;
    }

    public s.b a(Bundle bundle) {
        s.b bVar = new s.b(C2342VR.DATABASE_CLEANUP.name());
        bVar.b(TimeUnit.DAYS.toMillis(1), TimeUnit.HOURS.toMillis(1));
        bVar.c(true);
        C7471uYa.a((Object) bVar, "JobRequest.Builder(Perio…setRequiresCharging(true)");
        return bVar;
    }
}
