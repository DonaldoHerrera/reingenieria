package com.google.android.gms.cast.framework.media.widget;

import android.os.Looper;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.internal.cast.Ca;
import java.util.TimerTask;

final class e extends TimerTask {
    final /* synthetic */ AdBreakClipInfo a;
    final /* synthetic */ C0650e b;
    final /* synthetic */ ExpandedControllerActivity c;

    e(ExpandedControllerActivity expandedControllerActivity, AdBreakClipInfo adBreakClipInfo, C0650e eVar) {
        this.c = expandedControllerActivity;
        this.a = adBreakClipInfo;
        this.b = eVar;
    }

    public final void run() {
        new Ca(Looper.getMainLooper()).post(new g(this));
    }
}
