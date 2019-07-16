package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
class i extends Drawable {
    private float a;
    private final Paint b;
    private final RectF c;
    private final Rect d;
    private float e;
    private boolean f = false;
    private boolean g = true;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private Mode k = Mode.SRC_IN;

    i(ColorStateList colorStateList, float f2) {
        this.a = f2;
        this.b = new Paint(5);
        b(colorStateList);
        this.c = new RectF();
        this.d = new Rect();
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.b.setColor(this.h.getColorForState(getState(), this.h.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2, boolean z, boolean z2) {
        if (f2 != this.e || this.f != z || this.g != z2) {
            this.e = f2;
            this.f = z;
            this.g = z2;
            a((Rect) null);
            invalidateSelf();
        }
    }

    public float c() {
        return this.a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.c;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.h;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.b.getColor();
        if (z) {
            this.b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 != null) {
            Mode mode = this.k;
            if (mode != null) {
                this.i = a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    public float b() {
        return this.e;
    }

    private void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.d.set(rect);
        if (this.f) {
            float b2 = j.b(this.e, this.a, this.g);
            this.d.inset((int) Math.ceil((double) j.a(this.e, this.a, this.g)), (int) Math.ceil((double) b2));
            this.c.set(this.d);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        if (f2 != this.a) {
            this.a = f2;
            a((Rect) null);
            invalidateSelf();
        }
    }

    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    public ColorStateList a() {
        return this.h;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
