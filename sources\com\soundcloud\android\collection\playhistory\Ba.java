package com.soundcloud.android.collection.playhistory;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PlayHistoryTrackRenderer.kt */
final class Ba implements OnClickListener {
    final /* synthetic */ Ca a;
    final /* synthetic */ U b;

    Ba(Ca ca, U u) {
        this.a = ca;
        this.b = u;
    }

    public final void onClick(View view) {
        this.a.a().accept(this.b.c());
    }
}
