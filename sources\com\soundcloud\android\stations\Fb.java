package com.soundcloud.android.stations;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: StationRenderer.kt */
final class Fb implements OnClickListener {
    final /* synthetic */ Gb a;
    final /* synthetic */ Sda b;

    Fb(Gb gb, Sda sda) {
        this.a = gb;
        this.b = sda;
    }

    public final void onClick(View view) {
        this.a.a().a(this.b.a());
    }
}
