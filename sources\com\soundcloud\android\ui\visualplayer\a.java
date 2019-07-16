package com.soundcloud.android.ui.visualplayer;

import android.view.View;
import android.widget.TextView;

/* compiled from: AdViewHolderFactory.kt */
public final class a extends C5378VEa<com.soundcloud.android.ui.visualplayer.c.a> {
    private final TextView a;

    public a(View view) {
        C7471uYa.b(view, "itemView");
        super(view);
        this.a = (TextView) view;
    }

    public void a(com.soundcloud.android.ui.visualplayer.c.a aVar) {
        C7471uYa.b(aVar, "item");
        this.a.setText(aVar.b().c().toString());
    }
}
