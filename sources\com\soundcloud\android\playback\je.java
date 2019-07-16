package com.soundcloud.android.playback;

import com.soundcloud.android.properties.j;

/* compiled from: VideoSourceProvider_Factory */
public final class je implements C4961HMa<ie> {
    private final C7054oVa<C6699jHa> a;
    private final C7054oVa<Da> b;
    private final C7054oVa<C6834lGa> c;
    private final C7054oVa<j> d;

    public je(C7054oVa<C6699jHa> ova, C7054oVa<Da> ova2, C7054oVa<C6834lGa> ova3, C7054oVa<j> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static je a(C7054oVa<C6699jHa> ova, C7054oVa<Da> ova2, C7054oVa<C6834lGa> ova3, C7054oVa<j> ova4) {
        return new je(ova, ova2, ova3, ova4);
    }

    public ie get() {
        return new ie((C6699jHa) this.a.get(), (Da) this.b.get(), (C6834lGa) this.c.get(), (j) this.d.get());
    }
}
