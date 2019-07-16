package com.soundcloud.android.settings.streamingquality;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.settings.streamingquality.SettingsListPicker.a;

/* compiled from: SettingsListPicker.kt */
final class c implements OnClickListener {
    final /* synthetic */ C0170b a;
    final /* synthetic */ a b;

    c(C0170b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public final void onClick(View view) {
        this.a.b().a(this.b);
    }
}
