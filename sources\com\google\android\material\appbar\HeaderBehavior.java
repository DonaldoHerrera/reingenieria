package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private Runnable d;
    OverScroller e;
    private boolean f;
    private int g = -1;
    private int h;
    private int i = -1;
    private VelocityTracker j;

    private class a implements Runnable {
        private final CoordinatorLayout a;
        private final V b;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        public void run() {
            if (this.b != null) {
                OverScroller overScroller = HeaderBehavior.this.e;
                if (overScroller == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.c(this.a, this.b, headerBehavior.e.getCurrY());
                    C1778vc.a((View) this.b, (Runnable) this);
                    return;
                }
                HeaderBehavior.this.e(this.a, this.b);
            }
        }
    }

    public HeaderBehavior() {
    }

    private void d() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(V v) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.g;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex != -1) {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.h) > this.i) {
                                this.f = true;
                                this.h = y;
                            }
                        }
                    }
                }
            }
            this.f = false;
            this.g = -1;
            VelocityTracker velocityTracker = this.j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.j = null;
            }
        } else {
            this.f = false;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (a(v) && coordinatorLayout.a((View) v, x, y2)) {
                this.h = y2;
                this.g = motionEvent.getPointerId(0);
                d();
            }
        }
        VelocityTracker velocityTracker2 = this.j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.j;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.j.computeCurrentVelocity(1000);
                    a(coordinatorLayout, v, -c(v), 0, this.j.getYVelocity(this.g));
                }
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.g);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                int i2 = this.h - y;
                if (!this.f) {
                    int abs = Math.abs(i2);
                    int i3 = this.i;
                    if (abs > i3) {
                        this.f = true;
                        i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                    }
                }
                int i4 = i2;
                if (this.f) {
                    this.h = y;
                    a(coordinatorLayout, v, i4, b(v), 0);
                }
            }
            this.f = false;
            this.g = -1;
            VelocityTracker velocityTracker2 = this.j;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.j = null;
            }
        } else {
            int y2 = (int) motionEvent.getY();
            if (!coordinatorLayout.a((View) v, (int) motionEvent.getX(), y2) || !a(v)) {
                return false;
            }
            this.h = y2;
            this.g = motionEvent.getPointerId(0);
            d();
        }
        VelocityTracker velocityTracker3 = this.j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public int c(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return b(coordinatorLayout, v, i2, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* access modifiers changed from: 0000 */
    public void e(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return b();
    }

    /* access modifiers changed from: 0000 */
    public int c(V v) {
        return v.getHeight();
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    public final int a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return b(coordinatorLayout, v, c() - i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        V v2 = v;
        Runnable runnable = this.d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v.getContext());
        }
        this.e.fling(0, b(), 0, Math.round(f2), 0, 0, i2, i3);
        if (this.e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.d = new a(coordinatorLayout, v);
            C1778vc.a((View) v, this.d);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        e(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: 0000 */
    public int b(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        int b = b();
        if (i3 != 0 && b >= i3 && b <= i4) {
            int a2 = C1598pb.a(i2, i3, i4);
            if (b != a2) {
                a(a2);
                return b - a2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int b(V v) {
        return -v.getHeight();
    }
}
