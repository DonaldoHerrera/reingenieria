package com.soundcloud.android.image;

import android.graphics.drawable.Drawable;

/* compiled from: PicassoImageLoader.kt */
public final class xa extends Exception {
    public xa(Drawable drawable) {
        C7471uYa.b(drawable, "drawable");
        StringBuilder sb = new StringBuilder();
        sb.append("Could not extract bitmap from ");
        sb.append(HYa.a(drawable.getClass()));
        sb.append(" drawable. Please check extraction logic");
        super(sb.toString());
    }
}
