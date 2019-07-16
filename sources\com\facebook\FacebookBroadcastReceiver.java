package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.Z;

public class FacebookBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: protected */
    public void a(String str, String str2, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void b(String str, String str2, Bundle bundle) {
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        if (stringExtra != null && stringExtra2 != null) {
            Bundle extras = intent.getExtras();
            if (Z.e(intent)) {
                a(stringExtra, stringExtra2, extras);
            } else {
                b(stringExtra, stringExtra2, extras);
            }
        }
    }
}
