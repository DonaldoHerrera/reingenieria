package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ba;

/* renamed from: com.soundcloud.android.playback.ui.xb reason: case insensitive filesystem */
/* compiled from: PlayerArtworkLoader.kt */
public class C4504xb {
    private final N a;
    private final Resources b;
    private final HPa c;

    public C4504xb(N n, Resources resources, HPa hPa) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(resources, "resources");
        C7471uYa.b(hPa, "scheduler");
        this.a = n;
        this.b = resources;
        this.c = hPa;
    }

    /* access modifiers changed from: protected */
    public final N a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final Resources b() {
        return this.b;
    }

    public IPa<C4928GKa<Fd>> a(Vca vca, ImageView imageView, ImageView imageView2, boolean z) {
        C7471uYa.b(vca, "imageResource");
        C7471uYa.b(imageView, "wrappedImageView");
        C3721b b2 = C3721b.b(this.b);
        IPa a2 = this.a.a(this.b, vca.a(), vca.b(), this.c).f(C4498vb.a).a((MPa<? extends T>) IPa.a(C4928GKa.a())).a(RPa.a());
        C4501wb wbVar = new C4501wb(this, vca, b2, imageView, z);
        IPa<C4928GKa<Fd>> a3 = a2.a((C7118pQa<? super T, ? extends MPa<? extends R>>) wbVar);
        C7471uYa.a((Object) a3, "imageOperations.getCache…Null(), isHighPriority) }");
        return a3;
    }

    public C7531vPa<Bitmap> a(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        N n = this.a;
        C3721b b2 = C3721b.b(this.b);
        C7471uYa.a((Object) b2, "ApiImageSize.getFullImageSize(resources)");
        return n.a(cda, b2, ba.AD);
    }
}
