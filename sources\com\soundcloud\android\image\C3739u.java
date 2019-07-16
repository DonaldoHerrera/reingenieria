package com.soundcloud.android.image;

import android.graphics.Bitmap;

/* renamed from: com.soundcloud.android.image.u reason: case insensitive filesystem */
/* compiled from: ImageModule_ProvideBlurredImageCacheFactory */
public final class C3739u implements C4961HMa<C2964dS<C3508cda, Bitmap>> {
    private static final C3739u a = new C3739u();

    public static C3739u a() {
        return a;
    }

    public static C2964dS<C3508cda, Bitmap> b() {
        C2964dS<C3508cda, Bitmap> a2 = C3738t.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2964dS<C3508cda, Bitmap> get() {
        return b();
    }
}
