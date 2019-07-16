package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class ActionBarOverlayLayout extends ViewGroup implements C, C1444kc {
    static final int[] a = {C0294a.actionBarSize, 16842841};
    private final Runnable A;
    private final C1475lc B;
    private int b;
    private int c;
    private ContentFrameLayout d;
    ActionBarContainer e;
    private D f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private a v;
    private OverScroller w;
    ViewPropertyAnimator x;
    final AnimatorListenerAdapter y;
    private final Runnable z;

    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface a {
        void a();

        void a(int i);

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        boolean z2 = false;
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.g == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.h = z2;
        this.w = new OverScroller(context);
    }

    private void k() {
        h();
        this.A.run();
    }

    private void l() {
        h();
        postDelayed(this.A, 600);
    }

    private void m() {
        h();
        postDelayed(this.z, 600);
    }

    private void n() {
        h();
        this.z.run();
    }

    public boolean b() {
        j();
        return this.f.b();
    }

    public boolean c() {
        j();
        return this.f.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean d() {
        j();
        return this.f.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g != null && !this.h) {
            int bottom = this.e.getVisibility() == 0 ? (int) (((float) this.e.getBottom()) + this.e.getTranslationY() + 0.5f) : 0;
            this.g.setBounds(0, bottom, getWidth(), this.g.getIntrinsicHeight() + bottom);
            this.g.draw(canvas);
        }
    }

    public void e() {
        j();
        this.f.e();
    }

    public boolean f() {
        j();
        return this.f.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        j();
        int t2 = C1778vc.t(this) & 256;
        boolean a2 = a(this.e, rect, true, true, false, true);
        this.r.set(rect);
        Ba.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            a2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    public void g() {
        j();
        this.f.l();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        j();
        return this.f.getTitle();
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean i() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        if (this.d == null) {
            this.d = (ContentFrameLayout) findViewById(C1283f.action_bar_activity_content);
            this.e = (ActionBarContainer) findViewById(C1283f.action_bar_container);
            this.f = a(findViewById(C1283f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        C1778vc.G(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i7 = layoutParams.leftMargin + paddingLeft;
                int i8 = layoutParams.topMargin + paddingTop;
                childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        j();
        measureChildWithMargins(this.e, i2, 0, i3, 0);
        LayoutParams layoutParams = (LayoutParams) this.e.getLayoutParams();
        int max = Math.max(0, this.e.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.e.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.e.getMeasuredState());
        boolean z2 = (C1778vc.t(this) & 256) != 0;
        if (z2) {
            i4 = this.b;
            if (this.j && this.e.getTabContainer() != null) {
                i4 += this.b;
            }
        } else {
            i4 = this.e.getVisibility() != 8 ? this.e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.t.set(this.r);
        if (this.i || z2) {
            Rect rect = this.t;
            rect.top += i4;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.q;
            rect2.top += i4;
            rect2.bottom += 0;
        }
        a(this.d, this.q, true, true, true, true);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            this.d.a(this.t);
        }
        measureChildWithMargins(this.d, i2, 0, i3, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.d.getLayoutParams();
        int max3 = Math.max(max, this.d.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.d.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.k || !z2) {
            return false;
        }
        if (a(f2, f3)) {
            k();
        } else {
            n();
        }
        this.l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        this.m += i3;
        setActionBarHideOffset(this.m);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.a(view, view2, i2);
        this.m = getActionBarHideOffset();
        h();
        a aVar = this.v;
        if (aVar != null) {
            aVar.d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.e.getHeight()) {
                m();
            } else {
                l();
            }
        }
        a aVar = this.v;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        j();
        int i3 = this.n ^ i2;
        this.n = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        a aVar = this.v;
        if (aVar != null) {
            aVar.a(!z2);
            if (z3 || !z2) {
                this.v.a();
            } else {
                this.v.c();
            }
        }
        if ((i3 & 256) != 0 && this.v != null) {
            C1778vc.G(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.c = i2;
        a aVar = this.v;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.e.setTranslationY((float) (-Math.max(0, Math.min(i2, this.e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.v = aVar;
        if (getWindowToken() != null) {
            this.v.a(this.c);
            int i2 = this.n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                C1778vc.G(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.k) {
            this.k = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        j();
        this.f.setIcon(i2);
    }

    public void setLogo(int i2) {
        j();
        this.f.b(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.i = z2;
        this.h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Callback callback) {
        j();
        this.f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        this.f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.y = new C0337d(this);
        this.z = new C0338e(this);
        this.A = new C0339f(this);
        a(context);
        this.B = new C1475lc(this);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        this.f.setIcon(drawable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    private boolean a(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z2) {
            int i2 = layoutParams.leftMargin;
            int i3 = rect.left;
            if (i2 != i3) {
                layoutParams.leftMargin = i3;
                z6 = true;
                if (z3) {
                    int i4 = layoutParams.topMargin;
                    int i5 = rect.top;
                    if (i4 != i5) {
                        layoutParams.topMargin = i5;
                        z6 = true;
                    }
                }
                if (z5) {
                    int i6 = layoutParams.rightMargin;
                    int i7 = rect.right;
                    if (i6 != i7) {
                        layoutParams.rightMargin = i7;
                        z6 = true;
                    }
                }
                if (z4) {
                    return z6;
                }
                int i8 = layoutParams.bottomMargin;
                int i9 = rect.bottom;
                if (i8 == i9) {
                    return z6;
                }
                layoutParams.bottomMargin = i9;
                return true;
            }
        }
        z6 = false;
        if (z3) {
        }
        if (z5) {
        }
        if (z4) {
        }
    }

    private D a(View view) {
        if (view instanceof D) {
            return (D) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    private boolean a(float f2, float f3) {
        this.w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER);
        return this.w.getFinalY() > this.e.getHeight();
    }

    public void a(int i2) {
        j();
        if (i2 == 2) {
            this.f.k();
        } else if (i2 == 5) {
            this.f.n();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public boolean a() {
        j();
        return this.f.a();
    }

    public void a(Menu menu, androidx.appcompat.view.menu.v.a aVar) {
        j();
        this.f.a(menu, aVar);
    }
}
