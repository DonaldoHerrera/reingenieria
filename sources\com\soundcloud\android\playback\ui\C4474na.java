package com.soundcloud.android.playback.ui;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.playback.ui.na reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4474na implements C7733yKa {
    private final /* synthetic */ OnClickListener a;

    public /* synthetic */ C4474na(OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public final void accept(Object obj) {
        ((View) obj).setOnClickListener(this.a);
    }
}
