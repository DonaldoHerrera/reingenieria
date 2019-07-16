package com.soundcloud.android.utilities.android;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ViewHelper */
class p extends ViewOutlineProvider {
    final /* synthetic */ int a;
    final /* synthetic */ q b;

    p(q qVar, int i) {
        this.b = qVar;
        this.a = i;
    }

    public void getOutline(View view, Outline outline) {
        int i = this.a;
        outline.setOval(0, 0, i, i);
    }
}
