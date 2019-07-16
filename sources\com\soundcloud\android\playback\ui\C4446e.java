package com.soundcloud.android.playback.ui;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.playback.ui.e reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4446e implements C7733yKa {
    private final /* synthetic */ OnClickListener a;

    public /* synthetic */ C4446e(OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public final void accept(Object obj) {
        ((View) obj).setOnClickListener(this.a);
    }
}
