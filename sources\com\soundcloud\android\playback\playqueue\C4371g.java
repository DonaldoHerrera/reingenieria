package com.soundcloud.android.playback.playqueue;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: com.soundcloud.android.playback.playqueue.g reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4371g implements OnCheckedChangeListener {
    private final /* synthetic */ C4384ma a;
    private final /* synthetic */ View b;
    private final /* synthetic */ boolean c;

    public /* synthetic */ C4371g(C4384ma maVar, View view, boolean z) {
        this.a = maVar;
        this.b = view;
        this.c = z;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a(this.b, this.c, compoundButton, z);
    }
}
