package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Vc reason: default package */
/* compiled from: ExploreByTouchHelper */
public abstract class Vc extends C0273Wb {
    private static final Rect d = new Rect(BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final defpackage.Wc.a<Mc> e = new Tc();
    private static final b<C0516ca<Mc>, Mc> f = new Uc();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private final AccessibilityManager k;
    private final View l;
    private a m;
    int n = Integer.MIN_VALUE;
    int o = Integer.MIN_VALUE;
    private int p = Integer.MIN_VALUE;

    /* renamed from: Vc$a */
    /* compiled from: ExploreByTouchHelper */
    private class a extends Nc {
        a() {
        }

        public Mc a(int i) {
            return Mc.a(Vc.this.b(i));
        }

        public Mc b(int i) {
            int i2 = i == 2 ? Vc.this.n : Vc.this.o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        public boolean a(int i, int i2, Bundle bundle) {
            return Vc.this.b(i, i2, bundle);
        }
    }

    public Vc(View view) {
        if (view != null) {
            this.l = view;
            this.k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C1778vc.j(view) == 0) {
                C1778vc.f(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean b(int i2, Rect rect) {
        Mc mc;
        Mc mc2;
        C0516ca d2 = d();
        int i3 = this.o;
        int i4 = Integer.MIN_VALUE;
        if (i3 == Integer.MIN_VALUE) {
            mc = null;
        } else {
            mc = (Mc) d2.b(i3);
        }
        Object obj = mc;
        if (i2 == 1 || i2 == 2) {
            mc2 = (Mc) Wc.a(d2, f, e, obj, i2, C1778vc.l(this.l) == 1, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i5 = this.o;
            if (i5 != Integer.MIN_VALUE) {
                a(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                a(this.l, i2, rect2);
            }
            mc2 = (Mc) Wc.a(d2, f, e, obj, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (mc2 != null) {
            i4 = d2.d(d2.a(mc2));
        }
        return c(i4);
    }

    private AccessibilityEvent c(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        Mc b = b(i2);
        obtain.getText().add(b.j());
        obtain.setContentDescription(b.f());
        obtain.setScrollable(b.u());
        obtain.setPassword(b.t());
        obtain.setEnabled(b.p());
        obtain.setChecked(b.n());
        a(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b.d());
            Oc.a(obtain, this.l, i2);
            obtain.setPackageName(this.l.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private C0516ca<Mc> d() {
        ArrayList arrayList = new ArrayList();
        a((List<Integer>) arrayList);
        C0516ca<Mc> caVar = new C0516ca<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            caVar.c(i2, f(i2));
        }
        return caVar;
    }

    private AccessibilityEvent e(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.l.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private Mc f(int i2) {
        Mc x = Mc.x();
        x.h(true);
        x.i(true);
        x.b((CharSequence) "android.view.View");
        x.c(d);
        x.d(d);
        x.c(this.l);
        a(i2, x);
        if (x.j() == null && x.f() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        x.a(this.h);
        if (!this.h.equals(d)) {
            int b = x.b();
            if ((b & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((b & 128) == 0) {
                x.f((CharSequence) this.l.getContext().getPackageName());
                x.c(this.l, i2);
                if (this.n == i2) {
                    x.a(true);
                    x.a(128);
                } else {
                    x.a(false);
                    x.a(64);
                }
                boolean z = this.o == i2;
                if (z) {
                    x.a(2);
                } else if (x.q()) {
                    x.a(1);
                }
                x.j(z);
                this.l.getLocationOnScreen(this.j);
                x.b(this.g);
                if (this.g.equals(d)) {
                    x.a(this.g);
                    if (x.c != -1) {
                        Mc x2 = Mc.x();
                        for (int i3 = x.c; i3 != -1; i3 = x2.c) {
                            x2.b(this.l, -1);
                            x2.c(d);
                            a(i3, x2);
                            x2.a(this.h);
                            Rect rect = this.g;
                            Rect rect2 = this.h;
                            rect.offset(rect2.left, rect2.top);
                        }
                        x2.y();
                    }
                    this.g.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
                }
                if (this.l.getLocalVisibleRect(this.i)) {
                    this.i.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
                    if (this.g.intersect(this.i)) {
                        x.d(this.g);
                        if (a(this.g)) {
                            x.q(true);
                        }
                    }
                }
                return x;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private static int g(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean h(int i2) {
        if (this.k.isEnabled() && this.k.isTouchExplorationEnabled()) {
            int i3 = this.n;
            if (i3 != i2) {
                if (i3 != Integer.MIN_VALUE) {
                    d(i3);
                }
                this.n = i2;
                this.l.invalidate();
                a(i2, 32768);
                return true;
            }
        }
        return false;
    }

    private void i(int i2) {
        int i3 = this.p;
        if (i3 != i2) {
            this.p = i2;
            a(i2, 128);
            a(i3, 256);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(float f2, float f3);

    public Nc a(View view) {
        if (this.m == null) {
            this.m = new a();
        }
        return this.m;
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2, Mc mc);

    /* access modifiers changed from: protected */
    public void a(int i2, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void a(Mc mc) {
    }

    /* access modifiers changed from: protected */
    public void a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(List<Integer> list);

    /* access modifiers changed from: protected */
    public abstract boolean a(int i2, int i3, Bundle bundle);

    public final boolean a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.k.isEnabled() && this.k.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int a2 = a(motionEvent.getX(), motionEvent.getY());
                i(a2);
                if (a2 != Integer.MIN_VALUE) {
                    z = true;
                }
            } else if (action != 10 || this.p == Integer.MIN_VALUE) {
                return false;
            } else {
                i(Integer.MIN_VALUE);
                return true;
            }
        }
        return z;
    }

    private boolean d(int i2) {
        if (this.n != i2) {
            return false;
        }
        this.n = Integer.MIN_VALUE;
        this.l.invalidate();
        a(i2, 65536);
        return true;
    }

    public final boolean a(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g2 = g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && b(g2, (Rect) null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            b();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return b(1, (Rect) null);
            }
            return false;
        }
    }

    private Mc c() {
        Mc b = Mc.b(this.l);
        C1778vc.a(this.l, b);
        ArrayList arrayList = new ArrayList();
        a((List<Integer>) arrayList);
        if (b.c() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b.a(this.l, ((Integer) arrayList.get(i2)).intValue());
            }
            return b;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private boolean b() {
        int i2 = this.o;
        return i2 != Integer.MIN_VALUE && a(i2, 16, (Bundle) null);
    }

    private AccessibilityEvent b(int i2, int i3) {
        if (i2 != -1) {
            return c(i2, i3);
        }
        return e(i3);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        a(accessibilityEvent);
    }

    /* access modifiers changed from: 0000 */
    public Mc b(int i2) {
        if (i2 == -1) {
            return c();
        }
        return f(i2);
    }

    public final void a(boolean z, int i2, Rect rect) {
        int i3 = this.o;
        if (i3 != Integer.MIN_VALUE) {
            a(i3);
        }
        if (z) {
            b(i2, rect);
        }
    }

    private boolean c(int i2, int i3, Bundle bundle) {
        if (i3 == 1) {
            return c(i2);
        }
        if (i3 == 2) {
            return a(i2);
        }
        if (i3 == 64) {
            return h(i2);
        }
        if (i3 != 128) {
            return a(i2, i3, bundle);
        }
        return d(i2);
    }

    /* access modifiers changed from: 0000 */
    public boolean b(int i2, int i3, Bundle bundle) {
        if (i2 != -1) {
            return c(i2, i3, bundle);
        }
        return a(i3, bundle);
    }

    private void a(int i2, Rect rect) {
        b(i2).a(rect);
    }

    private static Rect a(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    public final boolean c(int i2) {
        if (!this.l.isFocused() && !this.l.requestFocus()) {
            return false;
        }
        int i3 = this.o;
        if (i3 == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            a(i3);
        }
        this.o = i2;
        a(i2, true);
        a(i2, 8);
        return true;
    }

    public final boolean a(int i2, int i3) {
        if (i2 == Integer.MIN_VALUE || !this.k.isEnabled()) {
            return false;
        }
        ViewParent parent = this.l.getParent();
        if (parent == null) {
            return false;
        }
        return Bc.a(parent, this.l, b(i2, i3));
    }

    public void a(View view, Mc mc) {
        super.a(view, mc);
        a(mc);
    }

    private boolean a(int i2, Bundle bundle) {
        return C1778vc.a(this.l, i2, bundle);
    }

    private boolean a(Rect rect) {
        boolean z = false;
        if (rect != null && !rect.isEmpty()) {
            if (this.l.getWindowVisibility() != 0) {
                return false;
            }
            ViewParent parent = this.l.getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                    return false;
                }
                parent = view.getParent();
            }
            if (parent != null) {
                z = true;
            }
        }
        return z;
    }

    public final boolean a(int i2) {
        if (this.o != i2) {
            return false;
        }
        this.o = Integer.MIN_VALUE;
        a(i2, false);
        a(i2, 8);
        return true;
    }
}
