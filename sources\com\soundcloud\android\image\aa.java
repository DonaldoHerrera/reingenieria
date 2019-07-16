package com.soundcloud.android.image;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: ImageViewSetBitmapObserver.kt */
public final class aa implements C6776kQa<Bitmap> {
    private final WeakReference<ImageView> a;

    public aa(ImageView imageView) {
        C7471uYa.b(imageView, "imageView");
        this.a = new WeakReference<>(imageView);
    }

    /* renamed from: a */
    public void accept(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.a.get();
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
