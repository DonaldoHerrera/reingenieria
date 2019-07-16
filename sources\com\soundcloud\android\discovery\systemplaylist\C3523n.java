package com.soundcloud.android.discovery.systemplaylist;

import android.view.animation.AnimationUtils;
import com.soundcloud.android.ia.a;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.n reason: case insensitive filesystem */
/* compiled from: SystemPlaylistArtworkView */
class C3523n extends C4943Gua {
    final /* synthetic */ SystemPlaylistArtworkView d;

    public void onComplete() {
        this.d.b.startFlipping();
        this.d.b.setInAnimation(AnimationUtils.loadAnimation(this.d.b.getContext(), a.slow_fade_in));
        this.d.b.setOutAnimation(AnimationUtils.loadAnimation(this.d.b.getContext(), a.slow_fade_out));
    }
}
