package com.soundcloud.android.features.record;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import com.soundcloud.android.features.record.G.i;
import com.soundcloud.android.features.record.G.l;
import dagger.android.a;

public class RecordAppWidgetProvider extends AppWidgetProvider {
    private static RecordAppWidgetProvider a;
    J b;

    public RecordAppWidgetProvider() {
    }

    public static synchronized RecordAppWidgetProvider a(J j) {
        RecordAppWidgetProvider recordAppWidgetProvider;
        synchronized (RecordAppWidgetProvider.class) {
            if (a == null) {
                a = new RecordAppWidgetProvider(j);
            }
            recordAppWidgetProvider = a;
        }
        return recordAppWidgetProvider;
    }

    private boolean b(Context context) {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(a(context)).length > 0;
    }

    public void onReceive(Context context, Intent intent) {
        a.a(this, context);
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        a(context, iArr, false);
    }

    public RecordAppWidgetProvider(J j) {
        this.b = j;
    }

    private ComponentName a(Context context) {
        return new ComponentName(context, RecordAppWidgetProvider.class);
    }

    private void a(Context context, int[] iArr, RemoteViews remoteViews) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        if (iArr != null) {
            instance.updateAppWidget(iArr, remoteViews);
        } else {
            instance.updateAppWidget(a(context), remoteViews);
        }
    }

    public void a(Context context, Intent intent) {
        String action = intent.getAction();
        String str = "RecordWidget";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("notify change ");
            sb.append(intent);
            Log.d(str, sb.toString());
        }
        if (!b(context)) {
            return;
        }
        if (action.equals("com.soundcloud.android.recordstarted")) {
            a(context, (int[]) null, true);
        } else if (action.equals("com.soundcloud.android.recordfinished")) {
            a(context, (int[]) null, false);
        }
    }

    private void a(Context context, int[] iArr, boolean z) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), l.appwidget_record);
        if (z) {
            remoteViews.setOnClickPendingIntent(i.btn_action, PendingIntent.getActivity(context, 0, this.b.a(J.a.STOP), 268435456));
        } else {
            remoteViews.setOnClickPendingIntent(i.btn_action, PendingIntent.getActivity(context, 0, this.b.a(J.a.START), 268435456));
        }
        a(context, iArr, remoteViews);
    }
}
