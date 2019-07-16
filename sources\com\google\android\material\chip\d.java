package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.e;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.material.internal.r;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable */
public class d extends Drawable implements e, Callback {
    private static final int[] a = {16842910};
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private final Context H;
    private final TextPaint I = new TextPaint(1);
    private final Paint J = new Paint(1);
    private final Paint K;
    private final FontMetrics L = new FontMetrics();
    private final RectF M = new RectF();
    private final PointF N = new PointF();
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private int T;
    private int U = 255;
    private ColorFilter V;
    private PorterDuffColorFilter W;
    private ColorStateList X;
    private Mode Y = Mode.SRC_IN;
    private int[] Z;
    private boolean aa;
    private ColorStateList b;
    private ColorStateList ba;
    private float c;
    private WeakReference<a> ca = new WeakReference<>(null);
    private float d;
    /* access modifiers changed from: private */
    public boolean da = true;
    private ColorStateList e;
    private float ea;
    private float f;
    private TruncateAt fa;
    private ColorStateList g;
    private boolean ga;
    private CharSequence h;
    private int ha;
    private CharSequence i;
    private Wz j;
    private final defpackage.C0277Xa.a k = new c(this);
    private boolean l;
    private Drawable m;
    private ColorStateList n;
    private float o;
    private boolean p;
    private Drawable q;
    private ColorStateList r;
    private float s;
    private CharSequence t;
    private boolean u;
    private boolean v;
    private Drawable w;
    private Lz x;
    private Lz y;
    private float z;

    /* compiled from: ChipDrawable */
    public interface a {
        void a();
    }

    private d(Context context) {
        this.H = context;
        this.h = "";
        this.I.density = context.getResources().getDisplayMetrics().density;
        this.K = null;
        Paint paint = this.K;
        if (paint != null) {
            paint.setStyle(Style.STROKE);
        }
        setState(a);
        a(a);
        this.ga = true;
    }

    private float K() {
        if (R()) {
            return this.E + this.s + this.F;
        }
        return 0.0f;
    }

