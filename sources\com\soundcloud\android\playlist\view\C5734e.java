package com.soundcloud.android.playlist.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

/* renamed from: com.soundcloud.android.playlist.view.e reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C5734e implements OnClickListener {
    private final /* synthetic */ T a;
    private final /* synthetic */ C6532gqa b;
    private final /* synthetic */ ToggleButton c;

    public /* synthetic */ C5734e(T t, C6532gqa gqa, ToggleButton toggleButton) {
        this.a = t;
        this.b = gqa;
        this.c = toggleButton;
    }

    public final void onClick(View view) {
        this.a.a(this.b, this.c.isChecked());
    }
}
