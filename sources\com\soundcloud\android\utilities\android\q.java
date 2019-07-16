package com.soundcloud.android.utilities.android;

import android.view.View;

/* compiled from: ViewHelper */
public class q {
    public void a(View view, int i) {
        view.setOutlineProvider(new p(this, i));
        view.setClipToOutline(true);
    }
}
