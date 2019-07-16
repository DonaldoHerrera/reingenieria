package com.evernote.android.job;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class JobBootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            l.a(context);
        } catch (m unused) {
        }
    }
}
