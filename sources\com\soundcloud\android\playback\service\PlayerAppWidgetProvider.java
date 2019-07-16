package com.soundcloud.android.playback.service;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.playback.widget.l;

public class PlayerAppWidgetProvider extends AppWidgetProvider {
    l a;

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        SDb.a("onUpdate", new Object[0]);
        SoundCloudApplication.f().a(this);
        this.a.a();
    }
}
