package com.soundcloud.android.playback.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.soundcloud.android.image.N;

/* compiled from: PlayerWidgetPresenter_Factory */
public final class x implements C4961HMa<w> {
    private final C7054oVa<Context> a;
    private final C7054oVa<AppWidgetManager> b;
    private final C7054oVa<N> c;
    private final C7054oVa<HPa> d;

    public x(C7054oVa<Context> ova, C7054oVa<AppWidgetManager> ova2, C7054oVa<N> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static x a(C7054oVa<Context> ova, C7054oVa<AppWidgetManager> ova2, C7054oVa<N> ova3, C7054oVa<HPa> ova4) {
        return new x(ova, ova2, ova3, ova4);
    }

    public w get() {
        return new w((Context) this.a.get(), (AppWidgetManager) this.b.get(), (N) this.c.get(), (HPa) this.d.get());
    }
}
