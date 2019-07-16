package com.soundcloud.android.playback;

import com.soundcloud.android.playback.ui.view.g;

/* renamed from: com.soundcloud.android.playback.ua reason: case insensitive filesystem */
/* compiled from: ExpandPlayerCommand_Factory */
public final class C4430ua implements C4961HMa<C4425ta> {
    private final C7054oVa<g> a;
    private final C7054oVa<C5327TLa> b;

    public C4430ua(C7054oVa<g> ova, C7054oVa<C5327TLa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4430ua a(C7054oVa<g> ova, C7054oVa<C5327TLa> ova2) {
        return new C4430ua(ova, ova2);
    }

    public C4425ta get() {
        return new C4425ta((g) this.a.get(), (C5327TLa) this.b.get());
    }
}
