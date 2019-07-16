package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.view.menu.w;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.l.b, w {
    d A;
    private l p;
    private Context q;
    private int r;
    private boolean s;
    private ActionMenuPresenter t;
    private androidx.appcompat.view.menu.v.a u;
    androidx.appcompat.view.menu.l.a v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty
        public boolean c;
        @ExportedProperty
        public int d;
        @ExportedProperty
        public int e;
        @ExportedProperty
        public boolean f;
        @ExportedProperty
        public boolean g;
        boolean h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.c = layoutParams.c;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.c = false;
        }
    }

    public interface a {
        boolean b();

        boolean c();
    }

    private static class b implements androidx.appcompat.view.menu.v.a {
        b() {
        }

        public void a(l lVar, boolean z) {
        }

        public boolean a(l lVar) {
            return false;
        }
    }

    private class c implements androidx.appcompat.view.menu.l.a {
        c() {
        }

        public boolean a(l lVar, MenuItem menuItem) {
            d dVar = ActionMenuView.this.A;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        public void a(l lVar) {
            androidx.appcompat.view.menu.l.a aVar = ActionMenuView.this.v;
            if (aVar != null) {
                aVar.a(lVar);
            }
        }
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    static int a(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.d();
        int i5 = 2;
        if (i2 <= 0 || (z3 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z3 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.c || !z3) {
            z2 = false;
        }
        layoutParams.f = z2;
        layoutParams.d = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x023b A[LOOP:5: B:134:0x023b->B:138:0x025a, LOOP_START, PHI: r13 
  PHI: (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:133:0x0239, B:138:0x025a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0262  */
    private void e(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i10 = size - paddingLeft;
        int i11 = this.y;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = i11 + (i13 / i12);
        int childCount = getChildCount();
        int i15 = i12;
        int i16 = 0;
        int i17 = 0;
        boolean z5 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        long j = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            int i21 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i22 = i18 + 1;
                if (z6) {
                    int i23 = this.z;
                    i9 = i22;
                    z4 = false;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i9 = i22;
                    z4 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.h = z4;
                layoutParams.e = z4 ? 1 : 0;
                layoutParams.d = z4;
                layoutParams.f = z4;
                layoutParams.leftMargin = z4;
                layoutParams.rightMargin = z4;
                layoutParams.g = z6 && ((ActionMenuItemView) childAt).d();
                int a2 = a(childAt, i14, layoutParams.c ? 1 : i15, childMeasureSpec, paddingTop);
                int max = Math.max(i19, a2);
                if (layoutParams.f) {
                    i20++;
                }
                if (layoutParams.c) {
                    z5 = true;
                }
                i15 -= a2;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (a2 == 1) {
                    j |= (long) (1 << i16);
                    i17 = i17;
                } else {
                    int i24 = i17;
                }
                i19 = max;
                i18 = i9;
            }
            i16++;
            size2 = i21;
        }
        int i25 = size2;
        boolean z7 = z5 && i18 == 2;
        boolean z8 = false;
        while (true) {
            if (i20 <= 0 || i15 <= 0) {
                i5 = mode;
                i3 = i10;
                z2 = z8;
                i4 = i17;
            } else {
                int i26 = BaseClientBuilder.API_PRIORITY_OTHER;
                int i27 = 0;
                int i28 = 0;
                long j2 = 0;
                while (i27 < childCount) {
                    boolean z9 = z8;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i27).getLayoutParams();
                    int i29 = i17;
                    if (layoutParams2.f) {
                        int i30 = layoutParams2.d;
                        if (i30 < i26) {
                            i26 = i30;
                            j2 = 1 << i27;
                            i28 = 1;
                        } else if (i30 == i26) {
                            j2 |= 1 << i27;
                            i28++;
                        }
                    }
                    i27++;
                    i17 = i29;
                    z8 = z9;
                }
                z2 = z8;
                i4 = i17;
                j |= j2;
                if (i28 > i15) {
                    i5 = mode;
                    i3 = i10;
                    break;
                }
                int i31 = i26 + 1;
                int i32 = 0;
                while (i32 < childCount) {
                    View childAt2 = getChildAt(i32);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i33 = i10;
                    int i34 = mode;
                    long j3 = (long) (1 << i32);
                    if ((j2 & j3) == 0) {
                        if (layoutParams3.d == i31) {
                            j |= j3;
                        }
                        i8 = i31;
                    } else {
                        if (!z7 || !layoutParams3.g || i15 != 1) {
                            i8 = i31;
                        } else {
                            int i35 = this.z;
                            i8 = i31;
                            childAt2.setPadding(i35 + i14, 0, i35, 0);
                        }
                        layoutParams3.d++;
                        layoutParams3.h = true;
                        i15--;
                    }
                    i32++;
                    mode = i34;
                    i31 = i8;
                    i10 = i33;
                }
                i17 = i4;
                z8 = true;
            }
        }
        if (!z5) {
            i6 = 1;
            if (i18 == 1) {
                z3 = true;
                if (i15 > 0 || j == 0 || (i15 >= i18 - i6 && !z3 && i19 <= i6)) {
                    i7 = 0;
                } else {
                    float bitCount = (float) Long.bitCount(j);
                    if (!z3) {
                        if ((j & 1) != 0) {
                            i7 = 0;
                            if (!((LayoutParams) getChildAt(0).getLayoutParams()).g) {
                                bitCount -= 0.5f;
                            }
                        } else {
                            i7 = 0;
                        }
                        int i36 = childCount - 1;
                        if ((j & ((long) (1 << i36))) != 0 && !((LayoutParams) getChildAt(i36).getLayoutParams()).g) {
                            bitCount -= 0.5f;
                        }
                    } else {
                        i7 = 0;
                    }
                    int i37 = bitCount > 0.0f ? (int) (((float) (i15 * i14)) / bitCount) : 0;
                    for (int i38 = 0; i38 < childCount; i38++) {
                        if ((j & ((long) (1 << i38))) != 0) {
                            View childAt3 = getChildAt(i38);
                            LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                layoutParams4.e = i37;
                                layoutParams4.h = true;
                                if (i38 == 0 && !layoutParams4.g) {
                                    layoutParams4.leftMargin = (-i37) / 2;
                                }
                            } else if (layoutParams4.c) {
                                layoutParams4.e = i37;
                                layoutParams4.h = true;
                                layoutParams4.rightMargin = (-i37) / 2;
                            } else {
                                if (i38 != 0) {
                                    layoutParams4.leftMargin = i37 / 2;
                                }
                                if (i38 != childCount - 1) {
                                    layoutParams4.rightMargin = i37 / 2;
                                }
                            }
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    while (i7 < childCount) {
                        View childAt4 = getChildAt(i7);
                        LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                        if (layoutParams5.h) {
                            childAt4.measure(MeasureSpec.makeMeasureSpec((layoutParams5.d * i14) + layoutParams5.e, 1073741824), childMeasureSpec);
                        }
                        i7++;
                    }
                }
                setMeasuredDimension(i3, i5 == 1073741824 ? i4 : i25);
            }
        } else {
            i6 = 1;
        }
        z3 = false;
        if (i15 > 0) {
        }
        i7 = 0;
        if (z2) {
        }
        setMeasuredDimension(i3, i5 == 1073741824 ? i4 : i25);
    }

    public void b() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.d();
        }
    }

    public LayoutParams c() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.c = true;
        return generateDefaultLayoutParams;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    public boolean d() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        return actionMenuPresenter != null && actionMenuPresenter.f();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean f() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        return actionMenuPresenter != null && actionMenuPresenter.i();
    }

    public boolean g() {
        return this.s;
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            this.p = new l(context);
            this.p.a((androidx.appcompat.view.menu.l.a) new c());
            this.t = new ActionMenuPresenter(context);
            this.t.d(true);
            ActionMenuPresenter actionMenuPresenter = this.t;
            androidx.appcompat.view.menu.v.a aVar = this.u;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter.a(aVar);
            this.p.a((v) this.t, this.q);
            this.t.a(this);
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.t.e();
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public l h() {
        return this.p;
    }

    public boolean i() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        return actionMenuPresenter != null && actionMenuPresenter.j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.a(false);
            if (this.t.i()) {
                this.t.f();
                this.t.j();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.w) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = Ba.a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (d(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i7 = getPaddingLeft() + layoutParams.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    boolean d2 = d(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.c) {
                    int i19 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
                i6++;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !layoutParams3.c) {
                    int i21 = paddingLeft + layoutParams3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i9 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
                }
                i6++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z2 = this.w;
        this.w = MeasureSpec.getMode(i) == 1073741824;
        if (z2 != this.w) {
            this.x = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.w) {
            l lVar = this.p;
            if (!(lVar == null || size == this.x)) {
                this.x = size;
                lVar.b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.w || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        e(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.t.c(z2);
    }

    public void setOnMenuItemClickListener(d dVar) {
        this.A = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.t.a(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.t = actionMenuPresenter;
        this.t.a(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f);
        this.z = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }

    /* access modifiers changed from: protected */
    public boolean d(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).b();
        }
        if (i > 0 && (childAt2 instanceof a)) {
            z2 |= ((a) childAt2).c();
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.b = 16;
        return layoutParams;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.b <= 0) {
            layoutParams2.b = 16;
        }
        return layoutParams2;
    }

    public boolean a(p pVar) {
        return this.p.a((MenuItem) pVar, 0);
    }

    public void a(l lVar) {
        this.p = lVar;
    }

    public void a(androidx.appcompat.view.menu.v.a aVar, androidx.appcompat.view.menu.l.a aVar2) {
        this.u = aVar;
        this.v = aVar2;
    }

    public boolean e() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        return actionMenuPresenter != null && actionMenuPresenter.h();
    }
}
