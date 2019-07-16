package com.soundcloud.android.likes;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: TrackLikesHeaderRenderer.kt */
final class M implements OnClickListener {
    final /* synthetic */ P a;
    final /* synthetic */ S b;

    M(P p, S s) {
        this.a = p;
        this.b = s;
    }

    public final void onClick(View view) {
        this.a.d.a(Boolean.valueOf(!this.b.b()));
    }
}
