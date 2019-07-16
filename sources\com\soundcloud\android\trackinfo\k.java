package com.soundcloud.android.trackinfo;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: NewTrackInfoAdapter.kt */
final class k implements OnClickListener {
    final /* synthetic */ l a;
    final /* synthetic */ B b;

    k(l lVar, B b2) {
        this.a = lVar;
        this.b = b2;
    }

    public final void onClick(View view) {
        this.a.p.a(this.b.a().b().y(), this.b.a().b().r());
    }
}
