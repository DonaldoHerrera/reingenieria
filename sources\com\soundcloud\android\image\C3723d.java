package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.c;
import com.squareup.picasso.U;

/* renamed from: com.soundcloud.android.image.d reason: case insensitive filesystem */
/* compiled from: PicassoImageLoader.kt */
final class C3723d implements U {
    private final Resources a;

    public C3723d(Resources resources) {
        C7471uYa.b(resources, "resources");
        this.a = resources;
    }

    public Bitmap a(Bitmap bitmap) {
        C7471uYa.b(bitmap, "source");
        c a2 = Z.a(bitmap, this.a);
        C7471uYa.a((Object) a2, "ImageUtils.createCircula…awable(source, resources)");
        Bitmap a3 = Z.a(a2, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
        bitmap.recycle();
        C7471uYa.a((Object) a3, "newBitmap");
        return a3;
    }

    public String a() {
        return "circle";
    }
}
