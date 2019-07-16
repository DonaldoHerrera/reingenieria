package com.soundcloud.android.image;

import android.graphics.drawable.TransitionDrawable;

/* renamed from: com.soundcloud.android.image.z reason: case insensitive filesystem */
/* compiled from: ImageModule_ProvidePlaceholderCacheFactory */
public final class C3744z implements C4961HMa<C2964dS<String, TransitionDrawable>> {
    private static final C3744z a = new C3744z();

    public static C3744z a() {
        return a;
    }

    public static C2964dS<String, TransitionDrawable> b() {
        C2964dS<String, TransitionDrawable> c = C3738t.c();
        C5023JMa.a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public C2964dS<String, TransitionDrawable> get() {
        return b();
    }
}
