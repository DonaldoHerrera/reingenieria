package com.soundcloud.android.crop;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import com.soundcloud.android.crop.r.i;

/* compiled from: HighlightView */
class m {
    RectF a;
    Rect b;
    Matrix c;
    private RectF d;
    private final Paint e = new Paint();
    private final Paint f = new Paint();
    private final Paint g = new Paint();
    private View h;
    private boolean i;
    private boolean j;
    private int k;
    private b l = b.None;
    private a m = a.Changing;
    private boolean n;
    private float o;
    private float p;
    private float q;
    private boolean r;

    /* compiled from: HighlightView */
    enum a {
        Changing,
        Always,
        Never
    }

    /* compiled from: HighlightView */
    enum b {
        None,
        Move,
        Grow
    }

    public m(View view) {
        this.h = view;
        a(view.getContext());
    }

    private void a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.soundcloud.android.crop.r.a.cropImageStyle, typedValue, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, i.CropImageView);
        try {
            this.i = obtainStyledAttributes.getBoolean(i.CropImageView_showThirds, false);
            this.j = obtainStyledAttributes.getBoolean(i.CropImageView_showCircle, false);
            this.k = obtainStyledAttributes.getColor(i.CropImageView_highlightColor, -13388315);
            this.m = a.values()[obtainStyledAttributes.getInt(i.CropImageView_showHandles, 0)];
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private float b(float f2) {
        return f2 * this.h.getResources().getDisplayMetrics().density;
    }

    private void c(Canvas canvas) {
        Rect rect = this.b;
        int i2 = rect.left;
        int i3 = ((rect.right - i2) / 2) + i2;
        int i4 = rect.top;
        int i5 = i4 + ((rect.bottom - i4) / 2);
        float f2 = (float) i2;
        float f3 = (float) i5;
        canvas.drawCircle(f2, f3, this.p, this.g);
        float f4 = (float) i3;
        canvas.drawCircle(f4, (float) this.b.top, this.p, this.g);
        canvas.drawCircle((float) this.b.right, f3, this.p, this.g);
        canvas.drawCircle(f4, (float) this.b.bottom, this.p, this.g);
    }

    private void d(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) this.b.top, this.e);
        canvas2.drawRect(0.0f, (float) this.b.bottom, (float) canvas.getWidth(), (float) canvas.getHeight(), this.e);
        Rect rect = this.b;
        Canvas canvas3 = canvas;
        canvas3.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) rect.bottom, this.e);
        Rect rect2 = this.b;
        canvas3.drawRect((float) rect2.right, (float) rect2.top, (float) canvas.getWidth(), (float) this.b.bottom, this.e);
    }

    private void e(Canvas canvas) {
        this.f.setStrokeWidth(1.0f);
        Rect rect = this.b;
        int i2 = rect.right;
        int i3 = rect.left;
        float f2 = (float) ((i2 - i3) / 3);
        int i4 = rect.bottom;
        int i5 = rect.top;
        float f3 = (float) ((i4 - i5) / 3);
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) + f2, (float) i5, ((float) i3) + f2, (float) i4, this.f);
        Rect rect2 = this.b;
        int i6 = rect2.left;
        float f4 = f2 * 2.0f;
        canvas2.drawLine(((float) i6) + f4, (float) rect2.top, ((float) i6) + f4, (float) rect2.bottom, this.f);
        Rect rect3 = this.b;
        float f5 = (float) rect3.left;
        int i7 = rect3.top;
        canvas2.drawLine(f5, ((float) i7) + f3, (float) rect3.right, ((float) i7) + f3, this.f);
        Rect rect4 = this.b;
        float f6 = (float) rect4.left;
        int i8 = rect4.top;
        float f7 = f3 * 2.0f;
        canvas2.drawLine(f6, ((float) i8) + f7, (float) rect4.right, ((float) i8) + f7, this.f);
    }

    @SuppressLint({"NewApi"})
    private boolean f(Canvas canvas) {
        int i2 = VERSION.SDK_INT;
        if (i2 == 17) {
            return false;
        }
        if (i2 < 14 || i2 > 15) {
            return true;
        }
        return !canvas.isHardwareAccelerated();
    }

    private void b(Canvas canvas) {
        this.f.setStrokeWidth(1.0f);
        canvas.drawOval(new RectF(this.b), this.f);
    }

    /* access modifiers changed from: 0000 */
    public void b(float f2, float f3) {
        if (this.n) {
            if (f2 != 0.0f) {
                f3 = f2 / this.o;
            } else if (f3 != 0.0f) {
                f2 = this.o * f3;
            }
        }
        RectF rectF = new RectF(this.a);
        if (f2 > 0.0f && rectF.width() + (f2 * 2.0f) > this.d.width()) {
            f2 = (this.d.width() - rectF.width()) / 2.0f;
            if (this.n) {
                f3 = f2 / this.o;
            }
        }
        if (f3 > 0.0f && rectF.height() + (f3 * 2.0f) > this.d.height()) {
            f3 = (this.d.height() - rectF.height()) / 2.0f;
            if (this.n) {
                f2 = this.o * f3;
            }
        }
        rectF.inset(-f2, -f3);
        float f4 = 25.0f;
        if (rectF.width() < 25.0f) {
            rectF.inset((-(25.0f - rectF.width())) / 2.0f, 0.0f);
        }
        if (this.n) {
            f4 = 25.0f / this.o;
        }
        if (rectF.height() < f4) {
            rectF.inset(0.0f, (-(f4 - rectF.height())) / 2.0f);
        }
        float f5 = rectF.left;
        RectF rectF2 = this.d;
        float f6 = rectF2.left;
        if (f5 < f6) {
            rectF.offset(f6 - f5, 0.0f);
        } else {
            float f7 = rectF.right;
            float f8 = rectF2.right;
            if (f7 > f8) {
                rectF.offset(-(f7 - f8), 0.0f);
            }
        }
        float f9 = rectF.top;
        RectF rectF3 = this.d;
        float f10 = rectF3.top;
        if (f9 < f10) {
            rectF.offset(0.0f, f10 - f9);
        } else {
            float f11 = rectF.bottom;
            float f12 = rectF3.bottom;
            if (f11 > f12) {
                rectF.offset(0.0f, -(f11 - f12));
            }
        }
        this.a.set(rectF);
        this.b = c();
        this.h.invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void c(float f2, float f3) {
        Rect rect = new Rect(this.b);
        this.a.offset(f2, f3);
        RectF rectF = this.a;
        rectF.offset(Math.max(0.0f, this.d.left - rectF.left), Math.max(0.0f, this.d.top - this.a.top));
        RectF rectF2 = this.a;
        rectF2.offset(Math.min(0.0f, this.d.right - rectF2.right), Math.min(0.0f, this.d.bottom - this.a.bottom));
        this.b = c();
        rect.union(this.b);
        float f4 = this.p;
        rect.inset(-((int) f4), -((int) f4));
        this.h.invalidate(rect);
    }

    public void a(Matrix matrix, Rect rect, RectF rectF, boolean z) {
        this.c = new Matrix(matrix);
        this.a = rectF;
        this.d = new RectF(rect);
        this.n = z;
        this.o = this.a.width() / this.a.height();
        this.b = c();
        this.e.setARGB(125, 50, 50, 50);
        this.f.setStyle(Style.STROKE);
        this.f.setAntiAlias(true);
        this.q = b(2.0f);
        this.g.setColor(this.k);
        this.g.setStyle(Style.FILL);
        this.g.setAntiAlias(true);
        this.p = b(12.0f);
        this.l = b.None;
    }

    private Rect c() {
        RectF rectF = this.a;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.c.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas) {
        canvas.save();
        Path path = new Path();
        this.f.setStrokeWidth(this.q);
        if (!a()) {
            this.f.setColor(-16777216);
            canvas.drawRect(this.b, this.f);
            return;
        }
        Rect rect = new Rect();
        this.h.getDrawingRect(rect);
        path.addRect(new RectF(this.b), Direction.CW);
        this.f.setColor(this.k);
        if (f(canvas)) {
            canvas.clipPath(path, Op.DIFFERENCE);
            canvas.drawRect(rect, this.e);
        } else {
            d(canvas);
        }
        canvas.restore();
        canvas.drawPath(path, this.f);
        if (this.i) {
            e(canvas);
        }
        if (this.j) {
            b(canvas);
        }
        a aVar = this.m;
        if (aVar == a.Always || (aVar == a.Changing && this.l == b.Grow)) {
            c(canvas);
        }
    }

    public void b() {
        this.b = c();
    }

    public void a(b bVar) {
        if (bVar != this.l) {
            this.l = bVar;
            this.h.invalidate();
        }
    }

    public int a(float f2, float f3) {
        Rect c2 = c();
        boolean z = false;
        boolean z2 = f3 >= ((float) c2.top) - 20.0f && f3 < ((float) c2.bottom) + 20.0f;
        if (f2 >= ((float) c2.left) - 20.0f && f2 < ((float) c2.right) + 20.0f) {
            z = true;
        }
        int i2 = (Math.abs(((float) c2.left) - f2) >= 20.0f || !z2) ? 1 : 3;
        if (Math.abs(((float) c2.right) - f2) < 20.0f && z2) {
            i2 |= 4;
        }
        if (Math.abs(((float) c2.top) - f3) < 20.0f && z) {
            i2 |= 8;
        }
        if (Math.abs(((float) c2.bottom) - f3) < 20.0f && z) {
            i2 |= 16;
        }
        if (i2 != 1 || !c2.contains((int) f2, (int) f3)) {
            return i2;
        }
        return 32;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, float f2, float f3) {
        Rect c2 = c();
        if (i2 == 32) {
            c(f2 * (this.a.width() / ((float) c2.width())), f3 * (this.a.height() / ((float) c2.height())));
            return;
        }
        if ((i2 & 6) == 0) {
            f2 = 0.0f;
        }
        if ((i2 & 24) == 0) {
            f3 = 0.0f;
        }
        float height = f3 * (this.a.height() / ((float) c2.height()));
        int i3 = -1;
        float width = ((float) ((i2 & 2) != 0 ? -1 : 1)) * f2 * (this.a.width() / ((float) c2.width()));
        if ((i2 & 8) == 0) {
            i3 = 1;
        }
        b(width, ((float) i3) * height);
    }

    public Rect a(float f2) {
        RectF rectF = this.a;
        return new Rect((int) (rectF.left * f2), (int) (rectF.top * f2), (int) (rectF.right * f2), (int) (rectF.bottom * f2));
    }

    public boolean a() {
        return this.r;
    }

    public void a(boolean z) {
        this.r = z;
    }
}
