package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.l;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.s;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: androidx.recyclerview.widget.w reason: case insensitive filesystem */
/* compiled from: FastScroller */
class C0428w extends h implements l {
    private static final int[] a = {16842919};
    private static final int[] b = new int[0];
    private final int[] A = new int[2];
    final ValueAnimator B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    int C = 0;
    private final Runnable D = new C0426u(this);
    private final m E = new C0427v(this);
    private final int c;
    private final int d;
    final StateListDrawable e;
    final Drawable f;
    private final int g;
    private final int h;
    private final StateListDrawable i;
    private final Drawable j;
    private final int k;
    private final int l;
    int m;
    int n;
    float o;
    int p;
    int q;
    float r;
    private int s = 0;
    private int t = 0;
    private RecyclerView u;
    private boolean v = false;
    private boolean w = false;
    private int x = 0;
    private int y = 0;
    private final int[] z = new int[2];

    /* renamed from: androidx.recyclerview.widget.w$a */
    /* compiled from: FastScroller */
    private class a extends AnimatorListenerAdapter {
        private boolean a = false;

        a() {
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
                return;
            }
            if (((Float) C0428w.this.B.getAnimatedValue()).floatValue() == 0.0f) {
                C0428w wVar = C0428w.this;
                wVar.C = 0;
                wVar.b(0);
            } else {
                C0428w wVar2 = C0428w.this;
                wVar2.C = 2;
                wVar2.a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.w$b */
    /* compiled from: FastScroller */
    private class b implements AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0428w.this.e.setAlpha(floatValue);
            C0428w.this.f.setAlpha(floatValue);
            C0428w.this.a();
        }
    }

    C0428w(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        this.e = stateListDrawable;
        this.f = drawable;
        this.i = stateListDrawable2;
        this.j = drawable2;
        this.g = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.h = Math.max(i2, drawable.getIntrinsicWidth());
        this.k = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.l = Math.max(i2, drawable2.getIntrinsicWidth());
        this.c = i3;
        this.d = i4;
        this.e.setAlpha(255);
        this.f.setAlpha(255);
        this.B.addListener(new a());
        this.B.addUpdateListener(new b());
        a(recyclerView);
    }

    private void c() {
        this.u.removeCallbacks(this.D);
    }

    private void d() {
        this.u.b((h) this);
        this.u.b((l) this);
        this.u.b(this.E);
        c();
    }

    private int[] e() {
        int[] iArr = this.A;
        int i2 = this.d;
        iArr[0] = i2;
        iArr[1] = this.s - i2;
        return iArr;
    }

    private int[] f() {
        int[] iArr = this.z;
        int i2 = this.d;
        iArr[0] = i2;
        iArr[1] = this.t - i2;
        return iArr;
    }

    private boolean g() {
        return C1778vc.l(this.u) == 1;
    }

