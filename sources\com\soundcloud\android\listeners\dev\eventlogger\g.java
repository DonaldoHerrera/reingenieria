package com.soundcloud.android.listeners.dev.eventlogger;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import androidx.fragment.app.FragmentActivity;

/* compiled from: DevEventLoggerMonitorDetailsDialog.kt */
final class g implements OnClickListener {
    final /* synthetic */ e a;
    final /* synthetic */ FragmentActivity b;
    final /* synthetic */ String c;

    g(e eVar, FragmentActivity fragmentActivity, String str) {
        this.a = eVar;
        this.b = fragmentActivity;
        this.c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(C4557fja.b((Context) this.b, this.c));
    }
}
