package com.soundcloud.android.ads;

import android.app.Activity;

/* renamed from: com.soundcloud.android.ads.c reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C2551c implements Runnable {
    private final /* synthetic */ Activity a;

    public /* synthetic */ C2551c(Activity activity) {
        this.a = activity;
    }

    public final void run() {
        this.a.setRequestedOrientation(-1);
    }
}
