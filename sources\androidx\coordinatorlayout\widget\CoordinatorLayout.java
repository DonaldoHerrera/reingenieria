package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C1383ic {
    static final String a;
    static final Class<?>[] b = {Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<Behavior>>> c = new ThreadLocal<>();
    static final Comparator<View> d;
    private static final C0251Rb<Rect> e = new C0259Tb(12);
    private final List<View> f;
    private final c<View> g;
    private final List<View> h;
    private final List<View> i;
    private final int[] j;
    private Paint k;
    private boolean l;
    private boolean m;
    private int[] n;
    private View o;
    private View p;
    private e q;
    private boolean r;
    private Ic s;
    private boolean t;
    private Drawable u;
    OnHierarchyChangeListener v;
    private C1506mc w;
    private final C1475lc x;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public Ic a(CoordinatorLayout coordinatorLayout, V v, Ic ic) {
            return ic;
        }

        public void a() {
        }

        public void a(d dVar) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        @Deprecated
        public void a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return c(coordinatorLayout, v) > 0.0f;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public int b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public float c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public void c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public Parcelable d(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public void d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                a(coordinatorLayout, v, view, view2, i);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                d(coordinatorLayout, v, view);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new b();
        SparseArray<Parcelable> c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.c.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface a {
        Behavior getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        Class<? extends Behavior> value();
    }

    private class c implements OnHierarchyChangeListener {
        c() {
        }

        public void onChildViewAdded(View view, View view2) {
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.b(2);
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class d extends MarginLayoutParams {
        Behavior a;
        boolean b = false;
        public int c = 0;
        public int d = 0;
        public int e = -1;
        int f = -1;
        public int g = 0;
        public int h = 0;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q = new Rect();
        Object r;

        public d(int i2, int i3) {
            super(i2, i3);
        }

        public void a(Behavior behavior) {
            Behavior behavior2 = this.a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.a();
                }
                this.a = behavior;
                this.r = null;
                this.b = true;
                if (behavior != null) {
                    behavior.a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean b() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        public int c() {
            return this.f;
        }

        public Behavior d() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public boolean e() {
            return this.p;
        }

        /* access modifiers changed from: 0000 */
        public Rect f() {
            return this.q;
        }

        /* access modifiers changed from: 0000 */
        public void g() {
            this.p = false;
        }

        /* access modifiers changed from: 0000 */
        public void h() {
            this.m = false;
        }

        /* access modifiers changed from: 0000 */
        public boolean b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            Behavior behavior = this.a;
            boolean a2 = (behavior != null ? behavior.a(coordinatorLayout, view) : false) | z;
            this.m = a2;
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public void a(Rect rect) {
            this.q.set(rect);
        }

        /* access modifiers changed from: 0000 */
        public void b(int i2) {
            a(i2, false);
        }

        private boolean b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.l = view2;
            return true;
        }

        /* access modifiers changed from: 0000 */
        public boolean a() {
            return this.k == null && this.f != -1;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }

        d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0214Ia.CoordinatorLayout_Layout);
            this.c = obtainStyledAttributes.getInteger(C0214Ia.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f = obtainStyledAttributes.getResourceId(C0214Ia.CoordinatorLayout_Layout_layout_anchor, -1);
            this.d = obtainStyledAttributes.getInteger(C0214Ia.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.e = obtainStyledAttributes.getInteger(C0214Ia.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = obtainStyledAttributes.getInt(C0214Ia.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = obtainStyledAttributes.getInt(C0214Ia.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.b = obtainStyledAttributes.hasValue(C0214Ia.CoordinatorLayout_Layout_layout_behavior);
            if (this.b) {
                this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(C0214Ia.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.a;
            if (behavior != null) {
                behavior.a(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            this.p = z;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 != this.l && !a(view2, C1778vc.l(coordinatorLayout))) {
                Behavior behavior = this.a;
                if (behavior == null || !behavior.a(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public View a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !b(view, coordinatorLayout)) {
                a(view, coordinatorLayout);
            }
            return this.k;
        }

        private void a(View view, CoordinatorLayout coordinatorLayout) {
            this.k = coordinatorLayout.findViewById(this.f);
            View view2 = this.k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.l = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.l = null;
                this.k = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
        }

        public d(d dVar) {
            super(dVar);
        }

        private boolean a(View view, int i2) {
            int a2 = C0287Zb.a(((d) view.getLayoutParams()).g, i2);
            return a2 != 0 && (C0287Zb.a(this.h, i2) & a2) == a2;
        }

        public d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class e implements OnPreDrawListener {
        e() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.b(0);
            return true;
        }
    }

    static class f implements Comparator<View> {
        f() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float u = C1778vc.u(view);
            float u2 = C1778vc.u(view2);
            if (u > u2) {
                return -1;
            }
            return u < u2 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            d = new f();
        } else {
            d = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static int a(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        e.a(rect);
    }

    private Ic b(Ic ic) {
        if (ic.g()) {
            return ic;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (C1778vc.i(childAt)) {
                Behavior d2 = ((d) childAt.getLayoutParams()).d();
                if (d2 != null) {
                    ic = d2.a(this, childAt, ic);
                    if (ic.g()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return ic;
    }

    private int c(int i2) {
        int[] iArr = this.n;
        String str = "CoordinatorLayout";
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
            Log.e(str, sb.toString());
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i2);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e(str, sb2.toString());
            return 0;
        }
    }

    private static int d(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int e(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private void e(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        int i3 = dVar.i;
        if (i3 != i2) {
            C1778vc.c(view, i2 - i3);
            dVar.i = i2;
        }
    }

    private static int f(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void f(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        int i3 = dVar.j;
        if (i3 != i2) {
            C1778vc.d(view, i2 - i3);
            dVar.j = i2;
        }
    }

    private static Rect g() {
        Rect rect = (Rect) e.a();
        return rect == null ? new Rect() : rect;
    }

    private void h() {
        this.f.clear();
        this.g.a();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            d d2 = d(childAt);
            d2.a(this, childAt);
            this.g.a(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (d2.a(this, childAt, childAt2)) {
                        if (!this.g.b(childAt2)) {
                            this.g.a(childAt2);
                        }
                        this.g.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f.addAll(this.g.b());
        Collections.reverse(this.f);
    }

    private void i() {
        if (VERSION.SDK_INT >= 21) {
            if (C1778vc.i(this)) {
                if (this.w == null) {
                    this.w = new a(this);
                }
                C1778vc.a((View) this, this.w);
                setSystemUiVisibility(1280);
            } else {
                C1778vc.a((View) this, (C1506mc) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public d d(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.b) {
            String str = "CoordinatorLayout";
            if (view instanceof a) {
                Behavior behavior = ((a) view).getBehavior();
                if (behavior == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                dVar.a(behavior);
                dVar.b = true;
            } else {
                b bVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (b) cls.getAnnotation(b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        dVar.a((Behavior) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(bVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget");
                        sb.append(" a default constructor?");
                        Log.e(str, sb.toString(), e2);
                    }
                }
                dVar.b = true;
            }
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        d dVar = (d) view.getLayoutParams();
        Behavior behavior = dVar.a;
        if (behavior != null) {
            float c2 = behavior.c(this, view);
            if (c2 > 0.0f) {
                if (this.k == null) {
                    this.k = new Paint();
                }
                this.k.setColor(dVar.a.b(this, view));
                this.k.setAlpha(a(Math.round(c2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.k);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        h();
        return Collections.unmodifiableList(this.f);
    }

    public final Ic getLastWindowInsets() {
        return this.s;
    }

    public int getNestedScrollAxes() {
        return this.x.a();
    }

    public Drawable getStatusBarBackground() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.r) {
            if (this.q == null) {
                this.q = new e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.q);
        }
        if (this.s == null && C1778vc.i(this)) {
            C1778vc.G(this);
        }
        this.m = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.r && this.q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.q);
        }
        View view = this.p;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.m = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.t && this.u != null) {
            Ic ic = this.s;
            int e2 = ic != null ? ic.e() : 0;
            if (e2 > 0) {
                this.u.setBounds(0, 0, getWidth(), e2);
                this.u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int l2 = C1778vc.l(this);
        int size = this.f.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.f.get(i6);
            if (view.getVisibility() != 8) {
                Behavior d2 = ((d) view.getLayoutParams()).d();
                if (d2 == null || !d2.a(this, view, l2)) {
                    c(view, l2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r0.a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Behavior d2;
        int i10;
        int i11;
        d dVar;
        int i12;
        h();
        e();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int l2 = C1778vc.l(this);
        boolean z = l2 == 1;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size2 = MeasureSpec.getSize(i3);
        int i13 = paddingLeft + paddingRight;
        int i14 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.s != null && C1778vc.i(this);
        int size3 = this.f.size();
        int i15 = suggestedMinimumWidth;
        int i16 = suggestedMinimumHeight;
        int i17 = 0;
        int i18 = 0;
        while (i18 < size3) {
            View view = (View) this.f.get(i18);
            if (view.getVisibility() == 8) {
                i5 = i18;
                i4 = size3;
            } else {
                d dVar2 = (d) view.getLayoutParams();
                int i19 = dVar2.e;
                if (i19 < 0 || mode == 0) {
                    i6 = i16;
                } else {
                    int c2 = c(i19);
                    int a2 = C0287Zb.a(f(dVar2.c), l2) & 7;
                    i6 = i16;
                    if ((a2 == 3 && !z) || (a2 == 5 && z)) {
                        i7 = Math.max(0, (size - paddingRight) - c2);
                        if (z2) {
                        }
                        i9 = i2;
                        i8 = i3;
                        d2 = dVar2.d();
                        if (d2 != null) {
                        }
                        a(view, i9, i7, i8, 0);
                        d dVar3 = dVar;
                        int max = Math.max(i10, i13 + view.getMeasuredWidth() + dVar3.leftMargin + dVar3.rightMargin);
                        int max2 = Math.max(i12, i14 + view.getMeasuredHeight() + dVar3.topMargin + dVar3.bottomMargin);
                        i15 = max;
                        i17 = View.combineMeasuredStates(i11, view.getMeasuredState());
                        i16 = max2;
                    } else if ((a2 == 5 && !z) || (a2 == 3 && z)) {
                        i7 = Math.max(0, c2 - paddingLeft);
                        if (z2 || C1778vc.i(view)) {
                            i9 = i2;
                            i8 = i3;
                        } else {
                            int e2 = this.s.e() + this.s.b();
                            i9 = MeasureSpec.makeMeasureSpec(size - (this.s.c() + this.s.d()), mode);
                            i8 = MeasureSpec.makeMeasureSpec(size2 - e2, mode2);
                        }
                        d2 = dVar2.d();
                        if (d2 != null) {
                            dVar = dVar2;
                            i12 = i6;
                            i11 = i17;
                            i10 = i15;
                            i5 = i18;
                            i4 = size3;
                        } else {
                            dVar = dVar2;
                            i11 = i17;
                            i10 = i15;
                            i4 = size3;
                            i12 = i6;
                            i5 = i18;
                        }
                        a(view, i9, i7, i8, 0);
                        d dVar32 = dVar;
                        int max3 = Math.max(i10, i13 + view.getMeasuredWidth() + dVar32.leftMargin + dVar32.rightMargin);
                        int max22 = Math.max(i12, i14 + view.getMeasuredHeight() + dVar32.topMargin + dVar32.bottomMargin);
                        i15 = max3;
                        i17 = View.combineMeasuredStates(i11, view.getMeasuredState());
                        i16 = max22;
                    }
                }
                i7 = 0;
                if (z2) {
                }
                i9 = i2;
                i8 = i3;
                d2 = dVar2.d();
                if (d2 != null) {
                }
                a(view, i9, i7, i8, 0);
                d dVar322 = dVar;
                int max32 = Math.max(i10, i13 + view.getMeasuredWidth() + dVar322.leftMargin + dVar322.rightMargin);
                int max222 = Math.max(i12, i14 + view.getMeasuredHeight() + dVar322.topMargin + dVar322.bottomMargin);
                i15 = max32;
                i17 = View.combineMeasuredStates(i11, view.getMeasuredState());
                i16 = max222;
            }
            i18 = i5 + 1;
            size3 = i4;
        }
        int i20 = i17;
        setMeasuredDimension(View.resolveSizeAndState(i15, i2, -16777216 & i20), View.resolveSizeAndState(i16, i3, i20 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    Behavior d2 = dVar.d();
                    if (d2 != null) {
                        z2 |= d2.a(this, childAt, view, f2, f3, z);
                    }
                }
            }
        }
        if (z2) {
            b(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    Behavior d2 = dVar.d();
                    if (d2 != null) {
                        z |= d2.a(this, childAt, view, f2, f3);
                    }
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior d2 = d(childAt).d();
            if (!(id == -1 || d2 == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    d2.a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior d2 = ((d) childAt.getLayoutParams()).d();
            if (!(id == -1 || d2 == null)) {
                Parcelable d3 = d2.d(this, childAt);
                if (d3 != null) {
                    sparseArray.append(id, d3);
                }
            }
        }
        savedState.c = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return b(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        if (this.o == null) {
            z2 = a(motionEvent3, 1);
        } else {
            z2 = false;
        }
        Behavior d2 = ((d) this.o.getLayoutParams()).d();
        if (d2 != null) {
            z = d2.b(this, this.o, motionEvent3);
            motionEvent2 = null;
            if (this.o != null) {
                z |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 || actionMasked == 3) {
                a(false);
            }
            return z;
        }
        z = false;
        motionEvent2 = null;
        if (this.o != null) {
        }
        if (motionEvent2 != null) {
        }
        a(false);
        return z;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior d2 = ((d) view.getLayoutParams()).d();
        if (d2 == null || !d2.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.l) {
            a(false);
            this.l = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        i();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.u = drawable3;
            Drawable drawable4 = this.u;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.a(this.u, C1778vc.l(this));
                this.u.setVisible(getVisibility() == 0, false);
                this.u.setCallback(this);
            }
            C1778vc.F(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? androidx.core.content.a.c(getContext(), i2) : null);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.u;
        if (drawable != null && drawable.isVisible() != z) {
            this.u.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0207Ga.coordinatorLayoutStyle);
    }

    /* access modifiers changed from: protected */
    public d generateDefaultLayoutParams() {
        return new d(-2, -2);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArray;
        super(context, attributeSet, i2);
        this.f = new ArrayList();
        this.g = new c<>();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new int[2];
        this.x = new C1475lc(this);
        if (i2 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C0214Ia.CoordinatorLayout, 0, C0210Ha.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C0214Ia.CoordinatorLayout, i2, 0);
        }
        int resourceId = typedArray.getResourceId(C0214Ia.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.n = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.n.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.n;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.u = typedArray.getDrawable(C0214Ia.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        i();
        super.setOnHierarchyChangeListener(new c());
    }

    /* access modifiers changed from: 0000 */
    public final Ic a(Ic ic) {
        if (C0243Pb.a(this.s, ic)) {
            return ic;
        }
        this.s = ic;
        boolean z = true;
        this.t = ic != null && ic.e() > 0;
        if (this.t || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        Ic b2 = b(ic);
        requestLayout();
        return b2;
    }

    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public d generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new d((MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (e(getChildAt(i2))) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z == this.r) {
            return;
        }
        if (z) {
            d();
        } else {
            f();
        }
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        if (this.m && this.q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.q);
        }
        this.r = false;
    }

    public void c(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.a()) {
            View view2 = dVar.k;
            if (view2 != null) {
                a(view, view2, i2);
                return;
            }
            int i3 = dVar.e;
            if (i3 >= 0) {
                b(view, i3, i2);
            } else {
                d(view, i2);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    private void a(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Behavior d2 = ((d) childAt.getLayoutParams()).d();
            if (d2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d2.a(this, childAt, obtain);
                } else {
                    d2.b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((d) getChildAt(i3).getLayoutParams()).h();
        }
        this.o = null;
        this.l = false;
    }

    /* access modifiers changed from: 0000 */
    public void b(View view, Rect rect) {
        rect.set(((d) view.getLayoutParams()).f());
    }

    private void b(View view, int i2, int i3) {
        d dVar = (d) view.getLayoutParams();
        int a2 = C0287Zb.a(f(dVar.c), i3);
        int i4 = a2 & 7;
        int i5 = a2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int c2 = c(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            c2 += measuredWidth / 2;
        } else if (i4 == 5) {
            c2 += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(c2, ((width - getPaddingRight()) - measuredWidth) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - dVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private boolean e(View view) {
        return this.g.e(view);
    }

    /* access modifiers changed from: 0000 */
    public void c(View view, Rect rect) {
        ((d) view.getLayoutParams()).a(rect);
    }

    private void d(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        Rect g2 = g();
        g2.set(getPaddingLeft() + dVar.leftMargin, getPaddingTop() + dVar.topMargin, (getWidth() - getPaddingRight()) - dVar.rightMargin, (getHeight() - getPaddingBottom()) - dVar.bottomMargin);
        if (this.s != null && C1778vc.i(this) && !C1778vc.i(view)) {
            g2.left += this.s.c();
            g2.top += this.s.e();
            g2.right -= this.s.d();
            g2.bottom -= this.s.b();
        }
        Rect g3 = g();
        C0287Zb.a(e(dVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), g2, g3, i2);
        view.layout(g3.left, g3.top, g3.right, g3.bottom);
        a(g2);
        a(g3);
    }

    public List<View> c(View view) {
        List c2 = this.g.c(view);
        this.i.clear();
        if (c2 != null) {
            this.i.addAll(c2);
        }
        return this.i;
    }

    private void a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i2 = childCount - 1;
        while (i2 >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
            i2--;
        }
        Comparator<View> comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean a(MotionEvent motionEvent, int i2) {
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.h;
        a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            d dVar = (d) view.getLayoutParams();
            Behavior d2 = dVar.d();
            boolean z3 = true;
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && d2 != null) {
                    if (i3 == 0) {
                        z = d2.a(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        z = d2.b(this, view, motionEvent2);
                    }
                    if (z) {
                        this.o = view;
                    }
                }
                boolean b2 = dVar.b();
                boolean b3 = dVar.b(this, view);
                if (!b3 || b2) {
                    z3 = false;
                }
                if (b3 && !z3) {
                    break;
                }
                z2 = z3;
            } else if (d2 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    d2.a(this, view, motionEvent3);
                } else if (i3 == 1) {
                    d2.b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2) {
        boolean z;
        int i3 = i2;
        int l2 = C1778vc.l(this);
        int size = this.f.size();
        Rect g2 = g();
        Rect g3 = g();
        Rect g4 = g();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) this.f.get(i4);
            d dVar = (d) view.getLayoutParams();
            if (i3 != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (dVar.l == ((View) this.f.get(i5))) {
                        b(view, l2);
                    }
                }
                a(view, true, g3);
                if (dVar.g != 0 && !g3.isEmpty()) {
                    int a2 = C0287Zb.a(dVar.g, l2);
                    int i6 = a2 & 112;
                    if (i6 == 48) {
                        g2.top = Math.max(g2.top, g3.bottom);
                    } else if (i6 == 80) {
                        g2.bottom = Math.max(g2.bottom, getHeight() - g3.top);
                    }
                    int i7 = a2 & 7;
                    if (i7 == 3) {
                        g2.left = Math.max(g2.left, g3.right);
                    } else if (i7 == 5) {
                        g2.right = Math.max(g2.right, getWidth() - g3.left);
                    }
                }
                if (dVar.h != 0 && view.getVisibility() == 0) {
                    a(view, g2, l2);
                }
                if (i3 != 2) {
                    b(view, g4);
                    if (!g4.equals(g3)) {
                        c(view, g3);
                    }
                }
                for (int i8 = i4 + 1; i8 < size; i8++) {
                    View view2 = (View) this.f.get(i8);
                    d dVar2 = (d) view2.getLayoutParams();
                    Behavior d2 = dVar2.d();
                    if (d2 != null && d2.a(this, view2, view)) {
                        if (i3 != 0 || !dVar2.e()) {
                            if (i3 != 2) {
                                z = d2.b(this, view2, view);
                            } else {
                                d2.c(this, view2, view);
                                z = true;
                            }
                            if (i3 == 1) {
                                dVar2.a(z);
                            }
                        } else {
                            dVar2.g();
                        }
                    }
                }
            }
        }
        a(g2);
        a(g3);
        a(g4);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        if (this.m) {
            if (this.q == null) {
                this.q = new e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.q);
        }
        this.r = true;
    }

    static Behavior a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) c.get();
            if (map == null) {
                map = new HashMap();
                c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, Rect rect) {
        d.a((ViewGroup) this, view, rect);
    }

    public void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> b(View view) {
        List d2 = this.g.d(view);
        this.i.clear();
        if (d2 != null) {
            this.i.addAll(d2);
        }
        return this.i;
    }

    private void a(View view, int i2, Rect rect, Rect rect2, d dVar, int i3, int i4) {
        int i5;
        int i6;
        int a2 = C0287Zb.a(d(dVar.c), i2);
        int a3 = C0287Zb.a(e(dVar.d), i2);
        int i7 = a2 & 7;
        int i8 = a2 & 112;
        int i9 = a3 & 7;
        int i10 = a3 & 112;
        if (i9 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i9 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i10 == 16) {
            i6 = rect.top + (rect.height() / 2);
        } else if (i10 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i7 == 1) {
            i5 -= i3 / 2;
        } else if (i7 != 5) {
            i5 -= i3;
        }
        if (i8 == 16) {
            i6 -= i4 / 2;
        } else if (i8 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    /* access modifiers changed from: 0000 */
    public void b(View view, int i2) {
        View view2 = view;
        d dVar = (d) view.getLayoutParams();
        if (dVar.k != null) {
            Rect g2 = g();
            Rect g3 = g();
            Rect g4 = g();
            a(dVar.k, g2);
            boolean z = false;
            a(view2, false, g3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i3 = measuredHeight;
            a(view, i2, g2, g4, dVar, measuredWidth, measuredHeight);
            if (!(g4.left == g3.left && g4.top == g3.top)) {
                z = true;
            }
            a(dVar, g4, measuredWidth, i3);
            int i4 = g4.left - g3.left;
            int i5 = g4.top - g3.top;
            if (i4 != 0) {
                C1778vc.c(view2, i4);
            }
            if (i5 != 0) {
                C1778vc.d(view2, i5);
            }
            if (z) {
                Behavior d2 = dVar.d();
                if (d2 != null) {
                    d2.b(this, view2, dVar.k);
                }
            }
            a(g2);
            a(g3);
            a(g4);
        }
    }

    private void a(d dVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - dVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public boolean b(View view, View view2, int i2, int i3) {
        int i4 = i3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                Behavior d2 = dVar.d();
                if (d2 != null) {
                    boolean b2 = d2.b(this, childAt, view, view2, i2, i3);
                    boolean z2 = z | b2;
                    dVar.a(i4, b2);
                    z = z2;
                } else {
                    dVar.a(i4, false);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, int i2, Rect rect, Rect rect2) {
        d dVar = (d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        a(view, i2, rect, rect2, dVar, measuredWidth, measuredHeight);
        a(dVar, rect2, measuredWidth, measuredHeight);
    }

    private void a(View view, View view2, int i2) {
        Rect g2 = g();
        Rect g3 = g();
        try {
            a(view2, g2);
            a(view, i2, g2, g3);
            view.layout(g3.left, g3.top, g3.right, g3.bottom);
        } finally {
            a(g2);
            a(g3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6  */
    private void a(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        if (C1778vc.B(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            d dVar = (d) view.getLayoutParams();
            Behavior d2 = dVar.d();
            Rect g2 = g();
            Rect g3 = g();
            g3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (d2 == null || !d2.a(this, view, g2)) {
                g2.set(g3);
            } else if (!g3.contains(g2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Rect should be within the child's bounds. Rect:");
                sb.append(g2.toShortString());
                sb.append(" | Bounds:");
                sb.append(g3.toShortString());
                throw new IllegalArgumentException(sb.toString());
            }
            a(g3);
            if (g2.isEmpty()) {
                a(g2);
                return;
            }
            int a2 = C0287Zb.a(dVar.h, i2);
            if ((a2 & 48) == 48) {
                int i3 = (g2.top - dVar.topMargin) - dVar.j;
                int i4 = rect.top;
                if (i3 < i4) {
                    f(view, i4 - i3);
                    z = true;
                    if ((a2 & 80) == 80) {
                        int height = ((getHeight() - g2.bottom) - dVar.bottomMargin) + dVar.j;
                        int i5 = rect.bottom;
                        if (height < i5) {
                            f(view, height - i5);
                            z = true;
                        }
                    }
                    if (!z) {
                        f(view, 0);
                    }
                    if ((a2 & 3) == 3) {
                        int i6 = (g2.left - dVar.leftMargin) - dVar.i;
                        int i7 = rect.left;
                        if (i6 < i7) {
                            e(view, i7 - i6);
                            z2 = true;
                            if ((a2 & 5) == 5) {
                                int width = ((getWidth() - g2.right) - dVar.rightMargin) + dVar.i;
                                int i8 = rect.right;
                                if (width < i8) {
                                    e(view, width - i8);
                                    z2 = true;
                                }
                            }
                            if (!z2) {
                                e(view, 0);
                            }
                            a(g2);
                        }
                    }
                    z2 = false;
                    if ((a2 & 5) == 5) {
                    }
                    if (!z2) {
                    }
                    a(g2);
                }
            }
            z = false;
            if ((a2 & 80) == 80) {
            }
            if (!z) {
            }
            if ((a2 & 3) == 3) {
            }
            z2 = false;
            if ((a2 & 5) == 5) {
            }
            if (!z2) {
            }
            a(g2);
        }
    }

    public void a(View view) {
        List c2 = this.g.c(view);
        if (c2 != null && !c2.isEmpty()) {
            for (int i2 = 0; i2 < c2.size(); i2++) {
                View view2 = (View) c2.get(i2);
                Behavior d2 = ((d) view2.getLayoutParams()).d();
                if (d2 != null) {
                    d2.b(this, view2, view);
                }
            }
        }
    }

    public boolean a(View view, int i2, int i3) {
        Rect g2 = g();
        a(view, g2);
        try {
            return g2.contains(i2, i3);
        } finally {
            a(g2);
        }
    }

    public void a(View view, View view2, int i2, int i3) {
        this.x.a(view, view2, i2, i3);
        this.p = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i3)) {
                Behavior d2 = dVar.d();
                if (d2 != null) {
                    d2.a(this, childAt, view, view2, i2, i3);
                }
            }
        }
    }

    public void a(View view, int i2) {
        this.x.a(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i2)) {
                Behavior d2 = dVar.d();
                if (d2 != null) {
                    d2.a(this, childAt, view, i2);
                }
                dVar.b(i2);
                dVar.g();
            }
        }
        this.p = null;
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                int i8 = i6;
            } else {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i6)) {
                    Behavior d2 = dVar.d();
                    if (d2 != null) {
                        d2.a(this, childAt, view, i2, i3, i4, i5, i6);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            b(1);
        }
    }

    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i4;
            } else {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i4)) {
                    Behavior d2 = dVar.d();
                    if (d2 != null) {
                        int[] iArr2 = this.j;
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        d2.a(this, childAt, view, i2, i3, iArr2, i4);
                        if (i2 > 0) {
                            i5 = Math.max(i7, this.j[0]);
                        } else {
                            i5 = Math.min(i7, this.j[0]);
                        }
                        if (i3 > 0) {
                            i6 = Math.max(i8, this.j[1]);
                        } else {
                            i6 = Math.min(i8, this.j[1]);
                        }
                        i7 = i5;
                        i8 = i6;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z) {
            b(1);
        }
    }
}
