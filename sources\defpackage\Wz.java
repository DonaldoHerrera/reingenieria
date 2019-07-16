package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;

/* renamed from: Wz reason: default package */
/* compiled from: TextAppearance */
public class Wz {
    public final float a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final ColorStateList i;
    public final float j;
    public final float k;
    public final float l;
    private final int m;
    /* access modifiers changed from: private */
    public boolean n = false;
    /* access modifiers changed from: private */
    public Typeface o;

    public Wz(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, Dz.TextAppearance);
        this.a = obtainStyledAttributes.getDimension(Dz.TextAppearance_android_textSize, 0.0f);
        this.b = Uz.a(context, obtainStyledAttributes, Dz.TextAppearance_android_textColor);
        this.c = Uz.a(context, obtainStyledAttributes, Dz.TextAppearance_android_textColorHint);
        this.d = Uz.a(context, obtainStyledAttributes, Dz.TextAppearance_android_textColorLink);
        this.e = obtainStyledAttributes.getInt(Dz.TextAppearance_android_textStyle, 0);
        this.f = obtainStyledAttributes.getInt(Dz.TextAppearance_android_typeface, 1);
        int a2 = Uz.a(obtainStyledAttributes, Dz.TextAppearance_fontFamily, Dz.TextAppearance_android_fontFamily);
        this.m = obtainStyledAttributes.getResourceId(a2, 0);
        this.g = obtainStyledAttributes.getString(a2);
        this.h = obtainStyledAttributes.getBoolean(Dz.TextAppearance_textAllCaps, false);
        this.i = Uz.a(context, obtainStyledAttributes, Dz.TextAppearance_android_shadowColor);
        this.j = obtainStyledAttributes.getFloat(Dz.TextAppearance_android_shadowDx, 0.0f);
        this.k = obtainStyledAttributes.getFloat(Dz.TextAppearance_android_shadowDy, 0.0f);
        this.l = obtainStyledAttributes.getFloat(Dz.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public void b(Context context, TextPaint textPaint, a aVar) {
        c(context, textPaint, aVar);
        ColorStateList colorStateList = this.b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.l;
        float f3 = this.j;
        float f4 = this.k;
        ColorStateList colorStateList2 = this.i;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void c(Context context, TextPaint textPaint, a aVar) {
        if (Xz.a()) {
            a(textPaint, a(context));
            return;
        }
        a(context, textPaint, aVar);
        if (!this.n) {
            a(textPaint, this.o);
        }
    }

    public Typeface a(Context context) {
        if (this.n) {
            return this.o;
        }
        if (!context.isRestricted()) {
            try {
                this.o = C0277Xa.a(context, this.m);
                if (this.o != null) {
                    this.o = Typeface.create(this.o, this.e);
                }
            } catch (NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.g);
                Log.d("TextAppearance", sb.toString(), e2);
            }
        }
        a();
        this.n = true;
        return this.o;
    }

    public void a(Context context, TextPaint textPaint, a aVar) {
        if (this.n) {
            a(textPaint, this.o);
            return;
        }
        a();
        if (context.isRestricted()) {
            this.n = true;
            a(textPaint, this.o);
            return;
        }
        try {
            C0277Xa.a(context, this.m, new Vz(this, textPaint, aVar), null);
        } catch (NotFoundException | UnsupportedOperationException unused) {
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.g);
            Log.d("TextAppearance", sb.toString(), e2);
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.o == null) {
            this.o = Typeface.create(this.g, this.e);
        }
        if (this.o == null) {
            int i2 = this.f;
            if (i2 == 1) {
                this.o = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.o = Typeface.SERIF;
            } else if (i2 != 3) {
                this.o = Typeface.DEFAULT;
            } else {
                this.o = Typeface.MONOSPACE;
            }
            Typeface typeface = this.o;
            if (typeface != null) {
                this.o = Typeface.create(typeface, this.e);
            }
        }
    }

    public void a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.e;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.a);
    }
}
