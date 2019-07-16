package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    private int a;
    private int b;
    private Drawable c;
    private Drawable d;
    private final int e;
    private boolean f;
    View g;
    float h;
    private float i;
    int j;
    boolean k;
    private int l;
    private float m;
    private float n;
    private d o;
    final Zc p;
    boolean q;
    private boolean r;
    private final Rect s;
    final ArrayList<b> t;
    private Method u;
    private Field v;
    private boolean w;

    public static class LayoutParams extends MarginLayoutParams {
        private static final int[] a = {16843137};
        public float b = 0.0f;
        boolean c;
        boolean d;
        Paint e;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
            this.b = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new a();
        boolean c;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt() != 0;
        }
    }

    class a extends C0273Wb {
        private final Rect d = new Rect();

        a() {
        }

        public void a(View view, Mc mc) {
            Mc a = Mc.a(mc);
            super.a(view, a);
            a(mc, a);
            a.y();
            mc.b((CharSequence) SlidingPaneLayout.class.getName());
            mc.d(view);
            ViewParent q = C1778vc.q(view);
            if (q instanceof View) {
                mc.c((View) q);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!c(childAt) && childAt.getVisibility() == 0) {
                    C1778vc.f(childAt, 1);
                    mc.a(childAt);
                }
            }
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public boolean c(View view) {
            return SlidingPaneLayout.this.e(view);
        }

        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!c(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void a(Mc mc, Mc mc2) {
            Rect rect = this.d;
            mc2.a(rect);
            mc.c(rect);
            mc2.b(rect);
            mc.d(rect);
            mc.q(mc2.w());
            mc.f(mc2.i());
            mc.b(mc2.d());
            mc.c(mc2.f());
            mc.h(mc2.p());
            mc.e(mc2.o());
            mc.i(mc2.q());
            mc.j(mc2.r());
            mc.a(mc2.l());
            mc.o(mc2.v());
            mc.l(mc2.s());
            mc.a(mc2.b());
            mc.b(mc2.h());
        }
    }

    private class b implements Runnable {
        final View a;

        b(View view) {
            this.a = view;
        }

        public void run() {
            if (this.a.getParent() == SlidingPaneLayout.this) {
                this.a.setLayerType(0, null);
                SlidingPaneLayout.this.d(this.a);
            }
            SlidingPaneLayout.this.t.remove(this);
        }
    }

    private class c extends defpackage.Zc.a {
        c() {
        }

        public void a(View view, int i) {
            SlidingPaneLayout.this.f();
        }

        public boolean b(View view, int i) {
            if (SlidingPaneLayout.this.k) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).c;
        }

        public void c(int i) {
            if (SlidingPaneLayout.this.p.f() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.h == 0.0f) {
                    slidingPaneLayout.f(slidingPaneLayout.g);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.a(slidingPaneLayout2.g);
                    SlidingPaneLayout.this.q = false;
                    return;
                }
                slidingPaneLayout.b(slidingPaneLayout.g);
                SlidingPaneLayout.this.q = true;
            }
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.a(i);
            SlidingPaneLayout.this.invalidate();
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public void a(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.b()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.h > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.j;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.g.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.h > 0.5f)) {
                    i += SlidingPaneLayout.this.j;
                }
            }
            SlidingPaneLayout.this.p.d(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public int a(View view) {
            return SlidingPaneLayout.this.j;
        }

        public int a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.g.getLayoutParams();
            if (SlidingPaneLayout.this.b()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.g.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.j);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.j + paddingLeft);
        }

        public void a(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.p.a(slidingPaneLayout.g, i2);
        }
    }

    public interface d {
        void a(View view);

        void a(View view, float f);

        void b(View view);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean g(View view) {
        boolean z = true;
        if (view.isOpaque()) {
            return true;
        }
        if (VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background == null) {
            return false;
        }
        if (background.getOpacity() != -1) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void a(View view) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: 0000 */
    public void b(View view) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: 0000 */
    public void c(View view) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.a(view, this.h);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.p.a(true)) {
            if (!this.f) {
                this.p.a();
                return;
            }
            C1778vc.F(this);
        }
    }

    public boolean d() {
        return this.f;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i2;
        int i3;
        super.draw(canvas);
        if (b()) {
            drawable = this.d;
        } else {
            drawable = this.c;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (b()) {
                i3 = childAt.getRight();
                i2 = intrinsicWidth + i3;
            } else {
                int left = childAt.getLeft();
                int i4 = left - intrinsicWidth;
                i2 = left;
                i3 = i4;
            }
            drawable.setBounds(i3, top, i2, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f && !layoutParams.c && this.g != null) {
            canvas.getClipBounds(this.s);
            if (b()) {
                Rect rect = this.s;
                rect.left = Math.max(rect.left, this.g.getRight());
            } else {
                Rect rect2 = this.s;
                rect2.right = Math.min(rect2.right, this.g.getLeft());
            }
            canvas.clipRect(this.s);
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public boolean e() {
        return b(this.g, 0);
    }

    /* access modifiers changed from: 0000 */
    public void f(View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        View view2 = view;
        boolean b2 = b();
        int width = b2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = b2 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !g(view)) {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            i5 = view.getLeft();
            i4 = view.getRight();
            i3 = view.getTop();
            i2 = view.getBottom();
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt != view2) {
                if (childAt.getVisibility() == 8) {
                    z = b2;
                } else {
                    int max = Math.max(b2 ? paddingLeft : width, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    if (b2) {
                        z = b2;
                        i6 = width;
                    } else {
                        z = b2;
                        i6 = paddingLeft;
                    }
                    childAt.setVisibility((max < i5 || max2 < i3 || Math.min(i6, childAt.getRight()) > i4 || Math.min(height, childAt.getBottom()) > i2) ? 0 : 4);
                }
                i7++;
                view2 = view;
                b2 = z;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.b;
    }

    public int getParallaxDistance() {
        return this.l;
    }

    public int getSliderFadeColor() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.t.get(i2)).run();
        }
        this.t.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (!this.f && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.q = !this.p.a(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.f || (this.k && actionMasked != 0)) {
            this.p.b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.p.b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.k = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.m = x;
                this.n = y;
                if (this.p.a(this.g, (int) x, (int) y) && e(this.g)) {
                    z = true;
                    if (!this.p.b(motionEvent) && !z) {
                        z2 = false;
                    }
                    return z2;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.m);
                float abs2 = Math.abs(y2 - this.n);
                if (abs > ((float) this.p.e()) && abs2 > abs) {
                    this.p.b();
                    this.k = true;
                    return false;
                }
            }
            z = false;
            z2 = false;
            return z2;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean b2 = b();
        if (b2) {
            this.p.d(2);
        } else {
            this.p.d(1);
        }
        int i10 = i4 - i2;
        int paddingRight = b2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = b2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.r) {
            this.h = (!this.f || !this.q) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        int i12 = i11;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.c) {
                    int i14 = i10 - paddingLeft;
                    int min = (Math.min(i11, i14 - this.e) - i12) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.j = min;
                    int i15 = b2 ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.d = ((i12 + i15) + min) + (measuredWidth / 2) > i14;
                    int i16 = (int) (((float) min) * this.h);
                    i7 = i15 + i16 + i12;
                    this.h = ((float) i16) / ((float) this.j);
                    i6 = 0;
                } else {
                    if (this.f) {
                        int i17 = this.l;
                        if (i17 != 0) {
                            i6 = (int) ((1.0f - this.h) * ((float) i17));
                            i7 = i11;
                        }
                    }
                    i7 = i11;
                    i6 = 0;
                }
                if (b2) {
                    i8 = (i10 - i7) + i6;
                    i9 = i8 - measuredWidth;
                } else {
                    i9 = i7 - i6;
                    i8 = i9 + measuredWidth;
                }
                childAt.layout(i9, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                i11 += childAt.getWidth();
                i12 = i7;
            }
        }
        if (this.r) {
            if (this.f) {
                if (this.l != 0) {
                    a(this.h);
                }
                if (((LayoutParams) this.g.getLayoutParams()).d) {
                    a(this.g, this.h, this.a);
                }
            } else {
                for (int i18 = 0; i18 < childCount; i18++) {
                    a(getChildAt(i18), 0.0f, this.a);
                }
            }
            f(this.g);
        }
        this.r = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size2 = MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i5 = 0;
        } else if (mode2 != 1073741824) {
            i5 = 0;
            i4 = 0;
        } else {
            i5 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = i5;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.g = null;
        int i14 = i5;
        int i15 = paddingLeft;
        int i16 = 0;
        boolean z2 = false;
        float f2 = 0.0f;
        while (true) {
            i6 = 8;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.d = z;
            } else {
                float f3 = layoutParams.b;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (layoutParams.width == 0) {
                    }
                }
                int i17 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    i12 = MeasureSpec.makeMeasureSpec(paddingLeft - i17, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    i12 = MeasureSpec.makeMeasureSpec(paddingLeft - i17, 1073741824);
                } else {
                    i12 = MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i13 = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    i13 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    i13 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(i12, i13);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i14) {
                    i14 = Math.min(measuredHeight, i4);
                }
                i15 -= measuredWidth;
                boolean z3 = i15 < 0;
                layoutParams.c = z3;
                boolean z4 = z3 | z2;
                if (layoutParams.c) {
                    this.g = childAt;
                }
                z2 = z4;
            }
            i16++;
            z = false;
        }
        if (z2 || f2 > 0.0f) {
            int i18 = paddingLeft - this.e;
            int i19 = 0;
            while (i19 < childCount) {
                View childAt2 = getChildAt(i19);
                if (childAt2.getVisibility() != i6) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i6) {
                        boolean z5 = layoutParams2.width == 0 && layoutParams2.b > 0.0f;
                        if (z5) {
                            i8 = 0;
                        } else {
                            i8 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.g) {
                            if (layoutParams2.b > 0.0f) {
                                if (layoutParams2.width != 0) {
                                    i9 = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    i9 = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                                } else if (layoutParams2.height == -1) {
                                    i9 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                } else {
                                    i9 = MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                if (z2) {
                                    int i20 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i7 = i18;
                                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i20, 1073741824);
                                    if (i8 != i20) {
                                        childAt2.measure(makeMeasureSpec, i9);
                                    }
                                    i19++;
                                    i18 = i7;
                                    i6 = 8;
                                } else {
                                    i7 = i18;
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(i8 + ((int) ((layoutParams2.b * ((float) Math.max(0, i15))) / f2)), 1073741824), i9);
                                    i19++;
                                    i18 = i7;
                                    i6 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i8 > i18 || layoutParams2.b > 0.0f)) {
                            if (!z5) {
                                i10 = 1073741824;
                                i11 = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                i11 = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                                i10 = 1073741824;
                            } else if (layoutParams2.height == -1) {
                                i10 = 1073741824;
                                i11 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
                            } else {
                                i10 = 1073741824;
                                i11 = MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(MeasureSpec.makeMeasureSpec(i18, i10), i11);
                        }
                    }
                }
                i7 = i18;
                i19++;
                i18 = i7;
                i6 = 8;
            }
        }
        setMeasuredDimension(size, i14 + getPaddingTop() + getPaddingBottom());
        this.f = z2;
        if (this.p.f() != 0 && !z2) {
            this.p.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        if (savedState.c) {
            e();
        } else {
            a();
        }
        this.q = savedState.c;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = d() ? c() : this.q;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.r = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        this.p.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.m = x;
            this.n = y;
        } else if (actionMasked == 1 && e(this.g)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x2 - this.m;
            float f3 = y2 - this.n;
            int e2 = this.p.e();
            if ((f2 * f2) + (f3 * f3) < ((float) (e2 * e2)) && this.p.a(this.g, (int) x2, (int) y2)) {
                a(this.g, 0);
            }
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f) {
            this.q = view == this.g;
        }
    }

    public void setCoveredFadeColor(int i2) {
        this.b = i2;
    }

    public void setPanelSlideListener(d dVar) {
        this.o = dVar;
    }

    public void setParallaxDistance(int i2) {
        this.l = i2;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i2) {
        setShadowDrawable(getResources().getDrawable(i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(androidx.core.content.a.c(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(androidx.core.content.a.c(getContext(), i2));
    }

    public void setSliderFadeColor(int i2) {
        this.a = i2;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = -858993460;
        this.r = true;
        this.s = new Rect();
        this.t = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.e = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        C1778vc.a((View) this, (C0273Wb) new a());
        C1778vc.f(this, 1);
        this.p = Zc.a((ViewGroup) this, 0.5f, (defpackage.Zc.a) new c());
        this.p.a(f2 * 400.0f);
    }

    /* access modifiers changed from: 0000 */
    public void d(View view) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 17) {
            C1778vc.a(view, ((LayoutParams) view.getLayoutParams()).e);
            return;
        }
        if (i2 >= 16) {
            String str = "SlidingPaneLayout";
            if (!this.w) {
                try {
                    this.u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException e2) {
                    Log.e(str, "Couldn't fetch getDisplayList method; dimming won't work right.", e2);
                }
                try {
                    this.v = View.class.getDeclaredField("mRecreateDisplayList");
                    this.v.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e(str, "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e3);
                }
                this.w = true;
            }
            if (this.u != null) {
                Field field = this.v;
                if (field != null) {
                    try {
                        field.setBoolean(view, true);
                        this.u.invoke(view, null);
                    } catch (Exception e4) {
                        Log.e(str, "Error refreshing display list state", e4);
                    }
                }
            }
            view.invalidate();
            return;
        }
        C1778vc.a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: 0000 */
    public boolean e(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f && layoutParams.d && this.h > 0.0f) {
            z = true;
        }
        return z;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public boolean c() {
        return !this.f || this.h == 1.0f;
    }

    private boolean a(View view, int i2) {
        if (!this.r && !a(0.0f, i2)) {
            return false;
        }
        this.q = false;
        return true;
    }

    private boolean b(View view, int i2) {
        if (!this.r && !a(1.0f, i2)) {
            return false;
        }
        this.q = true;
        return true;
    }

    public boolean a() {
        return a(this.g, 0);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return C1778vc.l(this) == 1;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        if (this.g == null) {
            this.h = 0.0f;
            return;
        }
        boolean b2 = b();
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        int width = this.g.getWidth();
        if (b2) {
            i2 = (getWidth() - i2) - width;
        }
        this.h = ((float) (i2 - ((b2 ? getPaddingRight() : getPaddingLeft()) + (b2 ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.j);
        if (this.l != 0) {
            a(this.h);
        }
        if (layoutParams.d) {
            a(this.g, this.h, this.a);
        }
        c(this.g);
    }

    private void a(View view, float f2, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 > 0.0f && i2 != 0) {
            int i3 = (((int) (((float) ((-16777216 & i2) >>> 24)) * f2)) << 24) | (i2 & 16777215);
            if (layoutParams.e == null) {
                layoutParams.e = new Paint();
            }
            layoutParams.e.setColorFilter(new PorterDuffColorFilter(i3, Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.e);
            }
            d(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.e;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            b bVar = new b(view);
            this.t.add(bVar);
            C1778vc.a((View) this, (Runnable) bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(float f2, int i2) {
        int i3;
        if (!this.f) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        if (b()) {
            i3 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f2 * ((float) this.j))) + ((float) this.g.getWidth())));
        } else {
            i3 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f2 * ((float) this.j)));
        }
        Zc zc = this.p;
        View view = this.g;
        if (!zc.b(view, i3, view.getTop())) {
            return false;
        }
        f();
        C1778vc.F(this);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    private void a(float f2) {
        boolean z;
        int childCount;
        boolean b2 = b();
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        if (layoutParams.d) {
            if ((b2 ? layoutParams.rightMargin : layoutParams.leftMargin) <= 0) {
                z = true;
                childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt != this.g) {
                        float f3 = 1.0f - this.i;
                        int i3 = this.l;
                        int i4 = (int) (f3 * ((float) i3));
                        this.i = f2;
                        int i5 = i4 - ((int) ((1.0f - f2) * ((float) i3)));
                        if (b2) {
                            i5 = -i5;
                        }
                        childAt.offsetLeftAndRight(i5);
                        if (z) {
                            a(childAt, b2 ? this.i - 1.0f : 1.0f - this.i, this.b);
                        }
                    }
                }
            }
        }
        z = false;
        childCount = getChildCount();
        while (i2 < childCount) {
        }
    }
}
