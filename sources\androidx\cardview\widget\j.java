package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow */
class j extends Drawable {
    private static final double a = Math.cos(Math.toRadians(45.0d));
    static a b;
    private final int c;
    private Paint d;
    private Paint e;
    private Paint f;
    private final RectF g;
    private float h;
    private Path i;
    private float j;
    private float k;
    private float l;
    private ColorStateList m;
    private boolean n = true;
    private final int o;
    private final int p;
    private boolean q = true;
    private boolean r = false;

    /* compiled from: RoundRectDrawableWithShadow */
    interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    j(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.o = resources.getColor(N.cardview_shadow_start_color);
        this.p = resources.getColor(N.cardview_shadow_end_color);
        this.c = resources.getDimensionPixelSize(O.cardview_compat_inset_shadow);
        this.d = new Paint(5);
        b(colorStateList);
        this.e = new Paint(5);
        this.e.setStyle(Style.FILL);
        this.h = (float) ((int) (f2 + 0.5f));
        this.g = new RectF();
        this.f = new Paint(this.e);
        this.f.setAntiAlias(false);
        a(f3, f4);
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.m = colorStateList;
        this.d.setColor(this.m.getColorForState(getState(), this.m.getDefaultColor()));
    }

    private int d(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    private void g() {
        float f2 = this.h;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.k;
        rectF2.inset(-f3, -f3);
        Path path = this.i;
        if (path == null) {
            this.i = new Path();
        } else {
            path.reset();
        }
        this.i.setFillType(FillType.EVEN_ODD);
        this.i.moveTo(-this.h, 0.0f);
        this.i.rLineTo(-this.k, 0.0f);
        this.i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.i.arcTo(rectF, 270.0f, -90.0f, false);
        this.i.close();
        float f4 = this.h;
        float f5 = this.k;
        float f6 = f4 / (f4 + f5);
        Paint paint = this.e;
        float f7 = f4 + f5;
        int i2 = this.o;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f7, new int[]{i2, i2, this.p}, new float[]{0.0f, f6, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f;
        float f8 = this.h;
        float f9 = -f8;
        float f10 = this.k;
        float f11 = f9 + f10;
        float f12 = (-f8) - f10;
        int i3 = this.o;
        LinearGradient linearGradient = new LinearGradient(0.0f, f11, 0.0f, f12, new int[]{i3, i3, this.p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f.setAntiAlias(false);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    public void c(float f2) {
        a(f2, this.j);
    }

    public void draw(Canvas canvas) {
        if (this.n) {
            b(getBounds());
            this.n = false;
        }
        canvas.translate(0.0f, this.l / 2.0f);
        a(canvas);
        canvas.translate(0.0f, (-this.l) / 2.0f);
        b.a(canvas, this.g, this.h, this.d);
    }

    /* access modifiers changed from: 0000 */
    public float e() {
        float f2 = this.j;
        return (Math.max(f2, this.h + ((float) this.c) + (f2 / 2.0f)) * 2.0f) + ((this.j + ((float) this.c)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    public float f() {
        return this.l;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) b(this.j, this.h, this.q));
        int ceil2 = (int) Math.ceil((double) a(this.j, this.h, this.q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.d.getColor() == colorForState) {
            return false;
        }
        this.d.setColor(colorForState);
        this.n = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i2) {
        this.d.setAlpha(i2);
        this.e.setAlpha(i2);
        this.f.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: 0000 */
    public float c() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public float d() {
        float f2 = this.j;
        return (Math.max(f2, this.h + ((float) this.c) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.j * 1.5f) + ((float) this.c)) * 2.0f);
    }

    private void a(float f2, float f3) {
        String str = ". Must be >= 0";
        if (f2 < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f2);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f3 >= 0.0f) {
            float d2 = (float) d(f2);
            float d3 = (float) d(f3);
            if (d2 > d3) {
                if (!this.r) {
                    this.r = true;
                }
                d2 = d3;
            }
            if (this.l != d2 || this.j != d3) {
                this.l = d2;
                this.j = d3;
                this.k = (float) ((int) ((d2 * 1.5f) + ((float) this.c) + 0.5f));
                this.n = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f3);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static float b(float f2, float f3, boolean z) {
        return z ? (float) (((double) (f2 * 1.5f)) + ((1.0d - a) * ((double) f3))) : f2 * 1.5f;
    }

    private void b(Rect rect) {
        float f2 = this.j;
        float f3 = 1.5f * f2;
        this.g.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        g();
    }

    /* access modifiers changed from: 0000 */
    public float b() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public void b(float f2) {
        a(this.l, f2);
    }

    static float a(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - a) * ((double) f3))) : f2;
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (this.h != f3) {
                this.h = f3;
                this.n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid radius ");
        sb.append(f2);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    private void a(Canvas canvas) {
        float f2 = this.h;
        float f3 = (-f2) - this.k;
        float f4 = f2 + ((float) this.c) + (this.l / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.g.width() - f5 > 0.0f;
        boolean z2 = this.g.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.g;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.i, this.e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.g.width() - f5, -this.h, this.f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.g;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.i, this.e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.g.width() - f5, (-this.h) + this.k, this.f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.g;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.i, this.e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.g.height() - f5, -this.h, this.f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.g;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.i, this.e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.g.height() - f5, -this.h, this.f);
        }
        canvas.restoreToCount(save4);
    }

    /* access modifiers changed from: 0000 */
    public void a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    public ColorStateList a() {
        return this.m;
    }
}
