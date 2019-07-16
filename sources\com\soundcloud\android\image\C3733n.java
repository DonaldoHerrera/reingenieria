package com.soundcloud.android.image;

import android.graphics.Bitmap;
import android.graphics.drawable.TransitionDrawable;

/* renamed from: com.soundcloud.android.image.n reason: case insensitive filesystem */
/* compiled from: ImageCache_Factory */
public final class C3733n implements C4961HMa<C3730k> {
    private final C7054oVa<C2964dS<String, TransitionDrawable>> a;
    private final C7054oVa<C2964dS<C3508cda, Bitmap>> b;

    public C3733n(C7054oVa<C2964dS<String, TransitionDrawable>> ova, C7054oVa<C2964dS<C3508cda, Bitmap>> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3733n a(C7054oVa<C2964dS<String, TransitionDrawable>> ova, C7054oVa<C2964dS<C3508cda, Bitmap>> ova2) {
        return new C3733n(ova, ova2);
    }

    public C3730k get() {
        return new C3730k((C2964dS) this.a.get(), (C2964dS) this.b.get());
    }
}
