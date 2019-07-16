package com.soundcloud.android.playback.ui;

import android.content.res.Resources;

/* renamed from: com.soundcloud.android.playback.ui.kb reason: case insensitive filesystem */
/* compiled from: OverlayAnimator_Factory */
public final class C4466kb implements C4961HMa<C4463jb> {
    private final C7054oVa<Resources> a;

    public C4466kb(C7054oVa<Resources> ova) {
        this.a = ova;
    }

    public static C4466kb a(C7054oVa<Resources> ova) {
        return new C4466kb(ova);
    }

    public C4463jb get() {
        return new C4463jb((Resources) this.a.get());
    }
}
