package com.soundcloud.android.collection.recentlyplayed;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.view.OverflowAnchorImageButton;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.ea reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedPlaylistRenderer.kt */
final class C2808ea implements OnClickListener {
    final /* synthetic */ C2810fa a;
    final /* synthetic */ OverflowAnchorImageButton b;
    final /* synthetic */ C2804ca c;

    C2808ea(C2810fa faVar, OverflowAnchorImageButton overflowAnchorImageButton, C2804ca caVar) {
        this.a = faVar;
        this.b = overflowAnchorImageButton;
        this.c = caVar;
    }

    public final void onClick(View view) {
        this.a.d.a((View) this.b, this.c.a());
    }
}
