package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public static class LayoutParams extends MarginLayoutParams {
        public float a;
        public int b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1406j.LinearLayoutCompat_Layout);
            this.a = obtainStyledAttributes.getFloat(C1406j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.b = obtainStyledAttributes.getInt(C1406j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = -1;
            this.a = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = -1;
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    private void c(int i2, int i3) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View a2 = a(i4);
            if (a2.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i5 = layoutParams.width;
                    layoutParams.width = a2.getMeasuredWidth();
                    measureChildWithMargins(a2, i3, 0, makeMeasureSpec, 0);
                    layoutParams.width = i5;
                }
            }
        }
    }

    private void d(int i2, int i3) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View a2 = a(i4);
            if (a2.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i5 = layoutParams.height;
                    layoutParams.height = a2.getMeasuredHeight();
                    measureChildWithMargins(a2, makeMeasureSpec, 0, i3, 0);
                    layoutParams.height = i5;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int a(View view, int i2) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public void a(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int virtualChildCount = getVirtualChildCount();
        boolean a2 = Ba.a(this);
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            View a3 = a(i6);
            if (!(a3 == null || a3.getVisibility() == 8 || !b(i6))) {
                LayoutParams layoutParams = (LayoutParams) a3.getLayoutParams();
                if (a2) {
                    i5 = a3.getRight() + layoutParams.rightMargin;
                } else {
                    i5 = (a3.getLeft() - layoutParams.leftMargin) - this.l;
                }
                b(canvas, i5);
            }
        }
        if (b(virtualChildCount)) {
            View a4 = a(virtualChildCount - 1);
            if (a4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) a4.getLayoutParams();
                if (a2) {
                    i4 = a4.getLeft() - layoutParams2.leftMargin;
                    i3 = this.l;
                } else {
                    i2 = a4.getRight() + layoutParams2.rightMargin;
                    b(canvas, i2);
                }
            } else if (a2) {
                i2 = getPaddingLeft();
                b(canvas, i2);
            } else {
                i4 = getWidth() - getPaddingRight();
                i3 = this.l;
            }
            i2 = i4 - i3;
            b(canvas, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public int b(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public void b(Canvas canvas) {
        int i2;
        int virtualChildCount = getVirtualChildCount();
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View a2 = a(i3);
            if (!(a2 == null || a2.getVisibility() == 8 || !b(i3))) {
                a(canvas, (a2.getTop() - ((LayoutParams) a2.getLayoutParams()).topMargin) - this.m);
            }
        }
        if (b(virtualChildCount)) {
            View a3 = a(virtualChildCount - 1);
            if (a3 == null) {
                i2 = (getHeight() - getPaddingBottom()) - this.m;
            } else {
                i2 = a3.getBottom() + ((LayoutParams) a3.getLayoutParams()).bottomMargin;
            }
            a(canvas, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public int c(int i2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public int getBaseline() {
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.c;
                if (this.d == 1) {
                    int i4 = this.e & 112;
                    if (i4 != 48) {
                        if (i4 == 16) {
                            i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
                        } else if (i4 == 80) {
                            i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                        }
                    }
                }
                return i3 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.k != null) {
            if (this.d == 1) {
                b(canvas);
            } else {
                a(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.d == 1) {
            b(i2, i3, i4, i5);
        } else {
            a(i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.d == 1) {
            b(i2, i3);
        } else {
            a(i2, i3);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.b = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.k) {
            this.k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.l = drawable.getIntrinsicWidth();
                this.m = drawable.getIntrinsicHeight();
            } else {
                this.l = 0;
                this.m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.o = i2;
    }

    public void setGravity(int i2) {
        if (this.e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.e;
        if ((8388615 & i4) != i3) {
            this.e = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int i2) {
        if (this.d != i2) {
            this.d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.n) {
            requestLayout();
        }
        this.n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.e;
        if ((i4 & 112) != i3) {
            this.e = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.g = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        int i2 = this.d;
        if (i2 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        na a2 = na.a(context, attributeSet, C1406j.LinearLayoutCompat, i2, 0);
        int d2 = a2.d(C1406j.LinearLayoutCompat_android_orientation, -1);
        if (d2 >= 0) {
            setOrientation(d2);
        }
        int d3 = a2.d(C1406j.LinearLayoutCompat_android_gravity, -1);
        if (d3 >= 0) {
            setGravity(d3);
        }
        boolean a3 = a2.a(C1406j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.g = a2.b(C1406j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.b = a2.d(C1406j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = a2.a(C1406j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.b(C1406j.LinearLayoutCompat_divider));
        this.n = a2.d(C1406j.LinearLayoutCompat_showDividers, 0);
        this.o = a2.c(C1406j.LinearLayoutCompat_dividerPadding, 0);
        a2.a();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public void b(Canvas canvas, int i2) {
        this.k.setBounds(i2, getPaddingTop() + this.o, this.l + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    public void a(Canvas canvas, int i2) {
        this.k.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean b(int i2) {
        boolean z = false;
        if (i2 == 0) {
            if ((this.n & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i2 == getChildCount()) {
            if ((this.n & 4) != 0) {
                z = true;
            }
            return z;
        } else {
            if ((this.n & 2) != 0) {
                int i3 = i2 - 1;
                while (true) {
                    if (i3 < 0) {
                        break;
                    } else if (getChildAt(i3).getVisibility() != 8) {
                        z = true;
                        break;
                    } else {
                        i3--;
                    }
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    public View a(int i2) {
        return getChildAt(i2);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d5  */
    public void a(int i2, int i3) {
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        boolean z;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        int i15;
        View view;
        int i16;
        boolean z4;
        int i17;
        int i18 = i2;
        int i19 = i3;
        this.f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i2);
        int mode2 = MeasureSpec.getMode(i3);
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr2 = this.i;
        int[] iArr3 = this.j;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z5 = this.a;
        boolean z6 = this.h;
        int i20 = 1073741824;
        boolean z7 = mode == 1073741824;
        float f3 = 0.0f;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z8 = false;
        int i26 = 0;
        boolean z9 = true;
        boolean z10 = false;
        while (true) {
            iArr = iArr3;
            if (i21 >= virtualChildCount) {
                break;
            }
            View a2 = a(i21);
            if (a2 == null) {
                this.f += c(i21);
            } else if (a2.getVisibility() == 8) {
                i21 += a(a2, i21);
            } else {
                if (b(i21)) {
                    this.f += this.l;
                }
                LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
                float f4 = f3 + layoutParams.a;
                if (mode == i20 && layoutParams.width == 0 && layoutParams.a > 0.0f) {
                    if (z7) {
                        this.f += layoutParams.leftMargin + layoutParams.rightMargin;
                    } else {
                        int i27 = this.f;
                        this.f = Math.max(i27, layoutParams.leftMargin + i27 + layoutParams.rightMargin);
                    }
                    if (z5) {
                        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        i15 = i21;
                        z3 = z6;
                        z2 = z5;
                        view = a2;
                    } else {
                        i15 = i21;
                        z3 = z6;
                        z2 = z5;
                        view = a2;
                        i16 = 1073741824;
                        z8 = true;
                        if (mode2 == i16 && layoutParams.height == -1) {
                            z4 = true;
                            z10 = true;
                        } else {
                            z4 = false;
                        }
                        int i28 = layoutParams.topMargin + layoutParams.bottomMargin;
                        int measuredHeight = view.getMeasuredHeight() + i28;
                        int combineMeasuredStates = View.combineMeasuredStates(i26, view.getMeasuredState());
                        if (z2) {
                            int baseline = view.getBaseline();
                            if (baseline != -1) {
                                int i29 = layoutParams.b;
                                if (i29 < 0) {
                                    i29 = this.e;
                                }
                                int i30 = (((i29 & 112) >> 4) & -2) >> 1;
                                iArr2[i30] = Math.max(iArr2[i30], baseline);
                                iArr[i30] = Math.max(iArr[i30], measuredHeight - baseline);
                            }
                        }
                        int max = Math.max(i23, measuredHeight);
                        boolean z11 = !z9 && layoutParams.height == -1;
                        if (layoutParams.a <= 0.0f) {
                            if (!z4) {
                                i28 = measuredHeight;
                            }
                            i25 = Math.max(i25, i28);
                        } else {
                            int i31 = i25;
                            if (z4) {
                                measuredHeight = i28;
                            }
                            i24 = Math.max(i24, measuredHeight);
                            i25 = i31;
                        }
                        int i32 = i15;
                        i23 = max;
                        i26 = combineMeasuredStates;
                        z9 = z11;
                        i21 = a(view, i32) + i32;
                        f3 = f4;
                        i21++;
                        int i33 = i3;
                        iArr3 = iArr;
                        z6 = z3;
                        z5 = z2;
                        i20 = 1073741824;
                    }
                } else {
                    if (layoutParams.width != 0 || layoutParams.a <= 0.0f) {
                        i17 = Integer.MIN_VALUE;
                    } else {
                        layoutParams.width = -2;
                        i17 = 0;
                    }
                    i15 = i21;
                    int i34 = i17;
                    z3 = z6;
                    z2 = z5;
                    View view2 = a2;
                    a(a2, i15, i2, f4 == 0.0f ? this.f : 0, i3, 0);
                    int i35 = i34;
                    if (i35 != Integer.MIN_VALUE) {
                        layoutParams.width = i35;
                    }
                    int measuredWidth = view2.getMeasuredWidth();
                    if (z7) {
                        view = view2;
                        this.f += layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin + b(view);
                    } else {
                        view = view2;
                        int i36 = this.f;
                        this.f = Math.max(i36, i36 + measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin + b(view));
                    }
                    if (z3) {
                        i22 = Math.max(measuredWidth, i22);
                    }
                }
                i16 = 1073741824;
                if (mode2 == i16) {
                }
                z4 = false;
                int i282 = layoutParams.topMargin + layoutParams.bottomMargin;
                int measuredHeight2 = view.getMeasuredHeight() + i282;
                int combineMeasuredStates2 = View.combineMeasuredStates(i26, view.getMeasuredState());
                if (z2) {
                }
                int max2 = Math.max(i23, measuredHeight2);
                if (!z9) {
                }
                if (layoutParams.a <= 0.0f) {
                }
                int i322 = i15;
                i23 = max2;
                i26 = combineMeasuredStates2;
                z9 = z11;
                i21 = a(view, i322) + i322;
                f3 = f4;
                i21++;
                int i332 = i3;
                iArr3 = iArr;
                z6 = z3;
                z5 = z2;
                i20 = 1073741824;
            }
            z3 = z6;
            z2 = z5;
            i21++;
            int i3322 = i3;
            iArr3 = iArr;
            z6 = z3;
            z5 = z2;
            i20 = 1073741824;
        }
        boolean z12 = z6;
        boolean z13 = z5;
        int i37 = i23;
        int i38 = i24;
        int i39 = i25;
        int i40 = i26;
        if (this.f > 0 && b(virtualChildCount)) {
            this.f += this.l;
        }
        if (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            i4 = i40;
        } else {
            i4 = i40;
            i37 = Math.max(i37, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z12 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f = 0;
            int i41 = 0;
            while (i41 < virtualChildCount) {
                View a3 = a(i41);
                if (a3 == null) {
                    this.f += c(i41);
                } else if (a3.getVisibility() == 8) {
                    i41 += a(a3, i41);
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) a3.getLayoutParams();
                    if (z7) {
                        this.f += layoutParams2.leftMargin + i22 + layoutParams2.rightMargin + b(a3);
                    } else {
                        int i42 = this.f;
                        i14 = i37;
                        this.f = Math.max(i42, i42 + i22 + layoutParams2.leftMargin + layoutParams2.rightMargin + b(a3));
                        i41++;
                        i37 = i14;
                    }
                }
                i14 = i37;
                i41++;
                i37 = i14;
            }
        }
        int i43 = i37;
        this.f += getPaddingLeft() + getPaddingRight();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.f, getSuggestedMinimumWidth()), i18, 0);
        int i44 = (16777215 & resolveSizeAndState) - this.f;
        if (z8 || (i44 != 0 && f3 > 0.0f)) {
            float f5 = this.g;
            if (f5 > 0.0f) {
                f3 = f5;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f = 0;
            int i45 = i38;
            int i46 = i4;
            int i47 = -1;
            float f6 = f3;
            int i48 = 0;
            while (i48 < virtualChildCount) {
                View a4 = a(i48);
                if (a4 == null || a4.getVisibility() == 8) {
                    i11 = i44;
                    i10 = virtualChildCount;
                    int i49 = i3;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) a4.getLayoutParams();
                    float f7 = layoutParams3.a;
                    if (f7 > 0.0f) {
                        int i50 = (int) ((((float) i44) * f7) / f6);
                        float f8 = f6 - f7;
                        int i51 = i44 - i50;
                        i10 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + layoutParams3.topMargin + layoutParams3.bottomMargin, layoutParams3.height);
                        if (layoutParams3.width == 0) {
                            i13 = 1073741824;
                            if (mode == 1073741824) {
                                if (i50 <= 0) {
                                    i50 = 0;
                                }
                                a4.measure(MeasureSpec.makeMeasureSpec(i50, 1073741824), childMeasureSpec);
                                i46 = View.combineMeasuredStates(i46, a4.getMeasuredState() & -16777216);
                                f6 = f8;
                                i11 = i51;
                            }
                        } else {
                            i13 = 1073741824;
                        }
                        int measuredWidth2 = a4.getMeasuredWidth() + i50;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        a4.measure(MeasureSpec.makeMeasureSpec(measuredWidth2, i13), childMeasureSpec);
                        i46 = View.combineMeasuredStates(i46, a4.getMeasuredState() & -16777216);
                        f6 = f8;
                        i11 = i51;
                    } else {
                        i11 = i44;
                        i10 = virtualChildCount;
                        int i52 = i3;
                    }
                    if (z7) {
                        this.f += a4.getMeasuredWidth() + layoutParams3.leftMargin + layoutParams3.rightMargin + b(a4);
                        f2 = f6;
                    } else {
                        int i53 = this.f;
                        f2 = f6;
                        this.f = Math.max(i53, a4.getMeasuredWidth() + i53 + layoutParams3.leftMargin + layoutParams3.rightMargin + b(a4));
                    }
                    boolean z14 = mode2 != 1073741824 && layoutParams3.height == -1;
                    int i54 = layoutParams3.topMargin + layoutParams3.bottomMargin;
                    int measuredHeight3 = a4.getMeasuredHeight() + i54;
                    i47 = Math.max(i47, measuredHeight3);
                    if (!z14) {
                        i54 = measuredHeight3;
                    }
                    int max3 = Math.max(i45, i54);
                    if (z9) {
                        i12 = -1;
                        if (layoutParams3.height == -1) {
                            z = true;
                            if (z13) {
                                int baseline2 = a4.getBaseline();
                                if (baseline2 != i12) {
                                    int i55 = layoutParams3.b;
                                    if (i55 < 0) {
                                        i55 = this.e;
                                    }
                                    int i56 = (((i55 & 112) >> 4) & -2) >> 1;
                                    iArr2[i56] = Math.max(iArr2[i56], baseline2);
                                    iArr[i56] = Math.max(iArr[i56], measuredHeight3 - baseline2);
                                    i45 = max3;
                                    z9 = z;
                                    f6 = f2;
                                }
                            }
                            i45 = max3;
                            z9 = z;
                            f6 = f2;
                        }
                    } else {
                        i12 = -1;
                    }
                    z = false;
                    if (z13) {
                    }
                    i45 = max3;
                    z9 = z;
                    f6 = f2;
                }
                i48++;
                int i57 = i2;
                i44 = i11;
                virtualChildCount = i10;
            }
            i6 = i3;
            i5 = virtualChildCount;
            this.f += getPaddingLeft() + getPaddingRight();
            if (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
                i9 = i47;
            } else {
                i9 = Math.max(i47, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            }
            i7 = i9;
            i4 = i46;
            i8 = i45;
        } else {
            i8 = Math.max(i38, i39);
            if (z12 && mode != 1073741824) {
                for (int i58 = 0; i58 < virtualChildCount; i58++) {
                    View a5 = a(i58);
                    if (!(a5 == null || a5.getVisibility() == 8 || ((LayoutParams) a5.getLayoutParams()).a <= 0.0f)) {
                        a5.measure(MeasureSpec.makeMeasureSpec(i22, 1073741824), MeasureSpec.makeMeasureSpec(a5.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = i3;
            i5 = virtualChildCount;
            i7 = i43;
        }
        if (z9 || mode2 == 1073741824) {
            i8 = i7;
        }
        setMeasuredDimension(resolveSizeAndState | (i4 & -16777216), View.resolveSizeAndState(Math.max(i8 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i6, i4 << 16));
        if (z10) {
            c(i5, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0330  */
    public void b(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        View view;
        int i20;
        boolean z2;
        int i21;
        int i22;
        int i23;
        int i24 = i2;
        int i25 = i3;
        this.f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int i26 = this.b;
        boolean z3 = this.h;
        float f3 = 0.0f;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            int i33 = 8;
            int i34 = i30;
            if (i32 < virtualChildCount) {
                View a2 = a(i32);
                if (a2 == null) {
                    this.f += c(i32);
                    i13 = virtualChildCount;
                    i30 = i34;
                } else {
                    int i35 = i27;
                    if (a2.getVisibility() == 8) {
                        i32 += a(a2, i32);
                        i13 = virtualChildCount;
                        i30 = i34;
                        i27 = i35;
                    } else {
                        if (b(i32)) {
                            this.f += this.m;
                        }
                        LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
                        float f4 = f3 + layoutParams.a;
                        if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.a > 0.0f) {
                            int i36 = this.f;
                            int i37 = i28;
                            this.f = Math.max(i36, layoutParams.topMargin + i36 + layoutParams.bottomMargin);
                            i20 = i29;
                            view = a2;
                            i15 = i31;
                            i23 = virtualChildCount;
                            i19 = i35;
                            i16 = i37;
                            z4 = true;
                            i18 = i32;
                            int i38 = i34;
                            i14 = mode2;
                            i17 = i38;
                        } else {
                            int i39 = i28;
                            if (layoutParams.height != 0 || layoutParams.a <= 0.0f) {
                                i22 = Integer.MIN_VALUE;
                            } else {
                                layoutParams.height = -2;
                                i22 = 0;
                            }
                            i19 = i35;
                            int i40 = i22;
                            i16 = i39;
                            int i41 = i29;
                            View view2 = a2;
                            i23 = virtualChildCount;
                            int i42 = i34;
                            i14 = mode2;
                            i17 = i42;
                            i15 = i31;
                            i18 = i32;
                            a(a2, i32, i2, 0, i3, f4 == 0.0f ? this.f : 0);
                            int i43 = i40;
                            if (i43 != Integer.MIN_VALUE) {
                                layoutParams.height = i43;
                            }
                            int measuredHeight = view2.getMeasuredHeight();
                            int i44 = this.f;
                            view = view2;
                            this.f = Math.max(i44, i44 + measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + b(view));
                            i20 = z3 ? Math.max(measuredHeight, i41) : i41;
                        }
                        if (i26 >= 0 && i26 == i18 + 1) {
                            this.c = this.f;
                        }
                        if (i18 >= i26 || layoutParams.a <= 0.0f) {
                            if (mode == 1073741824 || layoutParams.width != -1) {
                                z2 = false;
                            } else {
                                z2 = true;
                                z6 = true;
                            }
                            int i45 = layoutParams.leftMargin + layoutParams.rightMargin;
                            int measuredWidth = view.getMeasuredWidth() + i45;
                            int max = Math.max(i16, measuredWidth);
                            int combineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                            boolean z7 = z5 && layoutParams.width == -1;
                            if (layoutParams.a > 0.0f) {
                                if (!z2) {
                                    i45 = measuredWidth;
                                }
                                i17 = Math.max(i17, i45);
                                i21 = i15;
                            } else {
                                if (!z2) {
                                    i45 = measuredWidth;
                                }
                                i21 = Math.max(i15, i45);
                            }
                            i29 = i20;
                            z5 = z7;
                            i30 = i17;
                            f3 = f4;
                            int i46 = max;
                            i31 = i21;
                            i27 = combineMeasuredStates;
                            i32 = a(view, i18) + i18;
                            i28 = i46;
                            i32++;
                            int i47 = i2;
                            int i48 = i3;
                            mode2 = i14;
                            virtualChildCount = i13;
                        } else {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                    }
                }
                i14 = mode2;
                i32++;
                int i472 = i2;
                int i482 = i3;
                mode2 = i14;
                virtualChildCount = i13;
            } else {
                int i49 = i27;
                int i50 = i29;
                int i51 = i31;
                int i52 = virtualChildCount;
                int i53 = i28;
                int i54 = i34;
                int i55 = mode2;
                int i56 = i54;
                if (this.f > 0) {
                    i4 = i52;
                    if (b(i4)) {
                        this.f += this.m;
                    }
                } else {
                    i4 = i52;
                }
                if (z3) {
                    i5 = i55;
                    if (i5 == Integer.MIN_VALUE || i5 == 0) {
                        this.f = 0;
                        int i57 = 0;
                        while (i57 < i4) {
                            View a3 = a(i57);
                            if (a3 == null) {
                                this.f += c(i57);
                            } else if (a3.getVisibility() == i33) {
                                i57 += a(a3, i57);
                            } else {
                                LayoutParams layoutParams2 = (LayoutParams) a3.getLayoutParams();
                                int i58 = this.f;
                                this.f = Math.max(i58, i58 + i50 + layoutParams2.topMargin + layoutParams2.bottomMargin + b(a3));
                            }
                            i57++;
                            i33 = 8;
                        }
                    }
                } else {
                    i5 = i55;
                }
                this.f += getPaddingTop() + getPaddingBottom();
                int i59 = i3;
                int i60 = i50;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.f, getSuggestedMinimumHeight()), i59, 0);
                int i61 = (16777215 & resolveSizeAndState) - this.f;
                if (z4 || (i61 != 0 && f3 > 0.0f)) {
                    float f5 = this.g;
                    if (f5 > 0.0f) {
                        f3 = f5;
                    }
                    this.f = 0;
                    float f6 = f3;
                    int i62 = 0;
                    int i63 = i49;
                    int i64 = i51;
                    i7 = i63;
                    while (i62 < i4) {
                        View a4 = a(i62);
                        if (a4.getVisibility() == 8) {
                            f2 = f6;
                            int i65 = i2;
                        } else {
                            LayoutParams layoutParams3 = (LayoutParams) a4.getLayoutParams();
                            float f7 = layoutParams3.a;
                            if (f7 > 0.0f) {
                                int i66 = (int) ((((float) i61) * f7) / f6);
                                i9 = i61 - i66;
                                f2 = f6 - f7;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams3.leftMargin + layoutParams3.rightMargin, layoutParams3.width);
                                if (layoutParams3.height == 0) {
                                    i12 = 1073741824;
                                    if (i5 == 1073741824) {
                                        if (i66 <= 0) {
                                            i66 = 0;
                                        }
                                        a4.measure(childMeasureSpec, MeasureSpec.makeMeasureSpec(i66, 1073741824));
                                        i7 = View.combineMeasuredStates(i7, a4.getMeasuredState() & -256);
                                    }
                                } else {
                                    i12 = 1073741824;
                                }
                                int measuredHeight2 = a4.getMeasuredHeight() + i66;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                a4.measure(childMeasureSpec, MeasureSpec.makeMeasureSpec(measuredHeight2, i12));
                                i7 = View.combineMeasuredStates(i7, a4.getMeasuredState() & -256);
                            } else {
                                float f8 = f6;
                                int i67 = i2;
                                i9 = i61;
                                f2 = f8;
                            }
                            int i68 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                            int measuredWidth2 = a4.getMeasuredWidth() + i68;
                            i53 = Math.max(i53, measuredWidth2);
                            if (mode != 1073741824) {
                                i10 = i7;
                                i11 = -1;
                                if (layoutParams3.width == -1) {
                                    z = true;
                                    if (!z) {
                                        i68 = measuredWidth2;
                                    }
                                    i64 = Math.max(i64, i68);
                                    boolean z8 = !z5 && layoutParams3.width == i11;
                                    int i69 = this.f;
                                    this.f = Math.max(i69, a4.getMeasuredHeight() + i69 + layoutParams3.topMargin + layoutParams3.bottomMargin + b(a4));
                                    z5 = z8;
                                    i61 = i9;
                                    i7 = i10;
                                }
                            } else {
                                i10 = i7;
                                i11 = -1;
                            }
                            z = false;
                            if (!z) {
                            }
                            i64 = Math.max(i64, i68);
                            if (!z5) {
                            }
                            int i692 = this.f;
                            this.f = Math.max(i692, a4.getMeasuredHeight() + i692 + layoutParams3.topMargin + layoutParams3.bottomMargin + b(a4));
                            z5 = z8;
                            i61 = i9;
                            i7 = i10;
                        }
                        i62++;
                        f6 = f2;
                    }
                    i6 = i2;
                    this.f += getPaddingTop() + getPaddingBottom();
                    i8 = i64;
                } else {
                    i8 = Math.max(i51, i56);
                    if (z3 && i5 != 1073741824) {
                        for (int i70 = 0; i70 < i4; i70++) {
                            View a5 = a(i70);
                            if (!(a5 == null || a5.getVisibility() == 8 || ((LayoutParams) a5.getLayoutParams()).a <= 0.0f)) {
                                a5.measure(MeasureSpec.makeMeasureSpec(a5.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i60, 1073741824));
                            }
                        }
                    }
                    i6 = i2;
                    i7 = i49;
                }
                if (z5 || mode == 1073741824) {
                    i8 = i53;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, i7), resolveSizeAndState);
                if (z6) {
                    d(i4, i59);
                    return;
                }
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i11 = this.e;
        int i12 = i11 & 112;
        int i13 = i11 & 8388615;
        if (i12 == 16) {
            i6 = getPaddingTop() + (((i5 - i3) - this.f) / 2);
        } else if (i12 != 80) {
            i6 = getPaddingTop();
        } else {
            i6 = ((getPaddingTop() + i5) - i3) - this.f;
        }
        int i14 = 0;
        while (i14 < virtualChildCount) {
            View a2 = a(i14);
            if (a2 == null) {
                i6 += c(i14);
            } else if (a2.getVisibility() != 8) {
                int measuredWidth = a2.getMeasuredWidth();
                int measuredHeight = a2.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
                int i15 = layoutParams.b;
                if (i15 < 0) {
                    i15 = i13;
                }
                int a3 = C0287Zb.a(i15, C1778vc.l(this)) & 7;
                if (a3 == 1) {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i7 = layoutParams.rightMargin;
                    i9 = i8 - i7;
                } else if (a3 != 5) {
                    i9 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i8 = paddingRight - measuredWidth;
                    i7 = layoutParams.rightMargin;
                    i9 = i8 - i7;
                }
                int i16 = i9;
                if (b(i14)) {
                    i6 += this.m;
                }
                int i17 = i6 + layoutParams.topMargin;
                LayoutParams layoutParams2 = layoutParams;
                a(a2, i16, i17 + a(a2), measuredWidth, measuredHeight);
                i14 += a(a2, i14);
                i6 = i17 + measuredHeight + layoutParams2.bottomMargin + b(a2);
            }
            i14++;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    public void a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean a2 = Ba.a(this);
        int paddingTop = getPaddingTop();
        int i17 = i5 - i3;
        int paddingBottom = i17 - getPaddingBottom();
        int paddingBottom2 = (i17 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.e;
        int i19 = 8388615 & i18;
        int i20 = i18 & 112;
        boolean z = this.a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        int a3 = C0287Zb.a(i19, C1778vc.l(this));
        if (a3 == 1) {
            i6 = getPaddingLeft() + (((i4 - i2) - this.f) / 2);
        } else if (a3 != 5) {
            i6 = getPaddingLeft();
        } else {
            i6 = ((getPaddingLeft() + i4) - i2) - this.f;
        }
        if (a2) {
            i8 = virtualChildCount - 1;
            i7 = -1;
        } else {
            i8 = 0;
            i7 = 1;
        }
        int i21 = 0;
        while (i21 < virtualChildCount) {
            int i22 = i8 + (i7 * i21);
            View a4 = a(i22);
            if (a4 == null) {
                i6 += c(i22);
            } else if (a4.getVisibility() != 8) {
                int measuredWidth = a4.getMeasuredWidth();
                int measuredHeight = a4.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) a4.getLayoutParams();
                if (z) {
                    i12 = i21;
                    i11 = virtualChildCount;
                    if (layoutParams.height != -1) {
                        i13 = a4.getBaseline();
                        i14 = layoutParams.b;
                        if (i14 < 0) {
                            i14 = i20;
                        }
                        i15 = i14 & 112;
                        i10 = i20;
                        if (i15 != 16) {
                            i16 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        } else if (i15 == 48) {
                            int i23 = layoutParams.topMargin + paddingTop;
                            if (i13 != -1) {
                                i23 += iArr[1] - i13;
                            }
                            i16 = i23;
                        } else if (i15 != 80) {
                            i16 = paddingTop;
                        } else {
                            int i24 = (paddingBottom - measuredHeight) - layoutParams.bottomMargin;
                            if (i13 != -1) {
                                i24 -= iArr2[2] - (a4.getMeasuredHeight() - i13);
                            }
                            i16 = i24;
                        }
                        if (b(i22)) {
                            i6 += this.l;
                        }
                        int i25 = layoutParams.leftMargin + i6;
                        View view = a4;
                        View view2 = view;
                        int i26 = i22;
                        int a5 = i25 + a(a4);
                        i9 = paddingTop;
                        LayoutParams layoutParams2 = layoutParams;
                        a(view, a5, i16, measuredWidth, measuredHeight);
                        View view3 = view2;
                        i21 = i12 + a(view3, i26);
                        i6 = i25 + measuredWidth + layoutParams2.rightMargin + b(view3);
                        i21++;
                        virtualChildCount = i11;
                        i20 = i10;
                        paddingTop = i9;
                    }
                } else {
                    i12 = i21;
                    i11 = virtualChildCount;
                }
                i13 = -1;
                i14 = layoutParams.b;
                if (i14 < 0) {
                }
                i15 = i14 & 112;
                i10 = i20;
                if (i15 != 16) {
                }
                if (b(i22)) {
                }
                int i252 = layoutParams.leftMargin + i6;
                View view4 = a4;
                View view22 = view4;
                int i262 = i22;
                int a52 = i252 + a(a4);
                i9 = paddingTop;
                LayoutParams layoutParams22 = layoutParams;
                a(view4, a52, i16, measuredWidth, measuredHeight);
                View view32 = view22;
                i21 = i12 + a(view32, i262);
                i6 = i252 + measuredWidth + layoutParams22.rightMargin + b(view32);
                i21++;
                virtualChildCount = i11;
                i20 = i10;
                paddingTop = i9;
            } else {
                int i27 = i21;
            }
            i9 = paddingTop;
            i11 = virtualChildCount;
            i10 = i20;
            i21++;
            virtualChildCount = i11;
            i20 = i10;
            paddingTop = i9;
        }
    }

    private void a(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }
}
