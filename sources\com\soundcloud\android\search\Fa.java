package com.soundcloud.android.search;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: SearchTrackItemRenderer.kt */
final class Fa implements OnClickListener {
    final /* synthetic */ Ga a;
    final /* synthetic */ Da b;

    Fa(Ga ga, Da da) {
        this.a = ga;
        this.b = da;
    }

    public final void onClick(View view) {
        this.a.a().a(this.b.e());
    }
}
