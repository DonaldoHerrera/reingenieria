package com.soundcloud.android.collection.recentlyplayed;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: RecentlyPlayedProfileRenderer.kt */
final class sa implements OnClickListener {
    final /* synthetic */ ua a;
    final /* synthetic */ C2804ca b;
    final /* synthetic */ int c;

    sa(ua uaVar, C2804ca caVar, int i) {
        this.a = uaVar;
        this.b = caVar;
        this.c = i;
    }

    public final void onClick(View view) {
        this.a.a(this.b);
    }
}
