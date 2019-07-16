package com.soundcloud.android.playback.playqueue;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: lambda */
public final /* synthetic */ class J implements OnClickListener {
    private final /* synthetic */ fb a;
    private final /* synthetic */ int b;

    public /* synthetic */ J(fb fbVar, int i) {
        this.a = fbVar;
        this.b = i;
    }

    public final void onClick(View view) {
        this.a.a(this.b, view);
    }
}
