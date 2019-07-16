package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.collection.Aa;

/* renamed from: com.soundcloud.android.features.library.likes.search.k reason: case insensitive filesystem */
/* compiled from: LikesSearchDataSource_Factory */
public final class C3615k implements C4961HMa<C3614j> {
    private final C7054oVa<C3609e> a;
    private final C7054oVa<Aa> b;

    public C3615k(C7054oVa<C3609e> ova, C7054oVa<Aa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3615k a(C7054oVa<C3609e> ova, C7054oVa<Aa> ova2) {
        return new C3615k(ova, ova2);
    }

    public C3614j get() {
        return new C3614j((C3609e) this.a.get(), (Aa) this.b.get());
    }
}
