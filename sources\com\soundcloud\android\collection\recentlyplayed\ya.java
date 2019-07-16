package com.soundcloud.android.collection.recentlyplayed;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.view.OverflowAnchorImageButton;

/* compiled from: RecentlyPlayedStationRenderer.kt */
final class ya implements OnClickListener {
    final /* synthetic */ za a;
    final /* synthetic */ OverflowAnchorImageButton b;
    final /* synthetic */ C2804ca c;

    ya(za zaVar, OverflowAnchorImageButton overflowAnchorImageButton, C2804ca caVar) {
        this.a = zaVar;
        this.b = overflowAnchorImageButton;
        this.c = caVar;
    }

    public final void onClick(View view) {
        this.a.d.a(this.b, this.c.a());
    }
}
