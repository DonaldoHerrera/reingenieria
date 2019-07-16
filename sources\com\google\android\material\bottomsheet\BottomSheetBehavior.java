package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {
    /* access modifiers changed from: private */
    public boolean a = true;
    private float b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    int g;
    int h;
    int i;
    boolean j;
    private boolean k;
    int l = 4;
    Zc m;
    private boolean n;
    private int o;
    private boolean p;
    int q;
    WeakReference<V> r;
    WeakReference<View> s;
    private a t;
    private VelocityTracker u;
    int v;
    private int w;
    boolean x;
    private Map<View, Integer> y;
    private final defpackage.Zc.a z = new b(this);

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new c();
        final int c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.c = i;
        }
    }

    public static abstract class a {
        public abstract void a(View view, float f);

        public abstract void a(View view, int i);
    }

    private class b implements Runnable {
        private final View a;
        private final int b;

        b(View view, int i) {
            this.a = view;
            this.b = i;
        }

        public void run() {
            Zc zc = BottomSheetBehavior.this.m;
            if (zc == null || !zc.a(true)) {
                BottomSheetBehavior.this.d(this.b);
            } else {
                C1778vc.a(this.a, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    /* access modifiers changed from: private */
    public int e() {
        if (this.a) {
            return this.g;
        }
        return 0;
    }

    private float f() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.b);
        return this.u.getYVelocity(this.v);
    }

    private void g() {
        this.v = -1;
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    public void c(boolean z2) {
        this.k = z2;
    }

    public Parcelable d(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.d(coordinatorLayout, v2), this.l);
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.a());
        int i2 = savedState.c;
        if (i2 == 1 || i2 == 2) {
            this.l = 4;
        } else {
            this.l = i2;
        }
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.l == 1 && actionMasked == 0) {
            return true;
        }
        Zc zc = this.m;
        if (zc != null) {
            zc.a(motionEvent);
        }
        if (actionMasked == 0) {
            g();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.n && Math.abs(((float) this.w) - motionEvent.getY()) > ((float) this.m.e())) {
            this.m.a((View) v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.n;
    }

    public final void c(int i2) {
        if (i2 != this.l) {
            WeakReference<V> weakReference = this.r;
            if (weakReference == null) {
                if (i2 == 4 || i2 == 3 || i2 == 6 || (this.j && i2 == 5)) {
                    this.l = i2;
                }
                return;
            }
            View view = (View) weakReference.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C1778vc.A(view)) {
                    a(view, i2);
                } else {
                    view.post(new a(this, view, i2));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2) {
        if (this.l != i2) {
            this.l = i2;
            if (i2 == 6 || i2 == 3) {
                d(true);
            } else if (i2 == 5 || i2 == 4) {
                d(false);
            }
            View view = (View) this.r.get();
            if (view != null) {
                a aVar = this.t;
                if (aVar != null) {
                    aVar.a(view, i2);
                }
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dz.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(Dz.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null) {
            int i2 = peekValue.data;
            if (i2 == -1) {
                b(i2);
                b(obtainStyledAttributes.getBoolean(Dz.BottomSheetBehavior_Layout_behavior_hideable, false));
                a(obtainStyledAttributes.getBoolean(Dz.BottomSheetBehavior_Layout_behavior_fitToContents, true));
                c(obtainStyledAttributes.getBoolean(Dz.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
                obtainStyledAttributes.recycle();
                this.b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            }
        }
        b(obtainStyledAttributes.getDimensionPixelSize(Dz.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        b(obtainStyledAttributes.getBoolean(Dz.BottomSheetBehavior_Layout_behavior_hideable, false));
        a(obtainStyledAttributes.getBoolean(Dz.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        c(obtainStyledAttributes.getBoolean(Dz.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        if (C1778vc.i(coordinatorLayout) && !C1778vc.i(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.c((View) v2, i2);
        this.q = coordinatorLayout.getHeight();
        if (this.d) {
            if (this.e == 0) {
                this.e = coordinatorLayout.getResources().getDimensionPixelSize(C1831wz.design_bottom_sheet_peek_height_min);
            }
            this.f = Math.max(this.e, this.q - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f = this.c;
        }
        this.g = Math.max(0, this.q - v2.getHeight());
        this.h = this.q / 2;
        d();
        int i3 = this.l;
        if (i3 == 3) {
            C1778vc.d(v2, e());
        } else if (i3 == 6) {
            C1778vc.d(v2, this.h);
        } else if (!this.j || i3 != 5) {
            int i4 = this.l;
            if (i4 == 4) {
                C1778vc.d(v2, this.i);
            } else if (i4 == 1 || i4 == 2) {
                C1778vc.d(v2, top - v2.getTop());
            }
        } else {
            C1778vc.d(v2, this.q);
        }
        if (this.m == null) {
            this.m = Zc.a((ViewGroup) coordinatorLayout, this.z);
        }
        this.r = new WeakReference<>(v2);
        this.s = new WeakReference<>(a((View) v2));
        return true;
    }

    private void d() {
        if (this.a) {
            this.i = Math.max(this.q - this.f, this.g);
        } else {
            this.i = this.q - this.f;
        }
    }

    public final int c() {
        return this.l;
    }

    private void d(boolean z2) {
        WeakReference<V> weakReference = this.r;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z2) {
                    if (this.y == null) {
                        this.y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.r.get()) {
                        if (!z2) {
                            Map<View, Integer> map = this.y;
                            if (map != null && map.containsKey(childAt)) {
                                C1778vc.f(childAt, ((Integer) this.y.get(childAt)).intValue());
                            }
                        } else {
                            if (VERSION.SDK_INT >= 16) {
                                this.y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            C1778vc.f(childAt, 4);
                        }
                    }
                }
                if (!z2) {
                    this.y = null;
                }
            }
        }
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.o = 0;
        this.p = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void b(int i2) {
        boolean z2 = true;
        if (i2 == -1) {
            if (!this.d) {
                this.d = true;
                if (!z2 && this.l == 4) {
                    WeakReference<V> weakReference = this.r;
                    if (weakReference != null) {
                        View view = (View) weakReference.get();
                        if (view != null) {
                            view.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (this.d || this.c != i2) {
            this.d = false;
            this.c = Math.max(0, i2);
            this.i = this.q - i2;
            if (!z2) {
                return;
            }
            return;
        }
        z2 = false;
        if (!z2) {
        }
    }

    public final int b() {
        if (this.d) {
            return -1;
        }
        return this.c;
    }

    public void b(boolean z2) {
        this.j = z2;
    }

    public static <V extends View> BottomSheetBehavior<V> b(V v2) {
        LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof d) {
            Behavior d2 = ((d) layoutParams).d();
            if (d2 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) d2;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z2 = false;
        if (!v2.isShown()) {
            this.n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            g();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.s;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && coordinatorLayout.a(view2, x2, this.w)) {
                this.v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.x = true;
            }
            this.n = this.v == -1 && !coordinatorLayout.a((View) v2, x2, this.w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.x = false;
            this.v = -1;
            if (this.n) {
                this.n = false;
                return false;
            }
        }
        if (!this.n) {
            Zc zc = this.m;
            if (zc != null && zc.b(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.s;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        if (actionMasked == 2 && view != null && !this.n && this.l != 1 && !coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.m != null && Math.abs(((float) this.w) - motionEvent.getY()) > ((float) this.m.e())) {
            z2 = true;
        }
        return z2;
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1 && view == ((View) this.s.get())) {
            int top = v2.getTop();
            int i5 = top - i3;
            if (i3 > 0) {
                if (i5 < e()) {
                    iArr[1] = top - e();
                    C1778vc.d(v2, -iArr[1]);
                    d(3);
                } else {
                    iArr[1] = i3;
                    C1778vc.d(v2, -i3);
                    d(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.i;
                if (i5 <= i6 || this.j) {
                    iArr[1] = i3;
                    C1778vc.d(v2, -i3);
                    d(1);
                } else {
                    iArr[1] = top - i6;
                    C1778vc.d(v2, -iArr[1]);
                    d(4);
                }
            }
            a(v2.getTop());
            this.o = i3;
            this.p = true;
        }
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4;
        int i5 = 3;
        if (v2.getTop() == e()) {
            d(3);
            return;
        }
        if (view == this.s.get() && this.p) {
            if (this.o > 0) {
                i3 = e();
            } else if (!this.j || !a((View) v2, f())) {
                if (this.o == 0) {
                    int top = v2.getTop();
                    if (!this.a) {
                        int i6 = this.h;
                        if (top < i6) {
                            if (top < Math.abs(top - this.i)) {
                                i3 = 0;
                            } else {
                                i3 = this.h;
                            }
                        } else if (Math.abs(top - i6) < Math.abs(top - this.i)) {
                            i3 = this.h;
                        } else {
                            i4 = this.i;
                        }
                        i5 = 6;
                    } else if (Math.abs(top - this.g) < Math.abs(top - this.i)) {
                        i3 = this.g;
                    } else {
                        i4 = this.i;
                    }
                } else {
                    i4 = this.i;
                }
                i5 = 4;
            } else {
                i3 = this.q;
                i5 = 5;
            }
            if (this.m.b((View) v2, v2.getLeft(), i3)) {
                d(2);
                C1778vc.a((View) v2, (Runnable) new b(v2, i5));
            } else {
                d(i5);
            }
            this.p = false;
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        return view == this.s.get() && (this.l != 3 || super.a(coordinatorLayout, v2, view, f2, f3));
    }

    public void a(boolean z2) {
        if (this.a != z2) {
            this.a = z2;
            if (this.r != null) {
                d();
            }
            d((!this.a || this.l != 6) ? this.l : 3);
        }
    }

    public void a(a aVar) {
        this.t = aVar;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(View view, float f2) {
        boolean z2 = true;
        if (this.k) {
            return true;
        }
        if (view.getTop() < this.i) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.i)) / ((float) this.c) <= 0.5f) {
            z2 = false;
        }
        return z2;
    }

    /* access modifiers changed from: 0000 */
    public View a(View view) {
        if (C1778vc.C(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View a2 = a(viewGroup.getChildAt(i2));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.i;
        } else if (i2 == 6) {
            int i4 = this.h;
            if (this.a) {
                int i5 = this.g;
                if (i4 <= i5) {
                    i3 = i5;
                    i2 = 3;
                }
            }
            i3 = i4;
        } else if (i2 == 3) {
            i3 = e();
        } else if (!this.j || i2 != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal state argument: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i3 = this.q;
        }
        if (this.m.b(view, view.getLeft(), i3)) {
            d(2);
            C1778vc.a(view, (Runnable) new b(view, i2));
            return;
        }
        d(i2);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        View view = (View) this.r.get();
        if (view != null) {
            a aVar = this.t;
            if (aVar != null) {
                int i3 = this.i;
                if (i2 > i3) {
                    aVar.a(view, ((float) (i3 - i2)) / ((float) (this.q - i3)));
                } else {
                    aVar.a(view, ((float) (i3 - i2)) / ((float) (i3 - e())));
                }
            }
        }
    }
}
