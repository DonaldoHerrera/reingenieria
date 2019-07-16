package com.soundcloud.android.offline;

import android.os.Bundle;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.o;
import java.util.concurrent.TimeUnit;

/* renamed from: com.soundcloud.android.offline.zc reason: case insensitive filesystem */
/* compiled from: OfflineAuditJob.kt */
public final class C4201zc implements C2453aS {
    private final Ec a;
    private final a b;

    public C4201zc(Ec ec, a aVar) {
        C7471uYa.b(ec, "offlineAuditor");
        C7471uYa.b(aVar, "appFeatures");
        this.a = ec;
        this.b = aVar;
    }

    public b a(C2267RR rr) {
        C7471uYa.b(rr, "jobParamsHolder");
        if (!this.b.a((a) o.a)) {
            this.a.a();
        }
        return b.SUCCESS;
    }

    public s.b a(Bundle bundle) {
        s.b bVar = new s.b(C2342VR.OFFLINE_AUDIT.name());
        bVar.a(d.ANY);
        bVar.f(true);
        bVar.b(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS), TimeUnit.HOURS.toMillis(1));
        C7471uYa.a((Object) bVar, "JobRequest.Builder(Perio…meUnit.HOURS.toMillis(1))");
        return bVar;
    }
}
