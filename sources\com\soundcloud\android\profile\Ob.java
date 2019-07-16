package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: UserLinksRenderer.kt */
final class Ob implements OnClickListener {
    final /* synthetic */ C4892FFa a;
    final /* synthetic */ Nb b;
    final /* synthetic */ View c;

    Ob(C4892FFa fFa, Nb nb, View view) {
        this.a = fFa;
        this.b = nb;
        this.c = view;
    }

    public final void onClick(View view) {
        this.b.a.a(this.a.d());
    }
}
