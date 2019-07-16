package com.soundcloud.android.image;

import com.squareup.picasso.C6246k;

/* renamed from: com.soundcloud.android.image.w reason: case insensitive filesystem */
/* compiled from: ImageModule_ProvidePicassoCacheFactory */
public final class C3741w implements C4961HMa<C6246k> {
    private static final C3741w a = new C3741w();

    public static C3741w a() {
        return a;
    }

    public static C6246k b() {
        C6246k b = C3738t.b();
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C6246k get() {
        return b();
    }
}
