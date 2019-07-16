package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.l;
import java.lang.ref.WeakReference;

/* compiled from: AppCompatTextHelper */
class A {
    private final TextView a;
    private la b;
    private la c;
    private la d;
    private la e;
    private la f;
    private la g;
    private final B h;
    private int i = 0;
    private Typeface j;
    private boolean k;

    A(TextView textView) {
        this.a = textView;
        this.h = new B(this.a);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        Context context = this.a.getContext();
        C0350q a2 = C0350q.a();
        na a3 = na.a(context, attributeSet2, C1406j.AppCompatTextHelper, i3, 0);
        int g2 = a3.g(C1406j.AppCompatTextHelper_android_textAppearance, -1);
        if (a3.g(C1406j.AppCompatTextHelper_android_drawableLeft)) {
            this.b = a(context, a2, a3.g(C1406j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a3.g(C1406j.AppCompatTextHelper_android_drawableTop)) {
            this.c = a(context, a2, a3.g(C1406j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a3.g(C1406j.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, a2, a3.g(C1406j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a3.g(C1406j.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, a2, a3.g(C1406j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (VERSION.SDK_INT >= 17) {
            if (a3.g(C1406j.AppCompatTextHelper_android_drawableStart)) {
                this.f = a(context, a2, a3.g(C1406j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a3.g(C1406j.AppCompatTextHelper_android_drawableEnd)) {
                this.g = a(context, a2, a3.g(C1406j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a3.a();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (g2 != -1) {
            na a4 = na.a(context, g2, C1406j.TextAppearance);
            if (z3 || !a4.g(C1406j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = a4.a(C1406j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            a(context, a4);
            if (VERSION.SDK_INT < 23) {
                ColorStateList a5 = a4.g(C1406j.TextAppearance_android_textColor) ? a4.a(C1406j.TextAppearance_android_textColor) : null;
                colorStateList = a4.g(C1406j.TextAppearance_android_textColorHint) ? a4.a(C1406j.TextAppearance_android_textColorHint) : null;
                if (a4.g(C1406j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = a4.a(C1406j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = a5;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a4.a();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        na a6 = na.a(context, attributeSet2, C1406j.TextAppearance, i3, 0);
        if (z3 || !a6.g(C1406j.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = a6.a(C1406j.TextAppearance_textAllCaps, false);
        }
        if (VERSION.SDK_INT < 23) {
            if (a6.g(C1406j.TextAppearance_android_textColor)) {
                colorStateList3 = a6.a(C1406j.TextAppearance_android_textColor);
            }
            if (a6.g(C1406j.TextAppearance_android_textColorHint)) {
                colorStateList = a6.a(C1406j.TextAppearance_android_textColorHint);
            }
            if (a6.g(C1406j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a6.a(C1406j.TextAppearance_android_textColorLink);
            }
        }
        if (VERSION.SDK_INT >= 28 && a6.g(C1406j.TextAppearance_android_textSize) && a6.c(C1406j.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, a6);
        a6.a();
        if (colorStateList3 != null) {
            this.a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            a(z);
        }
        Typeface typeface = this.j;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.i);
        }
        this.h.a(attributeSet2, i3);
        if (b.a && this.h.f() != 0) {
            int[] e2 = this.h.e();
            if (e2.length > 0) {
                if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(this.h.c(), this.h.b(), this.h.d(), 0);
                } else {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(e2, 0);
                }
            }
        }
        na a7 = na.a(context, attributeSet2, C1406j.AppCompatTextView);
        int c2 = a7.c(C1406j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int c3 = a7.c(C1406j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int c4 = a7.c(C1406j.AppCompatTextView_lineHeight, -1);
        a7.a();
        if (c2 != -1) {
            l.a(this.a, c2);
        }
        if (c3 != -1) {
            l.b(this.a, c3);
        }
        if (c4 != -1) {
            l.c(this.a, c4);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.h.a();
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return this.h.b();
    }

    /* access modifiers changed from: 0000 */
    public int d() {
        return this.h.c();
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        return this.h.d();
    }

    /* access modifiers changed from: 0000 */
    public int[] f() {
        return this.h.e();
    }

    /* access modifiers changed from: 0000 */
    public int g() {
        return this.h.f();
    }

    /* access modifiers changed from: 0000 */
    public boolean h() {
        return this.h.g();
    }

    private void b(int i2, float f2) {
        this.h.a(i2, f2);
    }

    private void a(Context context, na naVar) {
        this.i = naVar.d(C1406j.TextAppearance_android_textStyle, this.i);
        boolean z = false;
        if (naVar.g(C1406j.TextAppearance_android_fontFamily) || naVar.g(C1406j.TextAppearance_fontFamily)) {
            this.j = null;
            int i2 = naVar.g(C1406j.TextAppearance_fontFamily) ? C1406j.TextAppearance_fontFamily : C1406j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.j = naVar.a(i2, this.i, (a) new C0358z(this, new WeakReference(this.a)));
                    if (this.j == null) {
                        z = true;
                    }
                    this.k = z;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.j == null) {
                String d2 = naVar.d(i2);
                if (d2 != null) {
                    this.j = Typeface.create(d2, this.i);
                }
            }
            return;
        }
        if (naVar.g(C1406j.TextAppearance_android_typeface)) {
            this.k = false;
            int d3 = naVar.d(C1406j.TextAppearance_android_typeface, 1);
            if (d3 == 1) {
                this.j = Typeface.SANS_SERIF;
            } else if (d3 == 2) {
                this.j = Typeface.SERIF;
            } else if (d3 == 3) {
                this.j = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.k) {
            this.j = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, int i2) {
        na a2 = na.a(context, i2, C1406j.TextAppearance);
        if (a2.g(C1406j.TextAppearance_textAllCaps)) {
            a(a2.a(C1406j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a2.g(C1406j.TextAppearance_android_textColor)) {
            ColorStateList a3 = a2.a(C1406j.TextAppearance_android_textColor);
            if (a3 != null) {
                this.a.setTextColor(a3);
            }
        }
        if (a2.g(C1406j.TextAppearance_android_textSize) && a2.c(C1406j.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, a2);
        a2.a();
        Typeface typeface = this.j;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (!(this.b == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    private void a(Drawable drawable, la laVar) {
        if (drawable != null && laVar != null) {
            C0350q.a(drawable, laVar, this.a.getDrawableState());
        }
    }

    private static la a(Context context, C0350q qVar, int i2) {
        ColorStateList b2 = qVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        la laVar = new la();
        laVar.d = true;
        laVar.a = b2;
        return laVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, int i2, int i3, int i4, int i5) {
        if (!b.a) {
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, float f2) {
        if (!b.a && !h()) {
            b(i2, f2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        this.h.a(i2);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        this.h.a(i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    public void a(int[] iArr, int i2) throws IllegalArgumentException {
        this.h.a(iArr, i2);
    }
}
