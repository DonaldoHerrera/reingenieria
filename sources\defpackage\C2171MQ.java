package defpackage;

import android.os.Bundle;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.o;
import java.util.concurrent.TimeUnit;

/* renamed from: MQ reason: default package and case insensitive filesystem */
/* compiled from: RemoteConfigSyncJob.kt */
public final class C2171MQ implements C2453aS {
    private final a a;

    public C2171MQ(a aVar) {
        C7471uYa.b(aVar, "appFeatures");
        this.a = aVar;
    }

    public b a(C2267RR rr) {
        C7471uYa.b(rr, "jobParamsHolder");
        return a();
    }

    private final b a() {
        if (this.a.a((a) o.a) || IVa.d(((IVa) this.a.e().b()).a())) {
            return b.SUCCESS;
        }
        return b.RESCHEDULE;
    }

    public s.b a(Bundle bundle) {
        s.b bVar = new s.b(C2342VR.REMOTE_CONFIG.name());
        bVar.b(TimeUnit.HOURS.toMillis(6), TimeUnit.HOURS.toMillis(2));
        bVar.a(d.CONNECTED);
        C7471uYa.a((Object) bVar, "JobRequest.Builder(Perio…st.NetworkType.CONNECTED)");
        return bVar;
    }
}
