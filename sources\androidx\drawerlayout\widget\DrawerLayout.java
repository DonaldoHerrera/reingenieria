package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    private static final int[] a = {16843828};
    static final int[] b = {16842931};
    static final boolean c = (VERSION.SDK_INT >= 19);
    private static final boolean d;
    private float A;
    private Drawable B;
    private Drawable C;
    private Drawable D;
    private CharSequence E;
    private CharSequence F;
    private Object G;
    private boolean H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private Drawable L;
    private final ArrayList<View> M;
    private Rect N;
    private Matrix O;
    private final b e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final Zc k;
    private final Zc l;
    private final d m;
    private final d n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private c x;
    private List<c> y;
    private float z;

    public static class LayoutParams extends MarginLayoutParams {
        public int a = 0;
        float b;
        boolean c;
        int d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = layoutParams.a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new b();
        int c = 0;
        int d;
        int e;
        int f;
        int g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class a extends C0273Wb {
        private final Rect d = new Rect();

        a() {
        }

        public void a(View view, Mc mc) {
            if (DrawerLayout.c) {
                super.a(view, mc);
            } else {
                Mc a = Mc.a(mc);
                super.a(view, a);
                mc.d(view);
                ViewParent q = C1778vc.q(view);
                if (q instanceof View) {
                    mc.c((View) q);
                }
                a(mc, a);
                a.y();
                a(mc, (ViewGroup) view);
            }
            mc.b((CharSequence) DrawerLayout.class.getName());
            mc.i(false);
            mc.j(false);
            mc.b(defpackage.Mc.a.a);
            mc.b(defpackage.Mc.a.b);
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View d2 = DrawerLayout.this.d();
            if (d2 != null) {
                CharSequence c = DrawerLayout.this.c(DrawerLayout.this.e(d2));
                if (c != null) {
                    text.add(c);
                }
            }
            return true;
        }

        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.c || DrawerLayout.g(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void a(Mc mc, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.g(childAt)) {
                    mc.a(childAt);
                }
            }
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
        }
    }

    static final class b extends C0273Wb {
        b() {
        }

        public void a(View view, Mc mc) {
            super.a(view, mc);
            if (!DrawerLayout.g(view)) {
                mc.c((View) null);
            }
        }
    }

    public interface c {
        void a(int i);

        void a(View view);

        void a(View view, float f);

        void b(View view);
    }

    private class d extends defpackage.Zc.a {
        private final int a;
        private Zc b;
        private final Runnable c = new c(this);

        d(int i) {
            this.a = i;
        }

        public void a(Zc zc) {
            this.b = zc;
        }

        public void b() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public boolean b(int i) {
            return false;
        }

        public void c(int i) {
            DrawerLayout.this.a(this.a, i, this.b.c());
        }

        private void c() {
            int i = 3;
            if (this.a == 3) {
                i = 5;
            }
            View a2 = DrawerLayout.this.a(i);
            if (a2 != null) {
                DrawerLayout.this.a(a2);
            }
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.c(view, f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public boolean b(View view, int i) {
            return DrawerLayout.this.j(view) && DrawerLayout.this.a(view, this.a) && DrawerLayout.this.d(view) == 0;
        }

        public void b(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160);
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public void a(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).c = false;
            c();
        }

        public void a(View view, float f, float f2) {
            int i;
            float f3 = DrawerLayout.this.f(view);
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.d(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            View view;
            int i;
            int d2 = this.b.d();
            int i2 = 0;
            boolean z = this.a == 3;
            if (z) {
                view = DrawerLayout.this.a(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + d2;
            } else {
                view = DrawerLayout.this.a(5);
                i = DrawerLayout.this.getWidth() - d2;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.d(view) == 0) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                this.b.b(view, i, view.getTop());
                layoutParams.c = true;
                DrawerLayout.this.invalidate();
                c();
                DrawerLayout.this.a();
            }
        }

        public void a(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.a(3);
            } else {
                view = DrawerLayout.this.a(5);
            }
            if (view != null && DrawerLayout.this.d(view) == 0) {
                this.b.a(view, i2);
            }
        }

        public int a(View view) {
            if (DrawerLayout.this.j(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public int a(View view, int i, int i2) {
            if (DrawerLayout.this.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }
    }

    static {
        boolean z2 = true;
        if (VERSION.SDK_INT < 21) {
            z2 = false;
        }
        d = z2;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    private Drawable g() {
        int l2 = C1778vc.l(this);
        if (l2 == 0) {
            Drawable drawable = this.I;
            if (drawable != null) {
                a(drawable, l2);
                return this.I;
            }
        } else {
            Drawable drawable2 = this.J;
            if (drawable2 != null) {
                a(drawable2, l2);
                return this.J;
            }
        }
        return this.K;
    }

    private Drawable h() {
        int l2 = C1778vc.l(this);
        if (l2 == 0) {
            Drawable drawable = this.J;
            if (drawable != null) {
                a(drawable, l2);
                return this.J;
            }
        } else {
            Drawable drawable2 = this.I;
            if (drawable2 != null) {
                a(drawable2, l2);
                return this.I;
            }
        }
        return this.L;
    }

    private void i() {
        if (!d) {
            this.C = g();
            this.D = h();
        }
    }

    private static boolean m(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    public void a(Object obj, boolean z2) {
        this.G = obj;
        this.H = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!j(childAt)) {
                    this.M.add(childAt);
                } else if (i(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.M.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = (View) this.M.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.M.clear();
        }
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (c() != null || j(view)) {
            C1778vc.f(view, 4);
        } else {
            C1778vc.f(view, 1);
        }
        if (!c) {
            C1778vc.a(view, (C0273Wb) this.e);
        }
    }

    public void b(c cVar) {
        if (cVar != null) {
            List<c> list = this.y;
            if (list != null) {
                list.remove(cVar);
            }
        }
    }

    public CharSequence c(int i2) {
        int a2 = C0287Zb.a(i2, C1778vc.l(this));
        if (a2 == 3) {
            return this.E;
        }
        if (a2 == 5) {
            return this.F;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i2).getLayoutParams()).b);
        }
        this.i = f2;
        boolean a2 = this.k.a(true);
        boolean a3 = this.l.a(true);
        if (a2 || a3) {
            C1778vc.F(this);
        }
    }

    public int d(View view) {
        if (j(view)) {
            return b(((LayoutParams) view.getLayoutParams()).a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                if (a(x2, y2, childAt) && !h(childAt) && a(motionEvent, childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int i2;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean h2 = h(view2);
        int width = getWidth();
        int save = canvas.save();
        int i3 = 0;
        if (h2) {
            int childCount = getChildCount();
            i2 = width;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != view2 && childAt.getVisibility() == 0 && m(childAt) && j(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i4) {
                            i4 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i2) {
                            i2 = left;
                        }
                    }
                }
            }
            canvas.clipRect(i4, 0, i2, getHeight());
            i3 = i4;
        } else {
            i2 = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.i;
        if (f2 > 0.0f && h2) {
            int i6 = this.h;
            this.j.setColor((i6 & 16777215) | (((int) (((float) ((-16777216 & i6) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i3, 0.0f, (float) i2, (float) getHeight(), this.j);
        } else if (this.C != null && a(view2, 3)) {
            int intrinsicWidth = this.C.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.k.d()), 1.0f));
            this.C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.C.setAlpha((int) (max * 255.0f));
            this.C.draw(canvas);
        } else if (this.D != null && a(view2, 5)) {
            int intrinsicWidth2 = this.D.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.l.d()), 1.0f));
            this.D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.D.setAlpha((int) (max2 * 255.0f));
            this.D.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: 0000 */
    public int e(View view) {
        return C0287Zb.a(((LayoutParams) view.getLayoutParams()).a, C1778vc.l(this));
    }

    /* access modifiers changed from: 0000 */
    public float f(View view) {
        return ((LayoutParams) view.getLayoutParams()).b;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (d) {
            return this.f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.B;
    }

    /* access modifiers changed from: 0000 */
    public boolean j(View view) {
        int a2 = C0287Zb.a(((LayoutParams) view.getLayoutParams()).a, C1778vc.l(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    public boolean k(View view) {
        if (j(view)) {
            return ((LayoutParams) view.getLayoutParams()).b > 0.0f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public void l(View view) {
        b(view, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.H && this.B != null) {
            if (VERSION.SDK_INT >= 21) {
                Object obj = this.G;
                if (obj != null) {
                    i2 = ((WindowInsets) obj).getSystemWindowInsetTop();
                    if (i2 <= 0) {
                        this.B.setBounds(0, 0, getWidth(), i2);
                        this.B.draw(canvas);
                        return;
                    }
                    return;
                }
            }
            i2 = 0;
            if (i2 <= 0) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean b2 = this.k.b(motionEvent) | this.l.b(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.k.a(3)) {
                        this.m.b();
                        this.n.b();
                    }
                }
                z2 = false;
            }
            a(true);
            this.v = false;
            this.w = false;
            z2 = false;
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.z = x2;
            this.A = y2;
            if (this.i > 0.0f) {
                View b3 = this.k.b((int) x2, (int) y2);
                if (b3 != null && h(b3)) {
                    z2 = true;
                    this.v = false;
                    this.w = false;
                }
            }
            z2 = false;
            this.v = false;
            this.w = false;
        }
        if (b2 || z2 || e() || this.w) {
            return true;
        }
        return false;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !f()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View d2 = d();
        if (d2 != null && d(d2) == 0) {
            b();
        }
        return d2 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        this.p = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (h(childAt)) {
                    int i9 = layoutParams.leftMargin;
                    childAt.layout(i9, layoutParams.topMargin, childAt.getMeasuredWidth() + i9, layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (layoutParams.b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i10 = i7 - ((int) (layoutParams.b * f4));
                        f2 = ((float) (i7 - i10)) / f4;
                        i6 = i10;
                    }
                    boolean z3 = f2 != layoutParams.b;
                    int i11 = layoutParams.a & 112;
                    if (i11 == 16) {
                        int i12 = i5 - i3;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = layoutParams.topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = layoutParams.bottomMargin;
                            if (i15 > i12 - i16) {
                                i13 = (i12 - i16) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i13, measuredWidth + i6, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = layoutParams.topMargin;
                        childAt.layout(i6, i17, measuredWidth + i6, measuredHeight + i17);
                    } else {
                        int i18 = i5 - i3;
                        childAt.layout(i6, (i18 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i18 - layoutParams.bottomMargin);
                    }
                    if (z3) {
                        c(childAt, f2);
                    }
                    int i19 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.p = false;
        this.q = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.G != null && C1778vc.i(this);
        int l2 = C1778vc.l(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int a2 = C0287Zb.a(layoutParams.a, l2);
                    if (C1778vc.i(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.G;
                            if (a2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.G;
                        if (a2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (h(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (j(childAt)) {
                    if (d) {
                        float h2 = C1778vc.h(childAt);
                        float f2 = this.f;
                        if (h2 != f2) {
                            C1778vc.a(childAt, f2);
                        }
                    }
                    int e2 = e(childAt) & 7;
                    boolean z5 = e2 == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.g + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(i3, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i5++;
                        i4 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Child drawer has absolute gravity ");
                        sb.append(d(e2));
                        sb.append(" but this ");
                        sb.append("DrawerLayout");
                        sb.append(" already has a ");
                        sb.append("drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i5);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    sb2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i6 = i2;
            int i7 = i3;
            i5++;
            i4 = 0;
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
        int i2 = savedState.c;
        if (i2 != 0) {
            View a2 = a(i2);
            if (a2 != null) {
                l(a2);
            }
        }
        int i3 = savedState.d;
        if (i3 != 3) {
            a(i3, 3);
        }
        int i4 = savedState.e;
        if (i4 != 3) {
            a(i4, 5);
        }
        int i5 = savedState.f;
        if (i5 != 3) {
            a(i5, 8388611);
        }
        int i6 = savedState.g;
        if (i6 != 3) {
            a(i6, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        i();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            boolean z2 = true;
            boolean z3 = layoutParams.d == 1;
            if (layoutParams.d != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                savedState.c = layoutParams.a;
            } else {
                i2++;
            }
        }
        savedState.d = this.r;
        savedState.e = this.s;
        savedState.f = this.t;
        savedState.g = this.u;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        this.k.a(motionEvent);
        this.l.a(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.z = x2;
            this.A = y2;
            this.v = false;
            this.w = false;
        } else if (action == 1) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            View b2 = this.k.b((int) x3, (int) y3);
            if (b2 != null && h(b2)) {
                float f2 = x3 - this.z;
                float f3 = y3 - this.A;
                int e2 = this.k.e();
                if ((f2 * f2) + (f3 * f3) < ((float) (e2 * e2))) {
                    View c2 = c();
                    if (!(c2 == null || d(c2) == 2)) {
                        z2 = false;
                        a(z2);
                        this.v = false;
                    }
                }
            }
            z2 = true;
            a(z2);
            this.v = false;
        } else if (action == 3) {
            a(true);
            this.v = false;
            this.w = false;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        this.v = z2;
        if (z2) {
            a(true);
        }
    }

    public void requestLayout() {
        if (!this.p) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f2) {
        this.f = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (j(childAt)) {
                C1778vc.a(childAt, this.f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        c cVar2 = this.x;
        if (cVar2 != null) {
            b(cVar2);
        }
        if (cVar != null) {
            a(cVar);
        }
        this.x = cVar;
    }

    public void setDrawerLockMode(int i2) {
        a(i2, 3);
        a(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.h = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.B = new ColorDrawable(i2);
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean f() {
        return d() != null;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = new b();
        this.h = -1728053248;
        this.j = new Paint();
        this.q = true;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.g = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.m = new d(3);
        this.n = new d(5);
        this.k = Zc.a((ViewGroup) this, 1.0f, (defpackage.Zc.a) this.m);
        this.k.d(1);
        this.k.a(f3);
        this.m.a(this.k);
        this.l = Zc.a((ViewGroup) this, 1.0f, (defpackage.Zc.a) this.n);
        this.l.d(2);
        this.l.a(f3);
        this.n.a(this.l);
        setFocusableInTouchMode(true);
        C1778vc.f(this, 1);
        C1778vc.a((View) this, (C0273Wb) new a());
        setMotionEventSplittingEnabled(false);
        if (C1778vc.i(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
                try {
                    this.B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.B = null;
            }
        }
        this.f = f2 * 10.0f;
        this.M = new ArrayList<>();
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((LayoutParams) getChildAt(i2).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    public int b(int i2) {
        int l2 = C1778vc.l(this);
        if (i2 == 3) {
            int i3 = this.r;
            if (i3 != 3) {
                return i3;
            }
            int i4 = l2 == 0 ? this.t : this.u;
            if (i4 != 3) {
                return i4;
            }
        } else if (i2 == 5) {
            int i5 = this.s;
            if (i5 != 3) {
                return i5;
            }
            int i6 = l2 == 0 ? this.u : this.t;
            if (i6 != 3) {
                return i6;
            }
        } else if (i2 == 8388611) {
            int i7 = this.t;
            if (i7 != 3) {
                return i7;
            }
            int i8 = l2 == 0 ? this.r : this.s;
            if (i8 != 3) {
                return i8;
            }
        } else if (i2 == 8388613) {
            int i9 = this.u;
            if (i9 != 3) {
                return i9;
            }
            int i10 = l2 == 0 ? this.s : this.r;
            if (i10 != 3) {
                return i10;
            }
        }
        return 0;
    }

    public void setStatusBarBackground(int i2) {
        this.B = i2 != 0 ? androidx.core.content.a.c(getContext(), i2) : null;
        invalidate();
    }

    public boolean i(View view) {
        if (j(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    static String d(int i2) {
        if ((i2 & 3) == 3) {
            return "LEFT";
        }
        return (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    public void a(c cVar) {
        if (cVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.d & 1) == 0) {
            layoutParams.d = 1;
            List<c> list = this.y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((c) this.y.get(size)).a(view);
                }
            }
            c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public View d() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (j(childAt) && k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public void a(int i2, int i3) {
        int a2 = C0287Zb.a(i3, C1778vc.l(this));
        if (i3 == 3) {
            this.r = i2;
        } else if (i3 == 5) {
            this.s = i2;
        } else if (i3 == 8388611) {
            this.t = i2;
        } else if (i3 == 8388613) {
            this.u = i2;
        }
        if (i2 != 0) {
            (a2 == 3 ? this.k : this.l).b();
        }
        if (i2 == 1) {
            View a3 = a(a2);
            if (a3 != null) {
                a(a3);
            }
        } else if (i2 == 2) {
            View a4 = a(a2);
            if (a4 != null) {
                l(a4);
            }
        }
    }

    static boolean g(View view) {
        return (C1778vc.j(view) == 4 || C1778vc.j(view) == 2) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public boolean h(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    private MotionEvent b(MotionEvent motionEvent, View view) {
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.O == null) {
                this.O = new Matrix();
            }
            matrix.invert(this.O);
            obtain.transform(this.O);
        }
        return obtain;
    }

    private void c(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z2 || j(childAt)) && (!z2 || childAt != view)) {
                C1778vc.f(childAt, 4);
            } else {
                C1778vc.f(childAt, 1);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 != layoutParams.b) {
            layoutParams.b = f2;
            a(view, f2);
        }
    }

    private boolean a(float f2, float f3, View view) {
        if (this.N == null) {
            this.N = new Rect();
        }
        view.getHitRect(this.N);
        return this.N.contains((int) f2, (int) f3);
    }

    /* access modifiers changed from: 0000 */
    public void b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.d & 1) == 1) {
            layoutParams.d = 0;
            List<c> list = this.y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((c) this.y.get(size)).b(view);
                }
            }
            c(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public View c() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    private boolean a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b2 = b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b2);
            b2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* access modifiers changed from: 0000 */
    public void b(View view, float f2) {
        float width = (float) view.getWidth();
        int i2 = (int) (width * f2);
        int f3 = i2 - ((int) (f(view) * width));
        if (!a(view, 3)) {
            f3 = -f3;
        }
        view.offsetLeftAndRight(f3);
        c(view, f2);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, View view) {
        int f2 = this.k.f();
        int f3 = this.l.f();
        int i4 = 2;
        if (f2 == 1 || f3 == 1) {
            i4 = 1;
        } else if (!(f2 == 2 || f3 == 2)) {
            i4 = 0;
        }
        if (view != null && i3 == 0) {
            float f4 = ((LayoutParams) view.getLayoutParams()).b;
            if (f4 == 0.0f) {
                b(view);
            } else if (f4 == 1.0f) {
                c(view);
            }
        }
        if (i4 != this.o) {
            this.o = i4;
            List<c> list = this.y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((c) this.y.get(size)).a(i4);
                }
            }
        }
    }

    public void b() {
        a(false);
    }

    public void b(View view, boolean z2) {
        if (j(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.q) {
                layoutParams.b = 1.0f;
                layoutParams.d = 1;
                c(view, true);
            } else if (z2) {
                layoutParams.d |= 2;
                if (a(view, 3)) {
                    this.k.b(view, 0, view.getTop());
                } else {
                    this.l.b(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                b(view, 1.0f);
                a(layoutParams.a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, float f2) {
        List<c> list = this.y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((c) this.y.get(size)).a(view, f2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(View view, int i2) {
        return (e(view) & i2) == i2;
    }

    /* access modifiers changed from: 0000 */
    public View a(int i2) {
        int a2 = C0287Zb.a(i2, C1778vc.l(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((e(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    private boolean a(Drawable drawable, int i2) {
        if (drawable == null || !androidx.core.graphics.drawable.a.f(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.a(drawable, i2);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2) {
        boolean z3;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (j(childAt) && (!z2 || layoutParams.c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    z3 = this.k.b(childAt, -width, childAt.getTop());
                } else {
                    z3 = this.l.b(childAt, getWidth(), childAt.getTop());
                }
                z4 |= z3;
                layoutParams.c = false;
            }
        }
        this.m.b();
        this.n.b();
        if (z4) {
            invalidate();
        }
    }

    public void a(View view) {
        a(view, true);
    }

    public void a(View view, boolean z2) {
        if (j(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.q) {
                layoutParams.b = 0.0f;
                layoutParams.d = 0;
            } else if (z2) {
                layoutParams.d |= 4;
                if (a(view, 3)) {
                    this.k.b(view, -view.getWidth(), view.getTop());
                } else {
                    this.l.b(view, getWidth(), view.getTop());
                }
            } else {
                b(view, 0.0f);
                a(layoutParams.a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (!this.w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.w = true;
        }
    }
}
