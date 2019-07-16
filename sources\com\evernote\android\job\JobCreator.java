package com.evernote.android.job;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public interface JobCreator {

    public static abstract class AddJobCreatorReceiver extends BroadcastReceiver {
        /* access modifiers changed from: protected */
        public abstract void a(Context context, l lVar);

        public final void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                if ("com.evernote.android.job.ADD_JOB_CREATOR".equals(intent.getAction())) {
                    try {
                        a(context, l.a(context));
                    } catch (m unused) {
                    }
                }
            }
        }
    }

    c a(String str);
}
