package com.appboy;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.n;

public final class AppboyGcmReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(AppboyGcmReceiver.class);

    public class a extends AsyncTask<Void, Void, Void> {
        private final Context a;
        private final Intent b;

        public a(Context context, Intent intent) {
            this.a = context;
            this.b = intent;
            execute(new Void[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                AppboyGcmReceiver.this.a(this.a, this.b);
            } catch (Exception e) {
                Hg.b(AppboyGcmReceiver.a, "Failed to create and display notification.", e);
            }
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(Context context, Intent intent) {
        if (Eg.a(intent)) {
            new a(context, intent);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean c(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("error");
        String stringExtra2 = intent.getStringExtra("registration_id");
        if (stringExtra != null) {
            if ("SERVICE_NOT_AVAILABLE".equals(stringExtra)) {
                Log.e(a, "Unable to connect to the GCM registration server. Try again later.");
            } else if ("ACCOUNT_MISSING".equals(stringExtra)) {
                Log.e(a, "No Google account found on the phone. For pre-3.0 devices, a Google account is required on the device.");
            } else if ("AUTHENTICATION_FAILED".equals(stringExtra)) {
                Log.e(a, "Unable to authenticate Google account. For Android versions <4.0.4, a valid Google Play account is required for Google Cloud Messaging to function. This phone will be unable to receive Google Cloud Messages until the user logs in with a valid Google Play account or upgrades the operating system on this device.");
            } else if ("INVALID_SENDER".equals(stringExtra)) {
                Log.e(a, "One or multiple of the sender IDs provided are invalid.");
            } else if ("PHONE_REGISTRATION_ERROR".equals(stringExtra)) {
                Log.e(a, "Device does not support GCM.");
            } else if ("INVALID_PARAMETERS".equals(stringExtra)) {
                Log.e(a, "The request sent by the device does not contain the expected parameters. This phone does not currently support GCM.");
            } else {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Received an unrecognised GCM registration error type. Ignoring. Error: ");
                sb.append(stringExtra);
                Hg.e(str, sb.toString());
            }
        } else if (stringExtra2 != null) {
            h.a(context).d(stringExtra2);
        } else if (intent.hasExtra("unregistered")) {
            Hg.e(a, "The device was un-registered from GCM.");
        } else {
            Hg.e(a, "The GCM registration message is missing error information, registration id, and unregistration confirmation. Ignoring.");
            return false;
        }
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received broadcast message. Message: ");
        sb.append(intent.toString());
        Hg.c(str, sb.toString());
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            a(new Bf(context), context, intent);
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
            b(context, intent);
        } else if ("com.appboy.action.CANCEL_NOTIFICATION".equals(action)) {
            Eg.a(context, intent);
        } else if ("com.appboy.action.APPBOY_ACTION_CLICKED".equals(action)) {
            Ag.a(context, intent);
        } else if ("com.appboy.action.APPBOY_PUSH_CLICKED".equals(action)) {
            Eg.b(context, intent);
        } else {
            Hg.e(a, "The GCM receiver received a message not sent from Appboy. Ignoring the message.");
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Context context, Intent intent) {
        n a2 = n.a(context);
        if ("deleted_messages".equals(intent.getStringExtra("message_type"))) {
            int intExtra = intent.getIntExtra("total_deleted", -1);
            if (intExtra == -1) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse GCM message. Intent: ");
                sb.append(intent.toString());
                Log.e(str, sb.toString());
            } else {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GCM deleted ");
                sb2.append(intExtra);
                sb2.append(" messages. Fetch them from Appboy.");
                Hg.c(str2, sb2.toString());
            }
            return false;
        }
        Bundle extras = intent.getExtras();
        String str3 = a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Push message payload received: ");
        sb3.append(extras);
        Hg.c(str3, sb3.toString());
        Bundle a3 = Eg.a(extras);
        extras.putBundle("extra", a3);
        if (Eg.b(intent)) {
            Hg.a(a, "Received notification push");
            int b = Eg.b(extras);
            extras.putInt("nid", b);
            Notification a4 = Eg.a().a(new Bf(context), context, extras, a3);
            if (a4 == null) {
                Hg.a(a, "Notification created by notification factory was null. Not displaying notification.");
                return false;
            }
            a2.a("appboy_notification", b, a4);
            Eg.b(context, extras);
            Eg.c(context, extras);
            if (extras != null) {
                String str4 = "nd";
                if (extras.containsKey(str4)) {
                    Eg.a(context, AppboyGcmReceiver.class, b, Integer.parseInt(extras.getString(str4)));
                }
            }
            return true;
        }
        Hg.a(a, "Received data push");
        Eg.b(context, extras);
        Eg.a(context, extras);
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Bf bf, Context context, Intent intent) {
        if (!bf.B()) {
            return false;
        }
        c(context, intent);
        return true;
    }
}
