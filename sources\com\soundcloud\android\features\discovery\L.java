package com.soundcloud.android.features.discovery;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PromotedTrackCardRenderer.kt */
final class L implements OnClickListener {
    final /* synthetic */ c a;
    final /* synthetic */ O b;
    final /* synthetic */ View c;

    L(c cVar, O o, View view) {
        this.a = cVar;
        this.b = o;
        this.c = view;
    }

    public final void onClick(View view) {
        this.b.a.a(this.a);
    }
}
