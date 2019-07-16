package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.adjust.sdk.Constants;

public final class CampaignTrackingReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str = Constants.REFERRER;
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null && stringExtra.startsWith("fb")) {
            C1237dk.a(intent.getStringExtra(str));
        }
    }
}
