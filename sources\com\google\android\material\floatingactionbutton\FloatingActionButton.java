package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.C0350q;
import androidx.appcompat.widget.C0351s;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.core.widget.n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.f;
import com.google.android.material.internal.r;
import com.google.android.material.internal.s;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;

@androidx.coordinatorlayout.widget.CoordinatorLayout.b(Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton implements C1629qc, n, Qz {
    private ColorStateList b;
    private Mode c;
    private ColorStateList d;
    private Mode e;
    private int f;
    private ColorStateList g;
    private int h;
    private int i;
    /* access modifiers changed from: private */
    public int j;
    private int k;
    boolean l;
    final Rect m;
    private final Rect n;
    private final C0351s o;
    private final Sz p;
    private e q;

    protected static class BaseBehavior<T extends FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {
        private Rect a;
        private a b;
        private boolean c;

        public BaseBehavior() {
            this.c = true;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((d) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.a(this.b, false);
            } else {
                floatingActionButton.b(this.b, false);
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dz.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(Dz.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        public void a(d dVar) {
            if (dVar.h == 0) {
                dVar.h = 80;
            }
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (a(view)) {
                b(view, floatingActionButton);
            }
            return false;
        }

        private static boolean a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof d) {
                return ((d) layoutParams).d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            d dVar = (d) floatingActionButton.getLayoutParams();
            if (this.c && dVar.c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            f.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.a(this.b, false);
            } else {
                floatingActionButton.b(this.b, false);
            }
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List b2 = coordinatorLayout.b((View) floatingActionButton);
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) b2.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.c((View) floatingActionButton, i);
            a(coordinatorLayout, floatingActionButton);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        private void a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                d dVar = (d) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= dVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= dVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C1778vc.d(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C1778vc.c(floatingActionButton, i2);
                }
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.a(coordinatorLayout, floatingActionButton, rect);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ void a(d dVar) {
            super.a(dVar);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.b(coordinatorLayout, floatingActionButton, view);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.a(coordinatorLayout, floatingActionButton, i);
        }
    }

    public static abstract class a {
        public abstract void a(FloatingActionButton floatingActionButton);

        public abstract void b(FloatingActionButton floatingActionButton);
    }

    private class b implements _z {
        b() {
        }

        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.m.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.j, i2 + FloatingActionButton.this.j, i3 + FloatingActionButton.this.j, i4 + FloatingActionButton.this.j);
        }

        public float b() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        public void a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        public boolean a() {
            return FloatingActionButton.this.l;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.floatingActionButtonStyle);
    }

    private void d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.d;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.e;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0350q.a(colorForState, mode));
        }
    }

    private e getImpl() {
        if (this.q == null) {
            this.q = c();
        }
        return this.q;
    }

    /* access modifiers changed from: 0000 */
    public void b(a aVar, boolean z) {
        getImpl().b(a(aVar), z);
    }

    public void c(AnimatorListener animatorListener) {
        getImpl().c(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    public Mode getBackgroundTintMode() {
        return this.c;
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().e();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f();
    }

    public Drawable getContentBackground() {
        return getImpl().b();
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        return this.p.a();
    }

    public Lz getHideMotionSpec() {
        return getImpl().d();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.g;
    }

    public Lz getShowMotionSpec() {
        return getImpl().g();
    }

    public int getSize() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public int getSizeDimension() {
        return a(this.h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.l;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().j();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().o();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.j = (sizeDimension - this.k) / 2;
        getImpl().s();
        int min = Math.min(a(sizeDimension, i2), a(sizeDimension, i3));
        Rect rect = this.m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        this.p.a((Bundle) extendableSavedState.c.get("expandableWidgetHelper"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
        extendableSavedState.c.put("expandableWidgetHelper", this.p.c());
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !a(this.n) || this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            getImpl().a(colorStateList);
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            getImpl().a(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().a(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().b(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().d(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 >= 0) {
            this.i = i2;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i2) {
        this.p.a(i2);
    }

    public void setHideMotionSpec(Lz lz) {
        getImpl().a(lz);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(Lz.a(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().r();
    }

    public void setImageResource(int i2) {
        this.o.a(i2);
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setShowMotionSpec(Lz lz) {
        getImpl().b(lz);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(Lz.a(getContext(), i2));
    }

    public void setSize(int i2) {
        this.i = 0;
        if (i2 != this.h) {
            this.h = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            d();
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            d();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.l != z) {
            this.l = z;
            getImpl().n();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new Rect();
        this.n = new Rect();
        TypedArray a2 = r.a(context, attributeSet, Dz.FloatingActionButton, i2, Cz.Widget_Design_FloatingActionButton, new int[0]);
        this.b = Uz.a(context, a2, Dz.FloatingActionButton_backgroundTint);
        this.c = s.a(a2.getInt(Dz.FloatingActionButton_backgroundTintMode, -1), null);
        this.g = Uz.a(context, a2, Dz.FloatingActionButton_rippleColor);
        this.h = a2.getInt(Dz.FloatingActionButton_fabSize, -1);
        this.i = a2.getDimensionPixelSize(Dz.FloatingActionButton_fabCustomSize, 0);
        this.f = a2.getDimensionPixelSize(Dz.FloatingActionButton_borderWidth, 0);
        float dimension = a2.getDimension(Dz.FloatingActionButton_elevation, 0.0f);
        float dimension2 = a2.getDimension(Dz.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = a2.getDimension(Dz.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.l = a2.getBoolean(Dz.FloatingActionButton_useCompatPadding, false);
        this.k = a2.getDimensionPixelSize(Dz.FloatingActionButton_maxImageSize, 0);
        Lz a3 = Lz.a(context, a2, Dz.FloatingActionButton_showMotionSpec);
        Lz a4 = Lz.a(context, a2, Dz.FloatingActionButton_hideMotionSpec);
        a2.recycle();
        this.o = new C0351s(this);
        this.o.a(attributeSet, i2);
        this.p = new Sz(this);
        getImpl().a(this.b, this.c, this.g, this.f);
        getImpl().a(dimension);
        getImpl().b(dimension2);
        getImpl().d(dimension3);
        getImpl().a(this.k);
        getImpl().b(a3);
        getImpl().a(a4);
        setScaleType(ScaleType.MATRIX);
    }

    private void c(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.m;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public void b(AnimatorListener animatorListener) {
        getImpl().b(animatorListener);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            getImpl().b(this.g);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar, boolean z) {
        getImpl().a(a(aVar), z);
    }

    public boolean b() {
        return getImpl().i();
    }

    public void a(AnimatorListener animatorListener) {
        getImpl().a(animatorListener);
    }

    public void b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        c(rect);
    }

    public boolean a() {
        return this.p.b();
    }

    private d a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new a(this, aVar);
    }

    private e c() {
        if (VERSION.SDK_INT >= 21) {
            return new f(this, new b());
        }
        return new e(this, new b());
    }

    private int a(int i2) {
        int i3;
        int i4 = this.i;
        if (i4 != 0) {
            return i4;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i3 = a(1);
            } else {
                i3 = a(0);
            }
            return i3;
        } else if (i2 != 1) {
            return resources.getDimensionPixelSize(C1831wz.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(C1831wz.design_fab_size_mini);
        }
    }

    public void d(AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    @Deprecated
    public boolean a(Rect rect) {
        if (!C1778vc.B(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        c(rect);
        return true;
    }

    private static int a(int i2, int i3) {
        int mode = MeasureSpec.getMode(i3);
        int size = MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }
}
