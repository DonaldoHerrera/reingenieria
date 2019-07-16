package com.soundcloud.android.playback.playqueue;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: lambda */
public final /* synthetic */ class I implements OnClickListener {
    private final /* synthetic */ fb a;
    private final /* synthetic */ hb b;

    public /* synthetic */ I(fb fbVar, hb hbVar) {
        this.a = fbVar;
        this.b = hbVar;
    }

    public final void onClick(View view) {
        this.a.a(this.b, view);
    }
}
