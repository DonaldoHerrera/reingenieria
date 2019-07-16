package com.soundcloud.android.collection.recentlyplayed;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.view.OverflowAnchorImageButton;

/* compiled from: RecentlyPlayedProfileRenderer.kt */
final class ta implements OnClickListener {
    final /* synthetic */ ua a;
    final /* synthetic */ OverflowAnchorImageButton b;
    final /* synthetic */ C2804ca c;
    final /* synthetic */ int d;

    ta(ua uaVar, OverflowAnchorImageButton overflowAnchorImageButton, C2804ca caVar, int i) {
        this.a = uaVar;
        this.b = overflowAnchorImageButton;
        this.c = caVar;
        this.d = i;
    }

    public final void onClick(View view) {
        C5231QFa b2 = this.a.e;
        OverflowAnchorImageButton overflowAnchorImageButton = this.b;
        C3508cda a2 = this.c.a();
        String a3 = this.a.d.b().a();
        v vVar = r5;
        v vVar2 = new v("recently_played", this.d);
        C3710l lVar = r4;
        C3710l lVar2 = new C3710l(null, a3, vVar, false, null, null, null, null, null, null, null, null, null, null, 16377, null);
        b2.a(overflowAnchorImageButton, a2, lVar);
    }
}
