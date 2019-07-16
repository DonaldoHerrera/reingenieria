package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzx;

public final class Cb {
    private final Eb a;

    public Cb(Eb eb) {
        Preconditions.checkNotNull(eb);
        this.a = eb;
    }

    public static boolean a(Context context) {
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        Mb a2 = Mb.a(context, (zzx) null);
        C1124ib e = a2.e();
        if (intent == null) {
            e.v().a("Receiver called with null intent");
            return;
        }
        a2.a();
        String action = intent.getAction();
        e.A().a("Local receiver got", action);
        String str = "com.google.android.gms.measurement.UPLOAD";
        if (str.equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction(str);
            e.A().a("Starting wakeful intent.");
            this.a.a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a2.d().a((Runnable) new Bb(this, a2, e));
            } catch (Exception e2) {
                e.v().a("Install Referrer Reporter encountered a problem", e2);
            }
            PendingResult a3 = this.a.a();
            String stringExtra = intent.getStringExtra(Constants.REFERRER);
            if (stringExtra == null) {
                e.A().a("Install referrer extras are null");
                if (a3 != null) {
                    a3.finish();
                }
                return;
            }
            e.y().a("Install referrer extras are", stringExtra);
            String str2 = "?";
            if (!stringExtra.contains(str2)) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            Bundle a4 = a2.F().a(Uri.parse(stringExtra));
            if (a4 == null) {
                e.A().a("No campaign defined in install referrer broadcast");
                if (a3 != null) {
                    a3.finish();
                }
            } else {
                long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
                if (longExtra == 0) {
                    e.v().a("Install referrer is missing timestamp");
                }
                Gb d = a2.d();
                Fb fb = new Fb(this, a2, longExtra, a4, context, e, a3);
                d.a((Runnable) fb);
            }
        }
    }
}
