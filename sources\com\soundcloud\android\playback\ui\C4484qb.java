package com.soundcloud.android.playback.ui;

import android.graphics.Color;
import com.soundcloud.android.foundation.ads.da;

/* renamed from: com.soundcloud.android.playback.ui.qb reason: case insensitive filesystem */
/* compiled from: PlayerAd.kt */
final class C4484qb extends C7540vYa implements PXa<Integer> {
    final /* synthetic */ C4489sb a;

    C4484qb(C4489sb sbVar) {
        this.a = sbVar;
        super(0);
    }

    public final int d() {
        da n = this.a.g().n();
        return Color.parseColor(n != null ? n.e() : null);
    }
}
