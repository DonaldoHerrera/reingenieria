package com.appboy.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Process;
import com.appboy.h;

public class AppboyDataSyncService extends IntentService {
    private static final String a = Hg.a(AppboyDataSyncService.class);

    public AppboyDataSyncService() {
        super(AppboyDataSyncService.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Process.setThreadPriority(10);
        if (intent == null) {
            Hg.e(a, "AppboyDataSyncService received null intent, doing nothing.");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            Hg.e(a, "AppboyDataSyncService received intent with null action, doing nothing.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(getApplicationContext().getPackageName());
            sb.append(".REQUEST_DATA_SYNC");
            if (action.contains(sb.toString())) {
                Hg.a(a, "AppboyDataSyncService requesting Appboy DataSync.");
                try {
                    h.a(getApplicationContext()).j();
                } catch (Exception unused) {
                    Hg.b(a, "DataSync service caught exception while requesting data flush");
                }
            } else {
                Hg.e(a, "AppboyDataSyncService received unknown intent, doing nothing.");
            }
        }
    }
}
