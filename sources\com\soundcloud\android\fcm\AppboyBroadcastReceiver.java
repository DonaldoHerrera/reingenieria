package com.soundcloud.android.fcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.r;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.main.ha;

public class AppboyBroadcastReceiver extends BroadcastReceiver {
    private static final String a = C5292SGa.a();
    private static final String b;
    private static final String c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".intent.APPBOY_NOTIFICATION_OPENED");
        b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(".intent.APPBOY_PUSH_RECEIVED");
        c = sb2.toString();
    }

    private void a(Context context, Intent intent) {
        Bundle b2 = b(intent);
        if (intent.getStringExtra("uri") != null) {
            a(context, intent, b2);
        } else {
            b(context, b2);
        }
    }

    private void b(Context context, Bundle bundle) {
        Intent a2 = a(context, bundle);
        a(a2);
        context.startActivity(a2);
    }

    private void c(Intent intent) {
        String str = "AppboyBroadcastReceiver";
        SDb.a(str).a("Received push notification.", new Object[0]);
        if (Eg.d(intent.getExtras())) {
            SDb.a(str).a("Got uninstall tracking push", new Object[0]);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (c.equals(action)) {
            c(intent);
        } else if (b.equals(action)) {
            a(context, intent);
        }
    }

    private Bundle b(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        String str = "cid";
        bundleExtra.putString(str, intent.getStringExtra(str));
        bundleExtra.putString("source", "Appboy");
        return bundleExtra;
    }

    private void a(Intent intent) {
        C3235rM.APPBOY_NOTIFICATION.a(intent);
        ha.a(Yca.NOTIFICATION, intent);
    }

    private void a(Context context, Intent intent, Bundle bundle) {
        r a2 = r.a(context);
        a2.a(a(context, bundle));
        a2.a(a(intent, bundle));
        a2.a(bundle);
    }

    private Intent a(Intent intent, Bundle bundle) {
        Intent putExtras = new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("uri"))).putExtras(bundle);
        a(putExtras);
        return putExtras;
    }

    private Intent a(Context context, Bundle bundle) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(872415232);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }
}
