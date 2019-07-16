package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

public class FlowLayout extends ViewGroup {
    private int a;

    public static class a extends LayoutParams {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            super(0, 0);
            this.a = i;
            this.b = i2;
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new a(1, 1);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                a aVar = (a) childAt.getLayoutParams();
                if (paddingLeft + measuredWidth > i5) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.a;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
                paddingLeft += measuredWidth + aVar.a;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            i3 = MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        } else {
            i3 = MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i4 = paddingLeft;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                childAt.measure(MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i3);
                int measuredWidth = childAt.getMeasuredWidth();
                i5 = Math.max(i5, childAt.getMeasuredHeight() + aVar.b);
                if (i4 + measuredWidth > size) {
                    i4 = getPaddingLeft();
                    paddingTop += i5;
                }
                i4 += measuredWidth + aVar.a;
            }
        }
        this.a = i5;
        if (MeasureSpec.getMode(i2) == 0) {
            size2 = paddingTop + i5;
        } else if (MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int i7 = paddingTop + i5;
            if (i7 < size2) {
                size2 = i7;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
