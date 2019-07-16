package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements C1413jc, C1290fc, C1599pc {
    private static final a a = new a();
    private static final int[] b = {16843130};
    private float A;
    private b B;
    private long c;
    private final Rect d;
    private OverScroller e;
    private EdgeEffect f;
    private EdgeEffect g;
    private int h;
    private boolean i;
    private boolean j;
    private View k;
    private boolean l;
    private VelocityTracker m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final int[] t;
    private final int[] u;
    private int v;
    private int w;
    private SavedState x;
    private final C1475lc y;
    private final C1352hc z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new j();
        public int a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }
    }

    static class a extends C0273Wb {
        a() {
        }

        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.b(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.b(0, max);
                return true;
            }
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            Oc.a(accessibilityEvent, nestedScrollView.getScrollX());
            Oc.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void a(View view, Mc mc) {
            super.a(view, mc);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            mc.b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    mc.n(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        mc.a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        mc.a(4096);
                    }
                }
            }
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private static int a(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private boolean b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private boolean d(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i3 < childAt.getTop() - scrollY || i3 >= childAt.getBottom() - scrollY || i2 < childAt.getLeft() || i2 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void f() {
        this.e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.p = viewConfiguration.getScaledTouchSlop();
        this.q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void g() {
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.A;
    }

    private void h() {
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.z.a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public boolean c(int i2, int i3) {
        return this.z.a(i2, i3);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.e.isFinished()) {
            this.e.computeScrollOffset();
            int currY = this.e.getCurrY();
            int i2 = currY - this.w;
            this.w = currY;
            int[] iArr = this.u;
            boolean z2 = false;
            iArr[1] = 0;
            a(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.u[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                a(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.u;
                iArr2[1] = 0;
                a(0, scrollY2, 0, i4, this.t, 1, iArr2);
                i3 = i4 - this.u[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z2 = true;
                }
                if (z2) {
                    d();
                    if (i3 < 0) {
                        if (this.f.isFinished()) {
                            this.f.onAbsorb((int) this.e.getCurrVelocity());
                        }
                    } else if (this.g.isFinished()) {
                        this.g.onAbsorb((int) this.e.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.e.isFinished()) {
                C1778vc.F(this);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.z.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.z.a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.z.a(i2, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.f.setSize(width, height);
                if (this.f.draw(canvas)) {
                    C1778vc.F(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i3 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.g.setSize(width2, height2);
                if (this.g.draw(canvas)) {
                    C1778vc.F(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public boolean e(int i2) {
        return this.z.a(i2);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.y.a();
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return e(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.z.b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    i2 = 0;
                } else if (i2 > scrollRange) {
                    i2 = scrollRange;
                }
                if (i2 != scrollY) {
                    super.scrollTo(getScrollX(), i2);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.l) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.s;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i3);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.h) > this.p && (2 & getNestedScrollAxes()) == 0) {
                                this.l = true;
                                this.h = y2;
                                g();
                                this.m.addMovement(motionEvent);
                                this.v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.l = false;
            this.s = -1;
            h();
            if (this.e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C1778vc.F(this);
            }
            a(0);
        } else {
            int y3 = (int) motionEvent.getY();
            if (!d((int) motionEvent.getX(), y3)) {
                this.l = false;
                h();
            } else {
                this.h = y3;
                this.s = motionEvent.getPointerId(0);
                e();
                this.m.addMovement(motionEvent);
                this.e.computeScrollOffset();
                this.l = !this.e.isFinished();
                c(2, 0);
            }
        }
        return this.l;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.i = false;
        View view = this.k;
        if (view != null && a(view, (View) this)) {
            b(this.k);
        }
        this.k = null;
        if (!this.j) {
            if (this.x != null) {
                scrollTo(getScrollX(), this.x.a);
                this.x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a2 = a(scrollY, paddingTop, i6);
            if (a2 != scrollY) {
                scrollTo(getScrollX(), a2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.j = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.n && MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        c((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (view != null && !a(view)) {
            return view.requestFocus(i2, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.x = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.B;
        if (bVar != null) {
            bVar.a(this, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.d);
            offsetDescendantRectToMyCoords(findFocus, this.d);
            g(a(this.d));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return b(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        a(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        g();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.v = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.s);
                if (Math.abs(yVelocity) > this.q) {
                    int i2 = -yVelocity;
                    float f2 = (float) i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        c(i2);
                    }
                } else {
                    if (this.e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C1778vc.F(this);
                    }
                }
                this.s = -1;
                c();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.s);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.s);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.h - y2;
                    if (a(0, i3, this.u, this.t, 0)) {
                        i3 -= this.u[1];
                        obtain.offsetLocation(0.0f, (float) this.t[1]);
                        this.v += this.t[1];
                    }
                    if (!this.l && Math.abs(i3) > this.p) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.l = true;
                        if (i3 > 0) {
                            i3 -= this.p;
                        } else {
                            i3 += this.p;
                        }
                    }
                    int i4 = i3;
                    if (this.l) {
                        this.h = y2 - this.t[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i5 = scrollRange;
                        int i6 = findPointerIndex;
                        if (a(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !e(0)) {
                            this.m.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int i7 = i4 - scrollY2;
                        int[] iArr = this.u;
                        iArr[1] = 0;
                        a(0, scrollY2, 0, i7, this.t, 0, iArr);
                        int i8 = this.h;
                        int[] iArr2 = this.t;
                        this.h = i8 - iArr2[1];
                        obtain.offsetLocation(0.0f, (float) iArr2[1]);
                        this.v += this.t[1];
                        if (z2) {
                            int i9 = i4 - this.u[1];
                            d();
                            int i10 = scrollY + i9;
                            if (i10 < 0) {
                                f.a(this.f, ((float) i9) / ((float) getHeight()), motionEvent2.getX(i6) / ((float) getWidth()));
                                if (!this.g.isFinished()) {
                                    this.g.onRelease();
                                }
                            } else {
                                int i11 = i6;
                                if (i10 > i5) {
                                    f.a(this.g, ((float) i9) / ((float) getHeight()), 1.0f - (motionEvent2.getX(i11) / ((float) getWidth())));
                                    if (!this.f.isFinished()) {
                                        this.f.onRelease();
                                    }
                                }
                            }
                            EdgeEffect edgeEffect = this.f;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.g.isFinished())) {
                                C1778vc.F(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.l && getChildCount() > 0 && this.e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C1778vc.F(this);
                }
                this.s = -1;
                c();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.h = (int) motionEvent2.getY(actionIndex);
                this.s = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                a(motionEvent);
                this.h = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.s));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.e.isFinished();
            this.l = z3;
            if (z3) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (!this.e.isFinished()) {
                a();
            }
            this.h = (int) motionEvent.getY();
            this.s = motionEvent2.getPointerId(0);
            c(2, 0);
        }
        VelocityTracker velocityTracker2 = this.m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.i) {
            b(view2);
        } else {
            this.k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return a(rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            h();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int a2 = a(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int a3 = a(i3, height, height2);
            if (a2 != getScrollX() || a3 != getScrollY()) {
                super.scrollTo(a2, a3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.n) {
            this.n = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.z.a(z2);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.o = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return c(i2, 0);
    }

    public void stopNestedScroll() {
        a(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void e() {
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker == null) {
            this.m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public void a(int i2) {
        this.z.c(i2);
    }

    public void c(int i2) {
        if (getChildCount() > 0) {
            this.e.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            a(true);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = new Rect();
        this.i = true;
        this.j = false;
        this.k = null;
        this.l = false;
        this.o = true;
        this.s = -1;
        this.t = new int[2];
        this.u = new int[2];
        f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.y = new C1475lc(this);
        this.z = new C1352hc(this);
        setNestedScrollingEnabled(true);
        C1778vc.a((View) this, (C0273Wb) a);
    }

    private void g(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.o) {
            a(0, i2);
        } else {
            scrollBy(0, i2);
        }
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.z.a(i2, i3, iArr, iArr2, i4);
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(i5, i6, iArr);
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    private void a(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.a(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private void c() {
        this.l = false;
        h();
        a(0);
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.g.onRelease();
        }
    }

    private boolean b(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View a2 = a(z3, i3, i4);
        if (a2 == null) {
            a2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            g(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        }
        if (a2 != findFocus()) {
            a2.requestFocus(i2);
        }
        return z2;
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean d(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.d;
        rect.top = 0;
        rect.bottom = height;
        if (z2) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.d.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.d;
                rect2.top = rect2.bottom - height;
            }
        }
        Rect rect3 = this.d;
        return b(i2, rect3.top, rect3.bottom);
    }

    public boolean f(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.d.top = getScrollY() - height;
            Rect rect2 = this.d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.d;
        int i3 = rect3.top;
        rect3.bottom = height + i3;
        return b(i2, i3, rect3.bottom);
    }

    public void a(View view, View view2, int i2, int i3) {
        this.y.a(view, view2, i2, i3);
        c(2, i3);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.d);
            offsetDescendantRectToMyCoords(findNextFocus, this.d);
            g(a(this.d));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public void a(View view, int i2) {
        this.y.a(view, i2);
        a(i2);
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(i5, i6, (int[]) null);
    }

    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        a(i2, i3, iArr, (int[]) null, i4);
    }

    public boolean a(KeyEvent keyEvent) {
        this.d.setEmpty();
        boolean z2 = false;
        int i2 = 130;
        if (!b()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130))) {
                    z2 = true;
                }
            }
            return z2;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z2 = !keyEvent.isAltPressed() ? b(33) : d(33);
            } else if (keyCode == 20) {
                z2 = !keyEvent.isAltPressed() ? b(130) : d(130);
            } else if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i2 = 33;
                }
                f(i2);
            }
        }
        return z2;
    }

    private void d() {
        if (getOverScrollMode() == 2) {
            this.f = null;
            this.g = null;
        } else if (this.f == null) {
            Context context = getContext();
            this.f = new EdgeEffect(context);
            this.g = new EdgeEffect(context);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.s) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.h = (int) motionEvent.getY(i2);
            this.s = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void b(int i2, int i3) {
        a(i2 - getScrollX(), i3 - getScrollY());
    }

    private void b(View view) {
        view.getDrawingRect(this.d);
        offsetDescendantRectToMyCoords(view, this.d);
        int a2 = a(this.d);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[ADDED_TO_REGION] */
    public boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        boolean z3;
        boolean z4;
        int overScrollMode = getOverScrollMode();
        boolean z5 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z6 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        int i10 = i4 + i2;
        int i11 = !z7 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z8 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i14 = i15;
        } else if (i10 >= i14) {
            i14 = i10;
            z3 = false;
            if (i12 <= i17) {
                i12 = i17;
            } else if (i12 < i16) {
                i12 = i16;
            } else {
                z4 = false;
                if (z4 && !e(1)) {
                    this.e.springBack(i14, i12, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i14, i12, z3, z4);
                if (!z3 || z4) {
                    return true;
                }
                return false;
            }
            z4 = true;
            this.e.springBack(i14, i12, 0, 0, 0, getScrollRange());
            onOverScrolled(i14, i12, z3, z4);
            if (!z3) {
            }
            return true;
        }
        z3 = true;
        if (i12 <= i17) {
        }
        z4 = true;
        this.e.springBack(i14, i12, 0, 0, 0, getScrollRange());
        onOverScrolled(i14, i12, z3, z4);
        if (!z3) {
        }
        return true;
    }

    private View a(boolean z2, int i2, int i3) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private boolean a(View view, int i2, int i3) {
        view.getDrawingRect(this.d);
        offsetDescendantRectToMyCoords(view, this.d);
        return this.d.bottom + i2 >= getScrollY() && this.d.top - i2 <= getScrollY() + i3;
    }

    public final void a(int i2, int i3) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.c > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY);
                a(false);
            } else {
                if (!this.e.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void a(boolean z2) {
        if (z2) {
            c(2, 1);
        } else {
            a(1);
        }
        this.w = getScrollY();
        C1778vc.F(this);
    }

    private void a() {
        this.e.abortAnimation();
        a(1);
    }

    private boolean a(Rect rect, boolean z2) {
        int a2 = a(rect);
        boolean z3 = a2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, a2);
            } else {
                a(0, a2);
            }
        }
        return z3;
    }

    /* access modifiers changed from: protected */
    public int a(Rect rect) {
        int i2;
        int i3;
        int i4 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i6 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i5 - verticalFadingEdgeLength : i5;
        if (rect.bottom > i6 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i6;
            }
            i4 = Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        } else if (rect.top < scrollY && rect.bottom < i6) {
            if (rect.height() > height) {
                i2 = 0 - (i6 - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            i4 = Math.max(i2, -getScrollY());
        }
        return i4;
    }

    private static boolean a(View view, View view2) {
        boolean z2 = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !a((View) parent, view2)) {
            z2 = false;
        }
        return z2;
    }
}
