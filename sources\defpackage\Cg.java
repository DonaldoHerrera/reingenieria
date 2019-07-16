package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: Cg reason: default package */
/* compiled from: AppboyNotificationRemoteViewsUtils */
public class Cg {
    private static final String a = Hg.a(Cg.class);

    public static RemoteViews a(Context context, Bundle bundle, int i, boolean z) {
        int i2;
        RemoteViews remoteViews;
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            String string = bundle2.getString("t");
            String string2 = bundle2.getString("a");
            Resources resources = context.getResources();
            String a2 = Lg.a(context);
            String str = "layout";
            if (z) {
                i2 = resources.getIdentifier("com_appboy_notification", str, a2);
            } else {
                i2 = resources.getIdentifier("com_appboy_notification_no_icon", str, a2);
            }
            String str2 = "id";
            int identifier = resources.getIdentifier("com_appboy_notification_title", str2, a2);
            int identifier2 = resources.getIdentifier("com_appboy_notification_content", str2, a2);
            int identifier3 = resources.getIdentifier("com_appboy_notification_icon", str2, a2);
            int identifier4 = resources.getIdentifier("com_appboy_notification_time", str2, a2);
            String str3 = "string";
            int identifier5 = resources.getIdentifier("com_appboy_notification_time_twenty_four_hour_format", str3, a2);
            int identifier6 = resources.getIdentifier("com_appboy_notification_time_twelve_hour_format", str3, a2);
            String a3 = Eg.a(resources, identifier5, "HH:mm");
            String a4 = Eg.a(resources, identifier6, "h:mm a");
            if (i2 == 0 || identifier == 0 || identifier2 == 0 || identifier3 == 0 || identifier4 == 0) {
                String str4 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find all resource IDs for custom notification view, extended view will not be used for push notifications. Received ");
                sb.append(i2);
                sb.append(" for layout, ");
                sb.append(identifier);
                sb.append(" for title, ");
                sb.append(identifier2);
                sb.append(" for content, ");
                sb.append(identifier3);
                sb.append(" for icon, and ");
                sb.append(identifier4);
                sb.append(" for time.");
                Hg.e(str4, sb.toString());
            } else {
                Hg.a(a, "Using RemoteViews for rendering of push notification.");
                try {
                    remoteViews = new RemoteViews(Lg.a(context), i2);
                } catch (Exception e) {
                    String str5 = a;
                    StringBuilder sb2 = new StringBuilder();
                    String str6 = "Failed to initialize remote views with package ";
                    sb2.append(str6);
                    sb2.append(Lg.a(context));
                    Hg.b(str5, sb2.toString(), e);
                    try {
                        remoteViews = new RemoteViews(context.getPackageName(), i2);
                    } catch (Exception e2) {
                        String str7 = a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str6);
                        sb3.append(context.getPackageName());
                        Hg.b(str7, sb3.toString(), e2);
                        return null;
                    }
                }
                remoteViews.setTextViewText(identifier, string);
                remoteViews.setTextViewText(identifier2, string2);
                if (z) {
                    remoteViews.setImageViewResource(identifier3, i);
                }
                if (DateFormat.is24HourFormat(context)) {
                    a4 = a3;
                }
                remoteViews.setTextViewText(identifier4, new SimpleDateFormat(a4, Locale.getDefault()).format(new Date()));
                return remoteViews;
            }
        }
        return null;
    }
}
