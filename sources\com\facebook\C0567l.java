package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.l reason: case insensitive filesystem */
/* compiled from: CustomTabActivity */
class C0567l extends BroadcastReceiver {
    final /* synthetic */ CustomTabActivity a;

    C0567l(CustomTabActivity customTabActivity) {
        this.a = customTabActivity;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.finish();
    }
}
