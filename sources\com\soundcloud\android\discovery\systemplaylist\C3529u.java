package com.soundcloud.android.discovery.systemplaylist;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.u reason: case insensitive filesystem */
/* compiled from: SystemPlaylistHeaderItemRenderer.kt */
final class C3529u implements OnClickListener {
    final /* synthetic */ C3530v a;
    final /* synthetic */ C3527s b;

    C3529u(C3530v vVar, C3527s sVar) {
        this.a = vVar;
        this.b = sVar;
    }

    public final void onClick(View view) {
        this.a.a().a(this.b.c());
    }
}
