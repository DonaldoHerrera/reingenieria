package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Array;

public class NestedCoordinatorLayout extends CoordinatorLayout implements C1321gc {
    private C1352hc y = getNestedScrollingChildHelper();

    public NestedCoordinatorLayout(Context context) {
        super(context);
        setNestedScrollingEnabled(true);
    }

    public void a(View view, int i, int i2, int[] iArr, int i3) {
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, new int[]{2, 2});
        super.a(view, i, i2, iArr, i3);
        dispatchNestedPreScroll(i, i2, iArr2[1], null);
        iArr[0] = iArr2[0][0] + iArr2[1][0];
        iArr[1] = iArr2[0][1] + iArr2[1][1];
    }

    public boolean b(View view, View view2, int i, int i2) {
        return startNestedScroll(i) || super.b(view, view2, i, i2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.y.a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.y.a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.y.a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.y.a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public C1352hc getNestedScrollingChildHelper() {
        return new C1352hc(this);
    }

    public boolean hasNestedScrollingParent() {
        return this.y.a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.y.b();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z) || super.onNestedFling(view, f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2) || super.onNestedPreFling(view, f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, new int[]{2, 2});
        super.onNestedPreScroll(view, i, i2, iArr2[0]);
        dispatchNestedPreScroll(i, i2, iArr2[1], null);
        iArr[0] = iArr2[0][0] + iArr2[1][0];
        iArr[1] = iArr2[0][1] + iArr2[1][1];
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        super.onNestedScroll(view, i, i2, i3, i4);
        dispatchNestedScroll(i, i2, i3, i4, null);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return startNestedScroll(i) || super.onStartNestedScroll(view, view2, i);
    }

    public void onStopNestedScroll(View view) {
        super.onStopNestedScroll(view);
        stopNestedScroll();
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.y.a(z);
    }

    public boolean startNestedScroll(int i) {
        return this.y.b(i);
    }

    public void stopNestedScroll() {
        this.y.c();
    }

    public NestedCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setNestedScrollingEnabled(true);
    }

    public void a(View view, int i, int i2, int i3, int i4, int i5) {
        super.a(view, i, i2, i3, i4, i5);
        dispatchNestedScroll(i, i2, i3, i4, null);
    }

    public NestedCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setNestedScrollingEnabled(true);
    }

    public void a(View view, int i) {
        super.a(view, i);
        stopNestedScroll();
    }
}
