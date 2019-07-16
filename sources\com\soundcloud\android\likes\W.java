package com.soundcloud.android.likes;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: TrackLikesTrackUniflowItemRenderer.kt */
final class W implements OnClickListener {
    final /* synthetic */ X a;
    final /* synthetic */ C5378VEa b;

    W(X x, C5378VEa vEa) {
        this.a = x;
        this.b = vEa;
    }

    public final void onClick(View view) {
        this.a.a.accept(Integer.valueOf(this.b.getAdapterPosition()));
    }
}
