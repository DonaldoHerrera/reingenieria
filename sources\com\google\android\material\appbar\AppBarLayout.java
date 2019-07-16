package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@androidx.coordinatorlayout.widget.CoordinatorLayout.b(Behavior.class)
public class AppBarLayout extends LinearLayout {
    private int a;
    private int b;
    private int c;
    private boolean d;
    private int e;
    private Ic f;
    private List<a> g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int[] l;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        /* access modifiers changed from: private */
        public int k;
        private int l;
        private ValueAnimator m;
        private int n = -1;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private a r;

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new c();
            int c;
            float d;
            boolean e;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.c = parcel.readInt();
                this.d = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.c);
                parcel.writeFloat(this.d);
                parcel.writeByte(this.e ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public static abstract class a<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        public BaseBehavior() {
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        private void d(CoordinatorLayout coordinatorLayout, T t) {
            int c = c();
            int b = b(t, c);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a2 = layoutParams.a();
                if ((a2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (a(a2, 2)) {
                        i2 += C1778vc.m(childAt);
                    } else if (a(a2, 5)) {
                        int m2 = C1778vc.m(childAt) + i2;
                        if (c < m2) {
                            i = m2;
                        } else {
                            i2 = m2;
                        }
                    }
                    if (a(a2, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    if (c < (i2 + i) / 2) {
                        i = i2;
                    }
                    a(coordinatorLayout, t, C1598pb.a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public int c(T t) {
            return t.getTotalScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b = layoutParams.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a2 = layoutParams.a();
                    if ((a2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((a2 & 2) != 0) {
                            i2 -= C1778vc.m(childAt);
                        }
                    }
                    if (C1778vc.i(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        private int b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (a(layoutParams.a(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.c() || a(coordinatorLayout, t, view));
            if (z) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.q = null;
            this.l = i2;
            return z;
        }

        /* access modifiers changed from: 0000 */
        public int b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d = super.d(coordinatorLayout, t);
            int b = b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(d);
                    savedState.c = i;
                    if (bottom == C1778vc.m(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.e = z;
                    savedState.d = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return d;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = a(coordinatorLayout, t, i2, i5, i4);
                    a(i2, t, view, i3);
                }
            }
        }

        private boolean c(CoordinatorLayout coordinatorLayout, T t) {
            List c = coordinatorLayout.c((View) t);
            int size = c.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior d = ((d) ((View) c.get(i)).getLayoutParams()).d();
                if (d instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) d).c() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                a(i4, t, view, i5);
            }
            if (t.c()) {
                t.a(view.getScrollY() > 0);
            }
        }

        private void a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int c = c();
                if ((i < 0 && c == 0) || (i > 0 && c == (-t.getDownNestedScrollRange()))) {
                    C1778vc.h(view, 1);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public int c() {
            return b() + this.k;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                d(coordinatorLayout, t);
            }
            this.q = new WeakReference<>(view);
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(c() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            a(coordinatorLayout, t, i, i2);
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c = c();
            if (c == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.m.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                this.m = new ValueAnimator();
                this.m.setInterpolator(Ez.e);
                this.m.addUpdateListener(new b(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration((long) Math.min(i2, 600));
            this.m.setIntValues(new int[]{c, i});
            this.m.start();
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((d) t.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.a((View) t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean a2 = super.a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.o) {
                    i2 = C1778vc.m(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.p);
                }
                c(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        a(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        c(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.d();
            this.n = -1;
            a(C1598pb.a(b(), -t.getTotalScrollRange(), 0));
            a(coordinatorLayout, t, b(), 0, true);
            t.a(b());
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(T t) {
            a aVar = this.r;
            if (aVar != null) {
                return aVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            boolean z = true;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void e(CoordinatorLayout coordinatorLayout, T t) {
            d(coordinatorLayout, t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c = c();
            int i4 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.k = 0;
            } else {
                int a2 = C1598pb.a(i, i2, i3);
                if (c != a2) {
                    int c2 = t.a() ? c(t, a2) : a2;
                    boolean a3 = a(c2);
                    i4 = c - a2;
                    this.k = a2 - c2;
                    if (!a3 && t.a()) {
                        coordinatorLayout.a((View) t);
                    }
                    t.a(b());
                    a(coordinatorLayout, t, a2, a2 < c ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        private void a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            boolean z2;
            View a2 = a((AppBarLayout) t, i);
            if (a2 != null) {
                int a3 = ((LayoutParams) a2.getLayoutParams()).a();
                if ((a3 & 1) != 0) {
                    int m2 = C1778vc.m(a2);
                    if (i2 <= 0 || (a3 & 12) == 0 ? !((a3 & 2) == 0 || (-i) < (a2.getBottom() - m2) - t.getTopInset()) : (-i) >= (a2.getBottom() - m2) - t.getTopInset()) {
                        z2 = true;
                        if (t.c()) {
                            View a4 = a(coordinatorLayout);
                            if (a4 != null) {
                                z2 = a4.getScrollY() > 0;
                            }
                        }
                        boolean a5 = t.a(z2);
                        if (VERSION.SDK_INT >= 11) {
                            return;
                        }
                        if (z || (a5 && c(coordinatorLayout, t))) {
                            t.jumpDrawablesToCurrentState();
                            return;
                        }
                        return;
                    }
                }
                z2 = false;
                if (t.c()) {
                }
                boolean a52 = t.a(z2);
                if (VERSION.SDK_INT >= 11) {
                }
            }
        }

        private static View a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof C1321gc) {
                    return childAt;
                }
            }
            return null;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.a(coordinatorLayout, t, savedState.a());
                this.n = savedState.c;
                this.p = savedState.d;
                this.o = savedState.e;
                return;
            }
            super.a(coordinatorLayout, t, parcelable);
            this.n = -1;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.a(coordinatorLayout, appBarLayout, i);
        }

        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        public /* bridge */ /* synthetic */ Parcelable b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.d(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.a(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.b(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.a(coordinatorLayout, appBarLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean a(int i) {
            return super.a(i);
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        int a = 1;
        Interpolator b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dz.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(Dz.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(Dz.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(Dz.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public void a(int i) {
            this.a = i;
        }

        public Interpolator b() {
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public boolean c() {
            int i = this.a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public int a() {
            return this.a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            a(view, view2);
            b(view, view2);
            return false;
        }

        /* access modifiers changed from: 0000 */
        public int c(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.c(view);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dz.ScrollingViewBehavior_Layout);
            b(obtainStyledAttributes.getDimensionPixelSize(Dz.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.a(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* access modifiers changed from: 0000 */
        public float b(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = a(coordinatorLayout.b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        private void b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.c()) {
                    appBarLayout.a(view.getScrollY() > 0);
                }
            }
        }

        private void a(View view, View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior d = ((d) view2.getLayoutParams()).d();
            if (d instanceof BaseBehavior) {
                C1778vc.d(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).k) + d()) - a(view2));
            }
        }

        private static int a(AppBarLayout appBarLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior d = ((d) appBarLayout.getLayoutParams()).d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).c();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public AppBarLayout a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public interface b extends a<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((LayoutParams) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void f() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    public void a(a aVar) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (aVar != null && !this.g.contains(aVar)) {
            this.g.add(aVar);
        }
    }

    public void b(a aVar) {
        List<a> list = this.g;
        if (list != null && aVar != null) {
            list.remove(aVar);
        }
    }

    public boolean c() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.e = 0;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        int i2;
        int i3 = this.b;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = layoutParams.a;
            if ((i5 & 5) == 5) {
                int i6 = i4 + layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i5 & 8) != 0) {
                    i4 = i6 + C1778vc.m(childAt);
                } else {
                    if ((i5 & 2) != 0) {
                        i2 = C1778vc.m(childAt);
                    } else {
                        i2 = getTopInset();
                    }
                    i4 = i6 + (measuredHeight - i2);
                }
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.b = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i5 = layoutParams.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= C1778vc.m(childAt) + getTopInset();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.c = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m = C1778vc.m(this);
        if (m == 0) {
            int childCount = getChildCount();
            m = childCount >= 1 ? C1778vc.m(getChildAt(childCount - 1)) : 0;
            if (m == 0) {
                return getHeight() / 3;
            }
        }
        return (m * 2) + topInset;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.e;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        Ic ic = this.f;
        if (ic != null) {
            return ic.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.a;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = layoutParams.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((i5 & 2) != 0) {
                i4 -= C1778vc.m(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4 - getTopInset());
        this.a = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.l == null) {
            this.l = new int[4];
        }
        int[] iArr = this.l;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.i ? C1771uz.state_liftable : -C1771uz.state_liftable;
        iArr[1] = (!this.i || !this.j) ? -C1771uz.state_lifted : C1771uz.state_lifted;
        iArr[2] = this.i ? C1771uz.state_collapsible : -C1771uz.state_collapsible;
        iArr[3] = (!this.i || !this.j) ? -C1771uz.state_collapsed : C1771uz.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        f();
        boolean z2 = false;
        this.d = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            } else if (((LayoutParams) getChildAt(i6).getLayoutParams()).b() != null) {
                this.d = true;
                break;
            } else {
                i6++;
            }
        }
        if (!this.h) {
            if (this.k || e()) {
                z2 = true;
            }
            b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        f();
    }

    public void setExpanded(boolean z) {
        a(z, C1778vc.B(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.k = z;
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (VERSION.SDK_INT >= 21) {
            g.a(this, f2);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.e = 0;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            g.a(this);
            g.a(this, attributeSet, 0, Cz.Widget_Design_AppBarLayout);
        }
        TypedArray a2 = r.a(context, attributeSet, Dz.AppBarLayout, 0, Cz.Widget_Design_AppBarLayout, new int[0]);
        C1778vc.a((View) this, a2.getDrawable(Dz.AppBarLayout_android_background));
        if (a2.hasValue(Dz.AppBarLayout_expanded)) {
            a(a2.getBoolean(Dz.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && a2.hasValue(Dz.AppBarLayout_elevation)) {
            g.a(this, (float) a2.getDimensionPixelSize(Dz.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (a2.hasValue(Dz.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(a2.getBoolean(Dz.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (a2.hasValue(Dz.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(a2.getBoolean(Dz.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.k = a2.getBoolean(Dz.AppBarLayout_liftOnScroll, false);
        a2.recycle();
        C1778vc.a((View) this, (C1506mc) new a(this));
    }

    public void b(b bVar) {
        b((a) bVar);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return getTotalScrollRange() != 0;
    }

    private boolean b(boolean z) {
        if (this.i == z) {
            return false;
        }
        this.i = z;
        refreshDrawableState();
        return true;
    }

    public void a(b bVar) {
        a((a) bVar);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void a(boolean z, boolean z2) {
        a(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.e = i3 | i2;
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        List<a> list = this.g;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = (a) this.g.get(i3);
                if (aVar != null) {
                    aVar.a(this, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: 0000 */
    public Ic a(Ic ic) {
        Ic ic2 = C1778vc.i(this) ? ic : null;
        if (!C0243Pb.a(this.f, ic2)) {
            this.f = ic2;
            f();
        }
        return ic;
    }
}
