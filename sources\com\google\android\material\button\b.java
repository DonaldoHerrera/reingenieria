package com.google.android.material.button;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.a;
import com.google.android.material.internal.s;

/* compiled from: MaterialButtonHelper */
class b {
    private static final boolean a = (VERSION.SDK_INT >= 21);
    private final MaterialButton b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private final Paint m = new Paint(1);
    private final Rect n = new Rect();
    private final RectF o = new RectF();
    private GradientDrawable p;
    private Drawable q;
    private GradientDrawable r;
    private Drawable s;
    private GradientDrawable t;
    private GradientDrawable u;
    private GradientDrawable v;
    private boolean w = false;

    public b(MaterialButton materialButton) {
        this.b = materialButton;
    }

    private Drawable i() {
        this.p = new GradientDrawable();
        this.p.setCornerRadius(((float) this.g) + 1.0E-5f);
        this.p.setColor(-1);
        this.q = a.i(this.p);
        a.a(this.q, this.j);
        Mode mode = this.i;
        if (mode != null) {
            a.a(this.q, mode);
        }
        this.r = new GradientDrawable();
        this.r.setCornerRadius(((float) this.g) + 1.0E-5f);
        this.r.setColor(-1);
        this.s = a.i(this.r);
        a.a(this.s, this.l);
        return a((Drawable) new LayerDrawable(new Drawable[]{this.q, this.s}));
    }

    @TargetApi(21)
    private Drawable j() {
        this.t = new GradientDrawable();
        this.t.setCornerRadius(((float) this.g) + 1.0E-5f);
        this.t.setColor(-1);
        n();
        this.u = new GradientDrawable();
        this.u.setCornerRadius(((float) this.g) + 1.0E-5f);
        this.u.setColor(0);
        this.u.setStroke(this.h, this.k);
        InsetDrawable a2 = a((Drawable) new LayerDrawable(new Drawable[]{this.t, this.u}));
        this.v = new GradientDrawable();
        this.v.setCornerRadius(((float) this.g) + 1.0E-5f);
        this.v.setColor(-1);
        return new a(Yz.a(this.l), a2, this.v);
    }

    private GradientDrawable k() {
        if (!a || this.b.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    private GradientDrawable l() {
        if (!a || this.b.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    private void m() {
        if (a && this.u != null) {
            this.b.setInternalBackground(j());
        } else if (!a) {
            this.b.invalidate();
        }
    }

    private void n() {
        GradientDrawable gradientDrawable = this.t;
        if (gradientDrawable != null) {
            a.a((Drawable) gradientDrawable, this.j);
            Mode mode = this.i;
            if (mode != null) {
                a.a((Drawable) this.t, mode);
            }
        }
    }

    public void a(TypedArray typedArray) {
        int i2 = 0;
        this.c = typedArray.getDimensionPixelOffset(Dz.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(Dz.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(Dz.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(Dz.MaterialButton_android_insetBottom, 0);
        this.g = typedArray.getDimensionPixelSize(Dz.MaterialButton_cornerRadius, 0);
        this.h = typedArray.getDimensionPixelSize(Dz.MaterialButton_strokeWidth, 0);
        this.i = s.a(typedArray.getInt(Dz.MaterialButton_backgroundTintMode, -1), Mode.SRC_IN);
        this.j = Uz.a(this.b.getContext(), typedArray, Dz.MaterialButton_backgroundTint);
        this.k = Uz.a(this.b.getContext(), typedArray, Dz.MaterialButton_strokeColor);
        this.l = Uz.a(this.b.getContext(), typedArray, Dz.MaterialButton_rippleColor);
        this.m.setStyle(Style.STROKE);
        this.m.setStrokeWidth((float) this.h);
        Paint paint = this.m;
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(this.b.getDrawableState(), 0);
        }
        paint.setColor(i2);
        int p2 = C1778vc.p(this.b);
        int paddingTop = this.b.getPaddingTop();
        int o2 = C1778vc.o(this.b);
        int paddingBottom = this.b.getPaddingBottom();
        this.b.setInternalBackground(a ? j() : i());
        C1778vc.b(this.b, p2 + this.c, paddingTop + this.e, o2 + this.d, paddingBottom + this.f);
    }

    /* access modifiers changed from: 0000 */
    public ColorStateList b() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public void c(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (a) {
                n();
                return;
            }
            Drawable drawable = this.q;
            if (drawable != null) {
                a.a(drawable, this.j);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int d() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public ColorStateList e() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public Mode f() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return this.w;
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        this.w = true;
        this.b.setSupportBackgroundTintList(this.j);
        this.b.setSupportBackgroundTintMode(this.i);
    }

    /* access modifiers changed from: 0000 */
    public void b(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            Paint paint = this.m;
            int i2 = 0;
            if (colorStateList != null) {
                i2 = colorStateList.getColorForState(this.b.getDrawableState(), 0);
            }
            paint.setColor(i2);
            m();
        }
    }

    /* access modifiers changed from: 0000 */
    public ColorStateList c() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2) {
        if (this.g != i2) {
            this.g = i2;
            if (a && this.t != null && this.u != null && this.v != null) {
                if (VERSION.SDK_INT == 21) {
                    float f2 = ((float) i2) + 1.0E-5f;
                    k().setCornerRadius(f2);
                    l().setCornerRadius(f2);
                }
                float f3 = ((float) i2) + 1.0E-5f;
                this.t.setCornerRadius(f3);
                this.u.setCornerRadius(f3);
                this.v.setCornerRadius(f3);
            } else if (!a) {
                GradientDrawable gradientDrawable = this.p;
                if (gradientDrawable != null && this.r != null) {
                    float f4 = ((float) i2) + 1.0E-5f;
                    gradientDrawable.setCornerRadius(f4);
                    this.r.setCornerRadius(f4);
                    this.b.invalidate();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2) {
        if (this.h != i2) {
            this.h = i2;
            this.m.setStrokeWidth((float) i2);
            m();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Canvas canvas) {
        if (canvas != null && this.k != null && this.h > 0) {
            this.n.set(this.b.getBackground().getBounds());
            RectF rectF = this.o;
            Rect rect = this.n;
            float f2 = (float) rect.left;
            int i2 = this.h;
            rectF.set(f2 + (((float) i2) / 2.0f) + ((float) this.c), ((float) rect.top) + (((float) i2) / 2.0f) + ((float) this.e), (((float) rect.right) - (((float) i2) / 2.0f)) - ((float) this.d), (((float) rect.bottom) - (((float) i2) / 2.0f)) - ((float) this.f));
            float f3 = ((float) this.g) - (((float) this.h) / 2.0f);
            canvas.drawRoundRect(this.o, f3, f3, this.m);
        }
    }

    private InsetDrawable a(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
        return insetDrawable;
    }

    /* access modifiers changed from: 0000 */
    public void a(Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (a) {
                n();
                return;
            }
            Drawable drawable = this.q;
            if (drawable != null) {
                Mode mode2 = this.i;
                if (mode2 != null) {
                    a.a(drawable, mode2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3) {
        GradientDrawable gradientDrawable = this.v;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.c, this.e, i3 - this.d, i2 - this.f);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        if (a) {
            GradientDrawable gradientDrawable = this.t;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i2);
                return;
            }
        }
        if (!a) {
            GradientDrawable gradientDrawable2 = this.p;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (a && (this.b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.b.getBackground()).setColor(colorStateList);
            } else if (!a) {
                Drawable drawable = this.s;
                if (drawable != null) {
                    a.a(drawable, colorStateList);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return this.g;
    }
}