    private float L() {
        this.I.getFontMetrics(this.L);
        FontMetrics fontMetrics = this.L;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean M() {
        return this.v && this.w != null && this.u;
    }

    private float N() {
        if (!this.da) {
            return this.ea;
        }
        this.ea = c(this.i);
        this.da = false;
        return this.ea;
    }

    private ColorFilter O() {
        ColorFilter colorFilter = this.V;
        return colorFilter != null ? colorFilter : this.W;
    }

    private boolean P() {
        return this.v && this.w != null && this.S;
    }

    private boolean Q() {
        return this.l && this.m != null;
    }

    private boolean R() {
        return this.p && this.q != null;
    }

    private void S() {
        this.ba = this.aa ? Yz.a(this.g) : null;
    }

    private void b(Canvas canvas, Rect rect) {
        this.J.setColor(this.O);
        this.J.setStyle(Style.FILL);
        this.J.setColorFilter(O());
        this.M.set(rect);
        RectF rectF = this.M;
        float f2 = this.d;
        canvas.drawRoundRect(rectF, f2, f2, this.J);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.I.measureText(charSequence, 0, charSequence.length());
    }

    private void d(Canvas canvas, Rect rect) {
        if (this.f > 0.0f) {
            this.J.setColor(this.P);
            this.J.setStyle(Style.STROKE);
            this.J.setColorFilter(O());
            RectF rectF = this.M;
            float f2 = (float) rect.left;
            float f3 = this.f;
            rectF.set(f2 + (f3 / 2.0f), ((float) rect.top) + (f3 / 2.0f), ((float) rect.right) - (f3 / 2.0f), ((float) rect.bottom) - (f3 / 2.0f));
            float f4 = this.d - (this.f / 2.0f);
            canvas.drawRoundRect(this.M, f4, f4, this.J);
        }
    }

    private void e(Canvas canvas, Rect rect) {
        if (R()) {
            c(rect, this.M);
            RectF rectF = this.M;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.q.setBounds(0, 0, (int) this.M.width(), (int) this.M.height());
            this.q.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void g(Canvas canvas, Rect rect) {
        Paint paint = this.K;
        if (paint != null) {
            paint.setColor(C0301ab.c(-16777216, 127));
            canvas.drawRect(rect, this.K);
            if (Q() || P()) {
                a(rect, this.M);
                canvas.drawRect(this.M, this.K);
            }
            if (this.i != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.K);
            }
            if (R()) {
                c(rect, this.M);
                canvas.drawRect(this.M, this.K);
            }
            this.K.setColor(C0301ab.c(-65536, 127));
            b(rect, this.M);
            canvas.drawRect(this.M, this.K);
            this.K.setColor(C0301ab.c(-16711936, 127));
            d(rect, this.M);
            canvas.drawRect(this.M, this.K);
        }
    }

    private void h(Canvas canvas, Rect rect) {
        if (this.i != null) {
            Align a2 = a(rect, this.N);
            e(rect, this.M);
            if (this.j != null) {
                this.I.drawableState = getState();
                this.j.b(this.H, this.I, this.k);
            }
            this.I.setTextAlign(a2);
            int i2 = 0;
            boolean z2 = Math.round(N()) > Math.round(this.M.width());
            if (z2) {
                i2 = canvas.save();
                canvas.clipRect(this.M);
            }
            CharSequence charSequence = this.i;
            if (z2 && this.fa != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.I, this.M.width(), this.fa);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.N;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.I);
            if (z2) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public Wz A() {
        return this.j;
    }

    public float B() {
        return this.D;
    }

    public float C() {
        return this.C;
    }

    public boolean D() {
        return this.u;
    }

    public boolean E() {
        return this.v;
    }

    public boolean F() {
        return this.l;
    }

    public boolean G() {
        return e(this.q);
    }

    public boolean H() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public void I() {
        a aVar = (a) this.ca.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean J() {
        return this.ga;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = 0;
            int i3 = this.U;
            if (i3 < 255) {
                i2 = Oz.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i3);
            }
            b(canvas, bounds);
            d(canvas, bounds);
            f(canvas, bounds);
            c(canvas, bounds);
            a(canvas, bounds);
            if (this.ga) {
                h(canvas, bounds);
            }
            e(canvas, bounds);
            g(canvas, bounds);
            if (this.U < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public void f(boolean z2) {
        if (this.aa != z2) {
            this.aa = z2;
            S();
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.U;
    }

    public ColorFilter getColorFilter() {
        return this.V;
    }

    public int getIntrinsicHeight() {
        return (int) this.c;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.z + a() + this.C + N() + this.D + K() + this.G), this.ha);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.d);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.d);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public float i() {
        return this.c;
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return f(this.b) || f(this.e) || (this.aa && f(this.ba)) || b(this.j) || M() || e(this.m) || e(this.w) || f(this.X);
    }

    public void j(int i2) {
        c(this.H.getResources().getBoolean(i2));
    }

    public void k(int i2) {
        d(this.H.getResources().getDimension(i2));
    }

    public float l() {
        return this.f;
    }

    public void m(int i2) {
        c(C1437k.a(this.H, i2));
    }

    public void n(int i2) {
        f(this.H.getResources().getDimension(i2));
    }

    public float o() {
        return this.F;
    }

    @TargetApi(23)
    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (Q()) {
            onLayoutDirectionChanged |= this.m.setLayoutDirection(i2);
        }
        if (P()) {
            onLayoutDirectionChanged |= this.w.setLayoutDirection(i2);
        }
        if (R()) {
            onLayoutDirectionChanged |= this.q.setLayoutDirection(i2);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (Q()) {
            onLevelChange |= this.m.setLevel(i2);
        }
        if (P()) {
            onLevelChange |= this.w.setLevel(i2);
        }
        if (R()) {
            onLevelChange |= this.q.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return a(iArr, r());
    }

    public void p(int i2) {
        c(C1437k.b(this.H, i2));
    }

    public void q(int i2) {
        h(this.H.getResources().getDimension(i2));
    }

    public int[] r() {
        return this.Z;
    }

    public ColorStateList s() {
        return this.r;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (this.U != i2) {
            this.U = i2;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.V != colorFilter) {
            this.V = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(Mode mode) {
        if (this.Y != mode) {
            this.Y = mode;
            this.W = Pz.a(this, this.X, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (Q()) {
            visible |= this.m.setVisible(z2, z3);
        }
        if (P()) {
            visible |= this.w.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.q.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public TruncateAt t() {
        return this.fa;
    }

    public Lz u() {
        return this.y;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v() {
        return this.B;
    }

    public float w() {
        return this.A;
    }

    public ColorStateList x() {
        return this.g;
    }

    public void y(int i2) {
        e(C1437k.a(this.H, i2));
    }

    public CharSequence z() {
        return this.h;
    }

    public static d a(Context context, AttributeSet attributeSet, int i2, int i3) {
        d dVar = new d(context);
        dVar.a(attributeSet, i2, i3);
        return dVar;
    }

    private void c(Canvas canvas, Rect rect) {
        if (Q()) {
            a(rect, this.M);
            RectF rectF = this.M;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.m.setBounds(0, 0, (int) this.M.width(), (int) this.M.height());
            this.m.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    public void A(int i2) {
        a(new Wz(this.H, i2));
    }

    public void B(int i2) {
        l(this.H.getResources().getDimension(i2));
    }

    public void C(int i2) {
        m(this.H.getResources().getDimension(i2));
    }

    public void i(int i2) {
        b(C1437k.a(this.H, i2));
    }

    public float j() {
        return this.z;
    }

    public ColorStateList k() {
        return this.e;
    }

    public void l(int i2) {
        e(this.H.getResources().getDimension(i2));
    }

    public Drawable m() {
        Drawable drawable = this.q;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return null;
    }

    public CharSequence n() {
        return this.t;
    }

    public void o(int i2) {
        g(this.H.getResources().getDimension(i2));
    }

    public float p() {
        return this.s;
    }

    public float q() {
        return this.E;
    }

    public void r(int i2) {
        i(this.H.getResources().getDimension(i2));
    }

    public void s(int i2) {
        d(C1437k.a(this.H, i2));
    }

    public void t(int i2) {
        d(this.H.getResources().getBoolean(i2));
    }

    public void u(int i2) {
        a(Lz.a(this.H, i2));
    }

    public void v(int i2) {
        j(this.H.getResources().getDimension(i2));
    }

    public void w(int i2) {
        k(this.H.getResources().getDimension(i2));
    }

    public void x(int i2) {
        this.ha = i2;
    }

    public Lz y() {
        return this.x;
    }

    public void z(int i2) {
        b(Lz.a(this.H, i2));
    }

    public void i(float f2) {
        if (this.E != f2) {
            this.E = f2;
            invalidateSelf();
            if (R()) {
                I();
            }
        }
    }

    public void j(float f2) {
        if (this.B != f2) {
            float a2 = a();
            this.B = f2;
            float a3 = a();
            invalidateSelf();
            if (a2 != a3) {
                I();
            }
        }
    }

    public void k(float f2) {
        if (this.A != f2) {
            float a2 = a();
            this.A = f2;
            float a3 = a();
            invalidateSelf();
            if (a2 != a3) {
                I();
            }
        }
    }

    public void l(float f2) {
        if (this.D != f2) {
            this.D = f2;
            invalidateSelf();
            I();
        }
    }

    public void m(float f2) {
        if (this.C != f2) {
            this.C = f2;
            invalidateSelf();
            I();
        }
    }

    private void a(AttributeSet attributeSet, int i2, int i3) {
        TypedArray a2 = r.a(this.H, attributeSet, Dz.Chip, i2, i3, new int[0]);
        a(Uz.a(this.H, a2, Dz.Chip_chipBackgroundColor));
        d(a2.getDimension(Dz.Chip_chipMinHeight, 0.0f));
        a(a2.getDimension(Dz.Chip_chipCornerRadius, 0.0f));
        c(Uz.a(this.H, a2, Dz.Chip_chipStrokeColor));
        f(a2.getDimension(Dz.Chip_chipStrokeWidth, 0.0f));
        e(Uz.a(this.H, a2, Dz.Chip_rippleColor));
        b(a2.getText(Dz.Chip_android_text));
        a(Uz.c(this.H, a2, Dz.Chip_android_textAppearance));
        int i4 = a2.getInt(Dz.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            a(TruncateAt.START);
        } else if (i4 == 2) {
            a(TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            a(TruncateAt.END);
        }
        c(a2.getBoolean(Dz.Chip_chipIconVisible, false));
        String str = "http://schemas.android.com/apk/res-auto";
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "chipIconEnabled") == null || attributeSet.getAttributeValue(str, "chipIconVisible") != null)) {
            c(a2.getBoolean(Dz.Chip_chipIconEnabled, false));
        }
        b(Uz.b(this.H, a2, Dz.Chip_chipIcon));
        b(Uz.a(this.H, a2, Dz.Chip_chipIconTint));
        c(a2.getDimension(Dz.Chip_chipIconSize, 0.0f));
        d(a2.getBoolean(Dz.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "closeIconEnabled") == null || attributeSet.getAttributeValue(str, "closeIconVisible") != null)) {
            d(a2.getBoolean(Dz.Chip_closeIconEnabled, false));
        }
        c(Uz.b(this.H, a2, Dz.Chip_closeIcon));
        d(Uz.a(this.H, a2, Dz.Chip_closeIconTint));
        h(a2.getDimension(Dz.Chip_closeIconSize, 0.0f));
        a(a2.getBoolean(Dz.Chip_android_checkable, false));
        b(a2.getBoolean(Dz.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "checkedIconEnabled") == null || attributeSet.getAttributeValue(str, "checkedIconVisible") != null)) {
            b(a2.getBoolean(Dz.Chip_checkedIconEnabled, false));
        }
        a(Uz.b(this.H, a2, Dz.Chip_checkedIcon));
        b(Lz.a(this.H, a2, Dz.Chip_showMotionSpec));
        a(Lz.a(this.H, a2, Dz.Chip_hideMotionSpec));
        e(a2.getDimension(Dz.Chip_chipStartPadding, 0.0f));
        k(a2.getDimension(Dz.Chip_iconStartPadding, 0.0f));
        j(a2.getDimension(Dz.Chip_iconEndPadding, 0.0f));
        m(a2.getDimension(Dz.Chip_textStartPadding, 0.0f));
        l(a2.getDimension(Dz.Chip_textEndPadding, 0.0f));
        i(a2.getDimension(Dz.Chip_closeIconStartPadding, 0.0f));
        g(a2.getDimension(Dz.Chip_closeIconEndPadding, 0.0f));
        b(a2.getDimension(Dz.Chip_chipEndPadding, 0.0f));
        x(a2.getDimensionPixelSize(Dz.Chip_android_maxWidth, BaseClientBuilder.API_PRIORITY_OTHER));
        a2.recycle();
    }

    private void f(Canvas canvas, Rect rect) {
        this.J.setColor(this.Q);
        this.J.setStyle(Style.FILL);
        this.M.set(rect);
        RectF rectF = this.M;
        float f2 = this.d;
        canvas.drawRoundRect(rectF, f2, f2, this.J);
    }

    private void b(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (R()) {
            float f2 = this.G + this.F + this.s + this.E + this.D;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.right = ((float) rect.right) - f2;
            } else {
                rectF.left = ((float) rect.left) + f2;
            }
        }
    }

    private void d(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R()) {
            float f2 = this.G + this.F + this.s + this.E + this.D;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f2;
            } else {
                int i2 = rect.left;
                rectF.left = (float) i2;
                rectF.right = ((float) i2) + f2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.i != null) {
            float a2 = this.z + a() + this.C;
            float K2 = this.G + K() + this.D;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.left = ((float) rect.left) + a2;
                rectF.right = ((float) rect.right) - K2;
            } else {
                rectF.left = ((float) rect.left) + K2;
                rectF.right = ((float) rect.right) - a2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean f(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R()) {
            float f2 = this.G + this.F;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.right = ((float) rect.right) - f2;
                rectF.left = rectF.right - this.s;
            } else {
                rectF.left = ((float) rect.left) + f2;
                rectF.right = rectF.left + this.s;
            }
            float exactCenterY = rect.exactCenterY();
            float f3 = this.s;
            rectF.top = exactCenterY - (f3 / 2.0f);
            rectF.bottom = rectF.top + f3;
        }
    }

    private void f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void f(float f2) {
        if (this.f != f2) {
            this.f = f2;
            this.J.setStrokeWidth(f2);
            invalidateSelf();
        }
    }

    private static boolean b(Wz wz) {
        if (wz != null) {
            ColorStateList colorStateList = wz.b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    public void b(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.h != charSequence) {
            this.h = charSequence;
            this.i = C0211Hb.a().a(charSequence);
            this.da = true;
            invalidateSelf();
            I();
        }
    }

    public Drawable f() {
        Drawable drawable = this.m;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return null;
    }

    public void f(int i2) {
        b(this.H.getResources().getDimension(i2));
    }

    public ColorStateList h() {
        return this.n;
    }

    public void h(int i2) {
        c(this.H.getResources().getDimension(i2));
    }

    private void d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.a(drawable, androidx.core.graphics.drawable.a.e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.q) {
                if (drawable.isStateful()) {
                    drawable.setState(r());
                }
                androidx.core.graphics.drawable.a.a(drawable, this.r);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public void h(float f2) {
        if (this.s != f2) {
            this.s = f2;
            invalidateSelf();
            if (R()) {
                I();
            }
        }
    }

    private static boolean e(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public void b(Drawable drawable) {
        Drawable f2 = f();
        if (f2 != drawable) {
            float a2 = a();
            this.m = drawable != null ? androidx.core.graphics.drawable.a.i(drawable).mutate() : null;
            float a3 = a();
            f(f2);
            if (Q()) {
                d(this.m);
            }
            invalidateSelf();
            if (a2 != a3) {
                I();
            }
        }
    }

    public ColorStateList c() {
        return this.b;
    }

    public void g(int i2) {
        b(C1437k.b(this.H, i2));
    }

    public void c(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            onStateChange(getState());
        }
    }

    public void e(int i2) {
        a(this.H.getResources().getDimension(i2));
    }

    public float g() {
        return this.o;
    }

    public void e(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            S();
            onStateChange(getState());
        }
    }

    public void g(float f2) {
        if (this.F != f2) {
            this.F = f2;
            invalidateSelf();
            if (R()) {
                I();
            }
        }
    }

    public void c(boolean z2) {
        if (this.l != z2) {
            boolean Q2 = Q();
            this.l = z2;
            boolean Q3 = Q();
            if (Q2 != Q3) {
                if (Q3) {
                    d(this.m);
                } else {
                    f(this.m);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public void e(float f2) {
        if (this.z != f2) {
            this.z = f2;
            invalidateSelf();
            I();
        }
    }

    public void d(int i2) {
        a(C1437k.a(this.H, i2));
    }

    public void b(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            if (Q()) {
                androidx.core.graphics.drawable.a.a(this.m, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d(float f2) {
        if (this.c != f2) {
            this.c = f2;
            invalidateSelf();
            I();
        }
    }

    public float e() {
        return this.G;
    }

    /* access modifiers changed from: 0000 */
    public void e(boolean z2) {
        this.ga = z2;
    }

    public void c(float f2) {
        if (this.o != f2) {
            float a2 = a();
            this.o = f2;
            float a3 = a();
            invalidateSelf();
            if (a2 != a3) {
                I();
            }
        }
    }

    public float d() {
        return this.d;
    }

    public void b(boolean z2) {
        if (this.v != z2) {
            boolean P2 = P();
            this.v = z2;
            boolean P3 = P();
            if (P2 != P3) {
                if (P3) {
                    d(this.w);
                } else {
                    f(this.w);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public void d(boolean z2) {
        if (this.p != z2) {
            boolean R2 = R();
            this.p = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    d(this.q);
                } else {
                    f(this.q);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public void c(Drawable drawable) {
        Drawable m2 = m();
        if (m2 != drawable) {
            float K2 = K();
            this.q = drawable != null ? androidx.core.graphics.drawable.a.i(drawable).mutate() : null;
            float K3 = K();
            f(m2);
            if (R()) {
                d(this.q);
            }
            invalidateSelf();
            if (K2 != K3) {
                I();
            }
        }
    }

    public Drawable b() {
        return this.w;
    }

    public void d(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            if (R()) {
                androidx.core.graphics.drawable.a.a(this.q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void b(int i2) {
        a(C1437k.b(this.H, i2));
    }

    public void b(Lz lz) {
        this.x = lz;
    }

    public void b(float f2) {
        if (this.G != f2) {
            this.G = f2;
            invalidateSelf();
            I();
        }
    }

    public void c(int i2) {
        b(this.H.getResources().getBoolean(i2));
    }

    public void a(a aVar) {
        this.ca = new WeakReference<>(aVar);
    }

    public void a(RectF rectF) {
        d(getBounds(), rectF);
    }

    /* access modifiers changed from: 0000 */
    public float a() {
        if (Q() || P()) {
            return this.A + this.o + this.B;
        }
        return 0.0f;
    }

    private void a(Canvas canvas, Rect rect) {
        if (P()) {
            a(rect, this.M);
            RectF rectF = this.M;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.w.setBounds(0, 0, (int) this.M.width(), (int) this.M.height());
            this.w.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Q() || P()) {
            float f2 = this.z + this.A;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.left = ((float) rect.left) + f2;
                rectF.right = rectF.left + this.o;
            } else {
                rectF.right = ((float) rect.right) - f2;
                rectF.left = rectF.right - this.o;
            }
            float exactCenterY = rect.exactCenterY();
            float f3 = this.o;
            rectF.top = exactCenterY - (f3 / 2.0f);
            rectF.bottom = rectF.top + f3;
        }
    }

    /* access modifiers changed from: 0000 */
    public Align a(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Align align = Align.LEFT;
        if (this.i != null) {
            float a2 = this.z + a() + this.C;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                pointF.x = ((float) rect.left) + a2;
                align = Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - a2;
                align = Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - L();
        }
        return align;
    }

    public boolean a(int[] iArr) {
        if (!Arrays.equals(this.Z, iArr)) {
            this.Z = iArr;
            if (R()) {
                return a(getState(), iArr);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d8  */
    private boolean a(int[] iArr, int[] iArr2) {
        int i2;
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        float a2;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.b;
        int i3 = 0;
        int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.O) : 0;
        if (this.O != colorForState) {
            this.O = colorForState;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.e;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.P) : 0;
        if (this.P != colorForState2) {
            this.P = colorForState2;
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.ba;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.Q) : 0;
        if (this.Q != colorForState3) {
            this.Q = colorForState3;
            if (this.aa) {
                onStateChange = true;
            }
        }
        Wz wz = this.j;
        if (wz != null) {
            ColorStateList colorStateList5 = wz.b;
            if (colorStateList5 != null) {
                i2 = colorStateList5.getColorForState(iArr, this.R);
                if (this.R != i2) {
                    this.R = i2;
                    onStateChange = true;
                }
                z2 = !a(getState(), 16842912) && this.u;
                if (!(this.S == z2 || this.w == null)) {
                    a2 = a();
                    this.S = z2;
                    if (a2 == a()) {
                        onStateChange = true;
                        z3 = true;
                        colorStateList = this.X;
                        if (colorStateList != null) {
                            i3 = colorStateList.getColorForState(iArr, this.T);
                        }
                        if (this.T != i3) {
                            this.T = i3;
                            this.W = Pz.a(this, this.X, this.Y);
                            onStateChange = true;
                        }
                        if (e(this.m)) {
                            onStateChange |= this.m.setState(iArr);
                        }
                        if (e(this.w)) {
                            onStateChange |= this.w.setState(iArr);
                        }
                        if (e(this.q)) {
                            onStateChange |= this.q.setState(iArr2);
                        }
                        if (onStateChange) {
                            invalidateSelf();
                        }
                        if (z3) {
                            I();
                        }
                        return onStateChange;
                    }
                    onStateChange = true;
                }
                z3 = false;
                colorStateList = this.X;
                if (colorStateList != null) {
                }
                if (this.T != i3) {
                }
                if (e(this.m)) {
                }
                if (e(this.w)) {
                }
                if (e(this.q)) {
                }
                if (onStateChange) {
                }
                if (z3) {
                }
                return onStateChange;
            }
        }
        i2 = 0;
        if (this.R != i2) {
        }
        if (!a(getState(), 16842912)) {
        }
        a2 = a();
        this.S = z2;
        if (a2 == a()) {
        }
    }

    private static boolean a(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public void a(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            onStateChange(getState());
        }
    }

    public void a(float f2) {
        if (this.d != f2) {
            this.d = f2;
            invalidateSelf();
        }
    }

    public void a(Wz wz) {
        if (this.j != wz) {
            this.j = wz;
            if (wz != null) {
                wz.c(this.H, this.I, this.k);
                this.da = true;
            }
            onStateChange(getState());
            I();
        }
    }

    public void a(TruncateAt truncateAt) {
        this.fa = truncateAt;
    }

    public void a(CharSequence charSequence) {
        if (this.t != charSequence) {
            this.t = C0211Hb.a().a(charSequence);
            invalidateSelf();
        }
    }

    public void a(int i2) {
        a(this.H.getResources().getBoolean(i2));
    }

    public void a(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            float a2 = a();
            if (!z2 && this.S) {
                this.S = false;
            }
            float a3 = a();
            invalidateSelf();
            if (a2 != a3) {
                I();
            }
        }
    }

    public void a(Drawable drawable) {
        if (this.w != drawable) {
            float a2 = a();
            this.w = drawable;
            float a3 = a();
            f(this.w);
            d(this.w);
            invalidateSelf();
            if (a2 != a3) {
                I();
            }
        }
    }

    public void a(Lz lz) {
        this.y = lz;
    }
}
