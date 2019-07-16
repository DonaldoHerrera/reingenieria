package com.soundcloud.android.upgrade;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* compiled from: CrossfadeDrawable */
final class c extends BitmapDrawable {
    private Drawable a;
    private final long b;
    private boolean c;
    private int d = 255;

    c(Context context, Bitmap bitmap, Drawable drawable) {
        super(context.getResources(), bitmap);
        this.a = drawable;
        this.c = true;
        this.b = SystemClock.uptimeMillis();
    }

    static void a(ImageView imageView, Bitmap bitmap) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new c(imageView.getContext(), bitmap, drawable));
    }

    public void draw(Canvas canvas) {
        if (!this.c) {
            super.draw(canvas);
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.b)) / 400.0f;
        if (uptimeMillis >= 1.0f) {
            this.c = false;
            this.a = null;
            super.draw(canvas);
            return;
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        super.setAlpha((int) (((float) this.d) * uptimeMillis));
        super.draw(canvas);
        super.setAlpha(this.d);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.d = i;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
