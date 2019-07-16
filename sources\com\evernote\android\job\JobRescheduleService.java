package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeJobIntentService;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public final class JobRescheduleService extends SafeJobIntentService {
    private static final Dj j = new Dj("JobRescheduleService", false);
    static CountDownLatch k;

    static void a(Context context) {
        try {
            JobIntentService.a(context, JobRescheduleService.class, 2147480000, new Intent());
            k = new CountDownLatch(1);
        } catch (Exception e) {
            j.a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        try {
            j.a("Reschedule service started");
            SystemClock.sleep(g.d());
            try {
                l a = l.a((Context) this);
                Set a2 = a.a(null, true, true);
                j.a("Reschedule %d jobs of %d jobs", Integer.valueOf(a(a, a2)), Integer.valueOf(a2.size()));
            } catch (Exception unused) {
                CountDownLatch countDownLatch = k;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        } finally {
            CountDownLatch countDownLatch2 = k;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(l lVar, Collection<s> collection) {
        int i = 0;
        boolean z = false;
        for (s sVar : collection) {
            boolean z2 = sVar.v() ? lVar.b(sVar.k()) == null : !lVar.a(sVar.j()).b(sVar);
            if (z2) {
                try {
                    sVar.b().a().E();
                } catch (Exception e) {
                    if (!z) {
                        j.a((Throwable) e);
                        z = true;
                    }
                }
                i++;
            }
        }
        return i;
    }
}
