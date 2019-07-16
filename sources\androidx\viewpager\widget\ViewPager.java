package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] a = {16842931};
    private static final Comparator<b> b = new d();
    private static final Interpolator c = new e();
    private static final i d = new i();
    private boolean A;
    private int B = 1;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L = -1;
    private VelocityTracker M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private boolean R;
    private long S;
    private EdgeEffect T;
    private EdgeEffect U;
    private boolean V = true;
    private boolean W = false;
    private boolean aa;
    private int ba;
    private List<e> ca;
    private e da;
    private int e;
    private e ea;
    private final ArrayList<b> f = new ArrayList<>();
    private List<d> fa;
    private final b g = new b();
    private f ga;
    private final Rect h = new Rect();
    private int ha;
    a i;
    private int ia;
    int j;
    private ArrayList<View> ja;
    private int k = -1;
    private final Runnable ka = new f(this);
    private Parcelable l = null;
    private int la = 0;
    private ClassLoader m = null;
    private Scroller n;
    private boolean o;
    private g p;
    private int q;
    private Drawable r;
    private int s;
    private int t;
    private float u = -3.4028235E38f;
    private float v = Float.MAX_VALUE;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new h();
        int c;
        Parcelable d;
        ClassLoader e;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.c);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = SavedState.class.getClassLoader();
            }
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
    }

    static class b {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b() {
        }
    }

    class c extends C0273Wb {
        c() {
        }

        public void a(View view, Mc mc) {
            super.a(view, mc);
            mc.b((CharSequence) ViewPager.class.getName());
            mc.n(b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                mc.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                mc.a(8192);
            }
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(b());
            if (accessibilityEvent.getEventType() == 4096) {
                a aVar = ViewPager.this.i;
                if (aVar != null) {
                    accessibilityEvent.setItemCount(aVar.a());
                    accessibilityEvent.setFromIndex(ViewPager.this.j);
                    accessibilityEvent.setToIndex(ViewPager.this.j);
                }
            }
        }

        private boolean b() {
            a aVar = ViewPager.this.i;
            return aVar != null && aVar.a() > 1;
        }

        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.j - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.j + 1);
                return true;
            }
        }
    }

    public interface d {
        void a(ViewPager viewPager, a aVar, a aVar2);
    }

    public interface e {
        void a(int i);

        void a(int i, float f, int i2);

        void b(int i);
    }

    public interface f {
        void a(View view, float f);
    }

    private class g extends DataSetObserver {
        g() {
        }

        public void onChanged() {
            ViewPager.this.b();
        }

        public void onInvalidated() {
            ViewPager.this.b();
        }
    }

    public static class h implements e {
        public void a(int i) {
        }

        public void a(int i, float f, int i2) {
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.a;
            if (z == layoutParams2.a) {
                return layoutParams.e - layoutParams2.e;
            }
            return z ? 1 : -1;
        }
    }

    public ViewPager(Context context) {
        super(context);
        d();
    }

    private void e(int i2) {
        e eVar = this.da;
        if (eVar != null) {
            eVar.a(i2);
        }
        List<e> list = this.ca;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = (e) this.ca.get(i3);
                if (eVar2 != null) {
                    eVar2.a(i2);
                }
            }
        }
        e eVar3 = this.ea;
        if (eVar3 != null) {
            eVar3.a(i2);
        }
    }

    private boolean f(int i2) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.f.size() != 0) {
            b j2 = j();
            int clientWidth = getClientWidth();
            int i3 = this.q;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            float f3 = ((float) i3) / f2;
            int i5 = j2.b;
            float f4 = ((((float) i2) / f2) - j2.e) / (j2.d + f3);
            int i6 = (int) (((float) i4) * f4);
            this.aa = false;
            a(i5, f4, i6);
            if (this.aa) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.V) {
            return false;
        } else {
            this.aa = false;
            a(0, 0.0f, 0);
            if (this.aa) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i() {
        this.C = false;
        this.D = false;
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.M = null;
        }
    }

    private b j() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.q) / ((float) clientWidth) : 0.0f;
        b bVar = null;
        int i2 = 0;
        boolean z2 = true;
        int i3 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i2 < this.f.size()) {
            b bVar2 = (b) this.f.get(i2);
            if (!z2) {
                int i4 = i3 + 1;
                if (bVar2.b != i4) {
                    bVar2 = this.g;
                    bVar2.e = f3 + f4 + f2;
                    bVar2.b = i4;
                    bVar2.d = this.i.d(bVar2.b);
                    i2--;
                }
            }
            f3 = bVar2.e;
            float f5 = bVar2.d + f3 + f2;
            if (!z2 && scrollX < f3) {
                return bVar;
            }
            if (scrollX < f5 || i2 == this.f.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.b;
            f4 = bVar2.d;
            i2++;
            bVar = bVar2;
            z2 = false;
        }
        return bVar;
    }

    private void k() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private boolean l() {
        this.L = -1;
        i();
        this.T.onRelease();
        this.U.onRelease();
        return this.T.isFinished() || this.U.isFinished();
    }

    private void m() {
        if (this.ia != 0) {
            ArrayList<View> arrayList = this.ja;
            if (arrayList == null) {
                this.ja = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.ja.add(getChildAt(i2));
            }
            Collections.sort(this.ja, d);
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
        }
    }

    public void a(d dVar) {
        if (this.fa == null) {
            this.fa = new ArrayList();
        }
        this.fa.add(dVar);
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    b b2 = b(childAt);
                    if (b2 != null && b2.b == this.j) {
                        childAt.addFocusables(arrayList, i2, i3);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                b b2 = b(childAt);
                if (b2 != null && b2.b == this.j) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.a |= c(view);
        if (!this.y) {
            super.addView(view, i2, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.a) {
            layoutParams2.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(d dVar) {
        List<d> list = this.fa;
        if (list != null) {
            list.remove(dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public e c(e eVar) {
        e eVar2 = this.ea;
        this.ea = eVar;
        return eVar2;
    }

    public boolean canScrollHorizontally(int i2) {
        boolean z2 = false;
        if (this.i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.u))) {
                z2 = true;
            }
            return z2;
        }
        if (i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.v))) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.o = true;
        if (this.n.isFinished() || !this.n.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.n.getCurrX();
        int currY = this.n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!f(currX)) {
                this.n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C1778vc.F(this);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.n = new Scroller(context, c);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.G = viewConfiguration.getScaledPagingTouchSlop();
        this.N = (int) (400.0f * f2);
        this.O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.T = new EdgeEffect(context);
        this.U = new EdgeEffect(context);
        this.P = (int) (25.0f * f2);
        this.Q = (int) (2.0f * f2);
        this.E = (int) (f2 * 16.0f);
        C1778vc.a((View) this, (C0273Wb) new c());
        if (C1778vc.j(this) == 0) {
            C1778vc.f(this, 1);
        }
        C1778vc.a((View) this, (C1506mc) new g(this));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                b b2 = b(childAt);
                if (b2 != null && b2.b == this.j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0.a() > 1) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
                a aVar = this.i;
                if (aVar != null) {
                }
            }
            this.T.finish();
            this.U.finish();
            if (!z2) {
                C1778vc.F(this);
                return;
            }
            return;
        }
        if (!this.T.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-height) + getPaddingTop()), this.u * ((float) width));
            this.T.setSize(height, width);
            z2 = false | this.T.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (!this.U.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), (-(this.v + 1.0f)) * ((float) width2));
            this.U.setSize(height2, width2);
            z2 |= this.U.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (!z2) {
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        a aVar = this.i;
        if (aVar == null || this.j >= aVar.a() - 1) {
            return false;
        }
        a(this.j + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.ia == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) ((View) this.ja.get(i3)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.j;
    }

    public int getOffscreenPageLimit() {
        return this.B;
    }

    public int getPageMargin() {
        return this.q;
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        c(this.j);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.ka);
        Scroller scroller = this.n;
        if (scroller != null && !scroller.isFinished()) {
            this.n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.q > 0 && this.r != null && this.f.size() > 0 && this.i != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.q) / f4;
            int i2 = 0;
            b bVar = (b) this.f.get(0);
            float f6 = bVar.e;
            int size = this.f.size();
            int i3 = bVar.b;
            int i4 = ((b) this.f.get(size - 1)).b;
            while (i3 < i4) {
                while (i3 > bVar.b && i2 < size) {
                    i2++;
                    bVar = (b) this.f.get(i2);
                }
                if (i3 == bVar.b) {
                    float f7 = bVar.e;
                    float f8 = bVar.d;
                    f2 = (f7 + f8) * f4;
                    f6 = f7 + f8 + f5;
                } else {
                    float d2 = this.i.d(i3);
                    f2 = (f6 + d2) * f4;
                    f6 += d2 + f5;
                }
                if (((float) this.q) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.r.setBounds(Math.round(f2), this.s, Math.round(((float) this.q) + f2), this.t);
                    this.r.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i3++;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            l();
            return false;
        }
        if (action != 0) {
            if (this.C) {
                return true;
            }
            if (this.D) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.J = x2;
            this.H = x2;
            float y2 = motionEvent.getY();
            this.K = y2;
            this.I = y2;
            this.L = motionEvent2.getPointerId(0);
            this.D = false;
            this.o = true;
            this.n.computeScrollOffset();
            if (this.la != 2 || Math.abs(this.n.getFinalX() - this.n.getCurrX()) <= this.Q) {
                a(false);
                this.C = false;
            } else {
                this.n.abortAnimation();
                this.A = false;
                h();
                this.C = true;
                c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.L;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.H;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.K);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 != 0 && !a(this.H, f2)) {
                    if (a(this, false, (int) f2, (int) x3, (int) y3)) {
                        this.H = x3;
                        this.I = y3;
                        this.D = true;
                        return false;
                    }
                }
                if (abs > ((float) this.G) && abs * 0.5f > abs2) {
                    this.C = true;
                    c(true);
                    setScrollState(1);
                    this.H = i3 > 0 ? this.J + ((float) this.G) : this.J - ((float) this.G);
                    this.I = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.G)) {
                    this.D = true;
                }
                if (this.C && c(x3)) {
                    C1778vc.F(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent2);
        return this.C;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        int childCount = getChildCount();
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i10 = paddingBottom;
        int i11 = 0;
        int i12 = paddingTop;
        int i13 = paddingLeft;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    int i15 = layoutParams.b;
                    int i16 = i15 & 7;
                    int i17 = i15 & 112;
                    if (i16 == 1) {
                        i6 = Math.max((i8 - childAt.getMeasuredWidth()) / 2, i13);
                    } else if (i16 == 3) {
                        i6 = i13;
                        i13 = childAt.getMeasuredWidth() + i13;
                    } else if (i16 != 5) {
                        i6 = i13;
                    } else {
                        i6 = (i8 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i17 == 16) {
                        i7 = Math.max((i9 - childAt.getMeasuredHeight()) / 2, i12);
                    } else if (i17 == 48) {
                        i7 = i12;
                        i12 = childAt.getMeasuredHeight() + i12;
                    } else if (i17 != 80) {
                        i7 = i12;
                    } else {
                        i7 = (i9 - i10) - childAt.getMeasuredHeight();
                        i10 += childAt.getMeasuredHeight();
                    }
                    int i18 = i6 + scrollX;
                    childAt.layout(i18, i7, childAt.getMeasuredWidth() + i18, i7 + childAt.getMeasuredHeight());
                    i11++;
                }
            }
        }
        int i19 = (i8 - i13) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.a) {
                    b b2 = b(childAt2);
                    if (b2 != null) {
                        float f2 = (float) i19;
                        int i21 = ((int) (b2.e * f2)) + i13;
                        if (layoutParams2.d) {
                            layoutParams2.d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams2.c), 1073741824), MeasureSpec.makeMeasureSpec((i9 - i12) - i10, 1073741824));
                        }
                        childAt2.layout(i21, i12, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + i12);
                    }
                }
            }
        }
        this.s = i12;
        this.t = i9 - i10;
        this.ba = i11;
        if (this.V) {
            z3 = false;
            a(this.j, false, 0, false);
        } else {
            z3 = false;
        }
        this.V = z3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i2), ViewGroup.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.F = Math.min(measuredWidth / 10, this.E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = measuredHeight;
        int i8 = paddingLeft;
        int i9 = 0;
        while (true) {
            boolean z2 = true;
            int i10 = 1073741824;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.a) {
                    int i11 = layoutParams.b;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    boolean z3 = i13 == 48 || i13 == 80;
                    if (!(i12 == 3 || i12 == 5)) {
                        z2 = false;
                    }
                    int i14 = Integer.MIN_VALUE;
                    if (z3) {
                        i14 = 1073741824;
                    } else if (z2) {
                        i4 = 1073741824;
                        i5 = layoutParams.width;
                        if (i5 == -2) {
                            if (i5 == -1) {
                                i5 = i8;
                            }
                            i14 = 1073741824;
                        } else {
                            i5 = i8;
                        }
                        i6 = layoutParams.height;
                        if (i6 != -2) {
                            i6 = i7;
                            i10 = i4;
                        } else if (i6 == -1) {
                            i6 = i7;
                        }
                        childAt.measure(MeasureSpec.makeMeasureSpec(i5, i14), MeasureSpec.makeMeasureSpec(i6, i10));
                        if (!z3) {
                            i7 -= childAt.getMeasuredHeight();
                        } else if (z2) {
                            i8 -= childAt.getMeasuredWidth();
                        }
                    }
                    i4 = Integer.MIN_VALUE;
                    i5 = layoutParams.width;
                    if (i5 == -2) {
                    }
                    i6 = layoutParams.height;
                    if (i6 != -2) {
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(i5, i14), MeasureSpec.makeMeasureSpec(i6, i10));
                    if (!z3) {
                    }
                }
            }
            i9++;
        }
        this.w = MeasureSpec.makeMeasureSpec(i8, 1073741824);
        this.x = MeasureSpec.makeMeasureSpec(i7, 1073741824);
        this.y = true;
        h();
        this.y = false;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams2 == null || !layoutParams2.a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (((float) i8) * layoutParams2.c), 1073741824), this.x);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                b b2 = b(childAt);
                if (b2 != null && b2.b == this.j && childAt.requestFocus(i2, rect)) {
                    return true;
                }
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(savedState.d, savedState.e);
            a(savedState.c, false, true);
        } else {
            this.k = savedState.c;
            this.l = savedState.d;
            this.m = savedState.e;
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.j;
        a aVar = this.i;
        if (aVar != null) {
            savedState.d = aVar.c();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.q;
            a(i2, i4, i6, i6);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.R) {
            return true;
        }
        boolean z2 = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        a aVar = this.i;
        if (aVar == null || aVar.a() == 0) {
            return false;
        }
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.n.abortAnimation();
            this.A = false;
            h();
            float x2 = motionEvent.getX();
            this.J = x2;
            this.H = x2;
            float y2 = motionEvent.getY();
            this.K = y2;
            this.I = y2;
            this.L = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.C) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.L);
                    if (findPointerIndex == -1) {
                        z2 = l();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.H);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.I);
                        if (abs > ((float) this.G) && abs > abs2) {
                            this.C = true;
                            c(true);
                            float f2 = this.J;
                            this.H = x3 - f2 > 0.0f ? f2 + ((float) this.G) : f2 - ((float) this.G);
                            this.I = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.C) {
                    z2 = false | c(motionEvent.getX(motionEvent.findPointerIndex(this.L)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.H = motionEvent.getX(actionIndex);
                    this.L = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    a(motionEvent);
                    this.H = motionEvent.getX(motionEvent.findPointerIndex(this.L));
                }
            } else if (this.C) {
                a(this.j, true, 0, false);
                z2 = l();
            }
        } else if (this.C) {
            VelocityTracker velocityTracker = this.M;
            velocityTracker.computeCurrentVelocity(1000, (float) this.O);
            int xVelocity = (int) velocityTracker.getXVelocity(this.L);
            this.A = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            b j2 = j();
            float f3 = (float) clientWidth;
            a(a(j2.b, ((((float) scrollX) / f3) - j2.e) / (j2.d + (((float) this.q) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.L)) - this.J)), true, true, xVelocity);
            z2 = l();
        }
        if (z2) {
            C1778vc.F(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.i;
        if (aVar2 != null) {
            aVar2.b((DataSetObserver) null);
            this.i.b((ViewGroup) this);
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                b bVar = (b) this.f.get(i2);
                this.i.a((ViewGroup) this, bVar.b, bVar.a);
            }
            this.i.a((ViewGroup) this);
            this.f.clear();
            k();
            this.j = 0;
            scrollTo(0, 0);
        }
        a aVar3 = this.i;
        this.i = aVar;
        this.e = 0;
        if (this.i != null) {
            if (this.p == null) {
                this.p = new g();
            }
            this.i.b((DataSetObserver) this.p);
            this.A = false;
            boolean z2 = this.V;
            this.V = true;
            this.e = this.i.a();
            if (this.k >= 0) {
                this.i.a(this.l, this.m);
                a(this.k, false, true);
                this.k = -1;
                this.l = null;
                this.m = null;
            } else if (!z2) {
                h();
            } else {
                requestLayout();
            }
        }
        List<d> list = this.fa;
        if (list != null && !list.isEmpty()) {
            int size = this.fa.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((d) this.fa.get(i3)).a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.A = false;
        a(i2, !this.V, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i2);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i2 = 1;
        }
        if (i2 != this.B) {
            this.B = i2;
            h();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.da = eVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.q;
        this.q = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i2) {
        if (this.la != i2) {
            this.la = i2;
            if (this.ga != null) {
                b(i2 != 0);
            }
            e(i2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void b(e eVar) {
        List<e> list = this.ca;
        if (list != null) {
            list.remove(eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    public void c(int i2) {
        b bVar;
        String str;
        b bVar2;
        float f2;
        float f3;
        b bVar3;
        int i3 = i2;
        int i4 = this.j;
        if (i4 != i3) {
            bVar = b(i4);
            this.j = i3;
        } else {
            bVar = null;
        }
        if (this.i == null) {
            m();
        } else if (this.A) {
            m();
        } else if (getWindowToken() != null) {
            this.i.b((ViewGroup) this);
            int i5 = this.B;
            int max = Math.max(0, this.j - i5);
            int a2 = this.i.a();
            int min = Math.min(a2 - 1, this.j + i5);
            if (a2 == this.e) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.f.size()) {
                        break;
                    }
                    bVar2 = (b) this.f.get(i6);
                    int i7 = bVar2.b;
                    int i8 = this.j;
                    if (i7 < i8) {
                        i6++;
                    }
                }
                if (bVar2 == null && a2 > 0) {
                    bVar2 = a(this.j, i6);
                }
                if (bVar2 != null) {
                    int i9 = i6 - 1;
                    b bVar4 = i9 >= 0 ? (b) this.f.get(i9) : null;
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = (2.0f - bVar2.d) + (((float) getPaddingLeft()) / ((float) clientWidth));
                    }
                    int i10 = i9;
                    int i11 = i6;
                    float f4 = 0.0f;
                    for (int i12 = this.j - 1; i12 >= 0; i12--) {
                        if (f4 < f2 || i12 >= max) {
                            if (bVar4 == null || i12 != bVar4.b) {
                                f4 += a(i12, i10 + 1).d;
                                i11++;
                                if (i10 >= 0) {
                                    bVar3 = (b) this.f.get(i10);
                                    bVar4 = bVar3;
                                }
                            } else {
                                f4 += bVar4.d;
                                i10--;
                                if (i10 >= 0) {
                                    bVar3 = (b) this.f.get(i10);
                                    bVar4 = bVar3;
                                }
                            }
                        } else if (bVar4 == null) {
                            break;
                        } else {
                            if (i12 == bVar4.b && !bVar4.c) {
                                this.f.remove(i10);
                                this.i.a((ViewGroup) this, i12, bVar4.a);
                                i10--;
                                i11--;
                                if (i10 >= 0) {
                                    bVar3 = (b) this.f.get(i10);
                                    bVar4 = bVar3;
                                }
                            }
                        }
                        bVar3 = null;
                        bVar4 = bVar3;
                    }
                    float f5 = bVar2.d;
                    int i13 = i11 + 1;
                    if (f5 < 2.0f) {
                        b bVar5 = i13 < this.f.size() ? (b) this.f.get(i13) : null;
                        if (clientWidth <= 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = (((float) getPaddingRight()) / ((float) clientWidth)) + 2.0f;
                        }
                        int i14 = this.j;
                        while (true) {
                            i14++;
                            if (i14 >= a2) {
                                break;
                            }
                            if (f5 < f3 || i14 <= min) {
                                if (bVar5 == null || i14 != bVar5.b) {
                                    b a3 = a(i14, i13);
                                    i13++;
                                    f5 += a3.d;
                                    if (i13 < this.f.size()) {
                                        bVar5 = (b) this.f.get(i13);
                                    }
                                } else {
                                    f5 += bVar5.d;
                                    i13++;
                                    if (i13 < this.f.size()) {
                                        bVar5 = (b) this.f.get(i13);
                                    }
                                }
                            } else if (bVar5 == null) {
                                break;
                            } else if (i14 == bVar5.b && !bVar5.c) {
                                this.f.remove(i13);
                                this.i.a((ViewGroup) this, i14, bVar5.a);
                                if (i13 < this.f.size()) {
                                    bVar5 = (b) this.f.get(i13);
                                }
                            }
                            bVar5 = null;
                        }
                    }
                    a(bVar2, i11, bVar);
                    this.i.b((ViewGroup) this, this.j, bVar2.a);
                }
                this.i.a((ViewGroup) this);
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    layoutParams.f = i15;
                    if (!layoutParams.a && layoutParams.c == 0.0f) {
                        b b2 = b(childAt);
                        if (b2 != null) {
                            layoutParams.c = b2.d;
                            layoutParams.e = b2.b;
                        }
                    }
                }
                m();
                if (hasFocus()) {
                    View findFocus = findFocus();
                    b a4 = findFocus != null ? a(findFocus) : null;
                    if (a4 == null || a4.b != this.j) {
                        for (int i16 = 0; i16 < getChildCount(); i16++) {
                            View childAt2 = getChildAt(i16);
                            b b3 = b(childAt2);
                            if (b3 != null && b3.b == this.j && childAt2.requestFocus(2)) {
                                break;
                            }
                        }
                    }
                }
                return;
            }
            try {
                str = getResources().getResourceName(getId());
            } catch (NotFoundException unused) {
                str = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            sb.append(this.e);
            sb.append(", found: ");
            sb.append(a2);
            sb.append(" Pager id: ");
            sb.append(str);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            sb.append(this.i.getClass());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void a(int i2, boolean z2) {
        this.A = false;
        a(i2, z2, false);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        int a2 = this.i.a();
        this.e = a2;
        boolean z2 = this.f.size() < (this.B * 2) + 1 && this.f.size() < a2;
        int i2 = this.j;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f.size()) {
            b bVar = (b) this.f.get(i3);
            int a3 = this.i.a(bVar.a);
            if (a3 != -1) {
                if (a3 == -2) {
                    this.f.remove(i3);
                    i3--;
                    if (!z3) {
                        this.i.b((ViewGroup) this);
                        z3 = true;
                    }
                    this.i.a((ViewGroup) this, bVar.b, bVar.a);
                    int i4 = this.j;
                    if (i4 == bVar.b) {
                        i2 = Math.max(0, Math.min(i4, a2 - 1));
                    }
                } else {
                    int i5 = bVar.b;
                    if (i5 != a3) {
                        if (i5 == this.j) {
                            i2 = a3;
                        }
                        bVar.b = a3;
                    }
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.i.a((ViewGroup) this);
        }
        Collections.sort(this.f, b);
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(androidx.core.content.a.c(getContext(), i2));
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, boolean z2, boolean z3, int i3) {
        a aVar = this.i;
        if (aVar == null || aVar.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.j != i2 || this.f.size() == 0) {
            boolean z4 = true;
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.i.a()) {
                i2 = this.i.a() - 1;
            }
            int i4 = this.B;
            int i5 = this.j;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f.size(); i6++) {
                    ((b) this.f.get(i6)).c = true;
                }
            }
            if (this.j == i2) {
                z4 = false;
            }
            if (this.V) {
                this.j = i2;
                if (z4) {
                    d(i2);
                }
                requestLayout();
            } else {
                c(i2);
                a(i2, z2, i3, z4);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public boolean e() {
        return this.R;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        int i2 = this.j;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private void d(int i2) {
        e eVar = this.da;
        if (eVar != null) {
            eVar.b(i2);
        }
        List<e> list = this.ca;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = (e) this.ca.get(i3);
                if (eVar2 != null) {
                    eVar2.b(i2);
                }
            }
        }
        e eVar3 = this.ea;
        if (eVar3 != null) {
            eVar3.b(i2);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        b b2 = b(i2);
        int clientWidth = b2 != null ? (int) (((float) getClientWidth()) * Math.max(this.u, Math.min(b2.e, this.v))) : 0;
        if (z2) {
            a(clientWidth, 0, i3);
            if (z3) {
                d(i2);
                return;
            }
            return;
        }
        if (z3) {
            d(i2);
        }
        a(false);
        scrollTo(clientWidth, 0);
        f(clientWidth);
    }

    /* access modifiers changed from: 0000 */
    public b b(View view) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            b bVar = (b) this.f.get(i2);
            if (this.i.a(view, bVar.a)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public b b(int i2) {
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            b bVar = (b) this.f.get(i3);
            if (bVar.b == i2) {
                return bVar;
            }
        }
        return null;
    }

    public void a(e eVar) {
        if (this.ca == null) {
            this.ca = new ArrayList();
        }
        this.ca.add(eVar);
    }

    private void b(int i2, float f2, int i3) {
        e eVar = this.da;
        if (eVar != null) {
            eVar.a(i2, f2, i3);
        }
        List<e> list = this.ca;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar2 = (e) this.ca.get(i4);
                if (eVar2 != null) {
                    eVar2.a(i2, f2, i3);
                }
            }
        }
        e eVar3 = this.ea;
        if (eVar3 != null) {
            eVar3.a(i2, f2, i3);
        }
    }

    /* access modifiers changed from: 0000 */
    public float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.n;
        if (scroller != null && !scroller.isFinished()) {
            i5 = this.o ? this.n.getCurrX() : this.n.getStartX();
            this.n.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i5 = getScrollX();
        }
        int i7 = i5;
        int scrollY = getScrollY();
        int i8 = i2 - i7;
        int i9 = i3 - scrollY;
        if (i8 == 0 && i9 == 0) {
            a(false);
            h();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i10 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i10;
        float a2 = f3 + (a(Math.min(1.0f, (((float) Math.abs(i8)) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        if (abs > 0) {
            i6 = Math.round(Math.abs(a2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i6 = (int) (((((float) Math.abs(i8)) / ((f2 * this.i.d(this.j)) + ((float) this.q))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i6, 600);
        this.o = false;
        this.n.startScroll(i7, scrollY, i8, i9, min);
        C1778vc.F(this);
    }

    private void b(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.ha : 0, null);
        }
    }

    public void b(float f2) {
        if (!this.R) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.i != null) {
            this.H += f2;
            float scrollX = ((float) getScrollX()) - f2;
            float clientWidth = (float) getClientWidth();
            float f3 = this.u * clientWidth;
            float f4 = this.v * clientWidth;
            b bVar = (b) this.f.get(0);
            ArrayList<b> arrayList = this.f;
            b bVar2 = (b) arrayList.get(arrayList.size() - 1);
            if (bVar.b != 0) {
                f3 = bVar.e * clientWidth;
            }
            if (bVar2.b != this.i.a() - 1) {
                f4 = bVar2.e * clientWidth;
            }
            if (scrollX < f3) {
                scrollX = f3;
            } else if (scrollX > f4) {
                scrollX = f4;
            }
            int i2 = (int) scrollX;
            this.H += scrollX - ((float) i2);
            scrollTo(i2, getScrollY());
            f(i2);
            MotionEvent obtain = MotionEvent.obtain(this.S, SystemClock.uptimeMillis(), 2, this.H, 0.0f, 0);
            this.M.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    public b a(int i2, int i3) {
        b bVar = new b();
        bVar.b = i2;
        bVar.a = this.i.a((ViewGroup) this, i2);
        bVar.d = this.i.d(i2);
        if (i3 < 0 || i3 >= this.f.size()) {
            this.f.add(bVar);
        } else {
            this.f.add(i3, bVar);
        }
        return bVar;
    }

    private void a(b bVar, int i2, b bVar2) {
        int i3;
        int i4;
        b bVar3;
        b bVar4;
        int a2 = this.i.a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.q) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i5 = bVar2.b;
            int i6 = bVar.b;
            if (i5 < i6) {
                float f3 = bVar2.e + bVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= bVar.b && i8 < this.f.size()) {
                    Object obj = this.f.get(i8);
                    while (true) {
                        bVar4 = (b) obj;
                        if (i7 > bVar4.b && i8 < this.f.size() - 1) {
                            i8++;
                            obj = this.f.get(i8);
                        }
                    }
                    while (i7 < bVar4.b) {
                        f3 += this.i.d(i7) + f2;
                        i7++;
                    }
                    bVar4.e = f3;
                    f3 += bVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f.size() - 1;
                float f4 = bVar2.e;
                while (true) {
                    i5--;
                    if (i5 < bVar.b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f.get(size);
                    while (true) {
                        bVar3 = (b) obj2;
                        if (i5 < bVar3.b && size > 0) {
                            size--;
                            obj2 = this.f.get(size);
                        }
                    }
                    while (i5 > bVar3.b) {
                        f4 -= this.i.d(i5) + f2;
                        i5--;
                    }
                    f4 -= bVar3.d + f2;
                    bVar3.e = f4;
                }
            }
        }
        int size2 = this.f.size();
        float f5 = bVar.e;
        int i9 = bVar.b;
        int i10 = i9 - 1;
        this.u = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = a2 - 1;
        this.v = bVar.b == i11 ? (bVar.e + bVar.d) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            b bVar5 = (b) this.f.get(i12);
            while (true) {
                i4 = bVar5.b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.i.d(i10) + f2;
                i10--;
            }
            f5 -= bVar5.d + f2;
            bVar5.e = f5;
            if (i4 == 0) {
                this.u = f5;
            }
            i12--;
            i10--;
        }
        float f6 = bVar.e + bVar.d + f2;
        int i13 = bVar.b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            b bVar6 = (b) this.f.get(i14);
            while (true) {
                i3 = bVar6.b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.i.d(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.v = (bVar6.d + f6) - 1.0f;
            }
            bVar6.e = f6;
            f6 += bVar6.d + f2;
            i14++;
            i13++;
        }
        this.W = false;
    }

    private static boolean c(View view) {
        return view.getClass().getAnnotation(a.class) != null;
    }

    private void c(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean c(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.H - f2;
        this.H = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.u * clientWidth;
        float f5 = this.v * clientWidth;
        boolean z4 = false;
        b bVar = (b) this.f.get(0);
        ArrayList<b> arrayList = this.f;
        b bVar2 = (b) arrayList.get(arrayList.size() - 1);
        if (bVar.b != 0) {
            f4 = bVar.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVar2.b != this.i.a() - 1) {
            f5 = bVar2.e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.T.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.U.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.H += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        f(i2);
        return z4;
    }

    public void c() {
        if (this.R) {
            if (this.i != null) {
                VelocityTracker velocityTracker = this.M;
                velocityTracker.computeCurrentVelocity(1000, (float) this.O);
                int xVelocity = (int) velocityTracker.getXVelocity(this.L);
                this.A = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                b j2 = j();
                a(a(j2.b, ((((float) scrollX) / ((float) clientWidth)) - j2.e) / j2.d, xVelocity, (int) (this.H - this.J)), true, true, xVelocity);
            }
            i();
            this.R = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: 0000 */
    public b a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return b(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.f.isEmpty()) {
            b b2 = b(this.j);
            int min = (int) ((b2 != null ? Math.min(b2.e, this.v) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.n.isFinished()) {
            this.n.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    public void a(int i2, float f2, int i3) {
        int i4;
        int left;
        int i5;
        if (this.ba > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i6 = paddingRight;
            int i7 = paddingLeft;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    int i9 = layoutParams.b & 7;
                    if (i9 != 1) {
                        if (i9 == 3) {
                            i4 = childAt.getWidth() + i7;
                        } else if (i9 != 5) {
                            i4 = i7;
                        } else {
                            i5 = (width - i6) - childAt.getMeasuredWidth();
                            i6 += childAt.getMeasuredWidth();
                        }
                        left = (i7 + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        i7 = i4;
                    } else {
                        i5 = Math.max((width - childAt.getMeasuredWidth()) / 2, i7);
                    }
                    int i10 = i5;
                    i4 = i7;
                    i7 = i10;
                    left = (i7 + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    i7 = i4;
                }
            }
        }
        b(i2, f2, i3);
        if (this.ga != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).a) {
                    this.ga.a(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.aa = true;
    }

    private void a(boolean z2) {
        boolean z3 = this.la == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.n.isFinished()) {
                this.n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.n.getCurrX();
                int currY = this.n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        f(currX);
                    }
                }
            }
        }
        this.A = false;
        boolean z4 = z3;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            b bVar = (b) this.f.get(i2);
            if (bVar.c) {
                bVar.c = false;
                z4 = true;
            }
        }
        if (!z4) {
            return;
        }
        if (z2) {
            C1778vc.a((View) this, this.ka);
        } else {
            this.ka.run();
        }
    }

    private boolean a(float f2, float f3) {
        return (f2 < ((float) this.F) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.F)) && f3 < 0.0f);
    }

    private int a(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.P || Math.abs(i3) <= this.N) {
            i2 += (int) (f2 + (i2 >= this.j ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f.size() <= 0) {
            return i2;
        }
        b bVar = (b) this.f.get(0);
        ArrayList<b> arrayList = this.f;
        return Math.max(bVar.b, Math.min(i2, ((b) arrayList.get(arrayList.size() - 1)).b));
    }

    public boolean a() {
        if (this.C) {
            return false;
        }
        this.R = true;
        setScrollState(1);
        this.H = 0.0f;
        this.J = 0.0f;
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker == null) {
            this.M = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.M.addMovement(obtain);
        obtain.recycle();
        this.S = uptimeMillis;
        return true;
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.L) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.H = motionEvent.getX(i2);
            this.L = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, boolean z2, int i2, int i3, int i4) {
        View view2 = view;
        boolean z3 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                    int i6 = i4 + scrollY;
                    if (i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                        if (a(childAt, true, i2, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            z3 = false;
        }
        return z3;
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return g();
                } else {
                    return a(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return f();
            } else {
                return a(17);
            }
        }
        return false;
    }

    public boolean a(int i2) {
        boolean requestFocus;
        boolean z2;
        View findFocus = findFocus();
        boolean z3 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z2 = false;
                        break;
                    } else if (parent == this) {
                        z2 = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                    Log.e("ViewPager", sb2.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus != null && findNextFocus != view) {
            if (i2 == 17) {
                int i3 = a(this.h, findNextFocus).left;
                int i4 = a(this.h, view).left;
                if (view == null || i3 < i4) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = f();
                }
            } else if (i2 == 66) {
                int i5 = a(this.h, findNextFocus).left;
                int i6 = a(this.h, view).left;
                if (view == null || i5 > i6) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = g();
                }
            }
            z3 = requestFocus;
        } else if (i2 == 17 || i2 == 1) {
            z3 = f();
        } else if (i2 == 66 || i2 == 2) {
            z3 = g();
        }
        if (z3) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z3;
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
