package com.soundcloud.android.offline;

import android.content.Context;
import android.os.Bundle;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/offline/OfflineContentRetryJob;", "Lcom/soundcloud/android/backgroundjobs/Syncer;", "context", "Landroid/content/Context;", "dateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "downloadConnectionHelper", "Lcom/soundcloud/android/offline/DownloadConnectionHelper;", "(Landroid/content/Context;Lcom/soundcloud/android/utilities/android/date/DateProvider;Lcom/soundcloud/android/offline/DownloadConnectionHelper;)V", "createJobRequest", "Lcom/evernote/android/job/JobRequest$Builder;", "bundle", "Landroid/os/Bundle;", "sync", "Lcom/evernote/android/job/Job$Result;", "jobParamsHolder", "Lcom/soundcloud/android/backgroundjobs/JobParamsHolder;", "inTwoHours", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: OfflineContentRetryJob.kt */
public final class Cd implements C2453aS {
    public static final a a = new a(null);
    private final Context b;
    private final C5694cGa c;
    private final Lb d;

    /* compiled from: OfflineContentRetryJob.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Cd(Context context, C5694cGa cga, Lb lb) {
        C7471uYa.b(context, "context");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(lb, "downloadConnectionHelper");
        this.b = context;
        this.c = cga;
        this.d = lb;
    }

    public b a(C2267RR rr) {
        C7471uYa.b(rr, "jobParamsHolder");
        OfflineContentService.b(this.b);
        return b.SUCCESS;
    }

    public s.b a(Bundle bundle) {
        d dVar;
        if (bundle == null || !bundle.getBoolean("BUNDLE_FOR_CLEANUP", false)) {
            dVar = this.d.a();
        } else {
            dVar = d.ANY;
        }
        s.b bVar = new s.b(C2286SR.RETRY_OFFLINE_SYNC.name());
        bVar.a(dVar);
        bVar.a(true);
        bVar.f(true);
        bVar.a(this.c.a(), a(this.c));
        C7471uYa.a((Object) bVar, "JobRequest.Builder(JobTy…ateProvider.inTwoHours())");
        return bVar;
    }

    private final long a(C5694cGa cga) {
        return cga.a() + TimeUnit.MILLISECONDS.convert(2, TimeUnit.HOURS);
    }
}
