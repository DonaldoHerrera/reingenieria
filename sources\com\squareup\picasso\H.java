package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.E.d;

/* compiled from: PicassoDrawable */
final class H extends BitmapDrawable {
    private static final Paint a = new Paint();
    private final boolean b;
    private final float c;
    private final d d;
    Drawable e;
    long f;
    boolean g;
    int h = 255;

    H(Context context, Bitmap bitmap, Drawable drawable, d dVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.b = z2;
        this.c = context.getResources().getDisplayMetrics().density;
        this.d = dVar;
        if (dVar != d.MEMORY && !z) {
            this.e = drawable;
            this.g = true;
            this.f = SystemClock.uptimeMillis();
        }
    }

    static void a(ImageView imageView, Context context, Bitmap bitmap, d dVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        H h2 = new H(context, bitmap, drawable, dVar, z, z2);
        imageView.setImageDrawable(h2);
    }

    public void draw(Canvas canvas) {
        if (!this.g) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.g = false;
                this.e = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.e;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.h) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.h);
            }
        }
        if (this.b) {
            a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.h = i;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    private void a(Canvas canvas) {
        a.setColor(-1);
        canvas.drawPath(a(0, 0, (int) (this.c * 16.0f)), a);
        a.setColor(this.d.e);
        canvas.drawPath(a(0, 0, (int) (this.c * 15.0f)), a);
    }

    private static Path a(int i, int i2, int i3) {
        Path path = new Path();
        float f2 = (float) i;
        float f3 = (float) i2;
        path.moveTo(f2, f3);
        path.lineTo((float) (i + i3), f3);
        path.lineTo(f2, (float) (i2 + i3));
        return path;
    }
}
