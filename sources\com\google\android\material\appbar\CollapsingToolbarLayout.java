package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.android.material.internal.e;
import com.google.android.material.internal.f;
import com.google.android.material.internal.r;

public class CollapsingToolbarLayout extends FrameLayout {
    private boolean a;
    private int b;
    private Toolbar c;
    private View d;
    private View e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final Rect j;
    final e k;
    private boolean l;
    private boolean m;
    private Drawable n;
    Drawable o;
    private int p;
    private boolean q;
    private ValueAnimator r;
    private long s;
    private int t;
    private b u;
    int v;
    Ic w;

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        int a = 0;
        float b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dz.CollapsingToolbarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(Dz.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            a(obtainStyledAttributes.getFloat(Dz.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public void a(float f) {
            this.b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private class a implements b {
        a() {
        }

        public void a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.v = i;
            Ic ic = collapsingToolbarLayout.w;
            int e = ic != null ? ic.e() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                f b = CollapsingToolbarLayout.b(childAt);
                int i3 = layoutParams.a;
                if (i3 == 1) {
                    b.b(C1598pb.a(-i, 0, CollapsingToolbarLayout.this.a(childAt)));
                } else if (i3 == 2) {
                    b.b(Math.round(((float) (-i)) * layoutParams.b));
                }
            }
            CollapsingToolbarLayout.this.a();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.o != null && e > 0) {
                C1778vc.F(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.k.b(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - C1778vc.m(CollapsingToolbarLayout.this)) - e)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    private void b() {
        if (this.a) {
            Toolbar toolbar = null;
            this.c = null;
            this.d = null;
            int i2 = this.b;
            if (i2 != -1) {
                this.c = (Toolbar) findViewById(i2);
                Toolbar toolbar2 = this.c;
                if (toolbar2 != null) {
                    this.d = c(toolbar2);
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i3);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i3++;
                }
                this.c = toolbar;
            }
            d();
            this.a = false;
        }
    }

    private View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private void d() {
        if (!this.l) {
            View view = this.e;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.e);
                }
            }
        }
        if (this.l && this.c != null) {
            if (this.e == null) {
                this.e = new View(getContext());
            }
            if (this.e.getParent() == null) {
                this.c.addView(this.e, -1, -1);
            }
        }
    }

