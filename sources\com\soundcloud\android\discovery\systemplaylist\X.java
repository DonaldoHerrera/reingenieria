package com.soundcloud.android.discovery.systemplaylist;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: SystemPlaylistTrackItemRenderer.kt */
final class X implements OnClickListener {
    final /* synthetic */ Y a;
    final /* synthetic */ V b;

    X(Y y, V v) {
        this.a = y;
        this.b = v;
    }

    public final void onClick(View view) {
        this.a.a().a(this.b.c());
    }
}
