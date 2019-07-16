package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.material.internal.s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.d.a {
    /* access modifiers changed from: private */
    public static final Rect c = new Rect();
    private static final int[] d = {16842913};
    /* access modifiers changed from: private */
    public d e;
    private RippleDrawable f;
    private OnClickListener g;
    private OnCheckedChangeListener h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final a n;
    private final Rect o;
    private final RectF p;
    private final defpackage.C0277Xa.a q;

    private class a extends Vc {
        a(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int a(float f, float f2) {
            return (!Chip.this.f() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? -1 : 0;
        }

        /* access modifiers changed from: protected */
        public void a(List<Integer> list) {
            if (Chip.this.f()) {
                list.add(Integer.valueOf(0));
            }
        }

        /* access modifiers changed from: protected */
        public void a(int i, Mc mc) {
            CharSequence charSequence = "";
            if (Chip.this.f()) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    mc.c(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = Bz.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(text)) {
                        text = charSequence;
                    }
                    objArr[0] = text;
                    mc.c((CharSequence) context.getString(i2, objArr).trim());
                }
                mc.c(Chip.this.getCloseIconTouchBoundsInt());
                mc.a(defpackage.Mc.a.e);
                mc.h(Chip.this.isEnabled());
                return;
            }
            mc.c(charSequence);
            mc.c(Chip.c);
        }

        /* access modifiers changed from: protected */
        public void a(Mc mc) {
            mc.c(Chip.this.e != null && Chip.this.e.D());
            mc.b((CharSequence) Chip.class.getName());
            CharSequence text = Chip.this.getText();
            if (VERSION.SDK_INT >= 23) {
                mc.h(text);
            } else {
                mc.c(text);
            }
        }

        /* access modifiers changed from: protected */
        public boolean a(int i, int i2, Bundle bundle) {
            if (i2 == 16 && i == 0) {
                return Chip.this.c();
            }
            return false;
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.chipStyle);
    }

    private void e() {
        if (this.j == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
    }

    /* access modifiers changed from: private */
    public boolean f() {
        d dVar = this.e;
        return (dVar == null || dVar.m() == null) ? false : true;
    }

    private void g() {
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b(this));
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.p.setEmpty();
        if (f()) {
            this.e.a(this.p);
        }
        return this.p;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.o.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.o;
    }

    private Wz getTextAppearance() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.A();
        }
        return null;
    }

    private void h() {
        if (!TextUtils.isEmpty(getText())) {
            d dVar = this.e;
            if (dVar != null) {
                float j2 = dVar.j() + this.e.e() + this.e.C() + this.e.B();
                if ((this.e.F() && this.e.f() != null) || (this.e.b() != null && this.e.E() && isChecked())) {
                    j2 += this.e.w() + this.e.v() + this.e.g();
                }
                if (this.e.H() && this.e.m() != null) {
                    j2 += this.e.q() + this.e.o() + this.e.p();
                }
                if (((float) C1778vc.o(this)) != j2) {
                    C1778vc.b(this, C1778vc.p(this), getPaddingTop(), (int) j2, getPaddingBottom());
                }
            }
        }
    }

    private void setCloseIconFocused(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    private void setFocusedVirtualView(int i2) {
        int i3 = this.j;
        if (i3 != i2) {
            if (i3 == 0) {
                setCloseIconFocused(false);
            }
            this.j = i2;
            if (i2 == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return a(motionEvent) || this.n.a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.n.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.e;
        if ((dVar == null || !dVar.G()) ? false : this.e.a(d())) {
            invalidate();
        }
    }

    public Drawable getCheckedIcon() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public float getChipCornerRadius() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.d();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.e();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.f();
        }
        return null;
    }

    public float getChipIconSize() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.g();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.h();
        }
        return null;
    }

    public float getChipMinHeight() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.i();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.j();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.k();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.l();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.m();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.n();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.o();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.p();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.q();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.s();
        }
        return null;
    }

    public TruncateAt getEllipsize() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.t();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.j == 0) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public Lz getHideMotionSpec() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.u();
        }
        return null;
    }

    public float getIconEndPadding() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.v();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.w();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.x();
        }
        return null;
    }

    public Lz getShowMotionSpec() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.y();
        }
        return null;
    }

    public CharSequence getText() {
        d dVar = this.e;
        return dVar != null ? dVar.z() : "";
    }

    public float getTextEndPadding() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.B();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.C();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!TextUtils.isEmpty(getText())) {
            d dVar = this.e;
            if (dVar != null && !dVar.J()) {
                int save = canvas.save();
                canvas.translate(b(this.e), 0.0f);
                super.onDraw(canvas);
                canvas.restoreToCount(save);
                return;
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i2, rect);
        this.n.a(z, i2, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z = false;
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 21:
                        if (keyEvent.hasNoModifiers()) {
                            z = a(s.a(this));
                            break;
                        }
                        break;
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            z = a(!s.a(this));
                            break;
                        }
                        break;
                    case 23:
                        break;
                }
            }
            int i3 = this.j;
            if (i3 == -1) {
                performClick();
                return true;
            } else if (i3 == 0) {
                c();
                return true;
            }
        } else {
            int i4 = keyEvent.hasNoModifiers() ? 2 : keyEvent.hasModifiers(1) ? 1 : 0;
            if (i4 != 0) {
                ViewParent parent = getParent();
                View view = this;
                do {
                    view = view.focusSearch(i4);
                    if (view == 0 || view == this) {
                        if (view != 0) {
                            view.requestFocus();
                            return true;
                        }
                    }
                } while (view.getParent() == parent);
                if (view != 0) {
                }
            }
        }
        if (!z) {
            return super.onKeyDown(i2, keyEvent);
        }
        invalidate();
        return true;
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), CloseCodes.PROTOCOL_ERROR);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                    }
                }
                z = false;
                if (!z || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            } else if (this.k) {
                c();
                z = true;
                setCloseIconPressed(false);
                if (!z) {
                }
                return true;
            }
            z = false;
            setCloseIconPressed(false);
            if (!z) {
            }
            return true;
        }
        if (contains) {
            setCloseIconPressed(true);
        }
        z = false;
        if (!z) {
        }
        return true;
        z = true;
        if (!z) {
        }
        return true;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.e || drawable == this.f) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int i2) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.e || drawable == this.f) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i2) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(z);
        }
    }

    public void setCheckableResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(i2);
        }
    }

    public void setChecked(boolean z) {
        d dVar = this.e;
        if (dVar == null) {
            this.i = z;
        } else if (dVar.D()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z) {
                OnCheckedChangeListener onCheckedChangeListener = this.h;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(this, z);
                }
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.b(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.c(i2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.d(i2);
        }
    }

    public void setChipCornerRadius(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(f2);
        }
    }

    public void setChipCornerRadiusResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.e(i2);
        }
    }

    public void setChipDrawable(d dVar) {
        d dVar2 = this.e;
        if (dVar2 != dVar) {
            c(dVar2);
            this.e = dVar;
            a(this.e);
            if (Yz.a) {
                this.f = new RippleDrawable(Yz.a(this.e.x()), this.e, null);
                this.e.f(false);
                C1778vc.a((View) this, (Drawable) this.f);
                return;
            }
            this.e.f(true);
            C1778vc.a((View) this, (Drawable) this.e);
        }
    }

    public void setChipEndPadding(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.b(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.b(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.g(i2);
        }
    }

    public void setChipIconSize(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.c(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.h(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.b(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.i(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.j(i2);
        }
    }

    public void setChipMinHeight(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.d(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.k(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.e(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.l(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.c(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.m(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.f(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.n(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.c(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.g(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.o(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.p(i2);
        }
    }

    public void setCloseIconSize(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.h(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.q(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.i(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.r(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.d(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.s(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.t(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.e != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                d dVar = this.e;
                if (dVar != null) {
                    dVar.a(truncateAt);
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(Lz lz) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(lz);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.u(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.j(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.v(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.k(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.w(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        d dVar = this.e;
        if (dVar != null) {
            dVar.x(i2);
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: 0000 */
    public void setOnCheckedChangeListenerInternal(OnCheckedChangeListener onCheckedChangeListener) {
        this.h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.e(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.y(i2);
        }
    }

    public void setShowMotionSpec(Lz lz) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.b(lz);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.z(i2);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.e != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            CharSequence a2 = C0211Hb.a().a(charSequence);
            if (this.e.J()) {
                a2 = null;
            }
            super.setText(a2, bufferType);
            d dVar = this.e;
            if (dVar != null) {
                dVar.b(charSequence);
            }
        }
    }

    public void setTextAppearance(Wz wz) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(wz);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().c(getContext(), getPaint(), this.q);
            a(wz);
        }
    }

    public void setTextAppearanceResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.A(i2);
        }
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.l(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.B(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.m(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.C(i2);
        }
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = Integer.MIN_VALUE;
        this.o = new Rect();
        this.p = new RectF();
        this.q = new a(this);
        a(attributeSet);
        d a2 = d.a(context, attributeSet, i2, Cz.Widget_MaterialComponents_Chip_Action);
        setChipDrawable(a2);
        this.n = new a(this);
        C1778vc.a((View) this, (C0273Wb) this.n);
        g();
        setChecked(this.i);
        a2.e(false);
        setText(a2.z());
        setEllipsize(a2.t());
        setIncludeFontPadding(false);
        if (getTextAppearance() != null) {
            a(getTextAppearance());
        }
        setSingleLine();
        setGravity(8388627);
        h();
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            String str = "http://schemas.android.com/apk/res/android";
            if (attributeSet.getAttributeValue(str, "background") != null) {
                throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            } else if (attributeSet.getAttributeValue(str, "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue(str, "drawableStart") == null) {
                String str2 = "Please set end drawable using R.attr#closeIcon.";
                if (attributeSet.getAttributeValue(str, "drawableEnd") != null) {
                    throw new UnsupportedOperationException(str2);
                } else if (attributeSet.getAttributeValue(str, "drawableRight") != null) {
                    throw new UnsupportedOperationException(str2);
                } else if (attributeSet.getAttributeBooleanValue(str, "singleLine", true) && attributeSet.getAttributeIntValue(str, "lines", 1) == 1 && attributeSet.getAttributeIntValue(str, "minLines", 1) == 1 && attributeSet.getAttributeIntValue(str, "maxLines", 1) == 1) {
                    if (attributeSet.getAttributeIntValue(str, "gravity", 8388627) != 8388627) {
                        Log.w("Chip", "Chip text must be vertically center and start aligned");
                    }
                } else {
                    throw new UnsupportedOperationException("Chip does not support multi-line text");
                }
            } else {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
        }
    }

    private void c(d dVar) {
        if (dVar != null) {
            dVar.a((com.google.android.material.chip.d.a) null);
        }
    }

    private int[] d() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.m) {
            i3++;
        }
        if (this.l) {
            i3++;
        }
        if (this.k) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.m) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.l) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.k) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    private float b(d dVar) {
        float chipStartPadding = getChipStartPadding() + dVar.a() + getTextStartPadding();
        return C1778vc.l(this) == 0 ? chipStartPadding : -chipStartPadding;
    }

    public boolean c() {
        boolean z;
        playSoundEffect(0);
        OnClickListener onClickListener = this.g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.n.a(0, 1);
        return z;
    }

    public void setCheckedIconVisible(boolean z) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.b(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.c(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.d(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        d dVar = this.e;
        if (dVar != null) {
            dVar.A(i2);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().c(context, getPaint(), this.q);
            a(getTextAppearance());
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        d dVar = this.e;
        if (dVar != null) {
            dVar.A(i2);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().c(getContext(), getPaint(), this.q);
            a(getTextAppearance());
        }
    }

    private void a(d dVar) {
        dVar.a((com.google.android.material.chip.d.a) this);
    }

    public void a() {
        h();
        requestLayout();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean a(MotionEvent motionEvent) {
        String str = "Unable to send Accessibility Exit event";
        String str2 = "Chip";
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = Vc.class.getDeclaredField("p");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.n)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = Vc.class.getDeclaredMethod("i", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.n, new Object[]{Integer.valueOf(Integer.MIN_VALUE)});
                    return true;
                }
            } catch (NoSuchMethodException e2) {
                Log.e(str2, str, e2);
            } catch (IllegalAccessException e3) {
                Log.e(str2, str, e3);
            } catch (InvocationTargetException e4) {
                Log.e(str2, str, e4);
            } catch (NoSuchFieldException e5) {
                Log.e(str2, str, e5);
            }
        }
        return false;
    }

    private boolean a(boolean z) {
        e();
        if (z) {
            if (this.j == -1) {
                setFocusedVirtualView(0);
                return true;
            }
        } else if (this.j == 0) {
            setFocusedVirtualView(-1);
            return true;
        }
        return false;
    }

    private void a(Wz wz) {
        TextPaint paint = getPaint();
        paint.drawableState = this.e.getState();
        wz.b(getContext(), paint, this.q);
    }
}
