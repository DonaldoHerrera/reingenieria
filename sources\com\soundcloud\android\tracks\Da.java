package com.soundcloud.android.tracks;

import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.playback.C4416rb;

/* compiled from: TrackItemRepository_Factory */
public final class Da implements C4961HMa<Ca> {
    private final C7054oVa<C3760eea> a;
    private final C7054oVa<C3501bea> b;
    private final C7054oVa<C5425Wta> c;
    private final C7054oVa<C3989m> d;
    private final C7054oVa<C2210OR> e;
    private final C7054oVa<C4416rb> f;
    private final C7054oVa<C3815lda> g;

    public Da(C7054oVa<C3760eea> ova, C7054oVa<C3501bea> ova2, C7054oVa<C5425Wta> ova3, C7054oVa<C3989m> ova4, C7054oVa<C2210OR> ova5, C7054oVa<C4416rb> ova6, C7054oVa<C3815lda> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static Da a(C7054oVa<C3760eea> ova, C7054oVa<C3501bea> ova2, C7054oVa<C5425Wta> ova3, C7054oVa<C3989m> ova4, C7054oVa<C2210OR> ova5, C7054oVa<C4416rb> ova6, C7054oVa<C3815lda> ova7) {
        Da da = new Da(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return da;
    }

    public Ca get() {
        Ca ca = new Ca((C3760eea) this.a.get(), (C3501bea) this.b.get(), (C5425Wta) this.c.get(), (C3989m) this.d.get(), (C2210OR) this.e.get(), (C4416rb) this.f.get(), (C3815lda) this.g.get());
        return ca;
    }
}
