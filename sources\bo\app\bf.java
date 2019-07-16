package bo.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

public class bf {
    private static final String a = Hg.a(bf.class);
    private final Context b;
    private final bk c;

    public bf(Context context, bk bkVar) {
        this.b = context;
        this.c = bkVar;
    }

    @SuppressLint({"WrongConstant"})
    private static boolean b(Context context, Bf bf) {
        StringBuilder sb = new StringBuilder();
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageName);
        sb2.append(".permission.C2D_MESSAGE");
        String sb3 = sb2.toString();
        try {
            packageManager.getPermissionInfo(sb3, 4096);
        } catch (NameNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("The manifest does not define the ");
            sb4.append(sb3);
            sb4.append(" permission.");
            sb.append(sb4.toString());
        }
        if (!Mg.a(context, "android.permission.INTERNET")) {
            sb.append("Missing permission. The android.permission.INTERNET permission must be set so that the Android application can send the registration ID to the 3rd party server.");
        } else if (!Mg.a(context, "com.google.android.c2dm.permission.RECEIVE")) {
            sb.append("Missing permission. The com.google.android.c2dm.permission.RECEIVE permission must be set so that the Android application can register and receive messages.");
        } else if (!Mg.a(context, sb3)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing permission. The ");
            sb5.append(sb3);
            sb5.append(" permission must be set so that ONLY this Android application can register and receive GCM messages.");
            sb.append(sb5.toString());
        }
        if (!Mg.a(context, "android.permission.GET_ACCOUNTS")) {
            if (VERSION.SDK_INT >= 16) {
                Hg.c(a, "Missing permission. The android.permission.GET_ACCOUNTS permission is recommended to be set so that pre-Jelly Bean Android devices can register with the GCM server.");
            } else {
                sb.append("Missing permission. The android.permission.GET_ACCOUNTS permission must be set so that this pre-Jelly Bean Android device can register with the GCM server.");
            }
        }
        if (!Mg.a(context, "android.permission.WAKE_LOCK")) {
            Hg.c(a, "Missing permission. The android.permission.WAKE_LOCK permission is recommended be set so that the GCM receiver can notify users by waking the phone when a message is received.");
        }
        ComponentName componentName = new ComponentName(context, "com.appboy.AppboyGcmReceiver");
        try {
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(componentName, 2);
            if (receiverInfo == null || !receiverInfo.enabled) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("The ");
                sb6.append(componentName.getClassName());
                sb6.append(" broadcast receiver is either not found or is disabled");
                sb.append(sb6.toString());
            }
        } catch (NameNotFoundException unused2) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("No ");
            sb7.append(componentName.getClassName());
            sb7.append(" broadcast receiver is registered in the manifest.");
            sb.append(sb7.toString());
        }
        if (bf.k() == null) {
            sb.append("Cannot find the Google Cloud Messaging sender ID attribute com.appboy.GCM_SENDER_ID in res/values/appboy.xml.");
        }
        if (sb.length() == 0) {
            return true;
        }
        Hg.b(a, sb.toString());
        return false;
    }

    public void a(String... strArr) {
        if (this.c.a() != null) {
            Hg.e(a, "The device is already registered with the GCM server and is eligible to receive GCM messages.");
            return;
        }
        Hg.a(a, "Registering the application with the GCM server.");
        String a2 = Ng.a(strArr, ",");
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(this.b, 0, new Intent(), 0));
        intent.putExtra("sender", a2);
        this.b.startService(intent);
    }

    public static boolean a(Context context, Bf bf) {
        return a(context) && b(context, bf);
    }

    private static boolean a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            return true;
        } catch (NameNotFoundException unused) {
            Hg.b(a, "GCM requires the Google Play store installed.");
            return false;
        } catch (Exception unused2) {
            Hg.b(a, "Unexpected exception while checking for com.google.android.gsf");
            return false;
        }
    }
}
