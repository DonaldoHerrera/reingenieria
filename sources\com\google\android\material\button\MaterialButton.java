package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.l;
import com.google.android.material.internal.r;
import com.google.android.material.internal.s;

public class MaterialButton extends AppCompatButton {
    private final b c;
    private int d;
    private Mode e;
    private ColorStateList f;
    private Drawable g;
    private int h;
    private int i;
    private int j;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.materialButtonStyle);
    }

    private boolean a() {
        return C1778vc.l(this) == 1;
    }

    private boolean b() {
        b bVar = this.c;
        return bVar != null && !bVar.g();
    }

    private void c() {
        Drawable drawable = this.g;
        if (drawable != null) {
            this.g = drawable.mutate();
            a.a(this.g, this.f);
            Mode mode = this.e;
            if (mode != null) {
                a.a(this.g, mode);
            }
            int i2 = this.h;
            if (i2 == 0) {
                i2 = this.g.getIntrinsicWidth();
            }
            int i3 = this.h;
            if (i3 == 0) {
                i3 = this.g.getIntrinsicHeight();
            }
            Drawable drawable2 = this.g;
            int i4 = this.i;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        l.a(this, this.g, null, null, null);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.c.a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.g;
    }

    public int getIconGravity() {
        return this.j;
    }

    public int getIconPadding() {
        return this.d;
    }

    public int getIconSize() {
        return this.h;
    }

    public ColorStateList getIconTint() {
        return this.f;
    }

    public Mode getIconTintMode() {
        return this.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.c.b();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.c.c();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.c.d();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.c.e();
        }
        return super.getSupportBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.c.f();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT < 21 && b()) {
            this.c.a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (VERSION.SDK_INT == 21) {
            b bVar = this.c;
            if (bVar != null) {
                bVar.a(i5 - i3, i4 - i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.g != null && this.j == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i4 = this.h;
            if (i4 == 0) {
                i4 = this.g.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - C1778vc.o(this)) - i4) - this.d) - C1778vc.p(this)) / 2;
            if (a()) {
                measuredWidth = -measuredWidth;
            }
            if (this.i != measuredWidth) {
                this.i = measuredWidth;
                c();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (b()) {
            this.c.a(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.c.h();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? C1437k.b(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i2) {
        if (b()) {
            this.c.b(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.g != drawable) {
            this.g = drawable;
            c();
        }
    }

    public void setIconGravity(int i2) {
        this.j = i2;
    }

    public void setIconPadding(int i2) {
        if (this.d != i2) {
            this.d = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? C1437k.b(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.h != i2) {
            this.h = i2;
            c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            c();
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            c();
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(C1437k.a(getContext(), i2));
    }

    /* access modifiers changed from: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            this.c.a(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (b()) {
            setRippleColor(C1437k.a(getContext(), i2));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            this.c.b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (b()) {
            setStrokeColor(C1437k.a(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (b()) {
            this.c.c(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            this.c.c(colorStateList);
        } else if (this.c != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (b()) {
            this.c.a(mode);
        } else if (this.c != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray a = r.a(context, attributeSet, Dz.MaterialButton, i2, Cz.Widget_MaterialComponents_Button, new int[0]);
        this.d = a.getDimensionPixelSize(Dz.MaterialButton_iconPadding, 0);
        this.e = s.a(a.getInt(Dz.MaterialButton_iconTintMode, -1), Mode.SRC_IN);
        this.f = Uz.a(getContext(), a, Dz.MaterialButton_iconTint);
        this.g = Uz.b(getContext(), a, Dz.MaterialButton_icon);
        this.j = a.getInteger(Dz.MaterialButton_iconGravity, 1);
        this.h = a.getDimensionPixelSize(Dz.MaterialButton_iconSize, 0);
        this.c = new b(this);
        this.c.a(a);
        a.recycle();
        setCompoundDrawablePadding(this.d);
        c();
    }
}