    private void h() {
        this.u.a((h) this);
        this.u.a((l) this);
        this.u.a(this.E);
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                d();
            }
            this.u = recyclerView;
            if (this.u != null) {
                h();
            }
        }
    }

    public void a(boolean z2) {
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2) {
        if (i2 == 2 && this.x != 2) {
            this.e.setState(a);
            c();
        }
        if (i2 == 0) {
            a();
        } else {
            b();
        }
        if (this.x == 2 && i2 != 2) {
            this.e.setState(b);
            c(1200);
        } else if (i2 == 1) {
            c(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.x = i2;
    }

    private void c(int i2) {
        c();
        this.u.postDelayed(this.D, (long) i2);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.u.invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        int i3 = this.C;
        if (i3 == 1) {
            this.B.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.C = 3;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.B.setDuration((long) i2);
        this.B.start();
    }

    public void b() {
        int i2 = this.C;
        if (i2 != 0) {
            if (i2 == 3) {
                this.B.cancel();
            } else {
                return;
            }
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.B.setDuration(500);
        this.B.setStartDelay(0);
        this.B.start();
    }

    private void a(Canvas canvas) {
        int i2 = this.t;
        int i3 = this.k;
        int i4 = i2 - i3;
        int i5 = this.q;
        int i6 = this.p;
        int i7 = i5 - (i6 / 2);
        this.i.setBounds(0, 0, i6, i3);
        this.j.setBounds(0, 0, this.s, this.l);
        canvas.translate(0.0f, (float) i4);
        this.j.draw(canvas);
        canvas.translate((float) i7, 0.0f);
        this.i.draw(canvas);
        canvas.translate((float) (-i7), (float) (-i4));
    }

    public void b(Canvas canvas, RecyclerView recyclerView, s sVar) {
        if (this.s == this.u.getWidth() && this.t == this.u.getHeight()) {
            if (this.C != 0) {
                if (this.v) {
                    b(canvas);
                }
                if (this.w) {
                    a(canvas);
                }
            }
            return;
        }
        this.s = this.u.getWidth();
        this.t = this.u.getHeight();
        b(0);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3) {
        int computeVerticalScrollRange = this.u.computeVerticalScrollRange();
        int i4 = this.t;
        this.v = computeVerticalScrollRange - i4 > 0 && i4 >= this.c;
        int computeHorizontalScrollRange = this.u.computeHorizontalScrollRange();
        int i5 = this.s;
        this.w = computeHorizontalScrollRange - i5 > 0 && i5 >= this.c;
        if (this.v || this.w) {
            if (this.v) {
                float f2 = (float) i4;
                this.n = (int) ((f2 * (((float) i3) + (f2 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.m = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (this.w) {
                float f3 = (float) i5;
                this.q = (int) ((f3 * (((float) i2) + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.p = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = this.x;
            if (i6 == 0 || i6 == 1) {
                b(1);
            }
            return;
        }
        if (this.x != 0) {
            b(0);
        }
    }

    private void b(Canvas canvas) {
        int i2 = this.s;
        int i3 = this.g;
        int i4 = i2 - i3;
        int i5 = this.n;
        int i6 = this.m;
        int i7 = i5 - (i6 / 2);
        this.e.setBounds(0, 0, i3, i6);
        this.f.setBounds(0, 0, this.h, this.t);
        if (g()) {
            this.f.draw(canvas);
            canvas.translate((float) this.g, (float) i7);
            canvas.scale(-1.0f, 1.0f);
            this.e.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.g), (float) (-i7));
            return;
        }
        canvas.translate((float) i4, 0.0f);
        this.f.draw(canvas);
        canvas.translate(0.0f, (float) i7);
        this.e.draw(canvas);
        canvas.translate((float) (-i4), (float) (-i7));
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b2 = b(motionEvent.getX(), motionEvent.getY());
                boolean a2 = a(motionEvent.getX(), motionEvent.getY());
                if (b2 || a2) {
                    if (a2) {
                        this.y = 1;
                        this.r = (float) ((int) motionEvent.getX());
                    } else if (b2) {
                        this.y = 2;
                        this.o = (float) ((int) motionEvent.getY());
                    }
                    b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.x == 2) {
                this.o = 0.0f;
                this.r = 0.0f;
                b(1);
                this.y = 0;
            } else if (motionEvent.getAction() == 2 && this.x == 2) {
                b();
                if (this.y == 1) {
                    a(motionEvent.getX());
                }
                if (this.y == 2) {
                    b(motionEvent.getY());
                }
            }
        }
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.x;
        if (i2 == 1) {
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b2 && !a2) {
                return false;
            }
            if (a2) {
                this.y = 1;
                this.r = (float) ((int) motionEvent.getX());
            } else if (b2) {
                this.y = 2;
                this.o = (float) ((int) motionEvent.getY());
            }
            b(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    private void b(float f2) {
        int[] f3 = f();
        float max = Math.max((float) f3[0], Math.min((float) f3[1], f2));
        if (Math.abs(((float) this.n) - max) >= 2.0f) {
            int a2 = a(this.o, max, f3, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
            if (a2 != 0) {
                this.u.scrollBy(0, a2);
            }
            this.o = max;
        }
    }

    private void a(float f2) {
        int[] e2 = e();
        float max = Math.max((float) e2[0], Math.min((float) e2[1], f2));
        if (Math.abs(((float) this.q) - max) >= 2.0f) {
            int a2 = a(this.r, max, e2, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
            if (a2 != 0) {
                this.u.scrollBy(a2, 0);
            }
            this.r = max;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b(float f2, float f3) {
        if (!g() ? f2 >= ((float) (this.s - this.g)) : f2 <= ((float) (this.g / 2))) {
            int i2 = this.n;
            int i3 = this.m;
            if (f3 >= ((float) (i2 - (i3 / 2))) && f3 <= ((float) (i2 + (i3 / 2)))) {
                return true;
            }
        }
        return false;
    }

    private int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(float f2, float f3) {
        if (f3 >= ((float) (this.t - this.k))) {
            int i2 = this.q;
            int i3 = this.p;
            if (f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) (i2 + (i3 / 2)))) {
                return true;
            }
        }
        return false;
    }
}
