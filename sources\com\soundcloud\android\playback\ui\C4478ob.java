package com.soundcloud.android.playback.ui;

import android.graphics.Color;
import com.soundcloud.android.foundation.ads.da;

/* renamed from: com.soundcloud.android.playback.ui.ob reason: case insensitive filesystem */
/* compiled from: PlayerAd.kt */
final class C4478ob extends C7540vYa implements PXa<Integer> {
    final /* synthetic */ C4489sb a;

    C4478ob(C4489sb sbVar) {
        this.a = sbVar;
        super(0);
    }

    public final int d() {
        da n = this.a.g().n();
        return Color.parseColor(n != null ? n.c() : null);
    }
}
