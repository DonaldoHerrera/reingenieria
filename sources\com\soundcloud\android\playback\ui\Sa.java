package com.soundcloud.android.playback.ui;

import android.widget.ImageView;

/* compiled from: BlurringPlayerArtworkLoader.kt */
final class Sa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Ra a;
    final /* synthetic */ Vca b;
    final /* synthetic */ ImageView c;

    Sa(Ra ra, Vca vca, ImageView imageView) {
        this.a = ra;
        this.b = vca;
        this.c = imageView;
    }

    /* renamed from: a */
    public final IPa<C4928GKa<Fd>> apply(C4928GKa<Fd> gKa) {
        C7471uYa.b(gKa, "it");
        return this.a.a(this.b, this.c).a((MPa<T>) IPa.a(gKa));
    }
}
