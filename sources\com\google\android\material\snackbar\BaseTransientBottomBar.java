package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.r;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler a = new Handler(Looper.getMainLooper(), new c());
    /* access modifiers changed from: private */
    public static final boolean b;
    private static final int[] c = {C1771uz.snackbarStyle};
    private final ViewGroup d;
    private final Context e;
    protected final e f;
    /* access modifiers changed from: private */
    public final n g;
    private int h;
    private List<a<B>> i;
    private Behavior j;
    private final AccessibilityManager k;
    final a l = new f(this);

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final b k = new b(this);

        /* access modifiers changed from: private */
        public void a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.k.a(baseTransientBottomBar);
        }

        public boolean a(View view) {
            return this.k.a(view);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.k.a(coordinatorLayout, view, motionEvent);
            return super.a(coordinatorLayout, view, motionEvent);
        }
    }

    public static abstract class a<B> {
        public void a(B b) {
        }

        public void a(B b, int i) {
        }
    }

    public static class b {
        private a a;

        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.b(0.1f);
            swipeDismissBehavior.a(0.6f);
            swipeDismissBehavior.a(0);
        }

        public void a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.l;
        }

        public boolean a(View view) {
            return view instanceof e;
        }

        public void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    q.a().f(this.a);
                }
            } else if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                q.a().e(this.a);
            }
        }
    }

    protected interface c {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    protected interface d {
        void a(View view, int i, int i2, int i3, int i4);
    }

    protected static class e extends FrameLayout {
        private final AccessibilityManager a;
        private final defpackage.Lc.a b;
        private d c;
        private c d;

        protected e(Context context) {
            this(context, null);
        }

        /* access modifiers changed from: private */
        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            c cVar = this.d;
            if (cVar != null) {
                cVar.onViewAttachedToWindow(this);
            }
            C1778vc.G(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            c cVar = this.d;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(this);
            }
            Lc.b(this.a, this.b);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            d dVar = this.c;
            if (dVar != null) {
                dVar.a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setOnAttachStateChangeListener(c cVar) {
            this.d = cVar;
        }

        /* access modifiers changed from: 0000 */
        public void setOnLayoutChangeListener(d dVar) {
            this.c = dVar;
        }

        protected e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dz.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(Dz.SnackbarLayout_elevation)) {
                C1778vc.a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(Dz.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            this.a = (AccessibilityManager) context.getSystemService("accessibility");
            this.b = new m(this);
            Lc.a(this.a, this.b);
            setClickableOrFocusableBasedOnAccessibility(this.a.isTouchExplorationEnabled());
        }
    }

    static {
        int i2 = VERSION.SDK_INT;
        b = i2 >= 16 && i2 <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, n nVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (nVar != null) {
            this.d = viewGroup;
            this.g = nVar;
            this.e = viewGroup.getContext();
            r.a(this.e);
            this.f = (e) LayoutInflater.from(this.e).inflate(g(), this.d, false);
            this.f.addView(view);
            C1778vc.e(this.f, 1);
            C1778vc.f(this.f, 1);
            C1778vc.a((View) this.f, true);
            C1778vc.a((View) this.f, (C1506mc) new d(this));
            C1778vc.a((View) this.f, (C0273Wb) new e(this));
            this.k = (AccessibilityManager) this.e.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    private int p() {
        int height = this.f.getHeight();
        LayoutParams layoutParams = this.f.getLayoutParams();
        return layoutParams instanceof MarginLayoutParams ? height + ((MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        int p = p();
        if (b) {
            C1778vc.d(this.f, p);
        } else {
            this.f.setTranslationY((float) p);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{p, 0});
        valueAnimator.setInterpolator(Ez.b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new k(this));
        valueAnimator.addUpdateListener(new l(this, p));
        valueAnimator.start();
    }

    public void c() {
        a(3);
    }

    public B d(int i2) {
        this.h = i2;
        return this;
    }

    public int e() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public SwipeDismissBehavior<? extends View> f() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    public int g() {
        return i() ? Az.mtrl_layout_snackbar : Az.design_layout_snackbar;
    }

    public View h() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public boolean i() {
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(c);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return q.a().a(this.l);
    }

    public boolean k() {
        return q.a().b(this.l);
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        q.a().d(this.l);
        List<a<B>> list = this.i;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((a) this.i.get(size)).a(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean m() {
        List enabledAccessibilityServiceList = this.k.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    public void n() {
        q.a().a(e(), this.l);
    }

    /* access modifiers changed from: 0000 */
    public final void o() {
        if (this.f.getParent() == null) {
            LayoutParams layoutParams = this.f.getLayoutParams();
            if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.d) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.d dVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) layoutParams;
                SwipeDismissBehavior swipeDismissBehavior = this.j;
                if (swipeDismissBehavior == null) {
                    swipeDismissBehavior = f();
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).a(this);
                }
                swipeDismissBehavior.a((com.google.android.material.behavior.SwipeDismissBehavior.a) new g(this));
                dVar.a((androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) swipeDismissBehavior);
                dVar.g = 80;
            }
            this.d.addView(this.f);
        }
        this.f.setOnAttachStateChangeListener(new i(this));
        if (!C1778vc.B(this.f)) {
            this.f.setOnLayoutChangeListener(new j(this));
        } else if (m()) {
            b();
        } else {
            l();
        }
    }

    private void e(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, p()});
        valueAnimator.setInterpolator(Ez.b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new a(this, i2));
        valueAnimator.addUpdateListener(new b(this));
        valueAnimator.start();
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2) {
        q.a().c(this.l);
        List<a<B>> list = this.i;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((a) this.i.get(size)).a(this, i2);
            }
        }
        ViewParent parent = this.f.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f);
        }
    }

    public Context d() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        q.a().a(this.l, i2);
    }

    public B a(a<B> aVar) {
        if (aVar == null) {
            return this;
        }
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(aVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2) {
        if (!m() || this.f.getVisibility() != 0) {
            c(i2);
        } else {
            e(i2);
        }
    }
}
