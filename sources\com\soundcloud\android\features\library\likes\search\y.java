package com.soundcloud.android.features.library.likes.search;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: TrackLikesSearchItemRenderer.kt */
final class y implements OnClickListener {
    final /* synthetic */ z a;
    final /* synthetic */ C5378VEa b;

    y(z zVar, C5378VEa vEa) {
        this.a = zVar;
        this.b = vEa;
    }

    public final void onClick(View view) {
        this.a.a.a(Integer.valueOf(this.b.getAdapterPosition()));
    }
}
