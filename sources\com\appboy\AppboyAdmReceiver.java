package com.appboy;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

public final class AppboyAdmReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(AppboyAdmReceiver.class);

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
                AppboyAdmReceiver.this.a(this.a, this.b);
            } catch (Exception e) {
                Hg.b(AppboyAdmReceiver.a, "Failed to create and display notification.", e);
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
        String stringExtra3 = intent.getStringExtra("unregistered");
        if (stringExtra != null) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error during ADM registration: ");
            sb.append(stringExtra);
            Hg.b(str, sb.toString());
        } else if (stringExtra2 != null) {
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Registering for ADM messages with registrationId: ");
            sb2.append(stringExtra2);
            Hg.c(str2, sb2.toString());
            h.a(context).d(stringExtra2);
        } else if (stringExtra3 != null) {
            String str3 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The device was un-registered from ADM: ");
            sb3.append(stringExtra3);
            Hg.e(str3, sb3.toString());
        } else {
            Hg.e(a, "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.");
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
        if ("com.amazon.device.messaging.intent.REGISTRATION".equals(action)) {
            a(new Bf(context), context, intent);
        } else if ("com.amazon.device.messaging.intent.RECEIVE".equals(action)) {
            b(context, intent);
        } else if ("com.appboy.action.CANCEL_NOTIFICATION".equals(action)) {
            Eg.a(context, intent);
        } else if ("com.appboy.action.APPBOY_ACTION_CLICKED".equals(action)) {
            Ag.a(context, intent);
        } else if ("com.appboy.action.APPBOY_PUSH_CLICKED".equals(action)) {
            Eg.b(context, intent);
        } else {
            Hg.e(a, "The ADM receiver received a message not sent from Appboy. Ignoring the message.");
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if ("deleted_messages".equals(intent.getStringExtra("message_type"))) {
            int intExtra = intent.getIntExtra("total_deleted", -1);
            if (intExtra == -1) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse ADM message. Intent: ");
                sb.append(intent.toString());
                Hg.b(str, sb.toString());
            } else {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ADM deleted ");
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
        Hg.a(str3, sb3.toString());
        Bundle a2 = Eg.a(extras);
        extras.putBundle("extra", a2);
        if (Eg.b(intent)) {
            int b = Eg.b(extras);
            extras.putInt("nid", b);
            Notification a3 = Eg.a().a(new Bf(context), context, extras, a2);
            if (a3 == null) {
                Hg.a(a, "Notification created by notification factory was null. Not displaying notification.");
                return false;
            }
            notificationManager.notify("appboy_notification", b, a3);
            Eg.b(context, extras);
            Eg.c(context, extras);
            String str4 = "nd";
            if (extras.containsKey(str4)) {
                Eg.a(context, AppboyAdmReceiver.class, b, Integer.parseInt(extras.getString(str4)));
            }
            return true;
        }
        Eg.b(context, extras);
        Eg.a(context, extras);
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Bf bf, Context context, Intent intent) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received ADM registration. Message: ");
        sb.append(intent.toString());
        Hg.c(str, sb.toString());
        if (bf.z()) {
            Hg.a(a, "ADM enabled in appboy.xml. Continuing to process ADM registration intent.");
            c(context, intent);
            return true;
        }
        Hg.e(a, "ADM not enabled in appboy.xml. Ignoring ADM registration intent. Note: you must set com_appboy_push_adm_messaging_registration_enabled to true in your appboy.xml to enable ADM.");
        return false;
    }
}
