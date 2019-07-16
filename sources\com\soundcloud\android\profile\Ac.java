package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: UserPlaylistsItemRenderer.kt */
final class Ac implements OnClickListener {
    final /* synthetic */ Bc a;
    final /* synthetic */ C5877yc b;

    Ac(Bc bc, C5877yc ycVar) {
        this.a = bc;
        this.b = ycVar;
    }

    public final void onClick(View view) {
        this.a.a().a(this.b.b());
    }
}
