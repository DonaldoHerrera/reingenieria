package com.evernote.android.job.v14;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.evernote.android.job.n.a;

public class PlatformAlarmReceiver extends BroadcastReceiver {
    static Intent a(Context context, int i, boolean z, Bundle bundle) {
        Intent putExtra = new Intent(context, PlatformAlarmReceiver.class).putExtra("EXTRA_JOB_ID", i).putExtra("EXTRA_JOB_EXACT", z);
        if (bundle != null) {
            putExtra.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        return putExtra;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String str = "EXTRA_JOB_ID";
            if (intent.hasExtra(str)) {
                String str2 = "EXTRA_JOB_EXACT";
                if (intent.hasExtra(str2)) {
                    int intExtra = intent.getIntExtra(str, -1);
                    Bundle bundleExtra = intent.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
                    if (intent.getBooleanExtra(str2, false)) {
                        a.a(context, PlatformAlarmServiceExact.a(context, intExtra, bundleExtra));
                    } else {
                        PlatformAlarmService.a(context, intExtra, bundleExtra);
                    }
                }
            }
        }
    }
}
