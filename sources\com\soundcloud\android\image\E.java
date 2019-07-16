package com.soundcloud.android.image;

import android.graphics.Bitmap;

/* compiled from: ImageOperations.kt */
final /* synthetic */ class E extends C7402tYa implements _Xa<APa<ca>, APa<Bitmap>> {
    E(N n) {
        super(1, n);
    }

    /* renamed from: a */
    public final APa<Bitmap> invoke(APa<ca> aPa) {
        C7471uYa.b(aPa, "p1");
        return ((N) this.c).a(aPa);
    }

    public final String getName() {
        return "toBitmap";
    }

    public final C7610wZa h() {
        return HYa.a(N.class);
    }

    public final String j() {
        return "toBitmap(Lio/reactivex/Observable;)Lio/reactivex/Observable;";
    }
}
