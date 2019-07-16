package com.soundcloud.android.settings;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SettingsModule */
public abstract class H {
    @w
    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("player_settings", 0);
    }

    @V
    static SharedPreferences b(Context context) {
        return context.getSharedPreferences("streaming_settings", 0);
    }
}