    private boolean e(View view) {
        View view2 = this.d;
        if (view2 == null || view2 == this) {
            if (view == this.c) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Ic a(Ic ic) {
        Ic ic2 = C1778vc.i(this) ? ic : null;
        if (!C0243Pb.a(this.w, ic2)) {
            this.w = ic2;
            requestLayout();
        }
        return ic.a();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        b();
        if (this.c == null) {
            Drawable drawable = this.n;
            if (drawable != null && this.p > 0) {
                drawable.mutate().setAlpha(this.p);
                this.n.draw(canvas);
            }
        }
        if (this.l && this.m) {
            this.k.a(canvas);
        }
        if (this.o != null && this.p > 0) {
            Ic ic = this.w;
            int e2 = ic != null ? ic.e() : 0;
            if (e2 > 0) {
                this.o.setBounds(0, -this.v, getWidth(), e2 - this.v);
                this.o.mutate().setAlpha(this.p);
                this.o.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        if (this.n == null || this.p <= 0 || !e(view)) {
            z = false;
        } else {
            this.n.mutate().setAlpha(this.p);
            this.n.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j2) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        e eVar = this.k;
        if (eVar != null) {
            z |= eVar.a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCollapsedTitleGravity() {
        return this.k.c();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.k.e();
    }

    public Drawable getContentScrim() {
        return this.n;
    }

    public int getExpandedTitleGravity() {
        return this.k.g();
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.k.h();
    }

    /* access modifiers changed from: 0000 */
    public int getScrimAlpha() {
        return this.p;
    }

    public long getScrimAnimationDuration() {
        return this.s;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.t;
        if (i2 >= 0) {
            return i2;
        }
        Ic ic = this.w;
        int e2 = ic != null ? ic.e() : 0;
        int m2 = C1778vc.m(this);
        if (m2 > 0) {
            return Math.min((m2 * 2) + e2, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.o;
    }

    public CharSequence getTitle() {
        if (this.l) {
            return this.k.j();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C1778vc.a((View) this, C1778vc.i((View) parent));
            if (this.u == null) {
                this.u = new a();
            }
            ((AppBarLayout) parent).a(this.u);
            C1778vc.G(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        b bVar = this.u;
        if (bVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).b(bVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        Ic ic = this.w;
        if (ic != null) {
            int e2 = ic.e();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!C1778vc.i(childAt) && childAt.getTop() < e2) {
                    C1778vc.d(childAt, e2);
                }
            }
        }
        if (this.l) {
            View view = this.e;
            if (view != null) {
                boolean z2 = true;
                this.m = C1778vc.A(view) && this.e.getVisibility() == 0;
                if (this.m) {
                    if (C1778vc.l(this) != 1) {
                        z2 = false;
                    }
                    View view2 = this.d;
                    if (view2 == null) {
                        view2 = this.c;
                    }
                    int a2 = a(view2);
                    f.a((ViewGroup) this, this.e, this.j);
                    this.k.a(this.j.left + (z2 ? this.c.getTitleMarginEnd() : this.c.getTitleMarginStart()), this.j.top + a2 + this.c.getTitleMarginTop(), this.j.right + (z2 ? this.c.getTitleMarginStart() : this.c.getTitleMarginEnd()), (this.j.bottom + a2) - this.c.getTitleMarginBottom());
                    this.k.b(z2 ? this.h : this.f, this.j.top + this.g, (i4 - i2) - (z2 ? this.f : this.h), (i5 - i3) - this.i);
                    this.k.m();
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            b(getChildAt(i7)).c();
        }
        if (this.c != null) {
            if (this.l && TextUtils.isEmpty(this.k.j())) {
                setTitle(this.c.getTitle());
            }
            View view3 = this.d;
            if (view3 == null || view3 == this) {
                setMinimumHeight(d(this.c));
            } else {
                setMinimumHeight(d(view3));
            }
        }
        a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        b();
        super.onMeasure(i2, i3);
        int mode = MeasureSpec.getMode(i3);
        Ic ic = this.w;
        int e2 = ic != null ? ic.e() : 0;
        if (mode == 0 && e2 > 0) {
            super.onMeasure(i2, MeasureSpec.makeMeasureSpec(getMeasuredHeight() + e2, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.k.b(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.k.a(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.k.a(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.n;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.n = drawable3;
            Drawable drawable4 = this.n;
            if (drawable4 != null) {
                drawable4.setBounds(0, 0, getWidth(), getHeight());
                this.n.setCallback(this);
                this.n.setAlpha(this.p);
            }
            C1778vc.F(this);
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(androidx.core.content.a.c(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.k.d(i2);
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.h = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.g = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.k.c(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.k.b(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.k.b(typeface);
    }

    /* access modifiers changed from: 0000 */
    public void setScrimAlpha(int i2) {
        if (i2 != this.p) {
            if (this.n != null) {
                Toolbar toolbar = this.c;
                if (toolbar != null) {
                    C1778vc.F(toolbar);
                }
            }
            this.p = i2;
            C1778vc.F(this);
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.s = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.t != i2) {
            this.t = i2;
            a();
        }
    }

    public void setScrimsShown(boolean z) {
        a(z, C1778vc.B(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o = drawable3;
            Drawable drawable4 = this.o;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.o.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.a(this.o, C1778vc.l(this));
                this.o.setVisible(getVisibility() == 0, false);
                this.o.setCallback(this);
                this.o.setAlpha(this.p);
            }
            C1778vc.F(this);
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(androidx.core.content.a.c(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.k.a(charSequence);
        c();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.l) {
            this.l = z;
            c();
            d();
            requestLayout();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.o;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.o.setVisible(z, false);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.n.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n || drawable == this.o;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.k.a(colorStateList);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = true;
        this.j = new Rect();
        this.t = -1;
        this.k = new e(this);
        this.k.b(Ez.e);
        TypedArray a2 = r.a(context, attributeSet, Dz.CollapsingToolbarLayout, i2, Cz.Widget_Design_CollapsingToolbar, new int[0]);
        this.k.d(a2.getInt(Dz.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.k.b(a2.getInt(Dz.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = a2.getDimensionPixelSize(Dz.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (a2.hasValue(Dz.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f = a2.getDimensionPixelSize(Dz.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (a2.hasValue(Dz.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.h = a2.getDimensionPixelSize(Dz.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (a2.hasValue(Dz.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.g = a2.getDimensionPixelSize(Dz.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (a2.hasValue(Dz.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.i = a2.getDimensionPixelSize(Dz.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.l = a2.getBoolean(Dz.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(a2.getText(Dz.CollapsingToolbarLayout_title));
        this.k.c(Cz.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.k.a(C1376i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (a2.hasValue(Dz.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.k.c(a2.getResourceId(Dz.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (a2.hasValue(Dz.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.k.a(a2.getResourceId(Dz.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.t = a2.getDimensionPixelSize(Dz.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.s = (long) a2.getInt(Dz.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(a2.getDrawable(Dz.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(a2.getDrawable(Dz.CollapsingToolbarLayout_statusBarScrim));
        this.b = a2.getResourceId(Dz.CollapsingToolbarLayout_toolbarId, -1);
        a2.recycle();
        setWillNotDraw(false);
        C1778vc.a((View) this, (C1506mc) new d(this));
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    private void c() {
        setContentDescription(getTitle());
    }

    public void a(boolean z, boolean z2) {
        if (this.q != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                a(i2);
            } else {
                if (!z) {
                    i2 = 0;
                }
                setScrimAlpha(i2);
            }
            this.q = z;
        }
    }

    private void a(int i2) {
        b();
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator == null) {
            this.r = new ValueAnimator();
            this.r.setDuration(this.s);
            this.r.setInterpolator(i2 > this.p ? Ez.c : Ez.d);
            this.r.addUpdateListener(new e(this));
        } else if (valueAnimator.isRunning()) {
            this.r.cancel();
        }
        this.r.setIntValues(new int[]{this.p, i2});
        this.r.start();
    }

    private static int d(View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    static f b(View view) {
        f fVar = (f) view.getTag(C1891yz.view_offset_helper);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(view);
        view.setTag(C1891yz.view_offset_helper, fVar2);
        return fVar2;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.n != null || this.o != null) {
            setScrimsShown(getHeight() + this.v < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(View view) {
        return ((getHeight() - b(view).a()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }
}
