package com.soundcloud.android.listeners.dev.eventlogger;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: DevEventLoggerMonitorDetailsDialog.kt */
final class f implements OnClickListener {
    final /* synthetic */ e a;
    final /* synthetic */ String b;

    f(e eVar, String str) {
        this.a = eVar;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c(this.b);
    }
}
