package com.soundcloud.android.playback.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.playback.ui.wb reason: case insensitive filesystem */
/* compiled from: PlayerArtworkLoader.kt */
final class C4501wb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4504xb a;
    final /* synthetic */ Vca b;
    final /* synthetic */ C3721b c;
    final /* synthetic */ ImageView d;
    final /* synthetic */ boolean e;

    C4501wb(C4504xb xbVar, Vca vca, C3721b bVar, ImageView imageView, boolean z) {
        this.a = xbVar;
        this.b = vca;
        this.c = bVar;
        this.d = imageView;
        this.e = z;
    }

    /* renamed from: a */
    public final IPa<C4928GKa<Fd>> apply(C4928GKa<Bitmap> gKa) {
        C7471uYa.b(gKa, "bitmap");
        N a2 = this.a.a();
        C3508cda a3 = this.b.a();
        C4928GKa b2 = this.b.b();
        C3721b bVar = this.c;
        C7471uYa.a((Object) bVar, "size");
        return a2.a(a3, b2, bVar, this.d, (Bitmap) gKa.d(), this.e);
    }
}
