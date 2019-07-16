package defpackage;

import android.os.Bundle;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/policies/PolicySyncJob;", "Lcom/soundcloud/android/backgroundjobs/Syncer;", "policyOperations", "Lcom/soundcloud/android/policies/PolicyOperations;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "(Lcom/soundcloud/android/policies/PolicyOperations;Lcom/soundcloud/rx/eventbus/EventBus;)V", "createJobRequest", "Lcom/evernote/android/job/JobRequest$Builder;", "bundle", "Landroid/os/Bundle;", "sync", "Lcom/evernote/android/job/Job$Result;", "jobParamsHolder", "Lcom/soundcloud/android/backgroundjobs/JobParamsHolder;", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: ota reason: default package and case insensitive filesystem */
/* compiled from: PolicySyncJob.kt */
public final class C7084ota implements C2453aS {
    public static final a a = new a(null);
    private final C6334dta b;
    private final C5327TLa c;

    /* renamed from: ota$a */
    /* compiled from: PolicySyncJob.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C7084ota(C6334dta dta, C5327TLa tLa) {
        C7471uYa.b(dta, "policyOperations");
        C7471uYa.b(tLa, "eventBus");
        this.b = dta;
        this.c = tLa;
    }

    public b a(C2267RR rr) {
        C7471uYa.b(rr, "jobParamsHolder");
        String str = "PolicySyncJob";
        if (this.b.d()) {
            SDb.a(str).a("Received policy update.. Continuing!", new Object[0]);
            C5327TLa tLa = this.c;
            C5443XLa<Naa> xLa = C3876taa.v;
            C7471uYa.a((Object) xLa, "EventQueue.POLICY_UPDATES");
            tLa.c(xLa, new Naa());
        } else {
            SDb.a(str).a("No policy update necessary", new Object[0]);
        }
        return b.SUCCESS;
    }

    public s.b a(Bundle bundle) {
        s.b bVar = new s.b(C2342VR.TRACK_POLICIES.name());
        bVar.b(TimeUnit.DAYS.toMillis(1), TimeUnit.HOURS.toMillis(4));
        bVar.a(d.CONNECTED);
        C7471uYa.a((Object) bVar, "JobRequest.Builder(Perio…st.NetworkType.CONNECTED)");
        return bVar;
    }
}
