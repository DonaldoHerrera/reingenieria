package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.tracks.Ca;

/* renamed from: com.soundcloud.android.features.library.likes.search.f reason: case insensitive filesystem */
/* compiled from: LikesDataSource_Factory */
public final class C3610f implements C4961HMa<C3609e> {
    private final C7054oVa<K> a;
    private final C7054oVa<Ca> b;
    private final C7054oVa<HPa> c;
    private final C7054oVa<Aa> d;

    public C3610f(C7054oVa<K> ova, C7054oVa<Ca> ova2, C7054oVa<HPa> ova3, C7054oVa<Aa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3610f a(C7054oVa<K> ova, C7054oVa<Ca> ova2, C7054oVa<HPa> ova3, C7054oVa<Aa> ova4) {
        return new C3610f(ova, ova2, ova3, ova4);
    }

    public C3609e get() {
        return new C3609e((K) this.a.get(), (Ca) this.b.get(), (HPa) this.c.get(), (Aa) this.d.get());
    }
}
