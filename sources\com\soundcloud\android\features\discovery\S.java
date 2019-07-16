package com.soundcloud.android.features.discovery;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: SingleSelectionContentCardRenderer.kt */
final class S implements OnClickListener {
    final /* synthetic */ T a;
    final /* synthetic */ d b;

    S(T t, d dVar) {
        this.a = t;
        this.b = dVar;
    }

    public final void onClick(View view) {
        this.a.a.a(this.b.c());
    }
}
