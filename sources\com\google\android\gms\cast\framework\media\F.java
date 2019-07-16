package com.google.android.gms.cast.framework.media;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.r;

final class F extends BroadcastReceiver {
    private final /* synthetic */ MediaNotificationService a;

    F(MediaNotificationService mediaNotificationService) {
        this.a = mediaNotificationService;
    }

    public final void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        if (this.a.q.f()) {
            intent2.setFlags(603979776);
            pendingIntent = PendingIntent.getActivity(context, 1, intent2, 134217728);
        } else {
            r a2 = r.a((Context) this.a);
            a2.a(componentName);
            a2.a(intent2);
            pendingIntent = a2.a(1, 134217728);
        }
        try {
            pendingIntent.send(context, 1, new Intent().setFlags(268435456));
        } catch (CanceledException e) {
            MediaNotificationService.a.a(e, "Sending PendingIntent failed", new Object[0]);
        }
    }
}
