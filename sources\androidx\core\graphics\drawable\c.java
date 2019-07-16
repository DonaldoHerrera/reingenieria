package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* compiled from: RoundedBitmapDrawable */
public abstract class c extends Drawable {
    final Bitmap a;
    private int b = 160;
    private int c = 119;
    private final Paint d = new Paint(3);
    private final BitmapShader e;
    private final Matrix f = new Matrix();
    private float g;
    final Rect h = new Rect();
    private final RectF i = new RectF();
    private boolean j = true;
    private boolean k;
    private int l;
    private int m;

    c(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.b = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (this.a != null) {
            d();
            Bitmap bitmap2 = this.a;
            TileMode tileMode = TileMode.CLAMP;
            this.e = new BitmapShader(bitmap2, tileMode, tileMode);
            return;
        }
        this.m = -1;
        this.l = -1;
        this.e = null;
    }

    private static boolean b(float f2) {
        return f2 > 0.05f;
    }

    private void d() {
        this.l = this.a.getScaledWidth(this.b);
        this.m = this.a.getScaledHeight(this.b);
    }

    private void e() {
        this.g = (float) (Math.min(this.m, this.l) / 2);
    }

    public final Bitmap a() {
        return this.a;
    }

    public float b() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.j) {
            if (this.k) {
                int min = Math.min(this.l, this.m);
                a(this.c, min, min, getBounds(), this.h);
                int min2 = Math.min(this.h.width(), this.h.height());
                this.h.inset(Math.max(0, (this.h.width() - min2) / 2), Math.max(0, (this.h.height() - min2) / 2));
                this.g = ((float) min2) * 0.5f;
            } else {
                a(this.c, this.l, this.m, getBounds(), this.h);
            }
            this.i.set(this.h);
            if (this.e != null) {
                Matrix matrix = this.f;
                RectF rectF = this.i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f.preScale(this.i.width() / ((float) this.a.getWidth()), this.i.height() / ((float) this.a.getHeight()));
                this.e.setLocalMatrix(this.f);
                this.d.setShader(this.e);
            }
            this.j = false;
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            c();
            if (this.d.getShader() == null) {
                canvas.drawBitmap(bitmap, null, this.h, this.d);
            } else {
                RectF rectF = this.i;
                float f2 = this.g;
                canvas.drawRoundRect(rectF, f2, f2, this.d);
            }
        }
    }

    public int getAlpha() {
        return this.d.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.m;
    }

    public int getIntrinsicWidth() {
        return this.l;
    }

    public int getOpacity() {
        if (this.c != 119 || this.k) {
            return -3;
        }
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || b(this.g)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            e();
        }
        this.j = true;
    }

    public void setAlpha(int i2) {
        if (i2 != this.d.getAlpha()) {
            this.d.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.d.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, int i4, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public void a(boolean z) {
        this.k = z;
        this.j = true;
        if (z) {
            e();
            this.d.setShader(this.e);
            invalidateSelf();
            return;
        }
        a(0.0f);
    }

    public void a(float f2) {
        if (this.g != f2) {
            this.k = false;
            if (b(f2)) {
                this.d.setShader(this.e);
            } else {
                this.d.setShader(null);
            }
            this.g = f2;
            invalidateSelf();
        }
    }
}
