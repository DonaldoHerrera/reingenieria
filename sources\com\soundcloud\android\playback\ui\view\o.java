package com.soundcloud.android.playback.ui.view;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: VisualPlayerCommentsPresenter.kt */
final class o implements OnClickListener {
    final /* synthetic */ n a;
    final /* synthetic */ C3799jda b;

    o(n nVar, C3799jda jda) {
        this.a = nVar;
        this.b = jda;
    }

    public final void onClick(View view) {
        this.a.c().accept(this.b);
    }
}
