package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.E.d;

/* renamed from: com.squareup.picasso.u reason: case insensitive filesystem */
/* compiled from: ImageViewAction */
class C6255u extends C6236a<ImageView> {
    C6247l m;

    C6255u(E e, ImageView imageView, K k, int i, int i2, int i3, Drawable drawable, String str, Object obj, C6247l lVar, boolean z) {
        super(e, imageView, k, i, i2, i3, drawable, str, obj, z);
        this.m = lVar;
    }

    public void a(Bitmap bitmap, d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.c.get();
            if (imageView != null) {
                E e = this.a;
                Bitmap bitmap2 = bitmap;
                d dVar2 = dVar;
                H.a(imageView, e.g, bitmap2, dVar2, this.d, e.o);
                C6247l lVar = this.m;
                if (lVar != null) {
                    lVar.onSuccess();
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public void a(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i = this.g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable2 = this.h;
                if (drawable2 != null) {
                    imageView.setImageDrawable(drawable2);
                }
            }
            C6247l lVar = this.m;
            if (lVar != null) {
                lVar.a(exc);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        super.a();
        if (this.m != null) {
            this.m = null;
        }
    }
}
