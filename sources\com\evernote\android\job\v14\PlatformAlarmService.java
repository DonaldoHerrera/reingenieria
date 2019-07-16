package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeJobIntentService;
import com.evernote.android.job.n.a;
import com.evernote.android.job.s;

public final class PlatformAlarmService extends SafeJobIntentService {
    private static final Dj j = new Dj("PlatformAlarmService");

    public static void a(Context context, int i, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_JOB_ID", i);
        if (bundle != null) {
            intent.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        JobIntentService.a(context, PlatformAlarmService.class, 2147480001, intent);
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        a(intent, (Service) this, j);
    }

    static void a(Intent intent, Service service, Dj dj) {
        if (intent == null) {
            dj.c("Delivered intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_JOB_ID", -1);
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
        a aVar = new a(service, dj, intExtra);
        s a = aVar.a(true, true);
        if (a != null) {
            aVar.a(a, bundleExtra);
        }
    }
}
