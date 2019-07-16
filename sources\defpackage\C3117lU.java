package defpackage;

import android.os.Bundle;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/configuration/OneShotConfigurationSyncJob;", "Lcom/soundcloud/android/backgroundjobs/Syncer;", "configurationManager", "Lcom/soundcloud/android/configuration/ConfigurationManager;", "(Lcom/soundcloud/android/configuration/ConfigurationManager;)V", "createJobRequest", "Lcom/evernote/android/job/JobRequest$Builder;", "bundle", "Landroid/os/Bundle;", "handleApiRequestException", "Lcom/evernote/android/job/Job$Result;", "exception", "Lcom/soundcloud/android/libs/api/ApiRequestException;", "sync", "jobParamsHolder", "Lcom/soundcloud/android/backgroundjobs/JobParamsHolder;", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: lU reason: default package and case insensitive filesystem */
/* compiled from: OneShotConfigurationSyncJob.kt */
public final class C3117lU implements C2453aS {
    private static final long a = TimeUnit.MINUTES.toMillis((long) (new Random().nextInt(5) + 5));
    public static final a b = new a(null);
    private final C2288ST c;

    /* renamed from: lU$a */
    /* compiled from: OneShotConfigurationSyncJob.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3117lU(C2288ST st) {
        C7471uYa.b(st, "configurationManager");
        this.c = st;
    }

    public b a(C2267RR rr) {
        C7471uYa.b(rr, "jobParamsHolder");
        try {
            this.c.a();
            return b.SUCCESS;
        } catch (Exception e) {
            if (e instanceof ifa) {
                return a((ifa) e);
            }
            return b.FAILURE;
        }
    }

    private final b a(ifa ifa) {
        defpackage.ifa.a j = ifa.j();
        if (j != null) {
            int i = C3136mU.a[j.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return b.RESCHEDULE;
            }
        }
        return b.FAILURE;
    }

    public s.b a(Bundle bundle) {
        s.b bVar = new s.b(C2286SR.CONFIGURATION_SYNC.name());
        bVar.f(true);
        bVar.a(TimeUnit.SECONDS.toMillis(5), TimeUnit.HOURS.toMillis(24));
        bVar.a(a, com.evernote.android.job.s.a.EXPONENTIAL);
        bVar.a(d.CONNECTED);
        C7471uYa.a((Object) bVar, "JobRequest.Builder(JobTy…st.NetworkType.CONNECTED)");
        return bVar;
    }
}
