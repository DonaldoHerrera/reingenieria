package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.C2526g;

/* renamed from: com.soundcloud.android.playback.xa reason: case insensitive filesystem */
/* compiled from: HlsStreamUrlBuilder_Factory */
public final class C4524xa implements C4961HMa<C4517wa> {
    private final C7054oVa<C2526g> a;
    private final C7054oVa<C2961dP> b;

    public C4524xa(C7054oVa<C2526g> ova, C7054oVa<C2961dP> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4524xa a(C7054oVa<C2526g> ova, C7054oVa<C2961dP> ova2) {
        return new C4524xa(ova, ova2);
    }

    public C4517wa get() {
        return new C4517wa((C2526g) this.a.get(), (C2961dP) this.b.get());
    }
}
