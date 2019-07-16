package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.j;
import androidx.recyclerview.widget.RecyclerView.l;
import androidx.recyclerview.widget.RecyclerView.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ItemTouchHelper */
public class G extends h implements j {
    private b A;
    private final l B = new A(this);
    private Rect C;
    private long D;
    final List<View> a = new ArrayList();
    private final float[] b = new float[2];
    ViewHolder c = null;
    float d;
    float e;
    private float f;
    private float g;
    float h;
    float i;
    private float j;
    private float k;
    int l = -1;
    a m;
    private int n = 0;
    int o;
    List<c> p = new ArrayList();
    private int q;
    RecyclerView r;
    final Runnable s = new C0431z(this);
    VelocityTracker t;
    private List<ViewHolder> u;
    private List<Integer> v;
    private androidx.recyclerview.widget.RecyclerView.d w = null;
    View x = null;
    int y = -1;
    C0283Yb z;

    /* compiled from: ItemTouchHelper */
    public static abstract class a {
        private static final Interpolator a = new E();
        private static final Interpolator b = new F();
        private int c = -1;

        public static int b(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static int c(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int d(int i, int i2) {
            return c(2, i) | c(1, i2) | c(0, i2 | i);
        }

        public float a(float f) {
            return f;
        }

        public float a(ViewHolder viewHolder) {
            return 0.5f;
        }

        public int a() {
            return 0;
        }

        public int a(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
        public ViewHolder a(ViewHolder viewHolder, List<ViewHolder> list, int i, int i2) {
            int i3;
            ViewHolder viewHolder2 = viewHolder;
            int width = i + viewHolder2.itemView.getWidth();
            int height = i2 + viewHolder2.itemView.getHeight();
            int left = i - viewHolder2.itemView.getLeft();
            int top = i2 - viewHolder2.itemView.getTop();
            int size = list.size();
            ViewHolder viewHolder3 = null;
            int i4 = -1;
            for (int i5 = 0; i5 < size; i5++) {
                ViewHolder viewHolder4 = (ViewHolder) list.get(i5);
                if (left > 0) {
                    int right = viewHolder4.itemView.getRight() - width;
                    if (right < 0 && viewHolder4.itemView.getRight() > viewHolder2.itemView.getRight()) {
                        i3 = Math.abs(right);
                        if (i3 > i4) {
                            viewHolder3 = viewHolder4;
                            if (left < 0) {
                                int left2 = viewHolder4.itemView.getLeft() - i;
                                if (left2 > 0 && viewHolder4.itemView.getLeft() < viewHolder2.itemView.getLeft()) {
                                    int abs = Math.abs(left2);
                                    if (abs > i3) {
                                        i3 = abs;
                                        viewHolder3 = viewHolder4;
                                    }
                                }
                            }
                            if (top < 0) {
                                int top2 = viewHolder4.itemView.getTop() - i2;
                                if (top2 > 0 && viewHolder4.itemView.getTop() < viewHolder2.itemView.getTop()) {
                                    int abs2 = Math.abs(top2);
                                    if (abs2 > i3) {
                                        i3 = abs2;
                                        viewHolder3 = viewHolder4;
                                    }
                                }
                            }
                            if (top > 0) {
                                int bottom = viewHolder4.itemView.getBottom() - height;
                                if (bottom < 0 && viewHolder4.itemView.getBottom() > viewHolder2.itemView.getBottom()) {
                                    i4 = Math.abs(bottom);
                                    if (i4 > i3) {
                                        viewHolder3 = viewHolder4;
                                    }
                                }
                            }
                            i4 = i3;
                        }
                    }
                }
                i3 = i4;
                if (left < 0) {
                }
                if (top < 0) {
                }
                if (top > 0) {
                }
                i4 = i3;
            }
            return viewHolder3;
        }

        public boolean a(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2) {
            return true;
        }

        public float b(float f) {
            return f;
        }

        public float b(ViewHolder viewHolder) {
            return 0.5f;
        }

        /* access modifiers changed from: 0000 */
        public final int b(RecyclerView recyclerView, ViewHolder viewHolder) {
            return a(c(recyclerView, viewHolder), C1778vc.l(recyclerView));
        }

        public abstract void b(ViewHolder viewHolder, int i);

        public boolean b() {
            return true;
        }

        public abstract boolean b(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2);

        public abstract int c(RecyclerView recyclerView, ViewHolder viewHolder);

        public abstract boolean c();

        /* access modifiers changed from: 0000 */
        public void b(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, List<c> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<c> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = (c) list2.get(i2);
                int save = canvas.save();
                b(canvas, recyclerView, cVar.e, cVar.j, cVar.k, cVar.f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                b(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                c cVar2 = (c) list2.get(i3);
                if (cVar2.m && !cVar2.i) {
                    list2.remove(i3);
                } else if (!cVar2.m) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean d(RecyclerView recyclerView, ViewHolder viewHolder) {
            return (b(recyclerView, viewHolder) & 16711680) != 0;
        }

        public void b(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            J.a.b(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void a(ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                J.a.b(viewHolder.itemView);
            }
        }

        private int a(RecyclerView recyclerView) {
            if (this.c == -1) {
                this.c = recyclerView.getResources().getDimensionPixelSize(Hd.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.c;
        }

        public void a(RecyclerView recyclerView, ViewHolder viewHolder, int i, ViewHolder viewHolder2, int i2, int i3, int i4) {
            i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof e) {
                ((e) layoutManager).a(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.a()) {
                if (layoutManager.f(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.i(i2);
                }
                if (layoutManager.i(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.i(i2);
                }
            }
            if (layoutManager.b()) {
                if (layoutManager.j(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.i(i2);
                }
                if (layoutManager.e(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.i(i2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, List<c> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = (c) list.get(i2);
                cVar.c();
                int save = canvas.save();
                a(canvas, recyclerView, cVar.e, cVar.j, cVar.k, cVar.f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                a(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void a(RecyclerView recyclerView, ViewHolder viewHolder) {
            J.a.a(viewHolder.itemView);
        }

        public void a(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            J.a.a(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public long a(RecyclerView recyclerView, int i, float f, float f2) {
            long j;
            f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200 : 250;
            }
            if (i == 8) {
                j = itemAnimator.e();
            } else {
                j = itemAnimator.f();
            }
            return j;
        }

        public int a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * a(recyclerView))) * b.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * a.getInterpolation(f));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }
    }

    /* compiled from: ItemTouchHelper */
    private class b extends SimpleOnGestureListener {
        private boolean a = true;

        b() {
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.a = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.a) {
                View b2 = G.this.b(motionEvent);
                if (b2 != null) {
                    ViewHolder h = G.this.r.h(b2);
                    if (h != null) {
                        G g = G.this;
                        if (g.m.d(g.r, h)) {
                            int pointerId = motionEvent.getPointerId(0);
                            int i = G.this.l;
                            if (pointerId == i) {
                                int findPointerIndex = motionEvent.findPointerIndex(i);
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                G g2 = G.this;
                                g2.d = x;
                                g2.e = y;
                                g2.i = 0.0f;
                                g2.h = 0.0f;
                                if (g2.m.c()) {
                                    G.this.a(h, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    private static class c implements AnimatorListener {
        final float a;
        final float b;
        final float c;
        final float d;
        final ViewHolder e;
        final int f;
        private final ValueAnimator g;
        final int h;
        boolean i;
        float j;
        float k;
        boolean l = false;
        boolean m = false;
        private float n;

        c(ViewHolder viewHolder, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f = i3;
            this.h = i2;
            this.e = viewHolder;
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.d = f5;
            this.g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.g.addUpdateListener(new H(this));
            this.g.setTarget(viewHolder.itemView);
            this.g.addListener(this);
            a(0.0f);
        }

        public void a(long j2) {
            this.g.setDuration(j2);
        }

        public void b() {
            this.e.setIsRecyclable(false);
            this.g.start();
        }

        public void c() {
            float f2 = this.a;
            float f3 = this.c;
            if (f2 == f3) {
                this.j = this.e.itemView.getTranslationX();
            } else {
                this.j = f2 + (this.n * (f3 - f2));
            }
            float f4 = this.b;
            float f5 = this.d;
            if (f4 == f5) {
                this.k = this.e.itemView.getTranslationY();
            } else {
                this.k = f4 + (this.n * (f5 - f4));
            }
        }

        public void onAnimationCancel(Animator animator) {
            a(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.m) {
                this.e.setIsRecyclable(true);
            }
            this.m = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void a() {
            this.g.cancel();
        }

        public void a(float f2) {
            this.n = f2;
        }
    }

    /* compiled from: ItemTouchHelper */
    public static abstract class d extends a {
        private int d;
        private int e;

        public d(int i, int i2) {
            this.d = i2;
            this.e = i;
        }

        public int c(RecyclerView recyclerView, ViewHolder viewHolder) {
            return a.d(e(recyclerView, viewHolder), f(recyclerView, viewHolder));
        }

        public int e(RecyclerView recyclerView, ViewHolder viewHolder) {
            return this.e;
        }

        public int f(RecyclerView recyclerView, ViewHolder viewHolder) {
            return this.d;
        }
    }

    /* compiled from: ItemTouchHelper */
    public interface e {
        void a(View view, View view2, int i, int i2);
    }

    public G(a aVar) {
        this.m = aVar;
    }

    private static boolean a(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    private int d(ViewHolder viewHolder) {
        if (this.n == 2) {
            return 0;
        }
        int c2 = this.m.c(this.r, viewHolder);
        int a2 = (this.m.a(c2, C1778vc.l(this.r)) & 65280) >> 8;
        if (a2 == 0) {
            return 0;
        }
        int i2 = (c2 & 65280) >> 8;
        if (Math.abs(this.h) > Math.abs(this.i)) {
            int b2 = b(viewHolder, a2);
            if (b2 > 0) {
                return (i2 & b2) == 0 ? a.b(b2, C1778vc.l(this.r)) : b2;
            }
            int c3 = c(viewHolder, a2);
            if (c3 > 0) {
                return c3;
            }
        } else {
            int c4 = c(viewHolder, a2);
            if (c4 > 0) {
                return c4;
            }
            int b3 = b(viewHolder, a2);
            if (b3 > 0) {
                if ((i2 & b3) == 0) {
                    b3 = a.b(b3, C1778vc.l(this.r));
                }
                return b3;
            }
        }
        return 0;
    }

    private void e() {
        this.r.b((h) this);
        this.r.b(this.B);
        this.r.b((j) this);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            this.m.a(this.r, ((c) this.p.get(0)).e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        f();
        i();
    }

    private void f() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private void g() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.a((h) this);
        this.r.a(this.B);
        this.r.a((j) this);
        h();
    }

    private void h() {
        this.A = new b();
        this.z = new C0283Yb(this.r.getContext(), this.A);
    }

    private void i() {
        b bVar = this.A;
        if (bVar != null) {
            bVar.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    public void b(Canvas canvas, RecyclerView recyclerView, s sVar) {
        float f2;
        float f3;
        if (this.c != null) {
            a(this.b);
            float[] fArr = this.b;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.m.b(canvas, recyclerView, this.c, this.p, this.n, f3, f2);
    }

    public void b(View view) {
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if (r1 > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    public boolean c() {
        int i2;
        int i3;
        int i4;
        if (this.c == null) {
            this.D = Long.MIN_VALUE;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.D;
        long j3 = j2 == Long.MIN_VALUE ? 0 : currentTimeMillis - j2;
        i layoutManager = this.r.getLayoutManager();
        if (this.C == null) {
            this.C = new Rect();
        }
        layoutManager.a(this.c.itemView, this.C);
        if (layoutManager.a()) {
            int i5 = (int) (this.j + this.h);
            int paddingLeft = (i5 - this.C.left) - this.r.getPaddingLeft();
            if (this.h < 0.0f && paddingLeft < 0) {
                i2 = paddingLeft;
                if (layoutManager.b()) {
                }
                i3 = 0;
                if (i2 != 0) {
                }
                int i6 = i2;
                if (i3 == 0) {
                }
                if (i4 == 0) {
                }
                if (this.D == Long.MIN_VALUE) {
                }
                this.r.scrollBy(i4, i3);
                return true;
            } else if (this.h > 0.0f) {
                int width = ((i5 + this.c.itemView.getWidth()) + this.C.right) - (this.r.getWidth() - this.r.getPaddingRight());
                if (width > 0) {
                    i2 = width;
                    if (layoutManager.b()) {
                        int i7 = (int) (this.k + this.i);
                        int paddingTop = (i7 - this.C.top) - this.r.getPaddingTop();
                        if (this.i < 0.0f && paddingTop < 0) {
                            i3 = paddingTop;
                            if (i2 != 0) {
                                i2 = this.m.a(this.r, this.c.itemView.getWidth(), i2, this.r.getWidth(), j3);
                            }
                            int i62 = i2;
                            if (i3 == 0) {
                                int i8 = i3;
                                int i9 = i62;
                                int a2 = this.m.a(this.r, this.c.itemView.getHeight(), i8, this.r.getHeight(), j3);
                                i4 = i9;
                                i3 = a2;
                            } else {
                                i4 = i62;
                            }
                            if (i4 == 0 || i3 != 0) {
                                if (this.D == Long.MIN_VALUE) {
                                    this.D = currentTimeMillis;
                                }
                                this.r.scrollBy(i4, i3);
                                return true;
                            }
                            this.D = Long.MIN_VALUE;
                            return false;
                        } else if (this.i > 0.0f) {
                            i3 = ((i7 + this.c.itemView.getHeight()) + this.C.bottom) - (this.r.getHeight() - this.r.getPaddingBottom());
                        }
                    }
                    i3 = 0;
                    if (i2 != 0) {
                    }
                    int i622 = i2;
                    if (i3 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (this.D == Long.MIN_VALUE) {
                    }
                    this.r.scrollBy(i4, i3);
                    return true;
                }
            }
        }
        i2 = 0;
        if (layoutManager.b()) {
        }
        i3 = 0;
        if (i2 != 0) {
        }
        int i6222 = i2;
        if (i3 == 0) {
        }
        if (i4 == 0) {
        }
        if (this.D == Long.MIN_VALUE) {
        }
        this.r.scrollBy(i4, i3);
        return true;
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                e();
            }
            this.r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f = resources.getDimension(Hd.item_touch_helper_swipe_escape_velocity);
                this.g = resources.getDimension(Hd.item_touch_helper_swipe_escape_max_velocity);
                g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    /* access modifiers changed from: 0000 */
    public View b(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        ViewHolder viewHolder = this.c;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (a(view, x2, y2, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            c cVar = (c) this.p.get(size);
            View view2 = cVar.e.itemView;
            if (a(view2, x2, y2, cVar.j, cVar.k)) {
                return view2;
            }
        }
        return this.r.a(x2, y2);
    }

    private void a(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - ((float) this.c.itemView.getLeft());
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - ((float) this.c.itemView.getTop());
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    private void d() {
        if (VERSION.SDK_INT < 21) {
            if (this.w == null) {
                this.w = new D(this);
            }
            this.r.setChildDrawingOrderCallback(this.w);
        }
    }

    public void a(Canvas canvas, RecyclerView recyclerView, s sVar) {
        float f2;
        float f3;
        this.y = -1;
        if (this.c != null) {
            a(this.b);
            float[] fArr = this.b;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.m.a(canvas, recyclerView, this.c, this.p, this.n, f3, f2);
    }

    public void b(ViewHolder viewHolder) {
        String str = "ItemTouchHelper";
        if (!this.m.d(this.r, viewHolder)) {
            Log.e(str, "Start drag has been called but dragging is not enabled");
        } else if (viewHolder.itemView.getParent() != this.r) {
            Log.e(str, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            b();
            this.i = 0.0f;
            this.h = 0.0f;
            a(viewHolder, 2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137  */
    public void a(ViewHolder viewHolder, int i2) {
        boolean z2;
        boolean z3;
        ViewParent parent;
        int i3;
        float f2;
        float f3;
        ViewHolder viewHolder2 = viewHolder;
        int i4 = i2;
        if (viewHolder2 != this.c || i4 != this.n) {
            this.D = Long.MIN_VALUE;
            int i5 = this.n;
            a(viewHolder2, true);
            this.n = i4;
            if (i4 == 2) {
                if (viewHolder2 != null) {
                    this.x = viewHolder2.itemView;
                    d();
                } else {
                    throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
                }
            }
            int i6 = (1 << ((i4 * 8) + 8)) - 1;
            ViewHolder viewHolder3 = this.c;
            if (viewHolder3 != null) {
                if (viewHolder3.itemView.getParent() != null) {
                    if (i5 == 2) {
                        i3 = 0;
                    } else {
                        i3 = d(viewHolder3);
                    }
                    f();
                    if (i3 == 1 || i3 == 2) {
                        f2 = Math.signum(this.i) * ((float) this.r.getHeight());
                        f3 = 0.0f;
                    } else {
                        if (i3 == 4 || i3 == 8 || i3 == 16 || i3 == 32) {
                            f3 = Math.signum(this.h) * ((float) this.r.getWidth());
                        } else {
                            f3 = 0.0f;
                        }
                        f2 = 0.0f;
                    }
                    int i7 = i5 == 2 ? 8 : i3 > 0 ? 2 : 4;
                    a(this.b);
                    float[] fArr = this.b;
                    float f4 = fArr[0];
                    float f5 = fArr[1];
                    B b2 = r0;
                    int i8 = i7;
                    B b3 = new B(this, viewHolder3, i7, i5, f4, f5, f3, f2, i3, viewHolder3);
                    b2.a(this.m.a(this.r, i8, f3 - f4, f2 - f5));
                    this.p.add(b2);
                    b2.b();
                    z2 = true;
                } else {
                    ViewHolder viewHolder4 = viewHolder3;
                    c(viewHolder4.itemView);
                    this.m.a(this.r, viewHolder4);
                    z2 = false;
                }
                this.c = null;
            } else {
                z2 = false;
            }
            if (viewHolder2 != null) {
                this.o = (this.m.b(this.r, viewHolder2) & i6) >> (this.n * 8);
                this.j = (float) viewHolder2.itemView.getLeft();
                this.k = (float) viewHolder2.itemView.getTop();
                this.c = viewHolder2;
                if (i4 == 2) {
                    z3 = false;
                    this.c.itemView.performHapticFeedback(0);
                    parent = this.r.getParent();
                    if (parent != null) {
                        if (this.c != null) {
                            z3 = true;
                        }
                        parent.requestDisallowInterceptTouchEvent(z3);
                    }
                    if (!z2) {
                        this.r.getLayoutManager().A();
                    }
                    this.m.a(this.c, this.n);
                    this.r.invalidate();
                }
            }
            z3 = false;
            parent = this.r.getParent();
            if (parent != null) {
            }
            if (!z2) {
            }
            this.m.a(this.c, this.n);
            this.r.invalidate();
        }
    }

    private int b(ViewHolder viewHolder, int i2) {
        if ((i2 & 12) != 0) {
            int i3 = 8;
            int i4 = this.h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.m.b(this.g));
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i2) != 0 && i4 == i3 && abs >= this.m.a(this.f) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = ((float) this.r.getWidth()) * this.m.b(viewHolder);
            if ((i2 & i4) != 0 && Math.abs(this.h) > width) {
                return i4;
            }
        }
        return 0;
    }

    private List<ViewHolder> c(ViewHolder viewHolder) {
        ViewHolder viewHolder2 = viewHolder;
        List<ViewHolder> list = this.u;
        if (list == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        } else {
            list.clear();
            this.v.clear();
        }
        int a2 = this.m.a();
        int round = Math.round(this.j + this.h) - a2;
        int round2 = Math.round(this.k + this.i) - a2;
        int i2 = a2 * 2;
        int width = viewHolder2.itemView.getWidth() + round + i2;
        int height = viewHolder2.itemView.getHeight() + round2 + i2;
        int i3 = (round + width) / 2;
        int i4 = (round2 + height) / 2;
        i layoutManager = this.r.getLayoutManager();
        int e2 = layoutManager.e();
        int i5 = 0;
        while (i5 < e2) {
            View d2 = layoutManager.d(i5);
            if (d2 != viewHolder2.itemView && d2.getBottom() >= round2 && d2.getTop() <= height && d2.getRight() >= round && d2.getLeft() <= width) {
                ViewHolder h2 = this.r.h(d2);
                if (this.m.a(this.r, this.c, h2)) {
                    int abs = Math.abs(i3 - ((d2.getLeft() + d2.getRight()) / 2));
                    int abs2 = Math.abs(i4 - ((d2.getTop() + d2.getBottom()) / 2));
                    int i6 = (abs * abs) + (abs2 * abs2);
                    int size = this.u.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size && i6 > ((Integer) this.v.get(i7)).intValue()) {
                        i8++;
                        i7++;
                        ViewHolder viewHolder3 = viewHolder;
                    }
                    this.u.add(i8, h2);
                    this.v.add(i8, Integer.valueOf(i6));
                }
            }
            i5++;
            viewHolder2 = viewHolder;
        }
        return this.u;
    }

    /* access modifiers changed from: 0000 */
    public void a(c cVar, int i2) {
        this.r.post(new C(this, cVar, i2));
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((c) this.p.get(i2)).m) {
                return true;
            }
        }
        return false;
    }

    private ViewHolder c(MotionEvent motionEvent) {
        i layoutManager = this.r.getLayoutManager();
        int i2 = this.l;
        if (i2 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        float x2 = motionEvent.getX(findPointerIndex) - this.d;
        float y2 = motionEvent.getY(findPointerIndex) - this.e;
        float abs = Math.abs(x2);
        float abs2 = Math.abs(y2);
        int i3 = this.q;
        if (abs < ((float) i3) && abs2 < ((float) i3)) {
            return null;
        }
        if (abs > abs2 && layoutManager.a()) {
            return null;
        }
        if (abs2 > abs && layoutManager.b()) {
            return null;
        }
        View b2 = b(motionEvent);
        if (b2 == null) {
            return null;
        }
        return this.r.h(b2);
    }

    /* access modifiers changed from: 0000 */
    public void a(ViewHolder viewHolder) {
        if (!this.r.isLayoutRequested() && this.n == 2) {
            float a2 = this.m.a(viewHolder);
            int i2 = (int) (this.j + this.h);
            int i3 = (int) (this.k + this.i);
            if (((float) Math.abs(i3 - viewHolder.itemView.getTop())) >= ((float) viewHolder.itemView.getHeight()) * a2 || ((float) Math.abs(i2 - viewHolder.itemView.getLeft())) >= ((float) viewHolder.itemView.getWidth()) * a2) {
                List c2 = c(viewHolder);
                if (c2.size() != 0) {
                    ViewHolder a3 = this.m.a(viewHolder, c2, i2, i3);
                    if (a3 == null) {
                        this.u.clear();
                        this.v.clear();
                        return;
                    }
                    int adapterPosition = a3.getAdapterPosition();
                    int adapterPosition2 = viewHolder.getAdapterPosition();
                    if (this.m.b(this.r, viewHolder, a3)) {
                        this.m.a(this.r, viewHolder, adapterPosition2, a3, adapterPosition, i2, i3);
                    }
                }
            }
        }
    }

    private int c(ViewHolder viewHolder, int i2) {
        if ((i2 & 3) != 0) {
            int i3 = 2;
            int i4 = this.i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.m.b(this.g));
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i2) != 0 && i3 == i4 && abs >= this.m.a(this.f) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = ((float) this.r.getHeight()) * this.m.b(viewHolder);
            if ((i2 & i4) != 0 && Math.abs(this.i) > height) {
                return i4;
            }
        }
        return 0;
    }

    public void a(View view) {
        c(view);
        ViewHolder h2 = this.r.h(view);
        if (h2 != null) {
            ViewHolder viewHolder = this.c;
            if (viewHolder == null || h2 != viewHolder) {
                a(h2, false);
                if (this.a.remove(h2.itemView)) {
                    this.m.a(this.r, h2);
                }
            } else {
                a((ViewHolder) null, 0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ViewHolder viewHolder, boolean z2) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            c cVar = (c) this.p.get(size);
            if (cVar.e == viewHolder) {
                cVar.l |= z2;
                if (!cVar.m) {
                    cVar.a();
                }
                this.p.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        rect.setEmpty();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, MotionEvent motionEvent, int i3) {
        if (this.c == null && i2 == 2 && this.n != 2 && this.m.b() && this.r.getScrollState() != 1) {
            ViewHolder c2 = c(motionEvent);
            if (c2 != null) {
                int b2 = (this.m.b(this.r, c2) & 65280) >> 8;
                if (b2 != 0) {
                    float x2 = motionEvent.getX(i3);
                    float f2 = x2 - this.d;
                    float y2 = motionEvent.getY(i3) - this.e;
                    float abs = Math.abs(f2);
                    float abs2 = Math.abs(y2);
                    int i4 = this.q;
                    if (abs >= ((float) i4) || abs2 >= ((float) i4)) {
                        if (abs > abs2) {
                            if (f2 < 0.0f && (b2 & 4) == 0) {
                                return;
                            }
                            if (f2 > 0.0f && (b2 & 8) == 0) {
                                return;
                            }
                        } else if (y2 < 0.0f && (b2 & 1) == 0) {
                            return;
                        } else {
                            if (y2 > 0.0f && (b2 & 2) == 0) {
                                return;
                            }
                        }
                        this.i = 0.0f;
                        this.h = 0.0f;
                        this.l = motionEvent.getPointerId(0);
                        a(c2, 1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public c a(MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        View b2 = b(motionEvent);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            c cVar = (c) this.p.get(size);
            if (cVar.e.itemView == b2) {
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(MotionEvent motionEvent, int i2, int i3) {
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        this.h = x2 - this.d;
        this.i = y2 - this.e;
        if ((i2 & 4) == 0) {
            this.h = Math.max(0.0f, this.h);
        }
        if ((i2 & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i2 & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i2 & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }
}
