package defpackage;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.core.app.k.a.C0005a;
import androidx.core.app.k.d;
import com.appboy.h;

/* renamed from: Ag reason: default package */
/* compiled from: AppboyNotificationActionUtils */
public class Ag {
    private static final String a = Hg.a(Ag.class);

    @TargetApi(16)
    public static void a(Context context, d dVar, Bundle bundle) {
        if (bundle == null) {
            try {
                Hg.e(a, "Notification extras were null. Doing nothing.");
            } catch (Exception e) {
                Hg.b(a, "Caught exception while adding notification action buttons.", e);
            }
        } else if (VERSION.SDK_INT >= 16) {
            for (int i = 0; !Ng.d(a(i, bundle, "ab_a*_a")); i++) {
                a(context, dVar, bundle, i);
            }
        }
    }

    private static void b(Context context, Intent intent) {
        h.a(context).a(intent.getStringExtra("cid"), intent.getStringExtra("appboy_action_id"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092 A[Catch:{ Exception -> 0x0096 }] */
    @TargetApi(16)
    public static void a(Context context, Intent intent) {
        String str = "appboy_action_use_webview";
        String str2 = "appboy_action_uri";
        String str3 = "ab_uri";
        try {
            String stringExtra = intent.getStringExtra("appboy_action_type");
            if (Ng.d(stringExtra)) {
                Hg.e(a, "Notification action button type was blank or null. Doing nothing.");
                return;
            }
            int intExtra = intent.getIntExtra("nid", -1);
            b(context, intent);
            if (!stringExtra.equals(str3)) {
                if (!stringExtra.equals("ab_open")) {
                    if (stringExtra.equals("ab_none")) {
                        Eg.a(context, intExtra);
                    } else {
                        Hg.e(a, "Unknown notification action button clicked. Doing nothing.");
                    }
                }
            }
            Eg.a(context, intExtra);
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            boolean equals = stringExtra.equals(str3);
            String str4 = "uri";
            if (equals) {
                if (intent.getExtras().containsKey(str2)) {
                    intent.putExtra(str4, intent.getStringExtra(str2));
                    if (intent.getExtras().containsKey(str)) {
                        intent.putExtra("ab_use_webview", intent.getStringExtra(str));
                    }
                    Eg.d(context, intent);
                    if (new Bf(context).l()) {
                        Eg.c(context, intent);
                    }
                }
            }
            intent.removeExtra(str4);
            Eg.d(context, intent);
            if (new Bf(context).l()) {
            }
        } catch (Exception e) {
            Hg.b(a, "Caught exception while handling notification action button click.", e);
        }
    }

    @TargetApi(16)
    private static void a(Context context, d dVar, Bundle bundle, int i) {
        Bundle bundle2 = new Bundle(bundle);
        String a2 = a(i, bundle, "ab_a*_a");
        bundle2.putInt("appboy_action_index", i);
        bundle2.putString("appboy_action_type", a2);
        bundle2.putString("appboy_action_id", a(i, bundle, "ab_a*_id"));
        bundle2.putString("appboy_action_uri", a(i, bundle, "ab_a*_uri"));
        bundle2.putString("appboy_action_use_webview", a(i, bundle, "ab_a*_use_webview"));
        Intent intent = new Intent("com.appboy.action.APPBOY_ACTION_CLICKED").setClass(context, Eg.b());
        intent.putExtras(bundle2);
        C0005a aVar = new C0005a(0, a(i, bundle, "ab_a*_t"), PendingIntent.getBroadcast(context, Kg.a(), intent, 134217728));
        aVar.a(new Bundle(bundle2));
        dVar.a(aVar.a());
    }

    static String a(int i, Bundle bundle, String str) {
        String string = bundle.getString(str.replace("*", String.valueOf(i)));
        return string == null ? "" : string;
    }
}
