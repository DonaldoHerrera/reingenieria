package com.soundcloud.android.features.discovery;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PromotedTrackCardRenderer.kt */
final class M implements OnClickListener {
    final /* synthetic */ c a;
    final /* synthetic */ O b;
    final /* synthetic */ View c;

    M(c cVar, O o, View view) {
        this.a = cVar;
        this.b = o;
        this.c = view;
    }

    public final void onClick(View view) {
        this.b.b.a(this.a);
    }
}
