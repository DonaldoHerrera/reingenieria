package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.k.d;
import com.appboy.AppboyAdmReceiver;
import com.appboy.AppboyGcmReceiver;
import com.appboy.h;
import com.appboy.i;
import com.appboy.k;
import com.appboy.o;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.support.UriUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Eg reason: default package */
/* compiled from: AppboyNotificationUtils */
public class Eg {
    private static final String a = Hg.a(Eg.class);

    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!k.a.booleanValue()) {
            return a(bundle.getString("extra", "{}"));
        }
        return new Bundle(bundle);
    }

    @TargetApi(16)
    public static boolean a(int i) {
        return i >= -2 && i <= 2;
    }

    public static void b(Context context, Intent intent) {
        try {
            e(context, intent);
            d(context, intent);
            if (new Bf(context).l()) {
                c(context, intent);
            }
        } catch (Exception e) {
            Hg.b(a, "Exception occurred attempting to handle notification.", e);
        }
    }

    @TargetApi(21)
    public static boolean b(int i) {
        return i == -1 || i == 0 || i == 1;
    }

    public static void c(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        String str = "cid";
        bundleExtra.putString(str, intent.getStringExtra(str));
        bundleExtra.putString("source", "Appboy");
        String str2 = "uri";
        String stringExtra = intent.getStringExtra(str2);
        if (!Ng.d(stringExtra)) {
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Found a deep link ");
            sb.append(stringExtra);
            Log.d(str3, sb.toString());
            String str4 = "ab_use_webview";
            boolean equalsIgnoreCase = "true".equalsIgnoreCase(intent.getStringExtra(str4));
            String str5 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Use webview set to: ");
            sb2.append(equalsIgnoreCase);
            Log.d(str5, sb2.toString());
            bundleExtra.putString(str2, stringExtra);
            bundleExtra.putBoolean(str4, equalsIgnoreCase);
            AppboyNavigator.getAppboyNavigator().gotoUri(context, ActionFactory.createUriActionFromUrlString(stringExtra, bundleExtra, equalsIgnoreCase, Hf.PUSH));
            return;
        }
        Log.d(a, "Push notification had no deep link. Opening main activity.");
        context.startActivity(UriUtils.getMainActivityIntent(context, bundleExtra));
    }

    public static void d(d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 16 && bundle != null) {
            Hg.a(a, "Setting priority for notification");
            dVar.d(c(bundle));
        }
    }

    public static void e(d dVar, Bundle bundle) {
        if (bundle != null) {
            String str = "sd";
            if (bundle.containsKey(str)) {
                String string = bundle.getString(str);
                if (string == null) {
                    return;
                }
                if (string.equals("d")) {
                    Hg.a(a, "Setting default sound for notification.");
                    dVar.b(1);
                    return;
                }
                Hg.a(a, "Setting sound for notification via uri.");
                dVar.a(Uri.parse(string));
                return;
            }
        }
        Hg.a(a, "Sound key not present in notification extras. Not setting sound for notification.");
    }

    public static void f(d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            if (bundle != null) {
                String str = "s";
                if (bundle.containsKey(str)) {
                    String string = bundle.getString(str);
                    if (string != null) {
                        Hg.a(a, "Setting summary text for notification");
                        dVar.d((CharSequence) string);
                        return;
                    }
                    return;
                }
            }
            Hg.a(a, "Summary text not present in notification extras. Not setting summary text for notification.");
        }
    }

    public static void g(d dVar, Bundle bundle) {
        if (bundle != null) {
            Hg.a(a, "Setting ticker for notification");
            dVar.e((CharSequence) bundle.getString("t"));
        }
    }

    public static void h(d dVar, Bundle bundle) {
        if (bundle != null) {
            Hg.a(a, "Setting title for notification");
            dVar.c((CharSequence) bundle.getString("t"));
        }
    }

    public static void i(d dVar, Bundle bundle) {
        if (VERSION.SDK_INT < 21) {
            Hg.a(a, "Notification visibility not supported on this android version. Not setting visibility for notification.");
        } else if (bundle != null) {
            String str = "ab_vs";
            if (bundle.containsKey(str)) {
                try {
                    int parseInt = Integer.parseInt(bundle.getString(str));
                    if (b(parseInt)) {
                        Hg.a(a, "Setting visibility for notification");
                        dVar.f(parseInt);
                        return;
                    }
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received invalid notification visibility ");
                    sb.append(parseInt);
                    Hg.b(str2, sb.toString());
                } catch (Exception e) {
                    Hg.b(a, "Failed to parse visibility from notificationExtras", e);
                }
            }
        }
    }

    public static Bundle a(String str) {
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (JSONException e) {
            Hg.b(a, "Unable parse JSON into a bundle.", e);
            return null;
        }
    }

    public static boolean d(Bundle bundle) {
        if (bundle != null) {
            String str = "appboy_uninstall_tracking";
            if (bundle.containsKey(str)) {
                return true;
            }
            Bundle bundle2 = bundle.getBundle("extra");
            if (bundle2 != null) {
                return bundle2.containsKey(str);
            }
        }
        return false;
    }

    public static boolean b(Intent intent) {
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey("t") && extras.containsKey("a");
    }

    static void d(Context context, Intent intent) {
        Hg.a(a, "Sending notification opened broadcast");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".intent.APPBOY_NOTIFICATION_OPENED");
        Intent intent2 = new Intent(sb.toString());
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        Kg.a(context, intent2);
    }

    public static void b(Context context, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".intent.APPBOY_PUSH_RECEIVED");
        Intent intent = new Intent(sb.toString());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        Hg.a(a, "Sending push message received broadcast");
        Kg.a(context, intent);
    }

    private static void e(Context context, Intent intent) {
        h.a(context).a(intent);
    }

    public static boolean a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if ("true".equals(extras.getString("_ab"))) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, Bundle bundle) {
        String str = "ab_sync_geos";
        if (!bundle.containsKey(str)) {
            Hg.a(a, "Geofence sync key not included in push payload. Not syncing geofences.");
        } else if (Boolean.parseBoolean(bundle.getString(str))) {
            i.a(context, true);
            return true;
        } else {
            Hg.a(a, "Geofence sync key was false. Not syncing geofences.");
        }
        return false;
    }

    public static int b(Bundle bundle) {
        if (bundle != null) {
            String str = "n";
            if (bundle.containsKey(str)) {
                try {
                    int parseInt = Integer.parseInt(bundle.getString(str));
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Using notification id provided in the message's extras bundle: ");
                    sb.append(parseInt);
                    Hg.a(str2, sb.toString());
                    return parseInt;
                } catch (NumberFormatException e) {
                    Hg.b(a, "Unable to parse notification id provided in the message's extras bundle. Using default notification id instead: -1", e);
                    return -1;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                sb2.append(bundle.getString("t", str3));
                sb2.append(bundle.getString("a", str3));
                int hashCode = sb2.toString().hashCode();
                String str4 = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Message without notification id provided in the extras bundle received. Using a hash of the message: ");
                sb3.append(hashCode);
                Hg.a(str4, sb3.toString());
                return hashCode;
            }
        } else {
            Hg.a(a, "Message without extras bundle received. Using default notification id: ");
            return -1;
        }
    }

    @TargetApi(16)
    public static int c(Bundle bundle) {
        if (bundle != null) {
            String str = "p";
            if (bundle.containsKey(str)) {
                try {
                    int parseInt = Integer.parseInt(bundle.getString(str));
                    if (a(parseInt)) {
                        return parseInt;
                    }
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received invalid notification priority ");
                    sb.append(parseInt);
                    Hg.b(str2, sb.toString());
                } catch (NumberFormatException e) {
                    Hg.b(a, "Unable to parse custom priority. Returning default priority of 0", e);
                }
            }
        }
        return 0;
    }

    public static void a(Context context, Class<?> cls, int i, int i2) {
        Intent intent = new Intent(context, cls);
        intent.setAction("com.appboy.action.CANCEL_NOTIFICATION");
        intent.putExtra("nid", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (i2 >= 1000) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Setting Notification duration alarm for ");
            sb.append(i2);
            sb.append(" ms");
            Hg.a(str, sb.toString());
            alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) i2), broadcast);
        }
    }

    public static boolean c(Context context, Bundle bundle) {
        if (!Mg.a(context, "android.permission.WAKE_LOCK")) {
            return false;
        }
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            NotificationChannel a2 = a((NotificationManager) context.getSystemService("notification"), bundle);
            if (a2 == null) {
                Hg.a(a, "Not waking screen on Android O+ device, could not find notification channel.");
                return false;
            }
            int a3 = a(a2);
            if (a3 == 1) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Not acquiring wake-lock for Android O+ notification with importance: ");
                sb.append(a3);
                Hg.a(str, sb.toString());
                return false;
            }
        } else if (i >= 16 && c(bundle) == -2) {
            return false;
        }
        WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(268435482, a);
        newWakeLock.acquire();
        newWakeLock.release();
        return true;
    }

    public static void b(d dVar, Bundle bundle) {
        if (bundle != null) {
            Hg.a(a, "Setting content for notification");
            dVar.b((CharSequence) bundle.getString("a"));
        }
    }

    public static o a() {
        o d = h.d();
        return d == null ? Bg.a() : d;
    }

    public static Class<?> b() {
        if (k.a.booleanValue()) {
            return AppboyAdmReceiver.class;
        }
        return AppboyGcmReceiver.class;
    }

    public static void a(Context context, d dVar, Bundle bundle) {
        try {
            Intent intent = new Intent("com.appboy.action.APPBOY_PUSH_CLICKED").setClass(context, b());
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            dVar.a(PendingIntent.getBroadcast(context, Kg.a(), intent, 1073741824));
        } catch (Exception e) {
            Hg.b(a, "Error setting content.", e);
        }
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    public static void b(Context context, Bf bf, d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel a2 = a(notificationManager, bundle);
            if (a2 != null) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Using notification channel with id: ");
                sb.append(a2.getId());
                Hg.a(str, sb.toString());
                dVar.b(a2.getId());
                return;
            }
            String str2 = "com_appboy_default_notification_channel";
            if (a2 == null || a2.getId().equals(str2)) {
                NotificationChannel notificationChannel = new NotificationChannel(str2, bf.j(), 3);
                notificationChannel.setDescription(bf.i());
                notificationManager.createNotificationChannel(notificationChannel);
                dVar.b(str2);
                Hg.a(a, "Using default notification channel with id: com_appboy_default_notification_channel");
            }
        }
    }

    public static int a(Bf bf, d dVar) {
        int w = bf.w();
        if (w == 0) {
            Hg.a(a, "Small notification icon resource was not found. Will use the app icon when displaying notifications.");
            w = bf.e();
        } else {
            Hg.a(a, "Setting small icon for notification via resource id");
        }
        dVar.e(w);
        return w;
    }

    public static void c(Context context, Bf bf, d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 21 && bundle != null) {
            String str = "ab_pn";
            if (bundle.containsKey(str)) {
                Bundle a2 = a(bundle.getString(str));
                d dVar2 = new d(context);
                b(dVar2, a2);
                h(dVar2, a2);
                f(dVar2, a2);
                a(bf, dVar2);
                a(bf, dVar2, a2);
                dVar.a(dVar2.a());
            }
        }
    }

    public static boolean a(Context context, Bf bf, d dVar, Bundle bundle) {
        String str = "ab_li";
        if (bundle != null) {
            try {
                if (bundle.containsKey(str)) {
                    Hg.a(a, "Setting large icon for notification");
                    dVar.a(Gg.a(context, Uri.parse(bundle.getString(str)), Ff.NOTIFICATION_LARGE_ICON));
                    return true;
                }
            } catch (Exception e) {
                Hg.b(a, "Error setting large notification icon", e);
            }
        }
        Hg.a(a, "Large icon bitmap url not present in extras. Attempting to use resource id instead.");
        int q = bf.q();
        if (q != 0) {
            dVar.a(BitmapFactory.decodeResource(context.getResources(), q));
            return true;
        }
        Hg.a(a, "Large icon resource id not present for notification");
        Hg.a(a, "Large icon not set for notification");
        return false;
    }

    public static void c(d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            String string = bundle.getString("ab_bc", null);
            if (!Ng.d(string)) {
                try {
                    dVar.c(Integer.parseInt(string));
                } catch (NumberFormatException e) {
                    Hg.b(a, "Caught exception while setting number on notification.", e);
                }
            }
        }
    }

    public static void a(Context context, d dVar, Bundle bundle, Bundle bundle2) {
        if (VERSION.SDK_INT >= 16 && bundle != null) {
            Hg.a(a, "Setting style for notification");
            dVar.a(Dg.a(context, bundle, bundle2));
        }
    }

    public static void a(Bf bf, d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            if (bundle != null) {
                String str = "ac";
                if (bundle.containsKey(str)) {
                    Hg.a(a, "Using accent color for notification from extras bundle");
                    dVar.a((int) Long.parseLong(bundle.getString(str)));
                    return;
                }
            }
            Hg.a(a, "Using default accent color for notification");
            dVar.a(bf.h());
        }
    }

    public static void a(d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            if (bundle != null) {
                String str = "ab_ct";
                if (bundle.containsKey(str)) {
                    Hg.a(a, "Setting category for notification");
                    dVar.a(bundle.getString(str));
                    return;
                }
            }
            Hg.a(a, "Category not present in notification extras. Not setting category for notification.");
            return;
        }
        Hg.a(a, "Notification category not supported on this android version. Not setting category for notification.");
    }

    public static void a(Context context, Intent intent) {
        String str = "nid";
        try {
            if (intent.hasExtra(str)) {
                int intExtra = intent.getIntExtra(str, -1);
                String str2 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Cancelling notification action with id: ");
                sb.append(intExtra);
                Hg.a(str2, sb.toString());
                ((NotificationManager) context.getSystemService("notification")).cancel("appboy_notification", intExtra);
            }
        } catch (Exception e) {
            Hg.b(a, "Exception occurred handling cancel notification intent.", e);
        }
    }

    public static void a(Context context, int i) {
        try {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Cancelling notification action with id: ");
            sb.append(i);
            Hg.a(str, sb.toString());
            Intent intent = new Intent("com.appboy.action.CANCEL_NOTIFICATION").setClass(context, b());
            intent.putExtra("nid", i);
            Kg.a(context, intent);
        } catch (Exception e) {
            Hg.b(a, "Exception occurred attempting to cancel notification.", e);
        }
    }

    static String a(Resources resources, int i, String str) {
        try {
            return resources.getString(i);
        } catch (NotFoundException unused) {
            return str;
        }
    }

    @TargetApi(26)
    static NotificationChannel a(NotificationManager notificationManager, Bundle bundle) {
        if (bundle == null) {
            Hg.a(a, "Notification extras bundle was null. Could not find a valid notification channel");
            return null;
        }
        String string = bundle.getString("ab_nc", null);
        if (!Ng.d(string)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Found notification channel in extras with id: ");
                sb.append(string);
                Hg.a(str, sb.toString());
                return notificationChannel;
            }
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Notification channel from extras is invalid, no channel found with id: ");
            sb2.append(string);
            Hg.a(str2, sb2.toString());
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        Hg.a(a, "Appboy default notification channel does not exist on device.");
        return null;
    }

    @TargetApi(26)
    private static int a(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }
}
