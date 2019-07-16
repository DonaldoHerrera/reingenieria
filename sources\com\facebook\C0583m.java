package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.m reason: case insensitive filesystem */
/* compiled from: CustomTabMainActivity */
class C0583m extends BroadcastReceiver {
    final /* synthetic */ CustomTabMainActivity a;

    C0583m(CustomTabMainActivity customTabMainActivity) {
        this.a = customTabMainActivity;
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent(this.a, CustomTabMainActivity.class);
        intent2.setAction(CustomTabMainActivity.d);
        String str = CustomTabMainActivity.c;
        intent2.putExtra(str, intent.getStringExtra(str));
        intent2.addFlags(603979776);
        this.a.startActivity(intent2);
    }
}
