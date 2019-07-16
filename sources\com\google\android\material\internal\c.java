package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: CircularBorderDrawable */
public class c extends Drawable {
    final Paint a = new Paint(1);
    final Rect b = new Rect();
    final RectF c = new RectF();
    final a d = new a();
    float e;
    private int f;
    private int g;
    private int h;
    private int i;
    private ColorStateList j;
    private int k;
    private boolean l = true;
    private float m;

    /* compiled from: CircularBorderDrawable */
    private class a extends ConstantState {
        private a() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return c.this;
        }
    }

    public c() {
        this.a.setStyle(Style.STROKE);
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final void b(float f2) {
        if (f2 != this.m) {
            this.m = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.l) {
            this.a.setShader(a());
            this.l = false;
        }
        float strokeWidth = this.a.getStrokeWidth() / 2.0f;
        RectF rectF = this.c;
        copyBounds(this.b);
        rectF.set(this.b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.a);
        canvas.restore();
    }

    public ConstantState getConstantState() {
        return this.d;
    }

    public int getOpacity() {
        return this.e > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.e);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.k);
            if (colorForState != this.k) {
                this.l = true;
                this.k = colorForState;
            }
        }
        if (this.l) {
            invalidateSelf();
        }
        return this.l;
    }

    public void setAlpha(int i2) {
        this.a.setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void a(float f2) {
        if (this.e != f2) {
            this.e = f2;
            this.a.setStrokeWidth(f2 * 1.3333f);
            this.l = true;
            invalidateSelf();
        }
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.k = colorStateList.getColorForState(getState(), this.k);
        }
        this.j = colorStateList;
        this.l = true;
        invalidateSelf();
    }

    private Shader a() {
        Rect rect = this.b;
        copyBounds(rect);
        float height = this.e / ((float) rect.height());
        LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0301ab.b(this.f, this.k), C0301ab.b(this.g, this.k), C0301ab.b(C0301ab.c(this.g, 0), this.k), C0301ab.b(C0301ab.c(this.i, 0), this.k), C0301ab.b(this.i, this.k), C0301ab.b(this.h, this.k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
        return linearGradient;
    }
}
