package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.k.c;
import androidx.core.app.k.d;
import androidx.core.content.a;
import com.comscore.streaming.ContentType;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

public final class e {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());
    private final Context b;
    private final String c;
    private Bundle d;

    public e(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public static boolean b(Bundle bundle) {
        return "1".equals(a(bundle, "gcm.n.e")) || a(bundle, "gcm.n.icon") != null;
    }

    public static String c(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_key";
        return a(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
    }

    private final String d(Bundle bundle, String str) {
        String a2 = a(bundle, str);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return e(bundle, str);
    }

    private final CharSequence e(Bundle bundle) {
        String d2 = d(bundle, "gcm.n.title");
        if (!TextUtils.isEmpty(d2)) {
            return d2;
        }
        try {
            return b(0).loadLabel(this.b.getPackageManager());
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.e("FirebaseMessaging", sb.toString());
            return "";
        }
    }

    private static boolean f(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.e"))) {
                return true;
            }
        }
        return false;
    }

    public final d a(Bundle bundle) {
        Uri uri;
        Intent intent;
        PendingIntent pendingIntent;
        d dVar = new d(this.b, c(a(bundle, "gcm.n.android_channel_id")));
        dVar.a(true);
        dVar.c(e(bundle));
        String d2 = d(bundle, "gcm.n.body");
        if (!TextUtils.isEmpty(d2)) {
            dVar.b((CharSequence) d2);
            c cVar = new c();
            cVar.a((CharSequence) d2);
            dVar.a((androidx.core.app.k.e) cVar);
        }
        dVar.e(a(a(bundle, "gcm.n.icon")));
        String c2 = c(bundle);
        PendingIntent pendingIntent2 = null;
        if (TextUtils.isEmpty(c2)) {
            uri = null;
        } else {
            if (!"default".equals(c2)) {
                if (this.b.getResources().getIdentifier(c2, "raw", this.c) != 0) {
                    String str = this.c;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(c2).length());
                    sb.append("android.resource://");
                    sb.append(str);
                    sb.append("/raw/");
                    sb.append(c2);
                    uri = Uri.parse(sb.toString());
                }
            }
            uri = RingtoneManager.getDefaultUri(2);
        }
        if (uri != null) {
            dVar.a(uri);
        }
        String a2 = a(bundle, "gcm.n.click_action");
        if (!TextUtils.isEmpty(a2)) {
            intent = new Intent(a2);
            intent.setPackage(this.c);
            intent.setFlags(268435456);
        } else {
            Uri d3 = d(bundle);
            if (d3 != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.c);
                intent.setData(d3);
            } else {
                intent = this.b.getPackageManager().getLaunchIntentForPackage(this.c);
                if (intent == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (intent == null) {
            pendingIntent = null;
        } else {
            intent.addFlags(67108864);
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null && str2.startsWith("google.c.")) {
                    it.remove();
                }
            }
            intent.putExtras(bundle2);
            for (String str3 : bundle2.keySet()) {
                if (str3.startsWith("gcm.n.") || str3.startsWith("gcm.notification.")) {
                    intent.removeExtra(str3);
                }
            }
            pendingIntent = PendingIntent.getActivity(this.b, a.incrementAndGet(), intent, 1073741824);
            if (f(bundle)) {
                Intent intent2 = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                a(intent2, bundle);
                intent2.putExtra("pending_intent", pendingIntent);
                pendingIntent = a(a.incrementAndGet(), intent2);
            }
        }
        dVar.a(pendingIntent);
        if (f(bundle)) {
            Intent intent3 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            a(intent3, bundle);
            pendingIntent2 = a(a.incrementAndGet(), intent3);
        }
        if (pendingIntent2 != null) {
            dVar.b(pendingIntent2);
        }
        Integer b2 = b(a(bundle, "gcm.n.color"));
        if (b2 != null) {
            dVar.a(b2.intValue());
        }
        String a3 = a(bundle, "gcm.n.tag");
        if (TextUtils.isEmpty(a3)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("FCM-Notification:");
            sb2.append(uptimeMillis);
            a3 = sb2.toString();
        }
        return new d(dVar, a3, 0);
    }

    public static String c(Bundle bundle) {
        String a2 = a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a2) ? a(bundle, "gcm.n.sound") : a2;
    }

    public static Object[] b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_args";
        String a2 = a(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a2);
            Object[] objArr = new String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return objArr;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(str);
            String substring = (str2.length() != 0 ? valueOf2.concat(str2) : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a2).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(a2);
            sb.append("  Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    static Uri d(Bundle bundle) {
        String a2 = a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a2)) {
            a2 = a(bundle, "gcm.n.link");
        }
        if (!TextUtils.isEmpty(a2)) {
            return Uri.parse(a2);
        }
        return null;
    }

    @TargetApi(26)
    private final String c(String str) {
        if (!PlatformVersion.isAtLeastO()) {
            return null;
        }
        int i = 0;
        try {
            i = b(i).targetSdkVersion;
        } catch (NameNotFoundException unused) {
        }
        if (i < 26) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService(NotificationManager.class);
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            if (notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND);
            sb.append("Notification Channel requested (");
            sb.append(str);
            sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            Log.w(str2, sb.toString());
        }
        String string = a().getString("com.google.firebase.messaging.default_notification_channel_id");
        if (TextUtils.isEmpty(string)) {
            Log.w(str2, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        } else if (notificationManager.getNotificationChannel(string) != null) {
            return string;
        } else {
            Log.w(str2, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        String str3 = "fcm_fallback_notification_channel";
        if (notificationManager.getNotificationChannel(str3) == null) {
            notificationManager.createNotificationChannel(new NotificationChannel(str3, this.b.getString(this.b.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", this.c)), 3));
        }
        return str3;
    }

    private final String e(Bundle bundle, String str) {
        String c2 = c(bundle, str);
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        Resources resources = this.b.getResources();
        int identifier = resources.getIdentifier(c2, "string", this.c);
        String str2 = " Default value will be used.";
        String str3 = "FirebaseMessaging";
        if (identifier == 0) {
            String valueOf = String.valueOf(str);
            String str4 = "_loc_key";
            String substring = (str4.length() != 0 ? valueOf.concat(str4) : new String(valueOf)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(str).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(str);
            sb.append(str2);
            Log.w(str3, sb.toString());
            return null;
        }
        Object[] b2 = b(bundle, str);
        if (b2 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, b2);
        } catch (MissingFormatArgumentException e) {
            String arrays = Arrays.toString(b2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(str2);
            Log.w(str3, sb2.toString(), e);
            return null;
        }
    }

    private final Integer b(String str) {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Color ");
                sb.append(str);
                sb.append(" not valid. Notification will use default color.");
                Log.w(str2, sb.toString());
            }
        }
        int i = a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(a.a(this.b, i));
            } catch (NotFoundException unused2) {
                Log.w(str2, "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    private final ApplicationInfo b(int i) throws NameNotFoundException {
        return this.b.getPackageManager().getApplicationInfo(this.c, i);
    }

    public static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    @TargetApi(26)
    private final boolean a(int i) {
        String str = "FirebaseMessaging";
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.b.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e(str, sb.toString());
            return false;
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e(str, sb2.toString());
            return false;
        }
    }

    private final int a(String str) {
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.b.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.c);
            if (identifier != 0 && a(identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str, "mipmap", this.c);
            if (identifier2 != 0 && a(identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("Icon resource ");
            sb.append(str);
            sb.append(" not found. Notification will use default icon.");
            Log.w(str2, sb.toString());
        }
        int i = a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !a(i)) {
            try {
                i = b(0).icon;
            } catch (NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w(str2, sb2.toString());
            }
        }
        if (i == 0 || !a(i)) {
            i = 17301651;
        }
        return i;
    }

    private final synchronized Bundle a() {
        if (this.d != null) {
            return this.d;
        }
        try {
            ApplicationInfo b2 = b(128);
            if (!(b2 == null || b2.metaData == null)) {
                this.d = b2.metaData;
                return this.d;
            }
        } catch (NameNotFoundException e) {
            String str = "FirebaseMessaging";
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
        }
        return Bundle.EMPTY;
    }

    private static void a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    private final PendingIntent a(int i, Intent intent) {
        return PendingIntent.getBroadcast(this.b, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(this.b, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }
}
