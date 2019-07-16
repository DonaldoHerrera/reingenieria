package com.soundcloud.android.settings.streamingquality;

import com.soundcloud.android.settings.streamingquality.SettingsListPicker.b.a;
import com.soundcloud.android.settings.streamingquality.SettingsListPicker.c;

/* compiled from: SettingsListPicker.kt */
public final class d implements a {
    final /* synthetic */ SettingsListPicker a;
    final /* synthetic */ c b;

    d(SettingsListPicker settingsListPicker, c cVar) {
        this.a = settingsListPicker;
        this.b = cVar;
    }

    public void a(SettingsListPicker.a aVar) {
        C7471uYa.b(aVar, "setting");
        this.a.Ja.a(Integer.valueOf(this.b.b().indexOf(aVar)));
    }
}
