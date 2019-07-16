package defpackage;

import android.os.Bundle;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.o;
import java.util.concurrent.TimeUnit;

/* renamed from: XT reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationSyncJob.kt */
public final class C2379XT implements C2453aS {
    private final C2288ST a;
    private final a b;

    public C2379XT(C2288ST st, a aVar) {
        C7471uYa.b(st, "configurationManager");
        C7471uYa.b(aVar, "appFeatures");
        this.a = st;
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
        s.b bVar = new s.b(C2342VR.CONFIGURATION.name());
        bVar.b(TimeUnit.DAYS.toMillis(1), TimeUnit.HOURS.toMillis(4));
        bVar.a(d.CONNECTED);
        C7471uYa.a((Object) bVar, "JobRequest.Builder(Perio…st.NetworkType.CONNECTED)");
        return bVar;
    }
}
