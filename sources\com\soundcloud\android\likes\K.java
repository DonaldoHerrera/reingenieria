package com.soundcloud.android.likes;

import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.tracks.Ca;

/* compiled from: TrackLikeOperations_Factory */
public final class K implements C4961HMa<C4001z> {
    private final C7054oVa<com.soundcloud.android.collections.data.K> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<Ca> c;
    private final C7054oVa<C3989m> d;
    private final C7054oVa<Aa> e;

    public K(C7054oVa<com.soundcloud.android.collections.data.K> ova, C7054oVa<HPa> ova2, C7054oVa<Ca> ova3, C7054oVa<C3989m> ova4, C7054oVa<Aa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static K a(C7054oVa<com.soundcloud.android.collections.data.K> ova, C7054oVa<HPa> ova2, C7054oVa<Ca> ova3, C7054oVa<C3989m> ova4, C7054oVa<Aa> ova5) {
        K k = new K(ova, ova2, ova3, ova4, ova5);
        return k;
    }

    public C4001z get() {
        C4001z zVar = new C4001z((com.soundcloud.android.collections.data.K) this.a.get(), (HPa) this.b.get(), (Ca) this.c.get(), (C3989m) this.d.get(), (Aa) this.e.get());
        return zVar;
    }
}
