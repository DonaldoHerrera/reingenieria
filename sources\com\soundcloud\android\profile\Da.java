package com.soundcloud.android.profile;

import android.graphics.Bitmap;

/* compiled from: ProfileImageHelper.kt */
final class Da<T, R> implements C7118pQa<T, MPa<? extends R>> {
    public static final Da a = new Da();

    Da() {
    }

    /* renamed from: a */
    public final IPa<Fd> apply(Bitmap bitmap) {
        C7471uYa.b(bitmap, "bitmap");
        return IPa.a((LPa<T>) new Ca<T>(bitmap));
    }
}
