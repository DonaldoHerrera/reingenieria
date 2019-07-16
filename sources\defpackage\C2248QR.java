package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.evernote.android.job.JobCreator;
import com.evernote.android.job.e;
import com.evernote.android.job.g;
import com.evernote.android.job.l;
import com.evernote.android.job.s;
import com.evernote.android.job.s.b;
import com.evernote.android.job.s.d;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u001c\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\u001c\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00172\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0019H\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/backgroundjobs/BackgroundJobManager;", "", "context", "Landroid/content/Context;", "periodicJobs", "Lcom/soundcloud/android/backgroundjobs/PeriodicJobsHolder;", "oneShotJobs", "Lcom/soundcloud/android/backgroundjobs/JobsHolder;", "(Landroid/content/Context;Lcom/soundcloud/android/backgroundjobs/PeriodicJobsHolder;Lcom/soundcloud/android/backgroundjobs/JobsHolder;)V", "cancelAll", "", "cancelAllForJob", "tag", "Lcom/soundcloud/android/backgroundjobs/JobType;", "cancelJob", "id", "", "init", "schedule", "jobType", "bundle", "Landroid/os/Bundle;", "scheduleImmediately", "Lcom/soundcloud/android/backgroundjobs/PeriodicJobType;", "withImmediateSuffix", "", "Companion", "backgroundjobs_release"}, mv = {1, 1, 15})
/* renamed from: QR reason: default package and case insensitive filesystem */
/* compiled from: BackgroundJobManager.kt */
public class C2248QR {
    public static final a a = new a(null);
    private final C2360WR b;
    private final C2305TR c;

    /* renamed from: QR$a */
    /* compiled from: BackgroundJobManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C2248QR(Context context, C2360WR wr, C2305TR tr) {
        C7471uYa.b(context, "context");
        C7471uYa.b(wr, "periodicJobs");
        C7471uYa.b(tr, "oneShotJobs");
        this.b = wr;
        this.c = tr;
        l.a(context);
    }

    public void a() {
        l g = l.g();
        g.a(50, TimeUnit.MILLISECONDS);
        g.a(e.WORK_MANAGER, false);
        C2378XR xr = new C2378XR(this.b, "-immediate");
        g.a((JobCreator) xr);
        g.a((JobCreator) new C2324UR(this.c));
        xr.a();
    }

    public void b(C2286SR sr) {
        a(this, sr, (Bundle) null, 2, (Object) null);
    }

    public static /* synthetic */ void a(C2248QR qr, C2286SR sr, Bundle bundle, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            qr.a(sr, bundle);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedule");
    }

    public void a(C2286SR sr, Bundle bundle) {
        C7471uYa.b(sr, "jobType");
        Object obj = this.c.a().get(sr);
        if (obj != null) {
            ((C2472bS) obj).a().a(bundle).a().F();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sr.name());
        sb.append(" not found in the registered jobs");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void a(C2248QR qr, C2342VR vr, Bundle bundle, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            qr.a(vr, bundle);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scheduleImmediately");
    }

    public void a(C2342VR vr, Bundle bundle) {
        C7471uYa.b(vr, "jobType");
        Object obj = this.b.a().get(vr);
        if (obj != null) {
            s a2 = ((C2472bS) obj).a().a(bundle).a();
            b bVar = new b(a(vr.name()));
            C7471uYa.a((Object) a2, "defaultJobRequest");
            bVar.f(a2.x());
            bVar.a(a2.c(), a2.d());
            bVar.a(a2.f());
            bVar.a(a2.q());
            bVar.a(d.ANY);
            bVar.a(false);
            bVar.b(false);
            bVar.c(false);
            bVar.d(false);
            bVar.e(false);
            bVar.b();
            bVar.a().F();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(vr.name());
        sb.append(" not found in the registered jobs");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-immediate");
        return sb.toString();
    }

    public void a(C2286SR sr) {
        C7471uYa.b(sr, "tag");
        l.g().a(sr.name());
    }
}
